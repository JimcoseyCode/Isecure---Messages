package c8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c8.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1908h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1908h0 f18994g = new EnumC1908h0("FLEXIBLE_LOWER", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1908h0 f18995h = new EnumC1908h0("FLEXIBLE_UPPER", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1908h0 f18996i = new EnumC1908h0("INFLEXIBLE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC1908h0[] f18997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f18998k;

    static {
        EnumC1908h0[] enumC1908h0ArrH = h();
        f18997j = enumC1908h0ArrH;
        f18998k = AbstractC3083a.a(enumC1908h0ArrH);
    }

    private EnumC1908h0(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1908h0[] h() {
        return new EnumC1908h0[]{f18994g, f18995h, f18996i};
    }

    public static EnumC1908h0 valueOf(String str) {
        return (EnumC1908h0) Enum.valueOf(EnumC1908h0.class, str);
    }

    public static EnumC1908h0[] values() {
        return (EnumC1908h0[]) f18997j.clone();
    }
}
