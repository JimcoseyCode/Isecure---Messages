package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2283v {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map f24756j = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24758g;

    static {
        for (EnumC2283v enumC2283v : values()) {
            f24756j.put(enumC2283v.f24758g, enumC2283v);
        }
    }

    EnumC2283v(String str) {
        this.f24758g = str;
    }

    static EnumC2283v j(String str) {
        Map map = f24756j;
        if (map.containsKey(str)) {
            return (EnumC2283v) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24758g;
    }
}
