package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import p4.C3055b;
import p4.InterfaceC3058e;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m0.b f21061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C2098b f21062m;

    h(InterfaceC3058e interfaceC3058e, C2098b c2098b, com.google.android.gms.common.a aVar) {
        super(interfaceC3058e, aVar);
        this.f21061l = new m0.b();
        this.f21062m = c2098b;
        this.f21025g.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C2098b c2098b, C3055b c3055b) {
        InterfaceC3058e interfaceC3058eC = LifecycleCallback.c(activity);
        h hVar = (h) interfaceC3058eC.g("ConnectionlessLifecycleHelper", h.class);
        if (hVar == null) {
            hVar = new h(interfaceC3058eC, c2098b, com.google.android.gms.common.a.m());
        }
        AbstractC3268i.l(c3055b, "ApiKey cannot be null");
        hVar.f21061l.add(c3055b);
        c2098b.a(hVar);
    }

    private final void v() {
        if (this.f21061l.isEmpty()) {
            return;
        }
        this.f21062m.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.B, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.B, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f21062m.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.B
    protected final void m(ConnectionResult connectionResult, int i10) {
        this.f21062m.B(connectionResult, i10);
    }

    @Override // com.google.android.gms.common.api.internal.B
    protected final void n() {
        this.f21062m.C();
    }

    final m0.b t() {
        return this.f21061l;
    }
}
