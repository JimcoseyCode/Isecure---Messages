package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.AbstractC1658a0;
import f.AbstractC2577j;
import g.AbstractC2619a;
import y0.AbstractC3606a;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C1635h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f14991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f14992b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f14993c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14994d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14995e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14996f;

    C1635h(CheckedTextView checkedTextView) {
        this.f14991a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f14991a);
        if (drawableA != null) {
            if (this.f14994d || this.f14995e) {
                Drawable drawableMutate = AbstractC3606a.r(drawableA).mutate();
                if (this.f14994d) {
                    AbstractC3606a.o(drawableMutate, this.f14992b);
                }
                if (this.f14995e) {
                    AbstractC3606a.p(drawableMutate, this.f14993c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f14991a.getDrawableState());
                }
                this.f14991a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f14992b;
    }

    PorterDuff.Mode c() {
        return this.f14993c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        f0 f0VarV = f0.v(this.f14991a.getContext(), attributeSet, AbstractC2577j.f26981P0, i10, 0);
        CheckedTextView checkedTextView = this.f14991a;
        AbstractC1658a0.i0(checkedTextView, checkedTextView.getContext(), AbstractC2577j.f26981P0, attributeSet, f0VarV.r(), i10, 0);
        try {
            if (f0VarV.s(AbstractC2577j.f26991R0) && (iN2 = f0VarV.n(AbstractC2577j.f26991R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f14991a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC2619a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (f0VarV.s(AbstractC2577j.f26986Q0)) {
                        CheckedTextView checkedTextView3 = this.f14991a;
                        checkedTextView3.setCheckMarkDrawable(AbstractC2619a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (f0VarV.s(AbstractC2577j.f26986Q0) && (iN = f0VarV.n(AbstractC2577j.f26986Q0, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.f14991a;
                checkedTextView32.setCheckMarkDrawable(AbstractC2619a.b(checkedTextView32.getContext(), iN));
            }
            if (f0VarV.s(AbstractC2577j.f26996S0)) {
                androidx.core.widget.b.b(this.f14991a, f0VarV.c(AbstractC2577j.f26996S0));
            }
            if (f0VarV.s(AbstractC2577j.f27001T0)) {
                androidx.core.widget.b.c(this.f14991a, M.e(f0VarV.k(AbstractC2577j.f27001T0, -1), null));
            }
            f0VarV.x();
        } catch (Throwable th) {
            f0VarV.x();
            throw th;
        }
    }

    void e() {
        if (this.f14996f) {
            this.f14996f = false;
        } else {
            this.f14996f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f14992b = colorStateList;
        this.f14994d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f14993c = mode;
        this.f14995e = true;
        a();
    }
}
