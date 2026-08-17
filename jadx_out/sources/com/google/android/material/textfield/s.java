package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e5.AbstractC2425c;
import g.AbstractC2619a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class s extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f23857A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final TextWatcher f23858B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final TextInputLayout.g f23859C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final TextInputLayout f23860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final FrameLayout f23861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CheckableImageButton f23862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f23863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f23864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnLongClickListener f23865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CheckableImageButton f23866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f23867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final LinkedHashSet f23869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ColorStateList f23870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PorterDuff.Mode f23871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView.ScaleType f23873t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View.OnLongClickListener f23874u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f23875v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextView f23876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23877x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private EditText f23878y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AccessibilityManager f23879z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends com.google.android.material.internal.k {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            s.this.m().b(charSequence, i10, i11, i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (s.this.f23878y == textInputLayout.getEditText()) {
                return;
            }
            if (s.this.f23878y != null) {
                s.this.f23878y.removeTextChangedListener(s.this.f23858B);
                if (s.this.f23878y.getOnFocusChangeListener() == s.this.m().e()) {
                    s.this.f23878y.setOnFocusChangeListener(null);
                }
            }
            s.this.f23878y = textInputLayout.getEditText();
            if (s.this.f23878y != null) {
                s.this.f23878y.addTextChangedListener(s.this.f23858B);
            }
            s.this.m().n(s.this.f23878y);
            s sVar = s.this;
            sVar.h0(sVar.m());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f23883a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f23884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f23886d;

        d(s sVar, f0 f0Var) {
            this.f23884b = sVar;
            this.f23885c = f0Var.n(Q4.k.f9713i6, 0);
            this.f23886d = f0Var.n(Q4.k.f9491H6, 0);
        }

        private t b(int i10) {
            if (i10 == -1) {
                return new C2228g(this.f23884b);
            }
            if (i10 == 0) {
                return new x(this.f23884b);
            }
            if (i10 == 1) {
                return new z(this.f23884b, this.f23886d);
            }
            if (i10 == 2) {
                return new C2227f(this.f23884b);
            }
            if (i10 == 3) {
                return new q(this.f23884b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        t c(int i10) {
            t tVar = (t) this.f23883a.get(i10);
            if (tVar != null) {
                return tVar;
            }
            t tVarB = b(i10);
            this.f23883a.append(i10, tVarB);
            return tVarB;
        }
    }

    s(TextInputLayout textInputLayout, f0 f0Var) {
        super(textInputLayout.getContext());
        this.f23868o = 0;
        this.f23869p = new LinkedHashSet();
        this.f23858B = new a();
        b bVar = new b();
        this.f23859C = bVar;
        this.f23879z = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f23860g = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f23861h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, Q4.e.f9291U);
        this.f23862i = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, Q4.e.f9290T);
        this.f23866m = checkableImageButtonI2;
        this.f23867n = new d(this, f0Var);
        androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(getContext());
        this.f23876w = b10;
        C(f0Var);
        B(f0Var);
        D(f0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(b10);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(f0 f0Var) {
        if (!f0Var.s(Q4.k.f9499I6)) {
            if (f0Var.s(Q4.k.f9745m6)) {
                this.f23870q = AbstractC2425c.b(getContext(), f0Var, Q4.k.f9745m6);
            }
            if (f0Var.s(Q4.k.f9753n6)) {
                this.f23871r = com.google.android.material.internal.o.i(f0Var.k(Q4.k.f9753n6, -1), null);
            }
        }
        if (f0Var.s(Q4.k.f9729k6)) {
            U(f0Var.k(Q4.k.f9729k6, 0));
            if (f0Var.s(Q4.k.f9705h6)) {
                Q(f0Var.p(Q4.k.f9705h6));
            }
            O(f0Var.a(Q4.k.f9697g6, true));
        } else if (f0Var.s(Q4.k.f9499I6)) {
            if (f0Var.s(Q4.k.f9507J6)) {
                this.f23870q = AbstractC2425c.b(getContext(), f0Var, Q4.k.f9507J6);
            }
            if (f0Var.s(Q4.k.f9515K6)) {
                this.f23871r = com.google.android.material.internal.o.i(f0Var.k(Q4.k.f9515K6, -1), null);
            }
            U(f0Var.a(Q4.k.f9499I6, false) ? 1 : 0);
            Q(f0Var.p(Q4.k.f9483G6));
        }
        T(f0Var.f(Q4.k.f9721j6, getResources().getDimensionPixelSize(Q4.c.f9239m0)));
        if (f0Var.s(Q4.k.f9737l6)) {
            X(u.b(f0Var.k(Q4.k.f9737l6, -1)));
        }
    }

    private void C(f0 f0Var) {
        if (f0Var.s(Q4.k.f9793s6)) {
            this.f23863j = AbstractC2425c.b(getContext(), f0Var, Q4.k.f9793s6);
        }
        if (f0Var.s(Q4.k.f9801t6)) {
            this.f23864k = com.google.android.material.internal.o.i(f0Var.k(Q4.k.f9801t6, -1), null);
        }
        if (f0Var.s(Q4.k.f9785r6)) {
            c0(f0Var.g(Q4.k.f9785r6));
        }
        this.f23862i.setContentDescription(getResources().getText(Q4.i.f9378f));
        this.f23862i.setImportantForAccessibility(2);
        this.f23862i.setClickable(false);
        this.f23862i.setPressable(false);
        this.f23862i.setCheckable(false);
        this.f23862i.setFocusable(false);
    }

    private void D(f0 f0Var) {
        this.f23876w.setVisibility(8);
        this.f23876w.setId(Q4.e.f9298a0);
        this.f23876w.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f23876w.setAccessibilityLiveRegion(1);
        q0(f0Var.n(Q4.k.f9635Z6, 0));
        if (f0Var.s(Q4.k.f9644a7)) {
            r0(f0Var.c(Q4.k.f9644a7));
        }
        p0(f0Var.p(Q4.k.f9627Y6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f23857A;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f23879z) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f23857A == null || this.f23879z == null || !isAttachedToWindow()) {
            return;
        }
        this.f23879z.addTouchExplorationStateChangeListener(this.f23857A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(t tVar) {
        if (this.f23878y == null) {
            return;
        }
        if (tVar.e() != null) {
            this.f23878y.setOnFocusChangeListener(tVar.e());
        }
        if (tVar.g() != null) {
            this.f23866m.setOnFocusChangeListener(tVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(Q4.g.f9330c, viewGroup, false);
        checkableImageButton.setId(i10);
        u.e(checkableImageButton);
        if (AbstractC2425c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f23869p.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void s0(t tVar) {
        tVar.s();
        this.f23857A = tVar.h();
        g();
    }

    private int t(t tVar) {
        int i10 = this.f23867n.f23885c;
        return i10 == 0 ? tVar.d() : i10;
    }

    private void t0(t tVar) {
        M();
        this.f23857A = null;
        tVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            u.a(this.f23860g, this.f23866m, this.f23870q, this.f23871r);
            return;
        }
        Drawable drawableMutate = AbstractC3606a.r(n()).mutate();
        drawableMutate.setTint(this.f23860g.getErrorCurrentTextColors());
        this.f23866m.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f23861h.setVisibility((this.f23866m.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f23875v == null || this.f23877x) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f23862i.setVisibility(s() != null && this.f23860g.O() && this.f23860g.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f23860g.p0();
    }

    private void y0() {
        int visibility = this.f23876w.getVisibility();
        int i10 = (this.f23875v == null || this.f23877x) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f23876w.setVisibility(i10);
        this.f23860g.p0();
    }

    boolean A() {
        return this.f23868o != 0;
    }

    boolean E() {
        return A() && this.f23866m.isChecked();
    }

    boolean F() {
        return this.f23861h.getVisibility() == 0 && this.f23866m.getVisibility() == 0;
    }

    boolean G() {
        return this.f23862i.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.f23877x = z10;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f23860g.d0());
        }
    }

    void J() {
        u.d(this.f23860g, this.f23866m, this.f23870q);
    }

    void K() {
        u.d(this.f23860g, this.f23862i, this.f23863j);
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        t tVarM = m();
        boolean z12 = true;
        if (!tVarM.l() || (zIsChecked = this.f23866m.isChecked()) == tVarM.m()) {
            z11 = false;
        } else {
            this.f23866m.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!tVarM.j() || (zIsActivated = this.f23866m.isActivated()) == tVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    void N(boolean z10) {
        this.f23866m.setActivated(z10);
    }

    void O(boolean z10) {
        this.f23866m.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f23866m.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f23866m.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f23860g, this.f23866m, this.f23870q, this.f23871r);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f23872s) {
            this.f23872s = i10;
            u.g(this.f23866m, i10);
            u.g(this.f23862i, i10);
        }
    }

    void U(int i10) {
        if (this.f23868o == i10) {
            return;
        }
        t0(m());
        int i11 = this.f23868o;
        this.f23868o = i10;
        j(i11);
        a0(i10 != 0);
        t tVarM = m();
        R(t(tVarM));
        P(tVarM.c());
        O(tVarM.l());
        if (!tVarM.i(this.f23860g.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f23860g.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(tVarM);
        V(tVarM.f());
        EditText editText = this.f23878y;
        if (editText != null) {
            tVarM.n(editText);
            h0(tVarM);
        }
        u.a(this.f23860g, this.f23866m, this.f23870q, this.f23871r);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        u.h(this.f23866m, onClickListener, this.f23874u);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f23874u = onLongClickListener;
        u.i(this.f23866m, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f23873t = scaleType;
        u.j(this.f23866m, scaleType);
        u.j(this.f23862i, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f23870q != colorStateList) {
            this.f23870q = colorStateList;
            u.a(this.f23860g, this.f23866m, colorStateList, this.f23871r);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f23871r != mode) {
            this.f23871r = mode;
            u.a(this.f23860g, this.f23866m, this.f23870q, mode);
        }
    }

    void a0(boolean z10) {
        if (F() != z10) {
            this.f23866m.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f23860g.p0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f23862i.setImageDrawable(drawable);
        w0();
        u.a(this.f23860g, this.f23862i, this.f23863j, this.f23864k);
    }

    void d0(View.OnClickListener onClickListener) {
        u.h(this.f23862i, onClickListener, this.f23865l);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f23865l = onLongClickListener;
        u.i(this.f23862i, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f23863j != colorStateList) {
            this.f23863j = colorStateList;
            u.a(this.f23860g, this.f23862i, colorStateList, this.f23864k);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f23864k != mode) {
            this.f23864k = mode;
            u.a(this.f23860g, this.f23862i, this.f23863j, mode);
        }
    }

    void h() {
        this.f23866m.performClick();
        this.f23866m.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f23866m.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f23862i;
        }
        if (A() && F()) {
            return this.f23866m;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f23866m.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f23866m.setImageDrawable(drawable);
    }

    t m() {
        return this.f23867n.c(this.f23868o);
    }

    void m0(boolean z10) {
        if (z10 && this.f23868o != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f23866m.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f23870q = colorStateList;
        u.a(this.f23860g, this.f23866m, colorStateList, this.f23871r);
    }

    int o() {
        return this.f23872s;
    }

    void o0(PorterDuff.Mode mode) {
        this.f23871r = mode;
        u.a(this.f23860g, this.f23866m, this.f23870q, mode);
    }

    int p() {
        return this.f23868o;
    }

    void p0(CharSequence charSequence) {
        this.f23875v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f23876w.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f23873t;
    }

    void q0(int i10) {
        androidx.core.widget.i.m(this.f23876w, i10);
    }

    CheckableImageButton r() {
        return this.f23866m;
    }

    void r0(ColorStateList colorStateList) {
        this.f23876w.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f23862i.getDrawable();
    }

    CharSequence u() {
        return this.f23866m.getContentDescription();
    }

    Drawable v() {
        return this.f23866m.getDrawable();
    }

    CharSequence w() {
        return this.f23875v;
    }

    ColorStateList x() {
        return this.f23876w.getTextColors();
    }

    void x0() {
        if (this.f23860g.f23776k == null) {
            return;
        }
        this.f23876w.setPaddingRelative(getContext().getResources().getDimensionPixelSize(Q4.c.f9206S), this.f23860g.f23776k.getPaddingTop(), (F() || G()) ? 0 : this.f23860g.f23776k.getPaddingEnd(), this.f23860g.f23776k.getPaddingBottom());
    }

    int y() {
        return getPaddingEnd() + this.f23876w.getPaddingEnd() + ((F() || G()) ? this.f23866m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f23866m.getLayoutParams()).getMarginStart() : 0);
    }

    TextView z() {
        return this.f23876w;
    }
}
