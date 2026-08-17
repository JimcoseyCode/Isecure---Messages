package X7;

import L7.H;
import L7.k0;
import U7.A;
import U7.C1476d;
import U7.D;
import U7.InterfaceC1492u;
import U7.InterfaceC1493v;
import a8.InterfaceC1600b;
import c8.C1902e0;
import d8.C2366n;
import d8.InterfaceC2346D;
import d8.InterfaceC2374v;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t8.InterfaceC3383f;
import u8.InterfaceC3407a;
import y8.InterfaceC3660w;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.n f12507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1492u f12508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2374v f12509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2366n f12510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V7.o f12511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3660w f12512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V7.j f12513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V7.i f12514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3407a f12515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC1600b f12516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n f12517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC2346D f12518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k0 f12519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final T7.c f12520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final H f12521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final I7.n f12522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1476d f12523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1902e0 f12524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1493v f12525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final e f12526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final D8.p f12527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final D f12528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final A f12529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final InterfaceC3383f f12530x;

    public d(B8.n storageManager, InterfaceC1492u finder, InterfaceC2374v kotlinClassFinder, C2366n deserializedDescriptorResolver, V7.o signaturePropagator, InterfaceC3660w errorReporter, V7.j javaResolverCache, V7.i javaPropertyInitializerEvaluator, InterfaceC3407a samConversionResolver, InterfaceC1600b sourceElementFactory, n moduleClassResolver, InterfaceC2346D packagePartProvider, k0 supertypeLoopChecker, T7.c lookupTracker, H module, I7.n reflectionTypes, C1476d annotationTypeQualifierResolver, C1902e0 signatureEnhancement, InterfaceC1493v javaClassesTracker, e settings, D8.p kotlinTypeChecker, D javaTypeEnhancementState, A javaModuleResolver, InterfaceC3383f syntheticPartsProvider) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(finder, "finder");
        AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
        AbstractC2855l.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC2855l.g(signaturePropagator, "signaturePropagator");
        AbstractC2855l.g(errorReporter, "errorReporter");
        AbstractC2855l.g(javaResolverCache, "javaResolverCache");
        AbstractC2855l.g(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        AbstractC2855l.g(samConversionResolver, "samConversionResolver");
        AbstractC2855l.g(sourceElementFactory, "sourceElementFactory");
        AbstractC2855l.g(moduleClassResolver, "moduleClassResolver");
        AbstractC2855l.g(packagePartProvider, "packagePartProvider");
        AbstractC2855l.g(supertypeLoopChecker, "supertypeLoopChecker");
        AbstractC2855l.g(lookupTracker, "lookupTracker");
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(reflectionTypes, "reflectionTypes");
        AbstractC2855l.g(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        AbstractC2855l.g(signatureEnhancement, "signatureEnhancement");
        AbstractC2855l.g(javaClassesTracker, "javaClassesTracker");
        AbstractC2855l.g(settings, "settings");
        AbstractC2855l.g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC2855l.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        AbstractC2855l.g(javaModuleResolver, "javaModuleResolver");
        AbstractC2855l.g(syntheticPartsProvider, "syntheticPartsProvider");
        this.f12507a = storageManager;
        this.f12508b = finder;
        this.f12509c = kotlinClassFinder;
        this.f12510d = deserializedDescriptorResolver;
        this.f12511e = signaturePropagator;
        this.f12512f = errorReporter;
        this.f12513g = javaResolverCache;
        this.f12514h = javaPropertyInitializerEvaluator;
        this.f12515i = samConversionResolver;
        this.f12516j = sourceElementFactory;
        this.f12517k = moduleClassResolver;
        this.f12518l = packagePartProvider;
        this.f12519m = supertypeLoopChecker;
        this.f12520n = lookupTracker;
        this.f12521o = module;
        this.f12522p = reflectionTypes;
        this.f12523q = annotationTypeQualifierResolver;
        this.f12524r = signatureEnhancement;
        this.f12525s = javaClassesTracker;
        this.f12526t = settings;
        this.f12527u = kotlinTypeChecker;
        this.f12528v = javaTypeEnhancementState;
        this.f12529w = javaModuleResolver;
        this.f12530x = syntheticPartsProvider;
    }

    public final C1476d a() {
        return this.f12523q;
    }

    public final C2366n b() {
        return this.f12510d;
    }

    public final InterfaceC3660w c() {
        return this.f12512f;
    }

    public final InterfaceC1492u d() {
        return this.f12508b;
    }

    public final InterfaceC1493v e() {
        return this.f12525s;
    }

    public final A f() {
        return this.f12529w;
    }

    public final V7.i g() {
        return this.f12514h;
    }

    public final V7.j h() {
        return this.f12513g;
    }

    public final D i() {
        return this.f12528v;
    }

    public final InterfaceC2374v j() {
        return this.f12509c;
    }

    public final D8.p k() {
        return this.f12527u;
    }

    public final T7.c l() {
        return this.f12520n;
    }

    public final H m() {
        return this.f12521o;
    }

    public final n n() {
        return this.f12517k;
    }

    public final InterfaceC2346D o() {
        return this.f12518l;
    }

    public final I7.n p() {
        return this.f12522p;
    }

    public final e q() {
        return this.f12526t;
    }

    public final C1902e0 r() {
        return this.f12524r;
    }

    public final V7.o s() {
        return this.f12511e;
    }

    public final InterfaceC1600b t() {
        return this.f12516j;
    }

    public final B8.n u() {
        return this.f12507a;
    }

    public final k0 v() {
        return this.f12519m;
    }

    public final InterfaceC3383f w() {
        return this.f12530x;
    }

    public final d x(V7.j javaResolverCache) {
        AbstractC2855l.g(javaResolverCache, "javaResolverCache");
        return new d(this.f12507a, this.f12508b, this.f12509c, this.f12510d, this.f12511e, this.f12512f, javaResolverCache, this.f12514h, this.f12515i, this.f12516j, this.f12517k, this.f12518l, this.f12519m, this.f12520n, this.f12521o, this.f12522p, this.f12523q, this.f12524r, this.f12525s, this.f12526t, this.f12527u, this.f12528v, this.f12529w, null, 8388608, null);
    }

    public /* synthetic */ d(B8.n nVar, InterfaceC1492u interfaceC1492u, InterfaceC2374v interfaceC2374v, C2366n c2366n, V7.o oVar, InterfaceC3660w interfaceC3660w, V7.j jVar, V7.i iVar, InterfaceC3407a interfaceC3407a, InterfaceC1600b interfaceC1600b, n nVar2, InterfaceC2346D interfaceC2346D, k0 k0Var, T7.c cVar, H h10, I7.n nVar3, C1476d c1476d, C1902e0 c1902e0, InterfaceC1493v interfaceC1493v, e eVar, D8.p pVar, D d10, A a10, InterfaceC3383f interfaceC3383f, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, interfaceC1492u, interfaceC2374v, c2366n, oVar, interfaceC3660w, jVar, iVar, interfaceC3407a, interfaceC1600b, nVar2, interfaceC2346D, k0Var, cVar, h10, nVar3, c1476d, c1902e0, interfaceC1493v, eVar, pVar, d10, a10, (i10 & 8388608) != 0 ? InterfaceC3383f.f32547a.a() : interfaceC3383f);
    }
}
