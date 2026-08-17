package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.Q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends Q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f23452A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f23453v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f23454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Rect f23455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23456y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f23457z;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23454w = new Rect();
        this.f23455x = new Rect();
        this.f23456y = 119;
        this.f23457z = true;
        this.f23452A = false;
        TypedArray typedArrayI = l.i(context, attributeSet, Q4.k.f9494I1, i10, 0, new int[0]);
        this.f23456y = typedArrayI.getInt(Q4.k.f9510K1, this.f23456y);
        Drawable drawable = typedArrayI.getDrawable(Q4.k.f9502J1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f23457z = typedArrayI.getBoolean(Q4.k.f9518L1, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f23453v;
        if (drawable != null) {
            if (this.f23452A) {
                this.f23452A = false;
                Rect rect = this.f23454w;
                Rect rect2 = this.f23455x;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f23457z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f23456y, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f23453v;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f23453v;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f23453v.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f23453v;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f23456y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f23453v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f23452A = z10 | this.f23452A;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f23452A = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f23453v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f23453v);
            }
            this.f23453v = drawable;
            this.f23452A = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f23456y == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f23456y != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f23456y = i10;
            if (i10 == 119 && this.f23453v != null) {
                this.f23453v.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23453v;
    }
}
