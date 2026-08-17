package f2;

import d2.AbstractC2325a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: f2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2606g extends InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InputStream f27223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f27224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g2.h f27225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27226j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27227k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27228l = false;

    public C2606g(InputStream inputStream, byte[] bArr, g2.h hVar) {
        this.f27223g = (InputStream) c2.k.g(inputStream);
        this.f27224h = (byte[]) c2.k.g(bArr);
        this.f27225i = (g2.h) c2.k.g(hVar);
    }

    private boolean d() throws IOException {
        if (this.f27227k < this.f27226j) {
            return true;
        }
        int i10 = this.f27223g.read(this.f27224h);
        if (i10 <= 0) {
            return false;
        }
        this.f27226j = i10;
        this.f27227k = 0;
        return true;
    }

    private void e() throws IOException {
        if (this.f27228l) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        c2.k.i(this.f27227k <= this.f27226j);
        e();
        return (this.f27226j - this.f27227k) + this.f27223g.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f27228l) {
            return;
        }
        this.f27228l = true;
        this.f27225i.release(this.f27224h);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f27228l) {
            AbstractC2325a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        c2.k.i(this.f27227k <= this.f27226j);
        e();
        if (!d()) {
            return -1;
        }
        byte[] bArr = this.f27224h;
        int i10 = this.f27227k;
        this.f27227k = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        c2.k.i(this.f27227k <= this.f27226j);
        e();
        int i10 = this.f27226j;
        int i11 = this.f27227k;
        long j11 = i10 - i11;
        if (j11 >= j10) {
            this.f27227k = (int) (((long) i11) + j10);
            return j10;
        }
        this.f27227k = i10;
        return j11 + this.f27223g.skip(j10 - j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        c2.k.i(this.f27227k <= this.f27226j);
        e();
        if (!d()) {
            return -1;
        }
        int iMin = Math.min(this.f27226j - this.f27227k, i11);
        System.arraycopy(this.f27224h, this.f27227k, bArr, i10, iMin);
        this.f27227k += iMin;
        return iMin;
    }
}
