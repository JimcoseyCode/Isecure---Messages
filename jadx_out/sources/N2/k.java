package N2;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f8062g = new k("VITO_V2", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f8063h = new k("VITO_V1", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f8064i = new k("DRAWEE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f8065j = new k("OTHER", 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ k[] f8066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8067l;

    static {
        k[] kVarArrH = h();
        f8066k = kVarArrH;
        f8067l = AbstractC3083a.a(kVarArrH);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] h() {
        return new k[]{f8062g, f8063h, f8064i, f8065j};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f8066k.clone();
    }
}
