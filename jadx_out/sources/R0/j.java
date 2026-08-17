package R0;

import N0.InterfaceC1309i;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9951g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f9952h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f9953i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, n7.f fVar) {
            super(2, fVar);
            this.f9953i = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, n7.f fVar2) {
            return ((a) create(fVar, fVar2)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = new a(this.f9953i, fVar);
            aVar.f9952h = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f9951g;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f9952h;
                AbstractC2753p.b(obj);
                return cVar;
            }
            AbstractC2753p.b(obj);
            c cVarC = ((f) this.f9952h).c();
            Function2 function2 = this.f9953i;
            this.f9952h = cVarC;
            this.f9951g = 1;
            return function2.invoke(cVarC, this) == objE ? objE : cVarC;
        }
    }

    public static final Object a(InterfaceC1309i interfaceC1309i, Function2 function2, n7.f fVar) {
        return interfaceC1309i.c(new a(function2, null), fVar);
    }
}
