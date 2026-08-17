package Y7;

import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import U7.InterfaceC1492u;
import Y7.InterfaceC1539c;
import b8.EnumC1816D;
import b8.InterfaceC1823g;
import d8.AbstractC2375w;
import d8.InterfaceC2374v;
import d8.InterfaceC2376x;
import e8.C2431a;
import i7.C2750m;
import j7.AbstractC2800q;
import j8.C2810e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.C3435d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class G extends b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b8.u f12966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final D f12967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final B8.j f12968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final B8.h f12969q;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k8.f f12970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1823g f12971b;

        public a(k8.f name, InterfaceC1823g interfaceC1823g) {
            AbstractC2855l.g(name, "name");
            this.f12970a = name;
            this.f12971b = interfaceC1823g;
        }

        public final InterfaceC1823g a() {
            return this.f12971b;
        }

        public final k8.f b() {
            return this.f12970a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC2855l.b(this.f12970a, ((a) obj).f12970a);
        }

        public int hashCode() {
            return this.f12970a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC1280e f12972a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC1280e descriptor) {
                super(null);
                AbstractC2855l.g(descriptor, "descriptor");
                this.f12972a = descriptor;
            }

            public final InterfaceC1280e a() {
                return this.f12972a;
            }
        }

        /* JADX INFO: renamed from: Y7.G$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0134b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0134b f12973a = new C0134b();

            private C0134b() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f12974a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(X7.k c10, b8.u jPackage, D ownerDescriptor) {
        super(c10);
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(jPackage, "jPackage");
        AbstractC2855l.g(ownerDescriptor, "ownerDescriptor");
        this.f12966n = jPackage;
        this.f12967o = ownerDescriptor;
        this.f12968p = c10.e().g(new E(c10, this));
        this.f12969q = c10.e().i(new F(this, c10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1280e i0(G g10, X7.k kVar, a request) {
        AbstractC2855l.g(request, "request");
        k8.b bVar = new k8.b(g10.R().d(), request.b());
        InterfaceC2374v.a aVarA = request.a() != null ? kVar.a().j().a(request.a(), g10.m0()) : kVar.a().j().c(bVar, g10.m0());
        InterfaceC2376x interfaceC2376xA = aVarA != null ? aVarA.a() : null;
        k8.b bVarC = interfaceC2376xA != null ? interfaceC2376xA.c() : null;
        if (bVarC != null && (bVarC.j() || bVarC.i())) {
            return null;
        }
        b bVarP0 = g10.p0(interfaceC2376xA);
        if (bVarP0 instanceof b.a) {
            return ((b.a) bVarP0).a();
        }
        if (bVarP0 instanceof b.c) {
            return null;
        }
        if (!(bVarP0 instanceof b.C0134b)) {
            throw new C2750m();
        }
        InterfaceC1823g interfaceC1823gA = request.a();
        if (interfaceC1823gA == null) {
            interfaceC1823gA = kVar.a().d().c(new InterfaceC1492u.a(bVar, null, null, 4, null));
        }
        InterfaceC1823g interfaceC1823g = interfaceC1823gA;
        if ((interfaceC1823g != null ? interfaceC1823g.E() : null) != EnumC1816D.f18664h) {
            k8.c cVarD = interfaceC1823g != null ? interfaceC1823g.d() : null;
            if (cVarD == null || cVarD.d() || !AbstractC2855l.b(cVarD.e(), g10.R().d())) {
                return null;
            }
            C1550n c1550n = new C1550n(kVar, g10.R(), interfaceC1823g, null, 8, null);
            kVar.a().e().a(c1550n);
            return c1550n;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + interfaceC1823g + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + AbstractC2375w.a(kVar.a().j(), interfaceC1823g, g10.m0()) + "\nfindKotlinClass(ClassId) = " + AbstractC2375w.b(kVar.a().j(), bVar, g10.m0()) + '\n');
    }

    private final InterfaceC1280e j0(k8.f fVar, InterfaceC1823g interfaceC1823g) {
        if (!k8.h.f29220a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f12968p.invoke();
        if (interfaceC1823g != null || set == null || set.contains(fVar.j())) {
            return (InterfaceC1280e) this.f12969q.invoke(new a(fVar, interfaceC1823g));
        }
        return null;
    }

    private final C2810e m0() {
        return M8.c.a(L().a().b().f().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o0(X7.k kVar, G g10) {
        return kVar.a().d().b(g10.R().d());
    }

    private final b p0(InterfaceC2376x interfaceC2376x) {
        if (interfaceC2376x == null) {
            return b.C0134b.f12973a;
        }
        if (interfaceC2376x.a().c() != C2431a.EnumC0258a.f25955k) {
            return b.c.f12974a;
        }
        InterfaceC1280e interfaceC1280eN = L().a().b().n(interfaceC2376x);
        return interfaceC1280eN != null ? new b.a(interfaceC1280eN) : b.C0134b.f12973a;
    }

    @Override // Y7.U
    protected void B(Collection result, k8.f name) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(name, "name");
    }

    @Override // Y7.U
    protected Set D(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        return j7.T.e();
    }

    @Override // Y7.U, v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return AbstractC2800q.j();
    }

    @Override // Y7.U, v8.AbstractC3443l, v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        C3435d.a aVar = C3435d.f32955c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return AbstractC2800q.j();
        }
        Iterable iterable = (Iterable) K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC1288m interfaceC1288m = (InterfaceC1288m) obj;
            if (interfaceC1288m instanceof InterfaceC1280e) {
                k8.f name = ((InterfaceC1280e) interfaceC1288m).getName();
                AbstractC2855l.f(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final InterfaceC1280e k0(InterfaceC1823g javaClass) {
        AbstractC2855l.g(javaClass, "javaClass");
        return j0(javaClass.getName(), javaClass);
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1280e f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return j0(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y7.U
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public D R() {
        return this.f12967o;
    }

    @Override // Y7.U
    protected Set v(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        if (!kindFilter.a(C3435d.f32955c.e())) {
            return j7.T.e();
        }
        Set set = (Set) this.f12968p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(k8.f.q((String) it.next()));
            }
            return hashSet;
        }
        b8.u uVar = this.f12966n;
        if (function1 == null) {
            function1 = M8.j.k();
        }
        Collection<InterfaceC1823g> collectionN = uVar.n(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC1823g interfaceC1823g : collectionN) {
            k8.f name = interfaceC1823g.E() == EnumC1816D.f18663g ? null : interfaceC1823g.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Y7.U
    protected Set x(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        return j7.T.e();
    }

    @Override // Y7.U
    protected InterfaceC1539c z() {
        return InterfaceC1539c.a.f13028a;
    }
}
