package expo.modules.core;

import expo.modules.core.interfaces.CodedThrowable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface Promise {
    public static final String UNKNOWN_ERROR = "E_UNKNOWN_ERROR";

    void reject(String str, String str2, Throwable th);

    /* JADX WARN: Multi-variable type inference failed */
    default void reject(Throwable th) {
        if (!(th instanceof CodedThrowable)) {
            reject(UNKNOWN_ERROR, th);
        } else {
            CodedThrowable codedThrowable = (CodedThrowable) th;
            reject(codedThrowable.getCode(), codedThrowable.getMessage(), th);
        }
    }

    void resolve(Object obj);

    default void reject(String str, String str2) {
        reject(str, str2, null);
    }

    default void reject(String str, Throwable th) {
        reject(str, th.getMessage(), th);
    }
}
