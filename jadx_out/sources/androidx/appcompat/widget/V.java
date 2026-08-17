package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import i.AbstractC2712a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static V f14893i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap f14895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m0.i f14896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0.j f14897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap f14898d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f14899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f14901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f14892h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f14894j = new a(6);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends m0.h {
        public a(int i10) {
            super(i10);
        }

        private static int h(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i10, mode)));
        }

        PorterDuffColorFilter j(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(V v10, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            m0.f fVar = (m0.f) this.f14898d.get(context);
            if (fVar == null) {
                fVar = new m0.f();
                this.f14898d.put(context, fVar);
            }
            fVar.g(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f14895a == null) {
            this.f14895a = new WeakHashMap();
        }
        m0.j jVar = (m0.j) this.f14895a.get(context);
        if (jVar == null) {
            jVar = new m0.j();
            this.f14895a.put(context, jVar);
        }
        jVar.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f14900f) {
            return;
        }
        this.f14900f = true;
        Drawable drawableI = i(context, AbstractC2712a.f28649a);
        if (drawableI == null || !p(drawableI)) {
            this.f14900f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f14899e == null) {
            this.f14899e = new TypedValue();
        }
        TypedValue typedValue = this.f14899e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f14901g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i10);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized V g() {
        try {
            if (f14893i == null) {
                V v10 = new V();
                f14893i = v10;
                o(v10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14893i;
    }

    private synchronized Drawable h(Context context, long j10) {
        m0.f fVar = (m0.f) this.f14898d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) fVar.c(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.h(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterI;
        a aVar = f14894j;
        porterDuffColorFilterI = aVar.i(i10, mode);
        if (porterDuffColorFilterI == null) {
            porterDuffColorFilterI = new PorterDuffColorFilter(i10, mode);
            aVar.j(i10, mode, porterDuffColorFilterI);
        }
        return porterDuffColorFilterI;
    }

    private ColorStateList m(Context context, int i10) {
        m0.j jVar;
        WeakHashMap weakHashMap = this.f14895a;
        if (weakHashMap == null || (jVar = (m0.j) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) jVar.f(i10);
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) {
        int next;
        m0.i iVar = this.f14896b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        m0.j jVar = this.f14897c;
        if (jVar != null) {
            String str = (String) jVar.f(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f14896b.get(str) == null)) {
                return null;
            }
        } else {
            this.f14897c = new m0.j();
        }
        if (this.f14899e == null) {
            this.f14899e = new TypedValue();
        }
        TypedValue typedValue = this.f14899e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f14897c.a(i10, name);
                b bVar = (b) this.f14896b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableH == null) {
            this.f14897c.a(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = AbstractC3606a.r(drawable.mutate());
            AbstractC3606a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                AbstractC3606a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f14901g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, d0 d0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = d0Var.f14974d;
            if (z10 || d0Var.f14973c) {
                drawable.setColorFilter(f(z10 ? d0Var.f14971a : null, d0Var.f14973c ? d0Var.f14972b : f14892h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = androidx.core.content.a.e(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                M.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f14901g;
            colorStateListM = cVar == null ? null : cVar.d(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f14901g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i10);
    }

    public synchronized void r(Context context) {
        m0.f fVar = (m0.f) this.f14898d.get(context);
        if (fVar != null) {
            fVar.a();
        }
    }

    synchronized Drawable s(Context context, p0 p0Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = p0Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f14901g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f14901g;
        return cVar != null && cVar.a(context, i10, drawable);
    }

    private static void o(V v10) {
    }
}
