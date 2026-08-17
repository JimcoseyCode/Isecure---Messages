package expo.modules.contacts.next.mappers.domain.contacts;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoUriMapper;", "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "toDto", "model", "toDto-wu4axjM", "(Ljava/lang/String;)Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhotoUriMapper implements ContactsPropertyMapper<PhotoUri, String> {
    public static final PhotoUriMapper INSTANCE = new PhotoUriMapper();

    private PhotoUriMapper() {
    }

    @Override // expo.modules.contacts.next.mappers.domain.contacts.ContactsPropertyMapper
    public /* bridge */ /* synthetic */ String toDto(Extractable extractable) {
        return m171toDtowu4axjM(((PhotoUri) extractable).m99unboximpl());
    }

    /* JADX INFO: renamed from: toDto-wu4axjM, reason: not valid java name */
    public String m171toDtowu4axjM(String model) {
        return model;
    }
}
