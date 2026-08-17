package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2281t {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f24742l = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24744g;

    static {
        for (EnumC2281t enumC2281t : values()) {
            f24742l.put(enumC2281t.f24744g, enumC2281t);
        }
    }

    EnumC2281t(String str) {
        this.f24744g = str;
    }

    static EnumC2281t j(String str) {
        Map map = f24742l;
        if (map.containsKey(str)) {
            return (EnumC2281t) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24744g;
    }
}
