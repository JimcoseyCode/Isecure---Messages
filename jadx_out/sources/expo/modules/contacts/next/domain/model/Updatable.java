package expo.modules.contacts.next.domain.model;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tJ\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Updatable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "toUpdateOperation", "Landroid/content/ContentProviderOperation;", "Contacts", "Data", "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Updatable {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "Lexpo/modules/contacts/next/domain/model/Updatable;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "toUpdateOperation", "Landroid/content/ContentProviderOperation;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Contacts extends Updatable {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static ContentProviderOperation toUpdateOperation(Contacts contacts) {
                ContentProviderOperation.Builder builderNewUpdate = ContentProviderOperation.newUpdate(ContactsContract.Contacts.CONTENT_URI);
                builderNewUpdate.withSelection("_id=?", new String[]{contacts.mo54getContactIdS9XCBSM()});
                builderNewUpdate.withValues(contacts.getContentValues());
                ContentProviderOperation contentProviderOperationBuild = builderNewUpdate.build();
                AbstractC2855l.f(contentProviderOperationBuild, "with(...)");
                return contentProviderOperationBuild;
            }
        }

        /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: not valid java name */
        String mo54getContactIdS9XCBSM();

        @Override // expo.modules.contacts.next.domain.model.Updatable
        ContentProviderOperation toUpdateOperation();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005¨\u0006\u000b"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "Lexpo/modules/contacts/next/domain/model/Updatable;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "getDataId-sXKVoX8", "()Ljava/lang/String;", "mimeType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMimeType", "toUpdateOperation", "Landroid/content/ContentProviderOperation;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Data extends Updatable {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static ContentProviderOperation toUpdateOperation(Data data) {
                ContentProviderOperation.Builder builderNewUpdate = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
                builderNewUpdate.withSelection("_id = ? AND mimetype = ?", new String[]{data.mo53getDataIdsXKVoX8(), data.getMimeType()});
                builderNewUpdate.withValues(data.getContentValues());
                ContentProviderOperation contentProviderOperationBuild = builderNewUpdate.build();
                AbstractC2855l.f(contentProviderOperationBuild, "with(...)");
                return contentProviderOperationBuild;
            }
        }

        /* JADX INFO: renamed from: getDataId-sXKVoX8 */
        String mo53getDataIdsXKVoX8();

        String getMimeType();

        @Override // expo.modules.contacts.next.domain.model.Updatable
        ContentProviderOperation toUpdateOperation();
    }

    ContentValues getContentValues();

    ContentProviderOperation toUpdateOperation();
}
