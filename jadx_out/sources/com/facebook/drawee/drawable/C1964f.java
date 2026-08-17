package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1964f extends AbstractC1959a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private N2.m f19707A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f19708B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f19709C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f19710D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Drawable[] f19711o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f19712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f19713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f19714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f19715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f19716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f19717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int[] f19718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int[] f19719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f19720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean[] f19721y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f19722z;

    public C1964f(Drawable[] drawableArr, boolean z10, int i10) {
        super(drawableArr);
        this.f19710D = true;
        c2.k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f19711o = drawableArr;
        this.f19718v = new int[drawableArr.length];
        this.f19719w = new int[drawableArr.length];
        this.f19720x = 255;
        this.f19721y = new boolean[drawableArr.length];
        this.f19722z = 0;
        this.f19712p = z10;
        this.f19713q = z10 ? 255 : 0;
        this.f19714r = i10;
        q();
    }

    private void g(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null || i10 <= 0) {
            return;
        }
        this.f19722z++;
        if (this.f19710D) {
            drawable.mutate();
        }
        drawable.setAlpha(i10);
        this.f19722z--;
        drawable.draw(canvas);
    }

    private void n() {
        if (this.f19708B) {
            this.f19708B = false;
            N2.m mVar = this.f19707A;
            if (mVar != null) {
                mVar.c();
            }
        }
    }

    private void o() {
        int i10;
        if (!this.f19708B && (i10 = this.f19714r) >= 0) {
            boolean[] zArr = this.f19721y;
            if (i10 < zArr.length && zArr[i10]) {
                this.f19708B = true;
                N2.m mVar = this.f19707A;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    private void p() {
        if (this.f19709C && this.f19715s == 2 && this.f19721y[this.f19714r]) {
            N2.m mVar = this.f19707A;
            if (mVar != null) {
                mVar.b();
            }
            this.f19709C = false;
        }
    }

    private void q() {
        this.f19715s = 2;
        Arrays.fill(this.f19718v, this.f19713q);
        this.f19718v[0] = 255;
        Arrays.fill(this.f19719w, this.f19713q);
        this.f19719w[0] = 255;
        Arrays.fill(this.f19721y, this.f19712p);
        this.f19721y[0] = true;
    }

    private boolean s(float f10) {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f19711o.length; i10++) {
            boolean z11 = this.f19721y[i10];
            int i11 = z11 ? 1 : -1;
            int[] iArr = this.f19719w;
            int i12 = (int) (this.f19718v[i10] + (i11 * 255 * f10));
            iArr[i10] = i12;
            if (i12 < 0) {
                iArr[i10] = 0;
            }
            if (iArr[i10] > 255) {
                iArr[i10] = 255;
            }
            if (z11 && iArr[i10] < 255) {
                z10 = false;
            }
            if (!z11 && iArr[i10] > 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean zS;
        Drawable[] drawableArr;
        int i10 = this.f19715s;
        int i11 = 0;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                c2.k.i(this.f19716t > 0);
                zS = s((m() - this.f19717u) / this.f19716t);
                this.f19715s = zS ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f19711o;
                if (i11 < drawableArr.length) {
                    break;
                }
                g(canvas, drawableArr[i11], (int) Math.ceil(((double) (this.f19719w[i11] * this.f19720x)) / 255.0d));
                i11++;
            }
            if (z10) {
                invalidateSelf();
                return;
            } else {
                n();
                p();
                return;
            }
        }
        System.arraycopy(this.f19719w, 0, this.f19718v, 0, this.f19711o.length);
        this.f19717u = m();
        zS = s(this.f19716t == 0 ? 1.0f : 0.0f);
        o();
        this.f19715s = zS ? 2 : 1;
        z10 = zS;
        while (true) {
            drawableArr = this.f19711o;
            if (i11 < drawableArr.length) {
            }
            g(canvas, drawableArr[i11], (int) Math.ceil(((double) (this.f19719w[i11] * this.f19720x)) / 255.0d));
            i11++;
        }
        if (z10) {
        }
    }

    public void f() {
        this.f19722z++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19720x;
    }

    public void h() {
        this.f19722z--;
        invalidateSelf();
    }

    public void i() {
        this.f19715s = 0;
        Arrays.fill(this.f19721y, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f19722z == 0) {
            super.invalidateSelf();
        }
    }

    public void j(int i10) {
        this.f19715s = 0;
        this.f19721y[i10] = true;
        invalidateSelf();
    }

    public void k(int i10) {
        this.f19715s = 0;
        this.f19721y[i10] = false;
        invalidateSelf();
    }

    public void l() {
        this.f19715s = 2;
        for (int i10 = 0; i10 < this.f19711o.length; i10++) {
            this.f19719w[i10] = this.f19721y[i10] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long m() {
        return SystemClock.uptimeMillis();
    }

    public void r(int i10) {
        this.f19716t = i10;
        if (this.f19715s == 1) {
            this.f19715s = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f19720x != i10) {
            this.f19720x = i10;
            invalidateSelf();
        }
    }
}
