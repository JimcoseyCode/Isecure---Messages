package F7;

import C7.j;
import F7.a1;
import G7.n;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;
import v7.C3431b;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: F7.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0570y0 implements C7.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f2138l = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C0570y0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C0570y0.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A f2139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j.a f2141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a1.a f2142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a1.a f2143k;

    /* JADX INFO: renamed from: F7.y0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements Type {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Type[] f2144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f2145h;

        public a(Type[] types) {
            AbstractC2855l.g(types, "types");
            this.f2144g = types;
            this.f2145h = Arrays.hashCode(types);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f2144g, ((a) obj).f2144g);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC2793j.a0(this.f2144g, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f2145h;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public C0570y0(A callable, int i10, j.a kind, InterfaceC3487a computeDescriptor) {
        AbstractC2855l.g(callable, "callable");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(computeDescriptor, "computeDescriptor");
        this.f2139g = callable;
        this.f2140h = i10;
        this.f2141i = kind;
        this.f2142j = a1.c(computeDescriptor);
        this.f2143k = a1.c(new C0566w0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type b(C0570y0 c0570y0) {
        List listF0;
        L7.W wP = c0570y0.p();
        if ((wP instanceof L7.c0) && AbstractC2855l.b(j1.i(c0570y0.f2139g.Z()), wP) && c0570y0.f2139g.Z().getKind() == InterfaceC1277b.a.FAKE_OVERRIDE) {
            InterfaceC1288m interfaceC1288mB = c0570y0.f2139g.Z().b();
            AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsQ = j1.q((InterfaceC1280e) interfaceC1288mB);
            if (clsQ != null) {
                return clsQ;
            }
            throw new Y0("Cannot determine receiver Java type of inherited declaration: " + wP);
        }
        G7.h hVarR = c0570y0.f2139g.R();
        if (!(hVarR instanceof G7.n)) {
            if (!(hVarR instanceof n.b)) {
                return (Type) hVarR.a().get(c0570y0.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((n.b) hVarR).d().get(c0570y0.getIndex())).toArray(new Class[0]);
            return c0570y0.k((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (c0570y0.f2139g.X()) {
            G7.n nVar = (G7.n) hVarR;
            B7.c cVarF = nVar.f(c0570y0.getIndex() + 1);
            int iO = nVar.f(0).o() + 1;
            listF0 = AbstractC2800q.F0(nVar.a(), new B7.c(cVarF.d() - iO, cVarF.o() - iO));
        } else {
            G7.n nVar2 = (G7.n) hVarR;
            listF0 = AbstractC2800q.F0(nVar2.a(), nVar2.f(c0570y0.getIndex()));
        }
        Type[] typeArr = (Type[]) listF0.toArray(new Type[0]);
        return c0570y0.k((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(C0570y0 c0570y0) {
        return j1.e(c0570y0.p());
    }

    private final Type k(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) AbstractC2793j.i0(typeArr);
        }
        throw new C3431b("Expected at least 1 type for compound type");
    }

    private final L7.W p() {
        Object objC = this.f2142j.c(this, f2138l[0]);
        AbstractC2855l.f(objC, "getValue(...)");
        return (L7.W) objC;
    }

    @Override // C7.j
    public boolean a() {
        L7.W wP = p();
        return (wP instanceof L7.t0) && ((L7.t0) wP).f0() != null;
    }

    @Override // C7.j
    public boolean d() {
        L7.W wP = p();
        L7.t0 t0Var = wP instanceof L7.t0 ? (L7.t0) wP : null;
        if (t0Var != null) {
            return AbstractC3340e.f(t0Var);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0570y0)) {
            return false;
        }
        C0570y0 c0570y0 = (C0570y0) obj;
        return AbstractC2855l.b(this.f2139g, c0570y0.f2139g) && getIndex() == c0570y0.getIndex();
    }

    @Override // C7.b
    public List getAnnotations() {
        Object objC = this.f2143k.c(this, f2138l[1]);
        AbstractC2855l.f(objC, "getValue(...)");
        return (List) objC;
    }

    @Override // C7.j
    public int getIndex() {
        return this.f2140h;
    }

    @Override // C7.j
    public j.a getKind() {
        return this.f2141i;
    }

    @Override // C7.j
    public String getName() {
        L7.W wP = p();
        L7.t0 t0Var = wP instanceof L7.t0 ? (L7.t0) wP : null;
        if (t0Var == null || t0Var.b().F()) {
            return null;
        }
        k8.f name = t0Var.getName();
        AbstractC2855l.f(name, "getName(...)");
        if (name.r()) {
            return null;
        }
        return name.j();
    }

    @Override // C7.j
    public C7.o getType() {
        C8.S type = p().getType();
        AbstractC2855l.f(type, "getType(...)");
        return new U0(type, new C0568x0(this));
    }

    public int hashCode() {
        return (this.f2139g.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    public final A m() {
        return this.f2139g;
    }

    public String toString() {
        return e1.f2045a.j(this);
    }
}
