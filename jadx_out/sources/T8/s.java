package T8;

import R8.H;
import R8.N;
import R8.P;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static final v a(N n10, n7.j jVar, int i10, a aVar, P p10, Function1 function1, Function2 function2) {
        t tVar = new t(H.j(n10, jVar), j.b(i10, aVar, null, 4, null));
        if (function1 != null) {
            tVar.g0(function1);
        }
        tVar.P0(p10, tVar, function2);
        return tVar;
    }

    public static /* synthetic */ v b(N n10, n7.j jVar, int i10, a aVar, P p10, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = n7.k.f30068g;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = a.f10646g;
        }
        if ((i11 & 8) != 0) {
            p10 = P.f10148g;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return a(n10, jVar, i10, aVar, p10, function12, function2);
    }
}
