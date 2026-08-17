package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
enum d0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom(ViewProps.BOTTOM),
    center("center"),
    top(ViewProps.TOP),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");


    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f24612x = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24614g;

    static {
        for (d0 d0Var : values()) {
            f24612x.put(d0Var.f24614g, d0Var);
        }
    }

    d0(String str) {
        this.f24614g = str;
    }

    static d0 j(String str) {
        Map map = f24612x;
        if (map.containsKey(str)) {
            return (d0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24614g;
    }
}
