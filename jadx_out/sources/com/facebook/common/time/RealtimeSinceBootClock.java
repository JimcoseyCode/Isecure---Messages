package com.facebook.common.time;

import android.os.SystemClock;
import j2.InterfaceC2764b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RealtimeSinceBootClock implements InterfaceC2764b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f19683a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return f19683a;
    }

    @Override // j2.InterfaceC2764b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // j2.InterfaceC2764b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
