package com.horcrux.svg;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSVGRenderableModule";

    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract WritableMap getBBox(Double d10, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract WritableMap getCTM(Double d10);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract WritableMap getPointAtLength(Double d10, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC3112a
    public abstract void getRawResource(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract WritableMap getScreenCTM(Double d10);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract double getTotalLength(Double d10);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract boolean isPointInFill(Double d10, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC3112a
    public abstract boolean isPointInStroke(Double d10, ReadableMap readableMap);
}
