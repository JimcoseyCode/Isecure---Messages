package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1758e extends InterfaceC1770q {
    default void e(r owner) {
        AbstractC2855l.g(owner, "owner");
    }

    default void onDestroy(r owner) {
        AbstractC2855l.g(owner, "owner");
    }

    default void onPause(r owner) {
        AbstractC2855l.g(owner, "owner");
    }

    void onResume(r rVar);

    default void onStart(r owner) {
        AbstractC2855l.g(owner, "owner");
    }

    default void onStop(r owner) {
        AbstractC2855l.g(owner, "owner");
    }
}
