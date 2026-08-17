package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum g0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Map f24643u = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24645g;

    static {
        for (g0 g0Var : values()) {
            f24643u.put(g0Var.f24645g, g0Var);
        }
    }

    g0(String str) {
        this.f24645g = str;
    }

    static g0 j(String str) {
        return (g0) f24643u.get(str);
    }

    static boolean k(String str) {
        return f24643u.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24645g;
    }
}
