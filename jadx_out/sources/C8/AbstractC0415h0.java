package C8;

import C8.C0438y;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0415h0 {
    public static final C0400a a(S s10) {
        AbstractC2855l.g(s10, "<this>");
        M0 m0N0 = s10.N0();
        if (m0N0 instanceof C0400a) {
            return (C0400a) m0N0;
        }
        return null;
    }

    public static final AbstractC0407d0 b(S s10) {
        AbstractC2855l.g(s10, "<this>");
        C0400a c0400aA = a(s10);
        if (c0400aA != null) {
            return c0400aA.W0();
        }
        return null;
    }

    public static final boolean c(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return s10.N0() instanceof C0438y;
    }

    private static final Q d(Q q10) {
        S s10;
        Collection collectionG = q10.g();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionG, 10));
        Iterator it = collectionG.iterator();
        boolean z10 = false;
        while (true) {
            s10 = null;
            if (!it.hasNext()) {
                break;
            }
            S sF = (S) it.next();
            if (J0.l(sF)) {
                sF = f(sF.N0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(sF);
        }
        if (!z10) {
            return null;
        }
        S sH = q10.h();
        if (sH != null) {
            if (J0.l(sH)) {
                sH = f(sH.N0(), false, 1, null);
            }
            s10 = sH;
        }
        return new Q(arrayList).r(s10);
    }

    public static final M0 e(M0 m02, boolean z10) {
        AbstractC2855l.g(m02, "<this>");
        C0438y c0438yC = C0438y.a.c(C0438y.f716j, m02, z10, false, 4, null);
        if (c0438yC != null) {
            return c0438yC;
        }
        AbstractC0407d0 abstractC0407d0G = g(m02);
        return abstractC0407d0G != null ? abstractC0407d0G : m02.O0(false);
    }

    public static /* synthetic */ M0 f(M0 m02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(m02, z10);
    }

    private static final AbstractC0407d0 g(S s10) {
        Q qD;
        v0 v0VarK0 = s10.K0();
        Q q10 = v0VarK0 instanceof Q ? (Q) v0VarK0 : null;
        if (q10 == null || (qD = d(q10)) == null) {
            return null;
        }
        return qD.e();
    }

    public static final AbstractC0407d0 h(AbstractC0407d0 abstractC0407d0, boolean z10) {
        AbstractC2855l.g(abstractC0407d0, "<this>");
        C0438y c0438yC = C0438y.a.c(C0438y.f716j, abstractC0407d0, z10, false, 4, null);
        if (c0438yC != null) {
            return c0438yC;
        }
        AbstractC0407d0 abstractC0407d0G = g(abstractC0407d0);
        return abstractC0407d0G == null ? abstractC0407d0.O0(false) : abstractC0407d0G;
    }

    public static /* synthetic */ AbstractC0407d0 i(AbstractC0407d0 abstractC0407d0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(abstractC0407d0, z10);
    }

    public static final AbstractC0407d0 j(AbstractC0407d0 abstractC0407d0, AbstractC0407d0 abbreviatedType) {
        AbstractC2855l.g(abstractC0407d0, "<this>");
        AbstractC2855l.g(abbreviatedType, "abbreviatedType");
        return W.a(abstractC0407d0) ? abstractC0407d0 : new C0400a(abstractC0407d0, abbreviatedType);
    }

    public static final D8.i k(D8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return new D8.i(iVar.T0(), iVar.K0(), iVar.V0(), iVar.J0(), iVar.L0(), true);
    }
}
