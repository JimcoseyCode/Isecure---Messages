package expo.modules.contacts.next.extensions;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1 extends AbstractC2853j implements Function2 {
    public static final ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1 INSTANCE = new ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1();

    ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1() {
        super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Cursor) obj, ((Number) obj2).intValue());
    }

    public final String invoke(Cursor p02, int i10) {
        AbstractC2855l.g(p02, "p0");
        return p02.getString(i10);
    }
}
