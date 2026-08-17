package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class Z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Z f24198e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24199a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f24200b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f24201c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f24202d = new ArrayDeque();

    private Z() {
    }

    private int a(Context context, Intent intent) {
        String strF = f(context, intent);
        if (strF != null) {
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            return (e(context) ? k0.g(context, intent) : context.startService(intent)) == null ? 404 : -1;
        } catch (IllegalStateException e10) {
            e10.toString();
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    static synchronized Z b() {
        try {
            if (f24198e == null) {
                f24198e = new Z();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f24198e;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f24199a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f24199a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f24199a = serviceInfo.name;
                    }
                    return this.f24199a;
                }
                return null;
            }
            return null;
        } finally {
        }
    }

    Intent c() {
        return (Intent) this.f24202d.poll();
    }

    boolean d(Context context) {
        if (this.f24201c == null) {
            this.f24201c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        this.f24200b.booleanValue();
        return this.f24201c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f24200b == null) {
            this.f24200b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.f24200b.booleanValue();
        return this.f24200b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        this.f24202d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
