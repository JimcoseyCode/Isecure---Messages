package c6;

import java.io.Closeable;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class J implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f18842g;

    /* synthetic */ J(n nVar, I i10) {
        this.f18842g = nVar;
        AbstractC3268i.n(((Thread) nVar.f18893d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18842g.f18893d.set(null);
        this.f18842g.d();
    }
}
