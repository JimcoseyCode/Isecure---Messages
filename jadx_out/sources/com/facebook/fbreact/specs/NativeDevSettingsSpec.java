package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevSettings";
    }

    @ReactMethod
    public abstract void reload();

    @ReactMethod
    public abstract void removeListeners(double d10);

    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z10);

    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z10);

    @ReactMethod
    public abstract void setProfilingEnabled(boolean z10);

    @ReactMethod
    public abstract void toggleElementInspector();

    @ReactMethod
    public void onFastRefresh() {
    }

    @ReactMethod
    public void openDebugger() {
    }

    @ReactMethod
    public void reloadWithReason(String str) {
    }
}
