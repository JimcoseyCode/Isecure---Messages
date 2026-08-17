package com.google.android.material.badge;

import Q4.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.i;
import com.google.android.material.internal.l;
import e5.AbstractC2425c;
import e5.e;
import h5.h;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements i.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f22693t = j.f9419r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f22694u = Q4.a.f9132b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f22695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f22696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i f22697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f22698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final BadgeState f22699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f22700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f22701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f22703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f22704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f22705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f22706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f22707s;

    private a(Context context, int i10, int i11, int i12, BadgeState.State state) {
        this.f22695g = new WeakReference(context);
        l.c(context);
        this.f22698j = new Rect();
        i iVar = new i(this);
        this.f22697i = iVar;
        iVar.g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, i11, i12, state);
        this.f22699k = badgeState;
        this.f22696h = new h(h5.l.b(context, D() ? badgeState.o() : badgeState.k(), D() ? badgeState.n() : badgeState.j()).m());
        R();
    }

    private float A(float f10) {
        return (this.f22701m - this.f22705q) + f10;
    }

    private int B() {
        int iT = D() ? this.f22699k.t() : this.f22699k.u();
        if (this.f22699k.f22660k == 1) {
            iT += D() ? this.f22699k.f22659j : this.f22699k.f22658i;
        }
        return iT + this.f22699k.d();
    }

    private int C() {
        int iE = this.f22699k.E();
        if (D()) {
            iE = this.f22699k.D();
            Context context = (Context) this.f22695g.get();
            if (context != null) {
                iE = R4.a.c(iE, iE - this.f22699k.v(), R4.a.b(0.0f, 1.0f, 0.3f, 1.0f, AbstractC2425c.f(context) - 1.0f));
            }
        }
        if (this.f22699k.f22660k == 0) {
            iE -= Math.round(this.f22705q);
        }
        return iE + this.f22699k.e();
    }

    private boolean D() {
        return F() || E();
    }

    private void G() {
        this.f22697i.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void H() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f22699k.g());
        if (this.f22696h.B() != colorStateListValueOf) {
            this.f22696h.d0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void I() {
        this.f22697i.l(true);
        K();
        a0();
        invalidateSelf();
    }

    private void J() {
        WeakReference weakReference = this.f22706r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f22706r.get();
        WeakReference weakReference2 = this.f22707s;
        Z(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void K() {
        Context context = (Context) this.f22695g.get();
        if (context == null) {
            return;
        }
        this.f22696h.setShapeAppearanceModel(h5.l.b(context, D() ? this.f22699k.o() : this.f22699k.k(), D() ? this.f22699k.n() : this.f22699k.j()).m());
        invalidateSelf();
    }

    private void L() {
        e eVar;
        Context context = (Context) this.f22695g.get();
        if (context == null || this.f22697i.e() == (eVar = new e(context, this.f22699k.C()))) {
            return;
        }
        this.f22697i.k(eVar, context);
        M();
        a0();
        invalidateSelf();
    }

    private void M() {
        this.f22697i.g().setColor(this.f22699k.l());
        invalidateSelf();
    }

    private void N() {
        b0();
        this.f22697i.l(true);
        a0();
        invalidateSelf();
    }

    private void O() {
        if (F()) {
            return;
        }
        I();
    }

    private void P() {
        I();
    }

    private void Q() {
        setVisible(this.f22699k.I(), false);
    }

    private void R() {
        K();
        L();
        N();
        I();
        G();
        H();
        M();
        J();
        a0();
        Q();
    }

    private static void Y(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void a0() {
        Context context = (Context) this.f22695g.get();
        WeakReference weakReference = this.f22706r;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f22698j);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f22707s;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        b.g(this.f22698j, this.f22700l, this.f22701m, this.f22704p, this.f22705q);
        float f10 = this.f22703o;
        if (f10 != -1.0f) {
            this.f22696h.Z(f10);
        }
        if (rect.equals(this.f22698j)) {
            return;
        }
        this.f22696h.setBounds(this.f22698j);
    }

    private void b(View view) {
        ViewParent viewParentM = m();
        if (viewParentM == null) {
            viewParentM = view.getParent();
        }
        if ((viewParentM instanceof View) && (viewParentM.getParent() instanceof View)) {
            c(view, (View) viewParentM.getParent());
        }
    }

    private void b0() {
        if (q() != -2) {
            this.f22702n = ((int) Math.pow(10.0d, ((double) q()) - 1.0d)) - 1;
        } else {
            this.f22702n = r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(View view, View view2) {
        float y10;
        float x10;
        ViewParent parent;
        boolean z10;
        FrameLayout frameLayoutM = m();
        if (frameLayoutM == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = frameLayoutM;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float fA = A(y10);
            float fP = p(x10);
            View view4 = (View) parent;
            float fK = k(view4.getHeight(), y10);
            float fV = v(view4.getWidth(), x10);
            if (fA < 0.0f) {
                this.f22701m += Math.abs(fA);
            }
            if (fP < 0.0f) {
                this.f22700l += Math.abs(fP);
            }
            if (fK > 0.0f) {
                this.f22701m -= Math.abs(fK);
            }
            if (fV > 0.0f) {
                this.f22700l -= Math.abs(fV);
            }
        }
    }

    private void d(Rect rect, View view) {
        float f10 = D() ? this.f22699k.f22653d : this.f22699k.f22652c;
        this.f22703o = f10;
        if (f10 != -1.0f) {
            this.f22704p = f10;
            this.f22705q = f10;
        } else {
            this.f22704p = Math.round((D() ? this.f22699k.f22656g : this.f22699k.f22654e) / 2.0f);
            this.f22705q = Math.round((D() ? this.f22699k.f22657h : this.f22699k.f22655f) / 2.0f);
        }
        if (D()) {
            String strJ = j();
            this.f22704p = Math.max(this.f22704p, (this.f22697i.h(strJ) / 2.0f) + this.f22699k.i());
            float fMax = Math.max(this.f22705q, (this.f22697i.f(strJ) / 2.0f) + this.f22699k.m());
            this.f22705q = fMax;
            this.f22704p = Math.max(this.f22704p, fMax);
        }
        int iC = C();
        int iH = this.f22699k.h();
        if (iH == 8388691 || iH == 8388693) {
            this.f22701m = rect.bottom - iC;
        } else {
            this.f22701m = rect.top + iC;
        }
        int iB = B();
        int iH2 = this.f22699k.h();
        if (iH2 == 8388659 || iH2 == 8388691) {
            this.f22700l = this.f22699k.f22661l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f22704p) - ((this.f22705q * 2.0f) - iB) : (rect.right - this.f22704p) + ((this.f22705q * 2.0f) - iB) : view.getLayoutDirection() == 0 ? (rect.left - this.f22704p) + iB : (rect.right + this.f22704p) - iB;
        } else {
            this.f22700l = this.f22699k.f22661l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f22704p) - iB : (rect.left - this.f22704p) + iB : view.getLayoutDirection() == 0 ? (rect.right - this.f22704p) + ((this.f22705q * 2.0f) - iB) : (rect.left + this.f22704p) - ((this.f22705q * 2.0f) - iB);
        }
        if (this.f22699k.H()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    public static a g(Context context) {
        return new a(context, 0, f22694u, f22693t, null);
    }

    static a h(Context context, BadgeState.State state) {
        return new a(context, 0, f22694u, f22693t, state);
    }

    private void i(Canvas canvas) {
        String strJ = j();
        if (strJ != null) {
            Rect rect = new Rect();
            this.f22697i.g().getTextBounds(strJ, 0, strJ.length(), rect);
            float fExactCenterY = this.f22701m - rect.exactCenterY();
            canvas.drawText(strJ, this.f22700l, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f22697i.g());
        }
    }

    private String j() {
        if (F()) {
            return y();
        }
        if (E()) {
            return t();
        }
        return null;
    }

    private float k(float f10, float f11) {
        return ((this.f22701m + this.f22705q) - f10) + f11;
    }

    private CharSequence n() {
        return this.f22699k.r();
    }

    private float p(float f10) {
        return (this.f22700l - this.f22704p) + f10;
    }

    private String t() {
        if (this.f22702n == -2 || s() <= this.f22702n) {
            return NumberFormat.getInstance(this.f22699k.z()).format(s());
        }
        Context context = (Context) this.f22695g.get();
        return context == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : String.format(this.f22699k.z(), context.getString(Q4.i.f9388p), Integer.valueOf(this.f22702n), "+");
    }

    private String u() {
        Context context;
        if (this.f22699k.s() == 0 || (context = (Context) this.f22695g.get()) == null) {
            return null;
        }
        return (this.f22702n == -2 || s() <= this.f22702n) ? context.getResources().getQuantityString(this.f22699k.s(), s(), Integer.valueOf(s())) : context.getString(this.f22699k.p(), Integer.valueOf(this.f22702n));
    }

    private float v(float f10, float f11) {
        return ((this.f22700l + this.f22704p) - f10) + f11;
    }

    private String y() {
        String strX = x();
        int iQ = q();
        if (iQ == -2 || strX == null || strX.length() <= iQ) {
            return strX;
        }
        Context context = (Context) this.f22695g.get();
        if (context == null) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        return String.format(context.getString(Q4.i.f9381i), strX.substring(0, iQ - 1), "…");
    }

    private CharSequence z() {
        CharSequence charSequenceQ = this.f22699k.q();
        return charSequenceQ != null ? charSequenceQ : x();
    }

    public boolean E() {
        return !this.f22699k.G() && this.f22699k.F();
    }

    public boolean F() {
        return this.f22699k.G();
    }

    public void S(int i10) {
        this.f22699k.L(i10);
        H();
    }

    public void T(int i10) {
        BadgeState badgeState = this.f22699k;
        if (badgeState.f22661l != i10) {
            badgeState.f22661l = i10;
            a0();
        }
    }

    public void U(int i10) {
        if (this.f22697i.g().getColor() != i10) {
            this.f22699k.M(i10);
            M();
        }
    }

    public void V(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f22699k.y() != iMax) {
            this.f22699k.N(iMax);
            O();
        }
    }

    public void W(String str) {
        if (TextUtils.equals(this.f22699k.B(), str)) {
            return;
        }
        this.f22699k.O(str);
        P();
    }

    public void X(boolean z10) {
        this.f22699k.P(z10);
        Q();
    }

    public void Z(View view, FrameLayout frameLayout) {
        this.f22706r = new WeakReference(view);
        this.f22707s = new WeakReference(frameLayout);
        Y(view);
        a0();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.i.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f22696h.draw(canvas);
        if (D()) {
            i(canvas);
        }
    }

    public void e() {
        if (this.f22699k.F()) {
            this.f22699k.a();
            O();
        }
    }

    public void f() {
        if (this.f22699k.G()) {
            this.f22699k.b();
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f22699k.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f22698j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f22698j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public CharSequence l() {
        if (isVisible()) {
            return F() ? z() : E() ? u() : n();
        }
        return null;
    }

    public FrameLayout m() {
        WeakReference weakReference = this.f22707s;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int o() {
        return this.f22699k.u();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.i.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int q() {
        return this.f22699k.w();
    }

    public int r() {
        return this.f22699k.x();
    }

    public int s() {
        if (this.f22699k.F()) {
            return this.f22699k.y();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f22699k.K(i10);
        G();
    }

    BadgeState.State w() {
        return this.f22699k.A();
    }

    public String x() {
        return this.f22699k.B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
