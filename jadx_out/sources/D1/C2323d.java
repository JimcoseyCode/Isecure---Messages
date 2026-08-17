package d1;

import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import e1.f;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2323d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f25553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U.c f25554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC2320a f25555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e1.d f25556d;

    public C2323d(V store, U.c factory, AbstractC2320a defaultExtras) {
        AbstractC2855l.g(store, "store");
        AbstractC2855l.g(factory, "factory");
        AbstractC2855l.g(defaultExtras, "defaultExtras");
        this.f25553a = store;
        this.f25554b = factory;
        this.f25555c = defaultExtras;
        this.f25556d = new e1.d();
    }

    public static /* synthetic */ T e(C2323d c2323d, C7.d dVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = f.f25818a.c(dVar);
        }
        return c2323d.d(dVar, str);
    }

    public final T d(C7.d modelClass, String key) {
        T tB;
        AbstractC2855l.g(modelClass, "modelClass");
        AbstractC2855l.g(key, "key");
        synchronized (this.f25556d) {
            try {
                tB = this.f25553a.b(key);
                if (modelClass.q(tB)) {
                    if (this.f25554b instanceof U.e) {
                        U.e eVar = (U.e) this.f25554b;
                        AbstractC2855l.d(tB);
                        eVar.d(tB);
                    }
                    AbstractC2855l.e(tB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C2321b c2321b = new C2321b(this.f25555c);
                    c2321b.c(U.f17560c, key);
                    tB = AbstractC2324e.a(this.f25554b, modelClass, c2321b);
                    this.f25553a.d(key, tB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tB;
    }
}
