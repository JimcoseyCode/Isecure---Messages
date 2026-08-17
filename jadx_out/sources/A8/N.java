package A8;

import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.Z;
import L7.h0;
import h8.AbstractC2709b;
import h8.InterfaceC2710c;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class N extends O7.K implements InterfaceC0382b {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final f8.n f109I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final InterfaceC2710c f110J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final h8.g f111K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final h8.h f112L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final InterfaceC0398s f113M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1288m containingDeclaration, Z z10, M7.h annotations, L7.E modality, AbstractC1295u visibility, boolean z11, k8.f name, InterfaceC1277b.a kind, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, f8.n proto, InterfaceC2710c nameResolver, h8.g typeTable, h8.h versionRequirementTable, InterfaceC0398s interfaceC0398s) {
        super(containingDeclaration, z10, annotations, modality, visibility, z11, name, kind, h0.f7335a, z12, z13, z16, false, z14, z15);
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(modality, "modality");
        AbstractC2855l.g(visibility, "visibility");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(versionRequirementTable, "versionRequirementTable");
        this.f109I = proto;
        this.f110J = nameResolver;
        this.f111K = typeTable;
        this.f112L = versionRequirementTable;
        this.f113M = interfaceC0398s;
    }

    @Override // O7.K
    protected O7.K M0(InterfaceC1288m newOwner, L7.E newModality, AbstractC1295u newVisibility, Z z10, InterfaceC1277b.a kind, k8.f newName, h0 source) {
        AbstractC2855l.g(newOwner, "newOwner");
        AbstractC2855l.g(newModality, "newModality");
        AbstractC2855l.g(newVisibility, "newVisibility");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(newName, "newName");
        AbstractC2855l.g(source, "source");
        return new N(newOwner, z10, getAnnotations(), newModality, newVisibility, d0(), newName, kind, o0(), isConst(), isExternal(), M(), J(), D(), W(), Q(), d1(), Y());
    }

    @Override // A8.InterfaceC0399t
    public h8.g Q() {
        return this.f111K;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC2710c W() {
        return this.f110J;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC0398s Y() {
        return this.f113M;
    }

    @Override // A8.InterfaceC0399t
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public f8.n D() {
        return this.f109I;
    }

    public h8.h d1() {
        return this.f112L;
    }

    @Override // O7.K, L7.D
    public boolean isExternal() {
        Boolean boolD = AbstractC2709b.f28519E.d(D().Z());
        AbstractC2855l.f(boolD, "get(...)");
        return boolD.booleanValue();
    }
}
