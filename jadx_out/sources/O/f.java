package O;

import F.B;
import F.C;
import F.EnumC0512v;
import F.EnumC0516x;
import F.EnumC0520z;
import O.c;
import androidx.camera.core.o;
import y.Y;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public f(int i10, c.a aVar) {
        super(i10, aVar);
    }

    private boolean d(Y y10) {
        B bA = C.a(y10);
        if (bA == null) {
            return false;
        }
        return (bA.k() == EnumC0516x.LOCKED_FOCUSED || bA.k() == EnumC0516x.PASSIVE_FOCUSED) && bA.h() == EnumC0512v.CONVERGED && bA.e() == EnumC0520z.CONVERGED;
    }

    @Override // O.a, O.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(o oVar) {
        if (d(oVar.i())) {
            super.b(oVar);
        } else {
            this.f8160d.a(oVar);
        }
    }
}
