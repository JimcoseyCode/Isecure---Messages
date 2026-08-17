package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import f.AbstractC2568a;
import g.AbstractC2619a;

/* JADX INFO: renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1647u extends RadioButton implements androidx.core.widget.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1636i f15084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1631d f15085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f15086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1640m f15087j;

    public C1647u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26719F);
    }

    private C1640m getEmojiTextViewHelper() {
        if (this.f15087j == null) {
            this.f15087j = new C1640m(this);
        }
        return this.f15087j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1631d c1631d = this.f15085h;
        if (c1631d != null) {
            c1631d.b();
        }
        A a10 = this.f15086i;
        if (a10 != null) {
            a10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.f15085h;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.f15085h;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportButtonTintList() {
        C1636i c1636i = this.f15084g;
        if (c1636i != null) {
            return c1636i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1636i c1636i = this.f15084g;
        if (c1636i != null) {
            return c1636i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15086i.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15086i.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.f15085h;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.f15085h;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1636i c1636i = this.f15084g;
        if (c1636i != null) {
            c1636i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f15086i;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f15086i;
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
        C1631d c1631d = this.f15085h;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.f15085h;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1636i c1636i = this.f15084g;
        if (c1636i != null) {
            c1636i.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1636i c1636i = this.f15084g;
        if (c1636i != null) {
            c1636i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f15086i.w(colorStateList);
        this.f15086i.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f15086i.x(mode);
        this.f15086i.b();
    }

    public C1647u(Context context, AttributeSet attributeSet, int i10) {
        super(c0.b(context), attributeSet, i10);
        b0.a(this, getContext());
        C1636i c1636i = new C1636i(this);
        this.f15084g = c1636i;
        c1636i.d(attributeSet, i10);
        C1631d c1631d = new C1631d(this);
        this.f15085h = c1631d;
        c1631d.e(attributeSet, i10);
        A a10 = new A(this);
        this.f15086i = a10;
        a10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC2619a.b(getContext(), i10));
    }
}
