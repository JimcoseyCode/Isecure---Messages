package L7;

import C8.AbstractC0407d0;
import C8.N0;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: L7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1278c implements m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m0 f7314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1288m f7315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7316i;

    public C1278c(m0 originalDescriptor, InterfaceC1288m declarationDescriptor, int i10) {
        AbstractC2855l.g(originalDescriptor, "originalDescriptor");
        AbstractC2855l.g(declarationDescriptor, "declarationDescriptor");
        this.f7314g = originalDescriptor;
        this.f7315h = declarationDescriptor;
        this.f7316i = i10;
    }

    @Override // L7.m0
    public boolean E() {
        return this.f7314g.E();
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return this.f7314g.E0(interfaceC1290o, obj);
    }

    @Override // L7.InterfaceC1289n, L7.InterfaceC1288m
    public InterfaceC1288m b() {
        return this.f7315h;
    }

    @Override // L7.m0
    public B8.n c0() {
        B8.n nVarC0 = this.f7314g.c0();
        AbstractC2855l.f(nVarC0, "getStorageManager(...)");
        return nVarC0;
    }

    @Override // L7.InterfaceC1291p
    public h0 g() {
        h0 h0VarG = this.f7314g.g();
        AbstractC2855l.f(h0VarG, "getSource(...)");
        return h0VarG;
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        return this.f7314g.getAnnotations();
    }

    @Override // L7.m0
    public int getIndex() {
        return this.f7316i + this.f7314g.getIndex();
    }

    @Override // L7.J
    public k8.f getName() {
        k8.f name = this.f7314g.getName();
        AbstractC2855l.f(name, "getName(...)");
        return name;
    }

    @Override // L7.m0
    public List getUpperBounds() {
        List upperBounds = this.f7314g.getUpperBounds();
        AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // L7.m0, L7.InterfaceC1283h
    public C8.v0 j() {
        C8.v0 v0VarJ = this.f7314g.j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        return v0VarJ;
    }

    @Override // L7.m0
    public boolean j0() {
        return true;
    }

    @Override // L7.m0
    public N0 m() {
        N0 n0M = this.f7314g.m();
        AbstractC2855l.f(n0M, "getVariance(...)");
        return n0M;
    }

    @Override // L7.InterfaceC1283h
    public AbstractC0407d0 r() {
        AbstractC0407d0 abstractC0407d0R = this.f7314g.r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        return abstractC0407d0R;
    }

    public String toString() {
        return this.f7314g + "[inner-copy]";
    }

    @Override // L7.InterfaceC1288m
    public m0 a() {
        m0 m0VarA = this.f7314g.a();
        AbstractC2855l.f(m0VarA, "getOriginal(...)");
        return m0VarA;
    }
}
