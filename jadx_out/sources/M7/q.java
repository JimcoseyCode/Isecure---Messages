package M7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f7586g = new q("RUNTIME", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f7587h = new q("BINARY", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f7588i = new q("SOURCE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ q[] f7589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7590k;

    static {
        q[] qVarArrH = h();
        f7589j = qVarArrH;
        f7590k = AbstractC3083a.a(qVarArrH);
    }

    private q(String str, int i10) {
    }

    private static final /* synthetic */ q[] h() {
        return new q[]{f7586g, f7587h, f7588i};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f7589j.clone();
    }
}
