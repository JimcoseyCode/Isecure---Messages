package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class B extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f19685l = new B();

    private B() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void getTransformImpl(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fMax;
        float fMax2;
        if (f13 > f12) {
            float f14 = i10 * f13;
            fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f10 * f14), 0.0f), rect.width() - f14);
            fMax2 = rect.top;
            f12 = f13;
        } else {
            fMax = rect.left;
            float f15 = i11 * f12;
            fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f11 * f15), 0.0f), rect.height() - f15) + rect.top;
        }
        matrix.setScale(f12, f12);
        matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
    }

    public String toString() {
        return "focus_crop";
    }
}
