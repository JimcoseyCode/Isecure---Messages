package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import e5.AbstractC2424b;
import e5.AbstractC2425c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f23194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f23195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a f23196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final a f23197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final a f23198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final a f23199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final a f23200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f23201h;

    b(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2424b.f(context, Q4.a.f9145h0, j.class.getCanonicalName()), Q4.k.f9503J2);
        this.f23194a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9535N2, 0));
        this.f23200g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9519L2, 0));
        this.f23195b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9527M2, 0));
        this.f23196c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9543O2, 0));
        ColorStateList colorStateListA = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, Q4.k.f9551P2);
        this.f23197d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9567R2, 0));
        this.f23198e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9559Q2, 0));
        this.f23199f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9575S2, 0));
        Paint paint = new Paint();
        this.f23201h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
