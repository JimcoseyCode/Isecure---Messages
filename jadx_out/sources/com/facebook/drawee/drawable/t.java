package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class t extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f19820l = new t();

    private t() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void getTransformImpl(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fMin = Math.min(Math.min(f12, f13), 1.0f);
        float fWidth = rect.left + ((rect.width() - (i10 * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i11 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "center_inside";
    }
}
