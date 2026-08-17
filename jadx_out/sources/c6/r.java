package c6;

import c6.C1856a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class r extends PhantomReference implements C1856a.InterfaceC0201a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f18896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f18897b;

    /* synthetic */ r(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, q qVar) {
        super(obj, referenceQueue);
        this.f18896a = set;
        this.f18897b = runnable;
    }

    @Override // c6.C1856a.InterfaceC0201a
    public final void a() {
        if (this.f18896a.remove(this)) {
            clear();
            this.f18897b.run();
        }
    }
}
