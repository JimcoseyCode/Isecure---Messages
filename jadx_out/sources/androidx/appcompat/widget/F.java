package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class F extends ToggleButton {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1631d f14654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A f14655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1640m f14656i;

    public F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C1640m getEmojiTextViewHelper() {
        if (this.f14656i == null) {
            this.f14656i = new C1640m(this);
        }
        return this.f14656i;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1631d c1631d = this.f14654g;
        if (c1631d != null) {
            c1631d.b();
        }
        A a10 = this.f14655h;
        if (a10 != null) {
            a10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.f14654g;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.f14654g;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14655h.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14655h.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.f14654g;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.f14654g;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f14655h;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f14655h;
        if (a10 != null) {
            a10.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1631d c1631d = this.f14654g;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.f14654g;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14655h.w(colorStateList);
        this.f14655h.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14655h.x(mode);
        this.f14655h.b();
    }

    public F(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0.a(this, getContext());
        C1631d c1631d = new C1631d(this);
        this.f14654g = c1631d;
        c1631d.e(attributeSet, i10);
        A a10 = new A(this);
        this.f14655h = a10;
        a10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
