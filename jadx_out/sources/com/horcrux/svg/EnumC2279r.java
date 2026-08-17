package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2279r {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f24726l = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24728g;

    static {
        for (EnumC2279r enumC2279r : values()) {
            f24726l.put(enumC2279r.f24728g, enumC2279r);
        }
    }

    EnumC2279r(String str) {
        this.f24728g = str;
    }

    static EnumC2279r j(String str) {
        Map map = f24726l;
        if (map.containsKey(str)) {
            return (EnumC2279r) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24728g;
    }
}
