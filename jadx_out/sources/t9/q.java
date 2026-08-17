package t9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f32617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Inflater f32618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32620j;

    public q(j source, Inflater inflater) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(inflater, "inflater");
        this.f32617g = source;
        this.f32618h = inflater;
    }

    private final void k() {
        int i10 = this.f32619i;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f32618h.getRemaining();
        this.f32619i -= remaining;
        this.f32617g.skip(remaining);
    }

    @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32620j) {
            return;
        }
        this.f32618h.end();
        this.f32620j = true;
        this.f32617g.close();
    }

    public final long d(C3391h sink, long j10) throws IOException {
        AbstractC2855l.g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f32620j) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            A aR0 = sink.R0(1);
            int iMin = (int) Math.min(j10, 8192 - aR0.f32553c);
            e();
            int iInflate = this.f32618h.inflate(aR0.f32551a, aR0.f32553c, iMin);
            k();
            if (iInflate > 0) {
                aR0.f32553c += iInflate;
                long j11 = iInflate;
                sink.O0(sink.size() + j11);
                return j11;
            }
            if (aR0.f32552b == aR0.f32553c) {
                sink.f32592g = aR0.b();
                B.b(aR0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean e() {
        if (!this.f32618h.needsInput()) {
            return false;
        }
        if (this.f32617g.D()) {
            return true;
        }
        A a10 = this.f32617g.c().f32592g;
        AbstractC2855l.d(a10);
        int i10 = a10.f32553c;
        int i11 = a10.f32552b;
        int i12 = i10 - i11;
        this.f32619i = i12;
        this.f32618h.setInput(a10.f32551a, i11, i12);
        return false;
    }

    @Override // t9.F
    public long read(C3391h sink, long j10) throws IOException {
        AbstractC2855l.g(sink, "sink");
        do {
            long jD = d(sink, j10);
            if (jD > 0) {
                return jD;
            }
            if (this.f32618h.finished() || this.f32618h.needsDictionary()) {
                return -1L;
            }
        } while (!this.f32617g.D());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // t9.F
    public G timeout() {
        return this.f32617g.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(F source, Inflater inflater) {
        this(s.d(source), inflater);
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(inflater, "inflater");
    }
}
