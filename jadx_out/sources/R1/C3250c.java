package r1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: r1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3250c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InputStream f31859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Charset f31860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f31861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f31863k;

    /* JADX INFO: renamed from: r1.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, C3250c.this.f31860h.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    C3250c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void e() throws IOException {
        InputStream inputStream = this.f31859g;
        byte[] bArr = this.f31861i;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f31862j = 0;
        this.f31863k = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f31859g) {
            try {
                if (this.f31861i != null) {
                    this.f31861i = null;
                    this.f31859g.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean k() {
        return this.f31863k == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String m() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f31859g) {
            try {
                if (this.f31861i == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f31862j >= this.f31863k) {
                    e();
                }
                for (int i12 = this.f31862j; i12 != this.f31863k; i12++) {
                    byte[] bArr2 = this.f31861i;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f31862j;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f31860h.name());
                        this.f31862j = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f31863k - this.f31862j) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f31861i;
                    int i14 = this.f31862j;
                    aVar.write(bArr3, i14, this.f31863k - i14);
                    this.f31863k = -1;
                    e();
                    i10 = this.f31862j;
                    while (i10 != this.f31863k) {
                        bArr = this.f31861i;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f31862j;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f31862j = i10 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    C3250c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f31865a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f31859g = inputStream;
        this.f31860h = charset;
        this.f31861i = new byte[i10];
    }
}
