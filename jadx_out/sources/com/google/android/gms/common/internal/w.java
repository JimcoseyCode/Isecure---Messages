package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import r4.F;
import r4.I;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class w implements ServiceConnection, I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21254a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21255b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f21257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f21258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f21259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f21260g;

    public w(y yVar, F f10) {
        this.f21260g = yVar;
        this.f21258e = f10;
    }

    public final int a() {
        return this.f21255b;
    }

    public final ComponentName b() {
        return this.f21259f;
    }

    public final IBinder c() {
        return this.f21257d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f21254a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) throws Throwable {
        y yVar;
        this.f21255b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (y4.l.k()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            yVar = this.f21260g;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zD = yVar.f21266j.d(yVar.f21263g, str, this.f21258e.b(yVar.f21263g), this, 4225, executor);
            this.f21256c = zD;
            if (zD) {
                this.f21260g.f21264h.sendMessageDelayed(this.f21260g.f21264h.obtainMessage(1, this.f21258e), this.f21260g.f21268l);
            } else {
                this.f21255b = 2;
                try {
                    y yVar2 = this.f21260g;
                    yVar2.f21266j.c(yVar2.f21263g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f21254a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f21260g.f21264h.removeMessages(1, this.f21258e);
        y yVar = this.f21260g;
        yVar.f21266j.c(yVar.f21263g, this);
        this.f21256c = false;
        this.f21255b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f21254a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f21254a.isEmpty();
    }

    public final boolean j() {
        return this.f21256c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f21260g.f21262f) {
            try {
                this.f21260g.f21264h.removeMessages(1, this.f21258e);
                this.f21257d = iBinder;
                this.f21259f = componentName;
                Iterator it = this.f21254a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f21255b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f21260g.f21262f) {
            try {
                this.f21260g.f21264h.removeMessages(1, this.f21258e);
                this.f21257d = null;
                this.f21259f = componentName;
                Iterator it = this.f21254a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f21255b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
