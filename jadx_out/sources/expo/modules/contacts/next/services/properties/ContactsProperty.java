package expo.modules.contacts.next.services.properties;

import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.mappers.domain.contacts.ContactsPropertyMapper;
import i7.AbstractC2753p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0001H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "Lexpo/modules/contacts/next/domain/model/Extractable;", "TDomain", "TDto", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "field", "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "readMapper", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", "Lexpo/modules/contacts/next/domain/ContactRepository;", "repository", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "get", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "getField", "()Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "getReadMapper", "()Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "Ljava/lang/String;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Lexpo/modules/contacts/next/domain/ContactRepository;", "getRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ContactsProperty<TDomain extends Extractable, TDto> {
    private final String contactId;
    private final ExtractableField.Contacts<TDomain> field;
    private final ContactsPropertyMapper<TDomain, TDto> readMapper;
    private final ContactRepository repository;

    /* JADX INFO: renamed from: expo.modules.contacts.next.services.properties.ContactsProperty$get$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.services.properties.ContactsProperty", f = "ContactsProperty.kt", l = {16}, m = "get")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ContactsProperty<TDomain, TDto> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContactsProperty<TDomain, TDto> contactsProperty, n7.f fVar) {
            super(fVar);
            this.this$0 = contactsProperty;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return this.this$0.get(this);
        }
    }

    public /* synthetic */ ContactsProperty(ExtractableField.Contacts contacts, ContactsPropertyMapper contactsPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(contacts, contactsPropertyMapper, str, contactRepository);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(this, fVar);
            }
        }
        Object objM45getFieldFromContactsm7AL99Q = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM45getFieldFromContactsm7AL99Q);
            ContactRepository contactRepository = this.repository;
            ExtractableField.Contacts<TDomain> contacts = this.field;
            String str = this.contactId;
            anonymousClass1.label = 1;
            objM45getFieldFromContactsm7AL99Q = contactRepository.m45getFieldFromContactsm7AL99Q(contacts, str, anonymousClass1);
            if (objM45getFieldFromContactsm7AL99Q == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objM45getFieldFromContactsm7AL99Q);
        }
        Extractable extractable = (Extractable) objM45getFieldFromContactsm7AL99Q;
        if (extractable == null) {
            return null;
        }
        return this.readMapper.toDto(extractable);
    }

    /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    protected final String getContactId() {
        return this.contactId;
    }

    protected final ExtractableField.Contacts<TDomain> getField() {
        return this.field;
    }

    protected final ContactsPropertyMapper<TDomain, TDto> getReadMapper() {
        return this.readMapper;
    }

    protected final ContactRepository getRepository() {
        return this.repository;
    }

    private ContactsProperty(ExtractableField.Contacts<TDomain> field, ContactsPropertyMapper<TDomain, TDto> readMapper, String contactId, ContactRepository repository) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(readMapper, "readMapper");
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(repository, "repository");
        this.field = field;
        this.readMapper = readMapper;
        this.contactId = contactId;
        this.repository = repository;
    }
}
