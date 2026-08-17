package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeAsyncStorageModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCAsyncStorage";

    public NativeAsyncStorageModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC3112a
    public abstract void clear(Callback callback);

    @ReactMethod
    @InterfaceC3112a
    public abstract void getAllKeys(Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @ReactMethod
    @InterfaceC3112a
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC3112a
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC3112a
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC3112a
    public abstract void multiSet(ReadableArray readableArray, Callback callback);
}
