package F;

import F.V0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: F.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0474c1 f1451b = C0474c1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0477d1 f1452c = new C0477d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T0 f1453a = T0.l(f1451b);

    /* JADX INFO: renamed from: F.d1$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements V0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H0.a f1454a;

        a(H0.a aVar) {
            this.f1454a = aVar;
        }

        @Override // F.V0.a
        public void a(Object obj) {
            this.f1454a.accept(obj);
        }

        @Override // F.V0.a
        public void onError(Throwable th) {
            AbstractC3583h0.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }

    public static C0477d1 b() {
        return f1452c;
    }

    public C0474c1 a() {
        try {
            return (C0474c1) this.f1453a.d().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public void c(Executor executor, H0.a aVar) {
        this.f1453a.c(executor, new a(aVar));
    }

    public void d(C0474c1 c0474c1) {
        this.f1453a.k(c0474c1);
    }
}
