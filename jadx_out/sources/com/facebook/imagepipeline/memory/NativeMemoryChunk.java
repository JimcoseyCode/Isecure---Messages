package com.facebook.imagepipeline.memory;

import c2.k;
import g3.v;
import g3.w;
import java.io.Closeable;
import java.nio.ByteBuffer;
import y3.AbstractC3612a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class NativeMemoryChunk implements v, Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f19864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19866i;

    static {
        AbstractC3612a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f19865h = i10;
        this.f19864g = nativeAllocate(i10);
        this.f19866i = false;
    }

    private void m(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!vVar.isClosed());
        w.b(i10, vVar.b(), i11, i12, this.f19865h);
        nativeMemcpy(vVar.j() + ((long) i11), this.f19864g + ((long) i10), i12);
    }

    private static native long nativeAllocate(int i10);

    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    private static native void nativeFree(long j10);

    private static native void nativeMemcpy(long j10, long j11, int i10);

    private static native byte nativeReadByte(long j10);

    @Override // g3.v
    public ByteBuffer a() {
        return null;
    }

    @Override // g3.v
    public int b() {
        return this.f19865h;
    }

    @Override // g3.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f19866i) {
            this.f19866i = true;
            nativeFree(this.f19864g);
        }
    }

    @Override // g3.v
    public long d() {
        return this.f19864g;
    }

    @Override // g3.v
    public synchronized int e(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = w.a(i10, i12, this.f19865h);
        w.b(i10, bArr.length, i11, iA, this.f19865h);
        nativeCopyFromByteArray(this.f19864g + ((long) i10), bArr, i11, iA);
        return iA;
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Integer.toHexString(System.identityHashCode(this));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // g3.v
    public synchronized byte g(int i10) {
        boolean z10 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f19865h) {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        return nativeReadByte(this.f19864g + ((long) i10));
    }

    @Override // g3.v
    public synchronized int h(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = w.a(i10, i12, this.f19865h);
        w.b(i10, bArr.length, i11, iA, this.f19865h);
        nativeCopyToByteArray(this.f19864g + ((long) i10), bArr, i11, iA);
        return iA;
    }

    @Override // g3.v
    public synchronized boolean isClosed() {
        return this.f19866i;
    }

    @Override // g3.v
    public long j() {
        return this.f19864g;
    }

    @Override // g3.v
    public void k(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.d() == d()) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(vVar));
            Long.toHexString(this.f19864g);
            k.b(Boolean.FALSE);
        }
        if (vVar.d() < d()) {
            synchronized (vVar) {
                synchronized (this) {
                    m(i10, vVar, i11, i12);
                }
            }
        } else {
            synchronized (this) {
                synchronized (vVar) {
                    m(i10, vVar, i11, i12);
                }
            }
        }
    }

    public NativeMemoryChunk() {
        this.f19865h = 0;
        this.f19864g = 0L;
        this.f19866i = true;
    }
}
