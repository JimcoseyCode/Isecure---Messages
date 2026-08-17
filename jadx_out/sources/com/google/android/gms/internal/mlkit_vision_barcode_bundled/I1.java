package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.ViewDefaults;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class I1 extends AbstractC2171o0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int[] f21732n = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, ViewDefaults.NUMBER_OF_LINES};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC2171o0 f21734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC2171o0 f21735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f21736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f21737m;

    static int J(int i10) {
        int[] iArr = f21732n;
        int length = iArr.length;
        return i10 >= 47 ? ViewDefaults.NUMBER_OF_LINES : iArr[i10];
    }

    static AbstractC2171o0 M(AbstractC2171o0 abstractC2171o0, AbstractC2171o0 abstractC2171o02) {
        if (abstractC2171o02.q() == 0) {
            return abstractC2171o0;
        }
        if (abstractC2171o0.q() == 0) {
            return abstractC2171o02;
        }
        int iQ = abstractC2171o0.q() + abstractC2171o02.q();
        if (iQ < 128) {
            return N(abstractC2171o0, abstractC2171o02);
        }
        if (abstractC2171o0 instanceof I1) {
            I1 i12 = (I1) abstractC2171o0;
            if (i12.f21735k.q() + abstractC2171o02.q() < 128) {
                return new I1(i12.f21734j, N(i12.f21735k, abstractC2171o02));
            }
            if (i12.f21734j.s() > i12.f21735k.s() && i12.f21737m > abstractC2171o02.s()) {
                return new I1(i12.f21734j, new I1(i12.f21735k, abstractC2171o02));
            }
        }
        return iQ >= J(Math.max(abstractC2171o0.s(), abstractC2171o02.s()) + 1) ? new I1(abstractC2171o0, abstractC2171o02) : D1.a(new D1(null), abstractC2171o0, abstractC2171o02);
    }

    private static AbstractC2171o0 N(AbstractC2171o0 abstractC2171o0, AbstractC2171o0 abstractC2171o02) {
        int iQ = abstractC2171o0.q();
        int iQ2 = abstractC2171o02.q();
        byte[] bArr = new byte[iQ + iQ2];
        abstractC2171o0.H(bArr, 0, 0, iQ);
        abstractC2171o02.H(bArr, 0, iQ, iQ2);
        return new C2166n0(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    /* JADX INFO: renamed from: C */
    public final InterfaceC2151k0 iterator() {
        return new B1(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final byte d(int i10) {
        AbstractC2171o0.G(i10, this.f21733i);
        return o(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2171o0)) {
            return false;
        }
        AbstractC2171o0 abstractC2171o0 = (AbstractC2171o0) obj;
        if (this.f21733i != abstractC2171o0.q()) {
            return false;
        }
        if (this.f21733i == 0) {
            return true;
        }
        int iB = B();
        int iB2 = abstractC2171o0.B();
        if (iB != 0 && iB2 != 0 && iB != iB2) {
            return false;
        }
        F1 f12 = null;
        G1 g12 = new G1(this, f12);
        AbstractC2161m0 abstractC2161m0B = g12.next();
        G1 g13 = new G1(abstractC2171o0, f12);
        AbstractC2161m0 abstractC2161m0B2 = g13.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iQ = abstractC2161m0B.q() - i10;
            int iQ2 = abstractC2161m0B2.q() - i11;
            int iMin = Math.min(iQ, iQ2);
            if (!(i10 == 0 ? abstractC2161m0B.J(abstractC2161m0B2, i11, iMin) : abstractC2161m0B2.J(abstractC2161m0B, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f21733i;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iQ) {
                abstractC2161m0B = g12.next();
                i10 = 0;
            } else {
                i10 += iMin;
                abstractC2161m0B = abstractC2161m0B;
            }
            if (iMin == iQ2) {
                abstractC2161m0B2 = g13.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new B1(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    final byte o(int i10) {
        int i11 = this.f21736l;
        return i10 < i11 ? this.f21734j.o(i10) : this.f21735k.o(i10 - i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final int q() {
        return this.f21733i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final void r(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f21736l;
        if (i13 <= i14) {
            this.f21734j.r(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f21735k.r(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f21734j.r(bArr, i10, i11, i15);
            this.f21735k.r(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final int s() {
        return this.f21737m;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final boolean t() {
        return this.f21733i >= J(this.f21737m);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final int u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f21736l;
        if (i13 <= i14) {
            return this.f21734j.u(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f21735k.u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f21735k.u(this.f21734j.u(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final int v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f21736l;
        if (i13 <= i14) {
            return this.f21734j.v(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f21735k.v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f21735k.v(this.f21734j.v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final AbstractC2171o0 w(int i10, int i11) {
        int iA = AbstractC2171o0.A(i10, i11, this.f21733i);
        if (iA == 0) {
            return AbstractC2171o0.f22405h;
        }
        if (iA == this.f21733i) {
            return this;
        }
        int i12 = this.f21736l;
        if (i11 <= i12) {
            return this.f21734j.w(i10, i11);
        }
        if (i10 >= i12) {
            return this.f21735k.w(i10 - i12, i11 - i12);
        }
        AbstractC2171o0 abstractC2171o0 = this.f21734j;
        return new I1(abstractC2171o0.w(i10, abstractC2171o0.q()), this.f21735k.w(0, i11 - this.f21736l));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final String x(Charset charset) {
        return new String(I(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    final void y(AbstractC2126f0 abstractC2126f0) {
        this.f21734j.y(abstractC2126f0);
        this.f21735k.y(abstractC2126f0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final boolean z() {
        AbstractC2171o0 abstractC2171o0 = this.f21734j;
        AbstractC2171o0 abstractC2171o02 = this.f21735k;
        return abstractC2171o02.v(abstractC2171o0.v(0, 0, this.f21736l), 0, abstractC2171o02.q()) == 0;
    }

    private I1(AbstractC2171o0 abstractC2171o0, AbstractC2171o0 abstractC2171o02) {
        this.f21734j = abstractC2171o0;
        this.f21735k = abstractC2171o02;
        int iQ = abstractC2171o0.q();
        this.f21736l = iQ;
        this.f21733i = iQ + abstractC2171o02.q();
        this.f21737m = Math.max(abstractC2171o0.s(), abstractC2171o02.s()) + 1;
    }
}
