package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2273l extends AbstractC2278q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f24676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f24677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f24678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f24679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f24680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f24681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    EnumC2282u f24682o;

    /* JADX INFO: renamed from: com.horcrux.svg.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24683a;

        static {
            int[] iArr = new int[EnumC2282u.values().length];
            f24683a = iArr;
            try {
                iArr[EnumC2282u.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24683a[EnumC2282u.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24683a[EnumC2282u.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24683a[EnumC2282u.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24683a[EnumC2282u.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24683a[EnumC2282u.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C2273l(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC2278q
    public Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapE = AbstractC2278q.e(map, bitmap, this.f24676i);
        Bitmap bitmapE2 = AbstractC2278q.e(map, bitmap, this.f24677j);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapE.getWidth(), bitmapE.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapE, 0.0f, 0.0f, paint);
        switch (a.f24683a[this.f24682o.ordinal()]) {
            case 1:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
                int[] iArr = new int[width];
                bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                int width2 = bitmapCreateBitmap.getWidth();
                int width3 = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                int[] iArr2 = new int[width];
                bitmapE2.getPixels(iArr2, 0, width2, 0, 0, width3, height);
                int i10 = 0;
                while (i10 < width) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    int i13 = width;
                    int[] iArr3 = iArr2;
                    float f10 = this.f24678k;
                    float f11 = (i11 >> 16) & 255;
                    float f12 = (i12 >> 16) & 255;
                    float f13 = f10 * f11 * f12;
                    float f14 = this.f24679l;
                    float f15 = f13 + (f11 * f14);
                    float f16 = this.f24680m;
                    float f17 = f15 + (f12 * f16);
                    float f18 = this.f24681n;
                    int i14 = (int) (f17 + f18);
                    float f19 = (i11 >> 8) & 255;
                    float f20 = (i12 >> 8) & 255;
                    int i15 = (int) ((f10 * f19 * f20) + (f19 * f14) + (f20 * f16) + f18);
                    float f21 = i11 & 255;
                    float f22 = i12 & 255;
                    int i16 = (int) ((f10 * f21 * f22) + (f21 * f14) + (f22 * f16) + f18);
                    float f23 = i11 >>> 24;
                    float f24 = i12 >>> 24;
                    int i17 = (int) ((f10 * f23 * f24) + (f23 * f14) + (f16 * f24) + f18);
                    int iMin = Math.min(255, Math.max(0, i14));
                    iArr[i10] = (Math.min(255, Math.max(0, i15)) << 8) | (iMin << 16) | (Math.min(255, Math.max(0, i17)) << 24) | Math.min(255, Math.max(0, i16));
                    i10++;
                    width = i13;
                    iArr2 = iArr3;
                }
                int width4 = bitmapCreateBitmap.getWidth();
                int width5 = bitmapCreateBitmap.getWidth();
                bitmapCreateBitmap = bitmapCreateBitmap;
                bitmapCreateBitmap.setPixels(iArr, 0, width4, 0, 0, width5, bitmapCreateBitmap.getHeight());
                break;
        }
        if (this.f24682o != EnumC2282u.ARITHMETIC) {
            canvas.drawBitmap(bitmapE2, 0.0f, 0.0f, paint);
        }
        return bitmapCreateBitmap;
    }

    public void k(String str) {
        this.f24676i = str;
        invalidate();
    }

    public void l(String str) {
        this.f24677j = str;
        invalidate();
    }

    public void m(Float f10) {
        this.f24678k = f10.floatValue();
        invalidate();
    }

    public void n(Float f10) {
        this.f24679l = f10.floatValue();
        invalidate();
    }

    public void o(Float f10) {
        this.f24680m = f10.floatValue();
        invalidate();
    }

    public void p(Float f10) {
        this.f24681n = f10.floatValue();
        invalidate();
    }

    public void q(String str) {
        this.f24682o = EnumC2282u.j(str);
        invalidate();
    }
}
