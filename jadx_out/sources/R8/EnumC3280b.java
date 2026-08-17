package r8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3280b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3280b f31979g = new EnumC3280b("WARNING", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3280b f31980h = new EnumC3280b("ERROR", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC3280b f31981i = new EnumC3280b("HIDDEN", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC3280b[] f31982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f31983k;

    static {
        EnumC3280b[] enumC3280bArrH = h();
        f31982j = enumC3280bArrH;
        f31983k = AbstractC3083a.a(enumC3280bArrH);
    }

    private EnumC3280b(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3280b[] h() {
        return new EnumC3280b[]{f31979g, f31980h, f31981i};
    }

    public static EnumC3280b valueOf(String str) {
        return (EnumC3280b) Enum.valueOf(EnumC3280b.class, str);
    }

    public static EnumC3280b[] values() {
        return (EnumC3280b[]) f31982j.clone();
    }
}
