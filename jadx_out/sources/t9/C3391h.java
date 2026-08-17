package t9;

import P8.C1385d;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: t9.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3391h implements j, InterfaceC3392i, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A f32592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32593h;

    /* JADX INFO: renamed from: t9.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C3391h f32594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f32595h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private A f32596i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f32598k;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f32597j = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f32599l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f32600m = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f32594g == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f32594g = null;
            r(null);
            this.f32597j = -1L;
            this.f32598k = null;
            this.f32599l = -1;
            this.f32600m = -1;
        }

        public final A d() {
            return this.f32596i;
        }

        public final int e() {
            long j10 = this.f32597j;
            C3391h c3391h = this.f32594g;
            AbstractC2855l.d(c3391h);
            if (j10 == c3391h.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f32597j;
            return m(j11 == -1 ? 0L : j11 + ((long) (this.f32600m - this.f32599l)));
        }

        public final long k(long j10) {
            C3391h c3391h = this.f32594g;
            if (c3391h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f32595h) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c3391h.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    A a10 = c3391h.f32592g;
                    AbstractC2855l.d(a10);
                    A a11 = a10.f32557g;
                    AbstractC2855l.d(a11);
                    int i10 = a11.f32553c;
                    long j12 = i10 - a11.f32552b;
                    if (j12 > j11) {
                        a11.f32553c = i10 - ((int) j11);
                        break;
                    }
                    c3391h.f32592g = a11.b();
                    B.b(a11);
                    j11 -= j12;
                }
                r(null);
                this.f32597j = j10;
                this.f32598k = null;
                this.f32599l = -1;
                this.f32600m = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    A aR0 = c3391h.R0(1);
                    int iMin = (int) Math.min(j13, 8192 - aR0.f32553c);
                    aR0.f32553c += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        r(aR0);
                        this.f32597j = size;
                        this.f32598k = aR0.f32551a;
                        int i11 = aR0.f32553c;
                        this.f32599l = i11 - iMin;
                        this.f32600m = i11;
                        z10 = false;
                    }
                }
            }
            c3391h.O0(j10);
            return size;
        }

        public final int m(long j10) {
            A aC;
            C3391h c3391h = this.f32594g;
            if (c3391h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > c3391h.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c3391h.size());
            }
            if (j10 == -1 || j10 == c3391h.size()) {
                r(null);
                this.f32597j = j10;
                this.f32598k = null;
                this.f32599l = -1;
                this.f32600m = -1;
                return -1;
            }
            long size = c3391h.size();
            A aD = c3391h.f32592g;
            long j11 = 0;
            if (d() != null) {
                long j12 = this.f32597j;
                int i10 = this.f32599l;
                A aD2 = d();
                AbstractC2855l.d(aD2);
                long j13 = j12 - ((long) (i10 - aD2.f32552b));
                if (j13 > j10) {
                    aC = aD;
                    aD = d();
                    size = j13;
                } else {
                    aC = d();
                    j11 = j13;
                }
            } else {
                aC = aD;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    AbstractC2855l.d(aC);
                    int i11 = aC.f32553c;
                    int i12 = aC.f32552b;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    aC = aC.f32556f;
                }
            } else {
                while (size > j10) {
                    AbstractC2855l.d(aD);
                    aD = aD.f32557g;
                    AbstractC2855l.d(aD);
                    size -= (long) (aD.f32553c - aD.f32552b);
                }
                j11 = size;
                aC = aD;
            }
            if (this.f32595h) {
                AbstractC2855l.d(aC);
                if (aC.f32554d) {
                    A aF = aC.f();
                    if (c3391h.f32592g == aC) {
                        c3391h.f32592g = aF;
                    }
                    aC = aC.c(aF);
                    A a10 = aC.f32557g;
                    AbstractC2855l.d(a10);
                    a10.b();
                }
            }
            r(aC);
            this.f32597j = j10;
            AbstractC2855l.d(aC);
            this.f32598k = aC.f32551a;
            int i13 = aC.f32552b + ((int) (j10 - j11));
            this.f32599l = i13;
            int i14 = aC.f32553c;
            this.f32600m = i14;
            return i14 - i13;
        }

        public final void r(A a10) {
            this.f32596i = a10;
        }
    }

    /* JADX INFO: renamed from: t9.h$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return C3391h.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C3391h.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            AbstractC2855l.g(data, "data");
            C3391h.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a J0(C3391h c3391h, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC3388e.d();
        }
        return c3391h.D0(aVar);
    }

    public final C3391h A() {
        C3391h c3391h = new C3391h();
        if (size() == 0) {
            return c3391h;
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        A aD = a10.d();
        c3391h.f32592g = aD;
        aD.f32557g = aD;
        aD.f32556f = aD;
        for (A a11 = a10.f32556f; a11 != a10; a11 = a11.f32556f) {
            A a12 = aD.f32557g;
            AbstractC2855l.d(a12);
            AbstractC2855l.d(a11);
            a12.c(a11.d());
        }
        c3391h.O0(size());
        return c3391h;
    }

    public boolean A0(long j10, k bytes, int i10, int i11) {
        AbstractC2855l.g(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.E() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (M(((long) i12) + j10) != bytes.p(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final C3391h B(C3391h out, long j10, long j11) {
        AbstractC2855l.g(out, "out");
        long j12 = j10;
        AbstractC3388e.b(size(), j12, j11);
        if (j11 != 0) {
            out.O0(out.size() + j11);
            A a10 = this.f32592g;
            while (true) {
                AbstractC2855l.d(a10);
                int i10 = a10.f32553c;
                int i11 = a10.f32552b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                a10 = a10.f32556f;
            }
            A a11 = a10;
            long j13 = j11;
            while (j13 > 0) {
                AbstractC2855l.d(a11);
                A aD = a11.d();
                int i12 = aD.f32552b + ((int) j12);
                aD.f32552b = i12;
                aD.f32553c = Math.min(i12 + ((int) j13), aD.f32553c);
                A a12 = out.f32592g;
                if (a12 == null) {
                    aD.f32557g = aD;
                    aD.f32556f = aD;
                    out.f32592g = aD;
                } else {
                    AbstractC2855l.d(a12);
                    A a13 = a12.f32557g;
                    AbstractC2855l.d(a13);
                    a13.c(aD);
                }
                j13 -= (long) (aD.f32553c - aD.f32552b);
                a11 = a11.f32556f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // t9.j
    public void B0(long j10) throws EOFException {
        if (this.f32593h < j10) {
            throw new EOFException();
        }
    }

    @Override // t9.j
    public byte[] C() {
        return n0(size());
    }

    @Override // t9.j
    public boolean D() {
        return this.f32593h == 0;
    }

    public final a D0(a unsafeCursor) {
        AbstractC2855l.g(unsafeCursor, "unsafeCursor");
        return u9.a.a(this, unsafeCursor);
    }

    @Override // t9.InterfaceC3392i
    public OutputStream E0() {
        return new c();
    }

    @Override // t9.InterfaceC3392i
    public long G(F source) {
        AbstractC2855l.g(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // t9.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long G0() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            A a10 = this.f32592g;
            AbstractC2855l.d(a10);
            byte[] bArr = a10.f32551a;
            int i12 = a10.f32552b;
            int i13 = a10.f32553c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else if (b10 >= 65 && b10 <= 70) {
                    i10 = b10 - 55;
                } else {
                    if (i11 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC3388e.j(b10));
                    }
                    z10 = true;
                    if (i12 != i13) {
                        this.f32592g = a10.b();
                        B.b(a10);
                    } else {
                        a10.f32552b = i12;
                    }
                    if (!z10) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new C3391h().a0(j10).writeByte(b10).q0());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 != i13) {
            }
            if (!z10) {
            }
        } while (this.f32592g != null);
        O0(size() - ((long) i11));
        return j10;
    }

    @Override // t9.j
    public int H0(v options) throws EOFException {
        AbstractC2855l.g(options, "options");
        int iF = u9.a.f(this, options, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        skip(options.s()[iF].E());
        return iF;
    }

    public int K0() {
        return AbstractC3388e.h(readInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new t9.C3391h().X0(r8).W0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.q0());
     */
    @Override // t9.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long L() throws EOFException {
        long j10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            A a10 = this.f32592g;
            AbstractC2855l.d(a10);
            byte[] bArr = a10.f32551a;
            int i11 = a10.f32552b;
            int i12 = a10.f32553c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            j10 = j11;
            if (i11 == i12) {
                this.f32592g = a10.b();
                B.b(a10);
            } else {
                a10.f32552b = i11;
            }
            if (z11 || this.f32592g == null) {
                break;
            }
            j11 = j10;
        }
        O0(size() - ((long) i10));
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j12 : -j12;
        }
        if (size() == j10) {
            throw new EOFException();
        }
        throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + AbstractC3388e.j(M(j10)));
    }

    public short L0() {
        return AbstractC3388e.i(readShort());
    }

    public final byte M(long j10) {
        AbstractC3388e.b(size(), j10, 1L);
        A a10 = this.f32592g;
        if (a10 == null) {
            AbstractC2855l.d(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                a10 = a10.f32557g;
                AbstractC2855l.d(a10);
                size -= (long) (a10.f32553c - a10.f32552b);
            }
            AbstractC2855l.d(a10);
            return a10.f32551a[(int) ((((long) a10.f32552b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (a10.f32553c - a10.f32552b)) + j11;
            if (j12 > j10) {
                AbstractC2855l.d(a10);
                return a10.f32551a[(int) ((((long) a10.f32552b) + j10) - j11)];
            }
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
            j11 = j12;
        }
    }

    public String M0(long j10, Charset charset) throws EOFException {
        AbstractC2855l.g(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f32593h < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        int i10 = a10.f32552b;
        if (((long) i10) + j10 > a10.f32553c) {
            return new String(n0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(a10.f32551a, i10, i11, charset);
        int i12 = a10.f32552b + i11;
        a10.f32552b = i12;
        this.f32593h -= j10;
        if (i12 == a10.f32553c) {
            this.f32592g = a10.b();
            B.b(a10);
        }
        return str;
    }

    public String N0(long j10) throws EOFException {
        return M0(j10, C1385d.f8858b);
    }

    public final void O0(long j10) {
        this.f32593h = j10;
    }

    @Override // t9.j
    public String P(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jW = W((byte) 10, 0L, j11);
        if (jW != -1) {
            return u9.a.d(this, jW);
        }
        if (j11 < size() && M(j11 - 1) == 13 && M(j11) == 10) {
            return u9.a.d(this, j11);
        }
        C3391h c3391h = new C3391h();
        B(c3391h, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c3391h.c0().u() + (char) 8230);
    }

    public final k P0() {
        if (size() <= 2147483647L) {
            return Q0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // t9.j
    public void Q(C3391h sink, long j10) throws EOFException {
        AbstractC2855l.g(sink, "sink");
        if (size() >= j10) {
            sink.write(this, j10);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    public final k Q0(int i10) {
        if (i10 == 0) {
            return k.f32604k;
        }
        AbstractC3388e.b(size(), 0L, i10);
        A a10 = this.f32592g;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            AbstractC2855l.d(a10);
            int i14 = a10.f32553c;
            int i15 = a10.f32552b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            a10 = a10.f32556f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        A a11 = this.f32592g;
        int i16 = 0;
        while (i11 < i10) {
            AbstractC2855l.d(a11);
            bArr[i16] = a11.f32551a;
            i11 += a11.f32553c - a11.f32552b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = a11.f32552b;
            a11.f32554d = true;
            i16++;
            a11 = a11.f32556f;
        }
        return new C(bArr, iArr);
    }

    public final A R0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        A a10 = this.f32592g;
        if (a10 != null) {
            AbstractC2855l.d(a10);
            A a11 = a10.f32557g;
            AbstractC2855l.d(a11);
            return (a11.f32553c + i10 > 8192 || !a11.f32555e) ? a11.c(B.c()) : a11;
        }
        A aC = B.c();
        this.f32592g = aC;
        aC.f32557g = aC;
        aC.f32556f = aC;
        return aC;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C3391h S(k byteString) {
        AbstractC2855l.g(byteString, "byteString");
        byteString.J(this, 0, byteString.E());
        return this;
    }

    public C3391h T0(F source, long j10) throws EOFException {
        AbstractC2855l.g(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return this;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C3391h write(byte[] source) {
        AbstractC2855l.g(source, "source");
        return write(source, 0, source.length);
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C3391h write(byte[] source, int i10, int i11) {
        AbstractC2855l.g(source, "source");
        long j10 = i11;
        AbstractC3388e.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            A aR0 = R0(1);
            int iMin = Math.min(i12 - i10, 8192 - aR0.f32553c);
            int i13 = i10 + iMin;
            AbstractC2793j.f(source, aR0.f32551a, aR0.f32553c, i10, i13);
            aR0.f32553c += iMin;
            i10 = i13;
        }
        O0(size() + j10);
        return this;
    }

    public long W(byte b10, long j10, long j11) {
        A a10;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (a10 = this.f32592g) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                a10 = a10.f32557g;
                AbstractC2855l.d(a10);
                size -= (long) (a10.f32553c - a10.f32552b);
            }
            while (size < j11) {
                byte[] bArr = a10.f32551a;
                int iMin = (int) Math.min(a10.f32553c, (((long) a10.f32552b) + j11) - size);
                i10 = (int) ((((long) a10.f32552b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (a10.f32553c - a10.f32552b);
                a10 = a10.f32556f;
                AbstractC2855l.d(a10);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (a10.f32553c - a10.f32552b)) + size;
            if (j12 > j10) {
                break;
            }
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = a10.f32551a;
            int iMin2 = (int) Math.min(a10.f32553c, (((long) a10.f32552b) + j11) - size);
            i10 = (int) ((((long) a10.f32552b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (a10.f32553c - a10.f32552b);
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - a10.f32552b)) + size;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public C3391h writeByte(int i10) {
        A aR0 = R0(1);
        byte[] bArr = aR0.f32551a;
        int i11 = aR0.f32553c;
        aR0.f32553c = i11 + 1;
        bArr[i11] = (byte) i10;
        O0(size() + 1);
        return this;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C3391h C0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return V("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        A aR0 = R0(i10);
        byte[] bArr = aR0.f32551a;
        int i11 = aR0.f32553c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = u9.a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        aR0.f32553c += i10;
        O0(size() + ((long) i10));
        return this;
    }

    @Override // t9.j
    public String Y(Charset charset) {
        AbstractC2855l.g(charset, "charset");
        return M0(this.f32593h, charset);
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C3391h a0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        A aR0 = R0(i10);
        byte[] bArr = aR0.f32551a;
        int i11 = aR0.f32553c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = u9.a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        aR0.f32553c += i10;
        O0(size() + ((long) i10));
        return this;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C3391h writeInt(int i10) {
        A aR0 = R0(4);
        byte[] bArr = aR0.f32551a;
        int i11 = aR0.f32553c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        aR0.f32553c = i11 + 4;
        O0(size() + 4);
        return this;
    }

    public C3391h a1(long j10) {
        A aR0 = R0(8);
        byte[] bArr = aR0.f32551a;
        int i10 = aR0.f32553c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        aR0.f32553c = i10 + 8;
        O0(size() + 8);
        return this;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C3391h writeShort(int i10) {
        A aR0 = R0(2);
        byte[] bArr = aR0.f32551a;
        int i11 = aR0.f32553c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        aR0.f32553c = i11 + 2;
        O0(size() + 2);
        return this;
    }

    @Override // t9.j
    public k c0() {
        return t(size());
    }

    public C3391h c1(String string, int i10, int i11, Charset charset) {
        AbstractC2855l.g(string, "string");
        AbstractC2855l.g(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (AbstractC2855l.b(charset, C1385d.f8858b)) {
            return f1(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        AbstractC2855l.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        AbstractC2855l.f(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    public long d0(k bytes) {
        AbstractC2855l.g(bytes, "bytes");
        return g0(bytes, 0L);
    }

    public C3391h d1(String string, Charset charset) {
        AbstractC2855l.g(string, "string");
        AbstractC2855l.g(charset, "charset");
        return c1(string, 0, string.length(), charset);
    }

    public final long e() {
        return this.f32593h;
    }

    @Override // t9.j
    public boolean e0(long j10) {
        return this.f32593h >= j10;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C3391h V(String string) {
        AbstractC2855l.g(string, "string");
        return f1(string, 0, string.length());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3391h)) {
            return false;
        }
        C3391h c3391h = (C3391h) obj;
        if (size() != c3391h.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        A a11 = c3391h.f32592g;
        AbstractC2855l.d(a11);
        int i10 = a10.f32552b;
        int i11 = a11.f32552b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(a10.f32553c - i10, a11.f32553c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (a10.f32551a[i10] != a11.f32551a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == a10.f32553c) {
                a10 = a10.f32556f;
                AbstractC2855l.d(a10);
                i10 = a10.f32552b;
            }
            if (i11 == a11.f32553c) {
                a11 = a11.f32556f;
                AbstractC2855l.d(a11);
                i11 = a11.f32552b;
            }
            j10 += jMin;
        }
        return true;
    }

    public C3391h f1(String string, int i10, int i11) {
        char cCharAt;
        AbstractC2855l.g(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                A aR0 = R0(1);
                byte[] bArr = aR0.f32551a;
                int i12 = aR0.f32553c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = aR0.f32553c;
                int i15 = (i12 + i10) - i14;
                aR0.f32553c = i14 + i15;
                O0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    A aR02 = R0(2);
                    byte[] bArr2 = aR02.f32551a;
                    int i16 = aR02.f32553c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | JfifUtil.MARKER_SOFn);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    aR02.f32553c = i16 + 2;
                    O0(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    A aR03 = R0(3);
                    byte[] bArr3 = aR03.f32551a;
                    int i17 = aR03.f32553c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    aR03.f32553c = i17 + 3;
                    O0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        A aR04 = R0(4);
                        byte[] bArr4 = aR04.f32551a;
                        int i20 = aR04.f32553c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        aR04.f32553c = i20 + 4;
                        O0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public long g0(k bytes, long j10) {
        int i10;
        long j11 = j10;
        AbstractC2855l.g(bytes, "bytes");
        if (bytes.E() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        A a10 = this.f32592g;
        if (a10 == null) {
            return -1L;
        }
        if (size() - j11 >= j11) {
            while (true) {
                long j12 = ((long) (a10.f32553c - a10.f32552b)) + size;
                if (j12 > j11) {
                    break;
                }
                a10 = a10.f32556f;
                AbstractC2855l.d(a10);
                size = j12;
            }
            byte[] bArrV = bytes.v();
            byte b10 = bArrV[0];
            int iE = bytes.E();
            long size2 = (size() - ((long) iE)) + 1;
            while (size < size2) {
                byte[] bArr = a10.f32551a;
                int iMin = (int) Math.min(a10.f32553c, (((long) a10.f32552b) + size2) - size);
                i10 = (int) ((((long) a10.f32552b) + j11) - size);
                while (i10 < iMin) {
                    if (bArr[i10] == b10 && u9.a.c(a10, i10 + 1, bArrV, 1, iE)) {
                    }
                    i10++;
                }
                size += (long) (a10.f32553c - a10.f32552b);
                a10 = a10.f32556f;
                AbstractC2855l.d(a10);
                j11 = size;
            }
            return -1L;
        }
        size = size();
        while (size > j11) {
            a10 = a10.f32557g;
            AbstractC2855l.d(a10);
            size -= (long) (a10.f32553c - a10.f32552b);
        }
        byte[] bArrV2 = bytes.v();
        byte b11 = bArrV2[0];
        int iE2 = bytes.E();
        long size3 = (size() - ((long) iE2)) + 1;
        while (size < size3) {
            byte[] bArr2 = a10.f32551a;
            long j13 = size3;
            int iMin2 = (int) Math.min(a10.f32553c, (((long) a10.f32552b) + size3) - size);
            i10 = (int) ((((long) a10.f32552b) + j11) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b11 || !u9.a.c(a10, i10 + 1, bArrV2, 1, iE2)) {
                    i10++;
                }
            }
            size += (long) (a10.f32553c - a10.f32552b);
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
            j11 = size;
            size3 = j13;
        }
        return -1L;
        return ((long) (i10 - a10.f32552b)) + size;
    }

    public C3391h g1(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            A aR0 = R0(2);
            byte[] bArr = aR0.f32551a;
            int i11 = aR0.f32553c;
            bArr[i11] = (byte) ((i10 >> 6) | JfifUtil.MARKER_SOFn);
            bArr[i11 + 1] = (byte) ((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            aR0.f32553c = i11 + 2;
            O0(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            A aR02 = R0(3);
            byte[] bArr2 = aR02.f32551a;
            int i12 = aR02.f32553c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            aR02.f32553c = i12 + 3;
            O0(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC3388e.k(i10));
        }
        A aR03 = R0(4);
        byte[] bArr3 = aR03.f32551a;
        int i13 = aR03.f32553c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        aR03.f32553c = i13 + 4;
        O0(size() + 4);
        return this;
    }

    public int hashCode() {
        A a10 = this.f32592g;
        if (a10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = a10.f32553c;
            for (int i12 = a10.f32552b; i12 < i11; i12++) {
                i10 = (i10 * 31) + a10.f32551a[i12];
            }
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
        } while (a10 != this.f32592g);
        return i10;
    }

    public long i0(k targetBytes) {
        AbstractC2855l.g(targetBytes, "targetBytes");
        return w0(targetBytes, 0L);
    }

    @Override // t9.j
    public InputStream inputStream() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // t9.j
    public String j0() {
        return P(Long.MAX_VALUE);
    }

    public final void k() throws EOFException {
        skip(size());
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3391h clone() {
        return A();
    }

    @Override // t9.j
    public byte[] n0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // t9.j
    public j peek() {
        return s.d(new x(this));
    }

    @Override // t9.j
    public String q0() {
        return M0(this.f32593h, C1385d.f8858b);
    }

    public final long r() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        A a11 = a10.f32557g;
        AbstractC2855l.d(a11);
        int i10 = a11.f32553c;
        return (i10 >= 8192 || !a11.f32555e) ? size : size - ((long) (i10 - a11.f32552b));
    }

    @Override // t9.j
    public long r0(D sink) {
        AbstractC2855l.g(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC2855l.g(sink, "sink");
        A a10 = this.f32592g;
        if (a10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), a10.f32553c - a10.f32552b);
        sink.put(a10.f32551a, a10.f32552b, iMin);
        int i10 = a10.f32552b + iMin;
        a10.f32552b = i10;
        this.f32593h -= (long) iMin;
        if (i10 == a10.f32553c) {
            this.f32592g = a10.b();
            B.b(a10);
        }
        return iMin;
    }

    @Override // t9.j
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        int i10 = a10.f32552b;
        int i11 = a10.f32553c;
        int i12 = i10 + 1;
        byte b10 = a10.f32551a[i10];
        O0(size() - 1);
        if (i12 != i11) {
            a10.f32552b = i12;
            return b10;
        }
        this.f32592g = a10.b();
        B.b(a10);
        return b10;
    }

    @Override // t9.j
    public void readFully(byte[] sink) throws EOFException {
        AbstractC2855l.g(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // t9.j
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        int i10 = a10.f32552b;
        int i11 = a10.f32553c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = a10.f32551a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        O0(size() - 4);
        if (i14 != i11) {
            a10.f32552b = i14;
            return i15;
        }
        this.f32592g = a10.b();
        B.b(a10);
        return i15;
    }

    @Override // t9.j
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        int i10 = a10.f32552b;
        int i11 = a10.f32553c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = a10.f32551a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        O0(size() - 8);
        if (i13 != i11) {
            a10.f32552b = i13;
            return j11;
        }
        this.f32592g = a10.b();
        B.b(a10);
        return j11;
    }

    @Override // t9.j
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        A a10 = this.f32592g;
        AbstractC2855l.d(a10);
        int i10 = a10.f32552b;
        int i11 = a10.f32553c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = a10.f32551a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        O0(size() - 2);
        if (i14 == i11) {
            this.f32592g = a10.b();
            B.b(a10);
        } else {
            a10.f32552b = i14;
        }
        return (short) i15;
    }

    public final long size() {
        return this.f32593h;
    }

    @Override // t9.j
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            A a10 = this.f32592g;
            if (a10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, a10.f32553c - a10.f32552b);
            long j11 = iMin;
            O0(size() - j11);
            j10 -= j11;
            int i10 = a10.f32552b + iMin;
            a10.f32552b = i10;
            if (i10 == a10.f32553c) {
                this.f32592g = a10.b();
                B.b(a10);
            }
        }
    }

    @Override // t9.j
    public k t(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new k(n0(j10));
        }
        k kVarQ0 = Q0((int) j10);
        skip(j10);
        return kVarQ0;
    }

    @Override // t9.F
    public G timeout() {
        return G.f32567e;
    }

    public String toString() {
        return P0().toString();
    }

    public long w0(k targetBytes, long j10) {
        int i10;
        int i11;
        AbstractC2855l.g(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        A a10 = this.f32592g;
        if (a10 == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                a10 = a10.f32557g;
                AbstractC2855l.d(a10);
                size -= (long) (a10.f32553c - a10.f32552b);
            }
            if (targetBytes.E() == 2) {
                byte bP = targetBytes.p(0);
                byte bP2 = targetBytes.p(1);
                while (size < size()) {
                    byte[] bArr = a10.f32551a;
                    i10 = (int) ((((long) a10.f32552b) + j10) - size);
                    int i12 = a10.f32553c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bP || b10 == bP2) {
                            i11 = a10.f32552b;
                        } else {
                            i10++;
                        }
                    }
                    size += (long) (a10.f32553c - a10.f32552b);
                    a10 = a10.f32556f;
                    AbstractC2855l.d(a10);
                    j10 = size;
                }
            } else {
                byte[] bArrV = targetBytes.v();
                while (size < size()) {
                    byte[] bArr2 = a10.f32551a;
                    i10 = (int) ((((long) a10.f32552b) + j10) - size);
                    int i13 = a10.f32553c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : bArrV) {
                            if (b11 == b12) {
                                i11 = a10.f32552b;
                            }
                        }
                        i10++;
                    }
                    size += (long) (a10.f32553c - a10.f32552b);
                    a10 = a10.f32556f;
                    AbstractC2855l.d(a10);
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (a10.f32553c - a10.f32552b)) + size;
            if (j11 > j10) {
                break;
            }
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
            size = j11;
        }
        if (targetBytes.E() == 2) {
            byte bP3 = targetBytes.p(0);
            byte bP4 = targetBytes.p(1);
            while (size < size()) {
                byte[] bArr3 = a10.f32551a;
                i10 = (int) ((((long) a10.f32552b) + j10) - size);
                int i14 = a10.f32553c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bP3 || b13 == bP4) {
                        i11 = a10.f32552b;
                    } else {
                        i10++;
                    }
                }
                size += (long) (a10.f32553c - a10.f32552b);
                a10 = a10.f32556f;
                AbstractC2855l.d(a10);
                j10 = size;
            }
        } else {
            byte[] bArrV2 = targetBytes.v();
            while (size < size()) {
                byte[] bArr4 = a10.f32551a;
                i10 = (int) ((((long) a10.f32552b) + j10) - size);
                int i15 = a10.f32553c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : bArrV2) {
                        if (b14 == b15) {
                            i11 = a10.f32552b;
                        }
                    }
                    i10++;
                }
                size += (long) (a10.f32553c - a10.f32552b);
                a10 = a10.f32556f;
                AbstractC2855l.d(a10);
                j10 = size;
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public boolean y0(long j10, k bytes) {
        AbstractC2855l.g(bytes, "bytes");
        return A0(j10, bytes, 0, bytes.E());
    }

    /* JADX INFO: renamed from: t9.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C3391h.this.size(), ViewDefaults.NUMBER_OF_LINES);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C3391h.this.size() > 0) {
                return C3391h.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C3391h.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            AbstractC2855l.g(sink, "sink");
            return C3391h.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC2855l.g(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            A aR0 = R0(1);
            int iMin = Math.min(i10, 8192 - aR0.f32553c);
            source.get(aR0.f32551a, aR0.f32553c, iMin);
            i10 -= iMin;
            aR0.f32553c += iMin;
        }
        this.f32593h += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int i10, int i11) {
        AbstractC2855l.g(sink, "sink");
        AbstractC3388e.b(sink.length, i10, i11);
        A a10 = this.f32592g;
        if (a10 == null) {
            return -1;
        }
        int iMin = Math.min(i11, a10.f32553c - a10.f32552b);
        byte[] bArr = a10.f32551a;
        int i12 = a10.f32552b;
        AbstractC2793j.f(bArr, sink, i10, i12, i12 + iMin);
        a10.f32552b += iMin;
        O0(size() - ((long) iMin));
        if (a10.f32552b == a10.f32553c) {
            this.f32592g = a10.b();
            B.b(a10);
        }
        return iMin;
    }

    @Override // t9.D
    public void write(C3391h source, long j10) {
        A a10;
        AbstractC2855l.g(source, "source");
        if (source != this) {
            AbstractC3388e.b(source.size(), 0L, j10);
            while (j10 > 0) {
                A a11 = source.f32592g;
                AbstractC2855l.d(a11);
                int i10 = a11.f32553c;
                AbstractC2855l.d(source.f32592g);
                if (j10 < i10 - r1.f32552b) {
                    A a12 = this.f32592g;
                    if (a12 != null) {
                        AbstractC2855l.d(a12);
                        a10 = a12.f32557g;
                    } else {
                        a10 = null;
                    }
                    if (a10 != null && a10.f32555e) {
                        if ((((long) a10.f32553c) + j10) - ((long) (a10.f32554d ? 0 : a10.f32552b)) <= 8192) {
                            A a13 = source.f32592g;
                            AbstractC2855l.d(a13);
                            a13.g(a10, (int) j10);
                            source.O0(source.size() - j10);
                            O0(size() + j10);
                            return;
                        }
                    }
                    A a14 = source.f32592g;
                    AbstractC2855l.d(a14);
                    source.f32592g = a14.e((int) j10);
                }
                A a15 = source.f32592g;
                AbstractC2855l.d(a15);
                long j11 = a15.f32553c - a15.f32552b;
                source.f32592g = a15.b();
                A a16 = this.f32592g;
                if (a16 == null) {
                    this.f32592g = a15;
                    a15.f32557g = a15;
                    a15.f32556f = a15;
                } else {
                    AbstractC2855l.d(a16);
                    A a17 = a16.f32557g;
                    AbstractC2855l.d(a17);
                    a17.c(a15).a();
                }
                source.O0(source.size() - j11);
                O0(size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public C3391h x() {
        return this;
    }

    @Override // t9.InterfaceC3392i
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C3391h K() {
        return this;
    }

    @Override // t9.j, t9.InterfaceC3392i
    public C3391h c() {
        return this;
    }

    @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // t9.InterfaceC3392i, t9.D, java.io.Flushable
    public void flush() {
    }

    @Override // t9.F
    public long read(C3391h sink, long j10) {
        AbstractC2855l.g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.write(this, j10);
        return j10;
    }
}
