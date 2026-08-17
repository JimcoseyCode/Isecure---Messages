package com.restartnewarch;

import G6.a;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class RestartModule extends NativeRestartSpec {
    private final ReactApplicationContext reactContext;

    public RestartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.restartnewarch.NativeRestartSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeRestartSpec.NAME;
    }

    @Override // com.restartnewarch.NativeRestartSpec
    public void restart() {
        a.a(this.reactContext);
    }
}
