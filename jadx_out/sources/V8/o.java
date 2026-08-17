package V8;

import R8.D0;
import i7.C2735B;
import i7.C2752o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.j;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends kotlin.coroutines.jvm.internal.d implements U8.c, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U8.c f11870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n7.j f11871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n7.j f11873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n7.f f11874k;

    public o(U8.c cVar, n7.j jVar) {
        super(l.f11865g, n7.k.f30068g);
        this.f11870g = cVar;
        this.f11871h = jVar;
        this.f11872i = ((Number) jVar.u0(0, new Function2() { // from class: V8.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(o.u(((Integer) obj).intValue(), (j.b) obj2));
            }
        })).intValue();
    }

    private final void t(n7.j jVar, n7.j jVar2, Object obj) {
        if (jVar2 instanceof i) {
            w((i) jVar2, obj);
        }
        r.b(this, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(int i10, j.b bVar) {
        return i10 + 1;
    }

    private final Object v(n7.f fVar, Object obj) {
        n7.j context = fVar.getContext();
        D0.g(context);
        n7.j jVar = this.f11873j;
        if (jVar != context) {
            t(context, jVar, obj);
            this.f11873j = context;
        }
        this.f11874k = fVar;
        w7.o oVar = p.f11875a;
        U8.c cVar = this.f11870g;
        AbstractC2855l.e(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC2855l.e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = oVar.invoke(cVar, obj, this);
        if (!AbstractC2855l.b(objInvoke, AbstractC3016b.e())) {
            this.f11874k = null;
        }
        return objInvoke;
    }

    private final void w(i iVar, Object obj) {
        throw new IllegalStateException(P8.q.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + iVar.f11864h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n7.f fVar = this.f11874k;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, n7.f
    public n7.j getContext() {
        n7.j jVar = this.f11873j;
        return jVar == null ? n7.k.f30068g : jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thD = C2752o.d(obj);
        if (thD != null) {
            this.f11873j = new i(thD, getContext());
        }
        n7.f fVar = this.f11874k;
        if (fVar != null) {
            fVar.resumeWith(obj);
        }
        return AbstractC3016b.e();
    }

    @Override // U8.c
    public Object l(Object obj, n7.f fVar) {
        try {
            Object objV = v(fVar, obj);
            if (objV == AbstractC3016b.e()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objV == AbstractC3016b.e() ? objV : C2735B.f28704a;
        } catch (Throwable th) {
            this.f11873j = new i(th, fVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
