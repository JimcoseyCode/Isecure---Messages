package i2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: i2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2725b extends FilterInputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f28688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28690i;

    public C2725b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f28688g = bArr;
    }

    private int d() {
        int i10 = this.f28689h;
        byte[] bArr = this.f28688g;
        if (i10 >= bArr.length) {
            return -1;
        }
        this.f28689h = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i10);
            this.f28690i = this.f28689h;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        return i10 != -1 ? i10 : d();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f28689h = this.f28690i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i13 < i11) {
            int iD = d();
            if (iD == -1) {
                break;
            }
            bArr[i10 + i13] = (byte) iD;
            i13++;
        }
        if (i13 > 0) {
            return i13;
        }
        return -1;
    }
}
