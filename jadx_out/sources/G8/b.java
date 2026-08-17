package G8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f3541g = new b("FOR_SUBTYPING", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f3542h = new b("FOR_INCORPORATION", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f3543i = new b("FROM_EXPRESSION", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ b[] f3544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3545k;

    static {
        b[] bVarArrH = h();
        f3544j = bVarArrH;
        f3545k = AbstractC3083a.a(bVarArrH);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] h() {
        return new b[]{f3541g, f3542h, f3543i};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3544j.clone();
    }
}
