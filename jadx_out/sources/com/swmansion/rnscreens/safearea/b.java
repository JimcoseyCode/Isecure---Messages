package com.swmansion.rnscreens.safearea;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f25359g = new b("ALL", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f25360h = new b("SYSTEM", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f25361i = new b("INTERFACE", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ b[] f25362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f25363k;

    static {
        b[] bVarArrH = h();
        f25362j = bVarArrH;
        f25363k = AbstractC3083a.a(bVarArrH);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] h() {
        return new b[]{f25359g, f25360h, f25361i};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f25362j.clone();
    }

    public final boolean j() {
        return this == f25359g || this == f25361i;
    }

    public final boolean k() {
        return this == f25359g || this == f25360h;
    }
}
