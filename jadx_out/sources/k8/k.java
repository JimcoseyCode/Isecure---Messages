package k8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f29328g = new k("BEGINNING", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f29329h = new k("MIDDLE", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f29330i = new k("AFTER_DOT", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ k[] f29331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f29332k;

    static {
        k[] kVarArrH = h();
        f29331j = kVarArrH;
        f29332k = AbstractC3083a.a(kVarArrH);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] h() {
        return new k[]{f29328g, f29329h, f29330i};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f29331j.clone();
    }
}
