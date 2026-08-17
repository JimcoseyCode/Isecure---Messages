package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.AbstractC1658a0;
import f.AbstractC2577j;
import y0.AbstractC3606a;

/* JADX INFO: renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C1651y extends C1646t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f15090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f15091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f15092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f15093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f15094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15095i;

    C1651y(SeekBar seekBar) {
        super(seekBar);
        this.f15092f = null;
        this.f15093g = null;
        this.f15094h = false;
        this.f15095i = false;
        this.f15090d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f15091e;
        if (drawable != null) {
            if (this.f15094h || this.f15095i) {
                Drawable drawableR = AbstractC3606a.r(drawable.mutate());
                this.f15091e = drawableR;
                if (this.f15094h) {
                    AbstractC3606a.o(drawableR, this.f15092f);
                }
                if (this.f15095i) {
                    AbstractC3606a.p(this.f15091e, this.f15093g);
                }
                if (this.f15091e.isStateful()) {
                    this.f15091e.setState(this.f15090d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1646t
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        f0 f0VarV = f0.v(this.f15090d.getContext(), attributeSet, AbstractC2577j.f27000T, i10, 0);
        SeekBar seekBar = this.f15090d;
        AbstractC1658a0.i0(seekBar, seekBar.getContext(), AbstractC2577j.f27000T, attributeSet, f0VarV.r(), i10, 0);
        Drawable drawableH = f0VarV.h(AbstractC2577j.f27005U);
        if (drawableH != null) {
            this.f15090d.setThumb(drawableH);
        }
        j(f0VarV.g(AbstractC2577j.f27010V));
        if (f0VarV.s(AbstractC2577j.f27020X)) {
            this.f15093g = M.e(f0VarV.k(AbstractC2577j.f27020X, -1), this.f15093g);
            this.f15095i = true;
        }
        if (f0VarV.s(AbstractC2577j.f27015W)) {
            this.f15092f = f0VarV.c(AbstractC2577j.f27015W);
            this.f15094h = true;
        }
        f0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f15091e != null) {
            int max = this.f15090d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f15091e.getIntrinsicWidth();
                int intrinsicHeight = this.f15091e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f15091e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f15090d.getWidth() - this.f15090d.getPaddingLeft()) - this.f15090d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f15090d.getPaddingLeft(), this.f15090d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15091e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f15091e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f15090d.getDrawableState())) {
            this.f15090d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f15091e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f15091e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f15091e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f15090d);
            AbstractC3606a.m(drawable, this.f15090d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f15090d.getDrawableState());
            }
            f();
        }
        this.f15090d.invalidate();
    }
}
