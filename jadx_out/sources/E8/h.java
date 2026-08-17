package E8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f1142h = new h("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f1143i = new h("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f1144j = new h("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f1145k = new h("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f1146l = new h("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f1147m = new h("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f1148n = new h("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f1149o = new h("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f1150p = new h("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f1151q = new h("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ h[] f1152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1153s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1154g;

    static {
        h[] hVarArrH = h();
        f1152r = hVarArrH;
        f1153s = AbstractC3083a.a(hVarArrH);
    }

    private h(String str, int i10, String str2) {
        this.f1154g = str2;
    }

    private static final /* synthetic */ h[] h() {
        return new h[]{f1142h, f1143i, f1144j, f1145k, f1146l, f1147m, f1148n, f1149o, f1150p, f1151q};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f1152r.clone();
    }

    public final String j() {
        return this.f1154g;
    }
}
