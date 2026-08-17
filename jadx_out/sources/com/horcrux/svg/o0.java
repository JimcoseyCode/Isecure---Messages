package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class o0 extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    SVGLength f24701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    SVGLength f24702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f24703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    j0 f24704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d0 f24705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList f24706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList f24707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList f24708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f24709t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f24710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    double f24711v;

    public o0(ReactContext reactContext) {
        super(reactContext);
        this.f24701l = null;
        this.f24702m = null;
        this.f24703n = null;
        this.f24704o = j0.spacing;
        this.f24711v = Double.NaN;
    }

    public void A(Dynamic dynamic) {
        this.f24707r = SVGLength.a(dynamic);
        invalidate();
    }

    public void B(Dynamic dynamic) {
        this.f24708s = SVGLength.a(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f24702m = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        String strC = SVGLength.c(dynamic);
        if (strC != null) {
            String strTrim = strC.trim();
            int iLastIndexOf = strTrim.lastIndexOf(32);
            try {
                this.f24705p = d0.j(strTrim.substring(iLastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f24705p = d0.baseline;
            }
            try {
                this.f24703n = strTrim.substring(0, iLastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f24703n = null;
            }
        } else {
            this.f24705p = d0.baseline;
            this.f24703n = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void clearCache() {
        this.f24711v = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        m(canvas);
        clip(canvas, paint);
        p(canvas, paint);
        i();
        c(canvas, paint, f10);
        h();
    }

    @Override // com.horcrux.svg.B
    Path f(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        m(canvas);
        return p(canvas, paint);
    }

    @Override // com.horcrux.svg.B
    void i() {
        g().p(((this instanceof c0) || (this instanceof b0)) ? false : true, this, this.f24392g, this.f24706q, this.f24707r, this.f24709t, this.f24710u, this.f24708s);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        s().clearChildCache();
    }

    d0 n() {
        d0 d0Var;
        if (this.f24705p == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof o0) && (d0Var = ((o0) parent).f24705p) != null) {
                    this.f24705p = d0Var;
                    return d0Var;
                }
            }
        }
        if (this.f24705p == null) {
            this.f24705p = d0.baseline;
        }
        return this.f24705p;
    }

    String o() {
        String str;
        if (this.f24703n == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof o0) && (str = ((o0) parent).f24703n) != null) {
                    this.f24703n = str;
                    return str;
                }
            }
        }
        return this.f24703n;
    }

    Path p(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        i();
        this.mPath = super.getPath(canvas, paint);
        h();
        return this.mPath;
    }

    double q(Paint paint) {
        if (!Double.isNaN(this.f24711v)) {
            return this.f24711v;
        }
        double dQ = 0.0d;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof o0) {
                dQ += ((o0) childAt).q(paint);
            }
        }
        this.f24711v = dQ;
        return dQ;
    }

    o0 r() {
        ArrayList arrayList = g().f24802a;
        ViewParent parent = getParent();
        o0 o0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof o0) && ((C2285x) arrayList.get(size)).f24773j != h0.start && o0Var.f24706q == null; size--) {
            o0Var = (o0) parent;
            parent = o0Var.getParent();
        }
        return o0Var;
    }

    o0 s() {
        ViewParent parent = getParent();
        o0 o0Var = this;
        while (parent instanceof o0) {
            o0Var = (o0) parent;
            parent = o0Var.getParent();
        }
        return o0Var;
    }

    public void t(Dynamic dynamic) {
        this.f24703n = SVGLength.c(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f24709t = SVGLength.a(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f24710u = SVGLength.a(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f24701l = SVGLength.b(dynamic);
        invalidate();
    }

    public void x(String str) {
        this.f24704o = j0.valueOf(str);
        invalidate();
    }

    public void y(String str) {
        this.f24705p = d0.j(str);
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f24706q = SVGLength.a(dynamic);
        invalidate();
    }
}
