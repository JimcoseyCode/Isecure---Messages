package o7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3015a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3015a f30499g = new EnumC3015a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3015a f30500h = new EnumC3015a("UNDECIDED", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC3015a f30501i = new EnumC3015a("RESUMED", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC3015a[] f30502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30503k;

    static {
        EnumC3015a[] enumC3015aArrH = h();
        f30502j = enumC3015aArrH;
        f30503k = AbstractC3083a.a(enumC3015aArrH);
    }

    private EnumC3015a(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3015a[] h() {
        return new EnumC3015a[]{f30499g, f30500h, f30501i};
    }

    public static EnumC3015a valueOf(String str) {
        return (EnumC3015a) Enum.valueOf(EnumC3015a.class, str);
    }

    public static EnumC3015a[] values() {
        return (EnumC3015a[]) f30502j.clone();
    }
}
