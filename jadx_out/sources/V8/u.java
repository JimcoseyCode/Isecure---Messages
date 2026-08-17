package V8;

import W8.L;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class u implements U8.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n7.j f11881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f11882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Function2 f11883i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f11885h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ U8.c f11886i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U8.c cVar, n7.f fVar) {
            super(2, fVar);
            this.f11886i = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, n7.f fVar) {
            return ((a) create(obj, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = new a(this.f11886i, fVar);
            aVar.f11885h = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f11884g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                Object obj2 = this.f11885h;
                U8.c cVar = this.f11886i;
                this.f11884g = 1;
                if (cVar.l(obj2, this) == objE) {
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

    public u(U8.c cVar, n7.j jVar) {
        this.f11881g = jVar;
        this.f11882h = L.g(jVar);
        this.f11883i = new a(cVar, null);
    }

    @Override // U8.c
    public Object l(Object obj, n7.f fVar) {
        Object objB = f.b(this.f11881g, obj, this.f11882h, this.f11883i, fVar);
        return objB == AbstractC3016b.e() ? objB : C2735B.f28704a;
    }
}
