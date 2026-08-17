package n8;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final E f30085g = new E("PRETTY", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f30086h = new E("DEBUG", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E f30087i = new E("NONE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ E[] f30088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30089k;

    static {
        E[] eArrH = h();
        f30088j = eArrH;
        f30089k = AbstractC3083a.a(eArrH);
    }

    private E(String str, int i10) {
    }

    private static final /* synthetic */ E[] h() {
        return new E[]{f30085g, f30086h, f30087i};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f30088j.clone();
    }
}
