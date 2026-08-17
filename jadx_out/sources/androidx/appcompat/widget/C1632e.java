package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import f.AbstractC2568a;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1632e extends Button {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1631d f14975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A f14976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1640m f14977i;

    public C1632e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26742n);
    }

    private C1640m getEmojiTextViewHelper() {
        if (this.f14977i == null) {
            this.f14977i = new C1640m(this);
        }
        return this.f14977i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1631d c1631d = this.f14975g;
        if (c1631d != null) {
            c1631d.b();
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q0.f15074c) {
            return super.getAutoSizeMaxTextSize();
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            return a10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q0.f15074c) {
            return super.getAutoSizeMinTextSize();
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            return a10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q0.f15074c) {
            return super.getAutoSizeStepGranularity();
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            return a10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q0.f15074c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        A a10 = this.f14976h;
        return a10 != null ? a10.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (q0.f15074c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            return a10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.f14975g;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.f14975g;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14976h.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14976h.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        A a10 = this.f14976h;
        if (a10 == null || q0.f15074c || !a10.l()) {
            return;
        }
        this.f14976h.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (q0.f15074c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (q0.f15074c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (q0.f15074c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.f14975g;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.f14975g;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1631d c1631d = this.f14975g;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.f14975g;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14976h.w(colorStateList);
        this.f14976h.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14976h.x(mode);
        this.f14976h.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (q0.f15074c) {
            super.setTextSize(i10, f10);
            return;
        }
        A a10 = this.f14976h;
        if (a10 != null) {
            a10.A(i10, f10);
        }
    }

    public C1632e(Context context, AttributeSet attributeSet, int i10) {
        super(c0.b(context), attributeSet, i10);
        b0.a(this, getContext());
        C1631d c1631d = new C1631d(this);
        this.f14975g = c1631d;
        c1631d.e(attributeSet, i10);
        A a10 = new A(this);
        this.f14976h = a10;
        a10.m(attributeSet, i10);
        a10.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
