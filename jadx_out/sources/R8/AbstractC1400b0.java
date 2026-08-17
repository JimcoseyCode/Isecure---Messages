package R8;

import W8.C1506i;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: R8.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1400b0 extends Y8.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10171i;

    public AbstractC1400b0(int i10) {
        this.f10171i = i10;
    }

    public abstract n7.f c();

    public Throwable e(Object obj) {
        B b10 = obj instanceof B ? (B) obj : null;
        if (b10 != null) {
            return b10.f10115a;
        }
        return null;
    }

    public final void i(Throwable th) {
        L.a(c().getContext(), new Q("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            n7.f fVarC = c();
            AbstractC2855l.e(fVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1506i c1506i = (C1506i) fVarC;
            n7.f fVar = c1506i.f12179k;
            Object obj = c1506i.f12181m;
            n7.j context = fVar.getContext();
            Object objI = W8.L.i(context, obj);
            A0 a02 = null;
            b1 b1VarM = objI != W8.L.f12160a ? H.m(fVar, context, objI) : null;
            try {
                n7.j context2 = fVar.getContext();
                Object objK = k();
                Throwable thE = e(objK);
                if (thE == null && AbstractC1402c0.b(this.f10171i)) {
                    a02 = (A0) context2.e(A0.f10112c);
                }
                if (a02 != null && !a02.d()) {
                    CancellationException cancellationExceptionM = a02.M();
                    a(objK, cancellationExceptionM);
                    C2752o.a aVar = C2752o.f28721h;
                    fVar.resumeWith(C2752o.b(AbstractC2753p.a(cancellationExceptionM)));
                } else if (thE != null) {
                    C2752o.a aVar2 = C2752o.f28721h;
                    fVar.resumeWith(C2752o.b(AbstractC2753p.a(thE)));
                } else {
                    C2752o.a aVar3 = C2752o.f28721h;
                    fVar.resumeWith(C2752o.b(h(objK)));
                }
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
        } catch (Z e10) {
            L.a(c().getContext(), e10.getCause());
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public Object h(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th) {
    }
}
