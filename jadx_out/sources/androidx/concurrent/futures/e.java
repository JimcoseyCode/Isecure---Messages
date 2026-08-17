package androidx.concurrent.futures;

import R8.C1425o;
import i7.C2735B;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.n;
import m5.InterfaceFutureC2904a;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends n implements Function1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceFutureC2904a f15472h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceFutureC2904a interfaceFutureC2904a) {
            super(1);
            this.f15472h = interfaceFutureC2904a;
        }

        public final void a(Throwable th) {
            this.f15472h.cancel(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C2735B.f28704a;
        }
    }

    public static final Object b(InterfaceFutureC2904a interfaceFutureC2904a, n7.f fVar) throws Throwable {
        try {
            if (interfaceFutureC2904a.isDone()) {
                return androidx.concurrent.futures.a.u(interfaceFutureC2904a);
            }
            C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
            interfaceFutureC2904a.h(new g(interfaceFutureC2904a, c1425o), d.INSTANCE);
            c1425o.g(new a(interfaceFutureC2904a));
            Object objZ = c1425o.z();
            if (objZ == AbstractC3016b.e()) {
                h.c(fVar);
            }
            return objZ;
        } catch (ExecutionException e10) {
            throw c(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            AbstractC2855l.s();
        }
        return cause;
    }
}
