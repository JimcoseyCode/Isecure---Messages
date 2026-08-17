package expo.modules.contacts.next.domain.model.photo.operations;

import android.content.ContentProviderOperation;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.photo.PhotoModel;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/contacts/next/domain/model/photo/operations/NewPhoto;", "Lexpo/modules/contacts/next/domain/model/photo/PhotoModel;", "Lexpo/modules/contacts/next/domain/model/Insertable;", "photo", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "([B)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewPhoto extends PhotoModel implements Insertable {
    public NewPhoto(byte[] bArr) {
        super(bArr);
    }

    @Override // expo.modules.contacts.next.domain.model.Insertable
    public ContentProviderOperation toInsertOperation() {
        return Insertable.DefaultImpls.toInsertOperation(this);
    }
}
