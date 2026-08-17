package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import e5.AbstractC2425c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f23188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f23189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f23190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f23191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h5.l f23193f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, h5.l lVar, Rect rect) {
        H0.g.d(rect.left);
        H0.g.d(rect.top);
        H0.g.d(rect.right);
        H0.g.d(rect.bottom);
        this.f23188a = rect;
        this.f23189b = colorStateList2;
        this.f23190c = colorStateList;
        this.f23191d = colorStateList3;
        this.f23192e = i10;
        this.f23193f = lVar;
    }

    static a a(Context context, int i10) {
        H0.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, Q4.k.f9583T2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9591U2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9607W2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9599V2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9615X2, 0));
        ColorStateList colorStateListA = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, Q4.k.f9623Y2);
        ColorStateList colorStateListA2 = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, Q4.k.f9667d3);
        ColorStateList colorStateListA3 = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, Q4.k.f9649b3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(Q4.k.f9658c3, 0);
        h5.l lVarM = h5.l.b(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9631Z2, 0), typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9640a3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, lVarM, rect);
    }

    int b() {
        return this.f23188a.bottom;
    }

    int c() {
        return this.f23188a.top;
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        h5.h hVar = new h5.h();
        h5.h hVar2 = new h5.h();
        hVar.setShapeAppearanceModel(this.f23193f);
        hVar2.setShapeAppearanceModel(this.f23193f);
        if (colorStateList == null) {
            colorStateList = this.f23190c;
        }
        hVar.d0(colorStateList);
        hVar.k0(this.f23192e, this.f23191d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f23189b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f23189b.withAlpha(30), hVar, hVar2);
        Rect rect = this.f23188a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
