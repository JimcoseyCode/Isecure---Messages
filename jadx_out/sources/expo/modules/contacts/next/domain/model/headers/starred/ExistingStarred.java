package expo.modules.contacts.next.domain.model.headers.starred;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;", "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", Columns.STARRED, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExistingStarred implements Updatable.Contacts {
    private final String contactId;
    private final ContentValues contentValues;

    public /* synthetic */ ExistingStarred(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Contacts
    /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: from getter */
    public String getContactId() {
        return this.contactId;
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable
    public ContentValues getContentValues() {
        return this.contentValues;
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Contacts, expo.modules.contacts.next.domain.model.Updatable
    public ContentProviderOperation toUpdateOperation() {
        return Updatable.Contacts.DefaultImpls.toUpdateOperation(this);
    }

    private ExistingStarred(String contactId, boolean z10) {
        AbstractC2855l.g(contactId, "contactId");
        this.contactId = contactId;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.STARRED, Integer.valueOf(z10 ? 1 : 0));
        this.contentValues = contentValues;
    }
}
