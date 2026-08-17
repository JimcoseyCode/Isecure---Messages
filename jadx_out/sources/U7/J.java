package U7;

import I7.o;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k8.c f11419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k8.c f11420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k8.c f11421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k8.c f11422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k8.c f11423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k8.c f11424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k8.c f11425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k8.c f11426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final k8.c f11427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final k8.c f11428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final k8.c f11429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final k8.c f11430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final k8.c f11431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final k8.c f11432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final k8.c f11433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final k8.c f11434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Set f11435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set f11436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set f11437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f11438t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Set f11439u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Set f11440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Set f11441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f11442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final k8.c f11443y;

    static {
        k8.c cVar = new k8.c("org.jspecify.nullness.Nullable");
        f11419a = cVar;
        k8.c cVar2 = new k8.c("org.jspecify.nullness.NullMarked");
        f11420b = cVar2;
        k8.c cVar3 = new k8.c("org.jspecify.nullness.NullnessUnspecified");
        f11421c = cVar3;
        k8.c cVar4 = new k8.c("org.jspecify.annotations.NonNull");
        f11422d = cVar4;
        k8.c cVar5 = new k8.c("org.jspecify.annotations.Nullable");
        f11423e = cVar5;
        k8.c cVar6 = new k8.c("org.jspecify.annotations.NullMarked");
        f11424f = cVar6;
        k8.c cVar7 = new k8.c("org.jspecify.annotations.NullnessUnspecified");
        f11425g = cVar7;
        k8.c cVar8 = new k8.c("org.jspecify.annotations.NullUnmarked");
        f11426h = cVar8;
        f11427i = new k8.c("javax.annotation.meta.TypeQualifier");
        f11428j = new k8.c("javax.annotation.meta.TypeQualifierNickname");
        f11429k = new k8.c("javax.annotation.meta.TypeQualifierDefault");
        k8.c cVar9 = new k8.c("javax.annotation.Nonnull");
        f11430l = cVar9;
        k8.c cVar10 = new k8.c("javax.annotation.Nullable");
        f11431m = cVar10;
        k8.c cVar11 = new k8.c("javax.annotation.CheckForNull");
        f11432n = cVar11;
        f11433o = new k8.c("javax.annotation.ParametersAreNonnullByDefault");
        f11434p = new k8.c("javax.annotation.ParametersAreNullableByDefault");
        f11435q = j7.T.h(cVar9, cVar11);
        Set setH = j7.T.h(I.f11407l, cVar4, new k8.c("android.annotation.NonNull"), new k8.c("androidx.annotation.NonNull"), new k8.c("androidx.annotation.RecentlyNonNull"), new k8.c("android.support.annotation.NonNull"), new k8.c("com.android.annotations.NonNull"), new k8.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new k8.c("org.checkerframework.checker.nullness.qual.NonNull"), new k8.c("edu.umd.cs.findbugs.annotations.NonNull"), new k8.c("io.reactivex.annotations.NonNull"), new k8.c("io.reactivex.rxjava3.annotations.NonNull"), new k8.c("org.eclipse.jdt.annotation.NonNull"), new k8.c("lombok.NonNull"));
        f11436r = setH;
        Set setH2 = j7.T.h(I.f11408m, cVar, cVar5, cVar10, cVar11, new k8.c("android.annotation.Nullable"), new k8.c("androidx.annotation.Nullable"), new k8.c("androidx.annotation.RecentlyNullable"), new k8.c("android.support.annotation.Nullable"), new k8.c("com.android.annotations.Nullable"), new k8.c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new k8.c("org.checkerframework.checker.nullness.qual.Nullable"), new k8.c("edu.umd.cs.findbugs.annotations.Nullable"), new k8.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new k8.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new k8.c("io.reactivex.annotations.Nullable"), new k8.c("io.reactivex.rxjava3.annotations.Nullable"), new k8.c("org.eclipse.jdt.annotation.Nullable"));
        f11437s = setH2;
        f11438t = j7.T.h(cVar3, cVar7);
        f11439u = j7.T.l(j7.T.l(j7.T.l(j7.T.l(j7.T.k(j7.T.k(new LinkedHashSet(), setH), setH2), cVar9), cVar2), cVar6), cVar8);
        f11440v = j7.T.h(I.f11410o, I.f11411p);
        f11441w = j7.T.h(I.f11409n, I.f11412q);
        f11442x = j7.K.l(i7.t.a(I.f11399d, o.a.f5156H), i7.t.a(I.f11401f, o.a.f5164L), i7.t.a(I.f11403h, o.a.f5231y), i7.t.a(I.f11404i, o.a.f5172P));
        f11443y = new k8.c("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set a() {
        return f11435q;
    }

    public static final Set b() {
        return f11438t;
    }

    public static final k8.c c() {
        return f11430l;
    }

    public static final k8.c d() {
        return f11433o;
    }

    public static final k8.c e() {
        return f11434p;
    }

    public static final k8.c f() {
        return f11427i;
    }

    public static final k8.c g() {
        return f11429k;
    }

    public static final k8.c h() {
        return f11428j;
    }

    public static final k8.c i() {
        return f11424f;
    }

    public static final k8.c j() {
        return f11426h;
    }

    public static final k8.c k() {
        return f11420b;
    }

    public static final Set l() {
        return f11441w;
    }

    public static final Set m() {
        return f11436r;
    }

    public static final Set n() {
        return f11437s;
    }

    public static final Set o() {
        return f11440v;
    }

    public static final k8.c p() {
        return f11443y;
    }
}
