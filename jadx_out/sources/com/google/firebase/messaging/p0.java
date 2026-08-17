package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.C1379m;
import P4.InterfaceC1372f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.p0;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z4.ThreadFactoryC3675a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class p0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f24310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f24311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f24312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m0 f24313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24314f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f24315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1379m f24316b = new C1379m();

        a(Intent intent) {
            this.f24315a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.f24315a.getAction();
            aVar.d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.n0
                @Override // java.lang.Runnable
                public final void run() {
                    p0.a.b(this.f24305g);
                }
            }, 20L, TimeUnit.SECONDS);
            e().d(scheduledExecutorService, new InterfaceC1372f() { // from class: com.google.firebase.messaging.o0
                @Override // P4.InterfaceC1372f
                public final void onComplete(AbstractC1378l abstractC1378l) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f24316b.e(null);
        }

        AbstractC1378l e() {
            return this.f24316b.a();
        }
    }

    p0(Context context, String str) {
        this(context, str, a());
    }

    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3675a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f24312d.isEmpty()) {
            ((a) this.f24312d.poll()).d();
        }
    }

    private synchronized void c() {
        while (!this.f24312d.isEmpty()) {
            try {
                m0 m0Var = this.f24313e;
                if (m0Var == null || !m0Var.isBinderAlive()) {
                    e();
                    return;
                } else {
                    this.f24313e.b((a) this.f24312d.poll());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e() {
        if (this.f24314f) {
            return;
        }
        this.f24314f = true;
        try {
            if (x4.b.b().a(this.f24309a, this.f24310b, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.f24314f = false;
        b();
    }

    synchronized AbstractC1378l d(Intent intent) {
        a aVar;
        aVar = new a(intent);
        aVar.c(this.f24311c);
        this.f24312d.add(aVar);
        c();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f24314f = false;
            if (iBinder instanceof m0) {
                this.f24313e = (m0) iBinder;
                c();
            } else {
                Objects.toString(iBinder);
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        c();
    }

    p0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f24312d = new ArrayDeque();
        this.f24314f = false;
        Context applicationContext = context.getApplicationContext();
        this.f24309a = applicationContext;
        this.f24310b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f24311c = scheduledExecutorService;
    }
}
