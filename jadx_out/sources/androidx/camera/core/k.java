package androidx.camera.core;

import F.F0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class k extends j {
    k() {
    }

    @Override // androidx.camera.core.j
    o d(F0 f02) {
        return f02.g();
    }

    @Override // androidx.camera.core.j
    void l(o oVar) {
        J.n.j(e(oVar), new a(oVar), I.c.b());
    }

    @Override // androidx.camera.core.j
    void f() {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f15226a;

        a(o oVar) {
            this.f15226a = oVar;
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            this.f15226a.close();
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
