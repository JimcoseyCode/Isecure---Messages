package L7;

import C8.C0434u;
import C8.N0;
import O7.AbstractC1331j;
import O7.C1337p;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.n f7294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f7295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.g f7296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.g f7297d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k8.b f7298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f7299b;

        public a(k8.b classId, List typeParametersCount) {
            AbstractC2855l.g(classId, "classId");
            AbstractC2855l.g(typeParametersCount, "typeParametersCount");
            this.f7298a = classId;
            this.f7299b = typeParametersCount;
        }

        public final k8.b a() {
            return this.f7298a;
        }

        public final List b() {
            return this.f7299b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC2855l.b(this.f7298a, aVar.f7298a) && AbstractC2855l.b(this.f7299b, aVar.f7299b);
        }

        public int hashCode() {
            return (this.f7298a.hashCode() * 31) + this.f7299b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f7298a + ", typeParametersCount=" + this.f7299b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC1331j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final boolean f7300o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final List f7301p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final C0434u f7302q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B8.n storageManager, InterfaceC1288m container, k8.f name, boolean z10, int i10) {
            super(storageManager, container, name, h0.f7335a, false);
            AbstractC2855l.g(storageManager, "storageManager");
            AbstractC2855l.g(container, "container");
            AbstractC2855l.g(name, "name");
            this.f7300o = z10;
            B7.c cVarP = B7.d.p(0, i10);
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(cVarP, 10));
            Iterator it = cVarP.iterator();
            while (it.hasNext()) {
                int iNextInt = ((j7.J) it).nextInt();
                M7.h hVarB = M7.h.f7570a.b();
                N0 n02 = N0.f592k;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(iNextInt);
                arrayList.add(O7.U.O0(this, hVarB, false, n02, k8.f.q(sb.toString()), iNextInt, storageManager));
            }
            this.f7301p = arrayList;
            this.f7302q = new C0434u(this, q0.g(this), j7.T.d(AbstractC3340e.s(this).n().i()), storageManager);
        }

        @Override // L7.D
        public boolean B0() {
            return false;
        }

        @Override // L7.InterfaceC1280e
        public boolean C() {
            return false;
        }

        @Override // L7.InterfaceC1280e
        public boolean F0() {
            return false;
        }

        @Override // L7.InterfaceC1280e
        /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
        public InterfaceC3442k.b P() {
            return InterfaceC3442k.b.f32996b;
        }

        @Override // L7.InterfaceC1280e
        public Collection I() {
            return AbstractC2800q.j();
        }

        @Override // L7.InterfaceC1283h
        /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
        public C0434u j() {
            return this.f7302q;
        }

        @Override // L7.D
        public boolean J() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // O7.z
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
        public InterfaceC3442k.b L(D8.g kotlinTypeRefiner) {
            AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return InterfaceC3442k.b.f32996b;
        }

        @Override // L7.InterfaceC1284i
        public boolean K() {
            return this.f7300o;
        }

        @Override // L7.InterfaceC1280e
        public InterfaceC1279d O() {
            return null;
        }

        @Override // L7.InterfaceC1280e
        public InterfaceC1280e R() {
            return null;
        }

        @Override // L7.InterfaceC1280e
        public Collection f() {
            return j7.T.e();
        }

        @Override // M7.a
        public M7.h getAnnotations() {
            return M7.h.f7570a.b();
        }

        @Override // L7.InterfaceC1280e
        public EnumC1281f getKind() {
            return EnumC1281f.f7320h;
        }

        @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
        public AbstractC1295u getVisibility() {
            AbstractC1295u PUBLIC = AbstractC1294t.f7347e;
            AbstractC2855l.f(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // O7.AbstractC1331j, L7.D
        public boolean isExternal() {
            return false;
        }

        @Override // L7.InterfaceC1280e
        public boolean isInline() {
            return false;
        }

        @Override // L7.InterfaceC1280e, L7.D
        public E k() {
            return E.f7283h;
        }

        @Override // L7.InterfaceC1280e
        public boolean l() {
            return false;
        }

        @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
        public List t() {
            return this.f7301p;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // L7.InterfaceC1280e
        public r0 w0() {
            return null;
        }

        @Override // L7.InterfaceC1280e
        public boolean y() {
            return false;
        }
    }

    public M(B8.n storageManager, H module) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(module, "module");
        this.f7294a = storageManager;
        this.f7295b = module;
        this.f7296c = storageManager.h(new K(this));
        this.f7297d = storageManager.h(new L(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1280e c(M m10, a aVar) {
        InterfaceC1288m interfaceC1288mD;
        AbstractC2855l.g(aVar, "<destruct>");
        k8.b bVarA = aVar.a();
        List listB = aVar.b();
        if (bVarA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
        }
        k8.b bVarE = bVarA.e();
        if (bVarE == null || (interfaceC1288mD = m10.d(bVarE, AbstractC2800q.Z(listB, 1))) == null) {
            interfaceC1288mD = (InterfaceC1282g) m10.f7296c.invoke(bVarA.f());
        }
        InterfaceC1288m interfaceC1288m = interfaceC1288mD;
        boolean zJ = bVarA.j();
        B8.n nVar = m10.f7294a;
        k8.f fVarH = bVarA.h();
        Integer num = (Integer) AbstractC2800q.g0(listB);
        return new b(nVar, interfaceC1288m, fVarH, zJ, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N e(M m10, k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return new C1337p(m10.f7295b, fqName);
    }

    public final InterfaceC1280e d(k8.b classId, List typeParametersCount) {
        AbstractC2855l.g(classId, "classId");
        AbstractC2855l.g(typeParametersCount, "typeParametersCount");
        return (InterfaceC1280e) this.f7297d.invoke(new a(classId, typeParametersCount));
    }
}
