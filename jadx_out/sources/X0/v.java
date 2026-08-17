package x0;

import E0.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import l1.AbstractC2861a;
import w0.AbstractC3458e;
import w0.AbstractC3461h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C f33246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m0.h f33247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Paint f33248c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC3461h.e f33249a;

        public a(AbstractC3461h.e eVar) {
            this.f33249a = eVar;
        }

        @Override // E0.h.c
        public void a(int i10) {
            AbstractC3461h.e eVar = this.f33249a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // E0.h.c
        public void b(Typeface typeface) {
            AbstractC3461h.e eVar = this.f33249a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        AbstractC2861a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f33246a = new C3512B();
        } else if (i10 >= 29) {
            f33246a = new C3511A();
        } else if (i10 >= 28) {
            f33246a = new z();
        } else if (i10 >= 26) {
            f33246a = new y();
        } else if (x.k()) {
            f33246a = new x();
        } else {
            f33246a = new w();
        }
        f33247b = new m0.h(16);
        f33248c = null;
        AbstractC2861a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, h.b[] bVarArr, int i10) {
        AbstractC2861a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f33246a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            AbstractC2861a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        AbstractC2861a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f33246a.c(context, cancellationSignal, list, i10);
        } finally {
            AbstractC2861a.f();
        }
    }

    public static Typeface d(Context context, AbstractC3458e.b bVar, Resources resources, int i10, String str, int i11, int i12, AbstractC3461h.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof AbstractC3458e.C0364e) {
            AbstractC3458e.C0364e c0364e = (AbstractC3458e.C0364e) bVar;
            Typeface typefaceI = i(c0364e);
            if (typefaceI != null) {
                if (eVar != null) {
                    eVar.d(typefaceI, handler);
                }
                f33247b.d(f(resources, i10, str, i11, i12), typefaceI);
                return typefaceI;
            }
            typefaceA = E0.h.c(context, c0364e.b(), i12, !z10 ? eVar != null : c0364e.a() != 0, z10 ? c0364e.d() : -1, AbstractC3461h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f33246a.a(context, (AbstractC3458e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f33247b.d(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceE = f33246a.e(context, resources, i10, str, i12);
        if (typefaceE != null) {
            f33247b.d(f(resources, i10, str, i11, i12), typefaceE);
        }
        return typefaceE;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f33247b.c(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        return r0.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface i(AbstractC3458e.C0364e c0364e) {
        FontFamily fontFamilyBuild;
        Typeface typefaceH;
        String strC = c0364e.c();
        if (!TextUtils.isEmpty(strC) && (typefaceH = h(strC)) != null) {
            return typefaceH;
        }
        List listB = c0364e.b();
        int i10 = 0;
        if (listB.size() == 1) {
            return h(((E0.f) listB.get(0)).h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i11 = 0; i11 < listB.size(); i11++) {
            if (h(((E0.f) listB.get(i11)).h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilderA = null;
        while (true) {
            if (i10 >= listB.size()) {
                break;
            }
            E0.f fVar = (E0.f) listB.get(i10);
            if (i10 == listB.size() - 1 && TextUtils.isEmpty(fVar.i())) {
                customFallbackBuilderA.setSystemFallback(fVar.h());
                break;
            }
            Font fontJ = j(h(fVar.h()));
            if (fontJ == null) {
                fVar.h();
                return null;
            }
            if (TextUtils.isEmpty(fVar.i())) {
                try {
                    k.a();
                    l.a();
                    fontFamilyBuild = i.a(u.a(fontJ).setFontVariationSettings(fVar.i()).build()).build();
                } catch (IOException unused) {
                    return null;
                }
            } else {
                fontFamilyBuild = i.a(fontJ).build();
            }
            if (customFallbackBuilderA == null) {
                customFallbackBuilderA = j.a(fontFamilyBuild);
            } else {
                customFallbackBuilderA.addCustomFallback(fontFamilyBuild);
            }
            i10++;
        }
    }

    public static Font j(Typeface typeface) {
        if (f33248c == null) {
            f33248c = new Paint();
        }
        f33248c.setTextSize(10.0f);
        f33248c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f33248c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
