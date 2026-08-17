package com.facebook.common.time;

import j2.InterfaceC2765c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements InterfaceC2765c {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // j2.InterfaceC2765c, j2.InterfaceC2764b
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // j2.InterfaceC2765c, j2.InterfaceC2764b
    public long nowNanos() {
        return System.nanoTime();
    }
}
