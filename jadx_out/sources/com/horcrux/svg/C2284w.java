package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2284w extends AbstractC2266e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f24759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EnumC2283v f24760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC2283v f24761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final FilterRegion f24762j;

    public C2284w(ReactContext reactContext) {
        super(reactContext);
        this.f24759g = new HashMap();
        this.f24762j = new FilterRegion();
    }

    public Bitmap c(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.f24759g.clear();
        this.f24759g.put("SourceGraphic", bitmap);
        this.f24759g.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f24759g.put("BackgroundImage", bitmap2);
        this.f24759g.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect cropRect = this.f24762j.getCropRect(this, this.f24760h, rectF);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof AbstractC2278q) {
                AbstractC2278q abstractC2278q = (AbstractC2278q) childAt;
                bitmapCreateBitmap.eraseColor(0);
                FilterRegion filterRegion = abstractC2278q.f24721h;
                EnumC2283v enumC2283v = this.f24761i;
                Rect cropRect2 = filterRegion.getCropRect(abstractC2278q, enumC2283v, enumC2283v == EnumC2283v.USER_SPACE_ON_USE ? new RectF(cropRect) : rectF);
                canvas.drawBitmap(abstractC2278q.c(this.f24759g, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String strD = abstractC2278q.d();
                if (strD != null) {
                    this.f24759g.put(strD, bitmap);
                }
            }
        }
        bitmapCreateBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return bitmapCreateBitmap;
    }

    public void d(String str) {
        this.f24760h = EnumC2283v.j(str);
        invalidate();
    }

    public void e(Dynamic dynamic) {
        this.f24762j.setHeight(dynamic);
        invalidate();
    }

    public void f(String str) {
        this.f24761i = EnumC2283v.j(str);
        invalidate();
    }

    public void g(Dynamic dynamic) {
        this.f24762j.setWidth(dynamic);
        invalidate();
    }

    public void h(Dynamic dynamic) {
        this.f24762j.setX(dynamic);
        invalidate();
    }

    public void i(Dynamic dynamic) {
        this.f24762j.setY(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }
}
