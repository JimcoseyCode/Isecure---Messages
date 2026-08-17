package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f19192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f19193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final File f19194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile S f19195h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19198c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f19199d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19196a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f19192e = i10 < 29;
        f19193f = i10 >= 28;
        f19194g = new File("/proc/self/fd");
    }

    S() {
    }

    private boolean a() {
        return f19192e && !this.f19199d.get();
    }

    public static S b() {
        if (f19195h == null) {
            synchronized (S.class) {
                try {
                    if (f19195h == null) {
                        f19195h = new S();
                    }
                } finally {
                }
            }
        }
        return f19195h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f19196a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f19197b + 1;
            this.f19197b = i10;
            if (i10 >= 50) {
                this.f19197b = 0;
                if (f19194g.list().length >= c()) {
                    z10 = false;
                }
                this.f19198c = z10;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19198c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        return z10 && f19193f && !a() && !z11 && i10 >= 0 && i11 >= 0 && d();
    }

    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zF = f(i10, i11, z10, z11);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        Q1.l.b();
        this.f19199d.set(true);
    }
}
