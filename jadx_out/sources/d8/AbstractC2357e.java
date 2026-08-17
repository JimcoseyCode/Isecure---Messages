package d8;

import L7.h0;
import d8.C2343A;
import d8.InterfaceC2376x;
import f8.c;
import h8.AbstractC2709b;
import h8.InterfaceC2710c;
import i8.AbstractC2757a;
import j7.AbstractC2800q;
import j8.AbstractC2809d;
import j8.C2807b;
import j8.C2810e;
import j8.C2814i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k8.b;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.AbstractC2950i;
import p7.AbstractC3083a;
import t8.C3381d;
import y8.EnumC3642d;
import y8.InterfaceC3646h;
import y8.N;

/* JADX INFO: renamed from: d8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2357e implements InterfaceC3646h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f25718b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2374v f25719a;

    /* JADX INFO: renamed from: d8.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public abstract Map a();
    }

    /* JADX INFO: renamed from: d8.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC2376x a(N container, boolean z10, boolean z11, Boolean bool, boolean z12, InterfaceC2374v kotlinClassFinder, C2810e jvmMetadataVersion) {
            N.a aVarH;
            AbstractC2855l.g(container, "container");
            AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
            AbstractC2855l.g(jvmMetadataVersion, "jvmMetadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof N.a) {
                    N.a aVar = (N.a) container;
                    if (aVar.g() == c.EnumC0277c.INTERFACE) {
                        k8.b bVarE = aVar.e();
                        k8.f fVarQ = k8.f.q("DefaultImpls");
                        AbstractC2855l.f(fVarQ, "identifier(...)");
                        return AbstractC2375w.b(kotlinClassFinder, bVarE.d(fVarQ), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof N.b)) {
                    h0 h0VarC = container.c();
                    C2370r c2370r = h0VarC instanceof C2370r ? (C2370r) h0VarC : null;
                    C3381d c3381dF = c2370r != null ? c2370r.f() : null;
                    if (c3381dF != null) {
                        b.a aVar2 = k8.b.f29200d;
                        String strF = c3381dF.f();
                        AbstractC2855l.f(strF, "getInternalName(...)");
                        return AbstractC2375w.b(kotlinClassFinder, aVar2.c(new k8.c(P8.q.D(strF, '/', '.', false, 4, null))), jvmMetadataVersion);
                    }
                }
            }
            if (z11 && (container instanceof N.a)) {
                N.a aVar3 = (N.a) container;
                if (aVar3.g() == c.EnumC0277c.COMPANION_OBJECT && (aVarH = aVar3.h()) != null && (aVarH.g() == c.EnumC0277c.CLASS || aVarH.g() == c.EnumC0277c.ENUM_CLASS || (z12 && (aVarH.g() == c.EnumC0277c.INTERFACE || aVarH.g() == c.EnumC0277c.ANNOTATION_CLASS)))) {
                    h0 h0VarC2 = aVarH.c();
                    C2378z c2378z = h0VarC2 instanceof C2378z ? (C2378z) h0VarC2 : null;
                    if (c2378z != null) {
                        return c2378z.d();
                    }
                    return null;
                }
            }
            if (!(container instanceof N.b) || !(container.c() instanceof C2370r)) {
                return null;
            }
            h0 h0VarC3 = container.c();
            AbstractC2855l.e(h0VarC3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            C2370r c2370r2 = (C2370r) h0VarC3;
            InterfaceC2376x interfaceC2376xG = c2370r2.g();
            return interfaceC2376xG == null ? AbstractC2375w.b(kotlinClassFinder, c2370r2.d(), jvmMetadataVersion) : interfaceC2376xG;
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: d8.e$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f25720g = new c("PROPERTY", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f25721h = new c("BACKING_FIELD", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f25722i = new c("DELEGATE_FIELD", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ c[] f25723j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25724k;

        static {
            c[] cVarArrH = h();
            f25723j = cVarArrH;
            f25724k = AbstractC3083a.a(cVarArrH);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] h() {
            return new c[]{f25720g, f25721h, f25722i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f25723j.clone();
        }
    }

    /* JADX INFO: renamed from: d8.e$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25725a;

        static {
            int[] iArr = new int[EnumC3642d.values().length];
            try {
                iArr[EnumC3642d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3642d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3642d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25725a = iArr;
        }
    }

    public AbstractC2357e(InterfaceC2374v kotlinClassFinder) {
        AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
        this.f25719a = kotlinClassFinder;
    }

    private final InterfaceC2376x A(N.a aVar) {
        h0 h0VarC = aVar.c();
        C2378z c2378z = h0VarC instanceof C2378z ? (C2378z) h0VarC : null;
        if (c2378z != null) {
            return c2378z.d();
        }
        return null;
    }

    private final int m(N n10, m8.p pVar) {
        if (pVar instanceof f8.i) {
            return h8.f.g((f8.i) pVar) ? 1 : 0;
        }
        if (pVar instanceof f8.n) {
            return h8.f.h((f8.n) pVar) ? 1 : 0;
        }
        if (!(pVar instanceof f8.d)) {
            throw new UnsupportedOperationException("Unsupported message: " + pVar.getClass());
        }
        AbstractC2855l.e(n10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        N.a aVar = (N.a) n10;
        if (aVar.g() == c.EnumC0277c.ENUM_CLASS) {
            return 2;
        }
        return aVar.i() ? 1 : 0;
    }

    private final List n(N n10, C2343A c2343a, boolean z10, boolean z11, Boolean bool, boolean z12) {
        InterfaceC2376x interfaceC2376xP = p(n10, f25718b.a(n10, z10, z11, bool, z12, this.f25719a, u()));
        if (interfaceC2376xP == null) {
            return AbstractC2800q.j();
        }
        List list = (List) q(interfaceC2376xP).a().get(c2343a);
        return list == null ? AbstractC2800q.j() : list;
    }

    static /* synthetic */ List o(AbstractC2357e abstractC2357e, N n10, C2343A c2343a, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        }
        return abstractC2357e.n(n10, c2343a, z10, z11, bool, z12);
    }

    public static /* synthetic */ C2343A t(AbstractC2357e abstractC2357e, m8.p pVar, InterfaceC2710c interfaceC2710c, h8.g gVar, EnumC3642d enumC3642d, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractC2357e.s(pVar, interfaceC2710c, gVar, enumC3642d, z10);
    }

    private final List z(N n10, f8.n nVar, c cVar) {
        Boolean boolD = AbstractC2709b.f28516B.d(nVar.Z());
        AbstractC2855l.f(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = C2814i.f(nVar);
        if (cVar == c.f25720g) {
            C2343A c2343aB = AbstractC2358f.b(nVar, n10.b(), n10.d(), false, true, false, 40, null);
            return c2343aB == null ? AbstractC2800q.j() : o(this, n10, c2343aB, true, false, boolD, zF, 8, null);
        }
        C2343A c2343aB2 = AbstractC2358f.b(nVar, n10.b(), n10.d(), true, false, false, 48, null);
        if (c2343aB2 == null) {
            return AbstractC2800q.j();
        }
        return P8.q.Q(c2343aB2.a(), "$delegate", false, 2, null) != (cVar == c.f25722i) ? AbstractC2800q.j() : n(n10, c2343aB2, true, true, boolD, zF);
    }

    @Override // y8.InterfaceC3646h
    public List a(N container, f8.n proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        return z(container, proto, c.f25722i);
    }

    @Override // y8.InterfaceC3646h
    public List b(N container, f8.n proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        return z(container, proto, c.f25721h);
    }

    @Override // y8.InterfaceC3646h
    public abstract Object c(f8.b bVar, InterfaceC2710c interfaceC2710c);

    @Override // y8.InterfaceC3646h
    public List d(N.a container) {
        AbstractC2855l.g(container, "container");
        InterfaceC2376x interfaceC2376xA = A(container);
        if (interfaceC2376xA != null) {
            ArrayList arrayList = new ArrayList(1);
            interfaceC2376xA.d(new C0248e(arrayList), r(interfaceC2376xA));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // y8.InterfaceC3646h
    public List e(N container, m8.p proto, EnumC3642d kind) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(kind, "kind");
        if (kind == EnumC3642d.PROPERTY) {
            return z(container, (f8.n) proto, c.f25720g);
        }
        C2343A c2343aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return c2343aT == null ? AbstractC2800q.j() : o(this, container, c2343aT, false, false, null, false, 60, null);
    }

    @Override // y8.InterfaceC3646h
    public List f(f8.s proto, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        Object objT = proto.t(AbstractC2757a.f28751h);
        AbstractC2855l.f(objT, "getExtension(...)");
        Iterable<f8.b> iterable = (Iterable) objT;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
        for (f8.b bVar : iterable) {
            AbstractC2855l.d(bVar);
            arrayList.add(c(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List h(N container, m8.p callableProto, EnumC3642d kind, int i10, f8.u proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(callableProto, "callableProto");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(proto, "proto");
        C2343A c2343aT = t(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (c2343aT == null) {
            return AbstractC2800q.j();
        }
        return o(this, container, C2343A.f25678b.e(c2343aT, i10 + m(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // y8.InterfaceC3646h
    public List i(N container, m8.p proto, EnumC3642d kind) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(kind, "kind");
        C2343A c2343aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return c2343aT != null ? o(this, container, C2343A.f25678b.e(c2343aT, 0), false, false, null, false, 60, null) : AbstractC2800q.j();
    }

    @Override // y8.InterfaceC3646h
    public List j(f8.q proto, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        Object objT = proto.t(AbstractC2757a.f28749f);
        AbstractC2855l.f(objT, "getExtension(...)");
        Iterable<f8.b> iterable = (Iterable) objT;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
        for (f8.b bVar : iterable) {
            AbstractC2855l.d(bVar);
            arrayList.add(c(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // y8.InterfaceC3646h
    public List k(N container, f8.g proto) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        return o(this, container, C2343A.f25678b.a(container.b().getString(proto.E()), C2807b.b(((N.a) container).e().b())), false, false, null, false, 60, null);
    }

    protected final InterfaceC2376x p(N container, InterfaceC2376x interfaceC2376x) {
        AbstractC2855l.g(container, "container");
        if (interfaceC2376x != null) {
            return interfaceC2376x;
        }
        if (container instanceof N.a) {
            return A((N.a) container);
        }
        return null;
    }

    protected abstract a q(InterfaceC2376x interfaceC2376x);

    protected byte[] r(InterfaceC2376x kotlinClass) {
        AbstractC2855l.g(kotlinClass, "kotlinClass");
        return null;
    }

    protected final C2343A s(m8.p proto, InterfaceC2710c nameResolver, h8.g typeTable, EnumC3642d kind, boolean z10) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(kind, "kind");
        if (proto instanceof f8.d) {
            C2343A.a aVar = C2343A.f25678b;
            AbstractC2809d.b bVarB = C2814i.f28956a.b((f8.d) proto, nameResolver, typeTable);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (proto instanceof f8.i) {
            C2343A.a aVar2 = C2343A.f25678b;
            AbstractC2809d.b bVarE = C2814i.f28956a.e((f8.i) proto, nameResolver, typeTable);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (proto instanceof f8.n) {
            AbstractC2950i.f propertySignature = AbstractC2757a.f28747d;
            AbstractC2855l.f(propertySignature, "propertySignature");
            AbstractC2757a.d dVar = (AbstractC2757a.d) h8.e.a((AbstractC2950i.d) proto, propertySignature);
            if (dVar == null) {
                return null;
            }
            int i10 = d.f25725a[kind.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return AbstractC2358f.a((f8.n) proto, nameResolver, typeTable, true, true, z10);
                }
                if (!dVar.G()) {
                    return null;
                }
                C2343A.a aVar3 = C2343A.f25678b;
                AbstractC2757a.c cVarB = dVar.B();
                AbstractC2855l.f(cVarB, "getSetter(...)");
                return aVar3.c(nameResolver, cVarB);
            }
            if (dVar.F()) {
                C2343A.a aVar4 = C2343A.f25678b;
                AbstractC2757a.c cVarA = dVar.A();
                AbstractC2855l.f(cVarA, "getGetter(...)");
                return aVar4.c(nameResolver, cVarA);
            }
        }
        return null;
    }

    public abstract C2810e u();

    protected final InterfaceC2374v v() {
        return this.f25719a;
    }

    protected final boolean w(k8.b classId) {
        InterfaceC2376x interfaceC2376xB;
        AbstractC2855l.g(classId, "classId");
        return classId.e() != null && AbstractC2855l.b(classId.h().j(), "Container") && (interfaceC2376xB = AbstractC2375w.b(this.f25719a, classId, u())) != null && H7.a.f3801a.c(interfaceC2376xB);
    }

    protected abstract InterfaceC2376x.a x(k8.b bVar, h0 h0Var, List list);

    protected final InterfaceC2376x.a y(k8.b annotationClassId, h0 source, List result) {
        AbstractC2855l.g(annotationClassId, "annotationClassId");
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(result, "result");
        if (H7.a.f3801a.b().contains(annotationClassId)) {
            return null;
        }
        return x(annotationClassId, source, result);
    }

    /* JADX INFO: renamed from: d8.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0248e implements InterfaceC2376x.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f25727b;

        C0248e(ArrayList arrayList) {
            this.f25727b = arrayList;
        }

        @Override // d8.InterfaceC2376x.c
        public InterfaceC2376x.a c(k8.b classId, h0 source) {
            AbstractC2855l.g(classId, "classId");
            AbstractC2855l.g(source, "source");
            return AbstractC2357e.this.y(classId, source, this.f25727b);
        }

        @Override // d8.InterfaceC2376x.c
        public void a() {
        }
    }
}
