package com.google.android.material.chip;

import I0.z;
import Q4.i;
import Q4.j;
import Q4.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C1633f;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import com.google.android.material.internal.f;
import com.google.android.material.internal.l;
import e5.AbstractC2424b;
import e5.e;
import e5.g;
import f5.AbstractC2614a;
import h5.o;
import java.util.List;
import k5.AbstractC2830a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class Chip extends C1633f implements a.InterfaceC0226a, o, Checkable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final int f23047C = j.f9422u;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Rect f23048D = new Rect();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f23049E = {R.attr.state_selected};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f23050F = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final RectF f23051A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final g f23052B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.material.chip.a f23053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InsetDrawable f23054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RippleDrawable f23055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f23056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f23057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f23059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f23061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f23063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f23065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final c f23066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f23067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Rect f23068z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f23053k != null) {
                Chip.this.f23053k.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c extends androidx.customview.widget.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.a
        protected int getVirtualViewAt(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.a
        protected void getVisibleVirtualViews(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f23056n != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.a
        protected boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        protected void onPopulateNodeForHost(z zVar) {
            zVar.u0(Chip.this.r());
            zVar.x0(Chip.this.isClickable());
            zVar.w0(Chip.this.getAccessibilityClassName());
            zVar.X0(Chip.this.getText());
        }

        @Override // androidx.customview.widget.a
        protected void onPopulateNodeForVirtualView(int i10, z zVar) {
            CharSequence charSequence = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (i10 != 1) {
                zVar.A0(PointerEventHelper.POINTER_TYPE_UNKNOWN);
                zVar.s0(Chip.f23048D);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                zVar.A0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i11 = i.f9386n;
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                zVar.A0(context.getString(i11, charSequence).trim());
            }
            zVar.s0(Chip.this.getCloseIconTouchBoundsInt());
            zVar.b(z.a.f3882i);
            zVar.B0(Chip.this.isEnabled());
            zVar.w0(Button.class.getName());
        }

        @Override // androidx.customview.widget.a
        protected void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f23061s = z10;
            }
            if (Chip.this.f23053k.G1(Chip.this.f23061s)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9138e);
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f23053k) == null) {
            return;
        }
        int iS0 = (int) (aVar.S0() + this.f23053k.s1() + this.f23053k.z0());
        int iX0 = (int) (this.f23053k.X0() + this.f23053k.t1() + this.f23053k.v0());
        if (this.f23054l != null) {
            Rect rect = new Rect();
            this.f23054l.getPadding(rect);
            iX0 += rect.left;
            iS0 += rect.right;
        }
        setPaddingRelative(iX0, getPaddingTop(), iS0, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.p(getContext(), paint, this.f23052B);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND);
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f23057o;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f23051A.setEmpty();
        if (n() && this.f23056n != null) {
            this.f23053k.h1(this.f23051A);
        }
        return this.f23051A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f23068z.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f23068z;
    }

    private e getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.z2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] l() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f23061s) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f23060r) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f23059q) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f23061s) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f23060r) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f23059q) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f23053k;
        return (aVar == null || aVar.a1() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = l.i(context, attributeSet, k.f9835y0, i10, f23047C, new int[0]);
        this.f23062t = typedArrayI.getBoolean(k.f9674e1, false);
        this.f23064v = (int) Math.ceil(typedArrayI.getDimension(k.f9573S0, AbstractC2424b.e(context)));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f23054l = new InsetDrawable((Drawable) this.f23053k, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f23060r != z10) {
            this.f23060r = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f23059q != z10) {
            this.f23059q = z10;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f23054l != null) {
            this.f23054l = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.z2(null);
        }
    }

    private void x() {
        if (n() && s() && this.f23056n != null) {
            AbstractC1658a0.k0(this, this.f23066x);
            this.f23067y = true;
        } else {
            AbstractC1658a0.k0(this, null);
            this.f23067y = false;
        }
    }

    private void y() {
        z();
    }

    private void z() {
        this.f23055m = new RippleDrawable(AbstractC2614a.d(this.f23053k.o1()), getBackgroundDrawable(), null);
        this.f23053k.V2(false);
        setBackground(this.f23055m);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0226a
    public void a() {
        m(this.f23064v);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f23067y ? super.dispatchHoverEvent(motionEvent) : this.f23066x.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f23067y) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f23066x.dispatchKeyEvent(keyEvent) || this.f23066x.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C1633f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f23053k;
        if ((aVar == null || !aVar.y1()) ? false : this.f23053k.v2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f23065w)) {
            return this.f23065w;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f23054l;
        return insetDrawable == null ? this.f23053k : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return Math.max(0.0f, aVar.R0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f23053k;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f23067y && (this.f23066x.getKeyboardFocusedVirtualViewId() == 1 || this.f23066x.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public R4.c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    public h5.l getShapeAppearanceModel() {
        return this.f23053k.H();
    }

    public R4.c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.p1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            return aVar.t1();
        }
        return 0.0f;
    }

    public boolean m(int i10) {
        this.f23064v = i10;
        if (!v()) {
            if (this.f23054l != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f23053k.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f23053k.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f23054l != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f23054l != null) {
            Rect rect = new Rect();
            this.f23054l.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h5.i.f(this, this.f23053k);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f23049E);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f23050F);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f23067y) {
            this.f23066x.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f23063u != i10) {
            this.f23063u = i10;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f23059q) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            } else {
                if (this.f23059q) {
                    t();
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z10 = true;
            }
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f23053k;
        return aVar != null && aVar.x1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f23053k;
        return aVar != null && aVar.z1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f23065w = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f23055m) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C1633f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f23055m) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.H1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar == null) {
            this.f23058p = z10;
        } else if (aVar.x1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.J1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.L1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.P1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.R1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f23053k;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f23053k = aVar;
            aVar.K2(false);
            k(this.f23053k);
            m(this.f23064v);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.T1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.V1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.Z1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.f2(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.g2(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.h2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.j2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.m2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.n2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.o2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.q2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.r2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.t2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.w2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.C1633f, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C1633f, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.c0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f23053k == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.A2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f23062t = z10;
        m(this.f23064v);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            return;
        }
        super.setGravity(i10);
    }

    public void setHideMotionSpec(R4.c cVar) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.B2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.C2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.D2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.F2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f23053k == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.H2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f23057o = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f23056n = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.I2(colorStateList);
        }
        if (this.f23053k.v1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.J2(i10);
            if (this.f23053k.v1()) {
                return;
            }
            z();
        }
    }

    @Override // h5.o
    public void setShapeAppearanceModel(h5.l lVar) {
        this.f23053k.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(R4.c cVar) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.L2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.M2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        super.setText(aVar.W2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f23053k;
        if (aVar2 != null) {
            aVar2.N2(charSequence);
        }
    }

    public void setTextAppearance(e eVar) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.O2(eVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.Q2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.R2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.S2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.T2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.U2(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f23056n;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f23067y) {
            this.f23066x.sendEventForVirtualView(1, 1);
        }
        return z10;
    }

    public boolean v() {
        return this.f23062t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f23047C;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f23068z = new Rect();
        this.f23051A = new RectF();
        this.f23052B = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarE0 = com.google.android.material.chip.a.E0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarE0);
        aVarE0.c0(getElevation());
        TypedArray typedArrayI = l.i(context2, attributeSet, k.f9835y0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(k.f9716j1);
        typedArrayI.recycle();
        this.f23066x = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f23058p);
        setText(aVarE0.q1());
        setEllipsize(aVarE0.k1());
        B();
        if (!this.f23053k.W2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f23064v);
        }
        this.f23063u = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: W4.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(this.f12123a, compoundButton, z10);
            }
        });
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.y2(z10);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.O1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.c2(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.P2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f23053k;
        if (aVar != null) {
            aVar.P2(i10);
        }
        B();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends g {
        a() {
        }

        @Override // e5.g
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f23053k.W2() ? Chip.this.f23053k.q1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // e5.g
        public void a(int i10) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // androidx.appcompat.widget.C1633f, android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setInternalOnCheckedChangeListener(f fVar) {
    }
}
