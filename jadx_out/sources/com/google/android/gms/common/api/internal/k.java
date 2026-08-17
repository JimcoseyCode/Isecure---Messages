package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class k implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f21065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ n f21066h;

    k(n nVar, int i10) {
        this.f21066h = nVar;
        this.f21065g = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21066h.l(this.f21065g);
    }
}
