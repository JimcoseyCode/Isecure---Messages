package expo.modules.contacts.next.domain.model.relationship;

import android.content.ContentValues;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationModel;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "label", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;)V", "getName", "()Ljava/lang/String;", "getLabel", "()Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "mimeType", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RelationModel {
    private final ContentValues contentValues;
    private final RelationLabel label;
    private final String mimeType;
    private final String name;

    public RelationModel(String str, RelationLabel label) {
        AbstractC2855l.g(label, "label");
        this.name = str;
        this.label = label;
        this.mimeType = "vnd.android.cursor.item/relation";
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/relation");
        contentValues.put(Columns.DATA, str);
        contentValues.put(Columns.TYPE, Integer.valueOf(label.getType()));
        contentValues.put(Columns.LABEL, label.getLabel());
        this.contentValues = contentValues;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }

    public final RelationLabel getLabel() {
        return this.label;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }
}
