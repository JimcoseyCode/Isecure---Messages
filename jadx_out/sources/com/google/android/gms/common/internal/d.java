package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import r4.F;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f21232a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static y f21233b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static HandlerThread f21234c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Executor f21235d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f21236e = false;

    public static d a(Context context) {
        synchronized (f21232a) {
            try {
                if (f21233b == null) {
                    f21233b = new y(context.getApplicationContext(), f21236e ? b().getLooper() : context.getMainLooper(), f21235d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21233b;
    }

    public static HandlerThread b() {
        synchronized (f21232a) {
            try {
                HandlerThread handlerThread = f21234c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f21234c = handlerThread2;
                handlerThread2.start();
                return f21234c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void c(F f10, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        c(new F(str, str2, 4225, z10), serviceConnection, str3);
    }

    protected abstract boolean e(F f10, ServiceConnection serviceConnection, String str, Executor executor);
}
