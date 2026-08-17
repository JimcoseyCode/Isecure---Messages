package t9;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements F {
    private final F delegate;

    public n(F delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final F m352deprecated_delegate() {
        return this.delegate;
    }

    @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final F delegate() {
        return this.delegate;
    }

    @Override // t9.F
    public long read(C3391h sink, long j10) {
        AbstractC2855l.g(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // t9.F
    public G timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
