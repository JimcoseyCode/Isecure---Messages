package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k extends Drawable implements i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f19737i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f19735g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float[] f19736h = new float[8];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Paint f19738j = new Paint(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19739k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f19740l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f19741m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19742n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19743o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19744p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Path f19745q = new Path();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Path f19746r = new Path();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19747s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RectF f19748t = new RectF();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f19749u = 255;

    public k(int i10) {
        j(i10);
    }

    public static k g(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void k() {
        float[] fArr;
        float[] fArr2;
        this.f19745q.reset();
        this.f19746r.reset();
        this.f19748t.set(getBounds());
        RectF rectF = this.f19748t;
        float f10 = this.f19740l;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        int i10 = 0;
        if (this.f19739k) {
            this.f19746r.addCircle(this.f19748t.centerX(), this.f19748t.centerY(), Math.min(this.f19748t.width(), this.f19748t.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f19736h;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f19735g[i11] + this.f19741m) - (this.f19740l / 2.0f);
                i11++;
            }
            this.f19746r.addRoundRect(this.f19748t, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f19748t;
        float f11 = this.f19740l;
        rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f19741m + (this.f19743o ? this.f19740l : 0.0f);
        this.f19748t.inset(f12, f12);
        if (this.f19739k) {
            this.f19745q.addCircle(this.f19748t.centerX(), this.f19748t.centerY(), Math.min(this.f19748t.width(), this.f19748t.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f19743o) {
            if (this.f19737i == null) {
                this.f19737i = new float[8];
            }
            while (true) {
                fArr2 = this.f19737i;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = this.f19735g[i10] - this.f19740l;
                i10++;
            }
            this.f19745q.addRoundRect(this.f19748t, fArr2, Path.Direction.CW);
        } else {
            this.f19745q.addRoundRect(this.f19748t, this.f19735g, Path.Direction.CW);
        }
        float f13 = -f12;
        this.f19748t.inset(f13, f13);
    }

    @Override // com.facebook.drawee.drawable.i
    public void b(boolean z10) {
        this.f19739k = z10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.i
    public void c(boolean z10) {
        if (this.f19744p != z10) {
            this.f19744p = z10;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void d(boolean z10) {
        if (this.f19743o != z10) {
            this.f19743o = z10;
            k();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f19738j.setColor(C1963e.c(this.f19747s, this.f19749u));
        this.f19738j.setStyle(Paint.Style.FILL);
        this.f19738j.setFilterBitmap(i());
        canvas.drawPath(this.f19745q, this.f19738j);
        if (this.f19740l != 0.0f) {
            this.f19738j.setColor(C1963e.c(this.f19742n, this.f19749u));
            this.f19738j.setStyle(Paint.Style.STROKE);
            this.f19738j.setStrokeWidth(this.f19740l);
            canvas.drawPath(this.f19746r, this.f19738j);
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void e(float f10) {
        if (this.f19741m != f10) {
            this.f19741m = f10;
            k();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void f(float f10) {
        c2.k.c(f10 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f19735g, f10);
        k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19749u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C1963e.b(C1963e.c(this.f19747s, this.f19749u));
    }

    @Override // com.facebook.drawee.drawable.i
    public void h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f19735g, 0.0f);
        } else {
            c2.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f19735g, 0, 8);
        }
        k();
        invalidateSelf();
    }

    public boolean i() {
        return this.f19744p;
    }

    public void j(int i10) {
        if (this.f19747s != i10) {
            this.f19747s = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f19749u) {
            this.f19749u = i10;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void setBorder(int i10, float f10) {
        if (this.f19742n != i10) {
            this.f19742n = i10;
            invalidateSelf();
        }
        if (this.f19740l != f10) {
            this.f19740l = f10;
            k();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.i
    public void a(boolean z10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
