package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001f\n\u0002\b\u0005\b \u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u001b\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH$¢\u0006\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0+8$X¤\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/ViewGroup;", "scrollView", "<init>", "(Landroid/view/ViewGroup;)V", "Li7/B;", "cleanup", "()V", "Lcom/facebook/react/views/scroll/VirtualView;", "virtualView", "onChange", "(Lcom/facebook/react/views/scroll/VirtualView;)V", "remove", "updateState", "updateRects", "updateModes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prerenderRatio", "D", "getPrerenderRatio", "()D", "hysteresisRatio", "getHysteresisRatio", "Landroid/graphics/Rect;", "emptyRect", "Landroid/graphics/Rect;", "getEmptyRect", "()Landroid/graphics/Rect;", "visibleRect", "getVisibleRect", "prerenderRect", "getPrerenderRect", "hysteresisRect", "getHysteresisRect", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "onWindowFocusChangeListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "getOnWindowFocusChangeListener", "()Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "Landroid/view/ViewGroup;", "getScrollView", "()Landroid/view/ViewGroup;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getVirtualViews", "()Ljava/util/Collection;", "virtualViews", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class VirtualViewContainerState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Rect emptyRect;
    private final double hysteresisRatio;
    private final Rect hysteresisRect;
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;
    private final double prerenderRatio;
    private final Rect prerenderRect;
    private final ViewGroup scrollView;
    private final Rect visibleRect;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerState$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "create", "Lcom/facebook/react/views/scroll/VirtualViewContainerState;", "scrollView", "Landroid/view/ViewGroup;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VirtualViewContainerState create(ViewGroup scrollView) {
            AbstractC2855l.g(scrollView, "scrollView");
            return ReactNativeFeatureFlags.enableVirtualViewContainerStateExperimental() ? new VirtualViewContainerStateExperimental(scrollView) : new VirtualViewContainerStateClassic(scrollView);
        }

        private Companion() {
        }
    }

    public VirtualViewContainerState(ViewGroup scrollView) {
        AbstractC2855l.g(scrollView, "scrollView");
        this.prerenderRatio = ReactNativeFeatureFlags.virtualViewPrerenderRatio();
        this.hysteresisRatio = ReactNativeFeatureFlags.virtualViewHysteresisRatio();
        this.emptyRect = new Rect();
        this.visibleRect = new Rect();
        this.prerenderRect = new Rect();
        this.hysteresisRect = new Rect();
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = ReactNativeFeatureFlags.enableVirtualViewWindowFocusDetection() ? new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.facebook.react.views.scroll.b
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                VirtualViewContainerState.onWindowFocusChangeListener$lambda$0(this.f20626a, z10);
            }
        } : null;
        this.onWindowFocusChangeListener = onWindowFocusChangeListener;
        this.scrollView = scrollView;
        if (onWindowFocusChangeListener != null) {
            scrollView.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
    }

    public static final VirtualViewContainerState create(ViewGroup viewGroup) {
        return INSTANCE.create(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWindowFocusChangeListener$lambda$0(VirtualViewContainerState virtualViewContainerState, boolean z10) {
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerState:onWindowFocusChanged", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        updateModes$default(virtualViewContainerState, null, 1, null);
    }

    public static /* synthetic */ void updateModes$default(VirtualViewContainerState virtualViewContainerState, VirtualView virtualView, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateModes");
        }
        if ((i10 & 1) != 0) {
            virtualView = null;
        }
        virtualViewContainerState.updateModes(virtualView);
    }

    public final void cleanup() {
        if (this.onWindowFocusChangeListener != null) {
            this.scrollView.getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
    }

    protected final Rect getEmptyRect() {
        return this.emptyRect;
    }

    protected final double getHysteresisRatio() {
        return this.hysteresisRatio;
    }

    protected final Rect getHysteresisRect() {
        return this.hysteresisRect;
    }

    protected final ViewTreeObserver.OnWindowFocusChangeListener getOnWindowFocusChangeListener() {
        return this.onWindowFocusChangeListener;
    }

    protected final double getPrerenderRatio() {
        return this.prerenderRatio;
    }

    protected final Rect getPrerenderRect() {
        return this.prerenderRect;
    }

    protected final ViewGroup getScrollView() {
        return this.scrollView;
    }

    protected abstract Collection<VirtualView> getVirtualViews();

    protected final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public void onChange(VirtualView virtualView) {
        AbstractC2855l.g(virtualView, "virtualView");
        if (getVirtualViews().add(virtualView)) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                AbstractC2325a.b("VirtualViewContainerState:add", "virtualViewID=" + virtualView.getVirtualViewID());
            }
        } else if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerState:update", "virtualViewID=" + virtualView.getVirtualViewID());
        }
        updateModes(virtualView);
    }

    public void remove(VirtualView virtualView) {
        AbstractC2855l.g(virtualView, "virtualView");
        getVirtualViews().remove(virtualView);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerState:remove", "virtualViewID=" + virtualView.getVirtualViewID());
        }
    }

    protected abstract void updateModes(VirtualView virtualView);

    protected final void updateRects() {
        this.scrollView.getDrawingRect(this.visibleRect);
        if (this.visibleRect.isEmpty()) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                AbstractC2325a.b("VirtualViewContainerState:updateRects", "scrollView visibleRect is empty");
            }
            this.prerenderRect.set(this.visibleRect);
            this.hysteresisRect.set(this.prerenderRect);
            return;
        }
        this.prerenderRect.set(this.visibleRect);
        Rect rect = this.prerenderRect;
        rect.inset((int) (((double) (-rect.width())) * this.prerenderRatio), (int) (((double) (-this.prerenderRect.height())) * this.prerenderRatio));
        this.hysteresisRect.set(this.prerenderRect);
        this.hysteresisRect.inset((int) (((double) (-this.visibleRect.width())) * this.hysteresisRatio), (int) (((double) (-this.visibleRect.height())) * this.hysteresisRatio));
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerState:updateRects", "visibleRect " + this.visibleRect + " prerenderRect " + this.prerenderRect + " hysteresisRect " + this.hysteresisRect);
        }
    }

    public final void updateState() {
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerState:updateState", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        updateModes$default(this, null, 1, null);
    }
}
