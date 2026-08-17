package expo.modules.notifications;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/notifications/NotificationWasAlreadyHandledException;", "Lexpo/modules/kotlin/exception/CodedException;", "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationWasAlreadyHandledException extends CodedException {
    private final String id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWasAlreadyHandledException(String id) {
        super("Failed to handle notification " + id + ", it has already been handled.", null, 2, null);
        AbstractC2855l.g(id, "id");
        this.id = id;
    }

    public final String getId() {
        return this.id;
    }
}
