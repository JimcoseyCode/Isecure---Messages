package r;

import F.C0486h0;
import F.InterfaceC0490j0;
import q.C3091a;

/* JADX INFO: renamed from: r.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3161d0 implements C0486h0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C3161d0 f31236a = new C3161d0();

    C3161d0() {
    }

    @Override // F.C0486h0.b
    public void a(F.D1 d12, C0486h0.a aVar) {
        C0486h0 c0486h0E = d12.E(null);
        InterfaceC0490j0 interfaceC0490j0G0 = F.X0.g0();
        int iK = C0486h0.b().k();
        if (c0486h0E != null) {
            iK = c0486h0E.k();
            aVar.a(c0486h0E.c());
            interfaceC0490j0G0 = c0486h0E.g();
        }
        aVar.s(interfaceC0490j0G0);
        C3091a c3091a = new C3091a(d12);
        aVar.v(c3091a.h0(iK));
        aVar.c(C3154b1.e(c3091a.k0(AbstractC3157c0.c())));
        aVar.e(c3091a.g0());
    }
}
