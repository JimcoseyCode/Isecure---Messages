package R8;

import i7.AbstractC2753p;
import i7.C2735B;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: R8.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1443x0 {

    /* JADX INFO: renamed from: R8.x0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f10224h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC3487a f10225i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3487a interfaceC3487a, n7.f fVar) {
            super(2, fVar);
            this.f10225i = interfaceC3487a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = new a(this.f10225i, fVar);
            aVar.f10224h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((a) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.f10223g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return AbstractC1443x0.d(((N) this.f10224h).i(), this.f10225i);
        }
    }

    public static final Object b(n7.j jVar, InterfaceC3487a interfaceC3487a, n7.f fVar) {
        return AbstractC1413i.g(jVar, new a(interfaceC3487a, null), fVar);
    }

    public static /* synthetic */ Object c(n7.j jVar, InterfaceC3487a interfaceC3487a, n7.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = n7.k.f30068g;
        }
        return b(jVar, interfaceC3487a, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(n7.j jVar, InterfaceC3487a interfaceC3487a) throws Throwable {
        try {
            W0 w02 = new W0();
            w02.B(D0.h(jVar));
            try {
                return interfaceC3487a.invoke();
            } finally {
                w02.y();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
