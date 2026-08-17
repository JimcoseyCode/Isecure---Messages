package N0;

import i7.AbstractC2753p;
import i7.C2735B;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements w7.o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7718g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f7719h;

        a(n7.f fVar) {
            super(3, fVar);
        }

        public final Object c(y yVar, boolean z10, n7.f fVar) {
            a aVar = new a(fVar);
            aVar.f7719h = yVar;
            return aVar.invokeSuspend(C2735B.f28704a);
        }

        @Override // w7.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((y) obj, ((Boolean) obj2).booleanValue(), (n7.f) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f7718g;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            y yVar = (y) this.f7719h;
            this.f7718g = 1;
            Object objE2 = yVar.e(this);
            return objE2 == objE ? objE : objE2;
        }
    }

    public static final Object a(F f10, n7.f fVar) {
        return f10.a(new a(null), fVar);
    }
}
