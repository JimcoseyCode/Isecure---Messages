package N2;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f8069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final n[] f8070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f8071j = new n("UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f8072k = new n("VISIBLE", 1, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f8073l = new n("INVISIBLE", 2, 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ n[] f8074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8075n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8076g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        n[] nVarArrH = h();
        f8074m = nVarArrH;
        f8075n = AbstractC3083a.a(nVarArrH);
        f8069h = new a(null);
        f8070i = values();
    }

    private n(String str, int i10, int i11) {
        this.f8076g = i11;
    }

    private static final /* synthetic */ n[] h() {
        return new n[]{f8071j, f8072k, f8073l};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f8074m.clone();
    }
}
