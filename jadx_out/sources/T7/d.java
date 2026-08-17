package T7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ d[] f10624D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10625E;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f10626g = new d("FROM_IDE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f10627h = new d("FROM_BACKEND", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f10628i = new d("FROM_TEST", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f10629j = new d("FROM_BUILTINS", 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f10630k = new d("WHEN_CHECK_DECLARATION_CONFLICTS", 4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f10631l = new d("WHEN_CHECK_OVERRIDES", 5);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f10632m = new d("FOR_SCRIPT", 6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f10633n = new d("FROM_REFLECTION", 7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f10634o = new d("WHEN_RESOLVE_DECLARATION", 8);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f10635p = new d("WHEN_GET_DECLARATION_SCOPE", 9);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f10636q = new d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f10637r = new d("FOR_ALREADY_TRACKED", 11);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f10638s = new d("WHEN_GET_ALL_DESCRIPTORS", 12);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f10639t = new d("WHEN_TYPING", 13);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f10640u = new d("WHEN_GET_SUPER_MEMBERS", 14);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f10641v = new d("FOR_NON_TRACKED_SCOPE", 15);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f10642w = new d("FROM_SYNTHETIC_SCOPE", 16);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f10643x = new d("FROM_DESERIALIZATION", 17);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f10644y = new d("FROM_JAVA_LOADER", 18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f10645z = new d("WHEN_GET_LOCAL_VARIABLE", 19);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final d f10621A = new d("WHEN_FIND_BY_FQNAME", 20);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final d f10622B = new d("WHEN_GET_COMPANION_OBJECT", 21);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final d f10623C = new d("FOR_DEFAULT_IMPORTS", 22);

    static {
        d[] dVarArrJ = j();
        f10624D = dVarArrJ;
        f10625E = AbstractC3083a.a(dVarArrJ);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] j() {
        return new d[]{f10626g, f10627h, f10628i, f10629j, f10630k, f10631l, f10632m, f10633n, f10634o, f10635p, f10636q, f10637r, f10638s, f10639t, f10640u, f10641v, f10642w, f10643x, f10644y, f10645z, f10621A, f10622B, f10623C};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f10624D.clone();
    }

    @Override // T7.b
    public a h() {
        return null;
    }
}
