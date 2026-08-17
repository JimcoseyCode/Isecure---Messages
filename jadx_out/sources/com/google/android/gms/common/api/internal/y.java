package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f21109b;

    y(ConnectionResult connectionResult, int i10) {
        AbstractC3268i.k(connectionResult);
        this.f21109b = connectionResult;
        this.f21108a = i10;
    }

    final int a() {
        return this.f21108a;
    }

    final ConnectionResult b() {
        return this.f21109b;
    }
}
