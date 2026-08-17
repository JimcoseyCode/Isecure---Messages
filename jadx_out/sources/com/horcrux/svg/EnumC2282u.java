package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2282u {
    OVER("over"),
    IN("in"),
    OUT("out"),
    ATOP("atop"),
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f24751n = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24753g;

    static {
        for (EnumC2282u enumC2282u : values()) {
            f24751n.put(enumC2282u.f24753g, enumC2282u);
        }
    }

    EnumC2282u(String str) {
        this.f24753g = str;
    }

    static EnumC2282u j(String str) {
        Map map = f24751n;
        if (map.containsKey(str)) {
            return (EnumC2282u) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24753g;
    }
}
