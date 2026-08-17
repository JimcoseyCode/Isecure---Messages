package T8;

import R8.L;
import T8.w;
import i7.C2735B;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class t extends h implements u {
    public t(n7.j jVar, g gVar) {
        super(jVar, gVar, true, true);
    }

    @Override // R8.AbstractC1397a
    protected void N0(Throwable th, boolean z10) {
        if (Q0().h(th) || z10) {
            return;
        }
        L.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R8.AbstractC1397a
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public void O0(C2735B c2735b) {
        w.a.a(Q0(), null, 1, null);
    }

    @Override // R8.AbstractC1397a, R8.G0, R8.A0
    public boolean d() {
        return super.d();
    }
}
