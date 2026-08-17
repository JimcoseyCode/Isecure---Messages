package expo.modules.contacts.next.mappers.domain.contacts;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.headers.starred.ExistingStarred;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;", "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "toDto", "model", "toDto-RmBWN14", "(I)Ljava/lang/Boolean;", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "newValue", "toUpdatable-D2TBaGg", "(Ljava/lang/String;Z)Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StarredMapper implements MutableContactsPropertyMapper<Starred, Boolean> {
    public static final StarredMapper INSTANCE = new StarredMapper();

    private StarredMapper() {
    }

    @Override // expo.modules.contacts.next.mappers.domain.contacts.ContactsPropertyMapper
    public /* bridge */ /* synthetic */ Object toDto(Extractable extractable) {
        return m172toDtoRmBWN14(((Starred) extractable).m107unboximpl());
    }

    /* JADX INFO: renamed from: toDto-RmBWN14, reason: not valid java name */
    public Boolean m172toDtoRmBWN14(int model) {
        return Boolean.valueOf(model == 1);
    }

    @Override // expo.modules.contacts.next.mappers.domain.contacts.MutableContactsPropertyMapper
    /* JADX INFO: renamed from: toUpdatable-D2TBaGg */
    public /* bridge */ /* synthetic */ Updatable.Contacts mo169toUpdatableD2TBaGg(String str, Boolean bool) {
        return m173toUpdatableD2TBaGg(str, bool.booleanValue());
    }

    /* JADX INFO: renamed from: toUpdatable-D2TBaGg, reason: not valid java name */
    public ExistingStarred m173toUpdatableD2TBaGg(String contactId, boolean newValue) {
        AbstractC2855l.g(contactId, "contactId");
        return new ExistingStarred(contactId, newValue, null);
    }
}
