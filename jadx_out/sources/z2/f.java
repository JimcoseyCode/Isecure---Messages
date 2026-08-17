package z2;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.InterfaceC1961c;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.k;
import com.facebook.drawee.drawable.l;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.q;
import d2.AbstractC2325a;
import j3.C2768b;
import z2.e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f34260a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), eVar.i());
            b(jVar, eVar);
            return jVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, eVar);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            AbstractC2325a.K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        k kVarG = k.g((ColorDrawable) drawable);
        b(kVarG, eVar);
        return kVarG;
    }

    static void b(i iVar, e eVar) {
        iVar.b(eVar.j());
        iVar.h(eVar.d());
        iVar.setBorder(eVar.b(), eVar.c());
        iVar.e(eVar.g());
        iVar.d(eVar.l());
        iVar.c(eVar.h());
        iVar.a(eVar.i());
    }

    static InterfaceC1961c c(InterfaceC1961c interfaceC1961c) {
        while (true) {
            Object drawable = interfaceC1961c.getDrawable();
            if (drawable == interfaceC1961c || !(drawable instanceof InterfaceC1961c)) {
                break;
            }
            interfaceC1961c = (InterfaceC1961c) drawable;
        }
        return interfaceC1961c;
    }

    static Drawable d(Drawable drawable, e eVar, Resources resources) {
        try {
            if (C2768b.d()) {
                C2768b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.BITMAP_ONLY) {
                if (drawable instanceof g) {
                    InterfaceC1961c interfaceC1961cC = c((g) drawable);
                    interfaceC1961cC.setDrawable(a(interfaceC1961cC.setDrawable(f34260a), eVar, resources));
                    return drawable;
                }
                Drawable drawableA = a(drawable, eVar, resources);
                if (C2768b.d()) {
                    C2768b.b();
                }
                return drawableA;
            }
            if (C2768b.d()) {
                C2768b.b();
            }
            return drawable;
        } finally {
            if (C2768b.d()) {
                C2768b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, e eVar) {
        try {
            if (C2768b.d()) {
                C2768b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.OVERLAY_COLOR) {
                l lVar = new l(drawable);
                b(lVar, eVar);
                lVar.j(eVar.f());
                return lVar;
            }
            if (C2768b.d()) {
                C2768b.b();
            }
            return drawable;
        } finally {
            if (C2768b.d()) {
                C2768b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, q qVar) {
        return g(drawable, qVar, null);
    }

    static Drawable g(Drawable drawable, q qVar, PointF pointF) {
        if (C2768b.d()) {
            C2768b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || qVar == null) {
            if (C2768b.d()) {
                C2768b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, qVar);
        if (pointF != null) {
            oVar.m(pointF);
        }
        if (C2768b.d()) {
            C2768b.b();
        }
        return oVar;
    }

    static void h(i iVar) {
        iVar.b(false);
        iVar.f(0.0f);
        iVar.setBorder(0, 0.0f);
        iVar.e(0.0f);
        iVar.d(false);
        iVar.c(false);
        iVar.a(j.n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(InterfaceC1961c interfaceC1961c, e eVar, Resources resources) {
        InterfaceC1961c interfaceC1961cC = c(interfaceC1961c);
        Drawable drawable = interfaceC1961cC.getDrawable();
        if (eVar == null || eVar.k() != e.a.BITMAP_ONLY) {
            if (drawable instanceof i) {
                h((i) drawable);
            }
        } else if (drawable instanceof i) {
            b((i) drawable, eVar);
        } else if (drawable != 0) {
            interfaceC1961cC.setDrawable(f34260a);
            interfaceC1961cC.setDrawable(a(drawable, eVar, resources));
        }
    }

    static void j(InterfaceC1961c interfaceC1961c, e eVar) {
        Drawable drawable = interfaceC1961c.getDrawable();
        if (eVar == null || eVar.k() != e.a.OVERLAY_COLOR) {
            if (drawable instanceof l) {
                Drawable drawable2 = f34260a;
                interfaceC1961c.setDrawable(((l) drawable).setCurrent(drawable2));
                drawable2.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawable instanceof l)) {
            interfaceC1961c.setDrawable(e(interfaceC1961c.setDrawable(f34260a), eVar));
            return;
        }
        l lVar = (l) drawable;
        b(lVar, eVar);
        lVar.j(eVar.f());
    }

    static o k(InterfaceC1961c interfaceC1961c, q qVar) {
        Drawable drawableF = f(interfaceC1961c.setDrawable(f34260a), qVar);
        interfaceC1961c.setDrawable(drawableF);
        c2.k.h(drawableF, "Parent has no child drawable!");
        return (o) drawableF;
    }
}
