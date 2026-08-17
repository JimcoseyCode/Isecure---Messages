package t9;

import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3392i f32608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Deflater f32609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32610i;

    public l(InterfaceC3392i sink, Deflater deflater) {
        AbstractC2855l.g(sink, "sink");
        AbstractC2855l.g(deflater, "deflater");
        this.f32608g = sink;
        this.f32609h = deflater;
    }

    private final void d(boolean z10) {
        A aR0;
        int iDeflate;
        C3391h c3391hC = this.f32608g.c();
        while (true) {
            aR0 = c3391hC.R0(1);
            if (z10) {
                Deflater deflater = this.f32609h;
                byte[] bArr = aR0.f32551a;
                int i10 = aR0.f32553c;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                Deflater deflater2 = this.f32609h;
                byte[] bArr2 = aR0.f32551a;
                int i11 = aR0.f32553c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                aR0.f32553c += iDeflate;
                c3391hC.O0(c3391hC.size() + ((long) iDeflate));
                this.f32608g.K();
            } else if (this.f32609h.needsInput()) {
                break;
            }
        }
        if (aR0.f32552b == aR0.f32553c) {
            c3391hC.f32592g = aR0.b();
            B.b(aR0);
        }
    }

    @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f32610i) {
            return;
        }
        try {
            e();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f32609h.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f32608g.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f32610i = true;
        if (th != null) {
            throw th;
        }
    }

    public final void e() {
        this.f32609h.finish();
        d(false);
    }

    @Override // t9.D, java.io.Flushable
    public void flush() {
        d(true);
        this.f32608g.flush();
    }

    @Override // t9.D
    public G timeout() {
        return this.f32608g.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f32608g + ')';
    }

    @Override // t9.D
    public void write(C3391h source, long j10) {
        AbstractC2855l.g(source, "source");
        AbstractC3388e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            A a10 = source.f32592g;
            AbstractC2855l.d(a10);
            int iMin = (int) Math.min(j10, a10.f32553c - a10.f32552b);
            this.f32609h.setInput(a10.f32551a, a10.f32552b, iMin);
            d(false);
            long j11 = iMin;
            source.O0(source.size() - j11);
            int i10 = a10.f32552b + iMin;
            a10.f32552b = i10;
            if (i10 == a10.f32553c) {
                source.f32592g = a10.b();
                B.b(a10);
            }
            j10 -= j11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(D sink, Deflater deflater) {
        this(s.c(sink), deflater);
        AbstractC2855l.g(sink, "sink");
        AbstractC2855l.g(deflater, "deflater");
    }
}
