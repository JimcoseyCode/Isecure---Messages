package R8;

import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: R8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1415j {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n7.j jVar, Function2 function2) {
        AbstractC1416j0 abstractC1416j0A;
        n7.j jVarJ;
        Thread threadCurrentThread = Thread.currentThread();
        n7.g gVar = (n7.g) jVar.e(n7.g.f30066e);
        if (gVar == null) {
            abstractC1416j0A = V0.f10160a.b();
            jVarJ = H.j(C1435t0.f10219g, jVar.X(abstractC1416j0A));
        } else {
            AbstractC1416j0 abstractC1416j0 = gVar instanceof AbstractC1416j0 ? (AbstractC1416j0) gVar : null;
            if (abstractC1416j0 == null) {
                abstractC1416j0A = V0.f10160a.a();
                jVarJ = H.j(C1435t0.f10219g, jVar);
            } else {
                AbstractC1416j0 abstractC1416j02 = abstractC1416j0.Z0() ? abstractC1416j0 : null;
                if (abstractC1416j02 != null) {
                    abstractC1416j0A = abstractC1416j02;
                }
                jVarJ = H.j(C1435t0.f10219g, jVar);
            }
        }
        C1409g c1409g = new C1409g(jVarJ, threadCurrentThread, abstractC1416j0A);
        c1409g.P0(P.f10148g, c1409g, function2);
        return c1409g.Q0();
    }

    public static /* synthetic */ Object b(n7.j jVar, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = n7.k.f30068g;
        }
        return AbstractC1413i.e(jVar, function2);
    }
}
