package Q1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Queue f9021i = l.g(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f9022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IOException f9023h;

    d() {
    }

    public static d e(InputStream inputStream) {
        d dVar;
        Queue queue = f9021i;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.m(inputStream);
        return dVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f9022g.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9022g.close();
    }

    public IOException d() {
        return this.f9023h;
    }

    public void k() {
        this.f9023h = null;
        this.f9022g = null;
        Queue queue = f9021i;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void m(InputStream inputStream) {
        this.f9022g = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f9022g.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f9022g.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f9022g.read();
        } catch (IOException e10) {
            this.f9023h = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f9022g.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f9022g.skip(j10);
        } catch (IOException e10) {
            this.f9023h = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f9022g.read(bArr);
        } catch (IOException e10) {
            this.f9023h = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f9022g.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f9023h = e10;
            throw e10;
        }
    }
}
