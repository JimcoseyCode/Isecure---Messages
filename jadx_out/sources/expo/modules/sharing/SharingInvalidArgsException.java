package expo.modules.sharing;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/sharing/SharingInvalidArgsException;", "Lexpo/modules/kotlin/exception/CodedException;", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharingInvalidArgsException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingInvalidArgsException(String str, Exception e10) {
        super(str, e10.getCause());
        AbstractC2855l.g(e10, "e");
    }
}
