package M7;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f7552h = new e("FIELD", 0, null, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f7553i = new e("FILE", 1, null, 1, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f7554j = new e("PROPERTY", 2, null, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f7555k = new e("PROPERTY_GETTER", 3, "get");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f7556l = new e("PROPERTY_SETTER", 4, "set");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f7557m = new e("RECEIVER", 5, 0 == true ? 1 : 0, 1, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f7558n = new e("CONSTRUCTOR_PARAMETER", 6, "param");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f7559o = new e("SETTER_PARAMETER", 7, "setparam");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f7560p = new e("PROPERTY_DELEGATE_FIELD", 8, "delegate");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ e[] f7561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7562r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7563g;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        e[] eVarArrH = h();
        f7561q = eVarArrH;
        f7562r = AbstractC3083a.a(eVarArrH);
    }

    private e(String str, int i10, String str2) {
        this.f7563g = str2 == null ? K8.a.f(name()) : str2;
    }

    private static final /* synthetic */ e[] h() {
        return new e[]{f7552h, f7553i, f7554j, f7555k, f7556l, f7557m, f7558n, f7559o, f7560p};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f7561q.clone();
    }

    public final String j() {
        return this.f7563g;
    }

    /* synthetic */ e(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
