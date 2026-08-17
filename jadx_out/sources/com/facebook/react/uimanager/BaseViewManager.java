package com.facebook.react.uimanager;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.BlurEvent;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FocusEvent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.OutlineStyle;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import d2.AbstractC2325a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class BaseVMFocusChangeListener<V extends View> implements View.OnFocusChangeListener {
        private View.OnFocusChangeListener mOriginalFocusChangeListener;

        public BaseVMFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
            this.mOriginalFocusChangeListener = onFocusChangeListener;
        }

        public void attach(T t10) {
            t10.setOnFocusChangeListener(this);
        }

        public void detach(T t10) {
            t10.setOnFocusChangeListener(this.mOriginalFocusChangeListener);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            EventDispatcher eventDispatcherForReactTag;
            View.OnFocusChangeListener onFocusChangeListener = this.mOriginalFocusChangeListener;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z10);
            }
            int surfaceId = UIManagerHelper.getSurfaceId(view.getContext());
            if (surfaceId == -1 || !(view.getContext() instanceof ThemedReactContext) || (eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ThemedReactContext) view.getContext(), view.getId())) == null) {
                return;
            }
            if (z10) {
                eventDispatcherForReactTag.dispatchEvent(new FocusEvent(surfaceId, view.getId()));
            } else {
                eventDispatcherForReactTag.dispatchEvent(new BlurEvent(surfaceId, view.getId()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class LayerEffectsHelper {
        private LayerEffectsHelper() {
        }

        public static void apply(View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (FilterHelper.isOnlyColorMatrixFilters(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(FilterHelper.parseColorMatrixFilters(readableArray));
            } else {
                if (i10 >= 31) {
                    view.setRenderEffect(FilterHelper.parseFilters(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        AbstractC2325a.K(ReactConstants.TAG, "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE) {
            return f10;
        }
        if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f10);
    }

    private static void setPointerEventsFlag(View view, PointerEventHelper.EVENT event, boolean z10) {
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << event.ordinal();
        view.setTag(R.id.pointer_events, Integer.valueOf(z10 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(T t10) {
        Dynamic dynamic;
        String str = (String) t10.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t10.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t10.getTag(R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t10.getContext().getString(R.string.state_mixed_description));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t10.getContext().getString(R.string.state_busy_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey(ReactTextInputShadowNode.PROP_TEXT) && (dynamic = readableMap2.getDynamic(ReactTextInputShadowNode.PROP_TEXT)) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t10.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void addEventEmitters(ThemedReactContext themedReactContext, T t10) {
        super.addEventEmitters(themedReactContext, t10);
        new BaseVMFocusChangeListener(t10.getOnFocusChangeListener()).attach(t10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        MapBuilder.Builder builderPut = MapBuilder.builder().put(PointerEventHelper.POINTER_CANCEL, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).put(PointerEventHelper.POINTER_DOWN, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(builderPut.put(PointerEventHelper.POINTER_ENTER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_ENTER, "captured", ViewProps.ON_POINTER_ENTER_CAPTURE, "skipBubbling", bool))).put(PointerEventHelper.POINTER_LEAVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_LEAVE, "captured", ViewProps.ON_POINTER_LEAVE_CAPTURE, "skipBubbling", bool))).put(PointerEventHelper.POINTER_MOVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_MOVE, "captured", ViewProps.ON_POINTER_MOVE_CAPTURE))).put(PointerEventHelper.POINTER_UP, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).put(PointerEventHelper.POINTER_OUT, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_OUT, "captured", ViewProps.ON_POINTER_OUT_CAPTURE))).put(PointerEventHelper.POINTER_OVER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_OVER, "captured", ViewProps.ON_POINTER_OVER_CAPTURE))).put(PointerEventHelper.CLICK, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_CLICK, "captured", ViewProps.ON_CLICK_CAPTURE))).put(BlurEvent.EVENT_NAME, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onBlur", "captured", "onBlurCapture"))).put(FocusEvent.EVENT_NAME, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onFocus", "captured", "onFocusCapture"))).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT, MapBuilder.of("registrationName", "onAccessibilityAction")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(T t10) {
        super.onAfterUpdateTransaction(t10);
        updateViewAccessibility(t10);
        Boolean bool = (Boolean) t10.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            t10.addOnLayoutChangeListener(this);
            setTransformProperty(t10, (ReadableArray) t10.getTag(R.id.transform), (ReadableArray) t10.getTag(R.id.transform_origin));
            t10.setTag(R.id.invalidate_transform, Boolean.FALSE);
        }
        LayerEffectsHelper.apply(t10, (ReadableArray) t10.getTag(R.id.filter), (Boolean) t10.getTag(R.id.use_hardware_layer));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(T t10) {
        super.onDropViewInstance(t10);
        View.OnFocusChangeListener onFocusChangeListener = t10.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof BaseVMFocusChangeListener) {
            ((BaseVMFocusChangeListener) onFocusChangeListener).detach(t10);
        }
        if (t10 instanceof ViewGroup) {
            ((ViewGroup) t10).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i16 - i14;
        int i19 = i12 - i10;
        if (i13 - i11 == i17 - i15 && i19 == i18) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(ThemedReactContext themedReactContext, T t10) {
        t10.setTag(null);
        t10.setTag(R.id.pointer_events, null);
        t10.setTag(R.id.react_test_id, null);
        t10.setTag(R.id.view_tag_native_id, null);
        t10.setTag(R.id.labelled_by, null);
        t10.setTag(R.id.accessibility_label, null);
        t10.setTag(R.id.accessibility_hint, null);
        t10.setTag(R.id.accessibility_role, null);
        t10.setTag(R.id.accessibility_state, null);
        t10.setTag(R.id.accessibility_actions, null);
        t10.setTag(R.id.accessibility_value, null);
        t10.setTag(R.id.accessibility_state_expanded, null);
        t10.setTag(R.id.view_clipped, null);
        setTransformProperty(t10, null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return null;
        }
        t10.resetPivot();
        t10.setTop(0);
        t10.setBottom(0);
        t10.setLeft(0);
        t10.setRight(0);
        t10.setElevation(0.0f);
        if (i10 >= 29) {
            t10.setAnimationMatrix(null);
        }
        t10.setTag(R.id.transform, null);
        t10.setTag(R.id.transform_origin, null);
        t10.setTag(R.id.invalidate_transform, null);
        t10.removeOnLayoutChangeListener(this);
        t10.setTag(R.id.use_hardware_layer, null);
        t10.setTag(R.id.filter, null);
        t10.setTag(R.id.mix_blend_mode, null);
        LayerEffectsHelper.apply(t10, null, null);
        if (i10 >= 28) {
            t10.setOutlineAmbientShadowColor(-16777216);
            t10.setOutlineSpotShadowColor(-16777216);
        }
        t10.setNextFocusDownId(-1);
        t10.setNextFocusForwardId(-1);
        t10.setNextFocusRightId(-1);
        t10.setNextFocusUpId(-1);
        t10.setFocusable(false);
        t10.setFocusableInTouchMode(false);
        t10.setElevation(0.0f);
        t10.setAlpha(1.0f);
        setPadding(t10, 0, 0, 0, 0);
        t10.setForeground(null);
        return t10;
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ACTIONS)
    public void setAccessibilityActions(T t10, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t10.setTag(R.id.accessibility_actions, readableArray);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION)
    public void setAccessibilityCollection(T t10, ReadableMap readableMap) {
        t10.setTag(R.id.accessibility_collection, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION_ITEM)
    public void setAccessibilityCollectionItem(T t10, ReadableMap readableMap) {
        t10.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_HINT)
    public void setAccessibilityHint(T t10, String str) {
        t10.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(t10);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(T t10, String str) {
        t10.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(t10);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABELLED_BY)
    public void setAccessibilityLabelledBy(T t10, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t10.setTag(R.id.labelled_by, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t10.setTag(R.id.labelled_by, dynamic.asArray().getString(0));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(T t10, String str) {
        if (str == null || str.equals("none")) {
            AbstractC1658a0.m0(t10, 0);
        } else if (str.equals("polite")) {
            AbstractC1658a0.m0(t10, 1);
        } else if (str.equals("assertive")) {
            AbstractC1658a0.m0(t10, 2);
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(T t10, String str) {
        if (str == null) {
            t10.setTag(R.id.accessibility_role, null);
        } else {
            t10.setTag(R.id.accessibility_role, ReactAccessibilityDelegate.AccessibilityRole.fromValue(str));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_VALUE)
    public void setAccessibilityValue(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            t10.setTag(R.id.accessibility_value, null);
            t10.setContentDescription(null);
        } else {
            t10.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey(ReactTextInputShadowNode.PROP_TEXT)) {
                updateViewContentDescription(t10);
            }
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(T t10, int i10) {
        BackgroundStyleApplicator.setBackgroundColor(t10, Integer.valueOf(i10));
    }

    public void setBorderBottomLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_BOTTOM_LEFT_RADIUS);
    }

    public void setBorderBottomRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_BOTTOM_RIGHT_RADIUS);
    }

    public void setBorderRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_RADIUS);
    }

    public void setBorderTopLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_TOP_LEFT_RADIUS);
    }

    public void setBorderTopRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_TOP_RIGHT_RADIUS);
    }

    @ReactProp(customType = "BoxShadow", name = ViewProps.BOX_SHADOW)
    public void setBoxShadow(T t10, ReadableArray readableArray) {
        BackgroundStyleApplicator.setBoxShadow(t10, readableArray);
    }

    @ReactProp(name = ViewProps.ON_CLICK)
    public void setClick(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.CLICK, z10);
    }

    @ReactProp(name = ViewProps.ON_CLICK_CAPTURE)
    public void setClickCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.CLICK_CAPTURE, z10);
    }

    @ReactProp(name = ViewProps.ELEVATION)
    public void setElevation(T t10, float f10) {
        AbstractC1658a0.r0(t10, PixelUtil.toPixelFromDIP(f10));
    }

    @ReactProp(customType = "Filter", name = ViewProps.FILTER)
    public void setFilter(T t10, ReadableArray readableArray) {
        if (ViewUtil.getUIManagerType(t10) == 2) {
            t10.setTag(R.id.filter, readableArray);
        }
    }

    @ReactProp(name = ViewProps.IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(T t10, String str) {
        if (str == null || str.equals("auto")) {
            AbstractC1658a0.s0(t10, 0);
            return;
        }
        if (str.equals("yes")) {
            AbstractC1658a0.s0(t10, 1);
        } else if (str.equals("no")) {
            AbstractC1658a0.s0(t10, 2);
        } else if (str.equals("no-hide-descendants")) {
            AbstractC1658a0.s0(t10, 4);
        }
    }

    @ReactProp(name = ViewProps.MIX_BLEND_MODE)
    public void setMixBlendMode(T t10, String str) {
        if (ViewUtil.getUIManagerType(t10) == 2) {
            t10.setTag(R.id.mix_blend_mode, BlendModeHelper.parseMixBlendMode(str));
            if (t10.getParent() instanceof View) {
                ((View) t10.getParent()).invalidate();
            }
        }
    }

    @ReactProp(name = ViewProps.NATIVE_ID)
    public void setNativeId(T t10, String str) {
        t10.setTag(R.id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(t10);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(T t10, float f10) {
        t10.setAlpha(f10);
    }

    @ReactProp(customType = "Color", name = ViewProps.OUTLINE_COLOR)
    public void setOutlineColor(T t10, Integer num) {
        BackgroundStyleApplicator.setOutlineColor(t10, num);
    }

    @ReactProp(name = ViewProps.OUTLINE_OFFSET)
    public void setOutlineOffset(T t10, float f10) {
        BackgroundStyleApplicator.setOutlineOffset(t10, f10);
    }

    @ReactProp(name = ViewProps.OUTLINE_STYLE)
    public void setOutlineStyle(T t10, String str) {
        BackgroundStyleApplicator.setOutlineStyle(t10, str == null ? null : OutlineStyle.fromString(str));
    }

    @ReactProp(name = ViewProps.OUTLINE_WIDTH)
    public void setOutlineWidth(T t10, float f10) {
        BackgroundStyleApplicator.setOutlineWidth(t10, f10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER)
    public void setPointerEnter(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.ENTER, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER_CAPTURE)
    public void setPointerEnterCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.ENTER_CAPTURE, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE)
    public void setPointerLeave(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.LEAVE, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE_CAPTURE)
    public void setPointerLeaveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.LEAVE_CAPTURE, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE)
    public void setPointerMove(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.MOVE, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE_CAPTURE)
    public void setPointerMoveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.MOVE_CAPTURE, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OUT)
    public void setPointerOut(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.OUT, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OUT_CAPTURE)
    public void setPointerOutCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.OUT_CAPTURE, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OVER)
    public void setPointerOver(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.OVER, z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OVER_CAPTURE)
    public void setPointerOverCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, PointerEventHelper.EVENT.OVER_CAPTURE, z10);
    }

    @ReactProp(name = ViewProps.RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(T t10, boolean z10) {
        t10.setTag(R.id.use_hardware_layer, Boolean.valueOf(z10));
    }

    @ReactProp(name = ViewProps.ROLE)
    public void setRole(T t10, String str) {
        if (str == null) {
            t10.setTag(R.id.role, null);
        } else {
            t10.setTag(R.id.role, ReactAccessibilityDelegate.Role.fromValue(str));
        }
    }

    @ReactProp(name = ViewProps.ROTATION)
    @Deprecated
    public void setRotation(T t10, float f10) {
        t10.setRotation(f10);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.SCALE_X)
    @Deprecated
    public void setScaleX(T t10, float f10) {
        t10.setScaleX(f10);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.SCALE_Y)
    @Deprecated
    public void setScaleY(T t10, float f10) {
        t10.setScaleY(f10);
    }

    @ReactProp(name = ViewProps.SCREEN_READER_FOCUSABLE)
    public void setScreenReaderFocusable(T t10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setScreenReaderFocusable(z10);
        }
    }

    @ReactProp(customType = "Color", defaultInt = -16777216, name = ViewProps.SHADOW_COLOR)
    public void setShadowColor(T t10, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setOutlineAmbientShadowColor(i10);
            t10.setOutlineSpotShadowColor(i10);
        }
    }

    @ReactProp(name = ViewProps.TEST_ID)
    public void setTestId(T t10, String str) {
        t10.setTag(R.id.react_test_id, str);
        t10.setTag(str);
    }

    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(R.id.transform), readableArray)) {
            return;
        }
        t10.setTag(R.id.transform, readableArray);
        t10.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    @ReactProp(name = ViewProps.TRANSFORM_ORIGIN)
    public void setTransformOrigin(T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(R.id.transform_origin), readableArray)) {
            return;
        }
        t10.setTag(R.id.transform_origin, readableArray);
        t10.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    protected void setTransformProperty(T t10, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t10.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            t10.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            t10.setRotation(0.0f);
            t10.setRotationX(0.0f);
            t10.setRotationY(0.0f);
            t10.setScaleX(1.0f);
            t10.setScaleY(1.0f);
            t10.setCameraDistance(0.0f);
            return;
        }
        boolean z10 = ViewUtil.getUIManagerType(t10) == 2;
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, PixelUtil.toDIPFromPixel(t10.getWidth()), PixelUtil.toDIPFromPixel(t10.getHeight()), readableArray2, z10);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        t10.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        t10.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        t10.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        t10.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        t10.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        t10.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        t10.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == 0.0f) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            t10.setCameraDistance(sanitizeFloatPropertyValue(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_X)
    @Deprecated
    public void setTranslateX(T t10, float f10) {
        t10.setTranslationX(PixelUtil.toPixelFromDIP(f10));
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_Y)
    @Deprecated
    public void setTranslateY(T t10, float f10) {
        t10.setTranslationY(PixelUtil.toPixelFromDIP(f10));
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_STATE)
    public void setViewState(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t10.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t10.isSelected();
            boolean z10 = readableMap.getBoolean("selected");
            t10.setSelected(z10);
            if (t10.isAccessibilityFocused() && zIsSelected && !z10) {
                t10.announceForAccessibility(t10.getContext().getString(R.string.state_unselected_description));
            }
        } else {
            t10.setSelected(false);
        }
        t10.setTag(R.id.accessibility_state, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t10.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t10);
                return;
            } else if (t10.isAccessibilityFocused()) {
                t10.sendAccessibilityEvent(1);
            }
        }
    }

    @ReactProp(name = ViewProps.Z_INDEX)
    public void setZIndex(T t10, float f10) {
        ViewGroupManager.setViewZIndex(t10, Math.round(f10));
        ViewParent parent = t10.getParent();
        if (parent instanceof ReactZIndexedViewGroup) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }

    protected void updateViewAccessibility(T t10) {
        ReactAccessibilityDelegate.setDelegate(t10, t10.isFocusable(), t10.getImportantForAccessibility());
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactProp(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t10, boolean z10) {
    }

    @ReactProp(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderEnd")
    public void setResponderEnd(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderGrant")
    public void setResponderGrant(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderMove")
    public void setResponderMove(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderReject")
    public void setResponderReject(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderRelease")
    public void setResponderRelease(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderStart")
    public void setResponderStart(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderTerminate")
    public void setResponderTerminate(T t10, boolean z10) {
    }

    @ReactProp(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t10, boolean z10) {
    }

    @ReactProp(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t10, boolean z10) {
    }

    @ReactProp(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t10, boolean z10) {
    }

    @ReactProp(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t10, boolean z10) {
    }

    @ReactProp(name = "onTouchCancel")
    public void setTouchCancel(T t10, boolean z10) {
    }

    @ReactProp(name = "onTouchEnd")
    public void setTouchEnd(T t10, boolean z10) {
    }

    @ReactProp(name = "onTouchMove")
    public void setTouchMove(T t10, boolean z10) {
    }

    @ReactProp(name = "onTouchStart")
    public void setTouchStart(T t10, boolean z10) {
    }
}
