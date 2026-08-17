package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.SVGLength;
import d2.AbstractC2325a;

/* JADX INFO: renamed from: com.horcrux.svg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2262a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0237a f24563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SVGLength[] f24564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReadableArray f24565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Matrix f24568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f24569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private K f24570h;

    /* JADX INFO: renamed from: com.horcrux.svg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum EnumC0237a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* JADX INFO: renamed from: com.horcrux.svg.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    C2262a(EnumC0237a enumC0237a, SVGLength[] sVGLengthArr, b bVar) {
        this.f24563a = enumC0237a;
        this.f24564b = sVGLengthArr;
        this.f24566d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private RectF a(RectF rectF) {
        float f10;
        float f11;
        if (!this.f24566d) {
            rectF = new RectF(this.f24569g);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.f24566d) {
            f10 = rectF.left;
            f11 = rectF.top;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        return new RectF(f10, f11, fWidth + f10, fHeight + f11);
    }

    private double b(SVGLength sVGLength, double d10, float f10, float f11) {
        return M.a(sVGLength, d10, 0.0d, (this.f24566d && sVGLength.f24514b == SVGLength.UnitType.NUMBER) ? d10 : f10, f11);
    }

    private static void c(ReadableArray readableArray, int i10, float[] fArr, int[] iArr, float f10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            fArr[i11] = (float) readableArray.getDouble(i12);
            iArr[i11] = (readableArray.getInt(i12 + 1) & 16777215) | (Math.round((r1 >>> 24) * f10) << 24);
        }
    }

    void d(b bVar) {
        this.f24567e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    void e(ReadableArray readableArray) {
        this.f24565c = readableArray;
    }

    void f(Matrix matrix) {
        this.f24568f = matrix;
    }

    void g(K k10) {
        this.f24570h = k10;
    }

    void h(Rect rect) {
        this.f24569g = rect;
    }

    void i(Paint paint, RectF rectF, float f10, float f11) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d10;
        float f12;
        RectF rectFA = a(rectF);
        float fWidth = rectFA.width();
        float fHeight = rectFA.height();
        float f13 = rectFA.left;
        float f14 = rectFA.top;
        float textSize = paint.getTextSize();
        if (this.f24563a == EnumC0237a.PATTERN) {
            double d11 = fWidth;
            double dB = b(this.f24564b[0], d11, f10, textSize);
            double d12 = fHeight;
            double dB2 = b(this.f24564b[1], d12, f10, textSize);
            double dB3 = b(this.f24564b[2], d11, f10, textSize);
            double dB4 = b(this.f24564b[3], d12, f10, textSize);
            if (dB3 <= 1.0d || dB4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dB3, (int) dB4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF viewBox = this.f24570h.getViewBox();
            if (viewBox == null || viewBox.width() <= 0.0f || viewBox.height() <= 0.0f) {
                f12 = fHeight;
            } else {
                f12 = fHeight;
                RectF rectF2 = new RectF((float) dB, (float) dB2, (float) dB3, (float) dB4);
                K k10 = this.f24570h;
                canvas.concat(q0.a(viewBox, rectF2, k10.f24470v, k10.f24471w));
            }
            if (this.f24567e) {
                canvas.scale(fWidth / f10, f12 / f10);
            }
            this.f24570h.draw(canvas, new Paint(), f11);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f24568f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f24565c.size();
        if (size == 0) {
            AbstractC2325a.I(ReactConstants.TAG, "Gradient contains no stops");
            return;
        }
        int i10 = size / 2;
        int[] iArr3 = new int[i10];
        float[] fArr3 = new float[i10];
        c(this.f24565c, i10, fArr3, iArr3, f11);
        if (i10 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            AbstractC2325a.I(ReactConstants.TAG, "Gradient contains only one stop");
            fArr = fArr4;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        EnumC0237a enumC0237a = this.f24563a;
        if (enumC0237a == EnumC0237a.LINEAR_GRADIENT) {
            double d13 = fWidth;
            double d14 = f13;
            double dB5 = b(this.f24564b[0], d13, f10, textSize) + d14;
            double d15 = fHeight;
            double d16 = f14;
            LinearGradient linearGradient = new LinearGradient((float) dB5, (float) (b(this.f24564b[1], d15, f10, textSize) + d16), (float) (d14 + b(this.f24564b[2], d13, f10, textSize)), (float) (b(this.f24564b[3], d15, f10, textSize) + d16), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f24568f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f24568f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (enumC0237a == EnumC0237a.RADIAL_GRADIENT) {
            double d17 = fWidth;
            double dB6 = b(this.f24564b[2], d17, f10, textSize);
            double d18 = fHeight;
            double dB7 = b(this.f24564b[3], d18, f10, textSize);
            if (dB6 <= 0.0d || dB7 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                fArr2 = fArr6;
                dB6 = d17;
                d10 = d18;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d10 = dB7;
            }
            double d19 = d10 / dB6;
            RadialGradient radialGradient = new RadialGradient((float) (b(this.f24564b[4], d17, f10, textSize) + ((double) f13)), (float) (b(this.f24564b[5], d18 / d19, f10, textSize) + (((double) f14) / d19)), (float) dB6, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d19);
            Matrix matrix5 = this.f24568f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
