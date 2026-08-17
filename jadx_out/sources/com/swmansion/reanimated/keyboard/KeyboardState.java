package com.swmansion.reanimated.keyboard;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum KeyboardState {
    UNKNOWN(0),
    OPENING(1),
    OPEN(2),
    CLOSING(3),
    CLOSED(4);

    private final int mValue;

    KeyboardState(int i10) {
        this.mValue = i10;
    }

    public int asInt() {
        return this.mValue;
    }
}
