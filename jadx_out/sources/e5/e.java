package e5;

import Q4.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Xml;
import f.AbstractC2577j;
import v0.AbstractC3416d;
import w0.AbstractC3461h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f25907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f25908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f25909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f25915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f25916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f25917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f25918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f25919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f25920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f25921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f25922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25923q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25924r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Typeface f25925s;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC3461h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f25926a;

        a(g gVar) {
            this.f25926a = gVar;
        }

        @Override // w0.AbstractC3461h.e
        public void f(int i10) {
            e.this.f25923q = true;
            this.f25926a.a(i10);
        }

        @Override // w0.AbstractC3461h.e
        public void g(Typeface typeface) {
            e eVar = e.this;
            eVar.f25925s = Typeface.create(typeface, eVar.f25912f);
            e.this.f25923q = true;
            this.f25926a.b(e.this.f25925s, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f25929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f25930c;

        b(Context context, TextPaint textPaint, g gVar) {
            this.f25928a = context;
            this.f25929b = textPaint;
            this.f25930c = gVar;
        }

        @Override // e5.g
        public void a(int i10) {
            this.f25930c.a(i10);
        }

        @Override // e5.g
        public void b(Typeface typeface, boolean z10) {
            e.this.r(this.f25928a, this.f25929b, typeface);
            this.f25930c.b(typeface, z10);
        }
    }

    public e(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC2577j.f26998S2);
        o(typedArrayObtainStyledAttributes.getDimension(AbstractC2577j.f27003T2, 0.0f));
        n(AbstractC2425c.a(context, typedArrayObtainStyledAttributes, AbstractC2577j.f27018W2));
        this.f25907a = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, AbstractC2577j.f27023X2);
        this.f25908b = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, AbstractC2577j.f27028Y2);
        this.f25912f = typedArrayObtainStyledAttributes.getInt(AbstractC2577j.f27013V2, 0);
        this.f25913g = typedArrayObtainStyledAttributes.getInt(AbstractC2577j.f27008U2, 1);
        int iG = AbstractC2425c.g(typedArrayObtainStyledAttributes, AbstractC2577j.f27062f3, AbstractC2577j.f27052d3);
        this.f25922p = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f25910d = typedArrayObtainStyledAttributes.getString(iG);
        this.f25914h = typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f27072h3, false);
        this.f25909c = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, AbstractC2577j.f27032Z2);
        this.f25915i = typedArrayObtainStyledAttributes.getFloat(AbstractC2577j.f27037a3, 0.0f);
        this.f25916j = typedArrayObtainStyledAttributes.getFloat(AbstractC2577j.f27042b3, 0.0f);
        this.f25917k = typedArrayObtainStyledAttributes.getFloat(AbstractC2577j.f27047c3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f9480G3);
        this.f25918l = typedArrayObtainStyledAttributes2.hasValue(k.f9488H3);
        this.f25919m = typedArrayObtainStyledAttributes2.getFloat(k.f9488H3, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f25911e = typedArrayObtainStyledAttributes2.getString(AbstractC2425c.g(typedArrayObtainStyledAttributes2, k.f9512K3, k.f9496I3));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f25925s == null && (str = this.f25910d) != null) {
            this.f25925s = Typeface.create(str, this.f25912f);
        }
        if (this.f25925s == null) {
            int i10 = this.f25913g;
            if (i10 == 1) {
                this.f25925s = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f25925s = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f25925s = Typeface.DEFAULT;
            } else {
                this.f25925s = Typeface.MONOSPACE;
            }
            this.f25925s = Typeface.create(this.f25925s, this.f25912f);
        }
    }

    private Typeface i(Context context) {
        Typeface typefaceCreate;
        if (this.f25924r) {
            return null;
        }
        this.f25924r = true;
        String strM = m(context, this.f25922p);
        if (strM == null || (typefaceCreate = Typeface.create(strM, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f25912f);
    }

    private boolean l(Context context) {
        if (f.a()) {
            f(context);
            return true;
        }
        if (this.f25923q) {
            return true;
        }
        int i10 = this.f25922p;
        if (i10 == 0) {
            return false;
        }
        Typeface typefaceC = AbstractC3461h.c(context, i10);
        if (typefaceC != null) {
            this.f25925s = typefaceC;
            this.f25923q = true;
            return true;
        }
        Typeface typefaceI = i(context);
        if (typefaceI == null) {
            return false;
        }
        this.f25925s = typefaceI;
        this.f25923q = true;
        return true;
    }

    private static String m(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC3416d.f32850h);
                        String string = typedArrayObtainAttributes.getString(AbstractC3416d.f32858p);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface e() {
        d();
        return this.f25925s;
    }

    public Typeface f(Context context) {
        if (this.f25923q) {
            return this.f25925s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = AbstractC3461h.h(context, this.f25922p);
                this.f25925s = typefaceH;
                if (typefaceH != null) {
                    this.f25925s = Typeface.create(typefaceH, this.f25912f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.f25923q = true;
        return this.f25925s;
    }

    public void g(Context context, TextPaint textPaint, g gVar) {
        r(context, textPaint, e());
        h(context, new b(context, textPaint, gVar));
    }

    public void h(Context context, g gVar) {
        if (!l(context)) {
            d();
        }
        int i10 = this.f25922p;
        if (i10 == 0) {
            this.f25923q = true;
        }
        if (this.f25923q) {
            gVar.b(this.f25925s, true);
            return;
        }
        try {
            AbstractC3461h.j(context, i10, new a(gVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f25923q = true;
            gVar.a(1);
        } catch (Exception unused2) {
            this.f25923q = true;
            gVar.a(-3);
        }
    }

    public ColorStateList j() {
        return this.f25920n;
    }

    public float k() {
        return this.f25921o;
    }

    public void n(ColorStateList colorStateList) {
        this.f25920n = colorStateList;
    }

    public void o(float f10) {
        this.f25921o = f10;
    }

    public void p(Context context, TextPaint textPaint, g gVar) {
        q(context, textPaint, gVar);
        ColorStateList colorStateList = this.f25920n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f25917k;
        float f11 = this.f25915i;
        float f12 = this.f25916j;
        ColorStateList colorStateList2 = this.f25909c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void q(Context context, TextPaint textPaint, g gVar) {
        Typeface typeface;
        if (l(context) && this.f25923q && (typeface = this.f25925s) != null) {
            r(context, textPaint, typeface);
        } else {
            g(context, textPaint, gVar);
        }
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = j.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f25912f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f25921o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f25911e);
        }
        if (this.f25918l) {
            textPaint.setLetterSpacing(this.f25919m);
        }
    }
}
