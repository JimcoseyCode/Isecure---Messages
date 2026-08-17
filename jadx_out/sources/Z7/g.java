package Z7;

import C8.A0;
import C8.B0;
import C8.D0;
import C8.F;
import C8.G;
import C8.J0;
import C8.N0;
import C8.S;
import L7.m0;
import i7.C2750m;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends F {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13646a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f13633i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f13632h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f13631g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13646a = iArr;
        }
    }

    @Override // C8.F
    public B0 a(m0 parameter, G typeAttr, A0 typeParameterUpperBoundEraser, S erasedUpperBound) {
        AbstractC2855l.g(parameter, "parameter");
        AbstractC2855l.g(typeAttr, "typeAttr");
        AbstractC2855l.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC2855l.g(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof Z7.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        Z7.a aVarL = (Z7.a) typeAttr;
        if (!aVarL.i()) {
            aVarL = aVarL.l(c.f13631g);
        }
        int i10 = a.f13646a[aVarL.g().ordinal()];
        if (i10 == 1) {
            return new D0(N0.f592k, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new C2750m();
        }
        if (!parameter.m().j()) {
            return new D0(N0.f592k, AbstractC3340e.m(parameter).H());
        }
        List parameters = erasedUpperBound.K0().getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new D0(N0.f594m, erasedUpperBound);
        }
        B0 b0T = J0.t(parameter, aVarL);
        AbstractC2855l.d(b0T);
        return b0T;
    }
}
