package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2277p extends AbstractC2278q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f24712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    SVGLength f24713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    SVGLength f24714k;

    public C2277p(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC2278q
    public Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapE = AbstractC2278q.e(map, bitmap, this.f24712i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SVGLength sVGLength = this.f24713j;
        float fRelativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.f24714k;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float fWidth = rectF.left;
        if (fWidth >= 0.0f) {
            fWidth = rectF.width();
        }
        float fHeight = rectF.top;
        if (fHeight >= 0.0f) {
            fHeight = rectF.height();
        }
        canvas.drawBitmap(bitmapE, fWidth, fHeight, (Paint) null);
        return bitmapCreateBitmap;
    }

    public void k(Dynamic dynamic) {
        this.f24713j = SVGLength.b(dynamic);
        invalidate();
    }

    public void l(Dynamic dynamic) {
        this.f24714k = SVGLength.b(dynamic);
        invalidate();
    }

    public void m(String str) {
        this.f24712i = str;
        invalidate();
    }
}
