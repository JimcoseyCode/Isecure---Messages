package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2280s {
    UNKNOWN("unknown"),
    NORMAL("normal"),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f24735n = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24737g;

    static {
        for (EnumC2280s enumC2280s : values()) {
            f24735n.put(enumC2280s.f24737g, enumC2280s);
        }
    }

    EnumC2280s(String str) {
        this.f24737g = str;
    }

    static EnumC2280s j(String str) {
        Map map = f24735n;
        if (map.containsKey(str)) {
            return (EnumC2280s) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24737g;
    }
}
