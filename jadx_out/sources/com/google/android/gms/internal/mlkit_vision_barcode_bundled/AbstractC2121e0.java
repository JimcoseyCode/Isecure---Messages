package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2121e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f22357a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22358b = 0;

    static int a(byte[] bArr, int i10, C2116d0 c2116d0) throws Z0 {
        int iJ = j(bArr, i10, c2116d0);
        int i11 = c2116d0.f22344a;
        if (i11 < 0) {
            throw new Z0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iJ) {
            throw new Z0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c2116d0.f22346c = AbstractC2171o0.f22405h;
            return iJ;
        }
        c2116d0.f22346c = AbstractC2171o0.D(bArr, iJ, i11);
        return iJ + i11;
    }

    static int b(int i10, byte[] bArr, int i11, int i12, M0 m02, O0 o02, W1 w12, C2116d0 c2116d0) throws Z0 {
        F0 f02 = m02.zzb;
        EnumC2153k2 enumC2153k2 = o02.f22295b.f22289h;
        Object objValueOf = null;
        if (enumC2153k2 == EnumC2153k2.f22384u) {
            j(bArr, i11, c2116d0);
            throw null;
        }
        switch (enumC2153k2.ordinal()) {
            case 0:
                i11 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(q(bArr, i11)));
                break;
            case 1:
                i11 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(c(bArr, i11)));
                break;
            case 2:
            case 3:
                i11 = m(bArr, i11, c2116d0);
                objValueOf = Long.valueOf(c2116d0.f22345b);
                break;
            case 4:
            case 12:
                i11 = j(bArr, i11, c2116d0);
                objValueOf = Integer.valueOf(c2116d0.f22344a);
                break;
            case 5:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                i11 += 8;
                objValueOf = Long.valueOf(q(bArr, i11));
                break;
            case 6:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                i11 += 4;
                objValueOf = Integer.valueOf(c(bArr, i11));
                break;
            case 7:
                i11 = m(bArr, i11, c2116d0);
                objValueOf = Boolean.valueOf(c2116d0.f22345b != 0);
                break;
            case 8:
                i11 = h(bArr, i11, c2116d0);
                objValueOf = c2116d0.f22346c;
                break;
            case 9:
                int i13 = ((i10 >>> 3) << 3) | 4;
                J1 j1B = C2216y1.a().b(o02.f22294a.getClass());
                Object objE = f02.e(o02.f22295b);
                if (objE == null) {
                    objE = j1B.f();
                    f02.i(o02.f22295b, objE);
                }
                return n(objE, j1B, bArr, i11, i12, i13, c2116d0);
            case 10:
                J1 j1B2 = C2216y1.a().b(o02.f22294a.getClass());
                Object objE2 = f02.e(o02.f22295b);
                if (objE2 == null) {
                    objE2 = j1B2.f();
                    f02.i(o02.f22295b, objE2);
                }
                return o(objE2, j1B2, bArr, i11, i12, c2116d0);
            case 11:
                i11 = a(bArr, i11, c2116d0);
                objValueOf = c2116d0.f22346c;
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i11 = j(bArr, i11, c2116d0);
                objValueOf = Integer.valueOf(AbstractC2190s0.a(c2116d0.f22344a));
                break;
            case 17:
                i11 = m(bArr, i11, c2116d0);
                objValueOf = Long.valueOf(AbstractC2190s0.b(c2116d0.f22345b));
                break;
        }
        f02.i(o02.f22295b, objValueOf);
        return i11;
    }

    static int c(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int d(J1 j12, byte[] bArr, int i10, int i11, int i12, C2116d0 c2116d0) throws Z0 {
        Object objF = j12.f();
        int iN = n(objF, j12, bArr, i10, i11, i12, c2116d0);
        j12.a(objF);
        c2116d0.f22346c = objF;
        return iN;
    }

    static int e(J1 j12, byte[] bArr, int i10, int i11, C2116d0 c2116d0) throws Z0 {
        Object objF = j12.f();
        int iO = o(objF, j12, bArr, i10, i11, c2116d0);
        j12.a(objF);
        c2116d0.f22346c = objF;
        return iO;
    }

    static int f(J1 j12, int i10, byte[] bArr, int i11, int i12, W0 w02, C2116d0 c2116d0) throws Z0 {
        int iE = e(j12, bArr, i11, i12, c2116d0);
        w02.add(c2116d0.f22346c);
        while (iE < i12) {
            int iJ = j(bArr, iE, c2116d0);
            if (i10 != c2116d0.f22344a) {
                break;
            }
            iE = e(j12, bArr, iJ, i12, c2116d0);
            w02.add(c2116d0.f22346c);
        }
        return iE;
    }

    static int g(byte[] bArr, int i10, W0 w02, C2116d0 c2116d0) throws Z0 {
        Q0 q02 = (Q0) w02;
        int iJ = j(bArr, i10, c2116d0);
        int i11 = c2116d0.f22344a + iJ;
        while (iJ < i11) {
            iJ = j(bArr, iJ, c2116d0);
            q02.q(c2116d0.f22344a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw new Z0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int h(byte[] bArr, int i10, C2116d0 c2116d0) throws Z0 {
        int iJ = j(bArr, i10, c2116d0);
        int i11 = c2116d0.f22344a;
        if (i11 < 0) {
            throw new Z0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            c2116d0.f22346c = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            return iJ;
        }
        c2116d0.f22346c = new String(bArr, iJ, i11, X0.f22316a);
        return iJ + i11;
    }

    static int i(int i10, byte[] bArr, int i11, int i12, X1 x12, C2116d0 c2116d0) throws Z0 {
        if ((i10 >>> 3) == 0) {
            throw new Z0("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM = m(bArr, i11, c2116d0);
            x12.j(i10, Long.valueOf(c2116d0.f22345b));
            return iM;
        }
        if (i13 == 1) {
            x12.j(i10, Long.valueOf(q(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iJ = j(bArr, i11, c2116d0);
            int i14 = c2116d0.f22344a;
            if (i14 < 0) {
                throw new Z0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iJ) {
                throw new Z0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                x12.j(i10, AbstractC2171o0.f22405h);
            } else {
                x12.j(i10, AbstractC2171o0.D(bArr, iJ, i14));
            }
            return iJ + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new Z0("Protocol message contained an invalid tag (zero).");
            }
            x12.j(i10, Integer.valueOf(c(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        X1 x1F = X1.f();
        int i16 = c2116d0.f22348e + 1;
        c2116d0.f22348e = i16;
        r(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iJ2 = j(bArr, i11, c2116d0);
            int i18 = c2116d0.f22344a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iJ2;
                break;
            }
            i11 = i(i18, bArr, iJ2, i12, x1F, c2116d0);
            i17 = i18;
        }
        c2116d0.f22348e--;
        if (i11 > i12 || i17 != i15) {
            throw new Z0("Failed to parse the message.");
        }
        x12.j(i10, x1F);
        return i11;
    }

    static int j(byte[] bArr, int i10, C2116d0 c2116d0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, c2116d0);
        }
        c2116d0.f22344a = b10;
        return i11;
    }

    static int k(int i10, byte[] bArr, int i11, C2116d0 c2116d0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c2116d0.f22344a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c2116d0.f22344a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c2116d0.f22344a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c2116d0.f22344a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2116d0.f22344a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int l(int i10, byte[] bArr, int i11, int i12, W0 w02, C2116d0 c2116d0) {
        Q0 q02 = (Q0) w02;
        int iJ = j(bArr, i11, c2116d0);
        q02.q(c2116d0.f22344a);
        while (iJ < i12) {
            int iJ2 = j(bArr, iJ, c2116d0);
            if (i10 != c2116d0.f22344a) {
                break;
            }
            iJ = j(bArr, iJ2, c2116d0);
            q02.q(c2116d0.f22344a);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i10, C2116d0 c2116d0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c2116d0.f22345b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        c2116d0.f22345b = j11;
        return i12;
    }

    static int n(Object obj, J1 j12, byte[] bArr, int i10, int i11, int i12, C2116d0 c2116d0) throws Z0 {
        int i13 = c2116d0.f22348e + 1;
        c2116d0.f22348e = i13;
        r(i13);
        int iY = ((C2200u1) j12).y(obj, bArr, i10, i11, i12, c2116d0);
        c2116d0.f22348e--;
        c2116d0.f22346c = obj;
        return iY;
    }

    static int o(Object obj, J1 j12, byte[] bArr, int i10, int i11, C2116d0 c2116d0) throws Z0 {
        int iK = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iK = k(i12, bArr, iK, c2116d0);
            i12 = c2116d0.f22344a;
        }
        int i13 = iK;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new Z0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c2116d0.f22348e + 1;
        c2116d0.f22348e = i14;
        r(i14);
        int i15 = i13 + i12;
        j12.b(obj, bArr, i13, i15, c2116d0);
        c2116d0.f22348e--;
        c2116d0.f22346c = obj;
        return i15;
    }

    static int p(int i10, byte[] bArr, int i11, int i12, C2116d0 c2116d0) throws Z0 {
        if ((i10 >>> 3) == 0) {
            throw new Z0("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m(bArr, i11, c2116d0);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return j(bArr, i11, c2116d0) + c2116d0.f22344a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new Z0("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = j(bArr, i11, c2116d0);
            i15 = c2116d0.f22344a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, c2116d0);
        }
        if (i11 > i12 || i15 != i14) {
            throw new Z0("Failed to parse the message.");
        }
        return i11;
    }

    static long q(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void r(int i10) throws Z0 {
        if (i10 >= f22357a) {
            throw new Z0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
