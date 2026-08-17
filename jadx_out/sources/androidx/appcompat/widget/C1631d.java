package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.AbstractC1658a0;
import f.AbstractC2577j;

/* JADX INFO: renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C1631d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f14965a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d0 f14968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d0 f14969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d0 f14970f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14967c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1637j f14966b = C1637j.b();

    C1631d(View view) {
        this.f14965a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f14970f == null) {
            this.f14970f = new d0();
        }
        d0 d0Var = this.f14970f;
        d0Var.a();
        ColorStateList colorStateListQ = AbstractC1658a0.q(this.f14965a);
        if (colorStateListQ != null) {
            d0Var.f14974d = true;
            d0Var.f14971a = colorStateListQ;
        }
        PorterDuff.Mode modeR = AbstractC1658a0.r(this.f14965a);
        if (modeR != null) {
            d0Var.f14973c = true;
            d0Var.f14972b = modeR;
        }
        if (!d0Var.f14974d && !d0Var.f14973c) {
            return false;
        }
        C1637j.i(drawable, d0Var, this.f14965a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f14968d != null;
    }

    void b() {
        Drawable background = this.f14965a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            d0 d0Var = this.f14969e;
            if (d0Var != null) {
                C1637j.i(background, d0Var, this.f14965a.getDrawableState());
                return;
            }
            d0 d0Var2 = this.f14968d;
            if (d0Var2 != null) {
                C1637j.i(background, d0Var2, this.f14965a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        d0 d0Var = this.f14969e;
        if (d0Var != null) {
            return d0Var.f14971a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        d0 d0Var = this.f14969e;
        if (d0Var != null) {
            return d0Var.f14972b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        f0 f0VarV = f0.v(this.f14965a.getContext(), attributeSet, AbstractC2577j.f26989Q3, i10, 0);
        View view = this.f14965a;
        AbstractC1658a0.i0(view, view.getContext(), AbstractC2577j.f26989Q3, attributeSet, f0VarV.r(), i10, 0);
        try {
            if (f0VarV.s(AbstractC2577j.f26994R3)) {
                this.f14967c = f0VarV.n(AbstractC2577j.f26994R3, -1);
                ColorStateList colorStateListF = this.f14966b.f(this.f14965a.getContext(), this.f14967c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (f0VarV.s(AbstractC2577j.f26999S3)) {
                AbstractC1658a0.p0(this.f14965a, f0VarV.c(AbstractC2577j.f26999S3));
            }
            if (f0VarV.s(AbstractC2577j.f27004T3)) {
                AbstractC1658a0.q0(this.f14965a, M.e(f0VarV.k(AbstractC2577j.f27004T3, -1), null));
            }
            f0VarV.x();
        } catch (Throwable th) {
            f0VarV.x();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f14967c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f14967c = i10;
        C1637j c1637j = this.f14966b;
        h(c1637j != null ? c1637j.f(this.f14965a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f14968d == null) {
                this.f14968d = new d0();
            }
            d0 d0Var = this.f14968d;
            d0Var.f14971a = colorStateList;
            d0Var.f14974d = true;
        } else {
            this.f14968d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f14969e == null) {
            this.f14969e = new d0();
        }
        d0 d0Var = this.f14969e;
        d0Var.f14971a = colorStateList;
        d0Var.f14974d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f14969e == null) {
            this.f14969e = new d0();
        }
        d0 d0Var = this.f14969e;
        d0Var.f14972b = mode;
        d0Var.f14973c = true;
        b();
    }
}
