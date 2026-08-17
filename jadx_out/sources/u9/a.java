package u9;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC2855l;
import t9.A;
import t9.AbstractC3388e;
import t9.C3391h;
import t9.I;
import t9.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f32733a = I.a("0123456789abcdef");

    public static final C3391h.a a(C3391h c3391h, C3391h.a unsafeCursor) {
        AbstractC2855l.g(c3391h, "<this>");
        AbstractC2855l.g(unsafeCursor, "unsafeCursor");
        C3391h.a aVarG = AbstractC3388e.g(unsafeCursor);
        if (aVarG.f32594g != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.f32594g = c3391h;
        aVarG.f32595h = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f32733a;
    }

    public static final boolean c(A segment, int i10, byte[] bytes, int i11, int i12) {
        AbstractC2855l.g(segment, "segment");
        AbstractC2855l.g(bytes, "bytes");
        int i13 = segment.f32553c;
        byte[] bArr = segment.f32551a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f32556f;
                AbstractC2855l.d(segment);
                byte[] bArr2 = segment.f32551a;
                bArr = bArr2;
                i10 = segment.f32552b;
                i13 = segment.f32553c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C3391h c3391h, long j10) throws EOFException {
        AbstractC2855l.g(c3391h, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c3391h.M(j11) == 13) {
                String strN0 = c3391h.N0(j11);
                c3391h.skip(2L);
                return strN0;
            }
        }
        String strN02 = c3391h.N0(j10);
        c3391h.skip(1L);
        return strN02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int e(C3391h c3391h, v options, boolean z10) {
        int i10;
        int i11;
        A a10;
        int i12;
        int i13;
        AbstractC2855l.g(c3391h, "<this>");
        AbstractC2855l.g(options, "options");
        A a11 = c3391h.f32592g;
        if (a11 != null) {
            byte[] bArr = a11.f32551a;
            int i14 = a11.f32552b;
            int i15 = a11.f32553c;
            int[] iArrT = options.t();
            A a12 = a11;
            int i16 = -1;
            int i17 = 0;
            loop0: while (true) {
                int i18 = i17 + 1;
                int i19 = iArrT[i17];
                int i20 = i17 + 2;
                int i21 = iArrT[i18];
                if (i21 != -1) {
                    i16 = i21;
                }
                if (a12 == null) {
                    break;
                }
                if (i19 >= 0) {
                    i10 = i14 + 1;
                    int i22 = bArr[i14] & 255;
                    int i23 = i20 + i19;
                    while (i20 != i23) {
                        if (i22 == iArrT[i20]) {
                            i11 = iArrT[i20 + i19];
                            if (i10 == i15) {
                                a12 = a12.f32556f;
                                AbstractC2855l.d(a12);
                                i10 = a12.f32552b;
                                bArr = a12.f32551a;
                                i15 = a12.f32553c;
                                if (a12 == a11) {
                                    a12 = null;
                                }
                            }
                            if (i11 < 0) {
                            }
                        } else {
                            i20++;
                        }
                    }
                    break loop0;
                }
                int i24 = i20 + (i19 * (-1));
                while (true) {
                    int i25 = i14 + 1;
                    int i26 = i20 + 1;
                    if ((bArr[i14] & 255) != iArrT[i20]) {
                        break loop0;
                    }
                    boolean z11 = i26 == i24;
                    if (i25 == i15) {
                        AbstractC2855l.d(a12);
                        A a13 = a12.f32556f;
                        AbstractC2855l.d(a13);
                        i13 = a13.f32552b;
                        byte[] bArr2 = a13.f32551a;
                        i12 = a13.f32553c;
                        if (a13 != a11) {
                            a10 = a13;
                            bArr = bArr2;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            a10 = null;
                        }
                    } else {
                        a10 = a12;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z11) {
                        i11 = iArrT[i26];
                        i10 = i13;
                        i15 = i12;
                        a12 = a10;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    a12 = a10;
                    i20 = i26;
                }
                if (i11 < 0) {
                    return i11;
                }
                i17 = -i11;
                i14 = i10;
            }
        } else {
            return z10 ? -2 : -1;
        }
    }

    public static /* synthetic */ int f(C3391h c3391h, v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(c3391h, vVar, z10);
    }
}
