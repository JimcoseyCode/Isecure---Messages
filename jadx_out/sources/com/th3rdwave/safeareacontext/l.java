package com.th3rdwave.safeareacontext;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f25495g = new l("OFF", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f25496h = new l("ADDITIVE", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f25497i = new l("MAXIMUM", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ l[] f25498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f25499k;

    static {
        l[] lVarArrH = h();
        f25498j = lVarArrH;
        f25499k = AbstractC3083a.a(lVarArrH);
    }

    private l(String str, int i10) {
    }

    private static final /* synthetic */ l[] h() {
        return new l[]{f25495g, f25496h, f25497i};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f25498j.clone();
    }
}
