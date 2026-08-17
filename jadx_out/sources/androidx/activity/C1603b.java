package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1603b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1603b f13821a = new C1603b();

    private C1603b() {
    }

    public final long a(BackEvent backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        return backEvent.getFrameTimeMillis();
    }
}
