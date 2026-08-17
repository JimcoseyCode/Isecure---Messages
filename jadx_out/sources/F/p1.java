package F;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p1 f1605h = new p1("DEFAULT", 0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p1 f1606i = new p1("PREVIEW", 1, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p1 f1607j = new p1("VIDEO_RECORD", 2, 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p1 f1608k = new p1("STILL_CAPTURE", 3, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p1 f1609l = new p1("VIDEO_CALL", 4, 5);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p1 f1610m = new p1("PREVIEW_VIDEO_STILL", 5, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p1 f1611n = new p1("CROPPED_RAW", 6, 6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ p1[] f1612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1613p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f1614g;

    static {
        p1[] p1VarArrH = h();
        f1612o = p1VarArrH;
        f1613p = AbstractC3083a.a(p1VarArrH);
    }

    private p1(String str, int i10, int i11) {
        this.f1614g = i11;
    }

    private static final /* synthetic */ p1[] h() {
        return new p1[]{f1605h, f1606i, f1607j, f1608k, f1609l, f1610m, f1611n};
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) f1612o.clone();
    }

    public final long j() {
        return this.f1614g;
    }
}
