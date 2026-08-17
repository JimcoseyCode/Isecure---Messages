package E8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f1121h = new b("ERROR_CLASS", 0, "<Error class: %s>");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f1122i = new b("ERROR_FUNCTION", 1, "<Error function>");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f1123j = new b("ERROR_SCOPE", 2, "<Error scope>");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f1124k = new b("ERROR_MODULE", 3, "<Error module>");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f1125l = new b("ERROR_PROPERTY", 4, "<Error property>");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f1126m = new b("ERROR_TYPE", 5, "[Error type: %s]");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f1127n = new b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ b[] f1128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1129p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1130g;

    static {
        b[] bVarArrH = h();
        f1128o = bVarArrH;
        f1129p = AbstractC3083a.a(bVarArrH);
    }

    private b(String str, int i10, String str2) {
        this.f1130g = str2;
    }

    private static final /* synthetic */ b[] h() {
        return new b[]{f1121h, f1122i, f1123j, f1124k, f1125l, f1126m, f1127n};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1128o.clone();
    }

    public final String j() {
        return this.f1130g;
    }
}
