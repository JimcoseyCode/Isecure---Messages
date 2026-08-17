package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f21138b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21139a;

    public e(Context context) {
        this.f21139a = context.getApplicationContext();
    }

    public static e a(Context context) {
        AbstractC3268i.k(context);
        synchronized (e.class) {
            try {
                if (f21138b == null) {
                    q.a(context);
                    f21138b = new e(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21138b;
    }

    static final m b(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        n nVar = new n(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            if (mVarArr[i10].equals(nVar)) {
                return mVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? b(packageInfo2, p.f21316a) : b(packageInfo2, p.f21316a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
