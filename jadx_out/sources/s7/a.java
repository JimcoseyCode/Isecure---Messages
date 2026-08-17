package S7;

import L7.InterfaceC1280e;
import L7.N;
import T7.b;
import T7.c;
import k8.f;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(c cVar, b from, InterfaceC1280e scopeOwner, f name) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(from, "from");
        AbstractC2855l.g(scopeOwner, "scopeOwner");
        AbstractC2855l.g(name, "name");
        if (cVar == c.a.f10620a) {
            return;
        }
        from.h();
    }

    public static final void b(c cVar, b from, N scopeOwner, f name) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(from, "from");
        AbstractC2855l.g(scopeOwner, "scopeOwner");
        AbstractC2855l.g(name, "name");
        String strB = scopeOwner.d().b();
        AbstractC2855l.f(strB, "asString(...)");
        String strJ = name.j();
        AbstractC2855l.f(strJ, "asString(...)");
        c(cVar, from, strB, strJ);
    }

    public static final void c(c cVar, b from, String packageFqName, String name) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(from, "from");
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(name, "name");
        if (cVar == c.a.f10620a) {
            return;
        }
        from.h();
    }
}
