package com.canhub.cropper;

import android.graphics.RectF;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.v;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f19633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f19634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f19636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f19637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f19638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f19639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f19640j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f19631a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f19632b = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f19641k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f19642l = 1.0f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19643a;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            try {
                iArr[CropImageView.d.f19469g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.d.f19470h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.d.f19471i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.d.f19472j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19643a = iArr;
        }
    }

    private final float a(float f10, float f11, float f12, float f13) {
        return Math.max(Math.abs(f10 - f12), Math.abs(f11 - f13));
    }

    private final boolean b() {
        return !x();
    }

    private final v.b h(float f10, float f11, boolean z10) {
        float f12 = 6;
        float fWidth = this.f19631a.width() / f12;
        RectF rectF = this.f19631a;
        float f13 = rectF.left;
        float f14 = f13 + fWidth;
        float f15 = 5;
        float f16 = f13 + (fWidth * f15);
        float fHeight = rectF.height() / f12;
        float f17 = this.f19631a.top;
        float f18 = f17 + fHeight;
        float f19 = f17 + (f15 * fHeight);
        if (f10 < f14) {
            return f11 < f18 ? v.b.f19651g : f11 < f19 ? v.b.f19655k : v.b.f19653i;
        }
        if (f10 >= f16) {
            return f11 < f18 ? v.b.f19652h : f11 < f19 ? v.b.f19657m : v.b.f19654j;
        }
        if (f11 < f18) {
            return v.b.f19656l;
        }
        if (f11 >= f19) {
            return v.b.f19658n;
        }
        if (z10) {
            return v.b.f19659o;
        }
        return null;
    }

    private final v.b j(float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        RectF rectF = this.f19631a;
        if (a(f10, f11, rectF.left, rectF.centerY()) <= f12) {
            return v.b.f19655k;
        }
        RectF rectF2 = this.f19631a;
        if (a(f10, f11, rectF2.right, rectF2.centerY()) <= f12) {
            return v.b.f19657m;
        }
        if (z10) {
            RectF rectF3 = this.f19631a;
            f13 = f10;
            f14 = f11;
            if (o(f13, f14, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return v.b.f19659o;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return h(f13, f14, z10);
    }

    private final v.b k(float f10, float f11, float f12, boolean z10) {
        RectF rectF = this.f19631a;
        if (p(f10, f11, rectF.left, rectF.top, f12)) {
            return v.b.f19651g;
        }
        RectF rectF2 = this.f19631a;
        if (p(f10, f11, rectF2.right, rectF2.top, f12)) {
            return v.b.f19652h;
        }
        RectF rectF3 = this.f19631a;
        if (p(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return v.b.f19653i;
        }
        RectF rectF4 = this.f19631a;
        if (p(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return v.b.f19654j;
        }
        if (z10) {
            RectF rectF5 = this.f19631a;
            if (o(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && b()) {
                return v.b.f19659o;
            }
        }
        RectF rectF6 = this.f19631a;
        if (q(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return v.b.f19656l;
        }
        RectF rectF7 = this.f19631a;
        if (q(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return v.b.f19658n;
        }
        RectF rectF8 = this.f19631a;
        if (r(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return v.b.f19655k;
        }
        RectF rectF9 = this.f19631a;
        if (r(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return v.b.f19657m;
        }
        if (z10) {
            RectF rectF10 = this.f19631a;
            if (o(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !b()) {
                return v.b.f19659o;
            }
        }
        return h(f10, f11, z10);
    }

    private final v.b l(float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        if (a(f10, f11, this.f19631a.centerX(), this.f19631a.top) <= f12) {
            return v.b.f19656l;
        }
        if (a(f10, f11, this.f19631a.centerX(), this.f19631a.bottom) <= f12) {
            return v.b.f19658n;
        }
        if (z10) {
            RectF rectF = this.f19631a;
            f13 = f10;
            f14 = f11;
            if (o(f13, f14, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return v.b.f19659o;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return h(f13, f14, z10);
    }

    private final boolean o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    private final boolean p(float f10, float f11, float f12, float f13, float f14) {
        return a(f10, f11, f12, f13) <= f14;
    }

    private final boolean q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    private final boolean r(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    public final float c() {
        return B7.d.g(this.f19636f, this.f19640j / this.f19642l);
    }

    public final float d() {
        return B7.d.g(this.f19635e, this.f19639i / this.f19641k);
    }

    public final float e() {
        return B7.d.c(this.f19634d, this.f19638h / this.f19642l);
    }

    public final float f() {
        return B7.d.c(this.f19633c, this.f19637g / this.f19641k);
    }

    public final v g(float f10, float f11, float f12, CropImageView.d cropShape, boolean z10) {
        v.b bVarK;
        AbstractC2855l.g(cropShape, "cropShape");
        int i10 = a.f19643a[cropShape.ordinal()];
        if (i10 == 1) {
            bVarK = k(f10, f11, f12, z10);
        } else if (i10 == 2) {
            bVarK = h(f10, f11, z10);
        } else if (i10 == 3) {
            bVarK = l(f10, f11, f12, z10);
        } else {
            if (i10 != 4) {
                throw new C2750m();
            }
            bVarK = j(f10, f11, f12, z10);
        }
        if (bVarK != null) {
            return new v(bVarK, this, f10, f11);
        }
        return null;
    }

    public final RectF i() {
        this.f19632b.set(this.f19631a);
        return this.f19632b;
    }

    public final float m() {
        return this.f19642l;
    }

    public final float n() {
        return this.f19641k;
    }

    public final void s(float f10, float f11, float f12, float f13) {
        this.f19635e = f10;
        this.f19636f = f11;
        this.f19641k = f12;
        this.f19642l = f13;
    }

    public final void t(CropImageOptions options) {
        AbstractC2855l.g(options, "options");
        this.f19633c = options.minCropWindowWidth;
        this.f19634d = options.minCropWindowHeight;
        this.f19637g = options.minCropResultWidth;
        this.f19638h = options.minCropResultHeight;
        this.f19639i = options.maxCropResultWidth;
        this.f19640j = options.maxCropResultHeight;
    }

    public final void u(int i10, int i11) {
        this.f19639i = i10;
        this.f19640j = i11;
    }

    public final void v(int i10, int i11) {
        this.f19637g = i10;
        this.f19638h = i11;
    }

    public final void w(RectF rect) {
        AbstractC2855l.g(rect, "rect");
        this.f19631a.set(rect);
    }

    public final boolean x() {
        return this.f19631a.width() >= 100.0f && this.f19631a.height() >= 100.0f;
    }
}
