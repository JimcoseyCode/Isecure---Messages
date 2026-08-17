package com.facebook.react.views.virtual.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.R;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ScrollEventType;
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
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010 J\u000f\u0010&\u001a\u00020\u000bH\u0010¢\u0006\u0004\b%\u0010 J\u000f\u0010'\u001a\u00020\u000bH\u0014¢\u0006\u0004\b'\u0010 J\u000f\u0010)\u001a\u00020\u000bH\u0001¢\u0006\u0004\b(\u0010 J\u000f\u0010*\u001a\u00020\u000bH\u0014¢\u0006\u0004\b*\u0010 J7\u00101\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0014¢\u0006\u0004\b1\u00102JY\u00109\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020,2\u0006\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020,H\u0016¢\u0006\u0004\b9\u0010:J3\u0010A\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u001c2\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u00101\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b1\u0010CJ\u0017\u00109\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u001cH\u0016¢\u0006\u0004\b9\u0010CJ/\u0010H\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020,H\u0014¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\u000b2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ+\u0010T\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020N2\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0PH\u0080\bø\u0001\u0000¢\u0006\u0004\bR\u0010SR$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010\u001aR\"\u0010Z\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010iR\u0016\u0010t\u001a\u0004\u0018\u00010s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010yR\u0014\u0010{\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010yR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010yR\u0016\u0010}\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010~R\u0018\u0010\u0080\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010oR\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010N8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/facebook/react/views/virtual/view/ReactVirtualView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "checkRectChange", "Li7/B;", "dispatchOnModeChangeIfNeeded", "(Z)V", "Landroid/graphics/Rect;", "rect1", "rect2", "rectsOverlap", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "Lcom/facebook/react/views/virtual/VirtualViewMode;", "oldMode", "newMode", "maybeEmitModeChanges", "(Lcom/facebook/react/views/virtual/VirtualViewMode;Lcom/facebook/react/views/virtual/VirtualViewMode;)V", "mode", "emitAsyncModeChange", "(Lcom/facebook/react/views/virtual/VirtualViewMode;)V", "emitSyncModeChange", "Landroid/view/ViewGroup;", "getParentScrollView", "()Landroid/view/ViewGroup;", "cleanupLayoutListeners", "()V", "addListeners", "traverseParentStack", "(Z)Landroid/view/ViewGroup;", "updateParentOffset", "recycleView$ReactAndroid_release", "recycleView", "onAttachedToWindow", "doAttachedToWindow$ReactAndroid_release", "doAttachedToWindow", "onDetachedFromWindow", "changed", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "Landroid/view/View;", "v", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "scrollView", "Lcom/facebook/react/views/scroll/ScrollEventType;", "scrollEventType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "xVelocity", "yVelocity", "onScroll", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V", "(Landroid/view/ViewGroup;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "excludedViews", "updateClippingRect", "(Ljava/util/Set;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "subtag", "Lkotlin/Function0;", "block", "debugLog$ReactAndroid_release", "(Ljava/lang/String;Lw7/a;)V", "debugLog", "Lcom/facebook/react/views/virtual/VirtualViewMode;", "getMode$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewMode;", "setMode$ReactAndroid_release", "Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "renderState", "Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "getRenderState$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "setRenderState$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewRenderState;)V", "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "modeChangeEmitter", "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "getModeChangeEmitter$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "setModeChangeEmitter$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prerenderRatio", "D", "getPrerenderRatio$ReactAndroid_release", "()D", "setPrerenderRatio$ReactAndroid_release", "(D)V", "debugLogEnabled", "Z", "getDebugLogEnabled$ReactAndroid_release", "()Z", "hysteresisRatio", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "onWindowFocusChangeListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "parentScrollView", "Landroid/view/View;", "lastRect", "Landroid/graphics/Rect;", "targetRect", "thresholdRect", "lastClippingRect", "offsetX", "I", "offsetY", "offsetChanged", "getNativeId$ReactAndroid_release", "()Ljava/lang/String;", "nativeId", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactVirtualView extends ReactViewGroup implements ReactScrollViewHelper.ScrollListener, ReactScrollViewHelper.LayoutChangeListener, View.OnLayoutChangeListener {
    private final boolean debugLogEnabled;
    private final double hysteresisRatio;
    private final Rect lastClippingRect;
    private final Rect lastRect;
    private VirtualViewMode mode;
    private VirtualViewModeChangeEmitter modeChangeEmitter;
    private boolean offsetChanged;
    private int offsetX;
    private int offsetY;
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;
    private View parentScrollView;
    private double prerenderRatio;
    private VirtualViewRenderState renderState;
    private final Rect targetRect;
    private final Rect thresholdRect;

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
    public ReactVirtualView(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        this.renderState = VirtualViewRenderState.Unknown;
        this.prerenderRatio = ReactNativeFeatureFlags.virtualViewPrerenderRatio();
        this.debugLogEnabled = ReactNativeFeatureFlags.enableVirtualViewDebugFeatures();
        this.hysteresisRatio = ReactNativeFeatureFlags.virtualViewHysteresisRatio();
        this.onWindowFocusChangeListener = ReactNativeFeatureFlags.enableVirtualViewWindowFocusDetection() ? new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.facebook.react.views.virtual.view.a
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                this.f20645a.dispatchOnModeChangeIfNeeded(false);
            }
        } : null;
        this.lastRect = new Rect();
        this.targetRect = new Rect();
        this.thresholdRect = new Rect();
        this.lastClippingRect = new Rect();
    }

    private final void cleanupLayoutListeners() {
        traverseParentStack(false);
    }

    public static /* synthetic */ void debugLog$ReactAndroid_release$default(ReactVirtualView reactVirtualView, String subtag, InterfaceC3487a block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            block = new InterfaceC3487a() { // from class: com.facebook.react.views.virtual.view.ReactVirtualView$debugLog$1
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return PointerEventHelper.POINTER_TYPE_UNKNOWN;
                }
            };
        }
        AbstractC2855l.g(subtag, "subtag");
        AbstractC2855l.g(block, "block");
        if (reactVirtualView.getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                AbstractC2325a.b("ReactVirtualView:" + subtag, block.invoke() + " [" + reactVirtualView.getId() + "][" + reactVirtualView.getNativeId$ReactAndroid_release() + "]");
                return;
            }
            AbstractC2325a.I("ReactVirtualView:" + subtag, block.invoke() + " [" + reactVirtualView.getId() + "][" + reactVirtualView.getNativeId$ReactAndroid_release() + "]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchOnModeChangeIfNeeded(boolean checkRectChange) {
        View view;
        double d10;
        boolean zRectsOverlap;
        VirtualViewMode virtualViewMode;
        if (this.modeChangeEmitter == null || (view = this.parentScrollView) == null) {
            return;
        }
        if (this.offsetChanged) {
            updateParentOffset();
        }
        this.targetRect.set(getLeft() + this.offsetX, getTop() + this.offsetY, getRight() + this.offsetX, getBottom() + this.offsetY);
        view.getDrawingRect(this.thresholdRect);
        int iHeight = this.thresholdRect.height();
        int iWidth = this.thresholdRect.width();
        if ((this.targetRect.width() == 0 && this.targetRect.height() == 0) || this.thresholdRect.isEmpty()) {
            if (getDebugLogEnabled()) {
                if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                    String str = "empty rects target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                    AbstractC2325a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                String str2 = "empty rects target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                AbstractC2325a.I("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            return;
        }
        updateClippingRect();
        if (checkRectChange) {
            if (!this.lastRect.isEmpty() && AbstractC2855l.b(this.lastRect, this.targetRect)) {
                if (getDebugLogEnabled()) {
                    if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                        AbstractC2325a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) "no rect change") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                        return;
                    }
                    AbstractC2325a.I("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) "no rect change") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                return;
            }
            this.lastRect.set(this.targetRect);
        }
        if (rectsOverlap(this.targetRect, this.thresholdRect)) {
            virtualViewMode = (this.onWindowFocusChangeListener == null || hasWindowFocus()) ? VirtualViewMode.Visible : VirtualViewMode.Prerender;
        } else {
            double d11 = this.prerenderRatio;
            if (d11 > 0.0d) {
                d10 = 0.0d;
                this.thresholdRect.inset((int) (((double) (-iWidth)) * d11), (int) (((double) (-iHeight)) * d11));
                zRectsOverlap = rectsOverlap(this.targetRect, this.thresholdRect);
            } else {
                d10 = 0.0d;
                zRectsOverlap = false;
            }
            if (zRectsOverlap) {
                virtualViewMode = VirtualViewMode.Prerender;
            } else {
                VirtualViewMode virtualViewMode2 = this.mode;
                if (virtualViewMode2 != null) {
                    double d12 = this.hysteresisRatio;
                    if (d12 > d10) {
                        this.thresholdRect.inset((int) (((double) (-iWidth)) * d12), (int) (((double) (-iHeight)) * d12));
                        if (rectsOverlap(this.targetRect, this.thresholdRect)) {
                            if (getDebugLogEnabled()) {
                                if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                                    int id = getId();
                                    String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
                                    AbstractC2325a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) ("hysteresis, mode=" + virtualViewMode2)) + " [" + id + "][" + nativeId$ReactAndroid_release + "]");
                                } else {
                                    int id2 = getId();
                                    String nativeId$ReactAndroid_release2 = getNativeId$ReactAndroid_release();
                                    AbstractC2325a.I("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) ("hysteresis, mode=" + virtualViewMode2)) + " [" + id2 + "][" + nativeId$ReactAndroid_release2 + "]");
                                }
                            }
                            virtualViewMode = virtualViewMode2;
                        } else {
                            virtualViewMode = VirtualViewMode.Hidden;
                            this.thresholdRect.setEmpty();
                        }
                    } else {
                        virtualViewMode = VirtualViewMode.Hidden;
                        this.thresholdRect.setEmpty();
                    }
                }
            }
        }
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                String str3 = "mode=" + this.mode + " target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                AbstractC2325a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str3) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                String str4 = "mode=" + this.mode + " target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                AbstractC2325a.I("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str4) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        VirtualViewMode virtualViewMode3 = this.mode;
        if (virtualViewMode == virtualViewMode3) {
            return;
        }
        this.mode = virtualViewMode;
        maybeEmitModeChanges(virtualViewMode3, virtualViewMode);
    }

    private final void emitAsyncModeChange(VirtualViewMode mode) {
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter = this.modeChangeEmitter;
        if (virtualViewModeChangeEmitter != null) {
            virtualViewModeChangeEmitter.emitModeChange(mode, this.targetRect, this.thresholdRect, false);
        }
    }

    private final void emitSyncModeChange(VirtualViewMode mode) {
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter = this.modeChangeEmitter;
        if (virtualViewModeChangeEmitter != null) {
            virtualViewModeChangeEmitter.emitModeChange(mode, this.targetRect, this.thresholdRect, true);
        }
    }

    private final ViewGroup getParentScrollView() {
        return traverseParentStack(true);
    }

    private final void maybeEmitModeChanges(VirtualViewMode oldMode, VirtualViewMode newMode) {
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                int id = getId();
                String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
                AbstractC2325a.b("ReactVirtualView:Mode change", ((Object) (oldMode + "->" + newMode)) + " [" + id + "][" + nativeId$ReactAndroid_release + "]");
            } else {
                int id2 = getId();
                String nativeId$ReactAndroid_release2 = getNativeId$ReactAndroid_release();
                AbstractC2325a.I("ReactVirtualView:Mode change", ((Object) (oldMode + "->" + newMode)) + " [" + id2 + "][" + nativeId$ReactAndroid_release2 + "]");
            }
        }
        B3.a.c(0L, "VirtualView::mode change " + oldMode + " -> " + newMode + ", nativeID=" + getNativeId$ReactAndroid_release());
        int i10 = WhenMappings.$EnumSwitchMapping$0[newMode.ordinal()];
        if (i10 == 1) {
            VirtualViewRenderState virtualViewRenderState = this.renderState;
            if (virtualViewRenderState == VirtualViewRenderState.Unknown || oldMode != VirtualViewMode.Prerender || virtualViewRenderState != VirtualViewRenderState.Rendered) {
                emitSyncModeChange(VirtualViewMode.Visible);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new C2750m();
            }
            emitAsyncModeChange(VirtualViewMode.Hidden);
        } else if (oldMode != VirtualViewMode.Visible) {
            emitAsyncModeChange(VirtualViewMode.Prerender);
        }
        B3.a.i(0L);
    }

    private final boolean rectsOverlap(Rect rect1, Rect rect2) {
        return rect1.top < rect2.bottom && rect2.top < rect1.bottom && rect1.left < rect2.right && rect2.left < rect1.right;
    }

    private final ViewGroup traverseParentStack(boolean addListeners) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ReactScrollView) {
                return (ViewGroup) parent;
            }
            if (parent instanceof ReactHorizontalScrollView) {
                return (ViewGroup) parent;
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
        View view = this.parentScrollView;
        if (view == null) {
            return;
        }
        this.offsetX = 0;
        this.offsetY = 0;
        this.offsetChanged = false;
        for (ViewParent parent = getParent(); parent != null && !AbstractC2855l.b(parent, view); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                this.offsetX += view2.getLeft();
                this.offsetY += view2.getTop();
            }
        }
    }

    public final void debugLog$ReactAndroid_release(String subtag, InterfaceC3487a block) {
        AbstractC2855l.g(subtag, "subtag");
        AbstractC2855l.g(block, "block");
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                AbstractC2325a.b("ReactVirtualView:" + subtag, block.invoke() + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            AbstractC2325a.I("ReactVirtualView:" + subtag, block.invoke() + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
        }
    }

    public final void doAttachedToWindow$ReactAndroid_release() {
        ViewGroup parentScrollView = getParentScrollView();
        if (parentScrollView != null) {
            this.offsetChanged = true;
            ReactScrollViewHelper.addScrollListener(this);
            ReactScrollViewHelper.addLayoutChangeListener(this);
        } else {
            parentScrollView = null;
        }
        this.parentScrollView = parentScrollView;
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                AbstractC2325a.b("ReactVirtualView:onAttachedToWindow", ((Object) PointerEventHelper.POINTER_TYPE_UNKNOWN) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                AbstractC2325a.I("ReactVirtualView:onAttachedToWindow", ((Object) PointerEventHelper.POINTER_TYPE_UNKNOWN) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        if (this.onWindowFocusChangeListener != null) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        dispatchOnModeChangeIfNeeded(false);
    }

    /* JADX INFO: renamed from: getDebugLogEnabled$ReactAndroid_release, reason: from getter */
    public final boolean getDebugLogEnabled() {
        return this.debugLogEnabled;
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

    /* JADX INFO: renamed from: getPrerenderRatio$ReactAndroid_release, reason: from getter */
    public final double getPrerenderRatio() {
        return this.prerenderRatio;
    }

    /* JADX INFO: renamed from: getRenderState$ReactAndroid_release, reason: from getter */
    public final VirtualViewRenderState getRenderState() {
        return this.renderState;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        doAttachedToWindow$ReactAndroid_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReactScrollViewHelper.removeScrollListener(this);
        ReactScrollViewHelper.removeLayoutChangeListener(this);
        if (this.onWindowFocusChangeListener != null) {
            getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        cleanupLayoutListeners();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            this.offsetChanged = true;
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        this.offsetChanged = (!this.offsetChanged && oldLeft == left && oldTop == top) ? false : true;
        dispatchOnModeChangeIfNeeded(true);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.ScrollListener
    public void onScroll(ViewGroup scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity) {
        if (AbstractC2855l.b(scrollView, this.parentScrollView)) {
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        dispatchOnModeChangeIfNeeded(true);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void recycleView$ReactAndroid_release() {
        ReactScrollViewHelper.removeScrollListener(this);
        ReactScrollViewHelper.removeLayoutChangeListener(this);
        cleanupLayoutListeners();
        this.mode = null;
        this.modeChangeEmitter = null;
        this.lastRect.setEmpty();
        this.parentScrollView = null;
        this.offsetX = 0;
        this.offsetY = 0;
        this.offsetChanged = false;
        this.lastClippingRect.setEmpty();
    }

    public final void setMode$ReactAndroid_release(VirtualViewMode virtualViewMode) {
        this.mode = virtualViewMode;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(VirtualViewModeChangeEmitter virtualViewModeChangeEmitter) {
        this.modeChangeEmitter = virtualViewModeChangeEmitter;
    }

    public final void setPrerenderRatio$ReactAndroid_release(double d10) {
        this.prerenderRatio = d10;
    }

    public final void setRenderState$ReactAndroid_release(VirtualViewRenderState virtualViewRenderState) {
        AbstractC2855l.g(virtualViewRenderState, "<set-?>");
        this.renderState = virtualViewRenderState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(Set<Integer> excludedViews) {
        if (get_removeClippedSubviews$ReactAndroid_release()) {
            if (this.parentScrollView == null) {
                super.updateClippingRect(excludedViews);
                return;
            }
            Rect clippingRect = getClippingRect();
            if (clippingRect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            KeyEvent.Callback callback = this.parentScrollView;
            if (callback == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC2855l.e(callback, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup");
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) callback;
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
            clippingRect.intersect(this.targetRect);
            Rect rect = this.targetRect;
            clippingRect.offset(-rect.left, -rect.top);
            if (AbstractC2855l.b(this.lastClippingRect, clippingRect)) {
                return;
            }
            updateClippingToRect$ReactAndroid_release(clippingRect, excludedViews);
            this.lastClippingRect.set(clippingRect);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.LayoutChangeListener
    public void onLayoutChange(ViewGroup scrollView) {
        AbstractC2855l.g(scrollView, "scrollView");
        if (AbstractC2855l.b(scrollView, this.parentScrollView)) {
            this.offsetChanged = true;
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.ScrollListener
    public void onLayout(ViewGroup scrollView) {
        if (AbstractC2855l.b(scrollView, this.parentScrollView)) {
            dispatchOnModeChangeIfNeeded(false);
        }
    }
}
