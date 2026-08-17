package C8;

import C8.q0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s0 {
    public static final r0 a(r0 r0Var, M7.h newAnnotations) {
        r0 r0VarW;
        AbstractC2855l.g(r0Var, "<this>");
        AbstractC2855l.g(newAnnotations, "newAnnotations");
        if (AbstractC0433t.a(r0Var) == newAnnotations) {
            return r0Var;
        }
        C0432s c0432sB = AbstractC0433t.b(r0Var);
        if (c0432sB != null && (r0VarW = r0Var.w(c0432sB)) != null) {
            r0Var = r0VarW;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? r0Var.v(new C0432s(newAnnotations)) : r0Var;
    }

    public static final r0 b(M7.h hVar) {
        AbstractC2855l.g(hVar, "<this>");
        return q0.a.a(C0437x.f713a, hVar, null, null, 6, null);
    }
}
