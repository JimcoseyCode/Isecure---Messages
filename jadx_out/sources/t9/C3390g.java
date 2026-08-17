package t9;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: t9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C3390g implements D {
    @Override // t9.D
    public G timeout() {
        return G.f32567e;
    }

    @Override // t9.D
    public void write(C3391h source, long j10) throws EOFException {
        AbstractC2855l.g(source, "source");
        source.skip(j10);
    }

    @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // t9.D, java.io.Flushable
    public void flush() {
    }
}
