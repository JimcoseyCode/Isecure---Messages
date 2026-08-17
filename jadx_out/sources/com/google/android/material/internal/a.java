package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import e5.C2423a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Typeface f23374A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f23375B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Typeface f23376C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Typeface f23377D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private C2423a f23378E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C2423a f23379F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f23381H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private CharSequence f23382I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f23383J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f23385L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f23386M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f23387N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f23388O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f23389P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f23390Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f23391R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int[] f23392S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f23393T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final TextPaint f23394U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final TextPaint f23395V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private TimeInterpolator f23396W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private TimeInterpolator f23397X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f23398Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f23399Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f23400a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f23401a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23402b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f23403b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23404c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f23405c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23406d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f23407d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23408e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f23409e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23410f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f23411f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f23412g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f23413g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f23414h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f23415h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f23416i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f23417i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f23418j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private StaticLayout f23419j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f23421k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f23423l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f23425m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private CharSequence f23427n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f23428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f23430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f23434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f23436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f23438t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private h f23439t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f23440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f23442v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f23444w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f23445w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f23446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f23447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f23448z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23420k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23422l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f23424m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f23426n = 15.0f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private TextUtils.TruncateAt f23380G = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f23384K = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f23429o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f23431p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f23433q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f23435r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f23437s0 = g.f23458o;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f23441u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f23443v0 = -1;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0228a implements C2423a.InterfaceC0257a {
        C0228a() {
        }

        @Override // e5.C2423a.InterfaceC0257a
        public void a(Typeface typeface) {
            a.this.Y(typeface);
        }
    }

    public a(View view) {
        this.f23400a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f23394U = textPaint;
        this.f23395V = new TextPaint(textPaint);
        this.f23414h = new Rect();
        this.f23412g = new Rect();
        this.f23418j = new RectF();
        this.f23408e = e();
        L(view.getContext().getResources().getConfiguration());
    }

    private Layout.Alignment C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f23420k, this.f23383J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.f23383J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f23383J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void D(TextPaint textPaint) {
        textPaint.setTextSize(this.f23426n);
        textPaint.setTypeface(this.f23446x);
        textPaint.setLetterSpacing(this.f23413g0);
    }

    private void E(TextPaint textPaint) {
        textPaint.setTextSize(this.f23424m);
        textPaint.setTypeface(this.f23374A);
        textPaint.setLetterSpacing(this.f23415h0);
    }

    private void F(float f10) {
        if (this.f23404c) {
            this.f23418j.set(f10 < this.f23408e ? this.f23412g : this.f23414h);
            return;
        }
        this.f23418j.left = K(this.f23412g.left, this.f23414h.left, f10, this.f23396W);
        this.f23418j.top = K(this.f23434r, this.f23436s, f10, this.f23396W);
        this.f23418j.right = K(this.f23412g.right, this.f23414h.right, f10, this.f23396W);
        this.f23418j.bottom = K(this.f23412g.bottom, this.f23414h.bottom, f10, this.f23396W);
    }

    private static boolean G(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean H() {
        return this.f23400a.getLayoutDirection() == 1;
    }

    private boolean J(CharSequence charSequence, boolean z10) {
        return (z10 ? G0.n.f2178d : G0.n.f2177c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float K(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return R4.a.a(f10, f11, f12);
    }

    private float M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean P(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void V(float f10) {
        this.f23423l0 = f10;
        this.f23400a.postInvalidateOnAnimation();
    }

    private boolean Z(Typeface typeface) {
        C2423a c2423a = this.f23379F;
        if (c2423a != null) {
            c2423a.c();
        }
        if (this.f23448z == typeface) {
            return false;
        }
        this.f23448z = typeface;
        Typeface typefaceB = e5.j.b(this.f23400a.getContext().getResources().getConfiguration(), typeface);
        this.f23447y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f23448z;
        }
        this.f23446x = typefaceB;
        return true;
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        float fM;
        i(1.0f, z10);
        if (this.f23382I != null && this.f23419j0 != null) {
            this.f23427n0 = r0() ? TextUtils.ellipsize(this.f23382I, this.f23394U, this.f23419j0.getWidth(), this.f23380G) : this.f23382I;
        }
        CharSequence charSequence = this.f23427n0;
        if (charSequence != null) {
            this.f23421k0 = M(this.f23394U, charSequence);
        } else {
            this.f23421k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f23422l, this.f23383J ? 1 : 0);
        Rect rect = this.f23416i;
        if (rect == null) {
            rect = this.f23414h;
        }
        int i10 = absoluteGravity & 112;
        if (i10 == 48) {
            this.f23436s = rect.top;
        } else if (i10 != 80) {
            this.f23436s = rect.centerY() - ((this.f23394U.descent() - this.f23394U.ascent()) / 2.0f);
        } else {
            this.f23436s = rect.bottom + this.f23394U.ascent();
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f23440u = rect.centerX() - (this.f23421k0 / 2.0f);
        } else if (i11 != 5) {
            this.f23440u = rect.left;
        } else {
            this.f23440u = rect.right - this.f23421k0;
        }
        if (this.f23421k0 <= this.f23414h.width()) {
            float f10 = this.f23440u;
            float fMax = f10 + Math.max(0.0f, this.f23414h.left - f10);
            this.f23440u = fMax;
            this.f23440u = fMax + Math.min(0.0f, this.f23414h.right - (this.f23421k0 + fMax));
        }
        if (m() <= this.f23414h.height()) {
            float f11 = this.f23436s;
            float fMax2 = f11 + Math.max(0.0f, this.f23414h.top - f11);
            this.f23436s = fMax2;
            this.f23436s = fMax2 + Math.min(0.0f, this.f23414h.bottom - (q() + fMax2));
        }
        i(0.0f, z10);
        float height = this.f23419j0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f23419j0;
        if (staticLayout == null || this.f23429o0 <= 1) {
            CharSequence charSequence2 = this.f23382I;
            fM = charSequence2 != null ? M(this.f23394U, charSequence2) : 0.0f;
        } else {
            fM = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f23419j0;
        this.f23432q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f23420k, this.f23383J ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        if (i12 == 48) {
            this.f23434r = this.f23412g.top;
        } else if (i12 != 80) {
            this.f23434r = this.f23412g.centerY() - (height / 2.0f);
        } else {
            this.f23434r = (this.f23412g.bottom - height) + (this.f23445w0 ? this.f23394U.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f23438t = this.f23412g.centerX() - (fM / 2.0f);
        } else if (i13 != 5) {
            this.f23438t = this.f23412g.left;
        } else {
            this.f23438t = this.f23412g.right - fM;
        }
        k0(this.f23402b);
    }

    private void c() {
        g(this.f23402b);
    }

    private float d(float f10) {
        float f11 = this.f23408e;
        return f10 <= f11 ? R4.a.b(1.0f, 0.0f, this.f23406d, f11, f10) : R4.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f23406d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zH = H();
        return this.f23384K ? J(charSequence, zH) : zH;
    }

    private void f0(float f10) {
        this.f23425m0 = f10;
        this.f23400a.postInvalidateOnAnimation();
    }

    private void g(float f10) {
        float f11;
        F(f10);
        if (!this.f23404c) {
            this.f23442v = K(this.f23438t, this.f23440u, f10, this.f23396W);
            this.f23444w = K(this.f23434r, this.f23436s, f10, this.f23396W);
            k0(f10);
            f11 = f10;
        } else if (f10 < this.f23408e) {
            this.f23442v = this.f23438t;
            this.f23444w = this.f23434r;
            k0(0.0f);
            f11 = 0.0f;
        } else {
            this.f23442v = this.f23440u;
            this.f23444w = this.f23436s - Math.max(0, this.f23410f);
            k0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = R4.a.f10025b;
        V(1.0f - K(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        f0(K(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f23430p != this.f23428o) {
            this.f23394U.setColor(a(v(), t(), f11));
        } else {
            this.f23394U.setColor(t());
        }
        float f12 = this.f23413g0;
        float f13 = this.f23415h0;
        if (f12 != f13) {
            this.f23394U.setLetterSpacing(K(f13, f12, f10, timeInterpolator));
        } else {
            this.f23394U.setLetterSpacing(f12);
        }
        this.f23387N = K(this.f23405c0, this.f23398Y, f10, null);
        this.f23388O = K(this.f23407d0, this.f23399Z, f10, null);
        this.f23389P = K(this.f23409e0, this.f23401a0, f10, null);
        int iA = a(u(this.f23411f0), u(this.f23403b0), f10);
        this.f23390Q = iA;
        this.f23394U.setShadowLayer(this.f23387N, this.f23388O, this.f23389P, iA);
        if (this.f23404c) {
            this.f23394U.setAlpha((int) (d(f10) * this.f23394U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f23394U;
                textPaint.setShadowLayer(this.f23387N, this.f23388O, this.f23389P, X4.a.a(this.f23390Q, textPaint.getAlpha()));
            }
        }
        this.f23400a.postInvalidateOnAnimation();
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        Typeface typeface;
        float f11;
        float f12;
        if (this.f23381H == null) {
            return;
        }
        float fWidth = this.f23414h.width();
        float fWidth2 = this.f23412g.width();
        if (G(f10, 1.0f)) {
            f11 = r0() ? this.f23426n : this.f23424m;
            f12 = r0() ? this.f23413g0 : this.f23415h0;
            this.f23385L = r0() ? 1.0f : K(this.f23424m, this.f23426n, f10, this.f23397X) / this.f23424m;
            if (!r0()) {
                fWidth = fWidth2;
            }
            typeface = this.f23446x;
            fWidth2 = fWidth;
        } else {
            float f13 = this.f23424m;
            float f14 = this.f23415h0;
            typeface = this.f23374A;
            if (G(f10, 0.0f)) {
                this.f23385L = 1.0f;
            } else {
                this.f23385L = K(this.f23424m, this.f23426n, f10, this.f23397X) / this.f23424m;
            }
            float f15 = this.f23426n / this.f23424m;
            float f16 = fWidth2 * f15;
            if (!z10 && !this.f23404c && f16 > fWidth && r0()) {
                fWidth2 = Math.min(fWidth / f15, fWidth2);
            }
            f11 = f13;
            f12 = f14;
        }
        int i10 = f10 < 0.5f ? this.f23429o0 : this.f23431p0;
        if (fWidth2 > 0.0f) {
            boolean z11 = this.f23386M != f11;
            boolean z12 = this.f23417i0 != f12;
            boolean z13 = this.f23377D != typeface;
            StaticLayout staticLayout = this.f23419j0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.f23391R != i10) || this.f23393T;
            this.f23386M = f11;
            this.f23417i0 = f12;
            this.f23377D = typeface;
            this.f23393T = false;
            this.f23391R = i10;
            this.f23394U.setLinearText(this.f23385L != 1.0f);
            z = z14;
        }
        if (this.f23382I == null || z) {
            this.f23394U.setTextSize(this.f23386M);
            this.f23394U.setTypeface(this.f23377D);
            this.f23394U.setLetterSpacing(this.f23417i0);
            this.f23383J = f(this.f23381H);
            StaticLayout staticLayoutJ = j(q0() ? i10 : 1, this.f23394U, this.f23381H, fWidth2 * (r0() ? 1.0f : this.f23385L), this.f23383J);
            this.f23419j0 = staticLayoutJ;
            this.f23382I = staticLayoutJ.getText();
        }
    }

    private boolean i0(Typeface typeface) {
        C2423a c2423a = this.f23378E;
        if (c2423a != null) {
            c2423a.c();
        }
        if (this.f23376C == typeface) {
            return false;
        }
        this.f23376C = typeface;
        Typeface typefaceB = e5.j.b(this.f23400a.getContext().getResources().getConfiguration(), typeface);
        this.f23375B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f23376C;
        }
        this.f23374A = typefaceB;
        return true;
    }

    private StaticLayout j(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        return (StaticLayout) H0.g.g(g.b(charSequence, textPaint, (int) f10).d(this.f23380G).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : C()).f(false).i(i10).h(this.f23433q0, this.f23435r0).e(this.f23437s0).j(this.f23439t0).a());
    }

    private void k0(float f10) {
        h(f10);
        this.f23400a.postInvalidateOnAnimation();
    }

    private void l(Canvas canvas, float f10, float f11) {
        int alpha = this.f23394U.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f23404c) {
            this.f23394U.setAlpha((int) (this.f23425m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f23394U;
                textPaint.setShadowLayer(this.f23387N, this.f23388O, this.f23389P, X4.a.a(this.f23390Q, textPaint.getAlpha()));
            }
            this.f23419j0.draw(canvas);
        }
        if (!this.f23404c) {
            this.f23394U.setAlpha((int) (this.f23423l0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f23394U;
            textPaint2.setShadowLayer(this.f23387N, this.f23388O, this.f23389P, X4.a.a(this.f23390Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f23419j0.getLineBaseline(0);
        CharSequence charSequence = this.f23427n0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f23394U);
        if (i10 >= 31) {
            this.f23394U.setShadowLayer(this.f23387N, this.f23388O, this.f23389P, this.f23390Q);
        }
        if (this.f23404c) {
            return;
        }
        String strTrim = this.f23427n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f23394U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f23419j0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f23394U);
    }

    private boolean q0() {
        if (this.f23429o0 > 1 || this.f23431p0 > 1) {
            return !this.f23383J || this.f23404c;
        }
        return false;
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f23421k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f23383J ? this.f23414h.left : this.f23414h.right - this.f23421k0 : this.f23383J ? this.f23414h.right - this.f23421k0 : this.f23414h.left;
    }

    private boolean r0() {
        return this.f23431p0 == 1;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f23421k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f23383J ? rectF.left + this.f23421k0 : this.f23414h.right : this.f23383J ? this.f23414h.right : rectF.left + this.f23421k0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f23392S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f23428o);
    }

    public float A() {
        E(this.f23395V);
        return -this.f23395V.ascent();
    }

    public float B() {
        return this.f23402b;
    }

    public final boolean I() {
        ColorStateList colorStateList = this.f23430p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f23428o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f23448z;
            if (typeface != null) {
                this.f23447y = e5.j.b(configuration, typeface);
            }
            Typeface typeface2 = this.f23376C;
            if (typeface2 != null) {
                this.f23375B = e5.j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f23447y;
            if (typeface3 == null) {
                typeface3 = this.f23448z;
            }
            this.f23446x = typeface3;
            Typeface typeface4 = this.f23375B;
            if (typeface4 == null) {
                typeface4 = this.f23376C;
            }
            this.f23374A = typeface4;
            O(true);
        }
    }

    public void N() {
        O(false);
    }

    public void O(boolean z10) {
        if ((this.f23400a.getHeight() <= 0 || this.f23400a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.f23430p == colorStateList && this.f23428o == colorStateList) {
            return;
        }
        this.f23430p = colorStateList;
        this.f23428o = colorStateList;
        N();
    }

    public void R(int i10, int i11, int i12, int i13) {
        if (P(this.f23414h, i10, i11, i12, i13)) {
            return;
        }
        this.f23414h.set(i10, i11, i12, i13);
        this.f23393T = true;
    }

    public void S(Rect rect) {
        R(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void T(int i10) {
        if (i10 != this.f23431p0) {
            this.f23431p0 = i10;
            N();
        }
    }

    public void U(int i10) {
        e5.e eVar = new e5.e(this.f23400a.getContext(), i10);
        if (eVar.j() != null) {
            this.f23430p = eVar.j();
        }
        if (eVar.k() != 0.0f) {
            this.f23426n = eVar.k();
        }
        ColorStateList colorStateList = eVar.f25909c;
        if (colorStateList != null) {
            this.f23403b0 = colorStateList;
        }
        this.f23399Z = eVar.f25915i;
        this.f23401a0 = eVar.f25916j;
        this.f23398Y = eVar.f25917k;
        this.f23413g0 = eVar.f25919m;
        C2423a c2423a = this.f23379F;
        if (c2423a != null) {
            c2423a.c();
        }
        this.f23379F = new C2423a(new C0228a(), eVar.e());
        eVar.h(this.f23400a.getContext(), this.f23379F);
        N();
    }

    public void W(ColorStateList colorStateList) {
        if (this.f23430p != colorStateList) {
            this.f23430p = colorStateList;
            N();
        }
    }

    public void X(int i10) {
        if (this.f23422l != i10) {
            this.f23422l = i10;
            N();
        }
    }

    public void Y(Typeface typeface) {
        if (Z(typeface)) {
            N();
        }
    }

    public void a0(int i10, int i11, int i12, int i13) {
        b0(i10, i11, i12, i13, true);
    }

    public void b0(int i10, int i11, int i12, int i13, boolean z10) {
        if (P(this.f23412g, i10, i11, i12, i13) && z10 == this.f23445w0) {
            return;
        }
        this.f23412g.set(i10, i11, i12, i13);
        this.f23393T = true;
        this.f23445w0 = z10;
    }

    public void c0(Rect rect) {
        a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f10) {
        if (this.f23415h0 != f10) {
            this.f23415h0 = f10;
            N();
        }
    }

    public void e0(int i10) {
        if (i10 != this.f23429o0) {
            this.f23429o0 = i10;
            N();
        }
    }

    public void g0(int i10) {
        if (this.f23420k != i10) {
            this.f23420k = i10;
            N();
        }
    }

    public void h0(float f10) {
        if (this.f23424m != f10) {
            this.f23424m = f10;
            N();
        }
    }

    public void j0(float f10) {
        float fA = B0.a.a(f10, 0.0f, 1.0f);
        if (fA != this.f23402b) {
            this.f23402b = fA;
            c();
        }
    }

    public void k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f23382I == null || this.f23418j.width() <= 0.0f || this.f23418j.height() <= 0.0f) {
            return;
        }
        this.f23394U.setTextSize(this.f23386M);
        float f10 = this.f23442v;
        float f11 = this.f23444w;
        float f12 = this.f23385L;
        if (f12 != 1.0f && !this.f23404c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (q0() && r0() && (!this.f23404c || this.f23402b > this.f23408e)) {
            l(canvas, this.f23442v - this.f23419j0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f23419j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(TimeInterpolator timeInterpolator) {
        this.f23396W = timeInterpolator;
        N();
    }

    public float m() {
        D(this.f23395V);
        return (-this.f23395V.ascent()) + this.f23395V.descent();
    }

    public final boolean m0(int[] iArr) {
        this.f23392S = iArr;
        if (!I()) {
            return false;
        }
        N();
        return true;
    }

    public float n() {
        D(this.f23395V);
        return -this.f23395V.ascent();
    }

    public void n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f23381H, charSequence)) {
            this.f23381H = charSequence;
            this.f23382I = null;
            N();
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f23383J = f(this.f23381H);
        rectF.left = Math.max(r(i10, i11), this.f23414h.left);
        rectF.top = this.f23414h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f23414h.right);
        rectF.bottom = this.f23414h.top + q();
        if (this.f23419j0 == null || r0()) {
            return;
        }
        float lineWidth = this.f23419j0.getLineWidth(r4.getLineCount() - 1) * (this.f23426n / this.f23424m);
        if (this.f23383J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(TimeInterpolator timeInterpolator) {
        this.f23397X = timeInterpolator;
        N();
    }

    public ColorStateList p() {
        return this.f23430p;
    }

    public void p0(Typeface typeface) {
        boolean Z9 = Z(typeface);
        boolean zI0 = i0(typeface);
        if (Z9 || zI0) {
            N();
        }
    }

    public float q() {
        int i10 = this.f23441u0;
        return i10 != -1 ? i10 : n();
    }

    public void s0(int i10) {
        D(this.f23395V);
        float f10 = i10;
        this.f23441u0 = j(this.f23431p0, this.f23395V, this.f23381H, f10 * (this.f23426n / this.f23424m), this.f23383J).getHeight();
        E(this.f23395V);
        this.f23443v0 = j(this.f23429o0, this.f23395V, this.f23381H, f10, this.f23383J).getHeight();
    }

    public int t() {
        return u(this.f23430p);
    }

    public int w() {
        return this.f23432q;
    }

    public int x() {
        return this.f23429o0;
    }

    public float y() {
        E(this.f23395V);
        return (-this.f23395V.ascent()) + this.f23395V.descent();
    }

    public float z() {
        int i10 = this.f23443v0;
        return i10 != -1 ? i10 : A();
    }
}
