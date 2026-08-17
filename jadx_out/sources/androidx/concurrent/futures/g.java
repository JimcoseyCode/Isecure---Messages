package androidx.concurrent.futures;

import R8.InterfaceC1421m;
import i7.AbstractC2753p;
import i7.C2752o;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC2855l;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class g implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceFutureC2904a f15473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1421m f15474h;

    public g(InterfaceFutureC2904a futureToObserve, InterfaceC1421m continuation) {
        AbstractC2855l.h(futureToObserve, "futureToObserve");
        AbstractC2855l.h(continuation, "continuation");
        this.f15473g = futureToObserve;
        this.f15474h = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f15473g.isCancelled()) {
            InterfaceC1421m.a.a(this.f15474h, null, 1, null);
            return;
        }
        try {
            InterfaceC1421m interfaceC1421m = this.f15474h;
            C2752o.a aVar = C2752o.f28721h;
            interfaceC1421m.resumeWith(C2752o.b(a.u(this.f15473g)));
        } catch (ExecutionException e10) {
            InterfaceC1421m interfaceC1421m2 = this.f15474h;
            Throwable thC = e.c(e10);
            C2752o.a aVar2 = C2752o.f28721h;
            interfaceC1421m2.resumeWith(C2752o.b(AbstractC2753p.a(thC)));
        }
    }
}
