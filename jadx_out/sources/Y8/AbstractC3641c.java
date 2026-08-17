package y8;

import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3641c implements L7.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.n f34079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3627A f34080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L7.H f34081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C3652n f34082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.h f34083e;

    public AbstractC3641c(B8.n storageManager, InterfaceC3627A finder, L7.H moduleDescriptor) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(finder, "finder");
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        this.f34079a = storageManager;
        this.f34080b = finder;
        this.f34081c = moduleDescriptor;
        this.f34083e = storageManager.i(new C3640b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L7.N f(AbstractC3641c abstractC3641c, k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        r rVarE = abstractC3641c.e(fqName);
        if (rVarE == null) {
            return null;
        }
        rVarE.I0(abstractC3641c.g());
        return rVarE;
    }

    @Override // L7.U
    public boolean a(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return (this.f34083e.k(fqName) ? (L7.N) this.f34083e.invoke(fqName) : e(fqName)) == null;
    }

    @Override // L7.U
    public void b(k8.c fqName, Collection packageFragments) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(packageFragments, "packageFragments");
        M8.a.a(packageFragments, this.f34083e.invoke(fqName));
    }

    @Override // L7.O
    public List c(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return AbstractC2800q.n(this.f34083e.invoke(fqName));
    }

    protected abstract r e(k8.c cVar);

    protected final C3652n g() {
        C3652n c3652n = this.f34082d;
        if (c3652n != null) {
            return c3652n;
        }
        AbstractC2855l.y("components");
        return null;
    }

    protected final InterfaceC3627A h() {
        return this.f34080b;
    }

    protected final L7.H i() {
        return this.f34081c;
    }

    protected final B8.n j() {
        return this.f34079a;
    }

    protected final void k(C3652n c3652n) {
        AbstractC2855l.g(c3652n, "<set-?>");
        this.f34082d = c3652n;
    }

    @Override // L7.O
    public Collection p(k8.c fqName, Function1 nameFilter) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return j7.T.e();
    }
}
