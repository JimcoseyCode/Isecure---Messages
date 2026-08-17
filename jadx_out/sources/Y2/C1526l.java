package Y2;

import X1.g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: Y2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1526l implements InterfaceC1531q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1527m f12731a;

    public C1526l(InterfaceC1527m interfaceC1527m) {
        this.f12731a = interfaceC1527m;
    }

    private static X1.g b(X1.d dVar, X1.f fVar) {
        return c(dVar, fVar, Executors.newSingleThreadExecutor());
    }

    private static X1.g c(X1.d dVar, X1.f fVar, Executor executor) {
        return new X1.g(fVar, dVar.h(), new g.c(dVar.k(), dVar.j(), dVar.f()), dVar.e(), dVar.d(), dVar.g(), executor, dVar.i());
    }

    @Override // Y2.InterfaceC1531q
    public X1.k a(X1.d dVar) {
        return b(dVar, this.f12731a.a(dVar));
    }
}
