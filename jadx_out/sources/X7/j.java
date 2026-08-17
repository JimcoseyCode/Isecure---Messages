package X7;

import L7.U;
import U7.AbstractC1491t;
import X7.p;
import Y7.D;
import b8.u;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f12539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.a f12540b;

    public j(d components) {
        AbstractC2855l.g(components, "components");
        k kVar = new k(components, p.a.f12553a, AbstractC2746i.c(null));
        this.f12539a = kVar;
        this.f12540b = kVar.e().c();
    }

    private final D e(k8.c cVar) {
        u uVarA = AbstractC1491t.a(this.f12539a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return (D) this.f12540b.a(cVar, new i(this, uVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D f(j jVar, u uVar) {
        return new D(jVar.f12539a, uVar);
    }

    @Override // L7.U
    public boolean a(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return AbstractC1491t.a(this.f12539a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // L7.U
    public void b(k8.c fqName, Collection packageFragments) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(packageFragments, "packageFragments");
        M8.a.a(packageFragments, e(fqName));
    }

    @Override // L7.O
    public List c(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return AbstractC2800q.n(e(fqName));
    }

    @Override // L7.O
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List p(k8.c fqName, Function1 nameFilter) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(nameFilter, "nameFilter");
        D dE = e(fqName);
        List listN0 = dE != null ? dE.N0() : null;
        return listN0 == null ? AbstractC2800q.j() : listN0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f12539a.a().m();
    }
}
