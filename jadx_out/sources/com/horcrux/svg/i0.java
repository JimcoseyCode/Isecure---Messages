package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum i0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map f24659m = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24661g;

    static {
        for (i0 i0Var : values()) {
            f24659m.put(i0Var.f24661g, i0Var);
        }
    }

    i0(String str) {
        this.f24661g = str;
    }

    static i0 j(String str) {
        Map map = f24659m;
        if (map.containsKey(str)) {
            return (i0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24661g;
    }
}
