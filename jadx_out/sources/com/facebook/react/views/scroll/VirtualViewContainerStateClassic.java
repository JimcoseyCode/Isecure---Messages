package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.virtual.VirtualViewMode;
import d2.AbstractC2325a;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerStateClassic;", "Lcom/facebook/react/views/scroll/VirtualViewContainerState;", "Landroid/view/ViewGroup;", "scrollView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/facebook/react/views/scroll/VirtualView;", "virtualView", "Li7/B;", "updateModes", "(Lcom/facebook/react/views/scroll/VirtualView;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "virtualViews", "Ljava/util/Collection;", "getVirtualViews", "()Ljava/util/Collection;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VirtualViewContainerStateClassic extends VirtualViewContainerState {
    private final Collection<VirtualView> virtualViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualViewContainerStateClassic(ViewGroup scrollView) {
        super(scrollView);
        AbstractC2855l.g(scrollView, "scrollView");
        this.virtualViews = new LinkedHashSet();
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    protected Collection<VirtualView> getVirtualViews() {
        return this.virtualViews;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    protected void updateModes(VirtualView virtualView) {
        getScrollView().getDrawingRect(getVisibleRect());
        if (getVisibleRect().isEmpty()) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                AbstractC2325a.b("VirtualViewContainerStateClassic:updateModes", "scrollView visibleRect is empty");
                return;
            }
            return;
        }
        getPrerenderRect().set(getVisibleRect());
        getPrerenderRect().inset((int) (((double) (-getPrerenderRect().width())) * getPrerenderRatio()), (int) (((double) (-getPrerenderRect().height())) * getPrerenderRatio()));
        if (getHysteresisRatio() > 0.0d) {
            getHysteresisRect().set(getPrerenderRect());
            getHysteresisRect().inset((int) (((double) (-getVisibleRect().width())) * getHysteresisRatio()), (int) (((double) (-getVisibleRect().height())) * getHysteresisRatio()));
        }
        for (VirtualView virtualView2 : virtualView != null ? AbstractC2800q.e(virtualView) : AbstractC2800q.S0(getVirtualViews())) {
            Rect containerRelativeRect = virtualView2.getContainerRelativeRect();
            VirtualViewMode virtualViewMode = VirtualViewMode.Hidden;
            Rect emptyRect = getEmptyRect();
            if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getVisibleRect())) {
                emptyRect = getVisibleRect();
                virtualViewMode = (getOnWindowFocusChangeListener() == null || getScrollView().hasWindowFocus()) ? VirtualViewMode.Visible : VirtualViewMode.Prerender;
            } else if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getPrerenderRect())) {
                virtualViewMode = VirtualViewMode.Prerender;
                emptyRect = getPrerenderRect();
            } else if (getHysteresisRatio() > 0.0d && VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getHysteresisRect())) {
                virtualViewMode = null;
            }
            if (virtualViewMode != null) {
                virtualView2.onModeChange(virtualViewMode, emptyRect);
                if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                    AbstractC2325a.b("VirtualViewContainerStateClassic:updateModes", "virtualView=" + virtualView2.getVirtualViewID() + " mode=" + virtualViewMode + "  rect=" + containerRelativeRect + " thresholdRect=" + emptyRect);
                }
            }
        }
    }
}
