package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC1658a0;
import f.AbstractC2577j;
import g.AbstractC2619a;
import y0.AbstractC3606a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C1636i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f14998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f14999b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f15000c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15001d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15002e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15003f;

    C1636i(CompoundButton compoundButton) {
        this.f14998a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f14998a);
        if (drawableA != null) {
            if (this.f15001d || this.f15002e) {
                Drawable drawableMutate = AbstractC3606a.r(drawableA).mutate();
                if (this.f15001d) {
                    AbstractC3606a.o(drawableMutate, this.f14999b);
                }
                if (this.f15002e) {
                    AbstractC3606a.p(drawableMutate, this.f15000c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f14998a.getDrawableState());
                }
                this.f14998a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f14999b;
    }

    PorterDuff.Mode c() {
        return this.f15000c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        f0 f0VarV = f0.v(this.f14998a.getContext(), attributeSet, AbstractC2577j.f27006U0, i10, 0);
        CompoundButton compoundButton = this.f14998a;
        AbstractC1658a0.i0(compoundButton, compoundButton.getContext(), AbstractC2577j.f27006U0, attributeSet, f0VarV.r(), i10, 0);
        try {
            if (f0VarV.s(AbstractC2577j.f27016W0) && (iN2 = f0VarV.n(AbstractC2577j.f27016W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f14998a;
                    compoundButton2.setButtonDrawable(AbstractC2619a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (f0VarV.s(AbstractC2577j.f27011V0)) {
                        CompoundButton compoundButton3 = this.f14998a;
                        compoundButton3.setButtonDrawable(AbstractC2619a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (f0VarV.s(AbstractC2577j.f27011V0) && (iN = f0VarV.n(AbstractC2577j.f27011V0, 0)) != 0) {
                CompoundButton compoundButton32 = this.f14998a;
                compoundButton32.setButtonDrawable(AbstractC2619a.b(compoundButton32.getContext(), iN));
            }
            if (f0VarV.s(AbstractC2577j.f27021X0)) {
                androidx.core.widget.c.d(this.f14998a, f0VarV.c(AbstractC2577j.f27021X0));
            }
            if (f0VarV.s(AbstractC2577j.f27026Y0)) {
                androidx.core.widget.c.e(this.f14998a, M.e(f0VarV.k(AbstractC2577j.f27026Y0, -1), null));
            }
            f0VarV.x();
        } catch (Throwable th) {
            f0VarV.x();
            throw th;
        }
    }

    void e() {
        if (this.f15003f) {
            this.f15003f = false;
        } else {
            this.f15003f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f14999b = colorStateList;
        this.f15001d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f15000c = mode;
        this.f15002e = true;
        a();
    }
}
