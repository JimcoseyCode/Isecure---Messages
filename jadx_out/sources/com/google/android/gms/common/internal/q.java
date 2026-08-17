package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import r4.InterfaceC3265f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f21250b;

    public q(b bVar, int i10) {
        this.f21250b = bVar;
        this.f21249a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.f21250b;
        if (iBinder == null) {
            b.b0(bVar, 16);
            return;
        }
        synchronized (bVar.f21215n) {
            try {
                b bVar2 = this.f21250b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bVar2.f21216o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3265f)) ? new l(iBinder) : (InterfaceC3265f) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21250b.c0(0, null, this.f21249a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f21250b.f21215n) {
            this.f21250b.f21216o = null;
        }
        b bVar = this.f21250b;
        int i10 = this.f21249a;
        Handler handler = bVar.f21213l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
