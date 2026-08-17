package m8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import m8.p;

/* JADX INFO: renamed from: m8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2946e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29649d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InputStream f29651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29652g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29656k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29653h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29655j = ViewDefaults.NUMBER_OF_LINES;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29657l = 64;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29658m = 67108864;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f29646a = new byte[4096];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29648c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29650e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29654i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29647b = false;

    private C2946e(InputStream inputStream) {
        this.f29651f = inputStream;
    }

    public static int A(int i10, InputStream inputStream) throws IOException {
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw C2952k.k();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw C2952k.k();
            }
            if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw C2952k.f();
    }

    private void M() {
        int i10 = this.f29648c + this.f29649d;
        this.f29648c = i10;
        int i11 = this.f29654i + i10;
        int i12 = this.f29655j;
        if (i11 <= i12) {
            this.f29649d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f29649d = i13;
        this.f29648c = i10 - i13;
    }

    private void N(int i10) throws C2952k {
        if (!S(i10)) {
            throw C2952k.k();
        }
    }

    private void R(int i10) throws C2952k {
        if (i10 < 0) {
            throw C2952k.g();
        }
        int i11 = this.f29654i;
        int i12 = this.f29650e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f29655j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw C2952k.k();
        }
        int i15 = this.f29648c;
        int i16 = i15 - i12;
        this.f29650e = i15;
        N(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f29648c;
            if (i17 <= i18) {
                this.f29650e = i17;
                return;
            } else {
                i16 += i18;
                this.f29650e = i18;
                N(1);
            }
        }
    }

    private boolean S(int i10) throws IOException {
        int i11 = this.f29650e;
        int i12 = i11 + i10;
        int i13 = this.f29648c;
        if (i12 <= i13) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i10);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f29654i + i11 + i10 <= this.f29655j && this.f29651f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f29646a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f29654i += i11;
                this.f29648c -= i11;
                this.f29650e = 0;
            }
            InputStream inputStream = this.f29651f;
            byte[] bArr2 = this.f29646a;
            int i14 = this.f29648c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f29646a.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i15);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i15 > 0) {
                this.f29648c += i15;
                if ((this.f29654i + i10) - this.f29658m > 0) {
                    throw C2952k.j();
                }
                M();
                if (this.f29648c >= i10) {
                    return true;
                }
                return S(i10);
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) throws C2952k {
        if (this.f29648c - this.f29650e < i10) {
            N(i10);
        }
    }

    public static C2946e g(InputStream inputStream) {
        return new C2946e(inputStream);
    }

    private byte[] w(int i10) throws C2952k {
        if (i10 <= 0) {
            if (i10 == 0) {
                return AbstractC2951j.f29694a;
            }
            throw C2952k.g();
        }
        int i11 = this.f29654i;
        int i12 = this.f29650e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f29655j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw C2952k.k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f29648c - i12;
            System.arraycopy(this.f29646a, i12, bArr, 0, i15);
            this.f29650e = this.f29648c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f29646a, 0, bArr, i15, i16);
            this.f29650e = i16;
            return bArr;
        }
        int i17 = this.f29648c;
        this.f29654i = i11 + i17;
        this.f29650e = 0;
        this.f29648c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f29651f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw C2952k.k();
                }
                this.f29654i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f29646a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public long B() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f29650e;
        int i11 = this.f29648c;
        if (i11 != i10) {
            byte[] bArr = this.f29646a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f29650e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b10;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ ((long) (bArr[i13] << 14));
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ ((long) (bArr[i14] << 21));
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (((long) bArr[i13]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (((long) bArr[i13]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f29650e = i13;
                                                return j10;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j10 = j15;
                                                this.f29650e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f29650e = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j13 ^ j11;
                this.f29650e = i13;
                return j10;
            }
        }
        return C();
    }

    long C() throws C2952k {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bV = v();
            j10 |= ((long) (bV & 127)) << i10;
            if ((bV & 128) == 0) {
                return j10;
            }
        }
        throw C2952k.f();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public String H() {
        int iZ = z();
        int i10 = this.f29648c;
        int i11 = this.f29650e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : new String(w(iZ), "UTF-8");
        }
        String str = new String(this.f29646a, i11, iZ, "UTF-8");
        this.f29650e += iZ;
        return str;
    }

    public String I() throws C2952k {
        byte[] bArrW;
        int iZ = z();
        int i10 = this.f29650e;
        if (iZ <= this.f29648c - i10 && iZ > 0) {
            bArrW = this.f29646a;
            this.f29650e = i10 + iZ;
        } else {
            if (iZ == 0) {
                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            bArrW = w(iZ);
            i10 = 0;
        }
        if (x.f(bArrW, i10, i10 + iZ)) {
            return new String(bArrW, i10, iZ, "UTF-8");
        }
        throw C2952k.d();
    }

    public int J() throws C2952k {
        if (f()) {
            this.f29652g = 0;
            return 0;
        }
        int iZ = z();
        this.f29652g = iZ;
        if (y.a(iZ) != 0) {
            return this.f29652g;
        }
        throw C2952k.c();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public boolean O(int i10, C2947f c2947f) throws C2952k {
        int iB = y.b(i10);
        if (iB == 0) {
            long jS = s();
            c2947f.n0(i10);
            c2947f.y0(jS);
            return true;
        }
        if (iB == 1) {
            long jY = y();
            c2947f.n0(i10);
            c2947f.U(jY);
            return true;
        }
        if (iB == 2) {
            AbstractC2945d abstractC2945dK = k();
            c2947f.n0(i10);
            c2947f.O(abstractC2945dK);
            return true;
        }
        if (iB == 3) {
            c2947f.n0(i10);
            P(c2947f);
            int iC = y.c(y.a(i10), 4);
            a(iC);
            c2947f.n0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw C2952k.e();
        }
        int iX = x();
        c2947f.n0(i10);
        c2947f.T(iX);
        return true;
    }

    public void P(C2947f c2947f) throws C2952k {
        int iJ;
        do {
            iJ = J();
            if (iJ == 0) {
                return;
            }
        } while (O(iJ, c2947f));
    }

    public void Q(int i10) throws C2952k {
        int i11 = this.f29648c;
        int i12 = this.f29650e;
        if (i10 > i11 - i12 || i10 < 0) {
            R(i10);
        } else {
            this.f29650e = i12 + i10;
        }
    }

    public void a(int i10) throws C2952k {
        if (this.f29652g != i10) {
            throw C2952k.b();
        }
    }

    public int e() {
        int i10 = this.f29655j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f29654i + this.f29650e);
    }

    public boolean f() {
        return this.f29650e == this.f29648c && !S(1);
    }

    public void h(int i10) {
        this.f29655j = i10;
        M();
    }

    public int i(int i10) throws C2952k {
        if (i10 < 0) {
            throw C2952k.g();
        }
        int i11 = i10 + this.f29654i + this.f29650e;
        int i12 = this.f29655j;
        if (i11 > i12) {
            throw C2952k.k();
        }
        this.f29655j = i11;
        M();
        return i12;
    }

    public boolean j() {
        return B() != 0;
    }

    public AbstractC2945d k() {
        int iZ = z();
        int i10 = this.f29648c;
        int i11 = this.f29650e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? AbstractC2945d.f29639g : new o(w(iZ));
        }
        AbstractC2945d c2944c = (this.f29647b && this.f29653h) ? new C2944c(this.f29646a, this.f29650e, iZ) : AbstractC2945d.r(this.f29646a, i11, iZ);
        this.f29650e += iZ;
        return c2944c;
    }

    public double l() {
        return Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return Float.intBitsToFloat(x());
    }

    public void q(int i10, p.a aVar, C2948g c2948g) throws C2952k {
        int i11 = this.f29656k;
        if (i11 >= this.f29657l) {
            throw C2952k.h();
        }
        this.f29656k = i11 + 1;
        aVar.l0(this, c2948g);
        a(y.c(i10, 4));
        this.f29656k--;
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public p t(r rVar, C2948g c2948g) throws C2952k {
        int iZ = z();
        if (this.f29656k >= this.f29657l) {
            throw C2952k.h();
        }
        int i10 = i(iZ);
        this.f29656k++;
        p pVar = (p) rVar.a(this, c2948g);
        a(0);
        this.f29656k--;
        h(i10);
        return pVar;
    }

    public void u(p.a aVar, C2948g c2948g) throws C2952k {
        int iZ = z();
        if (this.f29656k >= this.f29657l) {
            throw C2952k.h();
        }
        int i10 = i(iZ);
        this.f29656k++;
        aVar.l0(this, c2948g);
        a(0);
        this.f29656k--;
        h(i10);
    }

    public byte v() throws C2952k {
        if (this.f29650e == this.f29648c) {
            N(1);
        }
        byte[] bArr = this.f29646a;
        int i10 = this.f29650e;
        this.f29650e = i10 + 1;
        return bArr[i10];
    }

    public int x() throws C2952k {
        int i10 = this.f29650e;
        if (this.f29648c - i10 < 4) {
            N(4);
            i10 = this.f29650e;
        }
        byte[] bArr = this.f29646a;
        this.f29650e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long y() throws C2952k {
        int i10 = this.f29650e;
        if (this.f29648c - i10 < 8) {
            N(8);
            i10 = this.f29650e;
        }
        byte[] bArr = this.f29646a;
        this.f29650e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public int z() {
        int i10;
        int i11 = this.f29650e;
        int i12 = this.f29648c;
        if (i12 != i11) {
            byte[] bArr = this.f29646a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f29650e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f29650e = i14;
                return i10;
            }
        }
        return (int) C();
    }
}
