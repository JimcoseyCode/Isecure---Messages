package N0;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I extends OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FileOutputStream f7721g;

    public I(FileOutputStream fileOutputStream) {
        AbstractC2855l.g(fileOutputStream, "fileOutputStream");
        this.f7721g = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f7721g.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f7721g.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        AbstractC2855l.g(b10, "b");
        this.f7721g.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        AbstractC2855l.g(bytes, "bytes");
        this.f7721g.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
