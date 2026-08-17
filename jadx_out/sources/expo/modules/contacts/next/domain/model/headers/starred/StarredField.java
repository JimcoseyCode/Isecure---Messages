package expo.modules.contacts.next.domain.model.headers.starred;

import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/next/domain/model/headers/starred/StarredField;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "<init>", "()V", "projection", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "extract", "cursor", "Landroid/database/Cursor;", "extract-349A5c0", "(Landroid/database/Cursor;)I", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StarredField implements ExtractableField.Contacts<Starred> {
    public static final StarredField INSTANCE = new StarredField();
    private static final String[] projection = {Columns.STARRED};

    private StarredField() {
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public /* bridge */ /* synthetic */ Extractable extract(Cursor cursor) {
        return Starred.m101boximpl(m108extract349A5c0(cursor));
    }

    /* JADX INFO: renamed from: extract-349A5c0, reason: not valid java name */
    public int m108extract349A5c0(Cursor cursor) {
        AbstractC2855l.g(cursor, "cursor");
        return Starred.m102constructorimpl(cursor.getInt(cursor.getColumnIndexOrThrow(Columns.STARRED)));
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public String[] getProjection() {
        return projection;
    }
}
