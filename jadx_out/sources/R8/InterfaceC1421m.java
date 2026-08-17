package R8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: R8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1421m extends n7.f {

    /* JADX INFO: renamed from: R8.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC1421m interfaceC1421m, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC1421m.n(th);
        }
    }

    boolean d();

    void f(Object obj, w7.o oVar);

    void g(Function1 function1);

    boolean isCancelled();

    boolean isCompleted();

    Object j(Throwable th);

    boolean n(Throwable th);

    Object o(Object obj, Object obj2, w7.o oVar);

    void q(Object obj);
}
