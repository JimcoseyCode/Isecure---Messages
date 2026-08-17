package t9;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements D {
    private final D delegate;

    public m(D delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final D m351deprecated_delegate() {
        return this.delegate;
    }

    @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final D delegate() {
        return this.delegate;
    }

    @Override // t9.D, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // t9.D
    public G timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // t9.D
    public void write(C3391h source, long j10) {
        AbstractC2855l.g(source, "source");
        this.delegate.write(source, j10);
    }
}
