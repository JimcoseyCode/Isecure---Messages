package R8;

import kotlin.jvm.functions.Function2;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H {
    private static final n7.j d(n7.j jVar, n7.j jVar2, final boolean z10) {
        boolean zH = h(jVar);
        boolean zH2 = h(jVar2);
        if (!zH && !zH2) {
            return jVar.X(jVar2);
        }
        final kotlin.jvm.internal.C c10 = new kotlin.jvm.internal.C();
        c10.f29371g = jVar2;
        n7.k kVar = n7.k.f30068g;
        n7.j jVar3 = (n7.j) jVar.u0(kVar, new Function2() { // from class: R8.F
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return H.e(c10, z10, (n7.j) obj, (j.b) obj2);
            }
        });
        if (zH2) {
            c10.f29371g = ((n7.j) c10.f29371g).u0(kVar, new Function2() { // from class: R8.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return H.f((n7.j) obj, (j.b) obj2);
                }
            });
        }
        return jVar3.X((n7.j) c10.f29371g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n7.j e(kotlin.jvm.internal.C c10, boolean z10, n7.j jVar, j.b bVar) {
        return jVar.X(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n7.j f(n7.j jVar, j.b bVar) {
        return jVar.X(bVar);
    }

    public static final String g(n7.j jVar) {
        return null;
    }

    private static final boolean h(n7.j jVar) {
        return ((Boolean) jVar.u0(Boolean.FALSE, new Function2() { // from class: R8.E
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(H.i(((Boolean) obj).booleanValue(), (j.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, j.b bVar) {
        return z10;
    }

    public static final n7.j j(N n10, n7.j jVar) {
        n7.j jVarD = d(n10.i(), jVar, true);
        return (jVarD == C1404d0.a() || jVarD.e(n7.g.f30066e) != null) ? jVarD : jVarD.X(C1404d0.a());
    }

    public static final n7.j k(n7.j jVar, n7.j jVar2) {
        return !h(jVar2) ? jVar.X(jVar2) : d(jVar, jVar2, false);
    }

    public static final b1 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof C1398a0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof b1) {
                return (b1) eVar;
            }
        }
        return null;
    }

    public static final b1 m(n7.f fVar, n7.j jVar, Object obj) {
        if (!(fVar instanceof kotlin.coroutines.jvm.internal.e) || jVar.e(c1.f10173g) == null) {
            return null;
        }
        b1 b1VarL = l((kotlin.coroutines.jvm.internal.e) fVar);
        if (b1VarL != null) {
            b1VarL.T0(jVar, obj);
        }
        return b1VarL;
    }
}
