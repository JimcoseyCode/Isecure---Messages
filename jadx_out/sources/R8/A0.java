package R8;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface A0 extends j.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f10112c = b.f10113g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static /* synthetic */ void a(A0 a02, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            a02.k(cancellationException);
        }

        public static Object b(A0 a02, Object obj, Function2 function2) {
            return j.b.a.a(a02, obj, function2);
        }

        public static j.b c(A0 a02, j.c cVar) {
            return j.b.a.b(a02, cVar);
        }

        public static n7.j d(A0 a02, j.c cVar) {
            return j.b.a.c(a02, cVar);
        }

        public static n7.j e(A0 a02, n7.j jVar) {
            return j.b.a.d(a02, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements j.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ b f10113g = new b();

        private b() {
        }
    }

    InterfaceC1434t A(InterfaceC1438v interfaceC1438v);

    InterfaceC1408f0 J(boolean z10, boolean z11, Function1 function1);

    CancellationException M();

    boolean d();

    InterfaceC1408f0 g0(Function1 function1);

    boolean isCompleted();

    void k(CancellationException cancellationException);

    boolean start();
}
