package C;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f444g = new b("DYNAMIC_RANGE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f445h = new b("FPS_RANGE", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f446i = new b("VIDEO_STABILIZATION", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f447j = new b("IMAGE_FORMAT", 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ b[] f448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f449l;

    static {
        b[] bVarArrH = h();
        f448k = bVarArrH;
        f449l = AbstractC3083a.a(bVarArrH);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] h() {
        return new b[]{f444g, f445h, f446i, f447j};
    }

    public static EnumEntries j() {
        return f449l;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f448k.clone();
    }
}
