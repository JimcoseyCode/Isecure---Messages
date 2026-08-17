package U7;

import U7.C;
import i7.C2744g;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k8.c f11365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k8.c f11366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k8.c f11367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k8.c f11368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f11369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k8.c[] f11370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final K f11371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C f11372h;

    static {
        k8.c cVar = new k8.c("org.jspecify.nullness");
        f11365a = cVar;
        k8.c cVar2 = new k8.c("org.jspecify.annotations");
        f11366b = cVar2;
        k8.c cVar3 = new k8.c("io.reactivex.rxjava3.annotations");
        f11367c = cVar3;
        k8.c cVar4 = new k8.c("org.checkerframework.checker.nullness.compatqual");
        f11368d = cVar4;
        String strB = cVar3.b();
        AbstractC2855l.f(strB, "asString(...)");
        f11369e = strB;
        f11370f = new k8.c[]{new k8.c(strB + ".Nullable"), new k8.c(strB + ".NonNull")};
        k8.c cVar5 = new k8.c("org.jetbrains.annotations");
        C.a aVar = C.f11373d;
        Pair pairA = i7.t.a(cVar5, aVar.a());
        Pair pairA2 = i7.t.a(new k8.c("androidx.annotation"), aVar.a());
        Pair pairA3 = i7.t.a(new k8.c("android.support.annotation"), aVar.a());
        Pair pairA4 = i7.t.a(new k8.c("android.annotation"), aVar.a());
        Pair pairA5 = i7.t.a(new k8.c("com.android.annotations"), aVar.a());
        Pair pairA6 = i7.t.a(new k8.c("org.eclipse.jdt.annotation"), aVar.a());
        Pair pairA7 = i7.t.a(new k8.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        Pair pairA8 = i7.t.a(cVar4, aVar.a());
        Pair pairA9 = i7.t.a(new k8.c("javax.annotation"), aVar.a());
        Pair pairA10 = i7.t.a(new k8.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        Pair pairA11 = i7.t.a(new k8.c("io.reactivex.annotations"), aVar.a());
        k8.c cVar6 = new k8.c("androidx.annotation.RecentlyNullable");
        O o10 = O.f11453j;
        Pair pairA12 = i7.t.a(cVar6, new C(o10, null, null, 4, null));
        Pair pairA13 = i7.t.a(new k8.c("androidx.annotation.RecentlyNonNull"), new C(o10, null, null, 4, null));
        Pair pairA14 = i7.t.a(new k8.c("lombok"), aVar.a());
        C2744g c2744g = new C2744g(2, 1);
        O o11 = O.f11454k;
        f11371g = new M(j7.K.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, i7.t.a(cVar, new C(o10, c2744g, o11)), i7.t.a(cVar2, new C(o10, new C2744g(2, 1), o11)), i7.t.a(cVar3, new C(o10, new C2744g(1, 8), o11))));
        f11372h = new C(o10, null, null, 4, null);
    }

    public static final G a(C2744g configuredKotlinVersion) {
        AbstractC2855l.g(configuredKotlinVersion, "configuredKotlinVersion");
        C c10 = f11372h;
        O oC = (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
        return new G(oC, c(oC), null, 4, null);
    }

    public static /* synthetic */ G b(C2744g c2744g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2744g = C2744g.f28709l;
        }
        return a(c2744g);
    }

    public static final O c(O globalReportLevel) {
        AbstractC2855l.g(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == O.f11453j) {
            return null;
        }
        return globalReportLevel;
    }

    public static final O d(k8.c annotationFqName) {
        AbstractC2855l.g(annotationFqName, "annotationFqName");
        return h(annotationFqName, K.f11444a.a(), null, 4, null);
    }

    public static final k8.c e() {
        return f11366b;
    }

    public static final k8.c[] f() {
        return f11370f;
    }

    public static final O g(k8.c annotation, K configuredReportLevels, C2744g configuredKotlinVersion) {
        AbstractC2855l.g(annotation, "annotation");
        AbstractC2855l.g(configuredReportLevels, "configuredReportLevels");
        AbstractC2855l.g(configuredKotlinVersion, "configuredKotlinVersion");
        O o10 = (O) configuredReportLevels.a(annotation);
        if (o10 != null) {
            return o10;
        }
        C c10 = (C) f11371g.a(annotation);
        return c10 == null ? O.f11452i : (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
    }

    public static /* synthetic */ O h(k8.c cVar, K k10, C2744g c2744g, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c2744g = new C2744g(1, 7, 20);
        }
        return g(cVar, k10, c2744g);
    }
}
