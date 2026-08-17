package expo.modules.contacts.next;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/ContactNotFoundException;", "Lexpo/modules/kotlin/exception/CodedException;", "cause", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/Throwable;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactNotFoundException extends CodedException {
    /* JADX WARN: Multi-variable type inference failed */
    public ContactNotFoundException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ContactNotFoundException(Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th);
    }

    public ContactNotFoundException(Throwable th) {
        super("Could not find the contact", th);
    }
}
