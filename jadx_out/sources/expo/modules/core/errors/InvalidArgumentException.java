package expo.modules.core.errors;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class InvalidArgumentException extends CodedRuntimeException {
    public InvalidArgumentException(String str) {
        super(str);
    }

    @Override // expo.modules.core.errors.CodedRuntimeException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "ERR_INVALID_ARGUMENT";
    }

    public InvalidArgumentException(Throwable th) {
        super(th);
    }

    public InvalidArgumentException(String str, Throwable th) {
        super(str, th);
    }
}
