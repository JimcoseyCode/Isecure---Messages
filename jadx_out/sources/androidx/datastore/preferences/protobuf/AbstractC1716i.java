package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.j0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1716i extends AbstractC1712e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f16871c = Logger.getLogger(AbstractC1716i.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f16872d = i0.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C1717j f16873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16874b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class b extends AbstractC1716i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f16875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f16876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16877g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16878h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f16875e = bArr;
            this.f16876f = bArr.length;
        }

        final void R0(byte b10) {
            byte[] bArr = this.f16875e;
            int i10 = this.f16877g;
            this.f16877g = i10 + 1;
            bArr[i10] = b10;
            this.f16878h++;
        }

        final void S0(int i10) {
            byte[] bArr = this.f16875e;
            int i11 = this.f16877g;
            int i12 = i11 + 1;
            this.f16877g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f16877g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f16877g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f16877g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f16878h += 4;
        }

        final void T0(long j10) {
            byte[] bArr = this.f16875e;
            int i10 = this.f16877g;
            int i11 = i10 + 1;
            this.f16877g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f16877g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f16877g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f16877g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f16877g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f16877g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f16877g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f16877g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f16878h += 8;
        }

        final void U0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        final void V0(int i10, int i11) {
            W0(k0.c(i10, i11));
        }

        final void W0(int i10) {
            if (!AbstractC1716i.f16872d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f16875e;
                    int i11 = this.f16877g;
                    this.f16877g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                    this.f16878h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f16875e;
                int i12 = this.f16877g;
                this.f16877g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f16878h++;
                return;
            }
            long j10 = this.f16877g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f16875e;
                int i13 = this.f16877g;
                this.f16877g = i13 + 1;
                i0.H(bArr3, i13, (byte) ((i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f16875e;
            int i14 = this.f16877g;
            this.f16877g = i14 + 1;
            i0.H(bArr4, i14, (byte) i10);
            this.f16878h += (int) (((long) this.f16877g) - j10);
        }

        final void X0(long j10) {
            if (!AbstractC1716i.f16872d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f16875e;
                    int i10 = this.f16877g;
                    this.f16877g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                    this.f16878h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f16875e;
                int i11 = this.f16877g;
                this.f16877g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f16878h++;
                return;
            }
            long j11 = this.f16877g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f16875e;
                int i12 = this.f16877g;
                this.f16877g = i12 + 1;
                i0.H(bArr3, i12, (byte) ((((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f16875e;
            int i13 = this.f16877g;
            this.f16877g = i13 + 1;
            i0.H(bArr4, i13, (byte) j10);
            this.f16878h += (int) (((long) this.f16877g) - j11);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f16879i;

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f16879i = outputStream;
        }

        private void Y0() throws IOException {
            this.f16879i.write(this.f16875e, 0, this.f16877g);
            this.f16877g = 0;
        }

        private void Z0(int i10) throws IOException {
            if (this.f16876f - this.f16877g < i10) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void A0(int i10, J j10) throws IOException {
            M0(1, 3);
            N0(2, i10);
            b1(3, j10);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void B0(int i10, AbstractC1713f abstractC1713f) throws IOException {
            M0(1, 3);
            N0(2, i10);
            e0(3, abstractC1713f);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void K0(int i10, String str) throws IOException {
            M0(i10, 2);
            L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void L0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iQ = AbstractC1716i.Q(length);
                int i10 = iQ + length;
                int i11 = this.f16876f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = j0.b(str, bArr, 0, length);
                    O0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f16877g) {
                    Y0();
                }
                int iQ2 = AbstractC1716i.Q(str.length());
                int i12 = this.f16877g;
                try {
                    if (iQ2 == iQ) {
                        int i13 = i12 + iQ2;
                        this.f16877g = i13;
                        int iB2 = j0.b(str, this.f16875e, i13, this.f16876f - i13);
                        this.f16877g = i12;
                        iC = (iB2 - i12) - iQ2;
                        W0(iC);
                        this.f16877g = iB2;
                    } else {
                        iC = j0.c(str);
                        W0(iC);
                        this.f16877g = j0.b(str, this.f16875e, this.f16877g, iC);
                    }
                    this.f16878h += iC;
                } catch (j0.d e10) {
                    this.f16878h -= this.f16877g - i12;
                    this.f16877g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new c(e11);
                }
            } catch (j0.d e12) {
                W(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void M0(int i10, int i11) throws IOException {
            O0(k0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void N0(int i10, int i11) throws IOException {
            Z0(20);
            V0(i10, 0);
            W0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void O0(int i10) throws IOException {
            Z0(5);
            W0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void P0(int i10, long j10) throws IOException {
            Z0(20);
            V0(i10, 0);
            X0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void Q0(long j10) throws IOException {
            Z0(10);
            X0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void V() throws IOException {
            if (this.f16877g > 0) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void Z(byte b10) throws IOException {
            if (this.f16877g == this.f16876f) {
                Y0();
            }
            R0(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i, androidx.datastore.preferences.protobuf.AbstractC1712e
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void a0(int i10, boolean z10) throws IOException {
            Z0(11);
            V0(i10, 0);
            R0(z10 ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f16876f;
            int i13 = this.f16877g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f16875e, i13, i11);
                this.f16877g += i11;
                this.f16878h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f16875e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f16877g = this.f16876f;
            this.f16878h += i14;
            Y0();
            if (i16 <= this.f16876f) {
                System.arraycopy(bArr, i15, this.f16875e, 0, i16);
                this.f16877g = i16;
            } else {
                this.f16879i.write(bArr, i15, i16);
            }
            this.f16878h += i16;
        }

        public void b1(int i10, J j10) throws IOException {
            M0(i10, 2);
            z0(j10);
        }

        void c1(J j10, Y y10) throws IOException {
            O0(((AbstractC1708a) j10).f(y10));
            y10.e(j10, this.f16873a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void d0(byte[] bArr, int i10, int i11) throws IOException {
            O0(i11);
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void e0(int i10, AbstractC1713f abstractC1713f) throws IOException {
            M0(i10, 2);
            f0(abstractC1713f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void f0(AbstractC1713f abstractC1713f) throws IOException {
            O0(abstractC1713f.size());
            abstractC1713f.F(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void k0(int i10, int i11) throws IOException {
            Z0(14);
            V0(i10, 5);
            S0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void l0(int i10) throws IOException {
            Z0(4);
            S0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void m0(int i10, long j10) throws IOException {
            Z0(18);
            V0(i10, 1);
            T0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void n0(long j10) throws IOException {
            Z0(8);
            T0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void u0(int i10, int i11) throws IOException {
            Z0(20);
            V0(i10, 0);
            U0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void v0(int i10) throws IOException {
            if (i10 >= 0) {
                O0(i10);
            } else {
                Q0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        void y0(int i10, J j10, Y y10) throws IOException {
            M0(i10, 2);
            c1(j10, y10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1716i
        public void z0(J j10) throws IOException {
            O0(j10.b());
            j10.e(this);
        }
    }

    public static int A(J j10) {
        return y(j10.b());
    }

    static int B(J j10, Y y10) {
        return y(((AbstractC1708a) j10).f(y10));
    }

    static int C(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int D(int i10, AbstractC1713f abstractC1713f) {
        return (O(1) * 2) + P(2, i10) + f(3, abstractC1713f);
    }

    public static int E(int i10, int i11) {
        return O(i10) + F(i11);
    }

    public static int F(int i10) {
        return 4;
    }

    public static int G(int i10, long j10) {
        return O(i10) + H(j10);
    }

    public static int H(long j10) {
        return 8;
    }

    public static int I(int i10, int i11) {
        return O(i10) + J(i11);
    }

    public static int J(int i10) {
        return Q(T(i10));
    }

    public static int K(int i10, long j10) {
        return O(i10) + L(j10);
    }

    public static int L(long j10) {
        return S(U(j10));
    }

    public static int M(int i10, String str) {
        return O(i10) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = j0.c(str);
        } catch (j0.d unused) {
            length = str.getBytes(AbstractC1727u.f17040b).length;
        }
        return y(length);
    }

    public static int O(int i10) {
        return Q(k0.c(i10, 0));
    }

    public static int P(int i10, int i11) {
        return O(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int R(int i10, long j10) {
        return O(i10) + S(j10);
    }

    public static int S(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int T(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long U(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static AbstractC1716i Y(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int c(int i10, boolean z10) {
        return O(i10) + d(z10);
    }

    public static int d(boolean z10) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i10, AbstractC1713f abstractC1713f) {
        return O(i10) + g(abstractC1713f);
    }

    public static int g(AbstractC1713f abstractC1713f) {
        return y(abstractC1713f.size());
    }

    public static int h(int i10, double d10) {
        return O(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return O(i10) + k(i11);
    }

    public static int k(int i10) {
        return v(i10);
    }

    public static int l(int i10, int i11) {
        return O(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return O(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return O(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    static int r(int i10, J j10, Y y10) {
        return (O(i10) * 2) + t(j10, y10);
    }

    public static int s(J j10) {
        return j10.b();
    }

    static int t(J j10, Y y10) {
        return ((AbstractC1708a) j10).f(y10);
    }

    public static int u(int i10, int i11) {
        return O(i10) + v(i11);
    }

    public static int v(int i10) {
        return S(i10);
    }

    public static int w(int i10, long j10) {
        return O(i10) + x(j10);
    }

    public static int x(long j10) {
        return S(j10);
    }

    static int y(int i10) {
        return Q(i10) + i10;
    }

    static int z(int i10, J j10, Y y10) {
        return O(i10) + B(j10, y10);
    }

    public abstract void A0(int i10, J j10);

    public abstract void B0(int i10, AbstractC1713f abstractC1713f);

    public final void C0(int i10, int i11) {
        k0(i10, i11);
    }

    public final void D0(int i10) {
        l0(i10);
    }

    public final void E0(int i10, long j10) {
        m0(i10, j10);
    }

    public final void F0(long j10) {
        n0(j10);
    }

    public final void G0(int i10, int i11) {
        N0(i10, T(i11));
    }

    public final void H0(int i10) {
        O0(T(i10));
    }

    public final void I0(int i10, long j10) {
        P0(i10, U(j10));
    }

    public final void J0(long j10) {
        Q0(U(j10));
    }

    public abstract void K0(int i10, String str);

    public abstract void L0(String str);

    public abstract void M0(int i10, int i11);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10);

    public abstract void P0(int i10, long j10);

    public abstract void Q0(long j10);

    public abstract void V();

    final void W(String str, j0.d dVar) throws c {
        f16871c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC1727u.f17040b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    boolean X() {
        return this.f16874b;
    }

    public abstract void Z(byte b10);

    @Override // androidx.datastore.preferences.protobuf.AbstractC1712e
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, boolean z10);

    public final void b0(boolean z10) {
        Z(z10 ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    abstract void d0(byte[] bArr, int i10, int i11);

    public abstract void e0(int i10, AbstractC1713f abstractC1713f);

    public abstract void f0(AbstractC1713f abstractC1713f);

    public final void g0(int i10, double d10) {
        m0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void h0(double d10) {
        n0(Double.doubleToRawLongBits(d10));
    }

    public final void i0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void j0(int i10) {
        v0(i10);
    }

    public abstract void k0(int i10, int i11);

    public abstract void l0(int i10);

    public abstract void m0(int i10, long j10);

    public abstract void n0(long j10);

    public final void o0(int i10, float f10) {
        k0(i10, Float.floatToRawIntBits(f10));
    }

    public final void p0(float f10) {
        l0(Float.floatToRawIntBits(f10));
    }

    public final void q0(int i10, J j10) {
        M0(i10, 3);
        s0(j10);
        M0(i10, 4);
    }

    final void r0(int i10, J j10, Y y10) {
        M0(i10, 3);
        t0(j10, y10);
        M0(i10, 4);
    }

    public final void s0(J j10) {
        j10.e(this);
    }

    final void t0(J j10, Y y10) {
        y10.e(j10, this.f16873a);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public final void w0(int i10, long j10) {
        P0(i10, j10);
    }

    public final void x0(long j10) {
        Q0(j10);
    }

    abstract void y0(int i10, J j10, Y y10);

    public abstract void z0(J j10);

    private AbstractC1716i() {
    }
}
