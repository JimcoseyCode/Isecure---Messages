package H;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class b extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final OutputStream f3560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f3561h;

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f3560g = outputStream;
        this.f3561h = byteOrder;
    }

    public void d(ByteOrder byteOrder) {
        this.f3561h = byteOrder;
    }

    public void e(int i10) throws IOException {
        this.f3560g.write(i10);
    }

    public void k(int i10) throws IOException {
        ByteOrder byteOrder = this.f3561h;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3560g.write(i10 & 255);
            this.f3560g.write((i10 >>> 8) & 255);
            this.f3560g.write((i10 >>> 16) & 255);
            this.f3560g.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f3560g.write((i10 >>> 24) & 255);
            this.f3560g.write((i10 >>> 16) & 255);
            this.f3560g.write((i10 >>> 8) & 255);
            this.f3560g.write(i10 & 255);
        }
    }

    public void m(short s10) throws IOException {
        ByteOrder byteOrder = this.f3561h;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3560g.write(s10 & 255);
            this.f3560g.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f3560g.write((s10 >>> 8) & 255);
            this.f3560g.write(s10 & 255);
        }
    }

    public void r(long j10) throws IOException {
        k((int) j10);
    }

    public void s(int i10) throws IOException {
        m((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f3560g.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f3560g.write(bArr, i10, i11);
    }
}
