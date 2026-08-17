package com.zoontek.rnedgetoedge;

import Z6.f;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = NativeEdgeToEdgeModuleSpec.NAME)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/zoontek/rnedgetoedge/EdgeToEdgeModule;", "Lcom/zoontek/rnedgetoedge/NativeEdgeToEdgeModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Li7/B;", "invalidate", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "onHostResume", "onHostPause", "onHostDestroy", "onColorSchemeChange", "style", "setStatusBarStyle", "(Ljava/lang/String;)V", "setNavigationBarStyle", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.HIDDEN, "setStatusBarHidden", "(Z)V", "setNavigationBarHidden", "react-native-edge-to-edge_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EdgeToEdgeModule extends NativeEdgeToEdgeModuleSpec implements LifecycleEventListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeToEdgeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.zoontek.rnedgetoedge.NativeEdgeToEdgeModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeEdgeToEdgeModuleSpec.NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.zoontek.rnedgetoedge.NativeEdgeToEdgeModuleSpec
    public void onColorSchemeChange() {
        f.f13617a.f(getReactApplicationContext());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        f.f13617a.f(getReactApplicationContext());
    }

    @Override // com.zoontek.rnedgetoedge.NativeEdgeToEdgeModuleSpec
    public void setNavigationBarHidden(boolean hidden) {
        f.f13617a.l(getReactApplicationContext(), hidden);
    }

    @Override // com.zoontek.rnedgetoedge.NativeEdgeToEdgeModuleSpec
    public void setNavigationBarStyle(String style) {
        AbstractC2855l.g(style, "style");
        f.f13617a.n(getReactApplicationContext(), style);
    }

    @Override // com.zoontek.rnedgetoedge.NativeEdgeToEdgeModuleSpec
    public void setStatusBarHidden(boolean hidden) {
        f.f13617a.p(getReactApplicationContext(), hidden);
    }

    @Override // com.zoontek.rnedgetoedge.NativeEdgeToEdgeModuleSpec
    public void setStatusBarStyle(String style) {
        AbstractC2855l.g(style, "style");
        f.f13617a.r(getReactApplicationContext(), style);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }
}
