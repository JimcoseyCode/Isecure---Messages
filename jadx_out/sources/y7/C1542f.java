package Y7;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1284i;
import d8.InterfaceC2376x;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import v8.AbstractC3444m;
import v8.C3435d;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: Y7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1542f implements InterfaceC3442k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f13032f = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C1542f.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X7.k f13033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f13034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G f13035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.i f13036e;

    public C1542f(X7.k c10, b8.u jPackage, D packageFragment) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(jPackage, "jPackage");
        AbstractC2855l.g(packageFragment, "packageFragment");
        this.f13033b = c10;
        this.f13034c = packageFragment;
        this.f13035d = new G(c10, jPackage, packageFragment);
        this.f13036e = c10.e().e(new C1541e(this));
    }

    private final InterfaceC3442k[] j() {
        return (InterfaceC3442k[]) B8.m.a(this.f13036e, this, f13032f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3442k[] k(C1542f c1542f) {
        Collection collectionValues = c1542f.f13034c.L0().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            InterfaceC3442k interfaceC3442kC = c1542f.f13033b.a().b().c(c1542f.f13034c, (InterfaceC2376x) it.next());
            if (interfaceC3442kC != null) {
                arrayList.add(interfaceC3442kC);
            }
        }
        return (InterfaceC3442k[]) L8.a.b(arrayList).toArray(new InterfaceC3442k[0]);
    }

    @Override // v8.InterfaceC3442k
    public Set a() {
        InterfaceC3442k[] interfaceC3442kArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArrJ) {
            AbstractC2800q.A(linkedHashSet, interfaceC3442k.a());
        }
        linkedHashSet.addAll(this.f13035d.a());
        return linkedHashSet;
    }

    @Override // v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        l(name, location);
        G g10 = this.f13035d;
        InterfaceC3442k[] interfaceC3442kArrJ = j();
        Collection collectionB = g10.b(name, location);
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArrJ) {
            collectionB = L8.a.a(collectionB, interfaceC3442k.b(name, location));
        }
        return collectionB == null ? j7.T.e() : collectionB;
    }

    @Override // v8.InterfaceC3442k
    public Set c() {
        InterfaceC3442k[] interfaceC3442kArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArrJ) {
            AbstractC2800q.A(linkedHashSet, interfaceC3442k.c());
        }
        linkedHashSet.addAll(this.f13035d.c());
        return linkedHashSet;
    }

    @Override // v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        l(name, location);
        G g10 = this.f13035d;
        InterfaceC3442k[] interfaceC3442kArrJ = j();
        Collection collectionD = g10.d(name, location);
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArrJ) {
            collectionD = L8.a.a(collectionD, interfaceC3442k.d(name, location));
        }
        return collectionD == null ? j7.T.e() : collectionD;
    }

    @Override // v8.InterfaceC3442k
    public Set e() {
        Set setA = AbstractC3444m.a(AbstractC2793j.x(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f13035d.e());
        return setA;
    }

    @Override // v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        l(name, location);
        InterfaceC1280e interfaceC1280eF = this.f13035d.f(name, location);
        if (interfaceC1280eF != null) {
            return interfaceC1280eF;
        }
        InterfaceC1283h interfaceC1283h = null;
        for (InterfaceC3442k interfaceC3442k : j()) {
            InterfaceC1283h interfaceC1283hF = interfaceC3442k.f(name, location);
            if (interfaceC1283hF != null) {
                if (!(interfaceC1283hF instanceof InterfaceC1284i) || !((L7.D) interfaceC1283hF).J()) {
                    return interfaceC1283hF;
                }
                if (interfaceC1283h == null) {
                    interfaceC1283h = interfaceC1283hF;
                }
            }
        }
        return interfaceC1283h;
    }

    @Override // v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        G g10 = this.f13035d;
        InterfaceC3442k[] interfaceC3442kArrJ = j();
        Collection collectionG = g10.g(kindFilter, nameFilter);
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArrJ) {
            collectionG = L8.a.a(collectionG, interfaceC3442k.g(kindFilter, nameFilter));
        }
        return collectionG == null ? j7.T.e() : collectionG;
    }

    public final G i() {
        return this.f13035d;
    }

    public void l(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        S7.a.b(this.f13033b.a().l(), location, this.f13034c, name);
    }

    public String toString() {
        return "scope for " + this.f13034c;
    }
}
