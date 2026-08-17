package t9;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class r implements F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InputStream f32621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G f32622h;

    public r(InputStream input, G timeout) {
        AbstractC2855l.g(input, "input");
        AbstractC2855l.g(timeout, "timeout");
        this.f32621g = input;
        this.f32622h = timeout;
    }

    @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32621g.close();
    }

    @Override // t9.F
    public long read(C3391h sink, long j10) throws IOException {
        AbstractC2855l.g(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f32622h.f();
            A aR0 = sink.R0(1);
            int i10 = this.f32621g.read(aR0.f32551a, aR0.f32553c, (int) Math.min(j10, 8192 - aR0.f32553c));
            if (i10 != -1) {
                aR0.f32553c += i10;
                long j11 = i10;
                sink.O0(sink.size() + j11);
                return j11;
            }
            if (aR0.f32552b != aR0.f32553c) {
                return -1L;
            }
            sink.f32592g = aR0.b();
            B.b(aR0);
            return -1L;
        } catch (AssertionError e10) {
            if (s.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // t9.F
    public G timeout() {
        return this.f32622h;
    }

    public String toString() {
        return "source(" + this.f32621g + ')';
    }
}
