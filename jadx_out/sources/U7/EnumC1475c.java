package U7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1475c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1475c f11499h = new EnumC1475c("METHOD_RETURN_TYPE", 0, "METHOD");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1475c f11500i = new EnumC1475c("VALUE_PARAMETER", 1, "PARAMETER");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC1475c f11501j = new EnumC1475c("FIELD", 2, "FIELD");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC1475c f11502k = new EnumC1475c("TYPE_USE", 3, "TYPE_USE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC1475c f11503l = new EnumC1475c("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC1475c f11504m = new EnumC1475c("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC1475c[] f11505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11506o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11507g;

    static {
        EnumC1475c[] enumC1475cArrH = h();
        f11505n = enumC1475cArrH;
        f11506o = AbstractC3083a.a(enumC1475cArrH);
    }

    private EnumC1475c(String str, int i10, String str2) {
        this.f11507g = str2;
    }

    private static final /* synthetic */ EnumC1475c[] h() {
        return new EnumC1475c[]{f11499h, f11500i, f11501j, f11502k, f11503l, f11504m};
    }

    public static EnumC1475c valueOf(String str) {
        return (EnumC1475c) Enum.valueOf(EnumC1475c.class, str);
    }

    public static EnumC1475c[] values() {
        return (EnumC1475c[]) f11505n.clone();
    }

    public final String j() {
        return this.f11507g;
    }
}
