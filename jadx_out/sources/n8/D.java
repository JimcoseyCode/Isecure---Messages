package n8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D f30080g = new D("ALL", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f30081h = new D("ONLY_NON_SYNTHESIZED", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D f30082i = new D("NONE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ D[] f30083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30084k;

    static {
        D[] dArrH = h();
        f30083j = dArrH;
        f30084k = AbstractC3083a.a(dArrH);
    }

    private D(String str, int i10) {
    }

    private static final /* synthetic */ D[] h() {
        return new D[]{f30080g, f30081h, f30082i};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f30083j.clone();
    }
}
