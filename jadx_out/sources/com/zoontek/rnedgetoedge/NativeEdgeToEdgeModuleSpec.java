package com.zoontek.rnedgetoedge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeEdgeToEdgeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNEdgeToEdge";

    public NativeEdgeToEdgeModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC3112a
    public abstract void onColorSchemeChange();

    @ReactMethod
    @InterfaceC3112a
    public abstract void setNavigationBarHidden(boolean z10);

    @ReactMethod
    @InterfaceC3112a
    public abstract void setNavigationBarStyle(String str);

    @ReactMethod
    @InterfaceC3112a
    public abstract void setStatusBarHidden(boolean z10);

    @ReactMethod
    @InterfaceC3112a
    public abstract void setStatusBarStyle(String str);
}
