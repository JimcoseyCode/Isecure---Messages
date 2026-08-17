package expo.modules.contacts.next.services.properties;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.mappers.domain.contacts.MutableContactsPropertyMapper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", "Lexpo/modules/contacts/next/domain/model/Extractable;", "TDomain", "TDto", "Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "field", "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;", "mapper", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", "Lexpo/modules/contacts/next/domain/ContactRepository;", "repository", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "set", "(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MutableContactsProperty<TDomain extends Extractable, TDto> extends ContactsProperty<TDomain, TDto> {
    private final MutableContactsPropertyMapper<TDomain, TDto> mapper;

    public /* synthetic */ MutableContactsProperty(ExtractableField.Contacts contacts, MutableContactsPropertyMapper mutableContactsPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(contacts, mutableContactsPropertyMapper, str, contactRepository);
    }

    public final Object set(TDto tdto, f fVar) {
        return getRepository().update(this.mapper.mo169toUpdatableD2TBaGg(getContactId(), tdto), fVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MutableContactsProperty(ExtractableField.Contacts<TDomain> field, MutableContactsPropertyMapper<TDomain, TDto> mapper, String contactId, ContactRepository repository) {
        super(field, mapper, contactId, repository, null);
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(mapper, "mapper");
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(repository, "repository");
        this.mapper = mapper;
    }
}
