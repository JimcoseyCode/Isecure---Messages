package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class c0 extends o0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private k0 f24590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private n0 f24591B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f24592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private m0 f24593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private l0 f24594y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private SVGLength f24595z;

    public c0(ReactContext reactContext) {
        super(reactContext);
        this.f24590A = k0.align;
        this.f24591B = n0.exact;
    }

    l0 E() {
        return this.f24594y;
    }

    m0 F() {
        return this.f24593x;
    }

    SVGLength G() {
        return this.f24595z;
    }

    Path H(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f24592w);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }

    public void I(String str) {
        this.f24592w = str;
        invalidate();
    }

    public void J(String str) {
        this.f24594y = l0.valueOf(str);
        invalidate();
    }

    public void K(String str) {
        this.f24593x = m0.valueOf(str);
        invalidate();
    }

    public void L(String str) {
        this.f24591B = n0.valueOf(str);
        invalidate();
    }

    public void M(Dynamic dynamic) {
        this.f24595z = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        c(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return p(canvas, paint);
    }

    @Override // com.horcrux.svg.o0
    public void y(String str) {
        this.f24590A = k0.valueOf(str);
        invalidate();
    }

    @Override // com.horcrux.svg.B
    void h() {
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B
    void i() {
    }
}
