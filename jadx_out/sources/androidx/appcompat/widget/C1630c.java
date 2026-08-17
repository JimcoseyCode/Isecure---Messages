package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import f.AbstractC2568a;
import g.AbstractC2619a;

/* JADX INFO: renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1630c extends AutoCompleteTextView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f14957j = {R.attr.popupBackground};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1631d f14958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A f14959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1639l f14960i;

    public C1630c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26741m);
    }

    void a(C1639l c1639l) {
        KeyListener keyListener = getKeyListener();
        if (c1639l.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c1639l.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1631d c1631d = this.f14958g;
        if (c1631d != null) {
            c1631d.b();
        }
        A a10 = this.f14959h;
        if (a10 != null) {
            a10.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.f14958g;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.f14958g;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14959h.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14959h.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f14960i.e(AbstractC1641n.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.f14958g;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.f14958g;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f14959h;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a10 = this.f14959h;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC2619a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f14960i.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14960i.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1631d c1631d = this.f14958g;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.f14958g;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14959h.w(colorStateList);
        this.f14959h.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14959h.x(mode);
        this.f14959h.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        A a10 = this.f14959h;
        if (a10 != null) {
            a10.q(context, i10);
        }
    }

    public C1630c(Context context, AttributeSet attributeSet, int i10) {
        super(c0.b(context), attributeSet, i10);
        b0.a(this, getContext());
        f0 f0VarV = f0.v(getContext(), attributeSet, f14957j, i10, 0);
        if (f0VarV.s(0)) {
            setDropDownBackgroundDrawable(f0VarV.g(0));
        }
        f0VarV.x();
        C1631d c1631d = new C1631d(this);
        this.f14958g = c1631d;
        c1631d.e(attributeSet, i10);
        A a10 = new A(this);
        this.f14959h = a10;
        a10.m(attributeSet, i10);
        a10.b();
        C1639l c1639l = new C1639l(this);
        this.f14960i = c1639l;
        c1639l.d(attributeSet, i10);
        a(c1639l);
    }
}
