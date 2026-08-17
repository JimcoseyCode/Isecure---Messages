package T8;

import T8.k;
import W8.Q;
import i7.AbstractC2738a;
import i7.C2735B;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class r extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f10700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a f10701t;

    public r(int i10, a aVar, Function1 function1) {
        super(i10, function1);
        this.f10700s = i10;
        this.f10701t = aVar;
        if (aVar == a.f10646g) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + D.b(e.class).o() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ Object c1(r rVar, Object obj, n7.f fVar) throws Throwable {
        Q qC;
        Object objE1 = rVar.e1(obj, true);
        if (!(objE1 instanceof k.a)) {
            return C2735B.f28704a;
        }
        k.c(objE1);
        Function1 function1 = rVar.f10666h;
        if (function1 == null || (qC = W8.x.c(function1, obj, null, 2, null)) == null) {
            throw rVar.a0();
        }
        AbstractC2738a.a(qC, rVar.a0());
        throw qC;
    }

    private final Object d1(Object obj, boolean z10) {
        Function1 function1;
        Q qC;
        Object objL = super.l(obj);
        if (k.f(objL) || k.e(objL)) {
            return objL;
        }
        if (!z10 || (function1 = this.f10666h) == null || (qC = W8.x.c(function1, obj, null, 2, null)) == null) {
            return k.f10695a.c(C2735B.f28704a);
        }
        throw qC;
    }

    private final Object e1(Object obj, boolean z10) {
        return this.f10701t == a.f10648i ? d1(obj, z10) : S0(obj);
    }

    @Override // T8.e, T8.w
    public Object b(Object obj, n7.f fVar) {
        return c1(this, obj, fVar);
    }

    @Override // T8.e, T8.w
    public Object l(Object obj) {
        return e1(obj, false);
    }

    @Override // T8.e
    protected boolean p0() {
        return this.f10701t == a.f10647h;
    }
}
