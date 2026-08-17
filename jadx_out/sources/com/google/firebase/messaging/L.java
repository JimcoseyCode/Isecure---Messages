package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import n5.C2970e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24156e = 0;

    L(Context context) {
        this.f24152a = context;
    }

    static String c(C2970e c2970e) {
        String strD = c2970e.m().d();
        if (strD != null) {
            return strD;
        }
        String strC = c2970e.m().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f24152a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f24152a.getPackageName());
        if (packageInfoF != null) {
            this.f24153b = Integer.toString(packageInfoF.versionCode);
            this.f24154c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f24153b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f24153b;
    }

    synchronized String b() {
        try {
            if (this.f24154c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f24154c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f24155d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f24155d = packageInfoF.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f24155d;
    }

    synchronized int e() {
        int i10 = this.f24156e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f24152a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!y4.l.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f24156e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f24156e = 2;
            return 2;
        }
        if (y4.l.g()) {
            this.f24156e = 2;
        } else {
            this.f24156e = 1;
        }
        return this.f24156e;
    }

    boolean g() {
        return e() != 0;
    }
}
