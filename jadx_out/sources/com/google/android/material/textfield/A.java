package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import com.google.android.material.internal.CheckableImageButton;
import e5.AbstractC2425c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class A extends LinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextInputLayout f23714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextView f23715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f23716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CheckableImageButton f23717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f23718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f23719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f23721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f23722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23723p;

    A(TextInputLayout textInputLayout, f0 f0Var) {
        super(textInputLayout.getContext());
        this.f23714g = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(Q4.g.f9331d, (ViewGroup) this, false);
        this.f23717j = checkableImageButton;
        u.e(checkableImageButton);
        androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(getContext());
        this.f23715h = b10;
        j(f0Var);
        i(f0Var);
        addView(checkableImageButton);
        addView(b10);
    }

    private void C() {
        int i10 = (this.f23716i == null || this.f23723p) ? 8 : 0;
        setVisibility((this.f23717j.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f23715h.setVisibility(i10);
        this.f23714g.p0();
    }

    private void i(f0 f0Var) {
        this.f23715h.setVisibility(8);
        this.f23715h.setId(Q4.e.f9296Z);
        this.f23715h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f23715h.setAccessibilityLiveRegion(1);
        o(f0Var.n(Q4.k.f9555P6, 0));
        if (f0Var.s(Q4.k.f9563Q6)) {
            p(f0Var.c(Q4.k.f9563Q6));
        }
        n(f0Var.p(Q4.k.f9547O6));
    }

    private void j(f0 f0Var) {
        if (AbstractC2425c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f23717j.getLayoutParams()).setMarginEnd(0);
        }
        u(null);
        v(null);
        if (f0Var.s(Q4.k.f9611W6)) {
            this.f23718k = AbstractC2425c.b(getContext(), f0Var, Q4.k.f9611W6);
        }
        if (f0Var.s(Q4.k.f9619X6)) {
            this.f23719l = com.google.android.material.internal.o.i(f0Var.k(Q4.k.f9619X6, -1), null);
        }
        if (f0Var.s(Q4.k.f9587T6)) {
            s(f0Var.g(Q4.k.f9587T6));
            if (f0Var.s(Q4.k.f9579S6)) {
                r(f0Var.p(Q4.k.f9579S6));
            }
            q(f0Var.a(Q4.k.f9571R6, true));
        }
        t(f0Var.f(Q4.k.f9595U6, getResources().getDimensionPixelSize(Q4.c.f9239m0)));
        if (f0Var.s(Q4.k.f9603V6)) {
            w(u.b(f0Var.k(Q4.k.f9603V6, -1)));
        }
    }

    void A(I0.z zVar) {
        if (this.f23715h.getVisibility() != 0) {
            zVar.Z0(this.f23717j);
        } else {
            zVar.H0(this.f23715h);
            zVar.Z0(this.f23715h);
        }
    }

    void B() {
        EditText editText = this.f23714g.f23776k;
        if (editText == null) {
            return;
        }
        this.f23715h.setPaddingRelative(k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(Q4.c.f9206S), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f23716i;
    }

    ColorStateList b() {
        return this.f23715h.getTextColors();
    }

    int c() {
        return getPaddingStart() + this.f23715h.getPaddingStart() + (k() ? this.f23717j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f23717j.getLayoutParams()).getMarginEnd() : 0);
    }

    TextView d() {
        return this.f23715h;
    }

    CharSequence e() {
        return this.f23717j.getContentDescription();
    }

    Drawable f() {
        return this.f23717j.getDrawable();
    }

    int g() {
        return this.f23720m;
    }

    ImageView.ScaleType h() {
        return this.f23721n;
    }

    boolean k() {
        return this.f23717j.getVisibility() == 0;
    }

    void l(boolean z10) {
        this.f23723p = z10;
        C();
    }

    void m() {
        u.d(this.f23714g, this.f23717j, this.f23718k);
    }

    void n(CharSequence charSequence) {
        this.f23716i = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f23715h.setText(charSequence);
        C();
    }

    void o(int i10) {
        androidx.core.widget.i.m(this.f23715h, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f23715h.setTextColor(colorStateList);
    }

    void q(boolean z10) {
        this.f23717j.setCheckable(z10);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f23717j.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f23717j.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f23714g, this.f23717j, this.f23718k, this.f23719l);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f23720m) {
            this.f23720m = i10;
            u.g(this.f23717j, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        u.h(this.f23717j, onClickListener, this.f23722o);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f23722o = onLongClickListener;
        u.i(this.f23717j, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f23721n = scaleType;
        u.j(this.f23717j, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f23718k != colorStateList) {
            this.f23718k = colorStateList;
            u.a(this.f23714g, this.f23717j, colorStateList, this.f23719l);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f23719l != mode) {
            this.f23719l = mode;
            u.a(this.f23714g, this.f23717j, this.f23718k, mode);
        }
    }

    void z(boolean z10) {
        if (k() != z10) {
            this.f23717j.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
