package C8;

import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L {
    public static final I a(S s10) {
        AbstractC2855l.g(s10, "<this>");
        M0 m0N0 = s10.N0();
        AbstractC2855l.e(m0N0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (I) m0N0;
    }

    public static final boolean b(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return s10.N0() instanceof I;
    }

    public static final AbstractC0407d0 c(S s10) {
        AbstractC2855l.g(s10, "<this>");
        M0 m0N0 = s10.N0();
        if (m0N0 instanceof I) {
            return ((I) m0N0).S0();
        }
        if (m0N0 instanceof AbstractC0407d0) {
            return (AbstractC0407d0) m0N0;
        }
        throw new C2750m();
    }

    public static final AbstractC0407d0 d(S s10) {
        AbstractC2855l.g(s10, "<this>");
        M0 m0N0 = s10.N0();
        if (m0N0 instanceof I) {
            return ((I) m0N0).T0();
        }
        if (m0N0 instanceof AbstractC0407d0) {
            return (AbstractC0407d0) m0N0;
        }
        throw new C2750m();
    }
}
