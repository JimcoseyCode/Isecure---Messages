package M7;

import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f7625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap f7627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f7629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set f7631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List f7633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f7635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final List f7637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final List f7639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List f7641q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final /* synthetic */ r[] f7642q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List f7643r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7644r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final List f7645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f7646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List f7647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List f7648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f7649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List f7650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Map f7651y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7654h;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final r f7652z = new r("CLASS", 0, "class", false, 2, null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final r f7591A = new r("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final r f7592B = new r("TYPE_PARAMETER", 2, "type parameter", false);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final r f7593C = new r("PROPERTY", 3, "property", false, 2, null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final r f7594D = new r("FIELD", 4, "field", false, 2, null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final r f7595E = new r("LOCAL_VARIABLE", 5, "local variable", false, 2, null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final r f7596F = new r("VALUE_PARAMETER", 6, "value parameter", false, 2, null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final r f7597G = new r("CONSTRUCTOR", 7, "constructor", false, 2, null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final r f7598H = new r("FUNCTION", 8, "function", false, 2, null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final r f7599I = new r("PROPERTY_GETTER", 9, "getter", false, 2, null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final r f7600J = new r("PROPERTY_SETTER", 10, "setter", false, 2, null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final r f7601K = new r("TYPE", 11, "type usage", false);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final r f7602L = new r("EXPRESSION", 12, "expression", false);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final r f7603M = new r("FILE", 13, "file", false);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final r f7604N = new r("TYPEALIAS", 14, "typealias", false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final r f7605O = new r("TYPE_PROJECTION", 15, "type projection", false);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final r f7606P = new r("STAR_PROJECTION", 16, "star projection", false);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final r f7607Q = new r("PROPERTY_PARAMETER", 17, "property constructor parameter", false);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final r f7608R = new r("CLASS_ONLY", 18, "class", false);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final r f7609S = new r("OBJECT", 19, "object", false);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final r f7610T = new r("STANDALONE_OBJECT", 20, "standalone object", false);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final r f7611U = new r("COMPANION_OBJECT", 21, "companion object", false);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final r f7612V = new r("INTERFACE", 22, "interface", false);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final r f7613W = new r("ENUM_CLASS", 23, "enum class", false);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final r f7614X = new r("ENUM_ENTRY", 24, "enum entry", false);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final r f7615Y = new r("LOCAL_CLASS", 25, "local class", false);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final r f7616Z = new r("LOCAL_FUNCTION", 26, "local function", false);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final r f7617a0 = new r("MEMBER_FUNCTION", 27, "member function", false);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final r f7618b0 = new r("TOP_LEVEL_FUNCTION", 28, "top level function", false);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final r f7619c0 = new r("MEMBER_PROPERTY", 29, "member property", false);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final r f7620d0 = new r("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final r f7621e0 = new r("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final r f7622f0 = new r("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final r f7623g0 = new r("TOP_LEVEL_PROPERTY", 33, "top level property", false);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final r f7624h0 = new r("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final r f7626i0 = new r("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final r f7628j0 = new r("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final r f7630k0 = new r("BACKING_FIELD", 37, "backing field", false, 2, null);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final r f7632l0 = new r("INITIALIZER", 38, "initializer", false);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final r f7634m0 = new r("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final r f7636n0 = new r("LAMBDA_EXPRESSION", 40, "lambda expression", false);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final r f7638o0 = new r("ANONYMOUS_FUNCTION", 41, "anonymous function", false);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r f7640p0 = new r("OBJECT_LITERAL", 42, "object literal", false);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r[] rVarArrH = h();
        f7642q0 = rVarArrH;
        f7644r0 = AbstractC3083a.a(rVarArrH);
        f7625i = new a(null);
        f7627j = new HashMap();
        for (r rVar : j()) {
            f7627j.put(rVar.name(), rVar);
        }
        EnumEntries enumEntriesJ = j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumEntriesJ) {
            if (((r) obj).f7654h) {
                arrayList.add(obj);
            }
        }
        f7629k = AbstractC2800q.T0(arrayList);
        f7631l = AbstractC2800q.T0(j());
        r rVar2 = f7591A;
        r rVar3 = f7652z;
        f7633m = AbstractC2800q.m(rVar2, rVar3);
        f7635n = AbstractC2800q.m(f7615Y, rVar3);
        f7637o = AbstractC2800q.m(f7608R, rVar3);
        r rVar4 = f7611U;
        r rVar5 = f7609S;
        f7639p = AbstractC2800q.m(rVar4, rVar5, rVar3);
        f7641q = AbstractC2800q.m(f7610T, rVar5, rVar3);
        f7643r = AbstractC2800q.m(f7612V, rVar3);
        f7645s = AbstractC2800q.m(f7613W, rVar3);
        r rVar6 = f7614X;
        r rVar7 = f7593C;
        r rVar8 = f7594D;
        f7646t = AbstractC2800q.m(rVar6, rVar7, rVar8);
        r rVar9 = f7600J;
        f7647u = AbstractC2800q.e(rVar9);
        r rVar10 = f7599I;
        f7648v = AbstractC2800q.e(rVar10);
        f7649w = AbstractC2800q.e(f7598H);
        r rVar11 = f7603M;
        f7650x = AbstractC2800q.e(rVar11);
        e eVar = e.f7558n;
        r rVar12 = f7596F;
        f7651y = K.l(t.a(eVar, rVar12), t.a(e.f7552h, rVar8), t.a(e.f7554j, rVar7), t.a(e.f7553i, rVar11), t.a(e.f7555k, rVar10), t.a(e.f7556l, rVar9), t.a(e.f7557m, rVar12), t.a(e.f7559o, rVar12), t.a(e.f7560p, rVar8));
    }

    private r(String str, int i10, String str2, boolean z10) {
        this.f7653g = str2;
        this.f7654h = z10;
    }

    private static final /* synthetic */ r[] h() {
        return new r[]{f7652z, f7591A, f7592B, f7593C, f7594D, f7595E, f7596F, f7597G, f7598H, f7599I, f7600J, f7601K, f7602L, f7603M, f7604N, f7605O, f7606P, f7607Q, f7608R, f7609S, f7610T, f7611U, f7612V, f7613W, f7614X, f7615Y, f7616Z, f7617a0, f7618b0, f7619c0, f7620d0, f7621e0, f7622f0, f7623g0, f7624h0, f7626i0, f7628j0, f7630k0, f7632l0, f7634m0, f7636n0, f7638o0, f7640p0};
    }

    public static EnumEntries j() {
        return f7644r0;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f7642q0.clone();
    }

    /* synthetic */ r(String str, int i10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? true : z10);
    }
}
