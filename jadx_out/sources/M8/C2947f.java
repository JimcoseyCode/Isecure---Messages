package m8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: m8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2947f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f29659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29660b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final OutputStream f29663e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29662d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29661c = 0;

    /* JADX INFO: renamed from: m8.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C2947f(OutputStream outputStream, byte[] bArr) {
        this.f29663e = outputStream;
        this.f29659a = bArr;
        this.f29660b = bArr.length;
    }

    public static int A(long j10) {
        return v(G(j10));
    }

    public static int B(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return u(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported.", e10);
        }
    }

    public static int C(int i10) {
        return u(y.c(i10, 0));
    }

    public static int D(int i10) {
        return u(i10);
    }

    public static int E(long j10) {
        return v(j10);
    }

    public static int F(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long G(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static C2947f I(OutputStream outputStream, int i10) {
        return new C2947f(outputStream, new byte[i10]);
    }

    private void J() throws IOException {
        OutputStream outputStream = this.f29663e;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f29659a, 0, this.f29661c);
        this.f29661c = 0;
    }

    public static int a(int i10, boolean z10) {
        return C(i10) + b(z10);
    }

    public static int b(boolean z10) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return u(bArr.length) + bArr.length;
    }

    public static int d(int i10, AbstractC2945d abstractC2945d) {
        return C(i10) + e(abstractC2945d);
    }

    public static int e(AbstractC2945d abstractC2945d) {
        return u(abstractC2945d.size()) + abstractC2945d.size();
    }

    public static int f(int i10, double d10) {
        return C(i10) + g(d10);
    }

    public static int g(double d10) {
        return 8;
    }

    public static int h(int i10, int i11) {
        return C(i10) + i(i11);
    }

    public static int i(int i10) {
        return p(i10);
    }

    public static int j(int i10) {
        return 4;
    }

    public static int k(long j10) {
        return 8;
    }

    public static int l(int i10, float f10) {
        return C(i10) + m(f10);
    }

    public static int m(float f10) {
        return 4;
    }

    public static int n(p pVar) {
        return pVar.b();
    }

    public static int o(int i10, int i11) {
        return C(i10) + p(i11);
    }

    public static int p(int i10) {
        if (i10 >= 0) {
            return u(i10);
        }
        return 10;
    }

    public static int q(long j10) {
        return v(j10);
    }

    public static int r(int i10, p pVar) {
        return C(i10) + s(pVar);
    }

    public static int s(p pVar) {
        int iB = pVar.b();
        return u(iB) + iB;
    }

    static int t(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int u(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int v(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int w(int i10) {
        return 4;
    }

    public static int x(long j10) {
        return 8;
    }

    public static int y(int i10) {
        return u(F(i10));
    }

    public static int z(int i10, long j10) {
        return C(i10) + A(j10);
    }

    public void H() throws IOException {
        if (this.f29663e != null) {
            J();
        }
    }

    public void K(int i10, boolean z10) throws IOException {
        v0(i10, 0);
        L(z10);
    }

    public void L(boolean z10) throws IOException {
        g0(z10 ? 1 : 0);
    }

    public void M(byte[] bArr) throws IOException {
        n0(bArr.length);
        j0(bArr);
    }

    public void N(int i10, AbstractC2945d abstractC2945d) {
        v0(i10, 2);
        O(abstractC2945d);
    }

    public void O(AbstractC2945d abstractC2945d) {
        n0(abstractC2945d.size());
        h0(abstractC2945d);
    }

    public void P(int i10, double d10) throws IOException {
        v0(i10, 1);
        Q(d10);
    }

    public void Q(double d10) throws IOException {
        m0(Double.doubleToRawLongBits(d10));
    }

    public void R(int i10, int i11) throws IOException {
        v0(i10, 0);
        S(i11);
    }

    public void S(int i10) throws IOException {
        a0(i10);
    }

    public void T(int i10) {
        l0(i10);
    }

    public void U(long j10) {
        m0(j10);
    }

    public void V(int i10, float f10) throws IOException {
        v0(i10, 5);
        W(f10);
    }

    public void W(float f10) throws IOException {
        l0(Float.floatToRawIntBits(f10));
    }

    public void X(int i10, p pVar) {
        v0(i10, 3);
        Y(pVar);
        v0(i10, 4);
    }

    public void Y(p pVar) {
        pVar.g(this);
    }

    public void Z(int i10, int i11) throws IOException {
        v0(i10, 0);
        a0(i11);
    }

    public void a0(int i10) throws IOException {
        if (i10 >= 0) {
            n0(i10);
        } else {
            o0(i10);
        }
    }

    public void b0(long j10) throws IOException {
        o0(j10);
    }

    public void c0(int i10, p pVar) {
        v0(i10, 2);
        d0(pVar);
    }

    public void d0(p pVar) {
        n0(pVar.b());
        pVar.g(this);
    }

    public void e0(int i10, p pVar) {
        v0(1, 3);
        w0(2, i10);
        c0(3, pVar);
        v0(1, 4);
    }

    public void f0(byte b10) throws IOException {
        if (this.f29661c == this.f29660b) {
            J();
        }
        byte[] bArr = this.f29659a;
        int i10 = this.f29661c;
        this.f29661c = i10 + 1;
        bArr[i10] = b10;
        this.f29662d++;
    }

    public void g0(int i10) throws IOException {
        f0((byte) i10);
    }

    public void h0(AbstractC2945d abstractC2945d) throws IOException {
        i0(abstractC2945d, 0, abstractC2945d.size());
    }

    public void i0(AbstractC2945d abstractC2945d, int i10, int i11) throws IOException {
        int i12 = this.f29660b;
        int i13 = this.f29661c;
        if (i12 - i13 >= i11) {
            abstractC2945d.t(this.f29659a, i10, i13, i11);
            this.f29661c += i11;
            this.f29662d += i11;
            return;
        }
        int i14 = i12 - i13;
        abstractC2945d.t(this.f29659a, i10, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f29661c = this.f29660b;
        this.f29662d += i14;
        J();
        if (i16 <= this.f29660b) {
            abstractC2945d.t(this.f29659a, i15, 0, i16);
            this.f29661c = i16;
        } else {
            abstractC2945d.F(this.f29663e, i15, i16);
        }
        this.f29662d += i16;
    }

    public void j0(byte[] bArr) throws IOException {
        k0(bArr, 0, bArr.length);
    }

    public void k0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f29660b;
        int i13 = this.f29661c;
        if (i12 - i13 >= i11) {
            System.arraycopy(bArr, i10, this.f29659a, i13, i11);
            this.f29661c += i11;
            this.f29662d += i11;
            return;
        }
        int i14 = i12 - i13;
        System.arraycopy(bArr, i10, this.f29659a, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f29661c = this.f29660b;
        this.f29662d += i14;
        J();
        if (i16 <= this.f29660b) {
            System.arraycopy(bArr, i15, this.f29659a, 0, i16);
            this.f29661c = i16;
        } else {
            this.f29663e.write(bArr, i15, i16);
        }
        this.f29662d += i16;
    }

    public void l0(int i10) throws IOException {
        g0(i10 & 255);
        g0((i10 >> 8) & 255);
        g0((i10 >> 16) & 255);
        g0((i10 >> 24) & 255);
    }

    public void m0(long j10) throws IOException {
        g0(((int) j10) & 255);
        g0(((int) (j10 >> 8)) & 255);
        g0(((int) (j10 >> 16)) & 255);
        g0(((int) (j10 >> 24)) & 255);
        g0(((int) (j10 >> 32)) & 255);
        g0(((int) (j10 >> 40)) & 255);
        g0(((int) (j10 >> 48)) & 255);
        g0(((int) (j10 >> 56)) & 255);
    }

    public void n0(int i10) {
        while ((i10 & (-128)) != 0) {
            g0((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            i10 >>>= 7;
        }
        g0(i10);
    }

    public void o0(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            g0((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            j10 >>>= 7;
        }
        g0((int) j10);
    }

    public void p0(int i10) throws IOException {
        l0(i10);
    }

    public void q0(long j10) throws IOException {
        m0(j10);
    }

    public void r0(int i10) {
        n0(F(i10));
    }

    public void s0(int i10, long j10) throws IOException {
        v0(i10, 0);
        t0(j10);
    }

    public void t0(long j10) throws IOException {
        o0(G(j10));
    }

    public void u0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        n0(bytes.length);
        j0(bytes);
    }

    public void v0(int i10, int i11) {
        n0(y.c(i10, i11));
    }

    public void w0(int i10, int i11) {
        v0(i10, 0);
        x0(i11);
    }

    public void x0(int i10) {
        n0(i10);
    }

    public void y0(long j10) {
        o0(j10);
    }
}
