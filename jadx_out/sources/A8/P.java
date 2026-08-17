package A8;

import C8.AbstractC0407d0;
import C8.F0;
import C8.G0;
import C8.N0;
import C8.W;
import L7.AbstractC1295u;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.h0;
import L7.l0;
import L7.q0;
import O7.AbstractC1328g;
import h8.InterfaceC2710c;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class P extends AbstractC1328g implements InterfaceC0399t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f8.r f119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC2710c f120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h8.g f121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h8.h f122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC0398s f123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AbstractC0407d0 f124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AbstractC0407d0 f125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AbstractC0407d0 f127y;

    /* JADX WARN: Illegal instructions before constructor call */
    public P(B8.n storageManager, InterfaceC1288m containingDeclaration, M7.h annotations, k8.f name, AbstractC1295u visibility, f8.r proto, InterfaceC2710c nameResolver, h8.g typeTable, h8.h versionRequirementTable, InterfaceC0398s interfaceC0398s) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(visibility, "visibility");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(versionRequirementTable, "versionRequirementTable");
        h0 NO_SOURCE = h0.f7335a;
        AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f119q = proto;
        this.f120r = nameResolver;
        this.f121s = typeTable;
        this.f122t = versionRequirementTable;
        this.f123u = interfaceC0398s;
    }

    @Override // O7.AbstractC1328g
    protected List O0() {
        List list = this.f126x;
        if (list != null) {
            return list;
        }
        AbstractC2855l.y("typeConstructorParameters");
        return null;
    }

    @Override // A8.InterfaceC0399t
    public h8.g Q() {
        return this.f121s;
    }

    @Override // A8.InterfaceC0399t
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public f8.r D() {
        return this.f119q;
    }

    public h8.h S0() {
        return this.f122t;
    }

    @Override // L7.l0
    public AbstractC0407d0 T() {
        AbstractC0407d0 abstractC0407d0 = this.f125w;
        if (abstractC0407d0 != null) {
            return abstractC0407d0;
        }
        AbstractC2855l.y("expandedType");
        return null;
    }

    public final void T0(List declaredTypeParameters, AbstractC0407d0 underlyingType, AbstractC0407d0 expandedType) {
        AbstractC2855l.g(declaredTypeParameters, "declaredTypeParameters");
        AbstractC2855l.g(underlyingType, "underlyingType");
        AbstractC2855l.g(expandedType, "expandedType");
        P0(declaredTypeParameters);
        this.f124v = underlyingType;
        this.f125w = expandedType;
        this.f126x = q0.g(this);
        this.f127y = J0();
    }

    @Override // L7.j0
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public l0 c(G0 substitutor) {
        AbstractC2855l.g(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        B8.n nVarC0 = c0();
        InterfaceC1288m interfaceC1288mB = b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        M7.h annotations = getAnnotations();
        AbstractC2855l.f(annotations, "<get-annotations>(...)");
        k8.f name = getName();
        AbstractC2855l.f(name, "getName(...)");
        P p10 = new P(nVarC0, interfaceC1288mB, annotations, name, getVisibility(), D(), W(), Q(), S0(), Y());
        List listT = t();
        AbstractC0407d0 abstractC0407d0B0 = b0();
        N0 n02 = N0.f592k;
        C8.S sN = substitutor.n(abstractC0407d0B0, n02);
        AbstractC2855l.f(sN, "safeSubstitute(...)");
        AbstractC0407d0 abstractC0407d0A = F0.a(sN);
        C8.S sN2 = substitutor.n(T(), n02);
        AbstractC2855l.f(sN2, "safeSubstitute(...)");
        p10.T0(listT, abstractC0407d0A, F0.a(sN2));
        return p10;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC2710c W() {
        return this.f120r;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC0398s Y() {
        return this.f123u;
    }

    @Override // L7.l0
    public AbstractC0407d0 b0() {
        AbstractC0407d0 abstractC0407d0 = this.f124v;
        if (abstractC0407d0 != null) {
            return abstractC0407d0;
        }
        AbstractC2855l.y("underlyingType");
        return null;
    }

    @Override // L7.l0
    public InterfaceC1280e q() {
        if (W.a(T())) {
            return null;
        }
        InterfaceC1283h interfaceC1283hP = T().K0().p();
        if (interfaceC1283hP instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hP;
        }
        return null;
    }

    @Override // L7.InterfaceC1283h
    public AbstractC0407d0 r() {
        AbstractC0407d0 abstractC0407d0 = this.f127y;
        if (abstractC0407d0 != null) {
            return abstractC0407d0;
        }
        AbstractC2855l.y("defaultTypeImpl");
        return null;
    }
}
