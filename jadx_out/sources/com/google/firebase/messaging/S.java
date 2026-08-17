package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1379m;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import f1.ExecutorC2595b;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class S {
    public static /* synthetic */ void a(Context context, boolean z10, C1379m c1379m) {
        try {
            if (!b(context)) {
                context.getPackageName();
                return;
            }
            U.e(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            c1379m.e(null);
        }
    }

    private static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    static void c(Context context) {
        if (U.c(context)) {
            return;
        }
        e(new ExecutorC2595b(), context, f(context));
    }

    static boolean d(Context context) {
        if (!y4.l.i()) {
            return false;
        }
        if (b(context)) {
            return "com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate());
        }
        context.getPackageName();
        return false;
    }

    static AbstractC1378l e(Executor executor, final Context context, final boolean z10) {
        if (!y4.l.i()) {
            return AbstractC1381o.f(null);
        }
        final C1379m c1379m = new C1379m();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.Q
            @Override // java.lang.Runnable
            public final void run() {
                S.a(context, z10, c1379m);
            }
        });
        return c1379m.a();
    }

    private static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
