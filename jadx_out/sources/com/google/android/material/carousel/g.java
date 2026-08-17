package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f23017d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f23018e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23019c = 0;

    @Override // com.google.android.material.carousel.c
    public e g(V4.a aVar, View view) {
        boolean z10;
        int iB = aVar.b();
        if (aVar.f()) {
            iB = aVar.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (aVar.f()) {
            f10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fD = d() + f10;
        float fMax = Math.max(c() + f10, fD);
        float f11 = iB;
        float fMin = Math.min(measuredHeight + f10, f11);
        float fA = B0.a.a((measuredHeight / 3.0f) + f10, fD + f10, fMax + f10);
        float f12 = (fMin + fA) / 2.0f;
        int[] iArrA = f23017d;
        float f13 = 2.0f * fD;
        if (f11 <= f13) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f23018e;
        if (aVar.d() == 1) {
            iArrA = c.a(iArrA);
            iArrA2 = c.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        float f14 = f10;
        int iMax = (int) Math.max(1.0d, Math.floor(((f11 - (d.i(iArr) * f12)) - (d.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f11, fA, fD, fMax, iArr2, f12, iArr, fMin, iArr3);
        this.f23019c = aVarC.e();
        boolean zI = i(aVarC, aVar.e());
        int i12 = aVarC.f22973d;
        if (i12 == 0 && aVarC.f22972c == 0 && f11 > f13) {
            aVarC.f22972c = 1;
            z10 = true;
        } else {
            z10 = zI;
        }
        if (z10) {
            aVarC = a.c(f11, fA, fD, fMax, new int[]{aVarC.f22972c}, f12, new int[]{i12}, fMin, new int[]{aVarC.f22976g});
        }
        return d.d(view.getContext(), f14, iB, aVarC, aVar.d());
    }

    @Override // com.google.android.material.carousel.c
    public boolean h(V4.a aVar, int i10) {
        if (i10 >= this.f23019c || aVar.e() < this.f23019c) {
            return i10 >= this.f23019c && aVar.e() < this.f23019c;
        }
        return true;
    }

    boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f22972c > 0 || aVar.f22973d > 1);
        while (iE > 0) {
            int i11 = aVar.f22972c;
            if (i11 > 0) {
                aVar.f22972c = i11 - 1;
            } else {
                int i12 = aVar.f22973d;
                if (i12 > 1) {
                    aVar.f22973d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
