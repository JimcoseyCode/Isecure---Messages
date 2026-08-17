package F;

import java.util.Collection;
import m5.InterfaceFutureC2904a;
import y.InterfaceC3584i;
import y.InterfaceC3586j;
import y.InterfaceC3597q;
import y.J0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface M extends InterfaceC3584i, J0.c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f1362g;

        a(boolean z10) {
            this.f1362g = z10;
        }

        boolean j() {
            return this.f1362g;
        }
    }

    InterfaceFutureC2904a a();

    @Override // y.InterfaceC3584i
    default InterfaceC3586j b() {
        return h();
    }

    V0 c();

    @Override // y.InterfaceC3584i
    default InterfaceC3597q d() {
        return r();
    }

    default boolean f() {
        return d().k() == 0;
    }

    I h();

    default E i() {
        return H.a();
    }

    void l(Collection collection);

    void m(Collection collection);

    default boolean o() {
        return true;
    }

    L r();

    default void n() {
    }

    default void j(boolean z10) {
    }

    default void p(boolean z10) {
    }

    default void q(E e10) {
    }
}
