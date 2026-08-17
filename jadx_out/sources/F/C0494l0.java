package F;

import F.V0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;

/* JADX INFO: renamed from: F.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0494l0 implements V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0494l0 f1551b = new C0494l0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceFutureC2904a f1552a;

    private C0494l0(Object obj) {
        this.f1552a = J.n.p(obj);
    }

    public static /* synthetic */ void b(C0494l0 c0494l0, V0.a aVar) {
        c0494l0.getClass();
        try {
            aVar.a(c0494l0.f1552a.get());
        } catch (InterruptedException | ExecutionException e10) {
            aVar.onError(e10);
        }
    }

    public static V0 f(Object obj) {
        return obj == null ? f1551b : new C0494l0(obj);
    }

    @Override // F.V0
    public void c(Executor executor, final V0.a aVar) {
        this.f1552a.h(new Runnable() { // from class: F.k0
            @Override // java.lang.Runnable
            public final void run() {
                C0494l0.b(this.f1510g, aVar);
            }
        }, executor);
    }

    @Override // F.V0
    public InterfaceFutureC2904a d() {
        return this.f1552a;
    }

    @Override // F.V0
    public void e(V0.a aVar) {
    }
}
