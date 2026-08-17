package t7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f32509g = new i("TOP_DOWN", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f32510h = new i("BOTTOM_UP", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ i[] f32511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f32512j;

    static {
        i[] iVarArrH = h();
        f32511i = iVarArrH;
        f32512j = AbstractC3083a.a(iVarArrH);
    }

    private i(String str, int i10) {
    }

    private static final /* synthetic */ i[] h() {
        return new i[]{f32509g, f32510h};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f32511i.clone();
    }
}
