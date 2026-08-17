package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2227f extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f23824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f23825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f23826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f23827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f23828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f23829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f23830m;

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2227f.this.f23888b.a0(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2227f.this.f23888b.a0(false);
        }
    }

    C2227f(s sVar) {
        super(sVar);
        this.f23827j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2227f.v(this.f23817g, view);
            }
        };
        this.f23828k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C2227f c2227f = this.f23818a;
                c2227f.A(c2227f.E());
            }
        };
        this.f23822e = c5.d.f(sVar.getContext(), Q4.a.f9167s0, 100);
        this.f23823f = c5.d.f(sVar.getContext(), Q4.a.f9167s0, 150);
        this.f23824g = c5.d.g(sVar.getContext(), Q4.a.f9175w0, R4.a.f10024a);
        this.f23825h = c5.d.g(sVar.getContext(), Q4.a.f9173v0, R4.a.f10027d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        boolean z11 = this.f23888b.F() == z10;
        if (z10 && !this.f23829l.isRunning()) {
            this.f23830m.cancel();
            this.f23829l.start();
            if (z11) {
                this.f23829l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f23829l.cancel();
        this.f23830m.start();
        if (z11) {
            this.f23830m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f23824g);
        valueAnimatorOfFloat.setDuration(this.f23822e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2227f.x(this.f23819a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f23825h);
        valueAnimatorOfFloat.setDuration(this.f23823f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2227f.y(this.f23821a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f23829l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f23829l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f23830m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f23826i;
        if (editText != null) {
            return (editText.hasFocus() || this.f23890d.hasFocus()) && this.f23826i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(C2227f c2227f, View view) {
        EditText editText = c2227f.f23826i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c2227f.r();
    }

    public static /* synthetic */ void x(C2227f c2227f, ValueAnimator valueAnimator) {
        c2227f.getClass();
        c2227f.f23890d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(C2227f c2227f, ValueAnimator valueAnimator) {
        c2227f.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c2227f.f23890d.setScaleX(fFloatValue);
        c2227f.f23890d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.t
    void a(Editable editable) {
        if (this.f23888b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.t
    int c() {
        return Q4.i.f9377e;
    }

    @Override // com.google.android.material.textfield.t
    int d() {
        return Q4.d.f9268h;
    }

    @Override // com.google.android.material.textfield.t
    View.OnFocusChangeListener e() {
        return this.f23828k;
    }

    @Override // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.f23827j;
    }

    @Override // com.google.android.material.textfield.t
    View.OnFocusChangeListener g() {
        return this.f23828k;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f23826i = editText;
        this.f23887a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.t
    void q(boolean z10) {
        if (this.f23888b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.t
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.t
    void u() {
        EditText editText = this.f23826i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23820g.A(true);
                }
            });
        }
    }
}
