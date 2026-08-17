package com.reactnativequickbase64;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class QuickBase64Module extends ReactContextBaseJavaModule {
    public static final String NAME = "QuickBase64";

    public QuickBase64Module(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static native void initialize(long j10, String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        try {
            System.loadLibrary("quickbase64");
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            initialize(reactApplicationContext.getJavaScriptContextHolder().getContext(), reactApplicationContext.getFilesDir().getAbsolutePath());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
