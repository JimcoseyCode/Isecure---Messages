package expo.modules.kotlin;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.jni.PromiseImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"unknownCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toBridgePromise", "Lcom/facebook/react/bridge/Promise;", "Lexpo/modules/kotlin/Promise;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PromiseKt {
    private static final String unknownCode = "UnknownCode";

    public static final com.facebook.react.bridge.Promise toBridgePromise(final Promise promise) {
        AbstractC2855l.g(promise, "<this>");
        final Function1 promiseKt$toBridgePromise$resolveMethod$1 = promise instanceof PromiseImpl ? new PromiseKt$toBridgePromise$resolveMethod$1(((PromiseImpl) promise).getCallback()) : new PromiseKt$toBridgePromise$resolveMethod$2(promise);
        return new com.facebook.react.bridge.Promise() { // from class: expo.modules.kotlin.PromiseKt.toBridgePromise.1
            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message) {
                AbstractC2855l.g(code, "code");
                promise.reject(code, message, null);
            }

            @Override // com.facebook.react.bridge.Promise
            public void resolve(Object value) {
                promiseKt$toBridgePromise$resolveMethod$1.invoke(value);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, Throwable throwable) {
                AbstractC2855l.g(code, "code");
                promise.reject(code, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message, Throwable throwable) {
                AbstractC2855l.g(code, "code");
                promise.reject(code, message, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(Throwable throwable) {
                AbstractC2855l.g(throwable, "throwable");
                promise.reject(PromiseKt.unknownCode, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(Throwable throwable, WritableMap userInfo) {
                AbstractC2855l.g(throwable, "throwable");
                AbstractC2855l.g(userInfo, "userInfo");
                promise.reject(PromiseKt.unknownCode, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, WritableMap userInfo) {
                AbstractC2855l.g(code, "code");
                AbstractC2855l.g(userInfo, "userInfo");
                promise.reject(code, null, null);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, Throwable throwable, WritableMap userInfo) {
                AbstractC2855l.g(code, "code");
                AbstractC2855l.g(userInfo, "userInfo");
                promise.reject(code, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message, WritableMap userInfo) {
                AbstractC2855l.g(code, "code");
                AbstractC2855l.g(userInfo, "userInfo");
                promise.reject(code, message, null);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message, Throwable throwable, WritableMap userInfo) {
                Promise promise2 = promise;
                if (code == null) {
                    code = PromiseKt.unknownCode;
                }
                promise2.reject(code, message, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String message) {
                AbstractC2855l.g(message, "message");
                promise.reject(PromiseKt.unknownCode, message, null);
            }
        };
    }
}
