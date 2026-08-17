package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC3112a
    public abstract void attachGestureHandler(double d10, double d11, double d12);

    @ReactMethod
    @InterfaceC3112a
    public abstract void createGestureHandler(String str, double d10, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC3112a
    public abstract void dropGestureHandler(double d10);

    @ReactMethod
    @InterfaceC3112a
    public abstract void flushOperations();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @ReactMethod
    @InterfaceC3112a
    public abstract void handleClearJSResponder();

    @ReactMethod
    @InterfaceC3112a
    public abstract void handleSetJSResponder(double d10, boolean z10);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract boolean install();

    @ReactMethod
    @InterfaceC3112a
    public abstract void updateGestureHandler(double d10, ReadableMap readableMap);
}
