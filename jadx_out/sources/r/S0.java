package r;

import F.C0486h0;
import F.E1;
import F.InterfaceC0490j0;
import F.k1;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class S0 implements F.E1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C3213r1 f31074b;

    public S0(Context context) {
        this.f31074b = C3213r1.c(context);
    }

    @Override // F.E1
    public InterfaceC0490j0 a(E1.b bVar, int i10) {
        F.S0 s0I0 = F.S0.i0();
        k1.b bVar2 = new k1.b();
        bVar2.B(s2.b(bVar, i10));
        s0I0.X(F.D1.f1308w, bVar2.p());
        s0I0.X(F.D1.f1310y, R0.f31071a);
        C0486h0.a aVar = new C0486h0.a();
        aVar.v(s2.a(bVar, i10));
        s0I0.X(F.D1.f1309x, aVar.h());
        s0I0.X(F.D1.f1311z, bVar == E1.b.IMAGE_CAPTURE ? Q1.f31069c : C3161d0.f31236a);
        if (bVar == E1.b.PREVIEW) {
            s0I0.X(F.E0.f1328s, this.f31074b.f());
        }
        s0I0.X(F.E0.f1323n, Integer.valueOf(this.f31074b.d(true).getRotation()));
        if (bVar == E1.b.VIDEO_CAPTURE || bVar == E1.b.STREAM_SHARING) {
            s0I0.X(F.D1.f1301E, Boolean.TRUE);
        }
        return F.X0.h0(s0I0);
    }
}
