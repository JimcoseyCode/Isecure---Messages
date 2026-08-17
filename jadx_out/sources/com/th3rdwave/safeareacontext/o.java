package com.th3rdwave.safeareacontext;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f25507g = new o("PADDING", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f25508h = new o("MARGIN", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ o[] f25509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f25510j;

    static {
        o[] oVarArrH = h();
        f25509i = oVarArrH;
        f25510j = AbstractC3083a.a(oVarArrH);
    }

    private o(String str, int i10) {
    }

    private static final /* synthetic */ o[] h() {
        return new o[]{f25507g, f25508h};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f25509i.clone();
    }
}
