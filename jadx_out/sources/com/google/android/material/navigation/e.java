package com.google.android.material.navigation;

import I0.z;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.k0;
import com.google.android.material.internal.BaselineLayout;
import e5.AbstractC2425c;
import f5.AbstractC2614a;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends FrameLayout implements h {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int[] f23511p0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final c f23512q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final c f23513r0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final BaselineLayout f23514A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final TextView f23515B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final TextView f23516C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private BaselineLayout f23517D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f23518E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f23519F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private BaselineLayout f23520G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f23521H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f23522I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f23523J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f23524K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f23525L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ColorStateList f23526M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f23527N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f23528O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ColorStateList f23529P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Drawable f23530Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Drawable f23531R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ValueAnimator f23532S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private c f23533T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f23534U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f23535V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f23536W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f23537a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f23538b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f23539c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f23540d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f23541e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f23542f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23543g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private com.google.android.material.badge.a f23544g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f23545h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f23546h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Drawable f23547i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f23548i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23549j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f23550j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23551k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f23552k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23553l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f23554l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23555m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f23556m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f23557n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f23558n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f23559o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Rect f23560o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f23561p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f23562q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f23563r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f23564s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23565t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23566u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final LinearLayout f23567v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final LinearLayout f23568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f23569x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final FrameLayout f23570y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ImageView f23571z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f23572g;

        a(int i10) {
            this.f23572g = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.A(this.f23572g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f23574a;

        b(float f10) {
            this.f23574a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f23574a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {
        private c() {
        }

        protected float a(float f10, float f11) {
            return R4.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10) {
            return R4.a.a(0.4f, 1.0f, f10);
        }

        protected float c(float f10) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10));
            view.setScaleY(c(f10));
            view.setAlpha(a(f10, f11));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends c {
        private d() {
            super(null);
        }

        @Override // com.google.android.material.navigation.e.c
        protected float c(float f10) {
            return b(f10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f23512q0 = new c(aVar);
        f23513r0 = new d(aVar);
    }

    public e(Context context) {
        super(context);
        this.f23543g = false;
        this.f23521H = -1;
        this.f23522I = 0;
        this.f23523J = 0;
        this.f23524K = 0;
        this.f23525L = 0;
        this.f23527N = false;
        this.f23533T = f23512q0;
        this.f23534U = 0.0f;
        this.f23535V = false;
        this.f23536W = 0;
        this.f23537a0 = 0;
        this.f23538b0 = -2;
        this.f23539c0 = 0;
        this.f23540d0 = false;
        this.f23541e0 = 0;
        this.f23542f0 = 0;
        this.f23548i0 = 0;
        this.f23550j0 = 49;
        this.f23552k0 = false;
        this.f23554l0 = false;
        this.f23556m0 = false;
        this.f23558n0 = false;
        this.f23560o0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f23567v = (LinearLayout) findViewById(Q4.e.f9279I);
        LinearLayout linearLayout = (LinearLayout) findViewById(Q4.e.f9282L);
        this.f23568w = linearLayout;
        this.f23569x = findViewById(Q4.e.f9278H);
        this.f23570y = (FrameLayout) findViewById(Q4.e.f9280J);
        this.f23571z = (ImageView) findViewById(Q4.e.f9281K);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(Q4.e.f9283M);
        this.f23514A = baselineLayout;
        TextView textView = (TextView) findViewById(Q4.e.f9285O);
        this.f23515B = textView;
        TextView textView2 = (TextView) findViewById(Q4.e.f9284N);
        this.f23516C = textView2;
        j();
        this.f23520G = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f23549j = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f23551k = baselineLayout.getPaddingBottom();
        this.f23553l = 0;
        this.f23555m = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f23518E.setImportantForAccessibility(2);
        this.f23519F.setImportantForAccessibility(2);
        setFocusable(true);
        f();
        this.f23539c0 = getResources().getDimensionPixelSize(Q4.c.f9190C);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                e.a(this.f23510g, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    private void B() {
        if (k()) {
            this.f23533T = f23513r0;
        } else {
            this.f23533T = f23512q0;
        }
    }

    private void C() {
        TextView textView = this.f23516C;
        textView.setTypeface(textView.getTypeface(), this.f23527N ? 1 : 0);
        TextView textView2 = this.f23519F;
        textView2.setTypeface(textView2.getTypeface(), this.f23527N ? 1 : 0);
    }

    private void D(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(AbstractC2425c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.f23526M;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        C();
    }

    private void E(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(AbstractC2425c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.f23526M;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void F() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f23548i0 = 0;
        this.f23520G = this.f23514A;
        int i16 = 8;
        if (this.f23546h0 == 1) {
            if (this.f23517D.getParent() == null) {
                e();
            }
            Rect rect = this.f23560o0;
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = rect.top;
            i10 = rect.bottom;
            this.f23548i0 = 1;
            int i20 = this.f23542f0;
            this.f23520G = this.f23517D;
            i14 = i19;
            i13 = i18;
            i12 = i17;
            i11 = i20;
            i15 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 8;
            i16 = 0;
        }
        this.f23514A.setVisibility(i16);
        this.f23517D.setVisibility(i15);
        ((FrameLayout.LayoutParams) this.f23567v.getLayoutParams()).gravity = this.f23550j0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23568w.getLayoutParams();
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i13;
        layoutParams.topMargin = i14;
        layoutParams.bottomMargin = i10;
        setPadding(i11, 0, i11, 0);
        A(getWidth());
    }

    private static void G(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private void H() {
        androidx.appcompat.view.menu.g gVar = this.f23528O;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f23552k0 && this.f23554l0)) ? 8 : 0);
        }
    }

    public static /* synthetic */ void a(e eVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (eVar.f23571z.getVisibility() == 0) {
            eVar.z(eVar.f23571z);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eVar.f23568w.getLayoutParams();
        int i18 = (i12 - i10) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i19 = (i13 - i11) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z11 = true;
        if (eVar.f23546h0 == 1 && eVar.f23538b0 == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) eVar.f23569x.getLayoutParams();
            if (eVar.f23538b0 != -2 || eVar.f23569x.getMeasuredWidth() == i18) {
                z10 = false;
            } else {
                layoutParams2.width = Math.max(i18, Math.min(eVar.f23536W, eVar.getMeasuredWidth() - (eVar.f23541e0 * 2)));
                z10 = true;
            }
            if (eVar.f23569x.getMeasuredHeight() < i19) {
                layoutParams2.height = i19;
            } else {
                z11 = z10;
            }
            if (z11) {
                eVar.f23569x.setLayoutParams(layoutParams2);
            }
        }
    }

    private void e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f23568w.addView(this.f23517D, layoutParams);
        q();
    }

    private void f() {
        float textSize = this.f23515B.getTextSize();
        float textSize2 = this.f23516C.getTextSize();
        this.f23557n = textSize - textSize2;
        this.f23559o = (textSize2 * 1.0f) / textSize;
        this.f23561p = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f23518E.getTextSize();
        float textSize4 = this.f23519F.getTextSize();
        this.f23562q = textSize3 - textSize4;
        this.f23563r = (textSize4 * 1.0f) / textSize3;
        this.f23564s = (textSize3 * 1.0f) / textSize4;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof e) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.f23544g0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f23544g0.o();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23570y.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f23571z.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private static Drawable h(ColorStateList colorStateList) {
        return new RippleDrawable(AbstractC2614a.a(colorStateList), null, null);
    }

    private boolean i() {
        return this.f23544g0 != null;
    }

    private void j() {
        float dimension = getResources().getDimension(Q4.c.f9216b);
        float dimension2 = getResources().getDimension(Q4.c.f9214a);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.f23517D = baselineLayout;
        baselineLayout.setVisibility(8);
        this.f23517D.setDuplicateParentStateEnabled(true);
        this.f23517D.setMeasurePaddingFromBaseline(this.f23556m0);
        TextView textView = new TextView(getContext());
        this.f23518E = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.f23518E;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f23518E.setDuplicateParentStateEnabled(true);
        this.f23518E.setIncludeFontPadding(false);
        this.f23518E.setGravity(16);
        this.f23518E.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.f23519F = textView3;
        textView3.setMaxLines(1);
        this.f23519F.setEllipsize(truncateAt);
        this.f23519F.setDuplicateParentStateEnabled(true);
        this.f23519F.setVisibility(4);
        this.f23519F.setIncludeFontPadding(false);
        this.f23519F.setGravity(16);
        this.f23519F.setTextSize(dimension2);
        this.f23517D.addView(this.f23518E);
        this.f23517D.addView(this.f23519F);
    }

    private boolean k() {
        return this.f23540d0 && this.f23565t == 2;
    }

    private void l(float f10) {
        if (!this.f23535V || !this.f23543g || !isAttachedToWindow()) {
            p(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f23532S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f23532S = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f23534U, f10);
        this.f23532S = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new b(f10));
        this.f23532S.setInterpolator(c5.d.g(getContext(), Q4.a.f9173v0, R4.a.f10025b));
        this.f23532S.setDuration(c5.d.f(getContext(), Q4.a.f9159o0, getResources().getInteger(Q4.f.f9326b)));
        this.f23532S.start();
    }

    private void m() {
        androidx.appcompat.view.menu.g gVar = this.f23528O;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    private void n() {
        Drawable drawableH = this.f23547i;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f23545h != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f23535V && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(AbstractC2614a.d(this.f23545h), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawableH == null) {
                drawableH = h(this.f23545h);
            }
        }
        this.f23570y.setPadding(0, 0, 0, 0);
        this.f23570y.setForeground(rippleDrawable);
        setBackground(drawableH);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(float f10, float f11) {
        this.f23533T.d(f10, f11, this.f23569x);
        this.f23534U = f10;
    }

    private void q() {
        int i10 = this.f23571z.getLayoutParams().width > 0 ? this.f23555m : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23517D.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i10 : 0;
        }
    }

    private void r(View view, View view2, float f10, float f11) {
        v(this.f23567v, this.f23546h0 == 0 ? (int) (this.f23549j + f11) : 0, 0, this.f23550j0);
        LinearLayout linearLayout = this.f23568w;
        int i10 = this.f23546h0;
        v(linearLayout, i10 == 0 ? 0 : this.f23560o0.top, i10 == 0 ? 0 : this.f23560o0.bottom, i10 == 0 ? 17 : 8388627);
        G(this.f23514A, this.f23551k);
        this.f23520G.setVisibility(0);
        w(view, 1.0f, 1.0f, 0);
        w(view2, f10, f10, 4);
    }

    private void s() {
        LinearLayout linearLayout = this.f23567v;
        int i10 = this.f23549j;
        v(linearLayout, i10, i10, this.f23546h0 == 0 ? 17 : this.f23550j0);
        v(this.f23568w, 0, 0, 17);
        G(this.f23514A, 0);
        this.f23520G.setVisibility(8);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private void t(TextView textView, int i10) {
        if (this.f23558n0) {
            androidx.core.widget.i.m(textView, i10);
        } else {
            u(textView, i10);
        }
    }

    private static void u(TextView textView, int i10) {
        androidx.core.widget.i.m(textView, i10);
        int iJ = AbstractC2425c.j(textView.getContext(), i10, 0);
        if (iJ != 0) {
            textView.setTextSize(0, iJ);
        }
    }

    private static void v(View view, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    private static void w(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private void x(View view) {
        if (i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.b.a(this.f23544g0, view);
        }
    }

    private void y(View view) {
        if (i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.b.e(this.f23544g0, view);
            }
            this.f23544g0 = null;
        }
    }

    private void z(View view) {
        if (i()) {
            com.google.android.material.badge.b.f(this.f23544g0, view, null);
        }
    }

    public void A(int i10) {
        if (i10 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f23536W, i10 - (this.f23541e0 * 2));
            int iMax = this.f23537a0;
            if (this.f23546h0 == 1) {
                int measuredWidth = i10 - (this.f23542f0 * 2);
                int i11 = this.f23538b0;
                if (i11 != -1) {
                    measuredWidth = i11 == -2 ? this.f23567v.getMeasuredWidth() : Math.min(i11, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f23539c0, this.f23568w.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23569x.getLayoutParams();
            if (k()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.f23569x.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f23528O = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        k0.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        H();
        this.f23543g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23535V) {
            this.f23570y.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    void g() {
        o();
        this.f23528O = null;
        this.f23534U = 0.0f;
        this.f23543g = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f23569x.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.f23544g0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.f23517D;
    }

    protected int getItemBackgroundResId() {
        return Q4.d.f9269i;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f23528O;
    }

    protected int getItemDefaultMarginResId() {
        return Q4.c.f9243o0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f23521H;
    }

    public BaselineLayout getLabelGroup() {
        return this.f23514A;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23567v.getLayoutParams();
        return this.f23567v.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        if (this.f23546h0 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23568w.getLayoutParams();
            return this.f23568w.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f23514A.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.f23514A.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    void o() {
        y(this.f23571z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f23528O;
        if (gVar != null && gVar.isCheckable() && this.f23528O.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f23511p0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.f23544g0;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f23528O.getTitle();
            if (!TextUtils.isEmpty(this.f23528O.getContentDescription())) {
                title = this.f23528O.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f23544g0.l()));
        }
        z zVarD1 = z.d1(accessibilityNodeInfo);
        zVarD1.z0(z.g.b(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            zVarD1.x0(false);
            zVarD1.o0(z.a.f3882i);
        }
        zVarD1.P0(getResources().getString(Q4.i.f9380h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f23569x.setBackground(drawable);
        n();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f23535V = z10;
        n();
        this.f23569x.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i10) {
        this.f23539c0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f23542f0 = i10;
        if (this.f23546h0 == 1) {
            setPadding(i10, 0, i10, 0);
        }
        A(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f23560o0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i10) {
        this.f23538b0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f23537a0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f23553l != i10) {
            this.f23553l = i10;
            ((LinearLayout.LayoutParams) this.f23514A.getLayoutParams()).topMargin = i10;
            if (this.f23517D.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23517D.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
                if (getLayoutDirection() == 1) {
                    i10 = 0;
                }
                layoutParams.leftMargin = i10;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f23541e0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f23540d0 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f23536W = i10;
        A(getWidth());
    }

    void setBadge(com.google.android.material.badge.a aVar) {
        ImageView imageView;
        if (this.f23544g0 == aVar) {
            return;
        }
        if (i() && (imageView = this.f23571z) != null) {
            y(imageView);
        }
        this.f23544g0 = aVar;
        aVar.T(this.f23548i0);
        ImageView imageView2 = this.f23571z;
        if (imageView2 != null) {
            x(imageView2);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        setLabelPivots(this.f23516C);
        setLabelPivots(this.f23515B);
        setLabelPivots(this.f23519F);
        setLabelPivots(this.f23518E);
        l(z10 ? 1.0f : 0.0f);
        TextView textView = this.f23516C;
        TextView textView2 = this.f23515B;
        float f10 = this.f23557n;
        float f11 = this.f23559o;
        float f12 = this.f23561p;
        if (this.f23546h0 == 1) {
            textView = this.f23519F;
            textView2 = this.f23518E;
            f10 = this.f23562q;
            f11 = this.f23563r;
            f12 = this.f23564s;
        }
        int i10 = this.f23565t;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        s();
                    }
                } else if (z10) {
                    r(textView, textView2, f11, f10);
                } else {
                    r(textView2, textView, f12, 0.0f);
                }
            } else if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (this.f23566u) {
            if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (z10) {
            r(textView, textView2, f11, f10);
        } else {
            r(textView2, textView, f12, 0.0f);
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f23515B.setEnabled(z10);
        this.f23516C.setEnabled(z10);
        this.f23518E.setEnabled(z10);
        this.f23519F.setEnabled(z10);
        this.f23571z.setEnabled(z10);
    }

    @Override // com.google.android.material.navigation.h
    public void setExpanded(boolean z10) {
        this.f23552k0 = z10;
        H();
    }

    public void setHorizontalTextAppearanceActive(int i10) {
        this.f23524K = i10;
        TextView textView = this.f23519F;
        if (i10 == 0) {
            i10 = this.f23522I;
        }
        D(textView, i10);
    }

    public void setHorizontalTextAppearanceInactive(int i10) {
        this.f23525L = i10;
        TextView textView = this.f23518E;
        if (i10 == 0) {
            i10 = this.f23523J;
        }
        E(textView, i10);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f23530Q) {
            return;
        }
        this.f23530Q = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = AbstractC3606a.r(drawable).mutate();
            this.f23531R = drawable;
            ColorStateList colorStateList = this.f23529P;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f23571z.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        if (this.f23555m != i10) {
            this.f23555m = i10;
            q();
            requestLayout();
        }
    }

    public void setIconSize(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23571z.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f23571z.setLayoutParams(layoutParams);
        q();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f23529P = colorStateList;
        if (this.f23528O == null || (drawable = this.f23531R) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f23531R.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemGravity(int i10) {
        this.f23550j0 = i10;
        requestLayout();
    }

    public void setItemIconGravity(int i10) {
        if (this.f23546h0 != i10) {
            this.f23546h0 = i10;
            F();
            n();
        }
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f23551k != i10) {
            this.f23551k = i10;
            m();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f23549j != i10) {
            this.f23549j = i10;
            m();
        }
    }

    public void setItemPosition(int i10) {
        this.f23521H = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f23545h = colorStateList;
        n();
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f23558n0 = z10;
        setTextAppearanceActive(this.f23522I);
        setTextAppearanceInactive(this.f23523J);
        setHorizontalTextAppearanceActive(this.f23524K);
        setHorizontalTextAppearanceInactive(this.f23525L);
    }

    public void setLabelMaxLines(int i10) {
        this.f23515B.setMaxLines(i10);
        this.f23516C.setMaxLines(i10);
        this.f23518E.setMaxLines(i10);
        this.f23519F.setMaxLines(i10);
        if (Build.VERSION.SDK_INT > 34) {
            this.f23515B.setGravity(17);
            this.f23516C.setGravity(17);
        } else if (i10 > 1) {
            this.f23515B.setEllipsize(null);
            this.f23516C.setEllipsize(null);
            this.f23515B.setGravity(17);
            this.f23516C.setGravity(17);
        } else {
            this.f23515B.setGravity(16);
            this.f23516C.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f23565t != i10) {
            this.f23565t = i10;
            B();
            A(getWidth());
            m();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f23556m0 = z10;
        this.f23514A.setMeasurePaddingFromBaseline(z10);
        this.f23515B.setIncludeFontPadding(z10);
        this.f23516C.setIncludeFontPadding(z10);
        this.f23517D.setMeasurePaddingFromBaseline(z10);
        this.f23518E.setIncludeFontPadding(z10);
        this.f23519F.setIncludeFontPadding(z10);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f23554l0 = z10;
        H();
    }

    public void setShifting(boolean z10) {
        if (this.f23566u != z10) {
            this.f23566u = z10;
            m();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.f23522I = i10;
        D(this.f23516C, i10);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f23527N = z10;
        setTextAppearanceActive(this.f23522I);
        setHorizontalTextAppearanceActive(this.f23524K);
        C();
    }

    public void setTextAppearanceInactive(int i10) {
        this.f23523J = i10;
        E(this.f23515B, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f23526M = colorStateList;
        if (colorStateList != null) {
            this.f23515B.setTextColor(colorStateList);
            this.f23516C.setTextColor(colorStateList);
            this.f23518E.setTextColor(colorStateList);
            this.f23519F.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f23515B.setText(charSequence);
        this.f23516C.setText(charSequence);
        this.f23518E.setText(charSequence);
        this.f23519F.setText(charSequence);
        androidx.appcompat.view.menu.g gVar = this.f23528O;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.g gVar2 = this.f23528O;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f23528O.getTooltipText();
        }
        k0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f23547i = drawable;
        n();
    }
}
