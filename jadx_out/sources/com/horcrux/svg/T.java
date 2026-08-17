package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class T extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f24554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f24555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f24556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f24557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f24558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f24559q;

    public T(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        saveDefinition();
    }

    void n(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        if (this.f24558p != null) {
            float f13 = this.f24554l;
            float f14 = this.mScale;
            float f15 = this.f24555m;
            canvas.concat(q0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f24556n) * f14, (f15 + this.f24557o) * f14), new RectF(0.0f, 0.0f, f11, f12), this.f24558p, this.f24559q));
            super.draw(canvas, paint, f10);
        }
    }

    public void setAlign(String str) {
        this.f24558p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f24559q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f24554l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f24555m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f24557o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f24556n = f10;
        invalidate();
    }
}
