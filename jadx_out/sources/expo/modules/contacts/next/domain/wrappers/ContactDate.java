package expo.modules.contacts.next.domain.wrappers;

import P8.o;
import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Lexpo/modules/contacts/next/domain/wrappers/ContactDate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "year", "getYear-impl", "month", "getMonth-impl", "day", "getDay-impl", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactDate {
    private final String value;

    private /* synthetic */ ContactDate(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContactDate m119boximpl(String str) {
        return new ContactDate(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m120constructorimpl(String value) {
        AbstractC2855l.g(value, "value");
        if (new o("(--\\d{2}-\\d{2})|(\\d{4}-\\d{2}-\\d{2})").d(value)) {
            return value;
        }
        throw new IllegalArgumentException(("Invalid date format. Expected '--MM-DD' or 'YYYY-MM-DD', but was '" + value + "'").toString());
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m121equalsimpl(String str, Object obj) {
        return (obj instanceof ContactDate) && AbstractC2855l.b(str, ((ContactDate) obj).m128unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m122equalsimpl0(String str, String str2) {
        return AbstractC2855l.b(str, str2);
    }

    /* JADX INFO: renamed from: getDay-impl, reason: not valid java name */
    public static final String m123getDayimpl(String str) {
        if (q.K(str, "--", false, 2, null)) {
            String strSubstring = str.substring(5, 7);
            AbstractC2855l.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = str.substring(8, 10);
        AbstractC2855l.f(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: renamed from: getMonth-impl, reason: not valid java name */
    public static final String m124getMonthimpl(String str) {
        if (q.K(str, "--", false, 2, null)) {
            String strSubstring = str.substring(2, 4);
            AbstractC2855l.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = str.substring(5, 7);
        AbstractC2855l.f(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: renamed from: getYear-impl, reason: not valid java name */
    public static final String m125getYearimpl(String str) {
        if (q.K(str, "--", false, 2, null)) {
            return null;
        }
        String strSubstring = str.substring(0, 4);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m126hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m127toStringimpl(String str) {
        return "ContactDate(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m121equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m126hashCodeimpl(this.value);
    }

    public String toString() {
        return m127toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m128unboximpl() {
        return this.value;
    }
}
