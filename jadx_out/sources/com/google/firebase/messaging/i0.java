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

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class i0 implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f24280l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Boolean f24281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Boolean f24282n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f24283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L f24284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PowerManager.WakeLock f24285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h0 f24286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f24287k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i0 f24288a;

        public a(i0 i0Var) {
            this.f24288a = i0Var;
        }

        public void a() {
            i0.j();
            i0.this.f24283g.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            i0 i0Var = this.f24288a;
            if (i0Var == null) {
                return;
            }
            if (i0Var.i()) {
                i0.j();
                this.f24288a.f24286j.l(this.f24288a, 0L);
                context.unregisterReceiver(this);
                this.f24288a = null;
            }
        }
    }

    i0(h0 h0Var, Context context, L l10, long j10) {
        this.f24286j = h0Var;
        this.f24283g = context;
        this.f24287k = j10;
        this.f24284h = l10;
        this.f24285i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f24280l) {
            try {
                Boolean bool = f24282n;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f24282n = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            e(str);
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f24280l) {
            try {
                Boolean bool = f24281m;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f24281m = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean i() {
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f24283g.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z10 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f24283g)) {
            this.f24285i.acquire(AbstractC2237e.f24248a);
        }
        try {
            try {
                try {
                    this.f24286j.n(true);
                    if (!this.f24284h.g()) {
                        this.f24286j.n(false);
                        if (h(this.f24283g)) {
                            try {
                                this.f24285i.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (f(this.f24283g) && !i()) {
                        new a(this).a();
                        if (h(this.f24283g)) {
                            try {
                                this.f24285i.release();
                                return;
                            } catch (RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    if (this.f24286j.r()) {
                        this.f24286j.n(false);
                    } else {
                        this.f24286j.s(this.f24287k);
                    }
                    if (h(this.f24283g)) {
                        this.f24285i.release();
                    }
                } catch (Throwable th) {
                    if (h(this.f24283g)) {
                        try {
                            this.f24285i.release();
                        } catch (RuntimeException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e10.getMessage();
                this.f24286j.n(false);
                if (h(this.f24283g)) {
                    this.f24285i.release();
                }
            }
        } catch (RuntimeException unused4) {
        }
    }
}
