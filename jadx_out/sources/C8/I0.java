package C8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class I0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I0 f574g = new I0("SUPERTYPE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I0 f575h = new I0("COMMON", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ I0[] f576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f577j;

    static {
        I0[] i0ArrH = h();
        f576i = i0ArrH;
        f577j = AbstractC3083a.a(i0ArrH);
    }

    private I0(String str, int i10) {
    }

    private static final /* synthetic */ I0[] h() {
        return new I0[]{f574g, f575h};
    }

    public static I0 valueOf(String str) {
        return (I0) Enum.valueOf(I0.class, str);
    }

    public static I0[] values() {
        return (I0[]) f576i.clone();
    }
}
