package J7;

import B8.n;
import C8.AbstractC0402b;
import C8.D0;
import C8.N0;
import C8.V;
import C8.r0;
import C8.v0;
import I7.o;
import J7.f;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.AbstractC1299y;
import L7.E;
import L7.EnumC1281f;
import L7.H;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.N;
import L7.h0;
import L7.k0;
import L7.m0;
import M7.h;
import O7.AbstractC1322a;
import O7.U;
import i7.C2735B;
import j7.AbstractC2800q;
import j7.J;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1322a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f6803t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final k8.b f6804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final k8.b f6805v;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n f6806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final N f6807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f f6808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f6809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0061b f6810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f6811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f6812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f6813s;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: J7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class C0061b extends AbstractC0402b {
        public C0061b() {
            super(b.this.f6806l);
        }

        @Override // C8.AbstractC0435v, C8.v0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b p() {
            return b.this;
        }

        @Override // C8.v0
        public List getParameters() {
            return b.this.f6812r;
        }

        @Override // C8.AbstractC0430p
        protected Collection m() {
            List<k8.b> listM;
            f fVarR0 = b.this.R0();
            f.a aVar = f.a.f6828e;
            if (AbstractC2855l.b(fVarR0, aVar)) {
                listM = AbstractC2800q.e(b.f6804u);
            } else if (AbstractC2855l.b(fVarR0, f.b.f6829e)) {
                listM = AbstractC2800q.m(b.f6805v, new k8.b(o.f5108A, aVar.c(b.this.N0())));
            } else {
                f.d dVar = f.d.f6831e;
                if (AbstractC2855l.b(fVarR0, dVar)) {
                    listM = AbstractC2800q.e(b.f6804u);
                } else {
                    if (!AbstractC2855l.b(fVarR0, f.c.f6830e)) {
                        N8.a.b(null, 1, null);
                        throw null;
                    }
                    listM = AbstractC2800q.m(b.f6805v, new k8.b(o.f5134s, dVar.c(b.this.N0())));
                }
            }
            H hB = b.this.f6807m.b();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM, 10));
            for (k8.b bVar : listM) {
                InterfaceC1280e interfaceC1280eB = AbstractC1299y.b(hB, bVar);
                if (interfaceC1280eB == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listJ0 = AbstractC2800q.J0(getParameters(), interfaceC1280eB.j().getParameters().size());
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listJ0, 10));
                Iterator it = listJ0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new D0(((m0) it.next()).r()));
                }
                arrayList.add(V.h(r0.f682h.j(), interfaceC1280eB, arrayList2));
            }
            return AbstractC2800q.P0(arrayList);
        }

        @Override // C8.v0
        public boolean q() {
            return true;
        }

        public String toString() {
            return p().toString();
        }

        @Override // C8.AbstractC0430p
        protected k0 u() {
            return k0.a.f7338a;
        }
    }

    static {
        k8.c cVar = o.f5108A;
        k8.f fVarQ = k8.f.q("Function");
        AbstractC2855l.f(fVarQ, "identifier(...)");
        f6804u = new k8.b(cVar, fVarQ);
        k8.c cVar2 = o.f5139x;
        k8.f fVarQ2 = k8.f.q("KFunction");
        AbstractC2855l.f(fVarQ2, "identifier(...)");
        f6805v = new k8.b(cVar2, fVarQ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n storageManager, N containingDeclaration, f functionTypeKind, int i10) {
        super(storageManager, functionTypeKind.c(i10));
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(functionTypeKind, "functionTypeKind");
        this.f6806l = storageManager;
        this.f6807m = containingDeclaration;
        this.f6808n = functionTypeKind;
        this.f6809o = i10;
        this.f6810p = new C0061b();
        this.f6811q = new d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        B7.c cVar = new B7.c(1, i10);
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((J) it).nextInt();
            N0 n02 = N0.f593l;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(iNextInt);
            H0(arrayList, this, n02, sb.toString());
            arrayList2.add(C2735B.f28704a);
        }
        H0(arrayList, this, N0.f594m, "R");
        this.f6812r = AbstractC2800q.P0(arrayList);
        this.f6813s = c.f6815g.a(this.f6808n);
    }

    private static final void H0(ArrayList arrayList, b bVar, N0 n02, String str) {
        arrayList.add(U.O0(bVar, h.f7570a.b(), false, n02, k8.f.q(str), arrayList.size(), bVar.f6806l));
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

    @Override // L7.D
    public boolean J() {
        return false;
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        return false;
    }

    public final int N0() {
        return this.f6809o;
    }

    @Override // L7.InterfaceC1280e
    public /* bridge */ /* synthetic */ InterfaceC1279d O() {
        return (InterfaceC1279d) V0();
    }

    public Void O0() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public List f() {
        return AbstractC2800q.j();
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1289n, L7.InterfaceC1288m
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public N b() {
        return this.f6807m;
    }

    @Override // L7.InterfaceC1280e
    public /* bridge */ /* synthetic */ InterfaceC1280e R() {
        return (InterfaceC1280e) O0();
    }

    public final f R0() {
        return this.f6808n;
    }

    @Override // L7.InterfaceC1280e
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public List I() {
        return AbstractC2800q.j();
    }

    @Override // L7.InterfaceC1280e
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public InterfaceC3442k.b P() {
        return InterfaceC3442k.b.f32996b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.z
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public d L(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f6811q;
    }

    public Void V0() {
        return null;
    }

    @Override // L7.InterfaceC1291p
    public h0 g() {
        h0 NO_SOURCE = h0.f7335a;
        AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // M7.a
    public h getAnnotations() {
        return h.f7570a.b();
    }

    @Override // L7.InterfaceC1280e
    public EnumC1281f getKind() {
        return EnumC1281f.f7321i;
    }

    @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u PUBLIC = AbstractC1294t.f7347e;
        AbstractC2855l.f(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // L7.D
    public boolean isExternal() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean isInline() {
        return false;
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        return this.f6810p;
    }

    @Override // L7.InterfaceC1280e, L7.D
    public E k() {
        return E.f7286k;
    }

    @Override // L7.InterfaceC1280e
    public boolean l() {
        return false;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
    public List t() {
        return this.f6812r;
    }

    public String toString() {
        String strJ = getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        return strJ;
    }

    @Override // L7.InterfaceC1280e
    public L7.r0 w0() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public boolean y() {
        return false;
    }
}
