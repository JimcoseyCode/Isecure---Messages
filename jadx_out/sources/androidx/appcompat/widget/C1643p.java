package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.AbstractC1658a0;
import f.AbstractC2577j;
import g.AbstractC2619a;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1643p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f15065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0 f15066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d0 f15067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d0 f15068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15069e = 0;

    public C1643p(ImageView imageView) {
        this.f15065a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f15068d == null) {
            this.f15068d = new d0();
        }
        d0 d0Var = this.f15068d;
        d0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f15065a);
        if (colorStateListA != null) {
            d0Var.f14974d = true;
            d0Var.f14971a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f15065a);
        if (modeB != null) {
            d0Var.f14973c = true;
            d0Var.f14972b = modeB;
        }
        if (!d0Var.f14974d && !d0Var.f14973c) {
            return false;
        }
        C1637j.i(drawable, d0Var, this.f15065a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f15066b != null;
    }

    void b() {
        if (this.f15065a.getDrawable() != null) {
            this.f15065a.getDrawable().setLevel(this.f15069e);
        }
    }

    void c() {
        Drawable drawable = this.f15065a.getDrawable();
        if (drawable != null) {
            M.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            d0 d0Var = this.f15067c;
            if (d0Var != null) {
                C1637j.i(drawable, d0Var, this.f15065a.getDrawableState());
                return;
            }
            d0 d0Var2 = this.f15066b;
            if (d0Var2 != null) {
                C1637j.i(drawable, d0Var2, this.f15065a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        d0 d0Var = this.f15067c;
        if (d0Var != null) {
            return d0Var.f14971a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        d0 d0Var = this.f15067c;
        if (d0Var != null) {
            return d0Var.f14972b;
        }
        return null;
    }

    boolean f() {
        return !(this.f15065a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        f0 f0VarV = f0.v(this.f15065a.getContext(), attributeSet, AbstractC2577j.f26980P, i10, 0);
        ImageView imageView = this.f15065a;
        AbstractC1658a0.i0(imageView, imageView.getContext(), AbstractC2577j.f26980P, attributeSet, f0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f15065a.getDrawable();
            if (drawable == null && (iN = f0VarV.n(AbstractC2577j.f26985Q, -1)) != -1 && (drawable = AbstractC2619a.b(this.f15065a.getContext(), iN)) != null) {
                this.f15065a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                M.b(drawable);
            }
            if (f0VarV.s(AbstractC2577j.f26990R)) {
                androidx.core.widget.e.c(this.f15065a, f0VarV.c(AbstractC2577j.f26990R));
            }
            if (f0VarV.s(AbstractC2577j.f26995S)) {
                androidx.core.widget.e.d(this.f15065a, M.e(f0VarV.k(AbstractC2577j.f26995S, -1), null));
            }
            f0VarV.x();
        } catch (Throwable th) {
            f0VarV.x();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.f15069e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = AbstractC2619a.b(this.f15065a.getContext(), i10);
            if (drawableB != null) {
                M.b(drawableB);
            }
            this.f15065a.setImageDrawable(drawableB);
        } else {
            this.f15065a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f15067c == null) {
            this.f15067c = new d0();
        }
        d0 d0Var = this.f15067c;
        d0Var.f14971a = colorStateList;
        d0Var.f14974d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f15067c == null) {
            this.f15067c = new d0();
        }
        d0 d0Var = this.f15067c;
        d0Var.f14972b = mode;
        d0Var.f14973c = true;
        c();
    }
}
