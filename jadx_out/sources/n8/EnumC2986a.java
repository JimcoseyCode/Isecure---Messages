package n8;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2986a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC2986a f30094i = new EnumC2986a("NO_ARGUMENTS", 0, false, false, 3, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC2986a f30095j = new EnumC2986a("UNLESS_EMPTY", 1, true, false, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC2986a f30096k = new EnumC2986a("ALWAYS_PARENTHESIZED", 2, true, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC2986a[] f30097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30098m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f30099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f30100h;

    static {
        EnumC2986a[] enumC2986aArrH = h();
        f30097l = enumC2986aArrH;
        f30098m = AbstractC3083a.a(enumC2986aArrH);
    }

    private EnumC2986a(String str, int i10, boolean z10, boolean z11) {
        this.f30099g = z10;
        this.f30100h = z11;
    }

    private static final /* synthetic */ EnumC2986a[] h() {
        return new EnumC2986a[]{f30094i, f30095j, f30096k};
    }

    public static EnumC2986a valueOf(String str) {
        return (EnumC2986a) Enum.valueOf(EnumC2986a.class, str);
    }

    public static EnumC2986a[] values() {
        return (EnumC2986a[]) f30097l.clone();
    }

    public final boolean j() {
        return this.f30099g;
    }

    public final boolean k() {
        return this.f30100h;
    }

    /* synthetic */ EnumC2986a(String str, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
