package expo.modules.core.logging;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"localizedMessageWithCauseLocalizedMessage", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LoggerUtilsKt {
    public static final String localizedMessageWithCauseLocalizedMessage(Throwable th) {
        AbstractC2855l.g(th, "<this>");
        String localizedMessage = th.getLocalizedMessage();
        Throwable cause = th.getCause();
        return AbstractC2800q.o0(AbstractC2800q.o(localizedMessage, cause != null ? localizedMessageWithCauseLocalizedMessage(cause) : null), ": ", null, null, 0, null, null, 62, null);
    }
}
