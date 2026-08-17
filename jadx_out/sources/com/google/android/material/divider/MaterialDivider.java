package com.google.android.material.divider;

import Q4.a;
import Q4.c;
import Q4.j;
import Q4.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.l;
import e5.AbstractC2425c;
import h5.h;
import k5.AbstractC2830a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f23334l = j.f9399A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f23335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23339k;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f9151k0);
    }

    public int getDividerColor() {
        return this.f23337i;
    }

    public int getDividerInsetEnd() {
        return this.f23339k;
    }

    public int getDividerInsetStart() {
        return this.f23338j;
    }

    public int getDividerThickness() {
        return this.f23336h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f23339k : this.f23338j;
        if (z10) {
            width = getWidth();
            i10 = this.f23338j;
        } else {
            width = getWidth();
            i10 = this.f23339k;
        }
        this.f23335g.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f23335g.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f23336h;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f23337i != i10) {
            this.f23337i = i10;
            this.f23335g.d0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f23339k = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f23338j = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f23336h != i10) {
            this.f23336h = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f23334l;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f23335g = new h();
        TypedArray typedArrayI = l.i(context2, attributeSet, k.f9782r3, i10, i11, new int[0]);
        this.f23336h = typedArrayI.getDimensionPixelSize(k.f9814v3, getResources().getDimensionPixelSize(c.f9196I));
        this.f23338j = typedArrayI.getDimensionPixelOffset(k.f9806u3, 0);
        this.f23339k = typedArrayI.getDimensionPixelOffset(k.f9798t3, 0);
        setDividerColor(AbstractC2425c.a(context2, typedArrayI, k.f9790s3).getDefaultColor());
        typedArrayI.recycle();
    }
}
