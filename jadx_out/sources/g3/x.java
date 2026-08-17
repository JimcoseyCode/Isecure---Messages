package g3;

import f2.h;
import g2.AbstractC2662a;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class x implements f2.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    AbstractC2662a f28212h;

    public x(AbstractC2662a abstractC2662a, int i10) {
        c2.k.g(abstractC2662a);
        c2.k.b(Boolean.valueOf(i10 >= 0 && i10 <= ((v) abstractC2662a.J()).b()));
        this.f28212h = abstractC2662a.clone();
        this.f28211g = i10;
    }

    @Override // f2.h
    public synchronized ByteBuffer a() {
        c2.k.g(this.f28212h);
        return ((v) this.f28212h.J()).a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        AbstractC2662a.B(this.f28212h);
        this.f28212h = null;
    }

    synchronized void d() {
        if (isClosed()) {
            throw new h.a();
        }
    }

    @Override // f2.h
    public synchronized byte g(int i10) {
        d();
        c2.k.b(Boolean.valueOf(i10 >= 0));
        c2.k.b(Boolean.valueOf(i10 < this.f28211g));
        c2.k.g(this.f28212h);
        return ((v) this.f28212h.J()).g(i10);
    }

    @Override // f2.h
    public synchronized int h(int i10, byte[] bArr, int i11, int i12) {
        d();
        c2.k.b(Boolean.valueOf(i10 + i12 <= this.f28211g));
        c2.k.g(this.f28212h);
        return ((v) this.f28212h.J()).h(i10, bArr, i11, i12);
    }

    @Override // f2.h
    public synchronized boolean isClosed() {
        return !AbstractC2662a.d0(this.f28212h);
    }

    @Override // f2.h
    public synchronized long j() {
        d();
        c2.k.g(this.f28212h);
        return ((v) this.f28212h.J()).j();
    }

    @Override // f2.h
    public synchronized int size() {
        d();
        return this.f28211g;
    }
}
