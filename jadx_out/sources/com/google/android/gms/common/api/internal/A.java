package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class A implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y f21019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ B f21020h;

    A(B b10, y yVar) {
        this.f21020h = b10;
        this.f21019g = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21020h.f21021h) {
            ConnectionResult connectionResultB = this.f21019g.b();
            if (connectionResultB.k0()) {
                B b10 = this.f21020h;
                b10.f21025g.startActivityForResult(GoogleApiActivity.a(b10.b(), (PendingIntent) AbstractC3268i.k(connectionResultB.X()), this.f21019g.a(), false), 1);
                return;
            }
            B b11 = this.f21020h;
            if (b11.f21024k.b(b11.b(), connectionResultB.e(), null) != null) {
                B b12 = this.f21020h;
                b12.f21024k.v(b12.b(), b12.f21025g, connectionResultB.e(), 2, this.f21020h);
                return;
            }
            if (connectionResultB.e() != 18) {
                this.f21020h.l(connectionResultB, this.f21019g.a());
                return;
            }
            B b13 = this.f21020h;
            Dialog dialogQ = b13.f21024k.q(b13.b(), b13);
            B b14 = this.f21020h;
            b14.f21024k.r(b14.b().getApplicationContext(), new z(this, dialogQ));
        }
    }
}
