package Z7;

import C8.I0;
import L7.m0;
import j7.T;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final a a(I0 i02, boolean z10, boolean z11, m0 m0Var) {
        AbstractC2855l.g(i02, "<this>");
        return new a(i02, null, z11, z10, m0Var != null ? T.d(m0Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(I0 i02, boolean z10, boolean z11, m0 m0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            m0Var = null;
        }
        return a(i02, z10, z11, m0Var);
    }
}
