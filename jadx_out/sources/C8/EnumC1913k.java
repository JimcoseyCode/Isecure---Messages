package c8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1913k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1913k f19005g = new EnumC1913k("FORCE_FLEXIBILITY", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1913k f19006h = new EnumC1913k("NULLABLE", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1913k f19007i = new EnumC1913k("NOT_NULL", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC1913k[] f19008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19009k;

    static {
        EnumC1913k[] enumC1913kArrH = h();
        f19008j = enumC1913kArrH;
        f19009k = AbstractC3083a.a(enumC1913kArrH);
    }

    private EnumC1913k(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1913k[] h() {
        return new EnumC1913k[]{f19005g, f19006h, f19007i};
    }

    public static EnumC1913k valueOf(String str) {
        return (EnumC1913k) Enum.valueOf(EnumC1913k.class, str);
    }

    public static EnumC1913k[] values() {
        return (EnumC1913k[]) f19008j.clone();
    }
}
