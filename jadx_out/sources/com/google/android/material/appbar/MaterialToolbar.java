package com.google.android.material.appbar;

import Q4.j;
import Q4.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.l;
import com.google.android.material.internal.m;
import f.AbstractC2568a;
import h5.i;
import k5.AbstractC2830a;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f22612i0 = j.f9401C;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f22613j0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Integer f22614d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f22615e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f22616f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ImageView.ScaleType f22617g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Boolean f22618h0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26728O);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.d.f(background);
        if (colorStateListValueOf != null) {
            h5.h hVar = new h5.h();
            hVar.d0(colorStateListValueOf);
            hVar.R(context);
            hVar.c0(getElevation());
            setBackground(hVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.f22615e0 || this.f22616f0) {
            TextView textViewE = m.e(this);
            TextView textViewC = m.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairS = S(textViewE, textViewC);
            if (this.f22615e0 && textViewE != null) {
                U(textViewE, pairS);
            }
            if (!this.f22616f0 || textViewC == null) {
                return;
            }
            U(textViewC, pairS);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f22614d0 == null) {
            return drawable;
        }
        Drawable drawableR = AbstractC3606a.r(drawable.mutate());
        drawableR.setTint(this.f22614d0.intValue());
        return drawableR;
    }

    private void X() {
        ImageView imageViewB = m.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f22618h0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f22617g0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f22617g0;
    }

    public Integer getNavigationIconTint() {
        return this.f22614d0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        i.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f22618h0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f22618h0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f22617g0 != scaleType) {
            this.f22617g0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f22614d0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f22616f0 != z10) {
            this.f22616f0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f22615e0 != z10) {
            this.f22615e0 = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f22612i0;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = l.i(context2, attributeSet, k.f9568R3, i10, i11, new int[0]);
        if (typedArrayI.hasValue(k.f9592U3)) {
            setNavigationIconTint(typedArrayI.getColor(k.f9592U3, -1));
        }
        this.f22615e0 = typedArrayI.getBoolean(k.f9608W3, false);
        this.f22616f0 = typedArrayI.getBoolean(k.f9600V3, false);
        int i12 = typedArrayI.getInt(k.f9584T3, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f22613j0;
            if (i12 < scaleTypeArr.length) {
                this.f22617g0 = scaleTypeArr[i12];
            }
        }
        if (typedArrayI.hasValue(k.f9576S3)) {
            this.f22618h0 = Boolean.valueOf(typedArrayI.getBoolean(k.f9576S3, false));
        }
        typedArrayI.recycle();
        T(context2);
    }
}
