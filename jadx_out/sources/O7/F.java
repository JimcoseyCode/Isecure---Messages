package O7;

import L7.H;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import O7.I;
import i7.AbstractC2746i;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l8.AbstractC2890a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class F extends AbstractC1334m implements L7.H {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final B8.n f8336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final I7.i f8337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k8.f f8338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f8339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final I f8340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private B f8341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private L7.O f8342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final B8.g f8344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Lazy f8345r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(k8.f moduleName, B8.n storageManager, I7.i builtIns, AbstractC2890a abstractC2890a) {
        this(moduleName, storageManager, builtIns, abstractC2890a, null, null, 48, null);
        AbstractC2855l.g(moduleName, "moduleName");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(builtIns, "builtIns");
    }

    private final String I0() {
        String string = getName().toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    private final C1333l K0() {
        return (C1333l) this.f8345r.getValue();
    }

    private final boolean M0() {
        return this.f8342o != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1333l O0(F f10) {
        B b10 = f10.f8341n;
        if (b10 == null) {
            throw new AssertionError("Dependencies of module " + f10.I0() + " were not set before querying module content");
        }
        List listA = b10.a();
        f10.H0();
        listA.contains(f10);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((F) it.next()).M0();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            L7.O o10 = ((F) it2.next()).f8342o;
            AbstractC2855l.d(o10);
            arrayList.add(o10);
        }
        return new C1333l(arrayList, "CompositeProvider@ModuleDescriptor for " + f10.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L7.V P0(F f10, k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return f10.f8340m.a(f10, fqName, f10.f8336i);
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return H.a.a(this, interfaceC1290o, obj);
    }

    public void H0() {
        if (N0()) {
            return;
        }
        L7.C.a(this);
    }

    public final L7.O J0() {
        H0();
        return K0();
    }

    public final void L0(L7.O providerForModuleContent) {
        AbstractC2855l.g(providerForModuleContent, "providerForModuleContent");
        M0();
        this.f8342o = providerForModuleContent;
    }

    public boolean N0() {
        return this.f8343p;
    }

    public final void Q0(B dependencies) {
        AbstractC2855l.g(dependencies, "dependencies");
        this.f8341n = dependencies;
    }

    public final void R0(List descriptors) {
        AbstractC2855l.g(descriptors, "descriptors");
        S0(descriptors, j7.T.e());
    }

    public final void S0(List descriptors, Set friends) {
        AbstractC2855l.g(descriptors, "descriptors");
        AbstractC2855l.g(friends, "friends");
        Q0(new C(descriptors, friends, AbstractC2800q.j(), j7.T.e()));
    }

    public final void T0(F... descriptors) {
        AbstractC2855l.g(descriptors, "descriptors");
        R0(AbstractC2793j.v0(descriptors));
    }

    @Override // L7.InterfaceC1288m
    public InterfaceC1288m b() {
        return H.a.b(this);
    }

    @Override // L7.H
    public L7.V e0(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        H0();
        return (L7.V) this.f8344q.invoke(fqName);
    }

    @Override // L7.H
    public I7.i n() {
        return this.f8337j;
    }

    @Override // L7.H
    public Collection p(k8.c fqName, Function1 nameFilter) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(nameFilter, "nameFilter");
        H0();
        return J0().p(fqName, nameFilter);
    }

    @Override // L7.H
    public List p0() {
        B b10 = this.f8341n;
        if (b10 != null) {
            return b10.c();
        }
        throw new AssertionError("Dependencies of module " + I0() + " were not set");
    }

    @Override // L7.H
    public Object s0(L7.G capability) {
        AbstractC2855l.g(capability, "capability");
        Object obj = this.f8339l.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // O7.AbstractC1334m
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!N0()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        L7.O o10 = this.f8342o;
        sb.append(o10 != null ? o10.getClass().getSimpleName() : null);
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    @Override // L7.H
    public boolean w(L7.H targetModule) {
        AbstractC2855l.g(targetModule, "targetModule");
        if (AbstractC2855l.b(this, targetModule)) {
            return true;
        }
        B b10 = this.f8341n;
        AbstractC2855l.d(b10);
        return AbstractC2800q.X(b10.b(), targetModule) || p0().contains(targetModule) || targetModule.p0().contains(this);
    }

    public /* synthetic */ F(k8.f fVar, B8.n nVar, I7.i iVar, AbstractC2890a abstractC2890a, Map map, k8.f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nVar, iVar, (i10 & 8) != 0 ? null : abstractC2890a, (i10 & 16) != 0 ? j7.K.i() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(k8.f moduleName, B8.n storageManager, I7.i builtIns, AbstractC2890a abstractC2890a, Map capabilities, k8.f fVar) {
        super(M7.h.f7570a.b(), moduleName);
        AbstractC2855l.g(moduleName, "moduleName");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(builtIns, "builtIns");
        AbstractC2855l.g(capabilities, "capabilities");
        this.f8336i = storageManager;
        this.f8337j = builtIns;
        this.f8338k = fVar;
        if (moduleName.r()) {
            this.f8339l = capabilities;
            I i10 = (I) s0(I.f8356a.a());
            this.f8340m = i10 == null ? I.b.f8359b : i10;
            this.f8343p = true;
            this.f8344q = storageManager.h(new D(this));
            this.f8345r = AbstractC2746i.b(new E(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
