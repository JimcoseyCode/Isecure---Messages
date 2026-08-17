package R8;

import W8.AbstractC1507j;
import W8.C1506i;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: R8.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1402c0 {
    public static final void a(AbstractC1400b0 abstractC1400b0, int i10) {
        n7.f fVarC = abstractC1400b0.c();
        boolean z10 = i10 == 4;
        if (z10 || !(fVarC instanceof C1506i) || b(i10) != b(abstractC1400b0.f10171i)) {
            d(abstractC1400b0, fVarC, z10);
            return;
        }
        C1506i c1506i = (C1506i) fVarC;
        J j10 = c1506i.f12178j;
        n7.j context = c1506i.getContext();
        if (AbstractC1507j.d(j10, context)) {
            AbstractC1507j.c(j10, context, abstractC1400b0);
        } else {
            e(abstractC1400b0);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(AbstractC1400b0 abstractC1400b0, n7.f fVar, boolean z10) {
        Object objH;
        Object objK = abstractC1400b0.k();
        Throwable thE = abstractC1400b0.e(objK);
        if (thE != null) {
            C2752o.a aVar = C2752o.f28721h;
            objH = AbstractC2753p.a(thE);
        } else {
            C2752o.a aVar2 = C2752o.f28721h;
            objH = abstractC1400b0.h(objK);
        }
        Object objB = C2752o.b(objH);
        if (!z10) {
            fVar.resumeWith(objB);
            return;
        }
        AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1506i c1506i = (C1506i) fVar;
        n7.f fVar2 = c1506i.f12179k;
        Object obj = c1506i.f12181m;
        n7.j context = fVar2.getContext();
        Object objI = W8.L.i(context, obj);
        b1 b1VarM = objI != W8.L.f12160a ? H.m(fVar2, context, objI) : null;
        try {
            c1506i.f12179k.resumeWith(objB);
            C2735B c2735b = C2735B.f28704a;
            if (b1VarM == null || b1VarM.R0()) {
                W8.L.f(context, objI);
            }
        } catch (Throwable th) {
            if (b1VarM == null || b1VarM.R0()) {
                W8.L.f(context, objI);
            }
            throw th;
        }
    }

    private static final void e(AbstractC1400b0 abstractC1400b0) {
        AbstractC1416j0 abstractC1416j0B = V0.f10160a.b();
        if (abstractC1416j0B.V0()) {
            abstractC1416j0B.R0(abstractC1400b0);
            return;
        }
        abstractC1416j0B.T0(true);
        try {
            d(abstractC1400b0, abstractC1400b0.c(), true);
            do {
            } while (abstractC1416j0B.Y0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
