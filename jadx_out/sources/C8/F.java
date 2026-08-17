package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F {
    public static /* synthetic */ B0 b(F f10, L7.m0 m0Var, G g10, A0 a02, S s10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            s10 = a02.e(m0Var, g10);
        }
        return f10.a(m0Var, g10, a02, s10);
    }

    public B0 a(L7.m0 parameter, G typeAttr, A0 typeParameterUpperBoundEraser, S erasedUpperBound) {
        AbstractC2855l.g(parameter, "parameter");
        AbstractC2855l.g(typeAttr, "typeAttr");
        AbstractC2855l.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC2855l.g(erasedUpperBound, "erasedUpperBound");
        return new D0(N0.f594m, erasedUpperBound);
    }
}
