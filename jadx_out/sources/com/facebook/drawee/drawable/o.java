package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f19800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f19801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PointF f19802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f19805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Matrix f19806m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Drawable drawable, q scaleType) {
        super(drawable);
        AbstractC2855l.g(scaleType, "scaleType");
        this.f19806m = new Matrix();
        this.f19800g = scaleType;
    }

    private final void j() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f19803j == current.getIntrinsicWidth() && this.f19804k == current.getIntrinsicHeight()) {
            return;
        }
        i();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        j();
        if (this.f19805l == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f19805l);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.g, com.facebook.drawee.drawable.D
    public void getTransform(Matrix transform) {
        AbstractC2855l.g(transform, "transform");
        getParentTransform(transform);
        j();
        Matrix matrix = this.f19805l;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    public final void i() {
        float f10;
        Drawable current = getCurrent();
        if (current == null) {
            this.f19804k = 0;
            this.f19803j = 0;
            this.f19805l = null;
            return;
        }
        Rect bounds = getBounds();
        AbstractC2855l.f(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f19803j = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f19804k = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f19805l = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f19805l = null;
            return;
        }
        if (this.f19800g == q.f19807a) {
            current.setBounds(bounds);
            this.f19805l = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f19806m.reset();
        q qVar = this.f19800g;
        Matrix matrix = this.f19806m;
        PointF pointF = this.f19802i;
        float f11 = 0.5f;
        if (pointF != null) {
            AbstractC2855l.d(pointF);
            f10 = pointF.x;
        } else {
            f10 = 0.5f;
        }
        PointF pointF2 = this.f19802i;
        if (pointF2 != null) {
            AbstractC2855l.d(pointF2);
            f11 = pointF2.y;
        }
        qVar.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, f10, f11);
        this.f19805l = this.f19806m;
    }

    public final PointF k() {
        return this.f19802i;
    }

    public final q l() {
        return this.f19800g;
    }

    public final void m(PointF pointF) {
        if (c2.i.a(this.f19802i, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f19802i = null;
        } else {
            if (this.f19802i == null) {
                this.f19802i = new PointF();
            }
            PointF pointF2 = this.f19802i;
            AbstractC2855l.d(pointF2);
            pointF2.set(pointF);
        }
        i();
        invalidateSelf();
    }

    public final void n(q scaleType) {
        AbstractC2855l.g(scaleType, "scaleType");
        if (c2.i.a(this.f19800g, scaleType)) {
            return;
        }
        this.f19800g = scaleType;
        this.f19801h = null;
        i();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC2855l.g(bounds, "bounds");
        i();
    }

    @Override // com.facebook.drawee.drawable.g
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        i();
        return current;
    }
}
