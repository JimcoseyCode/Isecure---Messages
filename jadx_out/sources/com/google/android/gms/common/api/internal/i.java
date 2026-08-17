package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C2097a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class i implements ComponentCallbacks2C2097a.InterfaceC0221a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2098b f21063a;

    i(C2098b c2098b) {
        this.f21063a = c2098b;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2097a.InterfaceC0221a
    public final void a(boolean z10) {
        C2098b c2098b = this.f21063a;
        c2098b.f21048n.sendMessage(c2098b.f21048n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
