package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j3.C2768b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends Drawable implements i, C {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    Matrix f19772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    Matrix f19773C;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private D f19779I;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Drawable f19780g;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float[] f19790q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    RectF f19795v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f19781h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f19782i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f19783j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Path f19784k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f19785l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f19786m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Path f19787n = new Path();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float[] f19788o = new float[8];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final float[] f19789p = new float[8];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final RectF f19791r = new RectF();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final RectF f19792s = new RectF();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final RectF f19793t = new RectF();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final RectF f19794u = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final Matrix f19796w = new Matrix();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final Matrix f19797x = new Matrix();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final Matrix f19798y = new Matrix();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final Matrix f19799z = new Matrix();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final Matrix f19771A = new Matrix();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final Matrix f19774D = new Matrix();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f19775E = 0.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f19776F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f19777G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f19778H = true;

    m(Drawable drawable) {
        this.f19780g = drawable;
    }

    private static Matrix g(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    private static boolean j(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // com.facebook.drawee.drawable.i
    public void b(boolean z10) {
        this.f19781h = z10;
        this.f19778H = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.i
    public void c(boolean z10) {
        if (this.f19777G != z10) {
            this.f19777G = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f19780g.clearColorFilter();
    }

    @Override // com.facebook.drawee.drawable.i
    public void d(boolean z10) {
        if (this.f19776F != z10) {
            this.f19776F = z10;
            this.f19778H = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C2768b.d()) {
            C2768b.a("RoundedDrawable#draw");
        }
        this.f19780g.draw(canvas);
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void e(float f10) {
        if (this.f19775E != f10) {
            this.f19775E = f10;
            this.f19778H = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void f(float f10) {
        c2.k.i(f10 >= 0.0f);
        Arrays.fill(this.f19788o, f10);
        this.f19782i = f10 != 0.0f;
        this.f19778H = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19780g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f19780g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19780g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19780g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f19780g.getOpacity();
    }

    @Override // com.facebook.drawee.drawable.i
    public void h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f19788o, 0.0f);
            this.f19782i = false;
        } else {
            c2.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f19788o, 0, 8);
            this.f19782i = false;
            for (int i10 = 0; i10 < 8; i10++) {
                this.f19782i |= fArr[i10] > 0.0f;
            }
        }
        this.f19778H = true;
        invalidateSelf();
    }

    public boolean i() {
        return this.f19777G;
    }

    boolean k() {
        return this.f19781h || this.f19782i || this.f19783j > 0.0f;
    }

    protected void l() {
        float[] fArr;
        if (this.f19778H) {
            this.f19787n.reset();
            RectF rectF = this.f19791r;
            float f10 = this.f19783j;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            if (this.f19781h) {
                this.f19787n.addCircle(this.f19791r.centerX(), this.f19791r.centerY(), Math.min(this.f19791r.width(), this.f19791r.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.f19789p;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.f19788o[i10] + this.f19775E) - (this.f19783j / 2.0f);
                    i10++;
                }
                this.f19787n.addRoundRect(this.f19791r, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f19791r;
            float f11 = this.f19783j;
            rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
            this.f19784k.reset();
            float f12 = this.f19775E + (this.f19776F ? this.f19783j : 0.0f);
            this.f19791r.inset(f12, f12);
            if (this.f19781h) {
                this.f19784k.addCircle(this.f19791r.centerX(), this.f19791r.centerY(), Math.min(this.f19791r.width(), this.f19791r.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f19776F) {
                if (this.f19790q == null) {
                    this.f19790q = new float[8];
                }
                for (int i11 = 0; i11 < this.f19789p.length; i11++) {
                    this.f19790q[i11] = this.f19788o[i11] - this.f19783j;
                }
                this.f19784k.addRoundRect(this.f19791r, this.f19790q, Path.Direction.CW);
            } else {
                this.f19784k.addRoundRect(this.f19791r, this.f19788o, Path.Direction.CW);
            }
            float f13 = -f12;
            this.f19791r.inset(f13, f13);
            this.f19784k.setFillType(Path.FillType.WINDING);
            this.f19778H = false;
        }
    }

    protected void m() {
        Matrix matrix;
        Matrix matrix2;
        D d10 = this.f19779I;
        if (d10 != null) {
            d10.getTransform(this.f19798y);
            this.f19779I.getRootBounds(this.f19791r);
        } else {
            this.f19798y.reset();
            this.f19791r.set(getBounds());
        }
        this.f19793t.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f19794u.set(this.f19780g.getBounds());
        Matrix matrix3 = this.f19796w;
        RectF rectF = this.f19793t;
        RectF rectF2 = this.f19794u;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f19776F) {
            RectF rectF3 = this.f19795v;
            if (rectF3 == null) {
                this.f19795v = new RectF(this.f19791r);
            } else {
                rectF3.set(this.f19791r);
            }
            RectF rectF4 = this.f19795v;
            float f10 = this.f19783j;
            rectF4.inset(f10, f10);
            if (this.f19772B == null) {
                this.f19772B = new Matrix();
            }
            this.f19772B.setRectToRect(this.f19791r, this.f19795v, scaleToFit);
        } else {
            Matrix matrix4 = this.f19772B;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f19798y.equals(this.f19799z) || !this.f19796w.equals(this.f19797x) || ((matrix2 = this.f19772B) != null && !j(matrix2, this.f19773C))) {
            this.f19785l = true;
            this.f19798y.invert(this.f19771A);
            this.f19774D.set(this.f19798y);
            if (this.f19776F && (matrix = this.f19772B) != null) {
                this.f19774D.postConcat(matrix);
            }
            this.f19774D.preConcat(this.f19796w);
            this.f19799z.set(this.f19798y);
            this.f19797x.set(this.f19796w);
            if (this.f19776F) {
                Matrix matrix5 = this.f19773C;
                if (matrix5 == null) {
                    this.f19773C = g(this.f19772B);
                } else {
                    matrix5.set(this.f19772B);
                }
            } else {
                Matrix matrix6 = this.f19773C;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f19791r.equals(this.f19792s)) {
            return;
        }
        this.f19778H = true;
        this.f19792s.set(this.f19791r);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f19780g.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f19780g.setAlpha(i10);
    }

    @Override // com.facebook.drawee.drawable.i
    public void setBorder(int i10, float f10) {
        if (this.f19786m == i10 && this.f19783j == f10) {
            return;
        }
        this.f19786m = i10;
        this.f19783j = f10;
        this.f19778H = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f19780g.setColorFilter(i10, mode);
    }

    @Override // com.facebook.drawee.drawable.C
    public void setTransformCallback(D d10) {
        this.f19779I = d10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19780g.setColorFilter(colorFilter);
    }

    public void a(boolean z10) {
    }
}
