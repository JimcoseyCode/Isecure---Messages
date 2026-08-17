package J6;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f6744g = new v("NONE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f6745h = new v("BOX_NONE", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v f6746i = new v("BOX_ONLY", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v f6747j = new v("AUTO", 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ v[] f6748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6749l;

    static {
        v[] vVarArrH = h();
        f6748k = vVarArrH;
        f6749l = AbstractC3083a.a(vVarArrH);
    }

    private v(String str, int i10) {
    }

    private static final /* synthetic */ v[] h() {
        return new v[]{f6744g, f6745h, f6746i, f6747j};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f6748k.clone();
    }
}
