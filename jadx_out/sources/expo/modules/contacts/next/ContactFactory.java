package expo.modules.contacts.next;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.contacts.next.mappers.ContactRecordDomainMapper;
import expo.modules.contacts.next.mappers.domain.data.PhotoPropertyMapper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lexpo/modules/contacts/next/ContactFactory;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contactRepository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "contactMapper", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "photoPropertyMapper", "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "contactIntentDelegate", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "<init>", "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;)V", "getContactRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "getContactMapper", "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "getPhotoPropertyMapper", "()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "getContactIntentDelegate", "()Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "create", "Lexpo/modules/contacts/next/Contact;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "create-kDnipiQ", "(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;", "contactIdString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactFactory {
    private final ContactIntentDelegate contactIntentDelegate;
    private final ContactRecordDomainMapper contactMapper;
    private final ContactRepository contactRepository;
    private final PhotoPropertyMapper photoPropertyMapper;

    public ContactFactory(ContactRepository contactRepository, ContactRecordDomainMapper contactMapper, PhotoPropertyMapper photoPropertyMapper, ContactIntentDelegate contactIntentDelegate) {
        AbstractC2855l.g(contactRepository, "contactRepository");
        AbstractC2855l.g(contactMapper, "contactMapper");
        AbstractC2855l.g(photoPropertyMapper, "photoPropertyMapper");
        AbstractC2855l.g(contactIntentDelegate, "contactIntentDelegate");
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
        this.photoPropertyMapper = photoPropertyMapper;
        this.contactIntentDelegate = contactIntentDelegate;
    }

    public final Contact create(String contactIdString) {
        AbstractC2855l.g(contactIdString, "contactIdString");
        return m35createkDnipiQ(ContactId.m130constructorimpl(contactIdString));
    }

    /* JADX INFO: renamed from: create-kDnipiQ, reason: not valid java name */
    public final Contact m35createkDnipiQ(String contactId) {
        AbstractC2855l.g(contactId, "contactId");
        return new Contact(contactId, this.contactRepository, this.contactMapper, this.photoPropertyMapper, this.contactIntentDelegate, null);
    }

    public final ContactIntentDelegate getContactIntentDelegate() {
        return this.contactIntentDelegate;
    }

    public final ContactRecordDomainMapper getContactMapper() {
        return this.contactMapper;
    }

    public final ContactRepository getContactRepository() {
        return this.contactRepository;
    }

    public final PhotoPropertyMapper getPhotoPropertyMapper() {
        return this.photoPropertyMapper;
    }
}
