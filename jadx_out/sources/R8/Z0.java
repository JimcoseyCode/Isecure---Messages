package R8;

import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Z0 {
    public static final X0 a(long j10, X x10, A0 a02) {
        return new X0("Timed out waiting for " + j10 + " ms", a02);
    }

    private static final Object b(Y0 y02, Function2 function2) {
        D0.e(y02, Y.a(y02.f12152j.getContext()).D0(y02.f10166k, y02, y02.getContext()));
        return X8.b.e(y02, y02, function2);
    }

    public static final Object c(long j10, Function2 function2, n7.f fVar) {
        if (j10 <= 0) {
            throw new X0("Timed out immediately");
        }
        Object objB = b(new Y0(j10, fVar), function2);
        if (objB == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB;
    }
}
