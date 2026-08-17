package expo.modules.contacts.next.domain.wrappers;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.UnableToExtractIdFromUriException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RawContactId {
    public static final String COLUMN_IN_DATA_TABLE = "raw_contact_id";
    public static final String COLUMN_IN_RAW_CONTACTS_TABLE = "_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/contacts/next/domain/wrappers/RawContactId$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "from", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "rawContactUri", "Landroid/net/Uri;", "from-49EgYC0", "(Landroid/net/Uri;)Ljava/lang/String;", "COLUMN_IN_RAW_CONTACTS_TABLE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "COLUMN_IN_DATA_TABLE", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: from-49EgYC0, reason: not valid java name */
        public final String m150from49EgYC0(Uri rawContactUri) throws UnableToExtractIdFromUriException {
            AbstractC2855l.g(rawContactUri, "rawContactUri");
            String lastPathSegment = rawContactUri.getLastPathSegment();
            if (lastPathSegment != null) {
                return RawContactId.m144constructorimpl(lastPathSegment);
            }
            throw new UnableToExtractIdFromUriException(rawContactUri, null, 2, null);
        }

        private Companion() {
        }
    }

    private /* synthetic */ RawContactId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RawContactId m143boximpl(String str) {
        return new RawContactId(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m144constructorimpl(String value) {
        AbstractC2855l.g(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m145equalsimpl(String str, Object obj) {
        return (obj instanceof RawContactId) && AbstractC2855l.b(str, ((RawContactId) obj).m149unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m146equalsimpl0(String str, String str2) {
        return AbstractC2855l.b(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m147hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m148toStringimpl(String str) {
        return "RawContactId(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m145equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m147hashCodeimpl(this.value);
    }

    public String toString() {
        return m148toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m149unboximpl() {
        return this.value;
    }
}
