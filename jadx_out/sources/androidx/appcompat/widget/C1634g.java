package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import f.AbstractC2568a;
import g.AbstractC2619a;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1634g extends CheckedTextView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1635h f14986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1631d f14987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f14988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1640m f14989j;

    public C1634g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26744p);
    }

    private C1640m getEmojiTextViewHelper() {
        if (this.f14989j == null) {
            this.f14989j = new C1640m(this);
        }
        return this.f14989j;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        A a10 = this.f14988i;
        if (a10 != null) {
            a10.b();
        }
        C1631d c1631d = this.f14987h;
        if (c1631d != null) {
            c1631d.b();
        }
        C1635h c1635h = this.f14986g;
        if (c1635h != null) {
            c1635h.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.f14987h;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.f14987h;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1635h c1635h = this.f14986g;
        if (c1635h != null) {
            return c1635h.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1635h c1635h = this.f14986g;
        if (c1635h != null) {
            return c1635h.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14988i.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14988i.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1641n.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.f14987h;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.f14987h;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1635h c1635h = this.f14986g;
        if (c1635h != null) {
            c1635h.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f14988i;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f14988i;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1631d c1631d = this.f14987h;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.f14987h;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1635h c1635h = this.f14986g;
        if (c1635h != null) {
            c1635h.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1635h c1635h = this.f14986g;
        if (c1635h != null) {
            c1635h.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14988i.w(colorStateList);
        this.f14988i.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14988i.x(mode);
        this.f14988i.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        A a10 = this.f14988i;
        if (a10 != null) {
            a10.q(context, i10);
        }
    }

    public C1634g(Context context, AttributeSet attributeSet, int i10) {
        super(c0.b(context), attributeSet, i10);
        b0.a(this, getContext());
        A a10 = new A(this);
        this.f14988i = a10;
        a10.m(attributeSet, i10);
        a10.b();
        C1631d c1631d = new C1631d(this);
        this.f14987h = c1631d;
        c1631d.e(attributeSet, i10);
        C1635h c1635h = new C1635h(this);
        this.f14986g = c1635h;
        c1635h.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC2619a.b(getContext(), i10));
    }
}
