package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e5.AbstractC2425c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ColorStateList f23891A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f23892B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f23896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f23897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f23898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f23899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout f23900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f23901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f23903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f23904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f23905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f23908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f23909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f23910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f23911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23912t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f23913u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f23914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f23915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f23917y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23918z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f23920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f23922d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f23919a = i10;
            this.f23920b = textView;
            this.f23921c = i11;
            this.f23922d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            v.this.f23906n = this.f23919a;
            v.this.f23904l = null;
            TextView textView = this.f23920b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f23921c == 1 && v.this.f23910r != null) {
                    v.this.f23910r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f23922d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f23922d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f23922d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f23922d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f23900h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f23899g = context;
        this.f23900h = textInputLayout;
        this.f23905m = context.getResources().getDimensionPixelSize(Q4.c.f9240n);
        this.f23893a = c5.d.f(context, Q4.a.f9169t0, JfifUtil.MARKER_EOI);
        this.f23894b = c5.d.f(context, Q4.a.f9163q0, 167);
        this.f23895c = c5.d.f(context, Q4.a.f9169t0, 167);
        this.f23896d = c5.d.g(context, Q4.a.f9171u0, R4.a.f10027d);
        int i10 = Q4.a.f9171u0;
        TimeInterpolator timeInterpolator = R4.a.f10024a;
        this.f23897e = c5.d.g(context, i10, timeInterpolator);
        this.f23898f = c5.d.g(context, Q4.a.f9175w0, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f23906n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (this.f23900h.isLaidOut() && this.f23900h.isEnabled()) {
            return (this.f23907o == this.f23906n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i10, int i11, boolean z10) {
        v vVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f23904l = animatorSet;
            ArrayList arrayList = new ArrayList();
            vVar = this;
            vVar.i(arrayList, this.f23916x, this.f23917y, 2, i10, i11);
            vVar.i(arrayList, vVar.f23909q, vVar.f23910r, 1, i10, i11);
            R4.b.a(animatorSet, arrayList);
            animatorSet.addListener(vVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            vVar = this;
            D(i10, i11);
        }
        vVar.f23900h.q0();
        vVar.f23900h.w0(z10);
        vVar.f23900h.C0();
    }

    private boolean g() {
        return (this.f23901i == null || this.f23900h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f23895c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f23895c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f23894b : this.f23895c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f23897e : this.f23898f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f23905m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f23893a);
        objectAnimatorOfFloat.setInterpolator(this.f23896d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f23910r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f23917y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f23899g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f23910r == null || TextUtils.isEmpty(this.f23908p)) ? false : true;
    }

    boolean A() {
        return this.f23909q;
    }

    boolean B() {
        return this.f23916x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f23901i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f23903k) == null) {
            this.f23901i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f23902j - 1;
        this.f23902j = i11;
        O(this.f23901i, i11);
    }

    void E(int i10) {
        this.f23912t = i10;
        TextView textView = this.f23910r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f23911s = charSequence;
        TextView textView = this.f23910r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f23909q == z10) {
            return;
        }
        h();
        if (z10) {
            androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(this.f23899g);
            this.f23910r = b10;
            b10.setId(Q4.e.f9293W);
            this.f23910r.setTextAlignment(5);
            Typeface typeface = this.f23892B;
            if (typeface != null) {
                this.f23910r.setTypeface(typeface);
            }
            H(this.f23913u);
            I(this.f23914v);
            F(this.f23911s);
            E(this.f23912t);
            this.f23910r.setVisibility(4);
            e(this.f23910r, 0);
        } else {
            w();
            C(this.f23910r, 0);
            this.f23910r = null;
            this.f23900h.q0();
            this.f23900h.C0();
        }
        this.f23909q = z10;
    }

    void H(int i10) {
        this.f23913u = i10;
        TextView textView = this.f23910r;
        if (textView != null) {
            this.f23900h.c0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f23914v = colorStateList;
        TextView textView = this.f23910r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f23918z = i10;
        TextView textView = this.f23917y;
        if (textView != null) {
            androidx.core.widget.i.m(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f23916x == z10) {
            return;
        }
        h();
        if (z10) {
            androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(this.f23899g);
            this.f23917y = b10;
            b10.setId(Q4.e.f9294X);
            this.f23917y.setTextAlignment(5);
            Typeface typeface = this.f23892B;
            if (typeface != null) {
                this.f23917y.setTypeface(typeface);
            }
            this.f23917y.setVisibility(4);
            this.f23917y.setAccessibilityLiveRegion(1);
            J(this.f23918z);
            L(this.f23891A);
            e(this.f23917y, 1);
            this.f23917y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f23917y, 1);
            this.f23917y = null;
            this.f23900h.q0();
            this.f23900h.C0();
        }
        this.f23916x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f23891A = colorStateList;
        TextView textView = this.f23917y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f23892B) {
            this.f23892B = typeface;
            M(this.f23910r, typeface);
            M(this.f23917y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f23908p = charSequence;
        this.f23910r.setText(charSequence);
        int i10 = this.f23906n;
        if (i10 != 1) {
            this.f23907o = 1;
        }
        S(i10, this.f23907o, P(this.f23910r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f23915w = charSequence;
        this.f23917y.setText(charSequence);
        int i10 = this.f23906n;
        if (i10 != 2) {
            this.f23907o = 2;
        }
        S(i10, this.f23907o, P(this.f23917y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f23901i == null && this.f23903k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f23899g);
            this.f23901i = linearLayout;
            linearLayout.setOrientation(0);
            this.f23900h.addView(this.f23901i, -1, -2);
            this.f23903k = new FrameLayout(this.f23899g);
            this.f23901i.addView(this.f23903k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f23900h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f23903k.setVisibility(0);
            this.f23903k.addView(textView);
        } else {
            this.f23901i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f23901i.setVisibility(0);
        this.f23902j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f23900h.getEditText();
            boolean zK = AbstractC2425c.k(this.f23899g);
            this.f23901i.setPaddingRelative(v(zK, Q4.c.f9204Q, editText.getPaddingStart()), v(zK, Q4.c.f9205R, this.f23899g.getResources().getDimensionPixelSize(Q4.c.f9203P)), v(zK, Q4.c.f9204Q, editText.getPaddingEnd()), 0);
        }
    }

    void h() {
        Animator animator = this.f23904l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f23907o);
    }

    int n() {
        return this.f23912t;
    }

    CharSequence o() {
        return this.f23911s;
    }

    CharSequence p() {
        return this.f23908p;
    }

    int q() {
        TextView textView = this.f23910r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f23910r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f23915w;
    }

    View t() {
        return this.f23917y;
    }

    int u() {
        TextView textView = this.f23917y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f23908p = null;
        h();
        if (this.f23906n == 1) {
            if (!this.f23916x || TextUtils.isEmpty(this.f23915w)) {
                this.f23907o = 0;
            } else {
                this.f23907o = 2;
            }
        }
        S(this.f23906n, this.f23907o, P(this.f23910r, PointerEventHelper.POINTER_TYPE_UNKNOWN));
    }

    void x() {
        h();
        int i10 = this.f23906n;
        if (i10 == 2) {
            this.f23907o = 0;
        }
        S(i10, this.f23907o, P(this.f23917y, PointerEventHelper.POINTER_TYPE_UNKNOWN));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
