package y5;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class b extends OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33958g = 0;

    b() {
    }

    long d() {
        return this.f33958g;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f33958g++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f33958g += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f33958g += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
