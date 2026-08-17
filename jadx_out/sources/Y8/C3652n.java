package y8;

import A8.InterfaceC0398s;
import C8.C0437x;
import L7.InterfaceC1280e;
import N7.a;
import N7.c;
import h8.AbstractC2708a;
import h8.InterfaceC2710c;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C2948g;
import u8.InterfaceC3407a;
import y8.InterfaceC3659v;

/* JADX INFO: renamed from: y8.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3652n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.n f34107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L7.H f34108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3653o f34109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3648j f34110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3643e f34111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L7.O f34112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3628B f34113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3660w f34114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final T7.c f34115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3661x f34116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Iterable f34117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final L7.M f34118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC3651m f34119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final N7.a f34120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final N7.c f34121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C2948g f34122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final D8.p f34123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC3407a f34124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f34125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC3659v f34126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C3650l f34127u;

    public C3652n(B8.n storageManager, L7.H moduleDescriptor, InterfaceC3653o configuration, InterfaceC3648j classDataFinder, InterfaceC3643e annotationAndConstantLoader, L7.O packageFragmentProvider, InterfaceC3628B localClassifierTypeSettings, InterfaceC3660w errorReporter, T7.c lookupTracker, InterfaceC3661x flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, L7.M notFoundClasses, InterfaceC3651m contractDeserializer, N7.a additionalClassPartsProvider, N7.c platformDependentDeclarationFilter, C2948g extensionRegistryLite, D8.p kotlinTypeChecker, InterfaceC3407a samConversionResolver, List typeAttributeTranslators, InterfaceC3659v enumEntriesDeserializationSupport) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        AbstractC2855l.g(configuration, "configuration");
        AbstractC2855l.g(classDataFinder, "classDataFinder");
        AbstractC2855l.g(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC2855l.g(packageFragmentProvider, "packageFragmentProvider");
        AbstractC2855l.g(localClassifierTypeSettings, "localClassifierTypeSettings");
        AbstractC2855l.g(errorReporter, "errorReporter");
        AbstractC2855l.g(lookupTracker, "lookupTracker");
        AbstractC2855l.g(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        AbstractC2855l.g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(contractDeserializer, "contractDeserializer");
        AbstractC2855l.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC2855l.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC2855l.g(extensionRegistryLite, "extensionRegistryLite");
        AbstractC2855l.g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC2855l.g(samConversionResolver, "samConversionResolver");
        AbstractC2855l.g(typeAttributeTranslators, "typeAttributeTranslators");
        AbstractC2855l.g(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f34107a = storageManager;
        this.f34108b = moduleDescriptor;
        this.f34109c = configuration;
        this.f34110d = classDataFinder;
        this.f34111e = annotationAndConstantLoader;
        this.f34112f = packageFragmentProvider;
        this.f34113g = localClassifierTypeSettings;
        this.f34114h = errorReporter;
        this.f34115i = lookupTracker;
        this.f34116j = flexibleTypeDeserializer;
        this.f34117k = fictitiousClassDescriptorFactories;
        this.f34118l = notFoundClasses;
        this.f34119m = contractDeserializer;
        this.f34120n = additionalClassPartsProvider;
        this.f34121o = platformDependentDeclarationFilter;
        this.f34122p = extensionRegistryLite;
        this.f34123q = kotlinTypeChecker;
        this.f34124r = samConversionResolver;
        this.f34125s = typeAttributeTranslators;
        this.f34126t = enumEntriesDeserializationSupport;
        this.f34127u = new C3650l(this);
    }

    public final C3654p a(L7.N descriptor, InterfaceC2710c nameResolver, h8.g typeTable, h8.h versionRequirementTable, AbstractC2708a metadataVersion, InterfaceC0398s interfaceC0398s) {
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(versionRequirementTable, "versionRequirementTable");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        return new C3654p(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, interfaceC0398s, null, AbstractC2800q.j());
    }

    public final InterfaceC1280e b(k8.b classId) {
        AbstractC2855l.g(classId, "classId");
        return C3650l.f(this.f34127u, classId, null, 2, null);
    }

    public final N7.a c() {
        return this.f34120n;
    }

    public final InterfaceC3643e d() {
        return this.f34111e;
    }

    public final InterfaceC3648j e() {
        return this.f34110d;
    }

    public final C3650l f() {
        return this.f34127u;
    }

    public final InterfaceC3653o g() {
        return this.f34109c;
    }

    public final InterfaceC3651m h() {
        return this.f34119m;
    }

    public final InterfaceC3659v i() {
        return this.f34126t;
    }

    public final InterfaceC3660w j() {
        return this.f34114h;
    }

    public final C2948g k() {
        return this.f34122p;
    }

    public final Iterable l() {
        return this.f34117k;
    }

    public final InterfaceC3661x m() {
        return this.f34116j;
    }

    public final D8.p n() {
        return this.f34123q;
    }

    public final InterfaceC3628B o() {
        return this.f34113g;
    }

    public final T7.c p() {
        return this.f34115i;
    }

    public final L7.H q() {
        return this.f34108b;
    }

    public final L7.M r() {
        return this.f34118l;
    }

    public final L7.O s() {
        return this.f34112f;
    }

    public final N7.c t() {
        return this.f34121o;
    }

    public final B8.n u() {
        return this.f34107a;
    }

    public final List v() {
        return this.f34125s;
    }

    public /* synthetic */ C3652n(B8.n nVar, L7.H h10, InterfaceC3653o interfaceC3653o, InterfaceC3648j interfaceC3648j, InterfaceC3643e interfaceC3643e, L7.O o10, InterfaceC3628B interfaceC3628B, InterfaceC3660w interfaceC3660w, T7.c cVar, InterfaceC3661x interfaceC3661x, Iterable iterable, L7.M m10, InterfaceC3651m interfaceC3651m, N7.a aVar, N7.c cVar2, C2948g c2948g, D8.p pVar, InterfaceC3407a interfaceC3407a, List list, InterfaceC3659v interfaceC3659v, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h10, interfaceC3653o, interfaceC3648j, interfaceC3643e, o10, interfaceC3628B, interfaceC3660w, cVar, interfaceC3661x, iterable, m10, interfaceC3651m, (i10 & 8192) != 0 ? a.C0085a.f8152a : aVar, (i10 & 16384) != 0 ? c.a.f8153a : cVar2, c2948g, (65536 & i10) != 0 ? D8.p.f839b.a() : pVar, interfaceC3407a, (262144 & i10) != 0 ? AbstractC2800q.e(C0437x.f713a) : list, (i10 & 524288) != 0 ? InterfaceC3659v.a.f34148a : interfaceC3659v);
    }
}
