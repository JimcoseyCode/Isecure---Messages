package R8;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.g;
import o7.AbstractC3016b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: R8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1417k {
    public static final V a(N n10, n7.j jVar, P p10, Function2 function2) {
        n7.j jVarJ = H.j(n10, jVar);
        W i02 = p10.k() ? new I0(jVarJ, function2) : new W(jVarJ, true);
        i02.P0(p10, i02, function2);
        return i02;
    }

    public static /* synthetic */ V b(N n10, n7.j jVar, P p10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = n7.k.f30068g;
        }
        if ((i10 & 2) != 0) {
            p10 = P.f10148g;
        }
        return AbstractC1413i.a(n10, jVar, p10, function2);
    }

    public static final A0 c(N n10, n7.j jVar, P p10, Function2 function2) {
        n7.j jVarJ = H.j(n10, jVar);
        R0 j02 = p10.k() ? new J0(jVarJ, function2) : new R0(jVarJ, true);
        j02.P0(p10, j02, function2);
        return j02;
    }

    public static /* synthetic */ A0 d(N n10, n7.j jVar, P p10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = n7.k.f30068g;
        }
        if ((i10 & 2) != 0) {
            p10 = P.f10148g;
        }
        return AbstractC1413i.c(n10, jVar, p10, function2);
    }

    public static final Object e(n7.j jVar, Function2 function2, n7.f fVar) {
        Object objR0;
        n7.j context = fVar.getContext();
        n7.j jVarK = H.k(context, jVar);
        D0.g(jVarK);
        if (jVarK == context) {
            W8.A a10 = new W8.A(jVarK, fVar);
            objR0 = X8.b.d(a10, a10, function2);
        } else {
            g.b bVar = n7.g.f30066e;
            if (AbstractC2855l.b(jVarK.e(bVar), context.e(bVar))) {
                b1 b1Var = new b1(jVarK, fVar);
                n7.j context2 = b1Var.getContext();
                Object objI = W8.L.i(context2, null);
                try {
                    Object objD = X8.b.d(b1Var, b1Var, function2);
                    W8.L.f(context2, objI);
                    objR0 = objD;
                } catch (Throwable th) {
                    W8.L.f(context2, objI);
                    throw th;
                }
            } else {
                C1398a0 c1398a0 = new C1398a0(jVarK, fVar);
                X8.a.b(function2, c1398a0, c1398a0);
                objR0 = c1398a0.R0();
            }
        }
        if (objR0 == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objR0;
    }
}
