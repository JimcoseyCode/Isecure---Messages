package v8;

import C8.E0;
import C8.G0;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.j0;
import i7.AbstractC2746i;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import p8.AbstractC3090e;
import v8.InterfaceC3445n;

/* JADX INFO: renamed from: v8.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3451t implements InterfaceC3442k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3442k f33006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f33007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G0 f33008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f33009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f33010f;

    public C3451t(InterfaceC3442k workerScope, G0 givenSubstitutor) {
        AbstractC2855l.g(workerScope, "workerScope");
        AbstractC2855l.g(givenSubstitutor, "givenSubstitutor");
        this.f33006b = workerScope;
        this.f33007c = AbstractC2746i.b(new C3449r(givenSubstitutor));
        E0 e0J = givenSubstitutor.j();
        AbstractC2855l.f(e0J, "getSubstitution(...)");
        this.f33008d = AbstractC3090e.h(e0J, false, 1, null).c();
        this.f33010f = AbstractC2746i.b(new C3450s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(C3451t c3451t) {
        return c3451t.m(InterfaceC3445n.a.a(c3451t.f33006b, null, null, 3, null));
    }

    private final Collection k() {
        return (Collection) this.f33010f.getValue();
    }

    private final InterfaceC1288m l(InterfaceC1288m interfaceC1288m) {
        if (this.f33008d.k()) {
            return interfaceC1288m;
        }
        if (this.f33009e == null) {
            this.f33009e = new HashMap();
        }
        Map map = this.f33009e;
        AbstractC2855l.d(map);
        Object objC = map.get(interfaceC1288m);
        if (objC == null) {
            if (!(interfaceC1288m instanceof j0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC1288m).toString());
            }
            objC = ((j0) interfaceC1288m).c(this.f33008d);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC1288m + " substitution fails");
            }
            map.put(interfaceC1288m, objC);
        }
        InterfaceC1288m interfaceC1288m2 = (InterfaceC1288m) objC;
        AbstractC2855l.e(interfaceC1288m2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC1288m2;
    }

    private final Collection m(Collection collection) {
        if (this.f33008d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = M8.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(l((InterfaceC1288m) it.next()));
        }
        return linkedHashSetG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 n(G0 g02) {
        return g02.j().c();
    }

    @Override // v8.InterfaceC3442k
    public Set a() {
        return this.f33006b.a();
    }

    @Override // v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return m(this.f33006b.b(name, location));
    }

    @Override // v8.InterfaceC3442k
    public Set c() {
        return this.f33006b.c();
    }

    @Override // v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return m(this.f33006b.d(name, location));
    }

    @Override // v8.InterfaceC3442k
    public Set e() {
        return this.f33006b.e();
    }

    @Override // v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        InterfaceC1283h interfaceC1283hF = this.f33006b.f(name, location);
        if (interfaceC1283hF != null) {
            return (InterfaceC1283h) l(interfaceC1283hF);
        }
        return null;
    }

    @Override // v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return k();
    }
}
