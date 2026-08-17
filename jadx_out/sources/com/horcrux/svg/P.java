package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C2262a;
import d2.AbstractC2325a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class P extends AbstractC2266e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float[] f24492p = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f24493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SVGLength f24496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SVGLength f24497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SVGLength f24498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ReadableArray f24499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2262a.b f24500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Matrix f24501o;

    public P(ReactContext reactContext) {
        super(reactContext);
        this.f24501o = null;
    }

    public void c(Dynamic dynamic) {
        this.f24497k = SVGLength.b(dynamic);
        invalidate();
    }

    public void d(Dynamic dynamic) {
        this.f24498l = SVGLength.b(dynamic);
        invalidate();
    }

    public void e(Dynamic dynamic) {
        this.f24493g = SVGLength.b(dynamic);
        invalidate();
    }

    public void f(Dynamic dynamic) {
        this.f24494h = SVGLength.b(dynamic);
        invalidate();
    }

    public void g(ReadableArray readableArray) {
        this.f24499m = readableArray;
        invalidate();
    }

    public void h(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f24492p;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f24501o == null) {
                    this.f24501o = new Matrix();
                }
                this.f24501o.setValues(fArr);
            } else if (iC != -1) {
                AbstractC2325a.I(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f24501o = null;
        }
        invalidate();
    }

    public void i(int i10) {
        if (i10 == 0) {
            this.f24500n = C2262a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f24500n = C2262a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void j(Dynamic dynamic) {
        this.f24495i = SVGLength.b(dynamic);
        invalidate();
    }

    public void k(Dynamic dynamic) {
        this.f24496j = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C2262a c2262a = new C2262a(C2262a.EnumC0237a.RADIAL_GRADIENT, new SVGLength[]{this.f24493g, this.f24494h, this.f24495i, this.f24496j, this.f24497k, this.f24498l}, this.f24500n);
            c2262a.e(this.f24499m);
            Matrix matrix = this.f24501o;
            if (matrix != null) {
                c2262a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f24500n == C2262a.b.USER_SPACE_ON_USE) {
                c2262a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c2262a, this.mName);
        }
    }
}
