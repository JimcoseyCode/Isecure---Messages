package expo.modules.kotlin.exception;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0086\b\u001a\u0015\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0001H\u0086\b¨\u0006\u0006"}, d2 = {"toCodedException", "Lexpo/modules/kotlin/exception/CodedException;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "errorCodeOf", PointerEventHelper.POINTER_TYPE_UNKNOWN, "T", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CodedExceptionKt {
    public static final /* synthetic */ <T extends CodedException> String errorCodeOf() {
        CodedException.Companion companion = CodedException.INSTANCE;
        AbstractC2855l.m(4, "T");
        return companion.inferCode(CodedException.class);
    }

    public static final CodedException toCodedException(Throwable th) {
        if (th == null) {
            return new UnexpectedException("Unknown error");
        }
        if (th instanceof CodedException) {
            return (CodedException) th;
        }
        if (!(th instanceof expo.modules.core.errors.CodedException)) {
            return new UnexpectedException(th);
        }
        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
        String code = codedException.getCode();
        AbstractC2855l.f(code, "getCode(...)");
        return new CodedException(code, codedException.getMessage(), codedException.getCause());
    }
}
