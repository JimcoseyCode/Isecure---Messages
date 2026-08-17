package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends r4.z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f21247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21248d;

    public p(b bVar, int i10) {
        this.f21247c = bVar;
        this.f21248d = i10;
    }

    @Override // r4.InterfaceC3264e
    public final void j(int i10, Bundle bundle) {
        new Exception();
    }

    @Override // r4.InterfaceC3264e
    public final void n(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC3268i.l(this.f21247c, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f21247c.M(i10, iBinder, bundle, this.f21248d);
        this.f21247c = null;
    }

    @Override // r4.InterfaceC3264e
    public final void u(int i10, IBinder iBinder, zzk zzkVar) {
        b bVar = this.f21247c;
        AbstractC3268i.l(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC3268i.k(zzkVar);
        b.a0(bVar, zzkVar);
        n(i10, iBinder, zzkVar.f21287g);
    }
}
