package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f19723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f19726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f19727k;

    public h(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f19723g = new Matrix();
        this.f19724h = i10 - (i10 % 90);
        this.f19725i = (i11 < 0 || i11 > 8) ? 0 : i11;
        this.f19726j = new Matrix();
        this.f19727k = new RectF();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        AbstractC2855l.g(canvas, "canvas");
        if (this.f19724h <= 0 && ((i10 = this.f19725i) == 0 || i10 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f19723g);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = this.f19725i;
        return (i10 == 5 || i10 == 7 || this.f19724h % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = this.f19725i;
        return (i10 == 5 || i10 == 7 || this.f19724h % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.g, com.facebook.drawee.drawable.D
    public void getTransform(Matrix transform) {
        AbstractC2855l.g(transform, "transform");
        getParentTransform(transform);
        if (this.f19723g.isIdentity()) {
            return;
        }
        transform.preConcat(this.f19723g);
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        int i10;
        AbstractC2855l.g(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i11 = this.f19724h;
        if (i11 <= 0 && ((i10 = this.f19725i) == 0 || i10 == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i12 = this.f19725i;
        if (i12 == 2) {
            this.f19723g.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            this.f19723g.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f19723g.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            this.f19723g.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            this.f19723g.setRotate(i11, bounds.centerX(), bounds.centerY());
        } else {
            this.f19723g.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f19723g.postScale(1.0f, -1.0f);
        }
        this.f19726j.reset();
        this.f19723g.invert(this.f19726j);
        this.f19727k.set(bounds);
        this.f19726j.mapRect(this.f19727k);
        RectF rectF = this.f19727k;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
