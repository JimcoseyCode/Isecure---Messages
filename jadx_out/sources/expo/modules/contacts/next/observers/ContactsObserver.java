package expo.modules.contacts.next.observers;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.ContactsNextModule;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.modules.Module;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.t;
import j7.K;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u00020\f*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/observers/ContactsObserver;", "Landroid/database/ContentObserver;", "Lexpo/modules/contacts/next/ContactsNextModule;", "module", "Landroid/os/Handler;", "handler", "<init>", "(Lexpo/modules/contacts/next/ContactsNextModule;Landroid/os/Handler;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selfChange", "Landroid/net/Uri;", "uri", "Li7/B;", "onChange", "(ZLandroid/net/Uri;)V", "Lexpo/modules/kotlin/modules/Module;", "handleContactChange", "(Lexpo/modules/kotlin/modules/Module;)V", "Ljava/lang/ref/WeakReference;", "moduleRef", "Ljava/lang/ref/WeakReference;", "getModuleRef", "()Ljava/lang/ref/WeakReference;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactsObserver extends ContentObserver {
    private final WeakReference<ContactsNextModule> moduleRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsObserver(ContactsNextModule module, Handler handler) {
        super(handler);
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(handler, "handler");
        this.moduleRef = UtilsKt.weak(module);
    }

    public final WeakReference<ContactsNextModule> getModuleRef() {
        return this.moduleRef;
    }

    public final void handleContactChange(Module module) {
        AbstractC2855l.g(module, "<this>");
        module.sendEvent("onContactsChange", K.f(t.a(ExpoNotificationBuilder.EXTRAS_BODY_KEY, null)));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
        ContactsNextModule contactsNextModule = this.moduleRef.get();
        if (contactsNextModule != null) {
            handleContactChange(contactsNextModule);
        }
    }
}
