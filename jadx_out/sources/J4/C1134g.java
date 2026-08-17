package J4;

import java.io.OutputStream;

/* JADX INFO: renamed from: J4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1134g extends OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6051g = 0;

    C1134g() {
    }

    final long d() {
        return this.f6051g;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f6051g++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f6051g += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f6051g += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
