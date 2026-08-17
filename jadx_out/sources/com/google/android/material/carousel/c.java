package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f22982b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum a {
        CONTAINED,
        UNCONTAINED
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f22982b;
    }

    public float d() {
        return this.f22981a;
    }

    a e() {
        return a.CONTAINED;
    }

    void f(Context context) {
        float fH = this.f22981a;
        if (fH <= 0.0f) {
            fH = d.h(context);
        }
        this.f22981a = fH;
        float fG = this.f22982b;
        if (fG <= 0.0f) {
            fG = d.g(context);
        }
        this.f22982b = fG;
    }

    public abstract e g(V4.a aVar, View view);

    public abstract boolean h(V4.a aVar, int i10);
}
