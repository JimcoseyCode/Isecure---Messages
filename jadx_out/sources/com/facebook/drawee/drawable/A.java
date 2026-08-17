package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class A extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f19684l = new A();

    private A() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void getTransformImpl(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fWidth = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
        float f14 = rect.top;
        matrix.setScale(f13, f13);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f14 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }
}
