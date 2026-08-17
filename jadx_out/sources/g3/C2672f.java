package g3;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: g3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2672f implements v, Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SharedMemory f28172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteBuffer f28173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f28174i;

    public C2672f(int i10) {
        c2.k.b(Boolean.valueOf(i10 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f28172g = sharedMemoryCreate;
            this.f28173h = sharedMemoryCreate.mapReadWrite();
            this.f28174i = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    private void m(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof C2672f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        c2.k.i(!isClosed());
        c2.k.i(!vVar.isClosed());
        c2.k.g(this.f28173h);
        c2.k.g(vVar.a());
        w.b(i10, vVar.b(), i11, i12, b());
        this.f28173h.position(i10);
        vVar.a().position(i11);
        byte[] bArr = new byte[i12];
        this.f28173h.get(bArr, 0, i12);
        vVar.a().put(bArr, 0, i12);
    }

    @Override // g3.v
    public ByteBuffer a() {
        return this.f28173h;
    }

    @Override // g3.v
    public int b() {
        c2.k.g(this.f28172g);
        return this.f28172g.getSize();
    }

    @Override // g3.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f28172g;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f28173h;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f28173h = null;
                this.f28172g = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g3.v
    public long d() {
        return this.f28174i;
    }

    @Override // g3.v
    public synchronized int e(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        c2.k.g(bArr);
        c2.k.g(this.f28173h);
        iA = w.a(i10, i12, b());
        w.b(i10, bArr.length, i11, iA, b());
        this.f28173h.position(i10);
        this.f28173h.put(bArr, i11, iA);
        return iA;
    }

    @Override // g3.v
    public synchronized byte g(int i10) {
        boolean z10 = true;
        c2.k.i(!isClosed());
        c2.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= b()) {
            z10 = false;
        }
        c2.k.b(Boolean.valueOf(z10));
        c2.k.g(this.f28173h);
        return this.f28173h.get(i10);
    }

    @Override // g3.v
    public synchronized int h(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        c2.k.g(bArr);
        c2.k.g(this.f28173h);
        iA = w.a(i10, i12, b());
        w.b(i10, bArr.length, i11, iA, b());
        this.f28173h.position(i10);
        this.f28173h.get(bArr, i11, iA);
        return iA;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // g3.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f28173h != null) {
            z10 = this.f28172g == null;
        }
        return z10;
    }

    @Override // g3.v
    public long j() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // g3.v
    public void k(int i10, v vVar, int i11, int i12) {
        c2.k.g(vVar);
        if (vVar.d() == d()) {
            Long.toHexString(d());
            Long.toHexString(vVar.d());
            c2.k.b(Boolean.FALSE);
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
}
