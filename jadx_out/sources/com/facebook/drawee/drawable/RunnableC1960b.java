package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1960b extends g implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f19698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19699j;

    public RunnableC1960b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    private int i() {
        return (int) ((20.0f / this.f19696g) * 360.0f);
    }

    private void j() {
        if (this.f19699j) {
            return;
        }
        this.f19699j = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right - bounds.left;
        int i11 = bounds.bottom - bounds.top;
        float f10 = this.f19698i;
        if (!this.f19697h) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, r3 + (i10 / 2), r1 + (i11 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        j();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f19699j = false;
        this.f19698i += i();
        invalidateSelf();
    }

    public RunnableC1960b(Drawable drawable, int i10, boolean z10) {
        super((Drawable) c2.k.g(drawable));
        this.f19698i = 0.0f;
        this.f19699j = false;
        this.f19696g = i10;
        this.f19697h = z10;
    }
}
