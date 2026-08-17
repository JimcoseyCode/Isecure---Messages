package X8;

import R8.Z;
import W8.AbstractC1507j;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import kotlin.jvm.functions.Function2;
import n7.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private static final void a(f fVar, Throwable th) throws Throwable {
        if (th instanceof Z) {
            th = ((Z) th).getCause();
        }
        C2752o.a aVar = C2752o.f28721h;
        fVar.resumeWith(C2752o.b(AbstractC2753p.a(th)));
        throw th;
    }

    public static final void b(Function2 function2, Object obj, f fVar) {
        try {
            f fVarC = AbstractC3016b.c(AbstractC3016b.a(function2, obj, fVar));
            C2752o.a aVar = C2752o.f28721h;
            AbstractC1507j.b(fVarC, C2752o.b(C2735B.f28704a));
        } catch (Throwable th) {
            a(fVar, th);
        }
    }

    public static final void c(f fVar, f fVar2) throws Throwable {
        try {
            f fVarC = AbstractC3016b.c(fVar);
            C2752o.a aVar = C2752o.f28721h;
            AbstractC1507j.b(fVarC, C2752o.b(C2735B.f28704a));
        } catch (Throwable th) {
            a(fVar2, th);
        }
    }
}
