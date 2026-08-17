package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class p implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f21084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ q f21085h;

    p(q qVar, ConnectionResult connectionResult) {
        this.f21085h = qVar;
        this.f21084g = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f21085h;
        n nVar = (n) qVar.f21091f.f21044j.get(qVar.f21087b);
        if (nVar == null) {
            return;
        }
        if (!this.f21084g.l0()) {
            nVar.H(this.f21084g, null);
            return;
        }
        this.f21085h.f21090e = true;
        if (this.f21085h.f21086a.o()) {
            this.f21085h.i();
            return;
        }
        try {
            q qVar2 = this.f21085h;
            qVar2.f21086a.b(null, qVar2.f21086a.a());
        } catch (SecurityException unused) {
            this.f21085h.f21086a.c("Failed to get service from broker.");
            nVar.H(new ConnectionResult(10), null);
        }
    }
}
