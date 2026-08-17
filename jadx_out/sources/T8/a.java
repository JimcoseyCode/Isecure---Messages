package T8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10646g = new a("SUSPEND", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f10647h = new a("DROP_OLDEST", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10648i = new a("DROP_LATEST", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ a[] f10649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10650k;

    static {
        a[] aVarArrH = h();
        f10649j = aVarArrH;
        f10650k = AbstractC3083a.a(aVarArrH);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] h() {
        return new a[]{f10646g, f10647h, f10648i};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10649j.clone();
    }
}
