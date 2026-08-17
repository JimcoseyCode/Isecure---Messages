package I4;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class K0 extends OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f4142g = 0;

    K0() {
    }

    final long d() {
        return this.f4142g;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f4142g++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f4142g += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f4142g += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
