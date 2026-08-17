package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.InterfaceC1372f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f24296a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f24297b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static O4.a f24298c;

    private static void b(Context context) {
        if (f24298c == null) {
            O4.a aVar = new O4.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f24298c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f24297b) {
            try {
                if (f24298c != null && d(intent)) {
                    f(intent, false);
                    f24298c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void e(Context context, p0 p0Var, final Intent intent) {
        synchronized (f24297b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f24298c.a(f24296a);
                }
                p0Var.d(intent).c(new InterfaceC1372f() { // from class: com.google.firebase.messaging.j0
                    @Override // P4.InterfaceC1372f
                    public final void onComplete(AbstractC1378l abstractC1378l) {
                        k0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void f(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    static ComponentName g(Context context, Intent intent) {
        synchronized (f24297b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f24298c.a(f24296a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
