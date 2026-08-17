package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/models/DateModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", "contentType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "mapStringToType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "label", "getLabelFromCursor", "cursor", "Landroid/database/Cursor;", "getInsertOperation", "Landroid/content/ContentProviderOperation;", "rawId", "formatDateString", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DateModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/contact_event";
    private final String dataAlias = "date";

    private final String formatDateString() {
        String data = getData();
        if (data != null) {
            return data;
        }
        Integer numValueOf = Integer.valueOf((int) getMap().getDouble("year", -1.0d));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        Integer numValueOf2 = Integer.valueOf((int) getMap().getDouble("month", -1.0d));
        if (numValueOf2.intValue() < 0) {
            numValueOf2 = null;
        }
        Integer numValueOf3 = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() + 1) : null;
        Integer numValueOf4 = Integer.valueOf((int) getMap().getDouble("day", -1.0d));
        if (numValueOf4.intValue() <= 0) {
            numValueOf4 = null;
        }
        if (numValueOf != null && numValueOf3 != null && numValueOf4 != null) {
            H h10 = H.f29375a;
            String str = String.format(Locale.US, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{numValueOf, numValueOf3, numValueOf4}, 3));
            AbstractC2855l.f(str, "format(...)");
            return str;
        }
        if (numValueOf3 == null || numValueOf4 == null) {
            return null;
        }
        H h11 = H.f29375a;
        String str2 = String.format(Locale.US, "--%02d-%02d", Arrays.copyOf(new Object[]{numValueOf3, numValueOf4}, 2));
        AbstractC2855l.f(str2, "format(...)");
        return str2;
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentProviderOperation getInsertOperation(String rawId) {
        ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        AbstractC2855l.f(builderNewInsert, "newInsert(...)");
        if (rawId == null) {
            builderNewInsert.withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0);
        } else {
            builderNewInsert.withValue(RawContactId.COLUMN_IN_DATA_TABLE, rawId);
        }
        ContentProviderOperation contentProviderOperationBuild = builderNewInsert.withValue(Columns.MIMETYPE, getContentType()).withValue(Columns.TYPE, Integer.valueOf(mapStringToType(getLabel()))).withValue(Columns.DATA, formatDateString()).withValue(Columns.LABEL, getLabel()).build();
        AbstractC2855l.f(contentProviderOperationBuild, "build(...)");
        return contentProviderOperationBuild;
    }

    @Override // expo.modules.contacts.models.BaseModel
    protected String getLabelFromCursor(Cursor cursor) {
        AbstractC2855l.g(cursor, "cursor");
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE));
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : DateModelKt.BIRTHDAY : "other" : "anniversary";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String label) {
        if (label == null) {
            return 0;
        }
        int iHashCode = label.hashCode();
        return iHashCode != -940675184 ? iHashCode != 106069776 ? (iHashCode == 1069376125 && label.equals(DateModelKt.BIRTHDAY)) ? 3 : 0 : !label.equals("other") ? 0 : 2 : label.equals("anniversary") ? 1 : 0;
    }
}
