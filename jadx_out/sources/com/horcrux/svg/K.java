package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C2262a;
import d2.AbstractC2325a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class K extends B {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float[] f24459y = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SVGLength f24460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f24461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f24462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f24463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2262a.b f24464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C2262a.b f24465q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f24466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f24467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f24468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f24469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f24470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f24471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Matrix f24472x;

    public K(ReactContext reactContext) {
        super(reactContext);
        this.f24472x = null;
    }

    RectF getViewBox() {
        float f10 = this.f24466r;
        float f11 = this.mScale;
        float f12 = this.f24467s;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.f24468t) * f11, (f12 + this.f24469u) * f11);
    }

    public void n(Dynamic dynamic) {
        this.f24463o = SVGLength.b(dynamic);
        invalidate();
    }

    public void o(int i10) {
        if (i10 == 0) {
            this.f24465q = C2262a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f24465q = C2262a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void p(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f24459y;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f24472x == null) {
                    this.f24472x = new Matrix();
                }
                this.f24472x.setValues(fArr);
            } else if (iC != -1) {
                AbstractC2325a.I(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f24472x = null;
        }
        invalidate();
    }

    public void q(int i10) {
        if (i10 == 0) {
            this.f24464p = C2262a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f24464p = C2262a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f24462n = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f24460l = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C2262a c2262a = new C2262a(C2262a.EnumC0237a.PATTERN, new SVGLength[]{this.f24460l, this.f24461m, this.f24462n, this.f24463o}, this.f24464p);
            c2262a.d(this.f24465q);
            c2262a.g(this);
            Matrix matrix = this.f24472x;
            if (matrix != null) {
                c2262a.f(matrix);
            }
            SvgView svgView = getSvgView();
            C2262a.b bVar = this.f24464p;
            C2262a.b bVar2 = C2262a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f24465q == bVar2) {
                c2262a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c2262a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f24470v = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f24471w = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f24466r = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f24467s = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f24469u = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f24468t = f10;
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f24461m = SVGLength.b(dynamic);
        invalidate();
    }
}
