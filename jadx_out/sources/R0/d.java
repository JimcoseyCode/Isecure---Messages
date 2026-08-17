package R0;

import N0.InterfaceC1309i;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1309i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1309i f9942a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f9944h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f9945i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, n7.f fVar) {
            super(2, fVar);
            this.f9945i = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, n7.f fVar2) {
            return ((a) create(fVar, fVar2)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = new a(this.f9945i, fVar);
            aVar.f9944h = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f9943g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                f fVar = (f) this.f9944h;
                Function2 function2 = this.f9945i;
                this.f9943g = 1;
                obj = function2.invoke(fVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            f fVar2 = (f) obj;
            AbstractC2855l.e(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }
    }

    public d(InterfaceC1309i delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f9942a = delegate;
    }

    @Override // N0.InterfaceC1309i
    public U8.b b() {
        return this.f9942a.b();
    }

    @Override // N0.InterfaceC1309i
    public Object c(Function2 function2, n7.f fVar) {
        return this.f9942a.c(new a(function2, null), fVar);
    }
}
