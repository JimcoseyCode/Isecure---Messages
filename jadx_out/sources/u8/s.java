package U8;

import R8.C1425o;
import W8.AbstractC1501d;
import i7.C2735B;
import i7.C2752o;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class s extends V8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f11614a = new AtomicReference(null);

    @Override // V8.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(q qVar) {
        if (AbstractC1501d.a(this.f11614a) != null) {
            return false;
        }
        AbstractC1501d.b(this.f11614a, r.f11612a);
        return true;
    }

    public final Object e(n7.f fVar) {
        C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        if (!androidx.camera.view.i.a(this.f11614a, r.f11612a, c1425o)) {
            C2752o.a aVar = C2752o.f28721h;
            c1425o.resumeWith(C2752o.b(C2735B.f28704a));
        }
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ == AbstractC3016b.e() ? objZ : C2735B.f28704a;
    }

    @Override // V8.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public n7.f[] b(q qVar) {
        AbstractC1501d.b(this.f11614a, null);
        return V8.c.f11848a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f11614a;
        while (true) {
            Object objA = AbstractC1501d.a(atomicReference);
            if (objA == null || objA == r.f11613b) {
                return;
            }
            if (objA == r.f11612a) {
                if (androidx.camera.view.i.a(this.f11614a, objA, r.f11613b)) {
                    return;
                }
            } else if (androidx.camera.view.i.a(this.f11614a, objA, r.f11612a)) {
                C2752o.a aVar = C2752o.f28721h;
                ((C1425o) objA).resumeWith(C2752o.b(C2735B.f28704a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f11614a.getAndSet(r.f11612a);
        AbstractC2855l.d(andSet);
        return andSet == r.f11613b;
    }
}
