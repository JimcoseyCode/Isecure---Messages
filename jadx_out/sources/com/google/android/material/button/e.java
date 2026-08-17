package com.google.android.material.button;

import Q4.k;
import U0.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import e5.AbstractC2425c;
import f5.AbstractC2614a;
import h5.h;
import h5.l;
import h5.o;
import h5.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f22923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f22924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f22925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f22926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.d f22927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f22934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f22935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f22936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f22937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f22938p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f22942t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LayerDrawable f22944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f22945w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f22939q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22940r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22941s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f22943u = true;

    e(MaterialButton materialButton, l lVar) {
        this.f22923a = materialButton;
        this.f22924b = lVar;
    }

    private void L(int i10, int i11) {
        int paddingStart = this.f22923a.getPaddingStart();
        int paddingTop = this.f22923a.getPaddingTop();
        int paddingEnd = this.f22923a.getPaddingEnd();
        int paddingBottom = this.f22923a.getPaddingBottom();
        int i12 = this.f22930h;
        int i13 = this.f22931i;
        this.f22931i = i11;
        this.f22930h = i10;
        if (!this.f22940r) {
            M();
        }
        this.f22923a.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    private void M() {
        this.f22923a.setInternalBackground(a());
        h hVarG = g();
        if (hVarG != null) {
            hVarG.c0(this.f22945w);
            hVarG.setState(this.f22923a.getDrawableState());
        }
    }

    private void N() {
        h hVarG = g();
        if (hVarG != null) {
            q qVar = this.f22925c;
            if (qVar != null) {
                hVarG.i0(qVar);
            } else {
                hVarG.setShapeAppearanceModel(this.f22924b);
            }
            n nVar = this.f22926d;
            if (nVar != null) {
                hVarG.b0(nVar);
            }
        }
        h hVarP = p();
        if (hVarP != null) {
            q qVar2 = this.f22925c;
            if (qVar2 != null) {
                hVarP.i0(qVar2);
            } else {
                hVarP.setShapeAppearanceModel(this.f22924b);
            }
            n nVar2 = this.f22926d;
            if (nVar2 != null) {
                hVarP.b0(nVar2);
            }
        }
        o oVarF = f();
        if (oVarF != null) {
            oVarF.setShapeAppearanceModel(this.f22924b);
            if (oVarF instanceof h) {
                h hVar = (h) oVarF;
                q qVar3 = this.f22925c;
                if (qVar3 != null) {
                    hVar.i0(qVar3);
                }
                n nVar3 = this.f22926d;
                if (nVar3 != null) {
                    hVar.b0(nVar3);
                }
            }
        }
    }

    private void O() {
        h hVarG = g();
        h hVarP = p();
        if (hVarG != null) {
            hVarG.k0(this.f22933k, this.f22936n);
            if (hVarP != null) {
                hVarP.j0(this.f22933k, this.f22939q ? X4.a.d(this.f22923a, Q4.a.f9109J) : 0);
            }
        }
    }

    private InsetDrawable P(Drawable drawable) {
        return new InsetDrawable(drawable, this.f22928f, this.f22930h, this.f22929g, this.f22931i);
    }

    private Drawable a() {
        h hVar = new h(this.f22924b);
        q qVar = this.f22925c;
        if (qVar != null) {
            hVar.i0(qVar);
        }
        n nVar = this.f22926d;
        if (nVar != null) {
            hVar.b0(nVar);
        }
        h.d dVar = this.f22927e;
        if (dVar != null) {
            hVar.f0(dVar);
        }
        hVar.R(this.f22923a.getContext());
        hVar.setTintList(this.f22935m);
        PorterDuff.Mode mode = this.f22934l;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        hVar.k0(this.f22933k, this.f22936n);
        h hVar2 = new h(this.f22924b);
        q qVar2 = this.f22925c;
        if (qVar2 != null) {
            hVar2.i0(qVar2);
        }
        n nVar2 = this.f22926d;
        if (nVar2 != null) {
            hVar2.b0(nVar2);
        }
        hVar2.setTint(0);
        hVar2.j0(this.f22933k, this.f22939q ? X4.a.d(this.f22923a, Q4.a.f9109J) : 0);
        h hVar3 = new h(this.f22924b);
        this.f22938p = hVar3;
        q qVar3 = this.f22925c;
        if (qVar3 != null) {
            hVar3.i0(qVar3);
        }
        n nVar3 = this.f22926d;
        if (nVar3 != null) {
            ((h) this.f22938p).b0(nVar3);
        }
        this.f22938p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2614a.d(this.f22937o), P(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.f22938p);
        this.f22944v = rippleDrawable;
        return rippleDrawable;
    }

    private h h(boolean z10) {
        LayerDrawable layerDrawable = this.f22944v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f22944v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    private h p() {
        return h(true);
    }

    public void A(int i10) {
        L(this.f22930h, i10);
    }

    public void B(int i10) {
        L(i10, this.f22931i);
    }

    void C(ColorStateList colorStateList) {
        if (this.f22937o != colorStateList) {
            this.f22937o = colorStateList;
            if (this.f22923a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f22923a.getBackground()).setColor(AbstractC2614a.d(colorStateList));
            }
        }
    }

    void D(l lVar) {
        this.f22924b = lVar;
        this.f22925c = null;
        N();
    }

    void E(boolean z10) {
        this.f22939q = z10;
        O();
    }

    void F(q qVar) {
        this.f22925c = qVar;
        N();
    }

    void G(ColorStateList colorStateList) {
        if (this.f22936n != colorStateList) {
            this.f22936n = colorStateList;
            O();
        }
    }

    void H(int i10) {
        if (this.f22933k != i10) {
            this.f22933k = i10;
            O();
        }
    }

    void I(ColorStateList colorStateList) {
        if (this.f22935m != colorStateList) {
            this.f22935m = colorStateList;
            if (g() != null) {
                g().setTintList(this.f22935m);
            }
        }
    }

    void J(PorterDuff.Mode mode) {
        if (this.f22934l != mode) {
            this.f22934l = mode;
            if (g() == null || this.f22934l == null) {
                return;
            }
            g().setTintMode(this.f22934l);
        }
    }

    void K(boolean z10) {
        this.f22943u = z10;
    }

    int b() {
        return this.f22932j;
    }

    n c() {
        return this.f22926d;
    }

    public int d() {
        return this.f22931i;
    }

    public int e() {
        return this.f22930h;
    }

    public o f() {
        LayerDrawable layerDrawable = this.f22944v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f22944v.getNumberOfLayers() > 2 ? (o) this.f22944v.getDrawable(2) : (o) this.f22944v.getDrawable(1);
    }

    h g() {
        return h(false);
    }

    ColorStateList i() {
        return this.f22937o;
    }

    l j() {
        return this.f22924b;
    }

    q k() {
        return this.f22925c;
    }

    ColorStateList l() {
        return this.f22936n;
    }

    int m() {
        return this.f22933k;
    }

    ColorStateList n() {
        return this.f22935m;
    }

    PorterDuff.Mode o() {
        return this.f22934l;
    }

    boolean q() {
        return this.f22940r;
    }

    boolean r() {
        return this.f22942t;
    }

    boolean s() {
        return this.f22943u;
    }

    void t(TypedArray typedArray) {
        this.f22928f = typedArray.getDimensionPixelOffset(k.f9657c2, 0);
        this.f22929g = typedArray.getDimensionPixelOffset(k.f9666d2, 0);
        this.f22930h = typedArray.getDimensionPixelOffset(k.f9675e2, 0);
        this.f22931i = typedArray.getDimensionPixelOffset(k.f9684f2, 0);
        if (typedArray.hasValue(k.f9717j2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(k.f9717j2, -1);
            this.f22932j = dimensionPixelSize;
            D(this.f22924b.x(dimensionPixelSize));
            this.f22941s = true;
        }
        this.f22933k = typedArray.getDimensionPixelSize(k.f9813v2, 0);
        this.f22934l = com.google.android.material.internal.o.i(typedArray.getInt(k.f9709i2, -1), PorterDuff.Mode.SRC_IN);
        this.f22935m = AbstractC2425c.a(this.f22923a.getContext(), typedArray, k.f9701h2);
        this.f22936n = AbstractC2425c.a(this.f22923a.getContext(), typedArray, k.f9805u2);
        this.f22937o = AbstractC2425c.a(this.f22923a.getContext(), typedArray, k.f9789s2);
        this.f22942t = typedArray.getBoolean(k.f9693g2, false);
        this.f22945w = typedArray.getDimensionPixelSize(k.f9725k2, 0);
        this.f22943u = typedArray.getBoolean(k.f9821w2, true);
        int paddingStart = this.f22923a.getPaddingStart();
        int paddingTop = this.f22923a.getPaddingTop();
        int paddingEnd = this.f22923a.getPaddingEnd();
        int paddingBottom = this.f22923a.getPaddingBottom();
        if (typedArray.hasValue(k.f9639a2)) {
            v();
        } else {
            M();
        }
        this.f22923a.setPaddingRelative(paddingStart + this.f22928f, paddingTop + this.f22930h, paddingEnd + this.f22929g, paddingBottom + this.f22931i);
    }

    void u(int i10) {
        if (g() != null) {
            g().setTint(i10);
        }
    }

    void v() {
        this.f22940r = true;
        this.f22923a.setSupportBackgroundTintList(this.f22935m);
        this.f22923a.setSupportBackgroundTintMode(this.f22934l);
    }

    void w(boolean z10) {
        this.f22942t = z10;
    }

    void x(int i10) {
        if (this.f22941s && this.f22932j == i10) {
            return;
        }
        this.f22932j = i10;
        this.f22941s = true;
        D(this.f22924b.x(i10));
    }

    void y(h.d dVar) {
        this.f22927e = dVar;
        h hVarG = g();
        if (hVarG != null) {
            hVarG.f0(dVar);
        }
    }

    void z(n nVar) {
        this.f22926d = nVar;
        if (this.f22925c != null) {
            N();
        }
    }
}
