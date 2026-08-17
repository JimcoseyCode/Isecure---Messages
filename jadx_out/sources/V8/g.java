package V8;

import R8.H;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.g;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final U8.b f11859j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11860g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f11861h;

        a(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(U8.c cVar, n7.f fVar) {
            return ((a) create(cVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = g.this.new a(fVar);
            aVar.f11861h = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f11860g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                U8.c cVar = (U8.c) this.f11861h;
                g gVar = g.this;
                this.f11860g = 1;
                if (gVar.n(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    public g(U8.b bVar, n7.j jVar, int i10, T8.a aVar) {
        super(jVar, i10, aVar);
        this.f11859j = bVar;
    }

    static /* synthetic */ Object k(g gVar, U8.c cVar, n7.f fVar) {
        if (gVar.f11850h == -3) {
            n7.j context = fVar.getContext();
            n7.j jVarK = H.k(context, gVar.f11849g);
            if (AbstractC2855l.b(jVarK, context)) {
                Object objN = gVar.n(cVar, fVar);
                return objN == AbstractC3016b.e() ? objN : C2735B.f28704a;
            }
            g.b bVar = n7.g.f30066e;
            if (AbstractC2855l.b(jVarK.e(bVar), context.e(bVar))) {
                Object objM = gVar.m(cVar, jVarK, fVar);
                return objM == AbstractC3016b.e() ? objM : C2735B.f28704a;
            }
        }
        Object objB = super.b(cVar, fVar);
        return objB == AbstractC3016b.e() ? objB : C2735B.f28704a;
    }

    static /* synthetic */ Object l(g gVar, T8.u uVar, n7.f fVar) {
        Object objN = gVar.n(new s(uVar), fVar);
        return objN == AbstractC3016b.e() ? objN : C2735B.f28704a;
    }

    private final Object m(U8.c cVar, n7.j jVar, n7.f fVar) {
        return f.c(jVar, f.d(cVar, fVar.getContext()), null, new a(null), fVar, 4, null);
    }

    @Override // V8.e, U8.b
    public Object b(U8.c cVar, n7.f fVar) {
        return k(this, cVar, fVar);
    }

    @Override // V8.e
    protected Object f(T8.u uVar, n7.f fVar) {
        return l(this, uVar, fVar);
    }

    protected abstract Object n(U8.c cVar, n7.f fVar);

    @Override // V8.e
    public String toString() {
        return this.f11859j + " -> " + super.toString();
    }
}
