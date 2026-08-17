package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z4.ThreadFactoryC3675a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class d0 implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f24242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final PowerManager.WakeLock f24243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FirebaseMessaging f24244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ExecutorService f24245j = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3675a("firebase-iid-executor"));

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d0 f24246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f24247b;

        public a(d0 d0Var) {
            this.f24246a = d0Var;
        }

        public void a() {
            d0.c();
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            d0 d0Var = this.f24246a;
            if (d0Var != null) {
                Context contextB = d0Var.b();
                this.f24247b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d0 d0Var = this.f24246a;
            if (d0Var != null && d0Var.d()) {
                d0.c();
                this.f24246a.f24244i.p(this.f24246a, 0L);
                Context context2 = this.f24247b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f24246a = null;
            }
        }
    }

    public d0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f24244i = firebaseMessaging;
        this.f24242g = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f24243h = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f24244i.q();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        try {
            return this.f24244i.n() != null;
        } catch (IOException e10) {
            if (G.i(e10.getMessage())) {
                e10.getMessage();
                return false;
            }
            if (e10.getMessage() == null) {
                return false;
            }
            throw e10;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (Z.b().e(b())) {
            this.f24243h.acquire();
        }
        try {
            try {
                this.f24244i.C(true);
                if (!this.f24244i.B()) {
                    this.f24244i.C(false);
                    if (!Z.b().e(b())) {
                        return;
                    }
                } else if (!Z.b().d(b()) || d()) {
                    if (e()) {
                        this.f24244i.C(false);
                    } else {
                        this.f24244i.H(this.f24242g);
                    }
                    if (!Z.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!Z.b().e(b())) {
                        return;
                    }
                }
                this.f24243h.release();
            } catch (IOException e10) {
                e10.getMessage();
                this.f24244i.C(false);
                if (Z.b().e(b())) {
                    this.f24243h.release();
                }
            }
        } catch (Throwable th) {
            if (Z.b().e(b())) {
                this.f24243h.release();
            }
            throw th;
        }
    }
}
