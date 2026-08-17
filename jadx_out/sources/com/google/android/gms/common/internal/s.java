package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f21253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b bVar, int i10, Bundle bundle) {
        super(bVar, i10, null);
        this.f21253g = bVar;
    }

    @Override // com.google.android.gms.common.internal.k
    protected final void f(ConnectionResult connectionResult) {
        if (this.f21253g.s() && b.f0(this.f21253g)) {
            b.b0(this.f21253g, 16);
        } else {
            this.f21253g.f21217p.a(connectionResult);
            this.f21253g.K(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.k
    protected final boolean g() {
        this.f21253g.f21217p.a(ConnectionResult.f20991k);
        return true;
    }
}
