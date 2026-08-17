package R8;

import i7.C2735B;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends W8.A {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ThreadLocal f10172k;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public b1(n7.j jVar, n7.f fVar) {
        c1 c1Var = c1.f10173g;
        super(jVar.e(c1Var) == null ? jVar.X(c1Var) : jVar, fVar);
        this.f10172k = new ThreadLocal();
        if (fVar.getContext().e(n7.g.f30066e) instanceof J) {
            return;
        }
        Object objI = W8.L.i(jVar, null);
        W8.L.f(jVar, objI);
        T0(jVar, objI);
    }

    private final void S0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f10172k.get();
            if (pair != null) {
                W8.L.f((n7.j) pair.getFirst(), pair.getSecond());
            }
            this.f10172k.remove();
        }
    }

    @Override // W8.A, R8.AbstractC1397a
    protected void M0(Object obj) {
        S0();
        Object objA = D.a(obj, this.f12152j);
        n7.f fVar = this.f12152j;
        n7.j context = fVar.getContext();
        Object objI = W8.L.i(context, null);
        b1 b1VarM = objI != W8.L.f12160a ? H.m(fVar, context, objI) : null;
        try {
            this.f12152j.resumeWith(objA);
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

    @Override // W8.A
    public void Q0() {
        S0();
    }

    public final boolean R0() {
        boolean z10 = this.threadLocalIsSet && this.f10172k.get() == null;
        this.f10172k.remove();
        return !z10;
    }

    public final void T0(n7.j jVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f10172k.set(i7.t.a(jVar, obj));
    }
}
