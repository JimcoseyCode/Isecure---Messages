package com.facebook.react.views.virtual.viewexperimental;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.R;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.scroll.VirtualView;
import com.facebook.react.views.scroll.VirtualViewContainer;
import com.facebook.react.views.scroll.VirtualViewContainerState;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.virtual.VirtualViewMode;
import com.facebook.react.views.virtual.VirtualViewModeChangeEmitter;
import com.facebook.react.views.virtual.VirtualViewRenderState;
import d2.AbstractC2325a;
import i7.C2750m;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0015\u0010\nJ7\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJY\u0010%\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0014¢\u0006\u0004\b-\u0010\nJ\u000f\u0010/\u001a\u00020\bH\u0010¢\u0006\u0004\b.\u0010\nJ\u001f\u00104\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J+\u0010@\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020:0<H\u0080\bø\u0001\u0000¢\u0006\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u001a\u0010Z\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0016\u0010`\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u0004\u0018\u00010:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/views/scroll/VirtualView;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li7/B;", "updateParentOffset", "()V", "reportRectChangeToContainer", "Lcom/facebook/react/views/scroll/VirtualViewContainer;", "getScrollView", "()Lcom/facebook/react/views/scroll/VirtualViewContainer;", "cleanupLayoutListeners", PointerEventHelper.POINTER_TYPE_UNKNOWN, "addListeners", "traverseParentStack", "(Z)Lcom/facebook/react/views/scroll/VirtualViewContainer;", "onAttachedToWindow", "doAttachedToWindow$ReactAndroid_release", "doAttachedToWindow", "changed", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "Landroid/view/View;", "v", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "recycleView$ReactAndroid_release", "recycleView", "Lcom/facebook/react/views/virtual/VirtualViewMode;", "newMode", "Landroid/graphics/Rect;", "thresholdRect", "onModeChange", "(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "excludedViews", "updateClippingRect", "(Ljava/util/Set;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "subtag", "Lkotlin/Function0;", "block", "debugLog$ReactAndroid_release", "(Ljava/lang/String;Lw7/a;)V", "debugLog", "mode", "Lcom/facebook/react/views/virtual/VirtualViewMode;", "getMode$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewMode;", "setMode$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewMode;)V", "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "modeChangeEmitter", "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "getModeChangeEmitter$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "setModeChangeEmitter$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V", "Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "renderState", "Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "getRenderState$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "setRenderState$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewRenderState;)V", "scrollView", "Lcom/facebook/react/views/scroll/VirtualViewContainer;", "lastContainerRelativeRect", "Landroid/graphics/Rect;", "lastClippingRect", "containerRelativeRect", "getContainerRelativeRect", "()Landroid/graphics/Rect;", "offsetX", "I", "offsetY", "hadLayout", "Z", "getNativeId$ReactAndroid_release", "()Ljava/lang/String;", "nativeId", "getVirtualViewID", "virtualViewID", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactVirtualViewExperimental extends ReactViewGroup implements VirtualView, View.OnLayoutChangeListener {
    private final Rect containerRelativeRect;
    private boolean hadLayout;
    private final Rect lastClippingRect;
    private final Rect lastContainerRelativeRect;
    private VirtualViewMode mode;
    private VirtualViewModeChangeEmitter modeChangeEmitter;
    private int offsetX;
    private int offsetY;
    private VirtualViewRenderState renderState;
    private VirtualViewContainer scrollView;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VirtualViewMode.values().length];
            try {
                iArr[VirtualViewMode.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VirtualViewMode.Prerender.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VirtualViewMode.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactVirtualViewExperimental(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        this.renderState = VirtualViewRenderState.Unknown;
        this.lastContainerRelativeRect = new Rect();
        this.lastClippingRect = new Rect();
        this.containerRelativeRect = new Rect();
    }

    private final void cleanupLayoutListeners() {
        traverseParentStack(false);
    }

    public static /* synthetic */ void debugLog$ReactAndroid_release$default(ReactVirtualViewExperimental reactVirtualViewExperimental, String subtag, InterfaceC3487a block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            block = new InterfaceC3487a() { // from class: com.facebook.react.views.virtual.viewexperimental.ReactVirtualViewExperimental$debugLog$1
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return PointerEventHelper.POINTER_TYPE_UNKNOWN;
                }
            };
        }
        AbstractC2855l.g(subtag, "subtag");
        AbstractC2855l.g(block, "block");
        if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("ReactVirtualViewExperimental:[" + reactVirtualViewExperimental.getVirtualViewID() + "]:" + subtag, (String) block.invoke());
        }
    }

    private final VirtualViewContainer getScrollView() {
        return traverseParentStack(true);
    }

    private final void reportRectChangeToContainer() {
        VirtualViewContainerState virtualViewContainerState;
        if (!AbstractC2855l.b(this.lastContainerRelativeRect, getContainerRelativeRect())) {
            VirtualViewContainer virtualViewContainer = this.scrollView;
            if (virtualViewContainer != null) {
                if (virtualViewContainer != null && (virtualViewContainerState = virtualViewContainer.getVirtualViewContainerState()) != null) {
                    virtualViewContainerState.onChange(this);
                }
                this.lastContainerRelativeRect.set(getContainerRelativeRect());
                return;
            }
            return;
        }
        if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:reportRectChangeToContainer", "no rect change " + getContainerRelativeRect());
        }
    }

    private final VirtualViewContainer traverseParentStack(boolean addListeners) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof VirtualViewContainer) {
                return (VirtualViewContainer) parent;
            }
            if (parent instanceof ReactRoot) {
                return null;
            }
            if (parent instanceof View) {
                View view = (View) parent;
                view.removeOnLayoutChangeListener(this);
                if (addListeners) {
                    view.addOnLayoutChangeListener(this);
                }
            }
        }
        return null;
    }

    private final void updateParentOffset() {
        VirtualViewContainer virtualViewContainer = this.scrollView;
        if (virtualViewContainer == null) {
            return;
        }
        this.offsetX = 0;
        this.offsetY = 0;
        for (ViewParent parent = getParent(); parent != null && !AbstractC2855l.b(parent, virtualViewContainer); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view = (View) parent;
                this.offsetX += view.getLeft();
                this.offsetY += view.getTop();
            }
        }
        getContainerRelativeRect().set(getLeft() + this.offsetX, getTop() + this.offsetY, getRight() + this.offsetX, getBottom() + this.offsetY);
    }

    public final void debugLog$ReactAndroid_release(String subtag, InterfaceC3487a block) {
        AbstractC2855l.g(subtag, "subtag");
        AbstractC2855l.g(block, "block");
        if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:" + subtag, (String) block.invoke());
        }
    }

    public final void doAttachedToWindow$ReactAndroid_release() {
        this.scrollView = getScrollView();
        if (this.hadLayout) {
            updateParentOffset();
            reportRectChangeToContainer();
        }
        if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:doAttachedToWindow", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
    }

    @Override // com.facebook.react.views.scroll.VirtualView
    public Rect getContainerRelativeRect() {
        return this.containerRelativeRect;
    }

    /* JADX INFO: renamed from: getMode$ReactAndroid_release, reason: from getter */
    public final VirtualViewMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: getModeChangeEmitter$ReactAndroid_release, reason: from getter */
    public final VirtualViewModeChangeEmitter getModeChangeEmitter() {
        return this.modeChangeEmitter;
    }

    public final String getNativeId$ReactAndroid_release() {
        Object tag = getTag(R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: getRenderState$ReactAndroid_release, reason: from getter */
    public final VirtualViewRenderState getRenderState() {
        return this.renderState;
    }

    @Override // com.facebook.react.views.scroll.VirtualView
    public String getVirtualViewID() {
        String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
        if (nativeId$ReactAndroid_release == null) {
            nativeId$ReactAndroid_release = "unknown";
        }
        return nativeId$ReactAndroid_release + ":::" + getId();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        doAttachedToWindow$ReactAndroid_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        recycleView$ReactAndroid_release();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.hadLayout = true;
        if (changed) {
            Rect containerRelativeRect = getContainerRelativeRect();
            int i10 = this.offsetX;
            int i11 = this.offsetY;
            containerRelativeRect.set(left + i10, top + i11, right + i10, bottom + i11);
            if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onLayout", "containerRelativeRect=" + getContainerRelativeRect());
            }
            reportRectChangeToContainer();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        if (oldLeft == left && oldTop == top) {
            return;
        }
        updateParentOffset();
        if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onLayoutChange", "containerRelativeRect=" + getContainerRelativeRect());
        }
        reportRectChangeToContainer();
    }

    @Override // com.facebook.react.views.scroll.VirtualView
    public void onModeChange(VirtualViewMode newMode, Rect thresholdRect) {
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter;
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter2;
        AbstractC2855l.g(newMode, "newMode");
        AbstractC2855l.g(thresholdRect, "thresholdRect");
        if (this.modeChangeEmitter == null || this.scrollView == null) {
            return;
        }
        VirtualViewMode virtualViewMode = VirtualViewMode.Visible;
        if (newMode == virtualViewMode) {
            updateClippingRect(null);
        }
        VirtualViewMode virtualViewMode2 = this.mode;
        if (newMode == virtualViewMode2) {
            if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onModeChange", "no change " + newMode);
                return;
            }
            return;
        }
        this.mode = newMode;
        if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onModeChange", virtualViewMode2 + "->" + newMode);
        }
        if (virtualViewMode2 == virtualViewMode) {
            updateClippingRect(null);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[newMode.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (virtualViewMode2 == virtualViewMode || (virtualViewModeChangeEmitter2 = this.modeChangeEmitter) == null) {
                    return;
                }
                virtualViewModeChangeEmitter2.emitModeChange(VirtualViewMode.Prerender, getContainerRelativeRect(), thresholdRect, false);
                return;
            }
            if (i10 != 3) {
                throw new C2750m();
            }
            VirtualViewModeChangeEmitter virtualViewModeChangeEmitter3 = this.modeChangeEmitter;
            if (virtualViewModeChangeEmitter3 != null) {
                virtualViewModeChangeEmitter3.emitModeChange(VirtualViewMode.Hidden, getContainerRelativeRect(), thresholdRect, false);
                return;
            }
            return;
        }
        VirtualViewRenderState virtualViewRenderState = this.renderState;
        if (virtualViewRenderState == VirtualViewRenderState.Unknown) {
            VirtualViewModeChangeEmitter virtualViewModeChangeEmitter4 = this.modeChangeEmitter;
            if (virtualViewModeChangeEmitter4 != null) {
                virtualViewModeChangeEmitter4.emitModeChange(virtualViewMode, getContainerRelativeRect(), thresholdRect, true);
                return;
            }
            return;
        }
        if ((virtualViewMode2 == VirtualViewMode.Prerender && virtualViewRenderState == VirtualViewRenderState.Rendered) || (virtualViewModeChangeEmitter = this.modeChangeEmitter) == null) {
            return;
        }
        virtualViewModeChangeEmitter.emitModeChange(virtualViewMode, getContainerRelativeRect(), thresholdRect, true);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        getContainerRelativeRect().set(getLeft() + this.offsetX, getTop() + this.offsetY, getRight() + this.offsetX, getBottom() + this.offsetY);
        if (ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onSizeChanged", "container=" + getContainerRelativeRect());
        }
        reportRectChangeToContainer();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void recycleView$ReactAndroid_release() {
        VirtualViewContainerState virtualViewContainerState;
        cleanupLayoutListeners();
        VirtualViewContainer virtualViewContainer = this.scrollView;
        if (virtualViewContainer != null && (virtualViewContainerState = virtualViewContainer.getVirtualViewContainerState()) != null) {
            virtualViewContainerState.remove(this);
        }
        this.scrollView = null;
        this.mode = null;
        this.modeChangeEmitter = null;
        this.hadLayout = false;
        this.lastContainerRelativeRect.setEmpty();
        this.lastClippingRect.setEmpty();
        getContainerRelativeRect().setEmpty();
    }

    public final void setMode$ReactAndroid_release(VirtualViewMode virtualViewMode) {
        this.mode = virtualViewMode;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(VirtualViewModeChangeEmitter virtualViewModeChangeEmitter) {
        this.modeChangeEmitter = virtualViewModeChangeEmitter;
    }

    public final void setRenderState$ReactAndroid_release(VirtualViewRenderState virtualViewRenderState) {
        AbstractC2855l.g(virtualViewRenderState, "<set-?>");
        this.renderState = virtualViewRenderState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(Set<Integer> excludedViews) {
        if (get_removeClippedSubviews$ReactAndroid_release()) {
            if (this.scrollView == null) {
                super.updateClippingRect(excludedViews);
                return;
            }
            Rect clippingRect = getClippingRect();
            if (clippingRect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            VirtualViewContainer virtualViewContainer = this.scrollView;
            if (virtualViewContainer == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC2855l.e(virtualViewContainer, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup");
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) virtualViewContainer;
            if (ReactNativeFeatureFlags.enableVirtualViewClippingWithoutScrollViewClipping()) {
                if (reactClippingViewGroup.get_removeClippedSubviews()) {
                    reactClippingViewGroup.getClippingRect(clippingRect);
                } else {
                    ((View) reactClippingViewGroup).getDrawingRect(clippingRect);
                }
            } else {
                if (!reactClippingViewGroup.get_removeClippedSubviews()) {
                    super.updateClippingRect(excludedViews);
                    return;
                }
                reactClippingViewGroup.getClippingRect(clippingRect);
            }
            clippingRect.intersect(getContainerRelativeRect());
            clippingRect.offset(-getContainerRelativeRect().left, -getContainerRelativeRect().top);
            if (AbstractC2855l.b(this.lastClippingRect, clippingRect)) {
                return;
            }
            updateClippingToRect$ReactAndroid_release(clippingRect, excludedViews);
            this.lastClippingRect.set(clippingRect);
        }
    }
}
