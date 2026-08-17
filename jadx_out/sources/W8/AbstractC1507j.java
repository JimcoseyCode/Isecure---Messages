package W8;

import R8.A0;
import R8.AbstractC1416j0;
import R8.V0;
import R8.Z;
import R8.b1;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: W8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1507j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f12182a = new E("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f12183b = new E("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(n7.f fVar, Object obj) {
        A0 a02;
        if (!(fVar instanceof C1506i)) {
            fVar.resumeWith(obj);
            return;
        }
        C1506i c1506i = (C1506i) fVar;
        Object objB = R8.D.b(obj);
        if (d(c1506i.f12178j, c1506i.getContext())) {
            c1506i.f12180l = objB;
            c1506i.f10171i = 1;
            c(c1506i.f12178j, c1506i.getContext(), c1506i);
            return;
        }
        AbstractC1416j0 abstractC1416j0B = V0.f10160a.b();
        if (abstractC1416j0B.V0()) {
            c1506i.f12180l = objB;
            c1506i.f10171i = 1;
            abstractC1416j0B.R0(c1506i);
            return;
        }
        abstractC1416j0B.T0(true);
        try {
            a02 = (A0) c1506i.getContext().e(A0.f10112c);
        } finally {
            try {
            } finally {
            }
        }
        if (a02 == null || a02.d()) {
            n7.f fVar2 = c1506i.f12179k;
            Object obj2 = c1506i.f12181m;
            n7.j context = fVar2.getContext();
            Object objI = L.i(context, obj2);
            b1 b1VarM = objI != L.f12160a ? R8.H.m(fVar2, context, objI) : null;
            try {
                c1506i.f12179k.resumeWith(obj);
                C2735B c2735b = C2735B.f28704a;
            } finally {
                if (b1VarM == null || b1VarM.R0()) {
                    L.f(context, objI);
                }
            }
        }
        CancellationException cancellationExceptionM = a02.M();
        c1506i.a(objB, cancellationExceptionM);
        C2752o.a aVar = C2752o.f28721h;
        c1506i.resumeWith(C2752o.b(AbstractC2753p.a(cancellationExceptionM)));
        while (abstractC1416j0B.Y0()) {
        }
    }

    public static final void c(R8.J j10, n7.j jVar, Runnable runnable) {
        try {
            j10.J0(jVar, runnable);
        } catch (Throwable th) {
            throw new Z(th, j10, jVar);
        }
    }

    public static final boolean d(R8.J j10, n7.j jVar) throws Z {
        try {
            return j10.L0(jVar);
        } catch (Throwable th) {
            throw new Z(th, j10, jVar);
        }
    }

    public static final boolean e(C1506i c1506i) {
        C2735B c2735b = C2735B.f28704a;
        AbstractC1416j0 abstractC1416j0B = V0.f10160a.b();
        if (abstractC1416j0B.W0()) {
            return false;
        }
        if (abstractC1416j0B.V0()) {
            c1506i.f12180l = c2735b;
            c1506i.f10171i = 1;
            abstractC1416j0B.R0(c1506i);
            return true;
        }
        abstractC1416j0B.T0(true);
        try {
            c1506i.run();
            do {
            } while (abstractC1416j0B.Y0());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
