package J;

import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceFutureC2904a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceFutureC2904a f5274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    c.a f5275h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements c.InterfaceC0153c {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0153c
        public Object a(c.a aVar) {
            H0.g.j(d.this.f5275h == null, "The result can only set once!");
            d.this.f5275h = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(InterfaceFutureC2904a interfaceFutureC2904a) {
        this.f5274g = (InterfaceFutureC2904a) H0.g.g(interfaceFutureC2904a);
    }

    public static d a(InterfaceFutureC2904a interfaceFutureC2904a) {
        return interfaceFutureC2904a instanceof d ? (d) interfaceFutureC2904a : new d(interfaceFutureC2904a);
    }

    boolean b(Object obj) {
        c.a aVar = this.f5275h;
        if (aVar != null) {
            return aVar.c(obj);
        }
        return false;
    }

    boolean c(Throwable th) {
        c.a aVar = this.f5275h;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f5274g.cancel(z10);
    }

    public final d d(InterfaceC2955a interfaceC2955a, Executor executor) {
        return (d) n.x(this, interfaceC2955a, executor);
    }

    public final d e(J.a aVar, Executor executor) {
        return (d) n.y(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f5274g.get();
    }

    @Override // m5.InterfaceFutureC2904a
    public void h(Runnable runnable, Executor executor) {
        this.f5274g.h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5274g.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f5274g.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f5274g.get(j10, timeUnit);
    }

    d() {
        this.f5274g = androidx.concurrent.futures.c.a(new a());
    }
}
