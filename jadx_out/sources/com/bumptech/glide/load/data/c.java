package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final OutputStream f19164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f19165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y1.b f19166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19167j;

    public c(OutputStream outputStream, y1.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void d() throws IOException {
        int i10 = this.f19167j;
        if (i10 > 0) {
            this.f19164g.write(this.f19165h, 0, i10);
            this.f19167j = 0;
        }
    }

    private void e() throws IOException {
        if (this.f19167j == this.f19165h.length) {
            d();
        }
    }

    private void k() {
        byte[] bArr = this.f19165h;
        if (bArr != null) {
            this.f19166i.put(bArr);
            this.f19165h = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f19164g.close();
            k();
        } catch (Throwable th) {
            this.f19164g.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        d();
        this.f19164g.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f19165h;
        int i11 = this.f19167j;
        this.f19167j = i11 + 1;
        bArr[i11] = (byte) i10;
        e();
    }

    c(OutputStream outputStream, y1.b bVar, int i10) {
        this.f19164g = outputStream;
        this.f19166i = bVar;
        this.f19165h = (byte[]) bVar.d(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f19167j;
            if (i15 == 0 && i13 >= this.f19165h.length) {
                this.f19164g.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f19165h.length - i15);
            System.arraycopy(bArr, i14, this.f19165h, this.f19167j, iMin);
            this.f19167j += iMin;
            i12 += iMin;
            e();
        } while (i12 < i11);
    }
}
