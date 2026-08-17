package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class q0 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Matrix a(RectF rectF, RectF rectF2, String str, int i10) {
        double d10;
        double d11;
        double d12;
        double d13 = rectF.left;
        double d14 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d15 = rectF2.left;
        double d16 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double dMax = dWidth2 / dWidth;
        double d17 = dHeight2 / dHeight;
        double d18 = d15 - (d13 * dMax);
        double d19 = d16 - (d14 * d17);
        if (i10 == 2) {
            dMax = Math.min(dMax, d17);
            if (dMax > 1.0d) {
                d10 = d18 - (((dWidth2 / dMax) - dWidth) / 2.0d);
                d12 = (dHeight2 / dMax) - dHeight;
            } else {
                d10 = d18 - ((dWidth2 - (dWidth * dMax)) / 2.0d);
                d12 = dHeight2 - (dHeight * dMax);
            }
            d11 = d19 - (d12 / 2.0d);
            d17 = dMax;
        } else {
            if (str.equals("none") || i10 != 0) {
                if (!str.equals("none") && i10 == 1) {
                    dMax = Math.max(dMax, d17);
                }
                double d20 = d15 - (d13 * dMax);
                double d21 = d16 - (d14 * d17);
                if (str.contains("xMid")) {
                    d20 += (dWidth2 - (dWidth * dMax)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d20 += dWidth2 - (dWidth * dMax);
                }
                d10 = d20;
                if (str.contains("YMid")) {
                    d21 += (dHeight2 - (dHeight * d17)) / 2.0d;
                }
                d11 = d21;
                if (str.contains("YMax")) {
                    d11 += dHeight2 - (dHeight * d17);
                }
            } else {
                dMax = Math.min(dMax, d17);
            }
            d17 = dMax;
            double d202 = d15 - (d13 * dMax);
            double d212 = d16 - (d14 * d17);
            if (str.contains("xMid")) {
            }
            if (str.contains("xMax")) {
            }
            d10 = d202;
            if (str.contains("YMid")) {
            }
            d11 = d212;
            if (str.contains("YMax")) {
            }
        }
        double d22 = d10;
        double d23 = d11;
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d22, (float) d23);
        matrix.preScale((float) dMax, (float) d17);
        return matrix;
    }
}
