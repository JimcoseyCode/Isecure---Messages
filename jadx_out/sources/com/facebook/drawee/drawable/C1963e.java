package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1963e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1963e f19706a = new C1963e();

    private C1963e() {
    }

    public static final void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static final int b(int i10) {
        int i11 = i10 >>> 24;
        if (i11 != 0) {
            return i11 != 255 ? -3 : -1;
        }
        return -2;
    }

    public static final int c(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Drawable drawable, Drawable.Callback callback, D d10) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        C c10 = drawable instanceof C ? (C) drawable : null;
        if (c10 != null) {
            c10.setTransformCallback(d10);
        }
    }

    public static final void e(Drawable drawable, C1962d c1962d) {
        if (drawable == null || c1962d == null) {
            return;
        }
        c1962d.a(drawable);
    }
}
