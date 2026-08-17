package y8;

import A8.InterfaceC0398s;
import L7.InterfaceC1288m;
import h8.AbstractC2708a;
import h8.InterfaceC2710c;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3654p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3652n f34129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2710c f34130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1288m f34131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h8.g f34132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h8.h f34133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC2708a f34134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0398s f34135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X f34136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C3637K f34137i;

    public C3654p(C3652n components, InterfaceC2710c nameResolver, InterfaceC1288m containingDeclaration, h8.g typeTable, h8.h versionRequirementTable, AbstractC2708a metadataVersion, InterfaceC0398s interfaceC0398s, X x10, List typeParameters) {
        String strC;
        AbstractC2855l.g(components, "components");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(versionRequirementTable, "versionRequirementTable");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        AbstractC2855l.g(typeParameters, "typeParameters");
        this.f34129a = components;
        this.f34130b = nameResolver;
        this.f34131c = containingDeclaration;
        this.f34132d = typeTable;
        this.f34133e = versionRequirementTable;
        this.f34134f = metadataVersion;
        this.f34135g = interfaceC0398s;
        this.f34136h = new X(this, x10, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (interfaceC0398s == null || (strC = interfaceC0398s.c()) == null) ? "[container not found]" : strC);
        this.f34137i = new C3637K(this);
    }

    public static /* synthetic */ C3654p b(C3654p c3654p, InterfaceC1288m interfaceC1288m, List list, InterfaceC2710c interfaceC2710c, h8.g gVar, h8.h hVar, AbstractC2708a abstractC2708a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC2710c = c3654p.f34130b;
        }
        InterfaceC2710c interfaceC2710c2 = interfaceC2710c;
        if ((i10 & 8) != 0) {
            gVar = c3654p.f34132d;
        }
        h8.g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = c3654p.f34133e;
        }
        h8.h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            abstractC2708a = c3654p.f34134f;
        }
        return c3654p.a(interfaceC1288m, list, interfaceC2710c2, gVar2, hVar2, abstractC2708a);
    }

    public final C3654p a(InterfaceC1288m descriptor, List typeParameterProtos, InterfaceC2710c nameResolver, h8.g typeTable, h8.h versionRequirementTable, AbstractC2708a metadataVersion) {
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(typeParameterProtos, "typeParameterProtos");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(versionRequirementTable, "versionRequirementTable");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        return new C3654p(this.f34129a, nameResolver, descriptor, typeTable, h8.i.b(metadataVersion) ? versionRequirementTable : this.f34133e, metadataVersion, this.f34135g, this.f34136h, typeParameterProtos);
    }

    public final C3652n c() {
        return this.f34129a;
    }

    public final InterfaceC0398s d() {
        return this.f34135g;
    }

    public final InterfaceC1288m e() {
        return this.f34131c;
    }

    public final C3637K f() {
        return this.f34137i;
    }

    public final InterfaceC2710c g() {
        return this.f34130b;
    }

    public final B8.n h() {
        return this.f34129a.u();
    }

    public final X i() {
        return this.f34136h;
    }

    public final h8.g j() {
        return this.f34132d;
    }

    public final h8.h k() {
        return this.f34133e;
    }
}
