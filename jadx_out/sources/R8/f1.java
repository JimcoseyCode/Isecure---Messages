package R8;

import W8.AbstractC1507j;
import W8.C1506i;
import i7.C2735B;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f1 {
    public static final Object a(n7.f fVar) {
        Object objE;
        n7.j context = fVar.getContext();
        D0.g(context);
        n7.f fVarC = AbstractC3016b.c(fVar);
        C1506i c1506i = fVarC instanceof C1506i ? (C1506i) fVarC : null;
        if (c1506i == null) {
            objE = C2735B.f28704a;
        } else {
            if (AbstractC1507j.d(c1506i.f12178j, context)) {
                c1506i.p(context, C2735B.f28704a);
            } else {
                e1 e1Var = new e1();
                n7.j jVarX = context.X(e1Var);
                C2735B c2735b = C2735B.f28704a;
                c1506i.p(jVarX, c2735b);
                objE = (!e1Var.f10188h || AbstractC1507j.e(c1506i)) ? AbstractC3016b.e() : c2735b;
            }
            objE = AbstractC3016b.e();
        }
        if (objE == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objE == AbstractC3016b.e() ? objE : C2735B.f28704a;
    }
}
