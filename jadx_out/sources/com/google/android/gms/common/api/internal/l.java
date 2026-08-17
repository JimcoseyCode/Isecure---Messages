package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class l implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ m f21067g;

    l(m mVar) {
        this.f21067g = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f21067g.f21068a;
        nVar.f21070d.c(nVar.f21070d.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
