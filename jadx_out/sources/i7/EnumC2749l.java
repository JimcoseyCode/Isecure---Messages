package i7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2749l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC2749l f28716g = new EnumC2749l("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC2749l f28717h = new EnumC2749l("PUBLICATION", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC2749l f28718i = new EnumC2749l("NONE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC2749l[] f28719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f28720k;

    static {
        EnumC2749l[] enumC2749lArrH = h();
        f28719j = enumC2749lArrH;
        f28720k = AbstractC3083a.a(enumC2749lArrH);
    }

    private EnumC2749l(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2749l[] h() {
        return new EnumC2749l[]{f28716g, f28717h, f28718i};
    }

    public static EnumC2749l valueOf(String str) {
        return (EnumC2749l) Enum.valueOf(EnumC2749l.class, str);
    }

    public static EnumC2749l[] values() {
        return (EnumC2749l[]) f28719j.clone();
    }
}
