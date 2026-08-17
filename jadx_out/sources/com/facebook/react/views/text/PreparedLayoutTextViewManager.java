package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.facebook.react.R;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ReferenceStateWrapper;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.ReactTextViewAccessibilityDelegate;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import i7.C2735B;
import i7.t;
import j7.K;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u7.AbstractC3406a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "RCTText")
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u00042\u00020\u0005:\u0001YB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170!H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010*J!\u0010/\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b7\u0010&J'\u00109\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00108\u001a\u000202H\u0007¢\u0006\u0004\b9\u00105J)\u0010:\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010<\u001a\u00020'H\u0007¢\u0006\u0004\b=\u0010*J7\u0010B\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020-H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030DH\u0016¢\u0006\u0004\bE\u0010FJ'\u0010J\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u0010I\u001a\u00020H2\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bJ\u0010KJ!\u0010L\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0002H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020'H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00112\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010X¨\u0006Z"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/IViewGroupManager;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/text/PreparedLayoutTextView;)Lcom/facebook/react/views/text/PreparedLayoutTextView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "Li7/B;", "updateViewAccessibility", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)V", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/text/PreparedLayoutTextView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "extraData", "updateExtraData", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", ViewProps.OVERFLOW, "setOverflow", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "accessible", "setAccessible", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Z)V", "isSelectable", "setSelectable", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, "setSelectionColor", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Integer;)V", "index", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.BORDER_RADIUS, "setBorderRadius", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;ILjava/lang/Integer;)V", "disabled", "setDisabled", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setPadding", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IIII)V", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "parent", "Landroid/view/View;", "child", "addView", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Landroid/view/View;I)V", "getChildAt", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)Landroid/view/View;", "removeViewAt", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)V", "getChildCount", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)I", "needsCustomLayoutForChildren", "()Z", "Landroid/text/Spannable;", ReactTextInputShadowNode.PROP_TEXT, "onPostProcessSpannable", "(Landroid/text/Spannable;)V", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayoutTextViewManager extends BaseViewManager<PreparedLayoutTextView, LayoutShadowNode> implements IViewGroupManager<PreparedLayoutTextView>, ReactTextViewManagerCallback {
    public static final String REACT_CLASS = "RCTText";
    private final ReactTextViewManagerCallback reactTextViewManagerCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public PreparedLayoutTextViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topTextLayout", K.f(t.a("registrationName", "onTextLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    @Override // com.facebook.react.views.text.ReactTextViewManagerCallback
    public void onPostProcessSpannable(Spannable text) {
        AbstractC2855l.g(text, "text");
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.reactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(text);
        }
    }

    @ReactProp(name = "accessible")
    public final void setAccessible(PreparedLayoutTextView view, boolean accessible) {
        AbstractC2855l.g(view, "view");
        view.setFocusable(accessible);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR, ViewProps.BORDER_START_COLOR, ViewProps.BORDER_END_COLOR, ViewProps.BORDER_BLOCK_COLOR, ViewProps.BORDER_BLOCK_END_COLOR, ViewProps.BORDER_BLOCK_START_COLOR})
    public final void setBorderColor(PreparedLayoutTextView view, int index, Integer color) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.values()[index], color);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(PreparedLayoutTextView view, int index, float borderRadius) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(PreparedLayoutTextView view, String borderStyle) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public final void setBorderWidth(PreparedLayoutTextView view, int index, float width) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.values()[index], Float.valueOf(width));
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public final void setDisabled(PreparedLayoutTextView view, boolean disabled) {
        AbstractC2855l.g(view, "view");
        view.setEnabled(!disabled);
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(PreparedLayoutTextView view, String overflow) {
        Overflow overflowFromString;
        AbstractC2855l.g(view, "view");
        if (overflow == null || (overflowFromString = Overflow.INSTANCE.fromString(overflow)) == null) {
            overflowFromString = Overflow.HIDDEN;
        }
        view.setOverflow(overflowFromString);
    }

    @ReactProp(defaultBoolean = false, name = "selectable")
    public final void setSelectable(PreparedLayoutTextView view, boolean isSelectable) {
        AbstractC2855l.g(view, "view");
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(PreparedLayoutTextView view, Integer color) {
        AbstractC2855l.g(view, "view");
        if (color != null) {
            view.setSelectionColor(color);
            return;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        view.setSelectionColor(Integer.valueOf(DefaultStyleValuesUtil.getDefaultTextColorHighlight(context)));
    }

    public /* synthetic */ PreparedLayoutTextViewManager(ReactTextViewManagerCallback reactTextViewManagerCallback, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void addView(PreparedLayoutTextView parent, View child, int index) {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(child, "child");
        parent.addView(child, index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public PreparedLayoutTextView createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        return new PreparedLayoutTextView(context);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public View getChildAt(PreparedLayoutTextView parent, int index) {
        AbstractC2855l.g(parent, "parent");
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(PreparedLayoutTextView parent) {
        AbstractC2855l.g(parent, "parent");
        return parent.getChildCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public PreparedLayoutTextView prepareToRecycleView(ThemedReactContext reactContext, PreparedLayoutTextView view) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(view, "view");
        PreparedLayoutTextView preparedLayoutTextView = (PreparedLayoutTextView) super.prepareToRecycleView(reactContext, view);
        if (preparedLayoutTextView != null) {
            preparedLayoutTextView.recycleView();
        }
        return preparedLayoutTextView;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(PreparedLayoutTextView parent, int index) {
        AbstractC2855l.g(parent, "parent");
        parent.removeViewAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(PreparedLayoutTextView view, int left, int top, int right, int bottom) {
        AbstractC2855l.g(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(PreparedLayoutTextView view, Object extraData) throws Exception {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(extraData, "extraData");
        SystraceSection systraceSection = new SystraceSection("PreparedLayoutTextViewManager.updateExtraData");
        try {
            PreparedLayout preparedLayout = (PreparedLayout) extraData;
            view.setPreparedLayout(preparedLayout);
            if (preparedLayout.getLayout().getText() instanceof Spanned) {
                CharSequence text = preparedLayout.getLayout().getText();
                AbstractC2855l.e(text, "null cannot be cast to non-null type android.text.Spanned");
                ReactTextViewAccessibilityDelegate.AccessibilityLinks accessibilityLinks = new ReactTextViewAccessibilityDelegate.AccessibilityLinks((Spanned) text);
                int i10 = R.id.accessibility_links;
                if (accessibilityLinks.size() <= 0) {
                    accessibilityLinks = null;
                }
                view.setTag(i10, accessibilityLinks);
                ReactTextViewAccessibilityDelegate.INSTANCE.resetDelegate(view, view.isFocusable(), view.getImportantForAccessibility());
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC3406a.a(systraceSection, null);
        } finally {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(PreparedLayoutTextView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(stateWrapper, "stateWrapper");
        ReferenceStateWrapper referenceStateWrapper = stateWrapper instanceof ReferenceStateWrapper ? (ReferenceStateWrapper) stateWrapper : null;
        if (referenceStateWrapper != null) {
            return referenceStateWrapper.getStateDataReference();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(PreparedLayoutTextView view) {
        AbstractC2855l.g(view, "view");
        ReactTextViewAccessibilityDelegate.INSTANCE.setDelegate(view, view.isFocusable(), view.getImportantForAccessibility());
    }

    public PreparedLayoutTextViewManager(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
        setupViewRecycling();
    }
}
