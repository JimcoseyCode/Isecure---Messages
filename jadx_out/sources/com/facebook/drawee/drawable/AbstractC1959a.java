package com.facebook.drawee.drawable;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1959a extends Drawable implements Drawable.Callback, D, C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private D f19686g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Drawable[] f19688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC1961c[] f19689j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1962d f19687h = new C1962d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f19690k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19691l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19692m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19693n = false;

    /* JADX INFO: renamed from: com.facebook.drawee.drawable.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0209a implements InterfaceC1961c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f19694g;

        C0209a(int i10) {
            this.f19694g = i10;
        }

        @Override // com.facebook.drawee.drawable.InterfaceC1961c
        public Drawable getDrawable() {
            return AbstractC1959a.this.b(this.f19694g);
        }

        @Override // com.facebook.drawee.drawable.InterfaceC1961c
        public Drawable setDrawable(Drawable drawable) {
            return AbstractC1959a.this.e(this.f19694g, drawable);
        }
    }

    public AbstractC1959a(Drawable[] drawableArr) {
        int i10 = 0;
        c2.k.g(drawableArr);
        this.f19688i = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f19688i;
            if (i10 >= drawableArr2.length) {
                this.f19689j = new InterfaceC1961c[drawableArr2.length];
                return;
            } else {
                C1963e.d(drawableArr2[i10], this, this);
                i10++;
            }
        }
    }

    private InterfaceC1961c a(int i10) {
        return new C0209a(i10);
    }

    public Drawable b(int i10) {
        c2.k.b(Boolean.valueOf(i10 >= 0));
        c2.k.b(Boolean.valueOf(i10 < this.f19688i.length));
        return this.f19688i[i10];
    }

    public InterfaceC1961c c(int i10) {
        c2.k.b(Boolean.valueOf(i10 >= 0));
        c2.k.b(Boolean.valueOf(i10 < this.f19689j.length));
        InterfaceC1961c[] interfaceC1961cArr = this.f19689j;
        if (interfaceC1961cArr[i10] == null) {
            interfaceC1961cArr[i10] = a(i10);
        }
        return this.f19689j[i10];
    }

    public int d() {
        return this.f19688i.length;
    }

    public Drawable e(int i10, Drawable drawable) {
        c2.k.b(Boolean.valueOf(i10 >= 0));
        c2.k.b(Boolean.valueOf(i10 < this.f19688i.length));
        Drawable drawable2 = this.f19688i[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f19693n) {
                drawable.mutate();
            }
            C1963e.d(this.f19688i[i10], null, null);
            C1963e.d(drawable, null, null);
            C1963e.e(drawable, this.f19687h);
            C1963e.a(drawable, this);
            C1963e.d(drawable, this, this);
            this.f19692m = false;
            this.f19688i[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f19688i.length == 0) {
            return -2;
        }
        int i10 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f19690k;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    @Override // com.facebook.drawee.drawable.D
    public void getRootBounds(RectF rectF) {
        D d10 = this.f19686g;
        if (d10 != null) {
            d10.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.D
    public void getTransform(Matrix matrix) {
        D d10 = this.f19686g;
        if (d10 != null) {
            d10.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f19692m) {
            this.f19691l = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.f19688i;
                boolean z10 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z11 = this.f19691l;
                if (drawable == null || !drawable.isStateful()) {
                    z10 = false;
                }
                this.f19691l = z11 | z10;
                i10++;
            }
            this.f19692m = true;
        }
        return this.f19691l;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                this.f19693n = true;
                return this;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.mutate();
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i11 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z10 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z10 = true;
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19687h.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f19687h.d(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setDither(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f19687h.e(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setFilterBitmap(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i10++;
        }
    }

    @Override // com.facebook.drawee.drawable.C
    public void setTransformCallback(D d10) {
        this.f19686g = d10;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19688i;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z10, z11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
