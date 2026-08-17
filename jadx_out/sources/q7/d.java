package Q7;

import P8.q;
import R7.B;
import U7.InterfaceC1492u;
import b8.InterfaceC1823g;
import b8.u;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements InterfaceC1492u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f9865a;

    public d(ClassLoader classLoader) {
        AbstractC2855l.g(classLoader, "classLoader");
        this.f9865a = classLoader;
    }

    @Override // U7.InterfaceC1492u
    public u a(k8.c fqName, boolean z10) {
        AbstractC2855l.g(fqName, "fqName");
        return new B(fqName);
    }

    @Override // U7.InterfaceC1492u
    public Set b(k8.c packageFqName) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        return null;
    }

    @Override // U7.InterfaceC1492u
    public InterfaceC1823g c(InterfaceC1492u.a request) {
        AbstractC2855l.g(request, "request");
        k8.b bVarA = request.a();
        k8.c cVarF = bVarA.f();
        String strB = bVarA.g().b();
        AbstractC2855l.f(strB, "asString(...)");
        String strD = q.D(strB, '.', '$', false, 4, null);
        if (!cVarF.d()) {
            strD = cVarF.b() + '.' + strD;
        }
        Class clsA = e.a(this.f9865a, strD);
        if (clsA != null) {
            return new R7.q(clsA);
        }
        return null;
    }
}
