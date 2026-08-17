package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20774g;

    h(int i10) {
        this.f20774g = i10;
    }

    public static h j(int i10) {
        if (i10 == 0) {
            return INHERIT;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int k() {
        return this.f20774g;
    }
}
