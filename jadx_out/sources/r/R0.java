package r;

import F.C0468a1;
import F.InterfaceC0490j0;
import F.k1;
import android.util.Size;
import q.C3091a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class R0 implements k1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final R0 f31071a = new R0();

    R0() {
    }

    @Override // F.k1.e
    public void a(Size size, F.D1 d12, k1.b bVar) {
        F.k1 k1VarX = d12.x(null);
        InterfaceC0490j0 interfaceC0490j0G0 = F.X0.g0();
        int iP = F.k1.b().p();
        if (k1VarX != null) {
            iP = k1VarX.p();
            bVar.b(k1VarX.c());
            bVar.d(k1VarX.l());
            bVar.c(k1VarX.j());
            interfaceC0490j0G0 = k1VarX.g();
        }
        bVar.w(interfaceC0490j0G0);
        if (d12 instanceof C0468a1) {
            v.p.b(size, bVar);
        }
        C3091a c3091a = new C3091a(d12);
        bVar.B(c3091a.h0(iP));
        bVar.f(c3091a.i0(V0.b()));
        bVar.k(c3091a.l0(U0.b()));
        bVar.e(C3154b1.e(c3091a.k0(AbstractC3157c0.c())));
        bVar.C(d12.H());
        bVar.z(d12.Q());
        F.S0 s0I0 = F.S0.i0();
        s0I0.X(C3091a.f30713W, c3091a.j0(null));
        s0I0.X(C3091a.f30708R, Long.valueOf(c3091a.m0(-1L)));
        bVar.g(s0I0);
        bVar.g(c3091a.g0());
    }
}
