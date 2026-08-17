package P8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E extends B {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements O8.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f8856a;

        public a(CharSequence charSequence) {
            this.f8856a = charSequence;
        }

        @Override // O8.i
        public Iterator iterator() {
            return new i(this.f8856a);
        }
    }

    public static final CharSequence A0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i10);
            AbstractC2855l.f(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i11, charSequence.length());
            AbstractC2855l.f(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static final void B0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List C0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return E0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableT = O8.l.t(r0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterableT, 10));
        Iterator it = iterableT.iterator();
        while (it.hasNext()) {
            arrayList.add(L0(charSequence, (B7.c) it.next()));
        }
        return arrayList;
    }

    public static final List D0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return E0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableT = O8.l.t(s0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterableT, 10));
        Iterator it = iterableT.iterator();
        while (it.hasNext()) {
            arrayList.add(L0(charSequence, (B7.c) it.next()));
        }
        return arrayList;
    }

    private static final List E0(CharSequence charSequence, String str, boolean z10, int i10) {
        B0(i10);
        int length = 0;
        int iZ = Z(charSequence, str, 0, z10);
        if (iZ == -1 || i10 == 1) {
            return AbstractC2800q.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? B7.d.h(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iZ).toString());
            length = str.length() + iZ;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iZ = Z(charSequence, str, length, z10);
        } while (iZ != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List F0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return C0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List G0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return D0(charSequence, strArr, z10, i10);
    }

    public static final boolean H0(CharSequence charSequence, char c10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC1384c.d(charSequence.charAt(0), c10, z10);
    }

    public static final boolean I0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? B.K((String) charSequence, (String) prefix, false, 2, null) : v0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean J0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean K0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I0(charSequence, charSequence2, z10);
    }

    public static final String L0(CharSequence charSequence, B7.c range) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(range, "range");
        return charSequence.subSequence(range.t().intValue(), range.s().intValue() + 1).toString();
    }

    public static final String M0(String str, char c10, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iC0 = c0(str, c10, 0, false, 6, null);
        if (iC0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iC0 + 1, str.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean N(CharSequence charSequence, char c10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        return c0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static final String N0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(delimiter, "delimiter");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iD0 = d0(str, delimiter, 0, false, 6, null);
        if (iD0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iD0 + delimiter.length(), str.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean O(CharSequence charSequence, CharSequence other, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(other, "other");
        return other instanceof String ? d0(charSequence, (String) other, 0, z10, 2, null) >= 0 : b0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static /* synthetic */ String O0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return M0(str, c10, str2);
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N(charSequence, c10, z10);
    }

    public static /* synthetic */ String P0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return N0(str, str2, str3);
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O(charSequence, charSequence2, z10);
    }

    public static String Q0(String str, char c10, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, c10, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iI0 + 1, str.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean R(CharSequence charSequence, char c10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC1384c.d(charSequence.charAt(X(charSequence)), c10, z10);
    }

    public static String R0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(delimiter, "delimiter");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = j0(str, delimiter, 0, false, 6, null);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iJ0 + delimiter.length(), str.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean S(CharSequence charSequence, CharSequence suffix, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? B.w((String) charSequence, (String) suffix, false, 2, null) : v0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static /* synthetic */ String S0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Q0(str, c10, str2);
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return R(charSequence, c10, z10);
    }

    public static /* synthetic */ String T0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return R0(str, str2, str3);
    }

    public static /* synthetic */ boolean U(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S(charSequence, charSequence2, z10);
    }

    public static final String U0(String str, char c10, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iC0 = c0(str, c10, 0, false, 6, null);
        if (iC0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iC0);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final Pair V(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) AbstractC2800q.B0(collection);
            int iD0 = !z11 ? d0(charSequence, str, i10, false, 4, null) : j0(charSequence, str, i10, false, 4, null);
            if (iD0 < 0) {
                return null;
            }
            return i7.t.a(Integer.valueOf(iD0), str);
        }
        CharSequence charSequence3 = charSequence;
        B7.a cVar = !z11 ? new B7.c(B7.d.d(i10, 0), charSequence3.length()) : B7.d.n(B7.d.h(i10, X(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iD = cVar.d();
            int iO = cVar.o();
            int iP = cVar.p();
            if ((iP > 0 && iD <= iO) || (iP < 0 && iO <= iD)) {
                int i11 = iD;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (B.z(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iO) {
                            break;
                        }
                        i11 += iP;
                        z10 = z12;
                    } else {
                        return i7.t.a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iD2 = cVar.d();
            int iO2 = cVar.o();
            int iP2 = cVar.p();
            if ((iP2 > 0 && iD2 <= iO2) || (iP2 < 0 && iO2 <= iD2)) {
                int i12 = iD2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (v0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iO2) {
                            break;
                        }
                        i12 += iP2;
                        charSequence3 = charSequence2;
                    } else {
                        return i7.t.a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final String V0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(delimiter, "delimiter");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iD0 = d0(str, delimiter, 0, false, 6, null);
        if (iD0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iD0);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static B7.c W(CharSequence charSequence) {
        AbstractC2855l.g(charSequence, "<this>");
        return new B7.c(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String W0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return U0(str, c10, str2);
    }

    public static int X(CharSequence charSequence) {
        AbstractC2855l.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String X0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return V0(str, str2, str3);
    }

    public static final int Y(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? e0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static String Y0(String str, char c10, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, c10, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iI0);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int Z(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? b0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static String Z0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(delimiter, "delimiter");
        AbstractC2855l.g(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = j0(str, delimiter, 0, false, 6, null);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iJ0);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final int a0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        B7.a cVar = !z11 ? new B7.c(B7.d.d(i10, 0), B7.d.h(i11, charSequence.length())) : B7.d.n(B7.d.h(i10, X(charSequence)), B7.d.d(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iD = cVar.d();
            int iO = cVar.o();
            int iP = cVar.p();
            if ((iP <= 0 || iD > iO) && (iP >= 0 || iO > iD)) {
                return -1;
            }
            int i12 = iD;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (B.z(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iO) {
                    return -1;
                }
                i12 += iP;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iD2 = cVar.d();
            int iO2 = cVar.o();
            int iP2 = cVar.p();
            if ((iP2 <= 0 || iD2 > iO2) && (iP2 >= 0 || iO2 > iD2)) {
                return -1;
            }
            int i13 = iD2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (v0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iO2) {
                    return -1;
                }
                i13 += iP2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static /* synthetic */ String a1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Y0(str, c10, str2);
    }

    static /* synthetic */ int b0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return a0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ String b1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Z0(str, str2, str3);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Y(charSequence, c10, i10, z10);
    }

    public static CharSequence c1(CharSequence charSequence) {
        AbstractC2855l.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = AbstractC1383b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int d0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Z(charSequence, str, i10, z10);
    }

    public static String d1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(chars, "chars");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                break;
            }
            if (!AbstractC2793j.z(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                break;
            }
            i10++;
        }
        return charSequenceSubSequence.toString();
    }

    public static final int e0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC2793j.h0(chars), i10);
        }
        int iD = B7.d.d(i10, 0);
        int iX = X(charSequence);
        if (iD > iX) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            for (char c10 : chars) {
                if (AbstractC1384c.d(c10, cCharAt, z10)) {
                    return iD;
                }
            }
            if (iD == iX) {
                return -1;
            }
            iD++;
        }
    }

    public static boolean f0(CharSequence charSequence) {
        AbstractC2855l.g(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!AbstractC1383b.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int g0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? k0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int h0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? a0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = X(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return g0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int j0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = X(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return h0(charSequence, str, i10, z10);
    }

    public static final int k0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC2793j.h0(chars), i10);
        }
        for (int iH = B7.d.h(i10, X(charSequence)); -1 < iH; iH--) {
            char cCharAt = charSequence.charAt(iH);
            for (char c10 : chars) {
                if (AbstractC1384c.d(c10, cCharAt, z10)) {
                    return iH;
                }
            }
        }
        return -1;
    }

    public static final O8.i l0(CharSequence charSequence) {
        AbstractC2855l.g(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List m0(CharSequence charSequence) {
        AbstractC2855l.g(charSequence, "<this>");
        return O8.l.S(l0(charSequence));
    }

    public static final CharSequence n0(CharSequence charSequence, int i10, char c10) {
        AbstractC2855l.g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String o0(String str, int i10, char c10) {
        AbstractC2855l.g(str, "<this>");
        return n0(str, i10, c10).toString();
    }

    private static final O8.i p0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        B0(i11);
        return new C1386e(charSequence, i10, i11, new Function2() { // from class: P8.C
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return E.t0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final O8.i q0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        B0(i11);
        final List listE = AbstractC2793j.e(strArr);
        return new C1386e(charSequence, i10, i11, new Function2() { // from class: P8.D
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return E.u0(listE, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ O8.i r0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return p0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ O8.i s0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return q0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair t0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC2855l.g(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iE0 = e0(DelimitedRangesSequence, cArr, i10, z10);
        if (iE0 < 0) {
            return null;
        }
        return i7.t.a(Integer.valueOf(iE0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair u0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC2855l.g(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairV = V(DelimitedRangesSequence, list, i10, z10, false);
        if (pairV != null) {
            return i7.t.a(pairV.c(), Integer.valueOf(((String) pairV.d()).length()));
        }
        return null;
    }

    public static final boolean v0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        AbstractC2855l.g(charSequence, "<this>");
        AbstractC2855l.g(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC1384c.d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String w0(String str, CharSequence prefix) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(prefix, "prefix");
        if (!K0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String x0(String str, CharSequence suffix) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(suffix, "suffix");
        if (!U(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String y0(String str, CharSequence delimiter) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(delimiter, "delimiter");
        return z0(str, delimiter, delimiter);
    }

    public static final String z0(String str, CharSequence prefix, CharSequence suffix) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !K0(str, prefix, false, 2, null) || !U(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }
}
