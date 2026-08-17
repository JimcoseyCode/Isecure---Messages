package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l extends g implements i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    b f19750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f19751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f19752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Matrix f19753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f19754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final float[] f19755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Paint f19756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f19758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f19761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Path f19764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Path f19765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RectF f19766w;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19767a;

        static {
            int[] iArr = new int[b.values().length];
            f19767a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19767a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public l(Drawable drawable) {
        super((Drawable) c2.k.g(drawable));
        this.f19750g = b.OVERLAY_COLOR;
        this.f19751h = new RectF();
        this.f19754k = new float[8];
        this.f19755l = new float[8];
        this.f19756m = new Paint(1);
        this.f19757n = false;
        this.f19758o = 0.0f;
        this.f19759p = 0;
        this.f19760q = 0;
        this.f19761r = 0.0f;
        this.f19762s = false;
        this.f19763t = false;
        this.f19764u = new Path();
        this.f19765v = new Path();
        this.f19766w = new RectF();
    }

    private void k() {
        float[] fArr;
        this.f19764u.reset();
        this.f19765v.reset();
        this.f19766w.set(getBounds());
        RectF rectF = this.f19766w;
        float f10 = this.f19761r;
        rectF.inset(f10, f10);
        if (this.f19750g == b.OVERLAY_COLOR) {
            this.f19764u.addRect(this.f19766w, Path.Direction.CW);
        }
        if (this.f19757n) {
            this.f19764u.addCircle(this.f19766w.centerX(), this.f19766w.centerY(), Math.min(this.f19766w.width(), this.f19766w.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f19764u.addRoundRect(this.f19766w, this.f19754k, Path.Direction.CW);
        }
        RectF rectF2 = this.f19766w;
        float f11 = this.f19761r;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f19766w;
        float f12 = this.f19758o;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f19757n) {
            this.f19765v.addCircle(this.f19766w.centerX(), this.f19766w.centerY(), Math.min(this.f19766w.width(), this.f19766w.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f19755l;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.f19754k[i10] + this.f19761r) - (this.f19758o / 2.0f);
                i10++;
            }
            this.f19765v.addRoundRect(this.f19766w, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f19766w;
        float f13 = this.f19758o;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.i
    public void b(boolean z10) {
        this.f19757n = z10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.i
    public void c(boolean z10) {
        if (this.f19763t != z10) {
            this.f19763t = z10;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void d(boolean z10) {
        this.f19762s = z10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f19751h.set(getBounds());
        int i10 = a.f19767a[this.f19750g.ordinal()];
        if (i10 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f19764u);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i10 == 2) {
            if (this.f19762s) {
                RectF rectF = this.f19752i;
                if (rectF == null) {
                    this.f19752i = new RectF(this.f19751h);
                    this.f19753j = new Matrix();
                } else {
                    rectF.set(this.f19751h);
                }
                RectF rectF2 = this.f19752i;
                float f10 = this.f19758o;
                rectF2.inset(f10, f10);
                Matrix matrix = this.f19753j;
                if (matrix != null) {
                    matrix.setRectToRect(this.f19751h, this.f19752i, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f19751h);
                canvas.concat(this.f19753j);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f19756m.setStyle(Paint.Style.FILL);
            this.f19756m.setColor(this.f19760q);
            this.f19756m.setStrokeWidth(0.0f);
            this.f19756m.setFilterBitmap(i());
            this.f19764u.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f19764u, this.f19756m);
            if (this.f19757n) {
                float fWidth = ((this.f19751h.width() - this.f19751h.height()) + this.f19758o) / 2.0f;
                float fHeight = ((this.f19751h.height() - this.f19751h.width()) + this.f19758o) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f19751h;
                    float f11 = rectF3.left;
                    canvas.drawRect(f11, rectF3.top, f11 + fWidth, rectF3.bottom, this.f19756m);
                    RectF rectF4 = this.f19751h;
                    float f12 = rectF4.right;
                    canvas.drawRect(f12 - fWidth, rectF4.top, f12, rectF4.bottom, this.f19756m);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f19751h;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    canvas.drawRect(f13, f14, rectF5.right, f14 + fHeight, this.f19756m);
                    RectF rectF6 = this.f19751h;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas.drawRect(f15, f16 - fHeight, rectF6.right, f16, this.f19756m);
                }
            }
        }
        if (this.f19759p != 0) {
            this.f19756m.setStyle(Paint.Style.STROKE);
            this.f19756m.setColor(this.f19759p);
            this.f19756m.setStrokeWidth(this.f19758o);
            this.f19764u.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f19765v, this.f19756m);
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void e(float f10) {
        this.f19761r = f10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.i
    public void f(float f10) {
        Arrays.fill(this.f19754k, f10);
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.i
    public void h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f19754k, 0.0f);
        } else {
            c2.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f19754k, 0, 8);
        }
        k();
        invalidateSelf();
    }

    public boolean i() {
        return this.f19763t;
    }

    public void j(int i10) {
        this.f19760q = i10;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k();
    }

    @Override // com.facebook.drawee.drawable.i
    public void setBorder(int i10, float f10) {
        this.f19759p = i10;
        this.f19758o = f10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.i
    public void a(boolean z10) {
    }
}
