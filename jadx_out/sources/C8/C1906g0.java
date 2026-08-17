package c8;

import C8.J0;
import C8.L0;
import L7.InterfaceC1280e;
import L7.t0;
import U7.C1476d;
import U7.EnumC1475c;
import Y7.C1546j;
import j7.AbstractC2800q;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.AbstractC3027i;

/* JADX INFO: renamed from: c8.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1906g0 extends AbstractC1899d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M7.a f18983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X7.k f18985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC1475c f18986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18987e;

    public /* synthetic */ C1906g0(M7.a aVar, boolean z10, X7.k kVar, EnumC1475c enumC1475c, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z10, kVar, enumC1475c, (i10 & 16) != 0 ? false : z11);
    }

    @Override // c8.AbstractC1899d
    public boolean B(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return I7.i.d0((C8.S) iVar);
    }

    @Override // c8.AbstractC1899d
    public boolean C() {
        return this.f18984b;
    }

    @Override // c8.AbstractC1899d
    public boolean D(G8.i iVar, G8.i other) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(other, "other");
        return this.f18985c.a().k().c((C8.S) iVar, (C8.S) other);
    }

    @Override // c8.AbstractC1899d
    public boolean E(G8.n nVar) {
        AbstractC2855l.g(nVar, "<this>");
        return nVar instanceof Y7.c0;
    }

    @Override // c8.AbstractC1899d
    public boolean F(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return ((C8.S) iVar).N0() instanceof C1911j;
    }

    @Override // c8.AbstractC1899d
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public boolean l(M7.c cVar, G8.i iVar) {
        AbstractC2855l.g(cVar, "<this>");
        if ((cVar instanceof W7.g) && ((W7.g) cVar).e()) {
            return true;
        }
        if ((cVar instanceof C1546j) && !u() && (((C1546j) cVar).m() || q() == EnumC1475c.f11503l)) {
            return true;
        }
        return iVar != null && I7.i.q0((C8.S) iVar) && m().p(cVar) && !this.f18985c.a().q().c();
    }

    @Override // c8.AbstractC1899d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public C1476d m() {
        return this.f18985c.a().a();
    }

    @Override // c8.AbstractC1899d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C8.S v(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return L0.a((C8.S) iVar);
    }

    @Override // c8.AbstractC1899d
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public G8.q A() {
        return D8.s.f846a;
    }

    @Override // c8.AbstractC1899d
    public Iterable n(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return ((C8.S) iVar).getAnnotations();
    }

    @Override // c8.AbstractC1899d
    public Iterable p() {
        M7.h annotations;
        M7.a aVar = this.f18983a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? AbstractC2800q.j() : annotations;
    }

    @Override // c8.AbstractC1899d
    public EnumC1475c q() {
        return this.f18986d;
    }

    @Override // c8.AbstractC1899d
    public U7.E r() {
        return this.f18985c.b();
    }

    @Override // c8.AbstractC1899d
    public boolean s() {
        M7.a aVar = this.f18983a;
        return (aVar instanceof t0) && ((t0) aVar).f0() != null;
    }

    @Override // c8.AbstractC1899d
    protected C1915l t(C1915l c1915l, U7.w wVar) {
        C1915l c1915lB;
        if (c1915l != null && (c1915lB = C1915l.b(c1915l, EnumC1913k.f19007i, false, 2, null)) != null) {
            return c1915lB;
        }
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    @Override // c8.AbstractC1899d
    public boolean u() {
        return this.f18985c.a().q().d();
    }

    @Override // c8.AbstractC1899d
    public k8.d x(G8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        InterfaceC1280e interfaceC1280eF = J0.f((C8.S) iVar);
        if (interfaceC1280eF != null) {
            return AbstractC3027i.m(interfaceC1280eF);
        }
        return null;
    }

    @Override // c8.AbstractC1899d
    public boolean z() {
        return this.f18987e;
    }

    public C1906g0(M7.a aVar, boolean z10, X7.k containerContext, EnumC1475c containerApplicabilityType, boolean z11) {
        AbstractC2855l.g(containerContext, "containerContext");
        AbstractC2855l.g(containerApplicabilityType, "containerApplicabilityType");
        this.f18983a = aVar;
        this.f18984b = z10;
        this.f18985c = containerContext;
        this.f18986d = containerApplicabilityType;
        this.f18987e = z11;
    }
}
