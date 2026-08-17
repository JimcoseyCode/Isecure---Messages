package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class F extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SVGLength f24420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f24421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f24422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f24423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f24424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f24425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f24426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f24427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f24428t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f24429u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f24430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f24431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Matrix f24432x;

    public F(ReactContext reactContext) {
        super(reactContext);
        this.f24432x = new Matrix();
    }

    void n(Canvas canvas, Paint paint, float f10, N n10, float f11) {
        int iSaveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f24432x.reset();
        L l10 = n10.f24484b;
        this.f24432x.setTranslate((float) l10.f24473a, (float) l10.f24474b);
        double d10 = "auto".equals(this.f24425q) ? -1.0d : Double.parseDouble(this.f24425q);
        if (d10 == -1.0d) {
            d10 = n10.f24485c;
        }
        this.f24432x.preRotate(((float) d10) + 180.0f);
        if ("strokeWidth".equals(this.f24424p)) {
            Matrix matrix = this.f24432x;
            float f12 = this.mScale;
            matrix.preScale(f11 / f12, f11 / f12);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) relativeOnWidth(this.f24422n), (float) relativeOnHeight(this.f24423o));
        if (this.f24430v != null) {
            float f13 = this.f24426r;
            float f14 = this.mScale;
            float f15 = this.f24427s;
            Matrix matrixA = q0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f24428t) * f14, (f15 + this.f24429u) * f14), rectF, this.f24430v, this.f24431w);
            float[] fArr = new float[9];
            matrixA.getValues(fArr);
            this.f24432x.preScale(fArr[0], fArr[4]);
        }
        this.f24432x.preTranslate((float) (-relativeOnWidth(this.f24420l)), (float) (-relativeOnHeight(this.f24421m)));
        canvas.concat(this.f24432x);
        c(canvas, paint, f10);
        restoreCanvas(canvas, iSaveAndSetupCanvas);
    }

    public void o(Dynamic dynamic) {
        this.f24423o = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(String str) {
        this.f24424p = str;
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f24422n = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(String str) {
        this.f24425q = str;
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f24420l = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f24430v = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f24431w = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f24426r = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f24427s = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f24429u = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f24428t = f10;
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f24421m = SVGLength.b(dynamic);
        invalidate();
    }
}
