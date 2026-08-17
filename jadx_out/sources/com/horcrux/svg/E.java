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
class E extends AbstractC2266e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f24412n = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f24413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SVGLength f24416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ReadableArray f24417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2262a.b f24418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f24419m;

    public E(ReactContext reactContext) {
        super(reactContext);
        this.f24419m = null;
    }

    public void c(ReadableArray readableArray) {
        this.f24417k = readableArray;
        invalidate();
    }

    public void d(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f24412n;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f24419m == null) {
                    this.f24419m = new Matrix();
                }
                this.f24419m.setValues(fArr);
            } else if (iC != -1) {
                AbstractC2325a.I(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f24419m = null;
        }
        invalidate();
    }

    public void e(int i10) {
        if (i10 == 0) {
            this.f24418l = C2262a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f24418l = C2262a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void f(Dynamic dynamic) {
        this.f24413g = SVGLength.b(dynamic);
        invalidate();
    }

    public void g(Dynamic dynamic) {
        this.f24415i = SVGLength.b(dynamic);
        invalidate();
    }

    public void h(Dynamic dynamic) {
        this.f24414h = SVGLength.b(dynamic);
        invalidate();
    }

    public void i(Dynamic dynamic) {
        this.f24416j = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C2262a c2262a = new C2262a(C2262a.EnumC0237a.LINEAR_GRADIENT, new SVGLength[]{this.f24413g, this.f24414h, this.f24415i, this.f24416j}, this.f24418l);
            c2262a.e(this.f24417k);
            Matrix matrix = this.f24419m;
            if (matrix != null) {
                c2262a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f24418l == C2262a.b.USER_SPACE_ON_USE) {
                c2262a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c2262a, this.mName);
        }
    }
}
