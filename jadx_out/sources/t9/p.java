package t9;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f32612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f32613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Inflater f32614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q f32615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CRC32 f32616k;

    public p(F source) {
        AbstractC2855l.g(source, "source");
        z zVar = new z(source);
        this.f32613h = zVar;
        Inflater inflater = new Inflater(true);
        this.f32614i = inflater;
        this.f32615j = new q((j) zVar, inflater);
        this.f32616k = new CRC32();
    }

    private final void d(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        AbstractC2855l.f(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    private final void e() throws IOException {
        this.f32613h.B0(10L);
        byte bM = this.f32613h.f32640h.M(3L);
        boolean z10 = ((bM >> 1) & 1) == 1;
        if (z10) {
            m(this.f32613h.f32640h, 0L, 10L);
        }
        d("ID1ID2", 8075, this.f32613h.readShort());
        this.f32613h.skip(8L);
        if (((bM >> 2) & 1) == 1) {
            this.f32613h.B0(2L);
            if (z10) {
                m(this.f32613h.f32640h, 0L, 2L);
            }
            long jL0 = this.f32613h.f32640h.L0() & 65535;
            this.f32613h.B0(jL0);
            if (z10) {
                m(this.f32613h.f32640h, 0L, jL0);
            }
            this.f32613h.skip(jL0);
        }
        if (((bM >> 3) & 1) == 1) {
            long jD = this.f32613h.d((byte) 0);
            if (jD == -1) {
                throw new EOFException();
            }
            if (z10) {
                m(this.f32613h.f32640h, 0L, jD + 1);
            }
            this.f32613h.skip(jD + 1);
        }
        if (((bM >> 4) & 1) == 1) {
            long jD2 = this.f32613h.d((byte) 0);
            if (jD2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                m(this.f32613h.f32640h, 0L, jD2 + 1);
            }
            this.f32613h.skip(jD2 + 1);
        }
        if (z10) {
            d("FHCRC", this.f32613h.m(), (short) this.f32616k.getValue());
            this.f32616k.reset();
        }
    }

    private final void k() throws IOException {
        d("CRC", this.f32613h.k(), (int) this.f32616k.getValue());
        d("ISIZE", this.f32613h.k(), (int) this.f32614i.getBytesWritten());
    }

    private final void m(C3391h c3391h, long j10, long j11) {
        A a10 = c3391h.f32592g;
        AbstractC2855l.d(a10);
        while (true) {
            int i10 = a10.f32553c;
            int i11 = a10.f32552b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) a10.f32552b) + j10);
            int iMin = (int) Math.min(a10.f32553c - i12, j11);
            this.f32616k.update(a10.f32551a, i12, iMin);
            j11 -= (long) iMin;
            a10 = a10.f32556f;
            AbstractC2855l.d(a10);
            j10 = 0;
        }
    }

    @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32615j.close();
    }

    @Override // t9.F
    public long read(C3391h sink, long j10) throws IOException {
        p pVar;
        AbstractC2855l.g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f32612g == 0) {
            e();
            this.f32612g = (byte) 1;
        }
        if (this.f32612g == 1) {
            long size = sink.size();
            long j11 = this.f32615j.read(sink, j10);
            if (j11 != -1) {
                m(sink, size, j11);
                return j11;
            }
            pVar = this;
            pVar.f32612g = (byte) 2;
        } else {
            pVar = this;
        }
        if (pVar.f32612g == 2) {
            k();
            pVar.f32612g = (byte) 3;
            if (!pVar.f32613h.D()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // t9.F
    public G timeout() {
        return this.f32613h.timeout();
    }
}
