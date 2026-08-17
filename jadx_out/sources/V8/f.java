package V8;

import W8.L;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final Object b(n7.j jVar, Object obj, Object obj2, Function2 function2, n7.f fVar) {
        Object objI = L.i(jVar, obj2);
        try {
            t tVar = new t(fVar, jVar);
            Object objD = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC3016b.d(function2, obj, tVar) : ((Function2) I.e(function2, 2)).invoke(obj, tVar);
            L.f(jVar, objI);
            if (objD == AbstractC3016b.e()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objD;
        } catch (Throwable th) {
            L.f(jVar, objI);
            throw th;
        }
    }

    public static /* synthetic */ Object c(n7.j jVar, Object obj, Object obj2, Function2 function2, n7.f fVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = L.g(jVar);
        }
        return b(jVar, obj, obj2, function2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U8.c d(U8.c cVar, n7.j jVar) {
        return !(cVar instanceof s) ? new u(cVar, jVar) : cVar;
    }
}
