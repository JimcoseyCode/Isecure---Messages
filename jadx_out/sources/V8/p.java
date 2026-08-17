package V8;

import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.I;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w7.o f11875a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2853j implements w7.o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f11876g = new a();

        a() {
            super(3, U8.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // w7.o
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(U8.c cVar, Object obj, n7.f fVar) {
            return cVar.l(obj, fVar);
        }
    }

    static {
        a aVar = a.f11876g;
        AbstractC2855l.e(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f11875a = (w7.o) I.e(aVar, 3);
    }
}
