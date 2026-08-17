package C8;

import i7.C2750m;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F0 {
    public static final AbstractC0407d0 a(S s10) {
        AbstractC2855l.g(s10, "<this>");
        M0 m0N0 = s10.N0();
        AbstractC0407d0 abstractC0407d0 = m0N0 instanceof AbstractC0407d0 ? (AbstractC0407d0) m0N0 : null;
        if (abstractC0407d0 != null) {
            return abstractC0407d0;
        }
        throw new IllegalStateException(("This is should be simple type: " + s10).toString());
    }

    public static final S b(S s10, List newArguments, M7.h newAnnotations) {
        AbstractC2855l.g(s10, "<this>");
        AbstractC2855l.g(newArguments, "newArguments");
        AbstractC2855l.g(newAnnotations, "newAnnotations");
        return e(s10, newArguments, newAnnotations, null, 4, null);
    }

    public static final S c(S s10, List newArguments, M7.h newAnnotations, List newArgumentsForUpperBound) {
        AbstractC2855l.g(s10, "<this>");
        AbstractC2855l.g(newArguments, "newArguments");
        AbstractC2855l.g(newAnnotations, "newAnnotations");
        AbstractC2855l.g(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == s10.I0()) && newAnnotations == s10.getAnnotations()) {
            return s10;
        }
        r0 r0VarJ0 = s10.J0();
        if ((newAnnotations instanceof M7.p) && ((M7.p) newAnnotations).isEmpty()) {
            newAnnotations = M7.h.f7570a.b();
        }
        r0 r0VarA = s0.a(r0VarJ0, newAnnotations);
        M0 m0N0 = s10.N0();
        if (m0N0 instanceof I) {
            I i10 = (I) m0N0;
            return V.e(d(i10.S0(), newArguments, r0VarA), d(i10.T0(), newArgumentsForUpperBound, r0VarA));
        }
        if (m0N0 instanceof AbstractC0407d0) {
            return d((AbstractC0407d0) m0N0, newArguments, r0VarA);
        }
        throw new C2750m();
    }

    public static final AbstractC0407d0 d(AbstractC0407d0 abstractC0407d0, List newArguments, r0 newAttributes) {
        AbstractC2855l.g(abstractC0407d0, "<this>");
        AbstractC2855l.g(newArguments, "newArguments");
        AbstractC2855l.g(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == abstractC0407d0.J0()) ? abstractC0407d0 : newArguments.isEmpty() ? abstractC0407d0.Q0(newAttributes) : abstractC0407d0 instanceof E8.i ? ((E8.i) abstractC0407d0).W0(newArguments) : V.k(newAttributes, abstractC0407d0.K0(), newArguments, abstractC0407d0.L0(), null, 16, null);
    }

    public static /* synthetic */ S e(S s10, List list, M7.h hVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = s10.I0();
        }
        if ((i10 & 2) != 0) {
            hVar = s10.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(s10, list, hVar, list2);
    }

    public static /* synthetic */ AbstractC0407d0 f(AbstractC0407d0 abstractC0407d0, List list, r0 r0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = abstractC0407d0.I0();
        }
        if ((i10 & 2) != 0) {
            r0Var = abstractC0407d0.J0();
        }
        return d(abstractC0407d0, list, r0Var);
    }
}
