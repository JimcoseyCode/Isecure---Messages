package Q1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f9019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9020h;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f9019g = j10;
    }

    private int d(int i10) throws IOException {
        if (i10 >= 0) {
            this.f9020h += i10;
            return i10;
        }
        if (this.f9019g - ((long) this.f9020h) <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f9019g + ", but read: " + this.f9020h);
    }

    public static InputStream e(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f9019g - ((long) this.f9020h), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        d(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return d(super.read(bArr, i10, i11));
    }
}
