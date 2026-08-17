package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import j3.C2768b;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j extends m {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static boolean f19728P = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Paint f19729J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Paint f19730K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Bitmap f19731L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private WeakReference f19732M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f19733N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private RectF f19734O;

    public j(Resources resources, Bitmap bitmap, Paint paint, boolean z10) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f19729J = paint2;
        Paint paint3 = new Paint(1);
        this.f19730K = paint3;
        this.f19734O = null;
        this.f19731L = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f19733N = z10;
    }

    public static boolean n() {
        return f19728P;
    }

    private void o() {
        Shader shader;
        WeakReference weakReference = this.f19732M;
        if (weakReference == null || weakReference.get() != this.f19731L) {
            this.f19732M = new WeakReference(this.f19731L);
            if (this.f19731L != null) {
                Paint paint = this.f19729J;
                Bitmap bitmap = this.f19731L;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f19785l = true;
            }
        }
        if (this.f19785l && (shader = this.f19729J.getShader()) != null) {
            shader.setLocalMatrix(this.f19774D);
            this.f19785l = false;
        }
        this.f19729J.setFilterBitmap(i());
    }

    @Override // com.facebook.drawee.drawable.m, com.facebook.drawee.drawable.i
    public void a(boolean z10) {
        this.f19733N = z10;
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C2768b.d()) {
            C2768b.a("RoundedBitmapDrawable#draw");
        }
        if (!k()) {
            super.draw(canvas);
            if (C2768b.d()) {
                C2768b.b();
                return;
            }
            return;
        }
        m();
        l();
        o();
        int iSave = canvas.save();
        canvas.concat(this.f19771A);
        if (this.f19733N || this.f19734O == null) {
            canvas.drawPath(this.f19784k, this.f19729J);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f19734O);
            canvas.drawPath(this.f19784k, this.f19729J);
            canvas.restoreToCount(iSave2);
        }
        float f10 = this.f19783j;
        if (f10 > 0.0f) {
            this.f19730K.setStrokeWidth(f10);
            this.f19730K.setColor(C1963e.c(this.f19786m, this.f19729J.getAlpha()));
            canvas.drawPath(this.f19787n, this.f19730K);
        }
        canvas.restoreToCount(iSave);
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    @Override // com.facebook.drawee.drawable.m
    boolean k() {
        return super.k() && this.f19731L != null;
    }

    @Override // com.facebook.drawee.drawable.m
    protected void m() {
        super.m();
        if (this.f19733N) {
            return;
        }
        if (this.f19734O == null) {
            this.f19734O = new RectF();
        }
        this.f19774D.mapRect(this.f19734O, this.f19793t);
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.f19729J.getAlpha()) {
            this.f19729J.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f19729J.setColorFilter(colorFilter);
    }
}
