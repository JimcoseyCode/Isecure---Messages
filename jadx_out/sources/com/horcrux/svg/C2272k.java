package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2272k extends AbstractC2278q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f24669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    EnumC2281t f24670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ReadableArray f24671k;

    /* JADX INFO: renamed from: com.horcrux.svg.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24672a;

        static {
            int[] iArr = new int[EnumC2281t.values().length];
            f24672a = iArr;
            try {
                iArr[EnumC2281t.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24672a[EnumC2281t.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24672a[EnumC2281t.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24672a[EnumC2281t.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2272k(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC2278q
    public Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapE = AbstractC2278q.e(map, bitmap, this.f24669i);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i10 = a.f24672a[this.f24670j.ordinal()];
        if (i10 == 1) {
            if (this.f24671k.size() >= 20) {
                float[] fArr = new float[this.f24671k.size()];
                for (int i11 = 0; i11 < this.f24671k.size(); i11++) {
                    fArr[i11] = ((float) this.f24671k.getDouble(i11)) * (i11 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapE);
            }
            return bitmapE;
        }
        if (i10 == 2) {
            if (this.f24671k.size() == 1) {
                colorMatrix.setSaturation((float) this.f24671k.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapE);
            }
            return bitmapE;
        }
        if (i10 == 3) {
            if (this.f24671k.size() == 1) {
                double d10 = (((double) ((float) this.f24671k.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d10);
                float fSin = (float) Math.sin(d10);
                float f10 = 0.715f - (fCos * 0.715f);
                float f11 = fSin * 0.715f;
                float f12 = 0.072f - (fCos * 0.072f);
                float f13 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f10 - f11, f12 + (fSin * 0.928f), 0.0f, 0.0f, f13 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f12 - (0.283f * fSin), 0.0f, 0.0f, f13 - (0.787f * fSin), f10 + f11, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            }
            return bitmapE;
        }
        if (i10 == 4) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapE);
    }

    public void k(String str) {
        this.f24669i = str;
        invalidate();
    }

    public void l(String str) {
        this.f24670j = EnumC2281t.j(str);
        invalidate();
    }

    public void m(ReadableArray readableArray) {
        this.f24671k = readableArray;
        invalidate();
    }
}
