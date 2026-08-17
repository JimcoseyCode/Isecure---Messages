package F;

import E.InterfaceC0450j;
import F.k1;
import java.util.Collections;
import java.util.List;
import m5.InterfaceFutureC2904a;
import y.C3565J;
import y.C3566K;
import y.InterfaceC3586j;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface I extends InterfaceC3586j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f1344a = new b();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC0450j {
        a() {
        }

        @Override // E.InterfaceC0450j
        public InterfaceFutureC2904a a() {
            return J.n.p(null);
        }

        @Override // E.InterfaceC0450j
        public InterfaceFutureC2904a b() {
            return J.n.p(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C0508t f1346g;

        public c(C0508t c0508t) {
            this.f1346g = c0508t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        void a();

        void b(List list);
    }

    void a();

    void b(k1.b bVar);

    InterfaceFutureC2904a e(List list, int i10, int i11);

    void h(int i10);

    void j(InterfaceC0490j0 interfaceC0490j0);

    default InterfaceFutureC2904a l(int i10, int i11) {
        return J.n.p(new a());
    }

    InterfaceC0490j0 m();

    void n();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements I {
        b() {
        }

        @Override // F.I
        public InterfaceFutureC2904a e(List list, int i10, int i11) {
            return J.n.p(Collections.EMPTY_LIST);
        }

        @Override // y.InterfaceC3586j
        public InterfaceFutureC2904a f() {
            return J.n.p(null);
        }

        @Override // y.InterfaceC3586j
        public InterfaceFutureC2904a g(float f10) {
            return J.n.p(null);
        }

        @Override // y.InterfaceC3586j
        public InterfaceFutureC2904a i(C3565J c3565j) {
            return J.n.p(C3566K.b());
        }

        @Override // y.InterfaceC3586j
        public InterfaceFutureC2904a k(boolean z10) {
            return J.n.p(null);
        }

        @Override // F.I
        public InterfaceC0490j0 m() {
            return null;
        }

        @Override // F.I
        public void a() {
        }

        @Override // F.I
        public void n() {
        }

        @Override // F.I
        public void b(k1.b bVar) {
        }

        @Override // F.I
        public void h(int i10) {
        }

        @Override // F.I
        public void j(InterfaceC0490j0 interfaceC0490j0) {
        }
    }

    default void d() {
    }

    default void o() {
    }

    default void c(V.i iVar) {
    }
}
