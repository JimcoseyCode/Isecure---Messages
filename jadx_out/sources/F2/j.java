package f2;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j extends InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final h f27229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f27230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f27231i;

    public j(h hVar) {
        c2.k.b(Boolean.valueOf(!hVar.isClosed()));
        this.f27229g = (h) c2.k.g(hVar);
        this.f27230h = 0;
        this.f27231i = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f27229g.size() - this.f27230h;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f27231i = this.f27230h;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f27229g;
        int i10 = this.f27230h;
        this.f27230h = i10 + 1;
        return hVar.g(i10) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f27230h = this.f27231i;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        c2.k.b(Boolean.valueOf(j10 >= 0));
        int iMin = Math.min((int) j10, available());
        this.f27230h += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i11 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i11);
            this.f27229g.h(this.f27230h, bArr, i10, iMin);
            this.f27230h += iMin;
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
