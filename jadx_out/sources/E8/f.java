package E8;

import C8.G0;
import C8.S;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.E;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.InterfaceC1297w;
import L7.Z;
import L7.a0;
import L7.b0;
import L7.c0;
import L7.h0;
import O7.K;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ K f1139g;

    public f() {
        l lVar = l.f1253a;
        K kL0 = K.L0(lVar.h(), M7.h.f7570a.b(), E.f7285j, AbstractC1294t.f7347e, true, k8.f.t(b.f1125l.j()), InterfaceC1277b.a.DECLARATION, h0.f7335a, false, false, false, false, false, false);
        kL0.Y0(lVar.k(), AbstractC2800q.j(), null, null, AbstractC2800q.j());
        this.f1139g = kL0;
    }

    @Override // L7.D
    public boolean B0() {
        return this.f1139g.B0();
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return this.f1139g.E0(interfaceC1290o, obj);
    }

    @Override // L7.InterfaceC1276a
    public boolean F() {
        return this.f1139g.F();
    }

    @Override // L7.D
    public boolean J() {
        return this.f1139g.J();
    }

    @Override // L7.v0
    public boolean M() {
        return this.f1139g.M();
    }

    @Override // L7.u0
    public q8.g U() {
        return this.f1139g.U();
    }

    @Override // L7.InterfaceC1288m
    public Z a() {
        Z zA = this.f1139g.a();
        AbstractC2855l.f(zA, "getOriginal(...)");
        return zA;
    }

    @Override // L7.InterfaceC1276a
    public c0 a0() {
        return this.f1139g.a0();
    }

    @Override // L7.InterfaceC1289n, L7.InterfaceC1288m
    public InterfaceC1288m b() {
        InterfaceC1288m interfaceC1288mB = this.f1139g.b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        return interfaceC1288mB;
    }

    @Override // L7.j0
    public Z c(G0 substitutor) {
        AbstractC2855l.g(substitutor, "substitutor");
        return this.f1139g.c(substitutor);
    }

    @Override // L7.u0
    public boolean d0() {
        return this.f1139g.d0();
    }

    @Override // L7.Z, L7.InterfaceC1277b, L7.InterfaceC1276a
    public Collection e() {
        Collection collectionE = this.f1139g.e();
        AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
        return collectionE;
    }

    @Override // L7.InterfaceC1291p
    public h0 g() {
        h0 h0VarG = this.f1139g.g();
        AbstractC2855l.f(h0VarG, "getSource(...)");
        return h0VarG;
    }

    @Override // L7.InterfaceC1276a
    public Object g0(InterfaceC1276a.InterfaceC0068a interfaceC0068a) {
        return this.f1139g.g0(interfaceC0068a);
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        M7.h annotations = this.f1139g.getAnnotations();
        AbstractC2855l.f(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // L7.Z
    public a0 getGetter() {
        return this.f1139g.getGetter();
    }

    @Override // L7.InterfaceC1277b
    public InterfaceC1277b.a getKind() {
        InterfaceC1277b.a kind = this.f1139g.getKind();
        AbstractC2855l.f(kind, "getKind(...)");
        return kind;
    }

    @Override // L7.J
    public k8.f getName() {
        k8.f name = this.f1139g.getName();
        AbstractC2855l.f(name, "getName(...)");
        return name;
    }

    @Override // L7.InterfaceC1276a
    public S getReturnType() {
        return this.f1139g.getReturnType();
    }

    @Override // L7.s0
    public S getType() {
        S type = this.f1139g.getType();
        AbstractC2855l.f(type, "getType(...)");
        return type;
    }

    @Override // L7.InterfaceC1276a
    public List getTypeParameters() {
        List typeParameters = this.f1139g.getTypeParameters();
        AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u visibility = this.f1139g.getVisibility();
        AbstractC2855l.f(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // L7.Z
    public b0 h() {
        return this.f1139g.h();
    }

    @Override // L7.InterfaceC1276a
    public c0 h0() {
        return this.f1139g.h0();
    }

    @Override // L7.InterfaceC1276a
    public List i() {
        List listI = this.f1139g.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        return listI;
    }

    @Override // L7.Z
    public InterfaceC1297w i0() {
        return this.f1139g.i0();
    }

    @Override // L7.u0
    public boolean isConst() {
        return this.f1139g.isConst();
    }

    @Override // L7.D
    public boolean isExternal() {
        return this.f1139g.isExternal();
    }

    @Override // L7.D
    public E k() {
        E eK = this.f1139g.k();
        AbstractC2855l.f(eK, "getModality(...)");
        return eK;
    }

    @Override // L7.Z
    public InterfaceC1297w l0() {
        return this.f1139g.l0();
    }

    @Override // L7.InterfaceC1276a
    public List m0() {
        List listM0 = this.f1139g.m0();
        AbstractC2855l.f(listM0, "getContextReceiverParameters(...)");
        return listM0;
    }

    @Override // L7.u0
    public boolean o0() {
        return this.f1139g.o0();
    }

    @Override // L7.Z
    public List u() {
        List listU = this.f1139g.u();
        AbstractC2855l.f(listU, "getAccessors(...)");
        return listU;
    }

    @Override // L7.InterfaceC1277b
    public void u0(Collection overriddenDescriptors) {
        AbstractC2855l.g(overriddenDescriptors, "overriddenDescriptors");
        this.f1139g.u0(overriddenDescriptors);
    }

    @Override // L7.InterfaceC1277b
    public InterfaceC1277b x(InterfaceC1288m interfaceC1288m, E e10, AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar, boolean z10) {
        Z zK0 = this.f1139g.x(interfaceC1288m, e10, abstractC1295u, aVar, z10);
        AbstractC2855l.f(zK0, "copy(...)");
        return zK0;
    }
}
