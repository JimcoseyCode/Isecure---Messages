package P8;

import P8.C1388g;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2742e;
import j7.AbstractC2787d;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: P8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1387f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f8876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f8877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f8878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f8879d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f8876a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f8877b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f8878c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f8879d = jArr;
    }

    private static final long A(long j10, long j11, int i10) {
        if (j10 <= 0 || j11 <= 0) {
            return 0L;
        }
        long j12 = i10;
        return (j10 + j12) / (j11 + j12);
    }

    private static final long a(long j10, int i10, int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i10;
        return (j10 * j11) + (((long) i11) * (j11 - 1));
    }

    private static final int b(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) i7.x.p(i7.x.j(j10))));
    }

    private static final int c(String str, int i10, int i11) {
        if (str.charAt(i10) == '\r') {
            int i12 = i10 + 1;
            return (i12 >= i11 || str.charAt(i12) != '\n') ? i12 : i10 + 2;
        }
        if (str.charAt(i10) == '\n') {
            return i10 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final int d(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return s(str2, cArr, e(bArr, i10, iArr, cArr, s(str, cArr, i11)));
    }

    private static final int e(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    private static final int f(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return b((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
    }

    public static final int g(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return b(((long) i18) + (((long) i21) * ((long) i13)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i10) * (((long) i15) + 2 + ((long) i16))));
    }

    private static final byte[] h(String str, int i10, int i11, C1388g c1388g) {
        byte[] bArrJ;
        AbstractC2787d.f28912g.a(i10, i11, str.length());
        if (i10 == i11) {
            return new byte[0];
        }
        C1388g.a aVarB = c1388g.b();
        return (!aVarB.j() || (bArrJ = j(str, i10, i11, aVarB)) == null) ? m(str, i10, i11, aVarB) : bArrJ;
    }

    public static final byte[] i(String str, C1388g format) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(format, "format");
        return h(str, 0, str.length(), format);
    }

    private static final byte[] j(String str, int i10, int i11, C1388g.a aVar) {
        return aVar.k() ? l(str, i10, i11, aVar) : k(str, i10, i11, aVar);
    }

    private static final byte[] k(String str, int i10, int i11, C1388g.a aVar) {
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        long length = strD.length();
        long length2 = ((long) strC.length()) + 2 + ((long) strE.length()) + length;
        long j10 = i11 - i10;
        int i12 = (int) ((j10 + length) / length2);
        if ((((long) i12) * length2) - length != j10) {
            return null;
        }
        boolean zI = aVar.i();
        byte[] bArr = new byte[i12];
        if (strC.length() != 0) {
            int length3 = strC.length();
            for (int i13 = 0; i13 < length3; i13++) {
                if (!AbstractC1384c.d(strC.charAt(i13), str.charAt(i10 + i13), zI)) {
                    r(str, i10, i11, strC, "byte prefix");
                }
            }
            i10 += strC.length();
        }
        String str2 = strE + strD + strC;
        int i14 = i12 - 1;
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i15] = n(str, i10);
            i10 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i16 = 0; i16 < length4; i16++) {
                    if (!AbstractC1384c.d(str2.charAt(i16), str.charAt(i10 + i16), zI)) {
                        r(str, i10, i11, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i10 += str2.length();
            }
        }
        bArr[i14] = n(str, i10);
        int i17 = i10 + 2;
        if (strE.length() == 0) {
            return bArr;
        }
        int length5 = strE.length();
        for (int i18 = 0; i18 < length5; i18++) {
            if (!AbstractC1384c.d(strE.charAt(i18), str.charAt(i17 + i18), zI)) {
                r(str, i17, i11, strE, "byte suffix");
            }
        }
        return bArr;
    }

    private static final byte[] l(String str, int i10, int i11, C1388g.a aVar) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int i13 = 2;
        if (length == 0) {
            if ((i12 & 1) != 0) {
                return null;
            }
            int i14 = i12 >> 1;
            byte[] bArr = new byte[i14];
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i16] = n(str, i15);
                i15 += 2;
            }
            return bArr;
        }
        if (i12 % 3 != 2) {
            return null;
        }
        int i17 = (i12 / 3) + 1;
        byte[] bArr2 = new byte[i17];
        char cCharAt = aVar.d().charAt(0);
        bArr2[0] = n(str, 0);
        for (int i18 = 1; i18 < i17; i18++) {
            if (str.charAt(i13) != cCharAt) {
                String strD = aVar.d();
                boolean zI = aVar.i();
                if (strD.length() != 0) {
                    int length2 = strD.length();
                    for (int i19 = 0; i19 < length2; i19++) {
                        if (!AbstractC1384c.d(strD.charAt(i19), str.charAt(i13 + i19), zI)) {
                            r(str, i13, i11, strD, "byte separator");
                        }
                    }
                    strD.length();
                }
            }
            bArr2[i18] = n(str, i13 + 1);
            i13 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final byte[] m(String str, int i10, int i11, C1388g.a aVar) {
        int i12;
        int i13;
        int i14;
        int iG = aVar.g();
        int iF = aVar.f();
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        String strH = aVar.h();
        boolean zI = aVar.i();
        int iO = o(i11 - i10, iG, iF, strH.length(), strD.length(), strC.length(), strE.length());
        byte[] bArr = new byte[iO];
        int length = i10;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (length < i11) {
            if (i16 == iG) {
                length = c(str, length, i11);
                i12 = iG;
                i13 = iF;
                i16 = 0;
            } else if (i17 != iF) {
                i12 = iG;
                i13 = iF;
                if (i17 != 0 && strD.length() != 0) {
                    int length2 = strD.length();
                    int i18 = 0;
                    while (i18 < length2) {
                        int i19 = length2;
                        if (!AbstractC1384c.d(strD.charAt(i18), str.charAt(length + i18), zI)) {
                            r(str, length, i11, strD, "byte separator");
                        }
                        i18++;
                        length2 = i19;
                    }
                    length += strD.length();
                }
                i16++;
                i17++;
                if (strC.length() != 0) {
                    int length3 = strC.length();
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = length3;
                        if (!AbstractC1384c.d(strC.charAt(i20), str.charAt(length + i20), zI)) {
                            r(str, length, i11, strC, "byte prefix");
                        }
                        i20++;
                        length3 = i21;
                    }
                    length += strC.length();
                }
                if (i11 - 2 < length) {
                    q(str, length, i11, "exactly", 2);
                }
                int i22 = i15 + 1;
                bArr[i15] = n(str, length);
                length += 2;
                if (strE.length() != 0) {
                    i14 = i22;
                } else {
                    int length4 = strE.length();
                    int i23 = 0;
                    while (i23 < length4) {
                        int i24 = i22;
                        if (!AbstractC1384c.d(strE.charAt(i23), str.charAt(length + i23), zI)) {
                            r(str, length, i11, strE, "byte suffix");
                        }
                        i23++;
                        i22 = i24;
                    }
                    i14 = i22;
                    length += strE.length();
                }
                i15 = i14;
                iG = i12;
                iF = i13;
            } else if (strH.length() == 0) {
                i12 = iG;
                i13 = iF;
            } else {
                int length5 = strH.length();
                int i25 = 0;
                while (i25 < length5) {
                    int i26 = iG;
                    int i27 = iF;
                    if (!AbstractC1384c.d(strH.charAt(i25), str.charAt(length + i25), zI)) {
                        r(str, length, i11, strH, "group separator");
                    }
                    i25++;
                    iG = i26;
                    iF = i27;
                }
                i12 = iG;
                i13 = iF;
                length += strH.length();
            }
            i17 = 0;
            i16++;
            i17++;
            if (strC.length() != 0) {
            }
            if (i11 - 2 < length) {
            }
            int i222 = i15 + 1;
            bArr[i15] = n(str, length);
            length += 2;
            if (strE.length() != 0) {
            }
            i15 = i14;
            iG = i12;
            iF = i13;
        }
        if (i15 == iO) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i15);
        AbstractC2855l.f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    private static final byte n(String str, int i10) {
        int[] iArr;
        int i11;
        int i12;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') != 0 || (i11 = (iArr = f8878c)[cCharAt]) < 0) {
            p(str, i10);
            throw new C2742e();
        }
        int i13 = i10 + 1;
        char cCharAt2 = str.charAt(i13);
        if ((cCharAt2 >>> '\b') == 0 && (i12 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i11 << 4) | i12);
        }
        p(str, i13);
        throw new C2742e();
    }

    public static final int o(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jA;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = ((long) i15) + 2 + ((long) i16);
        long jA2 = a(j10, i12, i14);
        if (i11 <= i12) {
            jA = a(j10, i11, i14);
        } else {
            jA = a(jA2, i11 / i12, i13);
            int i17 = i11 % i12;
            if (i17 != 0) {
                jA = jA + ((long) i13) + a(j10, i17, i14);
            }
        }
        long j11 = i10;
        long jA3 = A(j11, jA, 1);
        long j12 = j11 - ((jA + 1) * jA3);
        long jA4 = A(j12, jA2, i13);
        long j13 = j12 - ((jA2 + ((long) i13)) * jA4);
        long jA5 = A(j13, j10, i14);
        return (int) ((jA3 * ((long) i11)) + (jA4 * ((long) i12)) + jA5 + ((long) (j13 - ((j10 + ((long) i14)) * jA5) > 0 ? 1 : 0)));
    }

    private static final Void p(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final void q(String str, int i10, int i11, String str2, int i12) {
        AbstractC2855l.e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC2855l.f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    private static final void r(String str, int i10, int i11, String str2, String str3) {
        int iH = B7.d.h(str2.length() + i10, i11);
        AbstractC2855l.e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iH);
        AbstractC2855l.f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }

    private static final int s(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                AbstractC2855l.e(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    public static final String t(byte[] bArr, int i10, int i11, C1388g format) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(format, "format");
        AbstractC2787d.f28912g.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int[] iArr = format.c() ? f8877b : f8876a;
        C1388g.a aVarB = format.b();
        return aVarB.j() ? w(bArr, i10, i11, aVarB, iArr) : z(bArr, i10, i11, aVarB, iArr);
    }

    public static final String u(byte[] bArr, C1388g format) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(format, "format");
        return t(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String v(byte[] bArr, C1388g c1388g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1388g = C1388g.f8880d.a();
        }
        return u(bArr, c1388g);
    }

    private static final String w(byte[] bArr, int i10, int i11, C1388g.a aVar, int[] iArr) {
        return aVar.k() ? y(bArr, i10, i11, aVar, iArr) : x(bArr, i10, i11, aVar, iArr);
    }

    private static final String x(byte[] bArr, int i10, int i11, C1388g.a aVar, int[] iArr) {
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        char[] cArr = new char[f(i11 - i10, strD.length(), strC.length(), strE.length())];
        int iD = d(bArr, i10, strC, strE, iArr, cArr, 0);
        for (int i12 = i10 + 1; i12 < i11; i12++) {
            iD = d(bArr, i12, strC, strE, iArr, cArr, s(strD, cArr, iD));
        }
        return B.s(cArr);
    }

    private static final String y(byte[] bArr, int i10, int i11, C1388g.a aVar, int[] iArr) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iE = 0;
        if (length == 0) {
            char[] cArr = new char[b(((long) i12) * 2)];
            while (i10 < i11) {
                iE = e(bArr, i10, iArr, cArr, iE);
                i10++;
            }
            return B.s(cArr);
        }
        char[] cArr2 = new char[b((((long) i12) * 3) - 1)];
        char cCharAt = aVar.d().charAt(0);
        int iE2 = e(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iE2] = cCharAt;
            iE2 = e(bArr, i13, iArr, cArr2, iE2 + 1);
        }
        return B.s(cArr2);
    }

    private static final String z(byte[] bArr, int i10, int i11, C1388g.a aVar, int[] iArr) {
        int i12;
        int i13;
        int iG = aVar.g();
        int iF = aVar.f();
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        String strH = aVar.h();
        int iG2 = g(i11 - i10, iG, iF, strH.length(), strD.length(), strC.length(), strE.length());
        char[] cArr = new char[iG2];
        int i14 = i10;
        int iS = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11) {
            if (i15 == iG) {
                cArr[iS] = '\n';
                iS++;
                i12 = 0;
                i13 = 0;
            } else if (i16 == iF) {
                iS = s(strH, cArr, iS);
                i12 = i15;
                i13 = 0;
            } else {
                i12 = i15;
                i13 = i16;
            }
            if (i13 != 0) {
                iS = s(strD, cArr, iS);
            }
            String str = strC;
            int iD = d(bArr, i14, str, strE, iArr, cArr, iS);
            i14++;
            i16 = i13 + 1;
            iS = iD;
            strC = str;
            i15 = i12 + 1;
        }
        if (iS == iG2) {
            return B.s(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
