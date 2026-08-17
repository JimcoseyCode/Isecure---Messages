package U7;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O f11452i = new O("IGNORE", 0, "ignore");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final O f11453j = new O("WARN", 1, "warn");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final O f11454k = new O("STRICT", 2, "strict");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ O[] f11455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11456m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11457g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        O[] oArrH = h();
        f11455l = oArrH;
        f11456m = AbstractC3083a.a(oArrH);
        f11451h = new a(null);
    }

    private O(String str, int i10, String str2) {
        this.f11457g = str2;
    }

    private static final /* synthetic */ O[] h() {
        return new O[]{f11452i, f11453j, f11454k};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f11455l.clone();
    }

    public final String j() {
        return this.f11457g;
    }

    public final boolean k() {
        return this == f11452i;
    }

    public final boolean m() {
        return this == f11453j;
    }
}
