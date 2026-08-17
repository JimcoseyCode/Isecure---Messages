package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1602a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1602a f13820a = new C1602a();

    private C1602a() {
    }

    public final float a(BackEvent backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int b(BackEvent backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float c(BackEvent backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float d(BackEvent backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
