package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2271j extends AbstractC2278q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f24662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f24663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    EnumC2280s f24664k;

    /* JADX INFO: renamed from: com.horcrux.svg.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24665a;

        static {
            int[] iArr = new int[EnumC2280s.values().length];
            f24665a = iArr;
            try {
                iArr[EnumC2280s.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24665a[EnumC2280s.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24665a[EnumC2280s.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24665a[EnumC2280s.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24665a[EnumC2280s.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24665a[EnumC2280s.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C2271j(ReactContext reactContext) {
        super(reactContext);
        this.f24721h.mX = new SVGLength(0.0d);
        this.f24721h.mY = new SVGLength(0.0d);
        this.f24721h.mW = new SVGLength("100%");
        this.f24721h.mH = new SVGLength("100%");
    }

    public static /* synthetic */ float[] k(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = 1.0f - f10;
        float f12 = fArr2[0];
        float f13 = 1.0f - f12;
        float f14 = fArr[1] * f10;
        float f15 = fArr2[1];
        float f16 = (f14 * f13) + (f15 * f12 * f11) + (f14 * f15 * f12);
        float f17 = fArr[2] * f10;
        float f18 = fArr2[2];
        float f19 = fArr[3] * f10;
        float f20 = fArr2[3];
        return new float[]{1.0f - (f11 * f13), f16, (f17 * f13) + (f18 * f12 * f11) + (f17 * f18 * f12), (f13 * f19) + (f20 * f12 * f11) + (f19 * f20 * f12)};
    }

    @Override // com.horcrux.svg.AbstractC2278q
    public Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapE = AbstractC2278q.e(map, bitmap, this.f24662i);
        Bitmap bitmapE2 = AbstractC2278q.e(map, bitmap, this.f24663j);
        if (this.f24664k == EnumC2280s.MULTIPLY) {
            return CustomFilter.apply(bitmapE, bitmapE2, new InterfaceC2265d() { // from class: com.horcrux.svg.i
                @Override // com.horcrux.svg.InterfaceC2265d
                public final float[] a(float[] fArr, float[] fArr2) {
                    return C2271j.k(fArr, fArr2);
                }
            });
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapE.getWidth(), bitmapE.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapE, 0.0f, 0.0f, paint);
        int i10 = a.f24665a[this.f24664k.ordinal()];
        if (i10 == 1 || i10 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i10 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i10 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(bitmapE2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public void l(String str) {
        this.f24662i = str;
        invalidate();
    }

    public void m(String str) {
        this.f24663j = str;
        invalidate();
    }

    public void n(String str) {
        this.f24664k = EnumC2280s.j(str);
        invalidate();
    }
}
