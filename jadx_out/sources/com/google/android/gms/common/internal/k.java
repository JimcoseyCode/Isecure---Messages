package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class k extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f21240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f21241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected k(b bVar, int i10, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f21241f = bVar;
        this.f21239d = i10;
        this.f21240e = bundle;
    }

    @Override // com.google.android.gms.common.internal.o
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f21239d != 0) {
            this.f21241f.g0(1, null);
            Bundle bundle = this.f21240e;
            f(new ConnectionResult(this.f21239d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f21241f.g0(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    protected abstract void f(ConnectionResult connectionResult);

    protected abstract boolean g();

    @Override // com.google.android.gms.common.internal.o
    protected final void b() {
    }
}
