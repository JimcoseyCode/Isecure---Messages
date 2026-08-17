package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class d {
    static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    static e c(Context context, float f10, int i10, a aVar) {
        float f11;
        float f12;
        float fMin = Math.min(f(context) + f10, aVar.f22975f);
        float f13 = fMin / 2.0f;
        float f14 = 0.0f - f13;
        float fB = b(0.0f, aVar.f22971b, aVar.f22972c);
        float fJ = j(0.0f, a(fB, aVar.f22971b, (int) Math.floor(aVar.f22972c / 2.0f)), aVar.f22971b, aVar.f22972c);
        float fB2 = b(fJ, aVar.f22974e, aVar.f22973d);
        float fJ2 = j(fJ, a(fB2, aVar.f22974e, (int) Math.floor(aVar.f22973d / 2.0f)), aVar.f22974e, aVar.f22973d);
        float fB3 = b(fJ2, aVar.f22975f, aVar.f22976g);
        float fJ3 = j(fJ2, a(fB3, aVar.f22975f, aVar.f22976g), aVar.f22975f, aVar.f22976g);
        float fB4 = b(fJ3, aVar.f22974e, aVar.f22973d);
        float fB5 = b(j(fJ3, a(fB4, aVar.f22974e, (int) Math.ceil(aVar.f22973d / 2.0f)), aVar.f22974e, aVar.f22973d), aVar.f22971b, aVar.f22972c);
        float f15 = i10 + f13;
        float fB6 = c.b(fMin, aVar.f22975f, f10);
        float fB7 = c.b(aVar.f22971b, aVar.f22975f, f10);
        float fB8 = c.b(aVar.f22974e, aVar.f22975f, f10);
        e.b bVarA = new e.b(aVar.f22975f, i10).a(f14, fB6, fMin);
        if (aVar.f22972c > 0) {
            f11 = 2.0f;
            f12 = fB6;
            bVarA.g(fB, fB7, aVar.f22971b, (int) Math.floor(r7 / 2.0f));
        } else {
            f11 = 2.0f;
            f12 = fB6;
        }
        if (aVar.f22973d > 0) {
            bVarA.g(fB2, fB8, aVar.f22974e, (int) Math.floor(r4 / f11));
        }
        bVarA.h(fB3, 0.0f, aVar.f22975f, aVar.f22976g, true);
        if (aVar.f22973d > 0) {
            bVarA.g(fB4, fB8, aVar.f22974e, (int) Math.ceil(r4 / f11));
        }
        if (aVar.f22972c > 0) {
            bVarA.g(fB5, fB7, aVar.f22971b, (int) Math.ceil(r0 / f11));
        }
        bVarA.a(f15, f12, fMin);
        return bVarA.i();
    }

    static e d(Context context, float f10, int i10, a aVar, int i11) {
        return i11 == 1 ? c(context, f10, i10, aVar) : e(context, f10, i10, aVar);
    }

    static e e(Context context, float f10, int i10, a aVar) {
        float fMin = Math.min(f(context) + f10, aVar.f22975f);
        float f11 = fMin / 2.0f;
        float f12 = 0.0f - f11;
        float fB = b(0.0f, aVar.f22975f, aVar.f22976g);
        float fJ = j(0.0f, a(fB, aVar.f22975f, aVar.f22976g), aVar.f22975f, aVar.f22976g);
        float fB2 = b(fJ, aVar.f22974e, aVar.f22973d);
        float fB3 = b(j(fJ, fB2, aVar.f22974e, aVar.f22973d), aVar.f22971b, aVar.f22972c);
        float f13 = i10 + f11;
        float fB4 = c.b(fMin, aVar.f22975f, f10);
        float fB5 = c.b(aVar.f22971b, aVar.f22975f, f10);
        float fB6 = c.b(aVar.f22974e, aVar.f22975f, f10);
        e.b bVarH = new e.b(aVar.f22975f, i10).a(f12, fB4, fMin).h(fB, 0.0f, aVar.f22975f, aVar.f22976g, true);
        if (aVar.f22973d > 0) {
            bVarH.b(fB2, fB6, aVar.f22974e);
        }
        int i11 = aVar.f22972c;
        if (i11 > 0) {
            bVarH.g(fB3, fB5, aVar.f22971b, i11);
        }
        bVarH.a(f13, fB4, fMin);
        return bVarH.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(Q4.c.f9258x);
    }

    static float g(Context context) {
        return context.getResources().getDimension(Q4.c.f9259y);
    }

    static float h(Context context) {
        return context.getResources().getDimension(Q4.c.f9260z);
    }

    static int i(int[] iArr) {
        int i10 = androidx.customview.widget.a.INVALID_ID;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
