package com.google.android.material.button;

import Q4.j;
import Q4.k;
import U0.m;
import U0.n;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C1632e;
import androidx.customview.view.AbsSavedState;
import e5.AbstractC2425c;
import g.AbstractC2619a;
import h5.h;
import h5.i;
import h5.l;
import h5.o;
import h5.q;
import h5.r;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k5.AbstractC2830a;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends C1632e implements Checkable, o {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final int[] f22866L = {R.attr.state_checkable};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int[] f22867M = {R.attr.state_checked};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f22868N = j.f9421t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f22869O = Q4.a.f9153l0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final U0.j f22870P = new a("widthIncrease");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f22871A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private LinearLayout.LayoutParams f22872B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f22873C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f22874D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f22875E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f22876F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    r f22877G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f22878H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f22879I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f22880J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private m f22881K;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e f22882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashSet f22883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f22884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PorterDuff.Mode f22885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f22886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f22887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f22888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f22889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f22890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f22891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f22892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f22893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f22894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f22895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f22896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f22897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f22898z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f22899i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f22899i = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22899i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends U0.j {
        a(String str) {
            super(str);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9139e0);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f22874D = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f10) {
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.f22874D != i10) {
            materialButton.f22874D = i10;
            materialButton.s();
            materialButton.invalidate();
        }
    }

    private n e() {
        return c5.d.h(getContext(), Q4.a.f9181z0, j.f9402a);
    }

    private void f() {
        m mVar = new m(this, f22870P);
        this.f22881K = mVar;
        mVar.t(e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f22879I;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        h hVarG;
        if (this.f22873C && this.f22875E && (hVarG = this.f22882j.g()) != null) {
            return (int) (hVarG.z() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean h() {
        int i10 = this.f22895w;
        return i10 == 3 || i10 == 4;
    }

    private boolean i() {
        int i10 = this.f22895w;
        return i10 == 1 || i10 == 2;
    }

    private boolean j() {
        int i10 = this.f22895w;
        return i10 == 16 || i10 == 32;
    }

    private boolean k() {
        return (getParent() instanceof d) && ((d) getParent()).getOrientation() == 0;
    }

    private boolean l() {
        return getLayoutDirection() == 1;
    }

    private boolean m() {
        e eVar = this.f22882j;
        return (eVar == null || eVar.q()) ? false : true;
    }

    private void n(boolean z10) {
        if (this.f22877G == null) {
            return;
        }
        if (this.f22881K == null) {
            f();
        }
        if (this.f22875E) {
            this.f22881K.o(Math.min(this.f22878H, this.f22877G.e(getDrawableState()).f28455a.a(getWidth())));
            if (z10) {
                this.f22881K.u();
            }
        }
    }

    private void p() {
        if (i()) {
            setCompoundDrawablesRelative(this.f22887o, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.f22887o, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.f22887o, null, null);
        }
    }

    private void q(boolean z10) {
        Drawable drawable = this.f22887o;
        if (drawable != null) {
            Drawable drawableMutate = AbstractC3606a.r(drawable).mutate();
            this.f22887o = drawableMutate;
            drawableMutate.setTintList(this.f22886n);
            PorterDuff.Mode mode = this.f22885m;
            if (mode != null) {
                this.f22887o.setTintMode(mode);
            }
            int intrinsicWidth = this.f22889q;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f22887o.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f22889q;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f22887o.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f22887o;
            int i10 = this.f22890r;
            int i11 = this.f22891s;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f22887o.setVisible(true, z10);
        }
        if (z10) {
            p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.f22887o) && ((!h() || drawable5 == this.f22887o) && (!j() || drawable4 == this.f22887o))) {
            return;
        }
        p();
    }

    private void r(int i10, int i11) {
        if (this.f22887o == null || getLayout() == null) {
            return;
        }
        if (!i() && !h()) {
            if (j()) {
                this.f22890r = 0;
                if (this.f22895w == 16) {
                    this.f22891s = 0;
                    q(false);
                    return;
                }
                int intrinsicHeight = this.f22889q;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f22887o.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f22892t) - getPaddingBottom()) / 2);
                if (this.f22891s != iMax) {
                    this.f22891s = iMax;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f22891s = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f22895w;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f22890r = 0;
            q(false);
            return;
        }
        int intrinsicWidth = this.f22889q;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f22887o.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f22892t) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (l() != (this.f22895w == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f22890r != textLayoutWidth) {
            this.f22890r = textLayoutWidth;
            q(false);
        }
    }

    private void s() {
        int i10 = (int) (this.f22879I - this.f22880J);
        int i11 = (i10 / 2) + this.f22874D;
        getLayoutParams().width = (int) (this.f22897y + i10);
        setPaddingRelative(this.f22898z + i11, getPaddingTop(), (this.f22871A + i10) - i11, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z10) {
        if (!g() || this.f22893u == z10) {
            return;
        }
        this.f22893u = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).w(this, this.f22893u);
        }
        if (this.f22894v) {
            return;
        }
        this.f22894v = true;
        Iterator it = this.f22883k.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f22894v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.f22879I != f10) {
            this.f22879I = f10;
            s();
            invalidate();
            if (getParent() instanceof d) {
                ((d) getParent()).k(this, (int) this.f22879I);
            }
        }
    }

    public boolean g() {
        e eVar = this.f22882j;
        return eVar != null && eVar.r();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f22888p)) {
            return (g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f22888p;
    }

    int getAllowedWidthDecrease() {
        return this.f22876F;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m()) {
            return this.f22882j.b();
        }
        return 0;
    }

    public n getCornerSpringForce() {
        return this.f22882j.c();
    }

    public Drawable getIcon() {
        return this.f22887o;
    }

    public int getIconGravity() {
        return this.f22895w;
    }

    public int getIconPadding() {
        return this.f22892t;
    }

    public int getIconSize() {
        return this.f22889q;
    }

    public ColorStateList getIconTint() {
        return this.f22886n;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f22885m;
    }

    public int getInsetBottom() {
        return this.f22882j.d();
    }

    public int getInsetTop() {
        return this.f22882j.e();
    }

    public ColorStateList getRippleColor() {
        if (m()) {
            return this.f22882j.i();
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (m()) {
            return this.f22882j.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public q getStateListShapeAppearanceModel() {
        if (m()) {
            return this.f22882j.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m()) {
            return this.f22882j.l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m()) {
            return this.f22882j.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C1632e
    public ColorStateList getSupportBackgroundTintList() {
        return m() ? this.f22882j.n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C1632e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m() ? this.f22882j.o() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f22893u;
    }

    void o() {
        LinearLayout.LayoutParams layoutParams = this.f22872B;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f22872B = null;
            this.f22897y = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            i.f(this, this.f22882j.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22866L);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22867M);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C1632e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C1632e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C1632e, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        r(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f22896x != i15) {
            this.f22896x = i15;
            this.f22897y = -1.0f;
        }
        if (this.f22897y == -1.0f) {
            this.f22897y = getMeasuredWidth();
            if (this.f22872B == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.f22872B = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f22872B);
                layoutParams.width = (int) this.f22897y;
                setLayoutParams(layoutParams);
            }
        }
        if (this.f22876F == -1) {
            if (this.f22887o == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f22889q;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f22887o.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.f22876F = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.f22898z == -1) {
            this.f22898z = getPaddingStart();
        }
        if (this.f22871A == -1) {
            this.f22871A = getPaddingEnd();
        }
        this.f22875E = k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f22899i);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22899i = this.f22893u;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C1632e, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f22882j.s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f22887o != null) {
            if (this.f22887o.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f22888p = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (m()) {
            this.f22882j.u(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.C1632e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.f22882j.v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C1632e, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m()) {
            this.f22882j.w(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i10) {
        if (m()) {
            this.f22882j.x(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(n nVar) {
        this.f22882j.z(nVar);
    }

    void setDisplayedWidthDecrease(int i10) {
        this.f22880J = Math.min(i10, this.f22876F);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m()) {
            this.f22882j.g().c0(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f22887o != drawable) {
            this.f22887o = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f22895w != i10) {
            this.f22895w = i10;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f22892t != i10) {
            this.f22892t = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f22889q != i10) {
            this.f22889q = i10;
            q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f22886n != colorStateList) {
            this.f22886n = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f22885m != mode) {
            this.f22885m = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC2619a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f22882j.A(i10);
    }

    public void setInsetTop(int i10) {
        this.f22882j.B(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f22884l = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.f22873C != z10) {
            this.f22873C = z10;
            if (z10) {
                this.f22882j.y(new h.d() { // from class: com.google.android.material.button.a
                    @Override // h5.h.d
                    public final void a(float f10) {
                        MaterialButton.b(this.f22908a, f10);
                    }
                });
            } else {
                this.f22882j.y(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(this.f22909g);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f22884l;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
        n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m()) {
            this.f22882j.C(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (m()) {
            setRippleColor(AbstractC2619a.a(getContext(), i10));
        }
    }

    @Override // h5.o
    public void setShapeAppearanceModel(l lVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f22882j.D(lVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m()) {
            this.f22882j.E(z10);
        }
    }

    void setSizeChange(r rVar) {
        if (this.f22877G != rVar) {
            this.f22877G = rVar;
            n(true);
        }
    }

    public void setStateListShapeAppearanceModel(q qVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f22882j.c() == null && qVar.f()) {
            this.f22882j.z(e());
        }
        this.f22882j.F(qVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m()) {
            this.f22882j.G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m()) {
            setStrokeColor(AbstractC2619a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m()) {
            this.f22882j.H(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.C1632e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m()) {
            this.f22882j.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C1632e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m()) {
            this.f22882j.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f22882j.K(z10);
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.f22897y = -1.0f;
        super.setWidth(i10);
    }

    void setWidthChangeMax(int i10) {
        if (this.f22878H != i10) {
            this.f22878H = i10;
            n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f22893u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f22868N;
        super(AbstractC2830a.e(context, attributeSet, i10, i11, new int[]{f22869O}), attributeSet, i10);
        this.f22883k = new LinkedHashSet();
        this.f22893u = false;
        this.f22894v = false;
        this.f22896x = -1;
        this.f22897y = -1.0f;
        this.f22898z = -1;
        this.f22871A = -1;
        this.f22876F = -1;
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.l.i(context2, attributeSet, k.f9630Z1, i10, i11, new int[0]);
        this.f22892t = typedArrayI.getDimensionPixelSize(k.f9749n2, 0);
        this.f22885m = com.google.android.material.internal.o.i(typedArrayI.getInt(k.f9773q2, -1), PorterDuff.Mode.SRC_IN);
        this.f22886n = AbstractC2425c.a(getContext(), typedArrayI, k.f9765p2);
        this.f22887o = AbstractC2425c.e(getContext(), typedArrayI, k.f9733l2);
        this.f22895w = typedArrayI.getInteger(k.f9741m2, 1);
        this.f22889q = typedArrayI.getDimensionPixelSize(k.f9757o2, 0);
        q qVarB = q.b(context2, typedArrayI, k.f9797t2);
        l lVarC = qVarB != null ? qVarB.c(true) : l.e(context2, attributeSet, i10, i11).m();
        boolean z10 = typedArrayI.getBoolean(k.f9781r2, false);
        e eVar = new e(this, lVarC);
        this.f22882j = eVar;
        eVar.t(typedArrayI);
        setCheckedInternal(typedArrayI.getBoolean(k.f9648b2, false));
        if (qVarB != null) {
            eVar.z(e());
            eVar.F(qVarB);
        }
        setOpticalCenterEnabled(z10);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f22892t);
        q(this.f22887o != null);
    }
}
