package Z7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f13631g = new c("INFLEXIBLE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f13632h = new c("FLEXIBLE_UPPER_BOUND", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f13633i = new c("FLEXIBLE_LOWER_BOUND", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ c[] f13634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13635k;

    static {
        c[] cVarArrH = h();
        f13634j = cVarArrH;
        f13635k = AbstractC3083a.a(cVarArrH);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] h() {
        return new c[]{f13631g, f13632h, f13633i};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f13634j.clone();
    }
}
