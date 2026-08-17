package L7;

import C8.E0;
import C8.G0;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: L7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1300z extends InterfaceC1277b {

    /* JADX INFO: renamed from: L7.z$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        a a();

        a b(AbstractC1295u abstractC1295u);

        InterfaceC1300z build();

        a c(M7.h hVar);

        a d(List list);

        a e(InterfaceC1276a.InterfaceC0068a interfaceC0068a, Object obj);

        a f(C8.S s10);

        a g(c0 c0Var);

        a h();

        a i(InterfaceC1277b.a aVar);

        a j();

        a k(boolean z10);

        a l(k8.f fVar);

        a m(InterfaceC1288m interfaceC1288m);

        a n(List list);

        a o(c0 c0Var);

        a p(E0 e02);

        a q();

        a r(InterfaceC1277b interfaceC1277b);

        a s(E e10);

        a t();
    }

    boolean N();

    InterfaceC1300z Z();

    @Override // L7.InterfaceC1277b, L7.InterfaceC1276a, L7.InterfaceC1288m
    InterfaceC1300z a();

    @Override // L7.InterfaceC1289n, L7.InterfaceC1288m
    InterfaceC1288m b();

    InterfaceC1300z c(G0 g02);

    @Override // L7.InterfaceC1277b, L7.InterfaceC1276a
    Collection e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    a s();

    boolean t0();

    boolean z0();
}
