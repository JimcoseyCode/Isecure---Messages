package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.HashMap;
import java.util.concurrent.Executor;
import r4.AbstractC3268i;
import r4.F;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class y extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f21262f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f21263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Handler f21264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f21265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x4.b f21266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f21267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f21268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile Executor f21269m;

    y(Context context, Looper looper, Executor executor) {
        x xVar = new x(this, null);
        this.f21265i = xVar;
        this.f21263g = context.getApplicationContext();
        this.f21264h = new F4.e(looper, xVar);
        this.f21266j = x4.b.b();
        this.f21267k = 5000L;
        this.f21268l = DataPersistorKt.EXPIRATION_TIME;
        this.f21269m = executor;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final void c(F f10, ServiceConnection serviceConnection, String str) {
        AbstractC3268i.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f21262f) {
            try {
                w wVar = (w) this.f21262f.get(f10);
                if (wVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + f10.toString());
                }
                if (!wVar.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + f10.toString());
                }
                wVar.f(serviceConnection, str);
                if (wVar.i()) {
                    this.f21264h.sendMessageDelayed(this.f21264h.obtainMessage(0, f10), this.f21267k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.d
    protected final boolean e(F f10, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        AbstractC3268i.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f21262f) {
            try {
                w wVar = (w) this.f21262f.get(f10);
                if (executor == null) {
                    executor = this.f21269m;
                }
                if (wVar == null) {
                    wVar = new w(this, f10);
                    wVar.d(serviceConnection, serviceConnection, str);
                    wVar.e(str, executor);
                    this.f21262f.put(f10, wVar);
                } else {
                    this.f21264h.removeMessages(0, f10);
                    if (wVar.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + f10.toString());
                    }
                    wVar.d(serviceConnection, serviceConnection, str);
                    int iA = wVar.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(wVar.b(), wVar.c());
                    } else if (iA == 2) {
                        wVar.e(str, executor);
                    }
                }
                zJ = wVar.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
