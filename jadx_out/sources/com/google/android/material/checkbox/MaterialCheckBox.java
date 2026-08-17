package com.google.android.material.checkbox;

import Q4.e;
import Q4.i;
import Q4.j;
import Q4.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C1633f;
import androidx.appcompat.widget.f0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import e5.AbstractC2425c;
import f.AbstractC2568a;
import g.AbstractC2619a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k5.AbstractC2830a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends C1633f {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int f23020E = j.f9423v;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f23021F = {Q4.a.f9106H0};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final int[] f23022G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final int[][] f23023H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int f23024I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private CharSequence f23025A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f23026B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f23027C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f23028D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashSet f23029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final LinkedHashSet f23030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f23031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f23035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f23036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f23037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ColorStateList f23039u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ColorStateList f23040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private PorterDuff.Mode f23041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f23042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int[] f23043y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f23044z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23045g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f23045g;
            return i10 != 1 ? i10 != 2 ? "unchecked" : ReactProgressBarViewManager.PROP_INDETERMINATE : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f23045g));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f23045g = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f23039u;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f23039u;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.f23043y, MaterialCheckBox.this.f23039u.getDefaultColor()));
            }
        }
    }

    static {
        int i10 = Q4.a.f9104G0;
        f23022G = new int[]{i10};
        f23023H = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f23024I = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26743o);
    }

    private boolean c(f0 f0Var) {
        return f0Var.n(k.f9694g3, 0) == f23024I && f0Var.n(k.f9702h3, 0) == 0;
    }

    private void e() {
        this.f23036r = d.c(this.f23036r, this.f23039u, androidx.core.widget.c.c(this));
        this.f23037s = d.c(this.f23037s, this.f23040v, this.f23041w);
        g();
        h();
        super.setButtonDrawable(d.a(this.f23036r, this.f23037s));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f23025A != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f23038t) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f23027C;
            if (cVar2 != null) {
                cVar2.f(this.f23028D);
                this.f23027C.b(this.f23028D);
            }
            Drawable drawable = this.f23036r;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f23027C) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(e.f9299b, e.f9300b0, cVar, false);
            ((AnimatedStateListDrawable) this.f23036r).addTransition(e.f9306h, e.f9300b0, this.f23027C, false);
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f23042x;
        return i10 == 1 ? getResources().getString(i.f9383k) : i10 == 0 ? getResources().getString(i.f9385m) : getResources().getString(i.f9384l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f23031m == null) {
            int[][] iArr = f23023H;
            int[] iArr2 = new int[iArr.length];
            int iD = X4.a.d(this, AbstractC2568a.f26747s);
            int iD2 = X4.a.d(this, AbstractC2568a.f26750v);
            int iD3 = X4.a.d(this, Q4.a.f9109J);
            int iD4 = X4.a.d(this, Q4.a.f9164r);
            iArr2[0] = X4.a.j(iD3, iD2, 1.0f);
            iArr2[1] = X4.a.j(iD3, iD, 1.0f);
            iArr2[2] = X4.a.j(iD3, iD4, 0.54f);
            iArr2[3] = X4.a.j(iD3, iD4, 0.38f);
            iArr2[4] = X4.a.j(iD3, iD4, 0.38f);
            this.f23031m = new ColorStateList(iArr, iArr2);
        }
        return this.f23031m;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f23039u;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f23036r;
        if (drawable != null && (colorStateList2 = this.f23039u) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f23037s;
        if (drawable2 == null || (colorStateList = this.f23040v) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    public boolean d() {
        return this.f23034p;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f23036r;
    }

    public Drawable getButtonIconDrawable() {
        return this.f23037s;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f23040v;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f23041w;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f23039u;
    }

    public int getCheckedState() {
        return this.f23042x;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f23035q;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f23042x == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23032n && this.f23039u == null && this.f23040v == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f23021F);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f23022G);
        }
        this.f23043y = d.e(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f23033o || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (o.h(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f23035q));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f23045g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23045g = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.C1633f, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC2619a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f23037s = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(AbstractC2619a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f23040v == colorStateList) {
            return;
        }
        this.f23040v = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f23041w == mode) {
            return;
        }
        this.f23041w = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f23039u == colorStateList) {
            return;
        }
        this.f23039u = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f23033o = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f23042x != i10) {
            this.f23042x = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f23044z) {
                return;
            }
            this.f23044z = true;
            LinkedHashSet linkedHashSet = this.f23030l;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            if (this.f23042x != 2 && (onCheckedChangeListener = this.f23026B) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = b.a(getContext().getSystemService(com.google.android.material.checkbox.a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f23044z = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f23035q = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f23034p == z10) {
            return;
        }
        this.f23034p = z10;
        refreshDrawableState();
        Iterator it = this.f23029k.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f23026B = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f23025A = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f23032n = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f23020E;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f23029k = new LinkedHashSet();
        this.f23030l = new LinkedHashSet();
        this.f23027C = androidx.vectordrawable.graphics.drawable.c.a(getContext(), Q4.d.f9265e);
        this.f23028D = new a();
        Context context2 = getContext();
        this.f23036r = androidx.core.widget.c.a(this);
        this.f23039u = getSuperButtonTintList();
        setSupportButtonTintList(null);
        f0 f0VarJ = l.j(context2, attributeSet, k.f9685f3, i10, i11, new int[0]);
        this.f23037s = f0VarJ.g(k.f9710i3);
        if (this.f23036r != null && l.g(context2) && c(f0VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f23036r = AbstractC2619a.b(context2, Q4.d.f9264d);
            this.f23038t = true;
            if (this.f23037s == null) {
                this.f23037s = AbstractC2619a.b(context2, Q4.d.f9266f);
            }
        }
        this.f23040v = AbstractC2425c.b(context2, f0VarJ, k.f9718j3);
        this.f23041w = o.i(f0VarJ.k(k.f9726k3, -1), PorterDuff.Mode.SRC_IN);
        this.f23032n = f0VarJ.a(k.f9766p3, false);
        this.f23033o = f0VarJ.a(k.f9734l3, true);
        this.f23034p = f0VarJ.a(k.f9758o3, false);
        this.f23035q = f0VarJ.p(k.f9750n3);
        if (f0VarJ.s(k.f9742m3)) {
            setCheckedState(f0VarJ.k(k.f9742m3, 0));
        }
        f0VarJ.x();
        e();
    }

    @Override // androidx.appcompat.widget.C1633f, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f23036r = drawable;
        this.f23038t = false;
        e();
    }
}
