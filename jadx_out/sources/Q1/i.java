package Q1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i extends FilterInputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9036g;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f9036g = androidx.customview.widget.a.INVALID_ID;
    }

    private long d(long j10) {
        int i10 = this.f9036g;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    private void e(long j10) {
        int i10 = this.f9036g;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f9036g = (int) (((long) i10) - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f9036g;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f9036g = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (d(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        e(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f9036g = androidx.customview.widget.a.INVALID_ID;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jD = d(j10);
        if (jD == -1) {
            return 0L;
        }
        long jSkip = super.skip(jD);
        e(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iD = (int) d(i11);
        if (iD == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iD);
        e(i12);
        return i12;
    }
}
