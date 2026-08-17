package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactAxOrderHelper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BackgroundPosition;
import com.facebook.react.uimanager.style.BackgroundRepeat;
import com.facebook.react.uimanager.style.BackgroundSize;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import d2.AbstractC2325a;
import i7.t;
import j7.K;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "RCTView")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0010%\n\u0002\b\b\b\u0017\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001kB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b \u0010\u0010J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b$\u0010\u0010J!\u0010&\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b&\u0010\u0010J!\u0010(\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b(\u0010\u0010J!\u0010*\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b*\u0010\u0010J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b.\u0010-J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b/\u0010-J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b0\u0010-J\u001f\u00101\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b1\u0010-J'\u00105\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J'\u00105\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0017¢\u0006\u0004\b5\u00109J!\u0010;\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010=\u001a\u000203H\u0017¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bA\u0010<J!\u0010C\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\bC\u0010DJ!\u0010F\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\bF\u0010DJ\u001f\u0010H\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u001bH\u0017¢\u0006\u0004\bH\u0010\u001eJ'\u0010J\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010I\u001a\u000207H\u0017¢\u0006\u0004\bJ\u00109J)\u0010L\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u001bH\u0017¢\u0006\u0004\bO\u0010\u001eJ\u001f\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u001bH\u0017¢\u0006\u0004\bQ\u0010\u001eJ\u001f\u0010S\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u001bH\u0017¢\u0006\u0004\bS\u0010\u001eJ!\u0010U\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010T\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bU\u0010<J\u001f\u0010W\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u0006H\u0017¢\u0006\u0004\bW\u0010<J\u001f\u0010Y\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010X\u001a\u000207H\u0016¢\u0006\u0004\bY\u0010ZJ+\u0010]\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010[\u001a\u0004\u0018\u00010\f2\b\u0010\\\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0006H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u0015H\u0016¢\u0006\u0004\bb\u0010cJ\u001b\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0dH\u0016¢\u0006\u0004\be\u0010fJ)\u0010h\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010g\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\bh\u0010iJ)\u0010h\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010g\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bh\u0010j¨\u0006l"}, d2 = {"Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/view/ReactViewGroup;", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", PointerEventHelper.POINTER_TYPE_UNKNOWN, "px", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)I", "root", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Li7/B;", "handleSetPressed", "(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/bridge/ReadableArray;)V", "handleHotspotUpdate", "handleFocus", "(Lcom/facebook/react/views/view/ReactViewGroup;)V", "handleBlur", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/view/ReactViewGroup;)Lcom/facebook/react/views/view/ReactViewGroup;", "onDropViewInstance", PointerEventHelper.POINTER_TYPE_UNKNOWN, "accessible", "setAccessible", "(Lcom/facebook/react/views/view/ReactViewGroup;Z)V", "nativeIds", "setAccessibilityOrder", "hasTVPreferredFocus", "setTVPreferredFocus", "backgroundImage", "setBackgroundImage", "backgroundSize", "setBackgroundSize", "backgroundPosition", "setBackgroundPosition", "backgroundRepeat", "setBackgroundRepeat", "viewId", "nextFocusDown", "(Lcom/facebook/react/views/view/ReactViewGroup;I)V", "nextFocusForward", "nextFocusLeft", "nextFocusRight", "nextFocusUp", "index", "Lcom/facebook/react/bridge/Dynamic;", "rawBorderRadius", "setBorderRadius", "(Lcom/facebook/react/views/view/ReactViewGroup;ILcom/facebook/react/bridge/Dynamic;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.BORDER_RADIUS, "(Lcom/facebook/react/views/view/ReactViewGroup;IF)V", "borderStyle", "setBorderStyle", "(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V", "hitSlop", "setHitSlop", "(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/bridge/Dynamic;)V", "pointerEventsStr", "setPointerEvents", AppStateModule.APP_STATE_BACKGROUND, "setNativeBackground", "(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/bridge/ReadableMap;)V", "foreground", "setNativeForeground", ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING, "setNeedsOffscreenAlphaCompositing", "width", "setBorderWidth", ViewProps.COLOR, "setBorderColor", "(Lcom/facebook/react/views/view/ReactViewGroup;ILjava/lang/Integer;)V", ViewProps.COLLAPSABLE, "setCollapsable", ViewProps.COLLAPSABLE_CHILDREN, "setCollapsableChildren", "focusable", "setFocusable", ViewProps.OVERFLOW, "setOverflow", "backfaceVisibility", "setBackfaceVisibility", ViewProps.OPACITY, "setOpacity", "(Lcom/facebook/react/views/view/ReactViewGroup;F)V", "transforms", ViewProps.TRANSFORM_ORIGIN, "setTransformProperty", "(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V", "getName", "()Ljava/lang/String;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/view/ReactViewGroup;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCommandsMap", "()Ljava/util/Map;", "commandId", "receiveCommand", "(Lcom/facebook/react/views/view/ReactViewGroup;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactViewManager extends ReactClippingViewManager<ReactViewGroup> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactViewManager() {
        if (ReactNativeFeatureFlags.enableViewRecyclingForView() && AbstractC2855l.b(getClass(), ReactViewManager.class)) {
            setupViewRecycling();
        }
    }

    private final void handleBlur(ReactViewGroup root) {
        if (ReactNativeFeatureFlags.enableImperativeFocus()) {
            root.clearFocusFromJS$ReactAndroid_release();
        }
    }

    private final void handleFocus(ReactViewGroup root) {
        if (ReactNativeFeatureFlags.enableImperativeFocus()) {
            root.requestFocusFromJS$ReactAndroid_release();
        }
    }

    private final void handleHotspotUpdate(ReactViewGroup root, ReadableArray args) {
        if (args == null || args.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        root.drawableHotspotChanged(pixelUtil.dpToPx(args.getDouble(0)), pixelUtil.dpToPx(args.getDouble(1)));
    }

    private final void handleSetPressed(ReactViewGroup root, ReadableArray args) {
        if (args == null || args.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        root.setPressed(args.getBoolean(0));
    }

    private final int px(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return (int) PixelUtil.INSTANCE.dpToPx(readableMap.getDouble(str));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFocusable$lambda$2(ReactViewGroup reactViewGroup, View view) {
        Context context = reactViewGroup.getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, reactViewGroup.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ViewGroupClickEvent(UIManagerHelper.getSurfaceId(reactViewGroup.getContext()), reactViewGroup.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return K.m(t.a(HOTSPOT_UPDATE_KEY, 1), t.a("setPressed", 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTView";
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(ReactViewGroup view, int viewId) {
        AbstractC2855l.g(view, "view");
        view.setNextFocusDownId(viewId);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(ReactViewGroup view, int viewId) {
        AbstractC2855l.g(view, "view");
        view.setNextFocusForwardId(viewId);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(ReactViewGroup view, int viewId) {
        AbstractC2855l.g(view, "view");
        view.setNextFocusLeftId(viewId);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(ReactViewGroup view, int viewId) {
        AbstractC2855l.g(view, "view");
        view.setNextFocusRightId(viewId);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(ReactViewGroup view, int viewId) {
        AbstractC2855l.g(view, "view");
        view.setNextFocusUpId(viewId);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ORDER)
    public void setAccessibilityOrder(ReactViewGroup view, ReadableArray nativeIds) {
        AbstractC2855l.g(view, "view");
        if (ReactNativeFeatureFlags.enableAccessibilityOrder()) {
            int childCount = view.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = view.getChildAt(i10);
                AbstractC2855l.f(childAt, "getChildAt(...)");
                ReactAxOrderHelper.cleanUpAxOrder(childAt);
            }
            if (nativeIds == null) {
                view.setAxOrderList(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = nativeIds.size();
            for (int i11 = 0; i11 < size; i11++) {
                String string = nativeIds.getString(i11);
                if (string != null) {
                    arrayList.add(string);
                }
            }
            view.setAxOrderList(arrayList);
        }
    }

    @ReactProp(name = "accessible")
    public void setAccessible(ReactViewGroup view, boolean accessible) {
        AbstractC2855l.g(view, "view");
        view.setFocusable(accessible);
    }

    @ReactProp(name = "backfaceVisibility")
    public void setBackfaceVisibility(ReactViewGroup view, String backfaceVisibility) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(backfaceVisibility, "backfaceVisibility");
        view.setBackfaceVisibility(backfaceVisibility);
    }

    @ReactProp(customType = "BackgroundImage", name = ViewProps.BACKGROUND_IMAGE)
    public void setBackgroundImage(ReactViewGroup view, ReadableArray backgroundImage) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) == 2) {
            if (backgroundImage == null || backgroundImage.size() <= 0) {
                BackgroundStyleApplicator.setBackgroundImage(view, null);
                return;
            }
            ArrayList arrayList = new ArrayList(backgroundImage.size());
            int size = backgroundImage.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = backgroundImage.getMap(i10);
                BackgroundImageLayer.Companion companion = BackgroundImageLayer.INSTANCE;
                Context context = view.getContext();
                AbstractC2855l.f(context, "getContext(...)");
                BackgroundImageLayer backgroundImageLayer = companion.parse(map, context);
                if (backgroundImageLayer != null) {
                    arrayList.add(backgroundImageLayer);
                }
            }
            BackgroundStyleApplicator.setBackgroundImage(view, arrayList);
        }
    }

    @ReactProp(customType = "BackgroundPosition", name = ViewProps.BACKGROUND_POSITION)
    public void setBackgroundPosition(ReactViewGroup view, ReadableArray backgroundPosition) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) == 2) {
            if (backgroundPosition == null || backgroundPosition.size() <= 0) {
                BackgroundStyleApplicator.setBackgroundPosition$ReactAndroid_release(view, null);
                return;
            }
            ArrayList arrayList = new ArrayList(backgroundPosition.size());
            int size = backgroundPosition.size();
            for (int i10 = 0; i10 < size; i10++) {
                BackgroundPosition backgroundPosition2 = BackgroundPosition.INSTANCE.parse(backgroundPosition.getMap(i10));
                if (backgroundPosition2 != null) {
                    arrayList.add(backgroundPosition2);
                }
            }
            BackgroundStyleApplicator.setBackgroundPosition$ReactAndroid_release(view, arrayList);
        }
    }

    @ReactProp(customType = "BackgroundRepeat", name = ViewProps.BACKGROUND_REPEAT)
    public void setBackgroundRepeat(ReactViewGroup view, ReadableArray backgroundRepeat) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) == 2) {
            if (backgroundRepeat == null || backgroundRepeat.size() <= 0) {
                BackgroundStyleApplicator.setBackgroundRepeat$ReactAndroid_release(view, null);
                return;
            }
            ArrayList arrayList = new ArrayList(backgroundRepeat.size());
            int size = backgroundRepeat.size();
            for (int i10 = 0; i10 < size; i10++) {
                BackgroundRepeat backgroundRepeat2 = BackgroundRepeat.INSTANCE.parse(backgroundRepeat.getMap(i10));
                if (backgroundRepeat2 != null) {
                    arrayList.add(backgroundRepeat2);
                }
            }
            BackgroundStyleApplicator.setBackgroundRepeat$ReactAndroid_release(view, arrayList);
        }
    }

    @ReactProp(customType = "BackgroundSize", name = ViewProps.BACKGROUND_SIZE)
    public void setBackgroundSize(ReactViewGroup view, ReadableArray backgroundSize) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            BackgroundStyleApplicator.setBackgroundSize$ReactAndroid_release(view, null);
            return;
        }
        if (backgroundSize == null || backgroundSize.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(backgroundSize.size());
        int size = backgroundSize.size();
        for (int i10 = 0; i10 < size; i10++) {
            BackgroundSize backgroundSize2 = BackgroundSize.INSTANCE.parse(backgroundSize.getDynamic(i10));
            if (backgroundSize2 != null) {
                arrayList.add(backgroundSize2);
            }
        }
        BackgroundStyleApplicator.setBackgroundSize$ReactAndroid_release(view, arrayList);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR, ViewProps.BORDER_START_COLOR, ViewProps.BORDER_END_COLOR, ViewProps.BORDER_BLOCK_COLOR, ViewProps.BORDER_BLOCK_END_COLOR, ViewProps.BORDER_BLOCK_START_COLOR})
    public void setBorderColor(ReactViewGroup view, int index, Integer color) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.INSTANCE.fromSpacingType(SPACING_TYPES[index]), color);
    }

    @ReactPropGroup(names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS, ViewProps.BORDER_TOP_START_RADIUS, ViewProps.BORDER_TOP_END_RADIUS, ViewProps.BORDER_BOTTOM_START_RADIUS, ViewProps.BORDER_BOTTOM_END_RADIUS, ViewProps.BORDER_END_END_RADIUS, ViewProps.BORDER_END_START_RADIUS, ViewProps.BORDER_START_END_RADIUS, ViewProps.BORDER_START_START_RADIUS})
    public void setBorderRadius(ReactViewGroup view, int index, Dynamic rawBorderRadius) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(rawBorderRadius, "rawBorderRadius");
        LengthPercentage fromDynamic$default = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, rawBorderRadius, false, 2, null);
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], (ViewUtil.getUIManagerType(view) == 2 || fromDynamic$default == null || fromDynamic$default.getType() != LengthPercentageType.PERCENT) ? fromDynamic$default : null);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactViewGroup view, String borderStyle) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public void setBorderWidth(ReactViewGroup view, int index, float width) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.values()[index], Float.valueOf(width));
    }

    @ReactProp(name = ViewProps.COLLAPSABLE)
    public void setCollapsable(ReactViewGroup view, boolean collapsable) {
        AbstractC2855l.g(view, "view");
    }

    @ReactProp(name = ViewProps.COLLAPSABLE_CHILDREN)
    public void setCollapsableChildren(ReactViewGroup view, boolean collapsableChildren) {
        AbstractC2855l.g(view, "view");
    }

    @ReactProp(name = "focusable")
    public void setFocusable(final ReactViewGroup view, boolean focusable) {
        AbstractC2855l.g(view, "view");
        if (focusable) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.views.view.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReactViewManager.setFocusable$lambda$2(view, view2);
                }
            });
            view.setFocusable(true);
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(ReactViewGroup view, Dynamic hitSlop) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(hitSlop, "hitSlop");
        int i10 = WhenMappings.$EnumSwitchMapping$0[hitSlop.getType().ordinal()];
        if (i10 == 1) {
            ReadableMap readableMapAsMap = hitSlop.asMap();
            if (readableMapAsMap == null) {
                view.setHitSlopRect(null);
                return;
            } else {
                view.setHitSlopRect(new Rect(px(readableMapAsMap, ViewProps.LEFT), px(readableMapAsMap, ViewProps.TOP), px(readableMapAsMap, ViewProps.RIGHT), px(readableMapAsMap, ViewProps.BOTTOM)));
                return;
            }
        }
        if (i10 == 2) {
            int iDpToPx = (int) PixelUtil.INSTANCE.dpToPx(hitSlop.asDouble());
            view.setHitSlopRect(new Rect(iDpToPx, iDpToPx, iDpToPx, iDpToPx));
        } else {
            if (i10 == 3) {
                view.setHitSlopRect(null);
                return;
            }
            AbstractC2325a.I(ReactConstants.TAG, "Invalid type for 'hitSlop' value " + hitSlop.getType());
            view.setHitSlopRect(null);
        }
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(ReactViewGroup view, ReadableMap background) {
        Drawable drawableCreateDrawableFromJSDescription;
        AbstractC2855l.g(view, "view");
        if (background != null) {
            Context context = view.getContext();
            AbstractC2855l.f(context, "getContext(...)");
            drawableCreateDrawableFromJSDescription = ReactDrawableHelper.createDrawableFromJSDescription(context, background);
        } else {
            drawableCreateDrawableFromJSDescription = null;
        }
        BackgroundStyleApplicator.setFeedbackUnderlay(view, drawableCreateDrawableFromJSDescription);
    }

    @ReactProp(name = "nativeForegroundAndroid")
    public void setNativeForeground(ReactViewGroup view, ReadableMap foreground) {
        Drawable drawableCreateDrawableFromJSDescription;
        AbstractC2855l.g(view, "view");
        if (foreground != null) {
            Context context = view.getContext();
            AbstractC2855l.f(context, "getContext(...)");
            drawableCreateDrawableFromJSDescription = ReactDrawableHelper.createDrawableFromJSDescription(context, foreground);
        } else {
            drawableCreateDrawableFromJSDescription = null;
        }
        view.setForeground(drawableCreateDrawableFromJSDescription);
    }

    @ReactProp(name = ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)
    public void setNeedsOffscreenAlphaCompositing(ReactViewGroup view, boolean needsOffscreenAlphaCompositing) {
        AbstractC2855l.g(view, "view");
        view.setNeedsOffscreenAlphaCompositing(needsOffscreenAlphaCompositing);
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(ReactViewGroup view, String overflow) {
        AbstractC2855l.g(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(ReactViewGroup view, String pointerEventsStr) {
        AbstractC2855l.g(view, "view");
        view.setPointerEvents(PointerEvents.INSTANCE.parsePointerEvents(pointerEventsStr));
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(ReactViewGroup view, boolean hasTVPreferredFocus) {
        AbstractC2855l.g(view, "view");
        if (hasTVPreferredFocus) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        return new ReactViewGroup(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactViewGroup view) {
        AbstractC2855l.g(view, "view");
        super.onDropViewInstance(view);
        view.cleanUpAxOrderListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup prepareToRecycleView(ThemedReactContext reactContext, ReactViewGroup view) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(view, "view");
        view.setRemoveClippedSubviews(false);
        ReactViewGroup reactViewGroup = (ReactViewGroup) super.prepareToRecycleView(reactContext, view);
        if (reactViewGroup != null) {
            reactViewGroup.recycleView$ReactAndroid_release();
        }
        return reactViewGroup;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(ReactViewGroup view, float opacity) {
        AbstractC2855l.g(view, "view");
        view.setOpacityIfPossible(opacity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(ReactViewGroup view, ReadableArray transforms, ReadableArray transformOrigin) {
        AbstractC2855l.g(view, "view");
        super.setTransformProperty(view, transforms, transformOrigin);
        view.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup root, int commandId, ReadableArray args) {
        AbstractC2855l.g(root, "root");
        if (commandId == 1) {
            handleHotspotUpdate(root, args);
        } else {
            if (commandId != 2) {
                return;
            }
            handleSetPressed(root, args);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup root, String commandId, ReadableArray args) {
        AbstractC2855l.g(root, "root");
        AbstractC2855l.g(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1639565984:
                if (commandId.equals("setPressed")) {
                    handleSetPressed(root, args);
                    break;
                }
                break;
            case -399823752:
                if (commandId.equals(HOTSPOT_UPDATE_KEY)) {
                    handleHotspotUpdate(root, args);
                    break;
                }
                break;
            case 3027047:
                if (commandId.equals("blur")) {
                    handleBlur(root);
                    break;
                }
                break;
            case 97604824:
                if (commandId.equals("focus")) {
                    handleFocus(root);
                    break;
                }
                break;
        }
    }

    public void setBorderRadius(ReactViewGroup view, int index, float borderRadius) {
        AbstractC2855l.g(view, "view");
        setBorderRadius(view, index, new DynamicFromObject(Float.valueOf(borderRadius)));
    }
}
