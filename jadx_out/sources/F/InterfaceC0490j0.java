package F;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: F.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0490j0 {

    /* JADX INFO: renamed from: F.j0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        a() {
        }

        public static a a(String str, Class cls) {
            return b(str, cls, null);
        }

        public static a b(String str, Class cls, Object obj) {
            return new C0487i(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class e();
    }

    /* JADX INFO: renamed from: F.j0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        boolean a(a aVar);
    }

    /* JADX INFO: renamed from: F.j0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static InterfaceC0490j0 W(InterfaceC0490j0 interfaceC0490j0, InterfaceC0490j0 interfaceC0490j02) {
        if (interfaceC0490j0 == null && interfaceC0490j02 == null) {
            return X0.g0();
        }
        S0 s0J0 = interfaceC0490j02 != null ? S0.j0(interfaceC0490j02) : S0.i0();
        if (interfaceC0490j0 != null) {
            Iterator it = interfaceC0490j0.a().iterator();
            while (it.hasNext()) {
                k(s0J0, interfaceC0490j02, interfaceC0490j0, (a) it.next());
            }
        }
        return X0.h0(s0J0);
    }

    static boolean Y(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    static void k(S0 s02, InterfaceC0490j0 interfaceC0490j0, InterfaceC0490j0 interfaceC0490j02, a aVar) {
        if (!Objects.equals(aVar, E0.f1330u)) {
            s02.t(aVar, interfaceC0490j02.c(aVar), interfaceC0490j02.d(aVar));
            return;
        }
        S.c cVar = (S.c) interfaceC0490j02.f(aVar, null);
        s02.t(aVar, interfaceC0490j02.c(aVar), H.v.a((S.c) interfaceC0490j0.f(aVar, null), cVar));
    }

    Set a();

    boolean b(a aVar);

    c c(a aVar);

    Object d(a aVar);

    Object e(a aVar, c cVar);

    Object f(a aVar, Object obj);

    Set g(a aVar);

    void h(String str, b bVar);
}
