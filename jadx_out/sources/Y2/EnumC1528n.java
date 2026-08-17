package Y2;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Y2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1528n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1528n f12732g = new EnumC1528n("ALWAYS", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1528n f12733h = new EnumC1528n("AUTO", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1528n f12734i = new EnumC1528n("NEVER", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC1528n[] f12735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12736k;

    static {
        EnumC1528n[] enumC1528nArrH = h();
        f12735j = enumC1528nArrH;
        f12736k = AbstractC3083a.a(enumC1528nArrH);
    }

    private EnumC1528n(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1528n[] h() {
        return new EnumC1528n[]{f12732g, f12733h, f12734i};
    }

    public static EnumC1528n valueOf(String str) {
        return (EnumC1528n) Enum.valueOf(EnumC1528n.class, str);
    }

    public static EnumC1528n[] values() {
        return (EnumC1528n[]) f12735j.clone();
    }
}
