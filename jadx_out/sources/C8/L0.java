package C8;

import i7.C2750m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final S a(S s10) {
        AbstractC2855l.g(s10, "<this>");
        if (s10 instanceof K0) {
            return ((K0) s10).G();
        }
        return null;
    }

    public static final M0 b(M0 m02, S origin) {
        AbstractC2855l.g(m02, "<this>");
        AbstractC2855l.g(origin, "origin");
        return d(m02, a(origin));
    }

    public static final M0 c(M0 m02, S origin, Function1 transform) {
        AbstractC2855l.g(m02, "<this>");
        AbstractC2855l.g(origin, "origin");
        AbstractC2855l.g(transform, "transform");
        S sA = a(origin);
        return d(m02, sA != null ? (S) transform.invoke(sA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final M0 d(M0 m02, S s10) {
        AbstractC2855l.g(m02, "<this>");
        if (m02 instanceof K0) {
            return d(((K0) m02).C0(), s10);
        }
        if (s10 == null || AbstractC2855l.b(s10, m02)) {
            return m02;
        }
        if (m02 instanceof AbstractC0407d0) {
            return new C0413g0((AbstractC0407d0) m02, s10);
        }
        if (m02 instanceof I) {
            return new K((I) m02, s10);
        }
        throw new C2750m();
    }
}
