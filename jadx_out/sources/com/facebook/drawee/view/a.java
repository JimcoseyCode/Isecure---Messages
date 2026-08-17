package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.facebook.drawee.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class C0210a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19828b;
    }

    private static boolean a(int i10) {
        return i10 == 0 || i10 == -2;
    }

    public static void b(C0210a c0210a, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0210a.f19828b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0210a.f19827a) - i10) / f10) + i11), c0210a.f19828b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0210a.f19827a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0210a.f19828b) - i11) * f10) + i10), c0210a.f19827a), 1073741824);
        }
    }
}
