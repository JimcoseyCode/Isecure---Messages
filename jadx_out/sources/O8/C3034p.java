package o8;

import C8.S;
import C8.u0;
import C8.v0;
import D8.AbstractC0440a;
import D8.b;
import D8.e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: renamed from: o8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3034p implements D8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f30554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D8.g f30555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D8.f f30556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f30557e;

    /* JADX INFO: renamed from: o8.p$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends u0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ C3034p f30558k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, C3034p c3034p, D8.f fVar, D8.g gVar) {
            super(z10, z11, true, c3034p, fVar, gVar);
            this.f30558k = c3034p;
        }

        @Override // C8.u0
        public boolean f(G8.i subType, G8.i superType) {
            AbstractC2855l.g(subType, "subType");
            AbstractC2855l.g(superType, "superType");
            if (!(subType instanceof S)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof S) {
                return ((Boolean) this.f30558k.f30557e.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public C3034p(Map map, e.a equalityAxioms, D8.g kotlinTypeRefiner, D8.f kotlinTypePreparator, Function2 function2) {
        AbstractC2855l.g(equalityAxioms, "equalityAxioms");
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC2855l.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f30553a = map;
        this.f30554b = equalityAxioms;
        this.f30555c = kotlinTypeRefiner;
        this.f30556d = kotlinTypePreparator;
        this.f30557e = function2;
    }

    private final boolean J0(v0 v0Var, v0 v0Var2) {
        if (this.f30554b.a(v0Var, v0Var2)) {
            return true;
        }
        Map map = this.f30553a;
        if (map == null) {
            return false;
        }
        v0 v0Var3 = (v0) map.get(v0Var);
        v0 v0Var4 = (v0) this.f30553a.get(v0Var2);
        return (v0Var3 != null && AbstractC2855l.b(v0Var3, v0Var2)) || (v0Var4 != null && AbstractC2855l.b(v0Var4, v0Var));
    }

    @Override // C8.H0
    public boolean A(G8.m mVar) {
        return b.a.b0(this, mVar);
    }

    @Override // G8.o
    public G8.s A0(G8.l lVar) {
        return b.a.y(this, lVar);
    }

    @Override // G8.o
    public boolean B(G8.j jVar) {
        AbstractC2855l.g(jVar, "<this>");
        return t0(c(jVar));
    }

    @Override // G8.o
    public G8.e B0(G8.j jVar) {
        return b.a.e(this, jVar);
    }

    @Override // G8.o
    public G8.i C(G8.i iVar, boolean z10) {
        return b.a.e0(this, iVar, z10);
    }

    @Override // G8.o
    public G8.i C0(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return C(iVar, false);
    }

    @Override // G8.o
    public int D(G8.m mVar) {
        return b.a.h0(this, mVar);
    }

    @Override // G8.o
    public G8.m D0(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        G8.j jVarA = a(iVar);
        if (jVarA == null) {
            jVarA = K(iVar);
        }
        return c(jVarA);
    }

    @Override // G8.o
    public boolean E(G8.j jVar) {
        return b.a.Y(this, jVar);
    }

    @Override // G8.o
    public boolean E0(G8.i iVar) {
        return b.a.I(this, iVar);
    }

    @Override // D8.b
    public G8.i F(G8.j jVar, G8.j jVar2) {
        return b.a.l(this, jVar, jVar2);
    }

    @Override // G8.o
    public int F0(G8.k kVar) {
        AbstractC2855l.g(kVar, "<this>");
        if (kVar instanceof G8.j) {
            return x0((G8.i) kVar);
        }
        if (kVar instanceof G8.a) {
            return ((G8.a) kVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + D.b(kVar.getClass())).toString());
    }

    @Override // G8.o
    public List G(G8.i iVar) {
        return b.a.n(this, iVar);
    }

    @Override // G8.o
    public boolean G0(G8.m mVar) {
        return b.a.E(this, mVar);
    }

    @Override // G8.o
    public G8.i H(G8.d dVar) {
        return b.a.d0(this, dVar);
    }

    @Override // G8.o
    public G8.j H0(G8.j jVar) {
        G8.j jVarE0;
        AbstractC2855l.g(jVar, "<this>");
        G8.e eVarB0 = B0(jVar);
        return (eVarB0 == null || (jVarE0 = e0(eVarB0)) == null) ? jVar : jVarE0;
    }

    @Override // G8.o
    public G8.l I(G8.k kVar, int i10) {
        AbstractC2855l.g(kVar, "<this>");
        if (kVar instanceof G8.j) {
            return T((G8.i) kVar, i10);
        }
        if (kVar instanceof G8.a) {
            E e10 = ((G8.a) kVar).get(i10);
            AbstractC2855l.f(e10, "get(...)");
            return (G8.l) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + D.b(kVar.getClass())).toString());
    }

    @Override // G8.o
    public u0.c J(G8.j jVar) {
        return b.a.k0(this, jVar);
    }

    @Override // G8.o
    public G8.j K(G8.i iVar) {
        G8.j jVarF;
        AbstractC2855l.g(iVar, "<this>");
        G8.g gVarB0 = b0(iVar);
        if (gVarB0 != null && (jVarF = f(gVarB0)) != null) {
            return jVarF;
        }
        G8.j jVarA = a(iVar);
        AbstractC2855l.d(jVarA);
        return jVarA;
    }

    public u0 K0(boolean z10, boolean z11) {
        if (this.f30557e != null) {
            return new a(z10, z11, this, this.f30556d, this.f30555c);
        }
        return AbstractC0440a.a(z10, z11, this, this.f30556d, this.f30555c);
    }

    @Override // G8.o
    public boolean L(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        G8.j jVarA = a(iVar);
        return (jVarA != null ? d(jVarA) : null) != null;
    }

    @Override // G8.o
    public List M(G8.j jVar, G8.m constructor) {
        AbstractC2855l.g(jVar, "<this>");
        AbstractC2855l.g(constructor, "constructor");
        return null;
    }

    @Override // G8.o
    public G8.b N(G8.d dVar) {
        return b.a.k(this, dVar);
    }

    @Override // G8.o
    public G8.i O(G8.i iVar, boolean z10) {
        return b.a.p0(this, iVar, z10);
    }

    @Override // C8.H0
    public I7.l P(G8.m mVar) {
        return b.a.r(this, mVar);
    }

    @Override // G8.o
    public boolean Q(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        G8.g gVarB0 = b0(iVar);
        if (gVarB0 == null) {
            return false;
        }
        Y(gVarB0);
        return false;
    }

    @Override // G8.o
    public G8.j R(G8.j jVar, G8.b bVar) {
        return b.a.j(this, jVar, bVar);
    }

    @Override // G8.o
    public Collection S(G8.j jVar) {
        return b.a.i0(this, jVar);
    }

    @Override // G8.o
    public G8.l T(G8.i iVar, int i10) {
        return b.a.m(this, iVar, i10);
    }

    @Override // G8.o
    public boolean U(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return w(D0(iVar)) && !u0(iVar);
    }

    @Override // G8.o
    public boolean V(G8.m c12, G8.m c22) {
        AbstractC2855l.g(c12, "c1");
        AbstractC2855l.g(c22, "c2");
        if (!(c12 instanceof v0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c22 instanceof v0) {
            return b.a.a(this, c12, c22) || J0((v0) c12, (v0) c22);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // G8.o
    public boolean W(G8.j jVar) {
        return b.a.N(this, jVar);
    }

    @Override // G8.o
    public G8.l X(G8.i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // G8.o
    public G8.f Y(G8.g gVar) {
        b.a.f(this, gVar);
        return null;
    }

    @Override // G8.o
    public G8.i Z(Collection collection) {
        return b.a.D(this, collection);
    }

    @Override // D8.b, G8.o
    public G8.j a(G8.i iVar) {
        return b.a.h(this, iVar);
    }

    @Override // C8.H0
    public G8.i a0(G8.i iVar) {
        return b.a.w(this, iVar);
    }

    @Override // D8.b, G8.o
    public boolean b(G8.j jVar) {
        return b.a.V(this, jVar);
    }

    @Override // G8.o
    public G8.g b0(G8.i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // D8.b, G8.o
    public G8.m c(G8.j jVar) {
        return b.a.n0(this, jVar);
    }

    @Override // G8.o
    public boolean c0(G8.j jVar) {
        AbstractC2855l.g(jVar, "<this>");
        return q(c(jVar));
    }

    @Override // D8.b, G8.o
    public G8.d d(G8.j jVar) {
        return b.a.d(this, jVar);
    }

    @Override // C8.H0
    public I7.l d0(G8.m mVar) {
        return b.a.s(this, mVar);
    }

    @Override // D8.b, G8.o
    public G8.j e(G8.g gVar) {
        return b.a.o0(this, gVar);
    }

    @Override // G8.o
    public G8.j e0(G8.e eVar) {
        return b.a.g0(this, eVar);
    }

    @Override // D8.b, G8.o
    public G8.j f(G8.g gVar) {
        return b.a.c0(this, gVar);
    }

    @Override // G8.o
    public boolean f0(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        G8.j jVarA = a(iVar);
        return (jVarA != null ? B0(jVarA) : null) != null;
    }

    @Override // D8.b, G8.o
    public G8.j g(G8.j jVar, boolean z10) {
        return b.a.q0(this, jVar, z10);
    }

    @Override // C8.H0
    public boolean g0(G8.m mVar) {
        return b.a.J(this, mVar);
    }

    @Override // G8.o
    public G8.i h(G8.l lVar) {
        return b.a.u(this, lVar);
    }

    @Override // C8.H0
    public G8.i h0(G8.n nVar) {
        return b.a.t(this, nVar);
    }

    @Override // G8.o
    public boolean i(G8.i iVar) {
        return b.a.U(this, iVar);
    }

    @Override // G8.q
    public boolean i0() {
        return b.a.M(this);
    }

    @Override // G8.o
    public boolean j(G8.m mVar) {
        return b.a.H(this, mVar);
    }

    @Override // G8.o
    public boolean j0(G8.j jVar) {
        return b.a.S(this, jVar);
    }

    @Override // G8.o
    public boolean k(G8.d dVar) {
        return b.a.R(this, dVar);
    }

    @Override // C8.H0
    public G8.i k0(G8.i iVar) {
        G8.j jVarG;
        AbstractC2855l.g(iVar, "<this>");
        G8.j jVarA = a(iVar);
        return (jVarA == null || (jVarG = g(jVarA, true)) == null) ? iVar : jVarG;
    }

    @Override // G8.o
    public boolean l(G8.l lVar) {
        return b.a.X(this, lVar);
    }

    @Override // G8.o
    public G8.l l0(G8.j jVar, int i10) {
        AbstractC2855l.g(jVar, "<this>");
        if (i10 < 0 || i10 >= x0(jVar)) {
            return null;
        }
        return T(jVar, i10);
    }

    @Override // G8.o
    public Collection m(G8.m mVar) {
        return b.a.l0(this, mVar);
    }

    @Override // G8.o
    public G8.j m0(G8.i iVar) {
        G8.j jVarE;
        AbstractC2855l.g(iVar, "<this>");
        G8.g gVarB0 = b0(iVar);
        if (gVarB0 != null && (jVarE = e(gVarB0)) != null) {
            return jVarE;
        }
        G8.j jVarA = a(iVar);
        AbstractC2855l.d(jVarA);
        return jVarA;
    }

    @Override // G8.o
    public G8.n n(G8.m mVar) {
        return b.a.v(this, mVar);
    }

    @Override // G8.o
    public boolean n0(G8.i iVar) {
        return b.a.a0(this, iVar);
    }

    @Override // G8.o
    public List o(G8.n nVar) {
        return b.a.x(this, nVar);
    }

    @Override // G8.o
    public G8.l o0(G8.c cVar) {
        return b.a.j0(this, cVar);
    }

    @Override // C8.H0
    public k8.d p(G8.m mVar) {
        return b.a.o(this, mVar);
    }

    @Override // G8.o
    public boolean p0(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return W(K(iVar)) != W(m0(iVar));
    }

    @Override // G8.o
    public boolean q(G8.m mVar) {
        return b.a.K(this, mVar);
    }

    @Override // G8.o
    public List q0(G8.m mVar) {
        return b.a.q(this, mVar);
    }

    @Override // G8.o
    public boolean r(G8.m mVar) {
        return b.a.L(this, mVar);
    }

    @Override // C8.H0
    public boolean r0(G8.i iVar, k8.c cVar) {
        return b.a.A(this, iVar, cVar);
    }

    @Override // G8.o
    public boolean s(G8.d dVar) {
        return b.a.T(this, dVar);
    }

    @Override // G8.o
    public boolean s0(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return !AbstractC2855l.b(c(K(iVar)), c(m0(iVar)));
    }

    @Override // G8.o
    public boolean t(G8.m mVar) {
        return b.a.G(this, mVar);
    }

    @Override // G8.o
    public boolean t0(G8.m mVar) {
        return b.a.F(this, mVar);
    }

    @Override // G8.o
    public boolean u(G8.n nVar, G8.m mVar) {
        return b.a.B(this, nVar, mVar);
    }

    @Override // G8.o
    public boolean u0(G8.i iVar) {
        return b.a.Q(this, iVar);
    }

    @Override // G8.o
    public boolean v(G8.i iVar) {
        return b.a.O(this, iVar);
    }

    @Override // G8.o
    public boolean v0(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return (iVar instanceof G8.j) && W((G8.j) iVar);
    }

    @Override // G8.o
    public boolean w(G8.m mVar) {
        return b.a.P(this, mVar);
    }

    @Override // G8.r
    public boolean w0(G8.j jVar, G8.j jVar2) {
        return b.a.C(this, jVar, jVar2);
    }

    @Override // G8.o
    public boolean x(G8.j jVar) {
        return b.a.Z(this, jVar);
    }

    @Override // G8.o
    public int x0(G8.i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // G8.o
    public G8.s y(G8.n nVar) {
        return b.a.z(this, nVar);
    }

    @Override // G8.o
    public G8.n y0(G8.m mVar, int i10) {
        return b.a.p(this, mVar, i10);
    }

    @Override // G8.o
    public G8.c z(G8.d dVar) {
        return b.a.m0(this, dVar);
    }

    @Override // G8.o
    public G8.k z0(G8.j jVar) {
        return b.a.c(this, jVar);
    }
}
