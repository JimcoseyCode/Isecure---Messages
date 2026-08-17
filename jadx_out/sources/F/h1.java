package F;

import F.InterfaceC0490j0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface h1 extends InterfaceC0490j0 {
    @Override // F.InterfaceC0490j0
    default Set a() {
        return o().a();
    }

    @Override // F.InterfaceC0490j0
    default boolean b(InterfaceC0490j0.a aVar) {
        return o().b(aVar);
    }

    @Override // F.InterfaceC0490j0
    default InterfaceC0490j0.c c(InterfaceC0490j0.a aVar) {
        return o().c(aVar);
    }

    @Override // F.InterfaceC0490j0
    default Object d(InterfaceC0490j0.a aVar) {
        return o().d(aVar);
    }

    @Override // F.InterfaceC0490j0
    default Object e(InterfaceC0490j0.a aVar, InterfaceC0490j0.c cVar) {
        return o().e(aVar, cVar);
    }

    @Override // F.InterfaceC0490j0
    default Object f(InterfaceC0490j0.a aVar, Object obj) {
        return o().f(aVar, obj);
    }

    @Override // F.InterfaceC0490j0
    default Set g(InterfaceC0490j0.a aVar) {
        return o().g(aVar);
    }

    @Override // F.InterfaceC0490j0
    default void h(String str, InterfaceC0490j0.b bVar) {
        o().h(str, bVar);
    }

    InterfaceC0490j0 o();
}
