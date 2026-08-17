package t9;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class w implements D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final OutputStream f32627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G f32628h;

    public w(OutputStream out, G timeout) {
        AbstractC2855l.g(out, "out");
        AbstractC2855l.g(timeout, "timeout");
        this.f32627g = out;
        this.f32628h = timeout;
    }

    @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32627g.close();
    }

    @Override // t9.D, java.io.Flushable
    public void flush() throws IOException {
        this.f32627g.flush();
    }

    @Override // t9.D
    public G timeout() {
        return this.f32628h;
    }

    public String toString() {
        return "sink(" + this.f32627g + ')';
    }

    @Override // t9.D
    public void write(C3391h source, long j10) throws IOException {
        AbstractC2855l.g(source, "source");
        AbstractC3388e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f32628h.f();
            A a10 = source.f32592g;
            AbstractC2855l.d(a10);
            int iMin = (int) Math.min(j10, a10.f32553c - a10.f32552b);
            this.f32627g.write(a10.f32551a, a10.f32552b, iMin);
            a10.f32552b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.O0(source.size() - j11);
            if (a10.f32552b == a10.f32553c) {
                source.f32592g = a10.b();
                B.b(a10);
            }
        }
    }
}
