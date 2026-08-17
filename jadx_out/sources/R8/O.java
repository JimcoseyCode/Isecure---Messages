package R8;

import W8.C1502e;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O {
    public static final N a(n7.j jVar) {
        if (jVar.e(A0.f10112c) == null) {
            jVar = jVar.X(E0.b(null, 1, null));
        }
        return new C1502e(jVar);
    }

    public static final void b(N n10, CancellationException cancellationException) {
        A0 a02 = (A0) n10.i().e(A0.f10112c);
        if (a02 != null) {
            a02.k(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + n10).toString());
    }

    public static final Object c(Function2 function2, n7.f fVar) {
        W8.A a10 = new W8.A(fVar.getContext(), fVar);
        Object objD = X8.b.d(a10, a10, function2);
        if (objD == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objD;
    }

    public static final void d(N n10) {
        D0.g(n10.i());
    }

    public static final boolean e(N n10) {
        A0 a02 = (A0) n10.i().e(A0.f10112c);
        if (a02 != null) {
            return a02.d();
        }
        return true;
    }
}
