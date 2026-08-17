package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0433t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f685a = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.d(AbstractC0433t.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kotlin.properties.c f686b;

    static {
        J8.n nVarC = r0.f682h.c(kotlin.jvm.internal.D.b(C0432s.class));
        AbstractC2855l.e(nVarC, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f686b = nVarC;
    }

    public static final M7.h a(r0 r0Var) {
        M7.h hVarE;
        AbstractC2855l.g(r0Var, "<this>");
        C0432s c0432sB = b(r0Var);
        return (c0432sB == null || (hVarE = c0432sB.e()) == null) ? M7.h.f7570a.b() : hVarE;
    }

    public static final C0432s b(r0 r0Var) {
        AbstractC2855l.g(r0Var, "<this>");
        return (C0432s) f686b.getValue(r0Var, f685a[0]);
    }
}
