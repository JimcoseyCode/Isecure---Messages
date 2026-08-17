package C7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f528g = new s("PUBLIC", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f529h = new s("PROTECTED", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f530i = new s("INTERNAL", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f531j = new s("PRIVATE", 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ s[] f532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f533l;

    static {
        s[] sVarArrH = h();
        f532k = sVarArrH;
        f533l = AbstractC3083a.a(sVarArrH);
    }

    private s(String str, int i10) {
    }

    private static final /* synthetic */ s[] h() {
        return new s[]{f528g, f529h, f530i, f531j};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f532k.clone();
    }
}
