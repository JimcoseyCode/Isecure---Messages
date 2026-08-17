package A8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f186g = new r("STABLE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f187h = new r("UNSTABLE", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ r[] f188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f189j;

    static {
        r[] rVarArrH = h();
        f188i = rVarArrH;
        f189j = AbstractC3083a.a(rVarArrH);
    }

    private r(String str, int i10) {
    }

    private static final /* synthetic */ r[] h() {
        return new r[]{f186g, f187h};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f188i.clone();
    }
}
