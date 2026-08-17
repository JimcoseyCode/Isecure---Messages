package g3;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class m implements v, Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f28193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f28194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f28195i = System.identityHashCode(this);

    public m(int i10) {
        this.f28193g = ByteBuffer.allocateDirect(i10);
        this.f28194h = i10;
    }

    private void m(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof m)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        c2.k.i(!isClosed());
        c2.k.i(!vVar.isClosed());
        c2.k.g(this.f28193g);
        w.b(i10, vVar.b(), i11, i12, this.f28194h);
        this.f28193g.position(i10);
        ByteBuffer byteBuffer = (ByteBuffer) c2.k.g(vVar.a());
        byteBuffer.position(i11);
        byte[] bArr = new byte[i12];
        this.f28193g.get(bArr, 0, i12);
        byteBuffer.put(bArr, 0, i12);
    }

    @Override // g3.v
    public synchronized ByteBuffer a() {
        return this.f28193g;
    }

    @Override // g3.v
    public int b() {
        return this.f28194h;
    }

    @Override // g3.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f28193g = null;
    }

    @Override // g3.v
    public long d() {
        return this.f28195i;
    }

    @Override // g3.v
    public synchronized int e(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        c2.k.g(bArr);
        c2.k.i(!isClosed());
        c2.k.g(this.f28193g);
        iA = w.a(i10, i12, this.f28194h);
        w.b(i10, bArr.length, i11, iA, this.f28194h);
        this.f28193g.position(i10);
        this.f28193g.put(bArr, i11, iA);
        return iA;
    }

    @Override // g3.v
    public synchronized byte g(int i10) {
        boolean z10 = true;
        c2.k.i(!isClosed());
        c2.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f28194h) {
            z10 = false;
        }
        c2.k.b(Boolean.valueOf(z10));
        c2.k.g(this.f28193g);
        return this.f28193g.get(i10);
    }

    @Override // g3.v
    public synchronized int h(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        c2.k.g(bArr);
        c2.k.i(!isClosed());
        c2.k.g(this.f28193g);
        iA = w.a(i10, i12, this.f28194h);
        w.b(i10, bArr.length, i11, iA, this.f28194h);
        this.f28193g.position(i10);
        this.f28193g.get(bArr, i11, iA);
        return iA;
    }

    @Override // g3.v
    public synchronized boolean isClosed() {
        return this.f28193g == null;
    }

    @Override // g3.v
    public long j() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
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
