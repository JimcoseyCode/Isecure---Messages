package F7;

import F7.AbstractC0529d0;
import F7.a1;
import R7.AbstractC1394f;
import e8.C2431a;
import expo.modules.interfaces.permissions.PermissionsResponse;
import i7.AbstractC2746i;
import i7.C2756s;
import i7.EnumC2749l;
import i8.AbstractC2757a;
import j7.AbstractC2800q;
import j8.C2810e;
import j8.C2811f;
import j8.C2814i;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;
import v8.InterfaceC3442k;
import y8.C3637K;

/* JADX INFO: renamed from: F7.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0564v0 extends AbstractC0529d0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class f2122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f2123k;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F7.v0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class a extends AbstractC0529d0.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ C7.k[] f2124j = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(a.class), PermissionsResponse.SCOPE_KEY, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a1.a f2125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a1.a f2126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Lazy f2127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Lazy f2128g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final a1.a f2129h;

        public a() {
            super();
            this.f2125d = a1.c(new C0555q0(C0564v0.this));
            this.f2126e = a1.c(new C0556r0(this));
            EnumC2749l enumC2749l = EnumC2749l.f28717h;
            this.f2127f = AbstractC2746i.a(enumC2749l, new C0558s0(this, C0564v0.this));
            this.f2128g = AbstractC2746i.a(enumC2749l, new C0560t0(this));
            this.f2129h = a1.c(new C0562u0(C0564v0.this, this));
        }

        private final Q7.f i() {
            return (Q7.f) this.f2125d.c(this, f2124j[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q7.f m(C0564v0 c0564v0) {
            return Q7.f.f9866c.a(c0564v0.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection n(C0564v0 c0564v0, a aVar) {
            return c0564v0.H(aVar.l(), AbstractC0529d0.d.f2038g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2756s o(a aVar) {
            C2431a c2431aA;
            Q7.f fVarI = aVar.i();
            if (fVarI != null && (c2431aA = fVarI.a()) != null) {
                String[] strArrA = c2431aA.a();
                String[] strArrG = c2431aA.g();
                if (strArrA != null && strArrG != null) {
                    Pair pairM = C2814i.m(strArrA, strArrG);
                    return new C2756s((C2811f) pairM.getFirst(), (f8.l) pairM.getSecond(), c2431aA.d());
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Class p(a aVar, C0564v0 c0564v0) {
            C2431a c2431aA;
            Q7.f fVarI = aVar.i();
            String strE = (fVarI == null || (c2431aA = fVarI.a()) == null) ? null : c2431aA.e();
            if (strE == null || strE.length() <= 0) {
                return null;
            }
            return c0564v0.b().getClassLoader().loadClass(P8.q.D(strE, '/', '.', false, 4, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3442k q(a aVar) {
            Q7.f fVarI = aVar.i();
            return fVarI != null ? aVar.b().c().a(fVarI) : InterfaceC3442k.b.f32996b;
        }

        public final C2756s j() {
            return (C2756s) this.f2128g.getValue();
        }

        public final Class k() {
            return (Class) this.f2127f.getValue();
        }

        public final InterfaceC3442k l() {
            Object objC = this.f2126e.c(this, f2124j[1]);
            AbstractC2855l.f(objC, "getValue(...)");
            return (InterfaceC3442k) objC;
        }
    }

    /* JADX INFO: renamed from: F7.v0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2852i implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f2131g = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(C3637K.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final L7.Z invoke(C3637K p02, f8.n p12) {
            AbstractC2855l.g(p02, "p0");
            AbstractC2855l.g(p12, "p1");
            return p02.u(p12);
        }
    }

    public C0564v0(Class jClass) {
        AbstractC2855l.g(jClass, "jClass");
        this.f2122j = jClass;
        this.f2123k = AbstractC2746i.a(EnumC2749l.f28717h, new C0553p0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a Q(C0564v0 c0564v0) {
        return c0564v0.new a();
    }

    private final InterfaceC3442k R() {
        return ((a) this.f2123k.getValue()).l();
    }

    @Override // F7.AbstractC0529d0
    public Collection E() {
        return AbstractC2800q.j();
    }

    @Override // F7.AbstractC0529d0
    public Collection F(k8.f name) {
        AbstractC2855l.g(name, "name");
        return R().b(name, T7.d.f10633n);
    }

    @Override // F7.AbstractC0529d0
    public L7.Z G(int i10) {
        C2756s c2756sJ = ((a) this.f2123k.getValue()).j();
        if (c2756sJ != null) {
            C2811f c2811f = (C2811f) c2756sJ.a();
            f8.l lVar = (f8.l) c2756sJ.b();
            C2810e c2810e = (C2810e) c2756sJ.c();
            AbstractC2950i.f packageLocalVariable = AbstractC2757a.f28757n;
            AbstractC2855l.f(packageLocalVariable, "packageLocalVariable");
            f8.n nVar = (f8.n) h8.e.b(lVar, packageLocalVariable, i10);
            if (nVar != null) {
                Class clsB = b();
                f8.t tVarU = lVar.U();
                AbstractC2855l.f(tVarU, "getTypeTable(...)");
                return (L7.Z) j1.h(clsB, nVar, c2811f, new h8.g(tVarU), c2810e, b.f2131g);
            }
        }
        return null;
    }

    @Override // F7.AbstractC0529d0
    protected Class I() {
        Class clsK = ((a) this.f2123k.getValue()).k();
        return clsK == null ? b() : clsK;
    }

    @Override // F7.AbstractC0529d0
    public Collection J(k8.f name) {
        AbstractC2855l.g(name, "name");
        return R().d(name, T7.d.f10633n);
    }

    @Override // kotlin.jvm.internal.InterfaceC2847d
    public Class b() {
        return this.f2122j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0564v0) && AbstractC2855l.b(b(), ((C0564v0) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "file class " + AbstractC1394f.e(b()).a();
    }
}
