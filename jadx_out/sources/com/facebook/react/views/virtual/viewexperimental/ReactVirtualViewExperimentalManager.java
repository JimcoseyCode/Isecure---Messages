package com.facebook.react.views.virtual.viewexperimental;

import android.view.View;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.viewmanagers.VirtualViewExperimentalManagerDelegate;
import com.facebook.react.viewmanagers.VirtualViewExperimentalManagerInterface;
import com.facebook.react.views.view.ReactClippingViewManager;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.virtual.VirtualViewMode;
import com.facebook.react.views.virtual.VirtualViewRenderState;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ReactVirtualViewExperimentalManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001$B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u001e\u0012\f\u0012\n !*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n !*\u0004\u0018\u00010\u00000\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;", "Lcom/facebook/react/viewmanagers/VirtualViewExperimentalManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setInitialHidden", "(Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "setRenderState", "(Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;I)V", "nativeId", "setNativeId", "(Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;Ljava/lang/String;)V", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;)V", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;)Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;", "Lcom/facebook/react/viewmanagers/VirtualViewExperimentalManagerDelegate;", "kotlin.jvm.PlatformType", "_delegate", "Lcom/facebook/react/viewmanagers/VirtualViewExperimentalManagerDelegate;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactVirtualViewExperimentalManager extends ReactClippingViewManager<ReactVirtualViewExperimental> implements VirtualViewExperimentalManagerInterface<ReactVirtualViewExperimental> {
    public static final String REACT_CLASS = "VirtualViewExperimental";
    private final VirtualViewExperimentalManagerDelegate<ReactVirtualViewExperimental, ReactVirtualViewExperimentalManager> _delegate = new VirtualViewExperimentalManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ReactVirtualViewExperimental> getDelegate() {
        return this._delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.VirtualViewExperimentalManagerInterface
    public /* bridge */ /* synthetic */ void setRemoveClippedSubviews(View view, boolean z10) {
        setRemoveClippedSubviews((ReactViewGroup) view, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext reactContext, ReactVirtualViewExperimental view) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(view, "view");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, view.getId());
        if (eventDispatcherForReactTag == null) {
            return;
        }
        view.setModeChangeEmitter$ReactAndroid_release(new VirtualViewEventEmitter(view.getId(), UIManagerHelper.getSurfaceId(reactContext), eventDispatcherForReactTag));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactVirtualViewExperimental createViewInstance(ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return new ReactVirtualViewExperimental(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactVirtualViewExperimental prepareToRecycleView(ThemedReactContext reactContext, ReactVirtualViewExperimental view) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(view, "view");
        view.recycleView$ReactAndroid_release();
        return (ReactVirtualViewExperimental) super.prepareToRecycleView(reactContext, view);
    }

    @Override // com.facebook.react.viewmanagers.VirtualViewExperimentalManagerInterface
    @ReactProp(name = "initialHidden")
    public void setInitialHidden(ReactVirtualViewExperimental view, boolean value) {
        AbstractC2855l.g(view, "view");
        if (view.getMode() == null) {
            view.setMode$ReactAndroid_release(value ? VirtualViewMode.Hidden : VirtualViewMode.Visible);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(ReactVirtualViewExperimental view, String nativeId) {
        AbstractC2855l.g(view, "view");
        super.setNativeId(view, nativeId);
    }

    @Override // com.facebook.react.viewmanagers.VirtualViewExperimentalManagerInterface
    @ReactProp(name = "renderState")
    public void setRenderState(ReactVirtualViewExperimental view, int value) {
        AbstractC2855l.g(view, "view");
        if (ReactNativeFeatureFlags.enableVirtualViewRenderState()) {
            view.setRenderState$ReactAndroid_release(value != 1 ? value != 2 ? VirtualViewRenderState.Unknown : VirtualViewRenderState.None : VirtualViewRenderState.Rendered);
        }
    }
}
