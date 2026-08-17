package t9;

import P8.AbstractC1382a;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F f32639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3391h f32640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32641i;

    public z(F source) {
        AbstractC2855l.g(source, "source");
        this.f32639g = source;
        this.f32640h = new C3391h();
    }

    @Override // t9.j
    public void B0(long j10) throws EOFException {
        if (!e0(j10)) {
            throw new EOFException();
        }
    }

    @Override // t9.j
    public byte[] C() {
        this.f32640h.G(this.f32639g);
        return this.f32640h.C();
    }

    @Override // t9.j
    public boolean D() {
        if (this.f32641i) {
            throw new IllegalStateException("closed");
        }
        return this.f32640h.D() && this.f32639g.read(this.f32640h, 8192L) == -1;
    }

    @Override // t9.j
    public long G0() throws EOFException {
        byte bM;
        B0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!e0(i11)) {
                break;
            }
            bM = this.f32640h.M(i10);
            if ((bM < 48 || bM > 57) && ((bM < 97 || bM > 102) && (bM < 65 || bM > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bM, AbstractC1382a.a(AbstractC1382a.a(16)));
            AbstractC2855l.f(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f32640h.G0();
    }

    @Override // t9.j
    public int H0(v options) throws EOFException {
        AbstractC2855l.g(options, "options");
        if (this.f32641i) {
            throw new IllegalStateException("closed");
        }
        do {
            int iE = u9.a.e(this.f32640h, options, true);
            if (iE != -2) {
                if (iE == -1) {
                    return -1;
                }
                this.f32640h.skip(options.s()[iE].E());
                return iE;
            }
        } while (this.f32639g.read(this.f32640h, 8192L) != -1);
        return -1;
    }

    @Override // t9.j
    public long L() throws EOFException {
        byte bM;
        B0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!e0(j11)) {
                break;
            }
            bM = this.f32640h.M(j10);
            if ((bM < 48 || bM > 57) && !(j10 == 0 && bM == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bM, AbstractC1382a.a(AbstractC1382a.a(16)));
            AbstractC2855l.f(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f32640h.L();
    }

    @Override // t9.j
    public String P(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jE = e((byte) 10, 0L, j11);
        if (jE != -1) {
            return u9.a.d(this.f32640h, jE);
        }
        if (j11 < Long.MAX_VALUE && e0(j11) && this.f32640h.M(j11 - 1) == 13 && e0(j11 + 1) && this.f32640h.M(j11) == 10) {
            return u9.a.d(this.f32640h, j11);
        }
        C3391h c3391h = new C3391h();
        C3391h c3391h2 = this.f32640h;
        c3391h2.B(c3391h, 0L, Math.min(32, c3391h2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f32640h.size(), j10) + " content=" + c3391h.c0().u() + (char) 8230);
    }

    @Override // t9.j
    public void Q(C3391h sink, long j10) throws EOFException {
        AbstractC2855l.g(sink, "sink");
        try {
            B0(j10);
            this.f32640h.Q(sink, j10);
        } catch (EOFException e10) {
            sink.G(this.f32640h);
            throw e10;
        }
    }

    @Override // t9.j
    public String Y(Charset charset) {
        AbstractC2855l.g(charset, "charset");
        this.f32640h.G(this.f32639g);
        return this.f32640h.Y(charset);
    }

    @Override // t9.j, t9.InterfaceC3392i
    public C3391h c() {
        return this.f32640h;
    }

    @Override // t9.j
    public k c0() {
        this.f32640h.G(this.f32639g);
        return this.f32640h.c0();
    }

    @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f32641i) {
            return;
        }
        this.f32641i = true;
        this.f32639g.close();
        this.f32640h.k();
    }

    public long d(byte b10) {
        return e(b10, 0L, Long.MAX_VALUE);
    }

    public long e(byte b10, long j10, long j11) {
        if (this.f32641i) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jW = this.f32640h.W(b11, jMax, j12);
            if (jW != -1) {
                return jW;
            }
            long size = this.f32640h.size();
            if (size >= j12 || this.f32639g.read(this.f32640h, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // t9.j
    public boolean e0(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f32641i) {
            throw new IllegalStateException("closed");
        }
        while (this.f32640h.size() < j10) {
            if (this.f32639g.read(this.f32640h, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // t9.j
    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f32641i;
    }

    @Override // t9.j
    public String j0() {
        return P(Long.MAX_VALUE);
    }

    public int k() throws EOFException {
        B0(4L);
        return this.f32640h.K0();
    }

    public short m() throws EOFException {
        B0(2L);
        return this.f32640h.L0();
    }

    @Override // t9.j
    public byte[] n0(long j10) throws EOFException {
        B0(j10);
        return this.f32640h.n0(j10);
    }

    @Override // t9.j
    public j peek() {
        return s.d(new x(this));
    }

    @Override // t9.j
    public String q0() {
        this.f32640h.G(this.f32639g);
        return this.f32640h.q0();
    }

    @Override // t9.j
    public long r0(D sink) {
        AbstractC2855l.g(sink, "sink");
        long j10 = 0;
        while (this.f32639g.read(this.f32640h, 8192L) != -1) {
            long jR = this.f32640h.r();
            if (jR > 0) {
                j10 += jR;
                sink.write(this.f32640h, jR);
            }
        }
        if (this.f32640h.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f32640h.size();
        C3391h c3391h = this.f32640h;
        sink.write(c3391h, c3391h.size());
        return size;
    }

    @Override // t9.F
    public long read(C3391h sink, long j10) {
        AbstractC2855l.g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f32641i) {
            throw new IllegalStateException("closed");
        }
        if (this.f32640h.size() == 0 && this.f32639g.read(this.f32640h, 8192L) == -1) {
            return -1L;
        }
        return this.f32640h.read(sink, Math.min(j10, this.f32640h.size()));
    }

    @Override // t9.j
    public byte readByte() throws EOFException {
        B0(1L);
        return this.f32640h.readByte();
    }

    @Override // t9.j
    public void readFully(byte[] sink) throws EOFException {
        AbstractC2855l.g(sink, "sink");
        try {
            B0(sink.length);
            this.f32640h.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f32640h.size() > 0) {
                C3391h c3391h = this.f32640h;
                int i11 = c3391h.read(sink, i10, (int) c3391h.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // t9.j
    public int readInt() throws EOFException {
        B0(4L);
        return this.f32640h.readInt();
    }

    @Override // t9.j
    public long readLong() throws EOFException {
        B0(8L);
        return this.f32640h.readLong();
    }

    @Override // t9.j
    public short readShort() throws EOFException {
        B0(2L);
        return this.f32640h.readShort();
    }

    @Override // t9.j
    public void skip(long j10) throws EOFException {
        if (this.f32641i) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f32640h.size() == 0 && this.f32639g.read(this.f32640h, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f32640h.size());
            this.f32640h.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // t9.j
    public k t(long j10) throws EOFException {
        B0(j10);
        return this.f32640h.t(j10);
    }

    @Override // t9.F
    public G timeout() {
        return this.f32639g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f32639g + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            z zVar = z.this;
            if (zVar.f32641i) {
                throw new IOException("closed");
            }
            return (int) Math.min(zVar.f32640h.size(), ViewDefaults.NUMBER_OF_LINES);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            z.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            z zVar = z.this;
            if (zVar.f32641i) {
                throw new IOException("closed");
            }
            if (zVar.f32640h.size() == 0) {
                z zVar2 = z.this;
                if (zVar2.f32639g.read(zVar2.f32640h, 8192L) == -1) {
                    return -1;
                }
            }
            return z.this.f32640h.readByte() & 255;
        }

        public String toString() {
            return z.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            AbstractC2855l.g(data, "data");
            if (!z.this.f32641i) {
                AbstractC3388e.b(data.length, i10, i11);
                if (z.this.f32640h.size() == 0) {
                    z zVar = z.this;
                    if (zVar.f32639g.read(zVar.f32640h, 8192L) == -1) {
                        return -1;
                    }
                }
                return z.this.f32640h.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC2855l.g(sink, "sink");
        if (this.f32640h.size() == 0 && this.f32639g.read(this.f32640h, 8192L) == -1) {
            return -1;
        }
        return this.f32640h.read(sink);
    }
}
