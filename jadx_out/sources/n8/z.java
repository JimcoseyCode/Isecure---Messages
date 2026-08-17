package n8;

import C8.S;
import L7.t0;
import j7.T;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import n8.InterfaceC2987b;
import n8.n;
import n8.w;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements w {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f30163Z = {kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "withDefinedIn", "getWithDefinedIn()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "modifiers", "getModifiers()Ljava/util/Set;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "startFromName", "getStartFromName()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "debugMode", "getDebugMode()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "verbose", "getVerbose()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "unitReturnType", "getUnitReturnType()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "withoutReturnType", "getWithoutReturnType()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "enhancedTypes", "getEnhancedTypes()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderDefaultModality", "getRenderDefaultModality()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "receiverAfterName", "getReceiverAfterName()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), kotlin.jvm.internal.D.e(new kotlin.jvm.internal.p(kotlin.jvm.internal.D.b(z.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final kotlin.properties.d f30164A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final kotlin.properties.d f30165B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final kotlin.properties.d f30166C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final kotlin.properties.d f30167D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final kotlin.properties.d f30168E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final kotlin.properties.d f30169F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final kotlin.properties.d f30170G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final kotlin.properties.d f30171H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final kotlin.properties.d f30172I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final kotlin.properties.d f30173J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final kotlin.properties.d f30174K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final kotlin.properties.d f30175L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final kotlin.properties.d f30176M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final kotlin.properties.d f30177N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final kotlin.properties.d f30178O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final kotlin.properties.d f30179P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final kotlin.properties.d f30180Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final kotlin.properties.d f30181R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final kotlin.properties.d f30182S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final kotlin.properties.d f30183T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final kotlin.properties.d f30184U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final kotlin.properties.d f30185V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final kotlin.properties.d f30186W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final kotlin.properties.d f30187X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final kotlin.properties.d f30188Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlin.properties.d f30190b = r0(InterfaceC2987b.c.f30103a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.properties.d f30191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlin.properties.d f30192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kotlin.properties.d f30193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kotlin.properties.d f30194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlin.properties.d f30195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kotlin.properties.d f30196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kotlin.properties.d f30197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kotlin.properties.d f30198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kotlin.properties.d f30199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final kotlin.properties.d f30200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final kotlin.properties.d f30201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kotlin.properties.d f30202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final kotlin.properties.d f30203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final kotlin.properties.d f30204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final kotlin.properties.d f30205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final kotlin.properties.d f30206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final kotlin.properties.d f30207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final kotlin.properties.d f30208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final kotlin.properties.d f30209u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final kotlin.properties.d f30210v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final kotlin.properties.d f30211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final kotlin.properties.d f30212x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final kotlin.properties.d f30213y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final kotlin.properties.d f30214z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f30215a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, z zVar) {
            super(obj);
            this.f30215a = zVar;
        }

        @Override // kotlin.properties.b
        protected boolean beforeChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            if (this.f30215a.p0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.f30191c = r0(bool);
        this.f30192d = r0(bool);
        this.f30193e = r0(v.f30142i);
        Boolean bool2 = Boolean.FALSE;
        this.f30194f = r0(bool2);
        this.f30195g = r0(bool2);
        this.f30196h = r0(bool2);
        this.f30197i = r0(bool2);
        this.f30198j = r0(bool2);
        this.f30199k = r0(bool);
        this.f30200l = r0(bool2);
        this.f30201m = r0(bool2);
        this.f30202n = r0(bool2);
        this.f30203o = r0(bool);
        this.f30204p = r0(bool);
        this.f30205q = r0(bool2);
        this.f30206r = r0(bool2);
        this.f30207s = r0(bool2);
        this.f30208t = r0(bool2);
        this.f30209u = r0(bool2);
        this.f30210v = r0(null);
        this.f30211w = r0(bool2);
        this.f30212x = r0(bool2);
        this.f30213y = r0(x.f30161g);
        this.f30214z = r0(y.f30162g);
        this.f30164A = r0(bool);
        this.f30165B = r0(C.f30076h);
        this.f30166C = r0(n.b.a.f30128a);
        this.f30167D = r0(F.f30090g);
        this.f30168E = r0(D.f30080g);
        this.f30169F = r0(bool2);
        this.f30170G = r0(bool2);
        this.f30171H = r0(E.f30086h);
        this.f30172I = r0(bool2);
        this.f30173J = r0(bool2);
        this.f30174K = r0(T.e());
        this.f30175L = r0(C2985A.f30072a.a());
        this.f30176M = r0(null);
        this.f30177N = r0(EnumC2986a.f30094i);
        this.f30178O = r0(bool2);
        this.f30179P = r0(bool);
        this.f30180Q = r0(bool);
        this.f30181R = r0(bool2);
        this.f30182S = r0(bool2);
        this.f30183T = r0(bool);
        this.f30184U = r0(bool);
        this.f30185V = r0(bool2);
        this.f30186W = r0(bool2);
        this.f30187X = r0(bool2);
        this.f30188Y = r0(bool);
    }

    private final kotlin.properties.d r0(Object obj) {
        kotlin.properties.a aVar = kotlin.properties.a.f29400a;
        return new a(obj, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S s0(S it) {
        AbstractC2855l.g(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(t0 it) {
        AbstractC2855l.g(it, "it");
        return "...";
    }

    public boolean A() {
        return ((Boolean) this.f30197i.getValue(this, f30163Z[7])).booleanValue();
    }

    public InterfaceC2987b B() {
        return (InterfaceC2987b) this.f30190b.getValue(this, f30163Z[0]);
    }

    public Function1 C() {
        return (Function1) this.f30214z.getValue(this, f30163Z[24]);
    }

    public boolean D() {
        return ((Boolean) this.f30173J.getValue(this, f30163Z[34])).booleanValue();
    }

    public Set E() {
        return (Set) this.f30174K.getValue(this, f30163Z[35]);
    }

    public boolean F() {
        return ((Boolean) this.f30183T.getValue(this, f30163Z[44])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.f30209u.getValue(this, f30163Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f30188Y.getValue(this, f30163Z[49])).booleanValue();
    }

    public Set I() {
        return (Set) this.f30193e.getValue(this, f30163Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f30202n.getValue(this, f30163Z[12])).booleanValue();
    }

    public C K() {
        return (C) this.f30165B.getValue(this, f30163Z[26]);
    }

    public D L() {
        return (D) this.f30168E.getValue(this, f30163Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.f30184U.getValue(this, f30163Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.f30186W.getValue(this, f30163Z[47])).booleanValue();
    }

    public E O() {
        return (E) this.f30171H.getValue(this, f30163Z[32]);
    }

    public Function1 P() {
        return (Function1) this.f30210v.getValue(this, f30163Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.f30169F.getValue(this, f30163Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f30182S.getValue(this, f30163Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f30170G.getValue(this, f30163Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f30205q.getValue(this, f30163Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f30179P.getValue(this, f30163Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f30172I.getValue(this, f30163Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f30204p.getValue(this, f30163Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f30203o.getValue(this, f30163Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f30206r.getValue(this, f30163Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f30181R.getValue(this, f30163Z[42])).booleanValue();
    }

    @Override // n8.w
    public void a(Set set) {
        AbstractC2855l.g(set, "<set-?>");
        this.f30175L.setValue(this, f30163Z[36], set);
    }

    public boolean a0() {
        return ((Boolean) this.f30180Q.getValue(this, f30163Z[41])).booleanValue();
    }

    @Override // n8.w
    public boolean b() {
        return w.a.b(this);
    }

    public boolean b0() {
        return ((Boolean) this.f30164A.getValue(this, f30163Z[25])).booleanValue();
    }

    @Override // n8.w
    public void c(boolean z10) {
        this.f30194f.setValue(this, f30163Z[4], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f30195g.getValue(this, f30163Z[5])).booleanValue();
    }

    @Override // n8.w
    public void d(Set set) {
        AbstractC2855l.g(set, "<set-?>");
        this.f30193e.setValue(this, f30163Z[3], set);
    }

    public boolean d0() {
        return ((Boolean) this.f30194f.getValue(this, f30163Z[4])).booleanValue();
    }

    @Override // n8.w
    public void e(D d10) {
        AbstractC2855l.g(d10, "<set-?>");
        this.f30168E.setValue(this, f30163Z[29], d10);
    }

    public F e0() {
        return (F) this.f30167D.getValue(this, f30163Z[28]);
    }

    @Override // n8.w
    public void f(InterfaceC2987b interfaceC2987b) {
        AbstractC2855l.g(interfaceC2987b, "<set-?>");
        this.f30190b.setValue(this, f30163Z[0], interfaceC2987b);
    }

    public Function1 f0() {
        return (Function1) this.f30213y.getValue(this, f30163Z[23]);
    }

    @Override // n8.w
    public void g(boolean z10) {
        this.f30191c.setValue(this, f30163Z[1], Boolean.valueOf(z10));
    }

    public boolean g0() {
        return ((Boolean) this.f30208t.getValue(this, f30163Z[18])).booleanValue();
    }

    @Override // n8.w
    public boolean h() {
        return ((Boolean) this.f30201m.getValue(this, f30163Z[11])).booleanValue();
    }

    public boolean h0() {
        return ((Boolean) this.f30199k.getValue(this, f30163Z[9])).booleanValue();
    }

    @Override // n8.w
    public void i(boolean z10) {
        this.f30212x.setValue(this, f30163Z[22], Boolean.valueOf(z10));
    }

    public n.b i0() {
        return (n.b) this.f30166C.getValue(this, f30163Z[27]);
    }

    @Override // n8.w
    public void j(boolean z10) {
        this.f30196h.setValue(this, f30163Z[6], Boolean.valueOf(z10));
    }

    public boolean j0() {
        return ((Boolean) this.f30198j.getValue(this, f30163Z[8])).booleanValue();
    }

    @Override // n8.w
    public void k(boolean z10) {
        this.f30170G.setValue(this, f30163Z[31], Boolean.valueOf(z10));
    }

    public boolean k0() {
        return ((Boolean) this.f30191c.getValue(this, f30163Z[1])).booleanValue();
    }

    @Override // n8.w
    public void l(boolean z10) {
        this.f30169F.setValue(this, f30163Z[30], Boolean.valueOf(z10));
    }

    public boolean l0() {
        return ((Boolean) this.f30192d.getValue(this, f30163Z[2])).booleanValue();
    }

    @Override // n8.w
    public boolean m() {
        return w.a.a(this);
    }

    public boolean m0() {
        return ((Boolean) this.f30200l.getValue(this, f30163Z[10])).booleanValue();
    }

    @Override // n8.w
    public Set n() {
        return (Set) this.f30175L.getValue(this, f30163Z[36]);
    }

    public boolean n0() {
        return ((Boolean) this.f30212x.getValue(this, f30163Z[22])).booleanValue();
    }

    @Override // n8.w
    public boolean o() {
        return ((Boolean) this.f30196h.getValue(this, f30163Z[6])).booleanValue();
    }

    public boolean o0() {
        return ((Boolean) this.f30211w.getValue(this, f30163Z[21])).booleanValue();
    }

    @Override // n8.w
    public EnumC2986a p() {
        return (EnumC2986a) this.f30177N.getValue(this, f30163Z[38]);
    }

    public final boolean p0() {
        return this.f30189a;
    }

    @Override // n8.w
    public void q(F f10) {
        AbstractC2855l.g(f10, "<set-?>");
        this.f30167D.setValue(this, f30163Z[28], f10);
    }

    public final void q0() {
        this.f30189a = true;
    }

    @Override // n8.w
    public void r(boolean z10) {
        this.f30211w.setValue(this, f30163Z[21], Boolean.valueOf(z10));
    }

    public final z u() {
        z zVar = new z();
        Iterator itA = AbstractC2845b.a(z.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                kotlin.properties.b bVar = obj instanceof kotlin.properties.b ? (kotlin.properties.b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    AbstractC2855l.f(name, "getName(...)");
                    P8.q.K(name, "is", false, 2, null);
                    C7.d dVarB = kotlin.jvm.internal.D.b(z.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    AbstractC2855l.f(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        AbstractC2855l.f(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb.append(name3);
                    field.set(zVar, zVar.r0(bVar.getValue(this, new kotlin.jvm.internal.v(dVarB, name2, sb.toString()))));
                }
            }
        }
        return zVar;
    }

    public boolean w() {
        return ((Boolean) this.f30207s.getValue(this, f30163Z[17])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.f30178O.getValue(this, f30163Z[39])).booleanValue();
    }

    public Function1 y() {
        return (Function1) this.f30176M.getValue(this, f30163Z[37]);
    }

    public boolean z() {
        return ((Boolean) this.f30187X.getValue(this, f30163Z[48])).booleanValue();
    }
}
