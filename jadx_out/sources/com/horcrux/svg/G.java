package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C2262a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class G extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    SVGLength f24433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    SVGLength f24434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    SVGLength f24435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    SVGLength f24436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2262a.b f24437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C2262a.b f24438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    a f24439r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum a {
        LUMINANCE,
        ALPHA
    }

    public G(ReactContext reactContext) {
        super(reactContext);
    }

    public a n() {
        return this.f24439r;
    }

    public C2262a.b o() {
        return this.f24437p;
    }

    public void p(Dynamic dynamic) {
        this.f24436o = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(int i10) {
        if (i10 == 0) {
            this.f24438q = C2262a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f24438q = C2262a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void r(int i10) {
        if (i10 == 0) {
            this.f24439r = a.LUMINANCE;
        } else if (i10 == 1) {
            this.f24439r = a.ALPHA;
        }
        invalidate();
    }

    public void s(int i10) {
        if (i10 == 0) {
            this.f24437p = C2262a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f24437p = C2262a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    public void t(Dynamic dynamic) {
        this.f24435n = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f24433l = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f24434m = SVGLength.b(dynamic);
        invalidate();
    }
}
