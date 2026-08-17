package c8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1909i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1909i f18999g = new EnumC1909i("READ_ONLY", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1909i f19000h = new EnumC1909i("MUTABLE", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC1909i[] f19001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19002j;

    static {
        EnumC1909i[] enumC1909iArrH = h();
        f19001i = enumC1909iArrH;
        f19002j = AbstractC3083a.a(enumC1909iArrH);
    }

    private EnumC1909i(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1909i[] h() {
        return new EnumC1909i[]{f18999g, f19000h};
    }

    public static EnumC1909i valueOf(String str) {
        return (EnumC1909i) Enum.valueOf(EnumC1909i.class, str);
    }

    public static EnumC1909i[] values() {
        return (EnumC1909i[]) f19001i.clone();
    }
}
