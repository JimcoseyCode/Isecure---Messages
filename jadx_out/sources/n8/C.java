package n8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C f30075g = new C("RENDER_OVERRIDE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C f30076h = new C("RENDER_OPEN", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C f30077i = new C("RENDER_OPEN_OVERRIDE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ C[] f30078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30079k;

    static {
        C[] cArrH = h();
        f30078j = cArrH;
        f30079k = AbstractC3083a.a(cArrH);
    }

    private C(String str, int i10) {
    }

    private static final /* synthetic */ C[] h() {
        return new C[]{f30075g, f30076h, f30077i};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f30078j.clone();
    }
}
