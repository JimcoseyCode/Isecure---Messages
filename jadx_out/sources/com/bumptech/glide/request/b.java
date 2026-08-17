package com.bumptech.glide.request;

import M1.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f19293g;

        a(boolean z10) {
            this.f19293g = z10;
        }

        boolean j() {
            return this.f19293g;
        }
    }

    boolean canNotifyCleared(c cVar);

    boolean canNotifyStatusChanged(c cVar);

    boolean canSetImage(c cVar);

    b getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(c cVar);

    void onRequestSuccess(c cVar);
}
