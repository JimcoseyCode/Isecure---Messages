package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.virtual.VirtualViewMode;
import d2.AbstractC2325a;
import j7.AbstractC2800q;
import j7.T;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerStateExperimental;", "Lcom/facebook/react/views/scroll/VirtualViewContainerState;", "Landroid/view/ViewGroup;", "scrollView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/facebook/react/views/scroll/VirtualView;", "virtualView", "Li7/B;", "updateMode", "(Lcom/facebook/react/views/scroll/VirtualView;)V", "updateModesAll", "()V", "onChange", "updateModes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "horizontal", "Z", "Lcom/facebook/react/views/scroll/IntervalTree;", "virtualViews", "Lcom/facebook/react/views/scroll/IntervalTree;", "getVirtualViews", "()Lcom/facebook/react/views/scroll/IntervalTree;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "HPV", "Ljava/util/Set;", "getHPV", "()Ljava/util/Set;", "setHPV", "(Ljava/util/Set;)V", "P", "getP", "setP", "V", "getV", "setV", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VirtualViewContainerStateExperimental extends VirtualViewContainerState {
    private Set<String> HPV;
    private Set<String> P;
    private Set<String> V;
    private final boolean horizontal;
    private final IntervalTree virtualViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualViewContainerStateExperimental(ViewGroup scrollView) {
        super(scrollView);
        AbstractC2855l.g(scrollView, "scrollView");
        boolean z10 = false;
        if (!(scrollView instanceof ReactScrollView) && (scrollView instanceof ReactHorizontalScrollView)) {
            z10 = true;
        }
        this.horizontal = z10;
        this.virtualViews = new IntervalTree(z10);
        this.HPV = new LinkedHashSet();
        this.P = new LinkedHashSet();
        this.V = new LinkedHashSet();
    }

    private final void updateMode(VirtualView virtualView) {
        VirtualViewMode virtualViewMode;
        Rect containerRelativeRect = virtualView.getContainerRelativeRect();
        VirtualViewMode virtualViewMode2 = VirtualViewMode.Hidden;
        Rect emptyRect = getEmptyRect();
        if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getVisibleRect())) {
            emptyRect = getVisibleRect();
            virtualViewMode = (getOnWindowFocusChangeListener() == null || getScrollView().hasWindowFocus()) ? VirtualViewMode.Visible : VirtualViewMode.Prerender;
        } else if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getPrerenderRect())) {
            virtualViewMode = VirtualViewMode.Prerender;
            emptyRect = getPrerenderRect();
        } else {
            virtualViewMode = (getHysteresisRatio() <= 0.0d || !VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getHysteresisRect())) ? virtualViewMode2 : null;
        }
        if (virtualViewMode != null) {
            virtualView.onModeChange(virtualViewMode, emptyRect);
        }
        if (virtualViewMode == VirtualViewMode.Visible) {
            this.HPV.add(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.add(virtualView.getVirtualViewID());
        } else if (virtualViewMode == VirtualViewMode.Prerender) {
            this.HPV.add(virtualView.getVirtualViewID());
            this.P.add(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        } else if (virtualViewMode == virtualViewMode2) {
            this.HPV.remove(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        } else {
            this.HPV.add(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        }
    }

    private final void updateModesAll() {
        Set<String> setQuery = getVirtualViews().query(getVisibleRect());
        Set<String> setQuery2 = getVirtualViews().query(getPrerenderRect());
        Set<String> setQuery3 = getVirtualViews().query(getHysteresisRect());
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:updateModes", "V: " + this.V + ", P: " + this.P + ", HPV: " + this.HPV);
        }
        Set setI = T.i(setQuery2, setQuery);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:updateModes", "V': " + setQuery + ", P': " + setI + ", HPV': " + setQuery3);
        }
        Set setI2 = T.i(setQuery, this.V);
        Set setI3 = T.i(setI, this.P);
        Set setI4 = T.i(this.HPV, setQuery3);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:updateModes", "toV: " + setI2 + ", toP: " + setI3 + ", toH: " + setI4);
        }
        Iterator it = setI2.iterator();
        while (it.hasNext()) {
            VirtualView virtualView = getVirtualViews().getVirtualView((String) it.next());
            if (virtualView != null) {
                virtualView.onModeChange(VirtualViewMode.Visible, getVisibleRect());
            }
        }
        Iterator it2 = setI3.iterator();
        while (it2.hasNext()) {
            VirtualView virtualView2 = getVirtualViews().getVirtualView((String) it2.next());
            if (virtualView2 != null) {
                virtualView2.onModeChange(VirtualViewMode.Prerender, getPrerenderRect());
            }
        }
        Iterator it3 = setI4.iterator();
        while (it3.hasNext()) {
            VirtualView virtualView3 = getVirtualViews().getVirtualView((String) it3.next());
            if (virtualView3 != null) {
                virtualView3.onModeChange(VirtualViewMode.Hidden, getEmptyRect());
            }
        }
        this.V = setQuery;
        this.P = AbstractC2800q.S0(setI);
        this.HPV = AbstractC2800q.S0(setQuery3);
    }

    public final Set<String> getHPV() {
        return this.HPV;
    }

    public final Set<String> getP() {
        return this.P;
    }

    public final Set<String> getV() {
        return this.V;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public void onChange(VirtualView virtualView) {
        AbstractC2855l.g(virtualView, "virtualView");
        if (getVirtualViews().add(virtualView)) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                AbstractC2325a.b("VirtualViewContainerStateExperimental:add", "virtualViewID=" + virtualView.getVirtualViewID());
            }
        } else if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:update", "virtualViewID=" + virtualView.getVirtualViewID());
        }
        updateModes(virtualView);
    }

    public final void setHPV(Set<String> set) {
        AbstractC2855l.g(set, "<set-?>");
        this.HPV = set;
    }

    public final void setP(Set<String> set) {
        AbstractC2855l.g(set, "<set-?>");
        this.P = set;
    }

    public final void setV(Set<String> set) {
        AbstractC2855l.g(set, "<set-?>");
        this.V = set;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    protected void updateModes(VirtualView virtualView) {
        updateRects();
        if (virtualView != null) {
            updateMode(virtualView);
        } else {
            updateModesAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public IntervalTree getVirtualViews() {
        return this.virtualViews;
    }
}
