package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import f.AbstractC2577j;
import java.lang.ref.WeakReference;
import w0.AbstractC3461h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f14465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0 f14466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d0 f14467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d0 f14468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d0 f14469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d0 f14470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d0 f14471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d0 f14472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C f14473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14474j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14475k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f14476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14477m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextView f14482g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Typeface f14483h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f14484i;

        b(TextView textView, Typeface typeface, int i10) {
            this.f14482g = textView;
            this.f14483h = typeface;
            this.f14484i = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14482g.setTypeface(this.f14483h, this.f14484i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    A(TextView textView) {
        this.f14465a = textView;
        this.f14473i = new C(textView);
    }

    private void B(int i10, float f10) {
        this.f14473i.t(i10, f10);
    }

    private void C(Context context, f0 f0Var) {
        String strO;
        this.f14474j = f0Var.k(AbstractC2577j.f27013V2, this.f14474j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = f0Var.k(AbstractC2577j.f27057e3, -1);
            this.f14475k = iK;
            if (iK != -1) {
                this.f14474j &= 2;
            }
        }
        if (!f0Var.s(AbstractC2577j.f27052d3) && !f0Var.s(AbstractC2577j.f27062f3)) {
            if (f0Var.s(AbstractC2577j.f27008U2)) {
                this.f14477m = false;
                int iK2 = f0Var.k(AbstractC2577j.f27008U2, 1);
                if (iK2 == 1) {
                    this.f14476l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f14476l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f14476l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f14476l = null;
        int i11 = f0Var.s(AbstractC2577j.f27062f3) ? AbstractC2577j.f27062f3 : AbstractC2577j.f27052d3;
        int i12 = this.f14475k;
        int i13 = this.f14474j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = f0Var.j(i11, this.f14474j, new a(i12, i13, new WeakReference(this.f14465a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f14475k == -1) {
                        this.f14476l = typefaceJ;
                    } else {
                        this.f14476l = e.a(Typeface.create(typefaceJ, 0), this.f14475k, (this.f14474j & 2) != 0);
                    }
                }
                this.f14477m = this.f14476l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f14476l != null || (strO = f0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f14475k == -1) {
            this.f14476l = Typeface.create(strO, this.f14474j);
        } else {
            this.f14476l = e.a(Typeface.create(strO, 0), this.f14475k, (this.f14474j & 2) != 0);
        }
    }

    private void a(Drawable drawable, d0 d0Var) {
        if (drawable == null || d0Var == null) {
            return;
        }
        C1637j.i(drawable, d0Var, this.f14465a.getDrawableState());
    }

    private static d0 d(Context context, C1637j c1637j, int i10) {
        ColorStateList colorStateListF = c1637j.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        d0 d0Var = new d0();
        d0Var.f14974d = true;
        d0Var.f14971a = colorStateListF;
        return d0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f14465a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f14465a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f14465a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f14465a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f14465a.getCompoundDrawables();
        TextView textView2 = this.f14465a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        d0 d0Var = this.f14472h;
        this.f14466b = d0Var;
        this.f14467c = d0Var;
        this.f14468d = d0Var;
        this.f14469e = d0Var;
        this.f14470f = d0Var;
        this.f14471g = d0Var;
    }

    void A(int i10, float f10) {
        if (q0.f15074c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f14466b != null || this.f14467c != null || this.f14468d != null || this.f14469e != null) {
            Drawable[] compoundDrawables = this.f14465a.getCompoundDrawables();
            a(compoundDrawables[0], this.f14466b);
            a(compoundDrawables[1], this.f14467c);
            a(compoundDrawables[2], this.f14468d);
            a(compoundDrawables[3], this.f14469e);
        }
        if (this.f14470f == null && this.f14471g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f14465a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f14470f);
        a(compoundDrawablesRelative[2], this.f14471g);
    }

    void c() {
        this.f14473i.a();
    }

    int e() {
        return this.f14473i.f();
    }

    int f() {
        return this.f14473i.g();
    }

    int g() {
        return this.f14473i.h();
    }

    int[] h() {
        return this.f14473i.i();
    }

    int i() {
        return this.f14473i.j();
    }

    ColorStateList j() {
        d0 d0Var = this.f14472h;
        if (d0Var != null) {
            return d0Var.f14971a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        d0 d0Var = this.f14472h;
        if (d0Var != null) {
            return d0Var.f14972b;
        }
        return null;
    }

    boolean l() {
        return this.f14473i.n();
    }

    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        boolean z11;
        int iA;
        float f10;
        Context context = this.f14465a.getContext();
        C1637j c1637jB = C1637j.b();
        f0 f0VarV = f0.v(context, attributeSet, AbstractC2577j.f27025Y, i10, 0);
        TextView textView = this.f14465a;
        AbstractC1658a0.i0(textView, textView.getContext(), AbstractC2577j.f27025Y, attributeSet, f0VarV.r(), i10, 0);
        int iN = f0VarV.n(AbstractC2577j.f27029Z, -1);
        if (f0VarV.s(AbstractC2577j.f27044c0)) {
            this.f14466b = d(context, c1637jB, f0VarV.n(AbstractC2577j.f27044c0, 0));
        }
        if (f0VarV.s(AbstractC2577j.f27034a0)) {
            this.f14467c = d(context, c1637jB, f0VarV.n(AbstractC2577j.f27034a0, 0));
        }
        if (f0VarV.s(AbstractC2577j.f27049d0)) {
            this.f14468d = d(context, c1637jB, f0VarV.n(AbstractC2577j.f27049d0, 0));
        }
        if (f0VarV.s(AbstractC2577j.f27039b0)) {
            this.f14469e = d(context, c1637jB, f0VarV.n(AbstractC2577j.f27039b0, 0));
        }
        if (f0VarV.s(AbstractC2577j.f27054e0)) {
            this.f14470f = d(context, c1637jB, f0VarV.n(AbstractC2577j.f27054e0, 0));
        }
        if (f0VarV.s(AbstractC2577j.f27059f0)) {
            this.f14471g = d(context, c1637jB, f0VarV.n(AbstractC2577j.f27059f0, 0));
        }
        f0VarV.x();
        boolean z12 = this.f14465a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            f0 f0VarT = f0.t(context, iN, AbstractC2577j.f26998S2);
            if (z12 || !f0VarT.s(AbstractC2577j.f27072h3)) {
                zA = false;
                z10 = false;
            } else {
                zA = f0VarT.a(AbstractC2577j.f27072h3, false);
                z10 = true;
            }
            C(context, f0VarT);
            int i11 = Build.VERSION.SDK_INT;
            strO2 = f0VarT.s(AbstractC2577j.f27077i3) ? f0VarT.o(AbstractC2577j.f27077i3) : null;
            strO = (i11 < 26 || !f0VarT.s(AbstractC2577j.f27067g3)) ? null : f0VarT.o(AbstractC2577j.f27067g3);
            f0VarT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        f0 f0VarV2 = f0.v(context, attributeSet, AbstractC2577j.f26998S2, i10, 0);
        if (z12 || !f0VarV2.s(AbstractC2577j.f27072h3)) {
            z11 = z10;
        } else {
            zA = f0VarV2.a(AbstractC2577j.f27072h3, false);
            z11 = true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (f0VarV2.s(AbstractC2577j.f27077i3)) {
            strO2 = f0VarV2.o(AbstractC2577j.f27077i3);
        }
        if (i12 >= 26 && f0VarV2.s(AbstractC2577j.f27067g3)) {
            strO = f0VarV2.o(AbstractC2577j.f27067g3);
        }
        if (i12 >= 28 && f0VarV2.s(AbstractC2577j.f27003T2) && f0VarV2.f(AbstractC2577j.f27003T2, -1) == 0) {
            this.f14465a.setTextSize(0, 0.0f);
        }
        C(context, f0VarV2);
        f0VarV2.x();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f14476l;
        if (typeface != null) {
            if (this.f14475k == -1) {
                this.f14465a.setTypeface(typeface, this.f14474j);
            } else {
                this.f14465a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            d.d(this.f14465a, strO);
        }
        if (strO2 != null) {
            c.b(this.f14465a, c.a(strO2));
        }
        this.f14473i.o(attributeSet, i10);
        if (q0.f15074c && this.f14473i.j() != 0) {
            int[] iArrI = this.f14473i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f14465a) != -1.0f) {
                    d.b(this.f14465a, this.f14473i.g(), this.f14473i.f(), this.f14473i.h(), 0);
                } else {
                    d.c(this.f14465a, iArrI, 0);
                }
            }
        }
        f0 f0VarU = f0.u(context, attributeSet, AbstractC2577j.f27064g0);
        int iN2 = f0VarU.n(AbstractC2577j.f27104o0, -1);
        Drawable drawableC = iN2 != -1 ? c1637jB.c(context, iN2) : null;
        int iN3 = f0VarU.n(AbstractC2577j.f27129t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c1637jB.c(context, iN3) : null;
        int iN4 = f0VarU.n(AbstractC2577j.f27109p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c1637jB.c(context, iN4) : null;
        int iN5 = f0VarU.n(AbstractC2577j.f27094m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c1637jB.c(context, iN5) : null;
        int iN6 = f0VarU.n(AbstractC2577j.f27114q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c1637jB.c(context, iN6) : null;
        int iN7 = f0VarU.n(AbstractC2577j.f27099n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c1637jB.c(context, iN7) : null);
        if (f0VarU.s(AbstractC2577j.f27119r0)) {
            androidx.core.widget.i.f(this.f14465a, f0VarU.c(AbstractC2577j.f27119r0));
        }
        if (f0VarU.s(AbstractC2577j.f27124s0)) {
            androidx.core.widget.i.g(this.f14465a, M.e(f0VarU.k(AbstractC2577j.f27124s0, -1), null));
        }
        int iF = f0VarU.f(AbstractC2577j.f27139v0, -1);
        int iF2 = f0VarU.f(AbstractC2577j.f27144w0, -1);
        if (f0VarU.s(AbstractC2577j.f27149x0)) {
            TypedValue typedValueW = f0VarU.w(AbstractC2577j.f27149x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = f0VarU.f(AbstractC2577j.f27149x0, -1);
                iA = -1;
            } else {
                iA = H0.j.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        f0VarU.x();
        if (iF != -1) {
            androidx.core.widget.i.h(this.f14465a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.i.i(this.f14465a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.i.j(this.f14465a, (int) f10);
            } else {
                androidx.core.widget.i.k(this.f14465a, iA, f10);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f14477m) {
            this.f14476l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f14474j));
                } else {
                    textView.setTypeface(typeface, this.f14474j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (q0.f15074c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        f0 f0VarT = f0.t(context, i10, AbstractC2577j.f26998S2);
        if (f0VarT.s(AbstractC2577j.f27072h3)) {
            s(f0VarT.a(AbstractC2577j.f27072h3, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (f0VarT.s(AbstractC2577j.f27003T2) && f0VarT.f(AbstractC2577j.f27003T2, -1) == 0) {
            this.f14465a.setTextSize(0, 0.0f);
        }
        C(context, f0VarT);
        if (i11 >= 26 && f0VarT.s(AbstractC2577j.f27067g3) && (strO = f0VarT.o(AbstractC2577j.f27067g3)) != null) {
            d.d(this.f14465a, strO);
        }
        f0VarT.x();
        Typeface typeface = this.f14476l;
        if (typeface != null) {
            this.f14465a.setTypeface(typeface, this.f14474j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        J0.c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f14465a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f14473i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f14473i.q(iArr, i10);
    }

    void v(int i10) {
        this.f14473i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f14472h == null) {
            this.f14472h = new d0();
        }
        d0 d0Var = this.f14472h;
        d0Var.f14971a = colorStateList;
        d0Var.f14974d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f14472h == null) {
            this.f14472h = new d0();
        }
        d0 d0Var = this.f14472h;
        d0Var.f14972b = mode;
        d0Var.f14973c = mode != null;
        z();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC3461h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f14480c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f14478a = i10;
            this.f14479b = i11;
            this.f14480c = weakReference;
        }

        @Override // w0.AbstractC3461h.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f14478a) != -1) {
                typeface = e.a(typeface, i10, (this.f14479b & 2) != 0);
            }
            A.this.n(this.f14480c, typeface);
        }

        @Override // w0.AbstractC3461h.e
        public void f(int i10) {
        }
    }
}
