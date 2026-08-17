package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class X1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final X1 f22318f = new X1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f22320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f22321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22322d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22323e;

    private X1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f22319a = i10;
        this.f22320b = iArr;
        this.f22321c = objArr;
        this.f22323e = z10;
    }

    public static X1 c() {
        return f22318f;
    }

    static X1 e(X1 x12, X1 x13) {
        int i10 = x12.f22319a + x13.f22319a;
        int[] iArrCopyOf = Arrays.copyOf(x12.f22320b, i10);
        System.arraycopy(x13.f22320b, 0, iArrCopyOf, x12.f22319a, x13.f22319a);
        Object[] objArrCopyOf = Arrays.copyOf(x12.f22321c, i10);
        System.arraycopy(x13.f22321c, 0, objArrCopyOf, x12.f22319a, x13.f22319a);
        return new X1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static X1 f() {
        return new X1(0, new int[8], new Object[8], true);
    }

    private final void m(int i10) {
        int[] iArr = this.f22320b;
        if (i10 > iArr.length) {
            int i11 = this.f22319a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f22320b = Arrays.copyOf(iArr, i10);
            this.f22321c = Arrays.copyOf(this.f22321c, i10);
        }
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i10 = this.f22322d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f22319a; i12++) {
            int i13 = this.f22320b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f22321c[i12]).getClass();
                    iA2 = AbstractC2207w0.a(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    AbstractC2171o0 abstractC2171o0 = (AbstractC2171o0) this.f22321c[i12];
                    int iA3 = AbstractC2207w0.a(i16);
                    int iQ = abstractC2171o0.q();
                    iA2 = iA3 + AbstractC2207w0.a(iQ) + iQ;
                } else if (i15 == 3) {
                    int iA4 = AbstractC2207w0.a(i14 << 3);
                    iA = iA4 + iA4;
                    iB = ((X1) this.f22321c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new Y0("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f22321c[i12]).getClass();
                    iA2 = AbstractC2207w0.a(i14 << 3) + 4;
                }
                i11 += iA2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f22321c[i12]).longValue();
                iA = AbstractC2207w0.a(i17);
                iB = AbstractC2207w0.b(jLongValue);
            }
            iA2 = iA + iB;
            i11 += iA2;
        }
        this.f22322d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f22322d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f22319a; i11++) {
            int i12 = this.f22320b[i11] >>> 3;
            AbstractC2171o0 abstractC2171o0 = (AbstractC2171o0) this.f22321c[i11];
            int iA2 = AbstractC2207w0.a(8);
            int iA3 = AbstractC2207w0.a(16) + AbstractC2207w0.a(i12);
            int iA4 = AbstractC2207w0.a(24);
            int iQ = abstractC2171o0.q();
            iA += iA2 + iA2 + iA3 + iA4 + AbstractC2207w0.a(iQ) + iQ;
        }
        this.f22322d = iA;
        return iA;
    }

    final X1 d(X1 x12) {
        if (x12.equals(f22318f)) {
            return this;
        }
        g();
        int i10 = this.f22319a + x12.f22319a;
        m(i10);
        System.arraycopy(x12.f22320b, 0, this.f22320b, this.f22319a, x12.f22319a);
        System.arraycopy(x12.f22321c, 0, this.f22321c, this.f22319a, x12.f22319a);
        this.f22319a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof X1)) {
            return false;
        }
        X1 x12 = (X1) obj;
        int i10 = this.f22319a;
        if (i10 == x12.f22319a) {
            int[] iArr = this.f22320b;
            int[] iArr2 = x12.f22320b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f22321c;
                    Object[] objArr2 = x12.f22321c;
                    int i12 = this.f22319a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.f22323e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f22323e) {
            this.f22323e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f22319a;
        int i11 = i10 + 527;
        int[] iArr = this.f22320b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f22321c;
        int i15 = this.f22319a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f22319a; i11++) {
            AbstractC2196t1.b(sb, i10, String.valueOf(this.f22320b[i11] >>> 3), this.f22321c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f22319a + 1);
        int[] iArr = this.f22320b;
        int i11 = this.f22319a;
        iArr[i11] = i10;
        this.f22321c[i11] = obj;
        this.f22319a = i11 + 1;
    }

    final void k(InterfaceC2163m2 interfaceC2163m2) {
        for (int i10 = 0; i10 < this.f22319a; i10++) {
            interfaceC2163m2.A(this.f22320b[i10] >>> 3, this.f22321c[i10]);
        }
    }

    public final void l(InterfaceC2163m2 interfaceC2163m2) {
        if (this.f22319a != 0) {
            for (int i10 = 0; i10 < this.f22319a; i10++) {
                int i11 = this.f22320b[i10];
                Object obj = this.f22321c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC2163m2.h(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC2163m2.G(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC2163m2.s(i13, (AbstractC2171o0) obj);
                } else if (i12 == 3) {
                    interfaceC2163m2.K(i13);
                    ((X1) obj).l(interfaceC2163m2);
                    interfaceC2163m2.J(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new Y0("Protocol message tag had invalid wire type."));
                    }
                    interfaceC2163m2.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
