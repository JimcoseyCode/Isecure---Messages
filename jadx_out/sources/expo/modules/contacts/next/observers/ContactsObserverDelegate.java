package expo.modules.contacts.next.observers;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.ContactsNextModule;
import expo.modules.contacts.next.ContactsObserverException;
import expo.modules.contacts.next.ContentResolverNotObtainedException;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.UtilsKt;
import j7.AbstractC2800q;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/contacts/next/ContactsNextModule;", "module", "<init>", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/contacts/next/ContactsNextModule;)V", "Li7/B;", "startObservingContactChanges", "()V", "stopObservingContactChanges", "Landroid/os/HandlerThread;", "contactsHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "contactsHandler", "Landroid/os/Handler;", "Lexpo/modules/contacts/next/observers/ContactsObserver;", "observer", "Lexpo/modules/contacts/next/observers/ContactsObserver;", "Ljava/lang/ref/WeakReference;", "weakAppContextRef", "Ljava/lang/ref/WeakReference;", "weakModuleRef", "Landroid/content/ContentResolver;", "resolver", "Landroid/content/ContentResolver;", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactsObserverDelegate {
    public static final String ON_CONTACTS_CHANGE_EVENT_NAME = "onContactsChange";
    private Handler contactsHandler;
    private HandlerThread contactsHandlerThread;
    private ContactsObserver observer;
    private final ContentResolver resolver;
    private final WeakReference<AppContext> weakAppContextRef;
    private final WeakReference<ContactsNextModule> weakModuleRef;

    public ContactsObserverDelegate(AppContext appContext, ContactsNextModule module) throws ContentResolverNotObtainedException {
        Context reactContext;
        ContentResolver contentResolver;
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(module, "module");
        WeakReference<AppContext> weakReferenceWeak = UtilsKt.weak(appContext);
        this.weakAppContextRef = weakReferenceWeak;
        this.weakModuleRef = UtilsKt.weak(module);
        AppContext appContext2 = weakReferenceWeak.get();
        if (appContext2 == null || (reactContext = appContext2.getReactContext()) == null || (contentResolver = reactContext.getContentResolver()) == null) {
            throw new ContentResolverNotObtainedException(null, 1, null);
        }
        this.resolver = contentResolver;
    }

    public final void startObservingContactChanges() throws ContactsObserverException {
        if (this.observer != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ContactsObserverThread");
        handlerThread.start();
        if (!handlerThread.isAlive()) {
            throw new ContactsObserverException("The observer thread failed to start", null, 2, null);
        }
        this.contactsHandlerThread = handlerThread;
        this.contactsHandler = new Handler(handlerThread.getLooper());
        ContactsNextModule contactsNextModule = this.weakModuleRef.get();
        if (contactsNextModule == null) {
            throw new ContactsObserverException("The module has not been initialized", null, 2, null);
        }
        Handler handler = this.contactsHandler;
        if (handler == null) {
            throw new ContactsObserverException("Failed to get the thread handler", null, 2, null);
        }
        this.observer = new ContactsObserver(contactsNextModule, handler);
        for (Uri uri : AbstractC2800q.m(ContactsContract.Contacts.CONTENT_URI, ContactsContract.RawContacts.CONTENT_URI)) {
            ContentResolver contentResolver = this.resolver;
            ContactsObserver contactsObserver = this.observer;
            if (contactsObserver == null) {
                throw new ContactsObserverException("Failed to register content observer", null, 2, null);
            }
            contentResolver.registerContentObserver(uri, true, contactsObserver);
        }
    }

    public final void stopObservingContactChanges() {
        ContactsObserver contactsObserver = this.observer;
        if (contactsObserver != null) {
            this.resolver.unregisterContentObserver(contactsObserver);
            this.observer = null;
        }
        this.contactsHandler = null;
        HandlerThread handlerThread = this.contactsHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.contactsHandlerThread = null;
    }
}
