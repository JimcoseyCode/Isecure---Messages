package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f21251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ b f21252h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f21252h = bVar;
        this.f21251g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.k
    protected final void f(ConnectionResult connectionResult) {
        if (this.f21252h.f21223v != null) {
            this.f21252h.f21223v.d(connectionResult);
        }
        this.f21252h.K(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.k
    protected final boolean g() {
        try {
            IBinder iBinder = this.f21251g;
            AbstractC3268i.k(iBinder);
            if (!this.f21252h.D().equals(iBinder.getInterfaceDescriptor())) {
                this.f21252h.D();
                return false;
            }
            IInterface iInterfaceR = this.f21252h.r(this.f21251g);
            if (iInterfaceR == null) {
                return false;
            }
            if (!b.e0(this.f21252h, 2, 4, iInterfaceR) && !b.e0(this.f21252h, 3, 4, iInterfaceR)) {
                return false;
            }
            this.f21252h.f21227z = null;
            b bVar = this.f21252h;
            Bundle bundleW = bVar.w();
            if (bVar.f21222u != null) {
                this.f21252h.f21222u.f(bundleW);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
