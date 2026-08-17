package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class X extends FilterInputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f19213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final y1.b f19218l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public X(InputStream inputStream, y1.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int d(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f19216j;
        if (i10 != -1) {
            int i11 = this.f19217k - i10;
            int i12 = this.f19215i;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f19214h == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f19218l.d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f19213g = bArr2;
                    this.f19218l.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f19217k - this.f19216j;
                this.f19217k = i13;
                this.f19216j = 0;
                this.f19214h = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f19217k;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f19214h = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f19216j = -1;
            this.f19217k = 0;
            this.f19214h = i16;
        }
        return i16;
    }

    private static IOException m() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f19213g == null || inputStream == null) {
            throw m();
        }
        return (this.f19214h - this.f19217k) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f19213g != null) {
            this.f19218l.put(this.f19213g);
            this.f19213g = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        this.f19215i = this.f19213g.length;
    }

    public synchronized void k() {
        if (this.f19213g != null) {
            this.f19218l.put(this.f19213g);
            this.f19213g = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f19215i = Math.max(this.f19215i, i10);
        this.f19216j = this.f19217k;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f19213g;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m();
        }
        if (this.f19217k >= this.f19214h && d(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f19213g && (bArr = this.f19213g) == null) {
            throw m();
        }
        int i10 = this.f19214h;
        int i11 = this.f19217k;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f19217k = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f19213g == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f19216j;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f19217k + " markLimit: " + this.f19215i);
        }
        this.f19217k = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f19213g;
        if (bArr == null) {
            throw m();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m();
        }
        int i10 = this.f19214h;
        int i11 = this.f19217k;
        if (i10 - i11 >= j10) {
            this.f19217k = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f19217k = i10;
        if (this.f19216j == -1 || j10 > this.f19215i) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f19216j = -1;
            }
            return j11 + jSkip;
        }
        if (d(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f19214h;
        int i13 = this.f19217k;
        if (i12 - i13 >= j10 - j11) {
            this.f19217k = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f19217k = i12;
        return j12;
    }

    X(InputStream inputStream, y1.b bVar, int i10) {
        super(inputStream);
        this.f19216j = -1;
        this.f19218l = bVar;
        this.f19213g = (byte[]) bVar.d(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f19213g;
        if (bArr2 == null) {
            throw m();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f19217k;
            int i15 = this.f19214h;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f19217k += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f19216j == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (d(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f19213g && (bArr2 = this.f19213g) == null) {
                        throw m();
                    }
                    int i17 = this.f19214h;
                    int i18 = this.f19217k;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f19217k += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw m();
        }
    }
}
