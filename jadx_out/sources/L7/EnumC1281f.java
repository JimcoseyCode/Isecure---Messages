package L7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1281f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1281f f7320h = new EnumC1281f("CLASS", 0, "class");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1281f f7321i = new EnumC1281f("INTERFACE", 1, "interface");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC1281f f7322j = new EnumC1281f("ENUM_CLASS", 2, "enum class");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC1281f f7323k = new EnumC1281f("ENUM_ENTRY", 3, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC1281f f7324l = new EnumC1281f("ANNOTATION_CLASS", 4, "annotation class");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC1281f f7325m = new EnumC1281f("OBJECT", 5, "object");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC1281f[] f7326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7327o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7328g;

    static {
        EnumC1281f[] enumC1281fArrH = h();
        f7326n = enumC1281fArrH;
        f7327o = AbstractC3083a.a(enumC1281fArrH);
    }

    private EnumC1281f(String str, int i10, String str2) {
        this.f7328g = str2;
    }

    private static final /* synthetic */ EnumC1281f[] h() {
        return new EnumC1281f[]{f7320h, f7321i, f7322j, f7323k, f7324l, f7325m};
    }

    public static EnumC1281f valueOf(String str) {
        return (EnumC1281f) Enum.valueOf(EnumC1281f.class, str);
    }

    public static EnumC1281f[] values() {
        return (EnumC1281f[]) f7326n.clone();
    }

    public final boolean j() {
        return this == f7325m || this == f7323k;
    }
}
