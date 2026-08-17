package b8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b8.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1816D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1816D f18663g = new EnumC1816D("SOURCE", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1816D f18664h = new EnumC1816D("BINARY", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC1816D[] f18665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f18666j;

    static {
        EnumC1816D[] enumC1816DArrH = h();
        f18665i = enumC1816DArrH;
        f18666j = AbstractC3083a.a(enumC1816DArrH);
    }

    private EnumC1816D(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1816D[] h() {
        return new EnumC1816D[]{f18663g, f18664h};
    }

    public static EnumC1816D valueOf(String str) {
        return (EnumC1816D) Enum.valueOf(EnumC1816D.class, str);
    }

    public static EnumC1816D[] values() {
        return (EnumC1816D[]) f18665i.clone();
    }
}
