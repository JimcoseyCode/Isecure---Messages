package com.google.android.material.internal;

import I0.z;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.k0;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import f.AbstractC2568a;
import w0.AbstractC3461h;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements k.a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int[] f23360M = {R.attr.state_checked};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f23361B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f23362C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f23363D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f23364E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final CheckedTextView f23365F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private FrameLayout f23366G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f23367H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ColorStateList f23368I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f23369J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Drawable f23370K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final C1657a f23371L;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends C1657a {
        a() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.u0(NavigationMenuItemView.this.f23363D);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC2568a.f26748t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f23360M, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean B() {
        return this.f23367H.getTitle() == null && this.f23367H.getIcon() == null && this.f23367H.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f23366G == null) {
                this.f23366G = (FrameLayout) ((ViewStub) findViewById(Q4.e.f9303e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f23366G.removeAllViews();
            this.f23366G.addView(view);
        }
    }

    private void z() {
        if (B()) {
            this.f23365F.setVisibility(8);
            FrameLayout frameLayout = this.f23366G;
            if (frameLayout != null) {
                Q.a aVar = (Q.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f23366G.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f23365F.setVisibility(0);
        FrameLayout frameLayout2 = this.f23366G;
        if (frameLayout2 != null) {
            Q.a aVar2 = (Q.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f23366G.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f23367H = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        k0.a(this, gVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f23367H;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f23367H;
        if (gVar != null && gVar.isCheckable() && this.f23367H.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f23360M);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f23363D != z10) {
            this.f23363D = z10;
            this.f23371L.sendAccessibilityEvent(this.f23365F, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f23365F.setChecked(z10);
        CheckedTextView checkedTextView = this.f23365F;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f23364E) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f23369J) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC3606a.r(drawable).mutate();
                drawable.setTintList(this.f23368I);
            }
            int i10 = this.f23361B;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f23362C) {
            if (this.f23370K == null) {
                Drawable drawableF = AbstractC3461h.f(getResources(), Q4.d.f9270j, getContext().getTheme());
                this.f23370K = drawableF;
                if (drawableF != null) {
                    int i11 = this.f23361B;
                    drawableF.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f23370K;
        }
        this.f23365F.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f23365F.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f23361B = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f23368I = colorStateList;
        this.f23369J = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f23367H;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f23365F.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f23362C = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.m(this.f23365F, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f23365F.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f23365F.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23364E = true;
        a aVar = new a();
        this.f23371L = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(Q4.g.f9329b, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(Q4.c.f9234k));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(Q4.e.f9304f);
        this.f23365F = checkedTextView;
        AbstractC1658a0.k0(checkedTextView, aVar);
    }
}
