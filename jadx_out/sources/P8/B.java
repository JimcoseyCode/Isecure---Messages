package P8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2787d;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.H;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends A {
    public static String A(CharSequence charSequence, int i10) {
        AbstractC2855l.g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        AbstractC2855l.d(string);
        return string;
    }

    public static final String B(String str, char c10, char c11, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            AbstractC2855l.f(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC1384c.d(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final String C(String str, String oldValue, String newValue, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(oldValue, "oldValue");
        AbstractC2855l.g(newValue, "newValue");
        int i10 = 0;
        int iZ = E.Z(str, oldValue, 0, z10);
        if (iZ < 0) {
            return str;
        }
        int length = oldValue.length();
        int iD = B7.d.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i10, iZ);
            sb.append(newValue);
            i10 = iZ + length;
            if (iZ >= str.length()) {
                break;
            }
            iZ = E.Z(str, oldValue, iZ + iD, z10);
        } while (iZ > 0);
        sb.append((CharSequence) str, i10, str.length());
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String D(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return B(str, c10, c11, z10);
    }

    public static /* synthetic */ String E(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return C(str, str2, str3, z10);
    }

    public static final String F(String str, String oldValue, String newValue, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(oldValue, "oldValue");
        AbstractC2855l.g(newValue, "newValue");
        int iD0 = E.d0(str, oldValue, 0, z10, 2, null);
        return iD0 < 0 ? str : E.A0(str, iD0, oldValue.length() + iD0, newValue).toString();
    }

    public static /* synthetic */ String G(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return F(str, str2, str3, z10);
    }

    public static boolean H(String str, String prefix, int i10, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : z(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean I(String str, String prefix, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : z(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean J(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return H(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean K(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I(str, str2, z10);
    }

    public static int r(String str, String other, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(other, "other");
        return z10 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static String s(char[] cArr) {
        AbstractC2855l.g(cArr, "<this>");
        return new String(cArr);
    }

    public static String t(char[] cArr, int i10, int i11) {
        AbstractC2855l.g(cArr, "<this>");
        AbstractC2787d.f28912g.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static byte[] u(String str) {
        AbstractC2855l.g(str, "<this>");
        byte[] bytes = str.getBytes(C1385d.f8858b);
        AbstractC2855l.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean v(String str, String suffix, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : z(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean w(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(str, str2, z10);
    }

    public static boolean x(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator y(H h10) {
        AbstractC2855l.g(h10, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC2855l.f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static final boolean z(String str, int i10, String other, int i11, int i12, boolean z10) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }
}
