package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class q extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f23844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f23845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f23846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f23847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f23848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f23853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f23854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f23855r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f23855r.start();
        }
    }

    q(s sVar) {
        super(sVar);
        this.f23846i = new View.OnClickListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23838g.J();
            }
        };
        this.f23847j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                q.y(this.f23839a, view, z10);
            }
        };
        this.f23848k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.o
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                q.w(this.f23840a, z10);
            }
        };
        this.f23852o = Long.MAX_VALUE;
        this.f23843f = c5.d.f(sVar.getContext(), Q4.a.f9167s0, 67);
        this.f23842e = c5.d.f(sVar.getContext(), Q4.a.f9167s0, 50);
        this.f23844g = c5.d.g(sVar.getContext(), Q4.a.f9175w0, R4.a.f10024a);
    }

    public static /* synthetic */ void A(q qVar) {
        qVar.K();
        qVar.H(false);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f23844g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q.x(this.f23835a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f23855r = E(this.f23843f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f23842e, 1.0f, 0.0f);
        this.f23854q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f23852o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    private void H(boolean z10) {
        if (this.f23851n != z10) {
            this.f23851n = z10;
            this.f23855r.cancel();
            this.f23854q.start();
        }
    }

    private void I() {
        this.f23845h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return q.z(this.f23836g, view, motionEvent);
            }
        });
        this.f23845h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.l
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                q.A(this.f23837a);
            }
        });
        this.f23845h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f23845h == null) {
            return;
        }
        if (G()) {
            this.f23850m = false;
        }
        if (this.f23850m) {
            this.f23850m = false;
            return;
        }
        H(!this.f23851n);
        if (!this.f23851n) {
            this.f23845h.dismissDropDown();
        } else {
            this.f23845h.requestFocus();
            this.f23845h.showDropDown();
        }
    }

    private void K() {
        this.f23850m = true;
        this.f23852o = SystemClock.uptimeMillis();
    }

    public static /* synthetic */ void v(q qVar) {
        boolean zIsPopupShowing = qVar.f23845h.isPopupShowing();
        qVar.H(zIsPopupShowing);
        qVar.f23850m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(q qVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = qVar.f23845h;
        if (autoCompleteTextView == null || r.a(autoCompleteTextView)) {
            return;
        }
        qVar.f23890d.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(q qVar, ValueAnimator valueAnimator) {
        qVar.getClass();
        qVar.f23890d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(q qVar, View view, boolean z10) {
        qVar.f23849l = z10;
        qVar.r();
        if (z10) {
            return;
        }
        qVar.H(false);
        qVar.f23850m = false;
    }

    public static /* synthetic */ boolean z(q qVar, View view, MotionEvent motionEvent) {
        qVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (qVar.G()) {
                qVar.f23850m = false;
            }
            qVar.J();
            qVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.t
    public void a(Editable editable) {
        if (this.f23853p.isTouchExplorationEnabled() && r.a(this.f23845h) && !this.f23890d.hasFocus()) {
            this.f23845h.dismissDropDown();
        }
        this.f23845h.post(new Runnable() { // from class: com.google.android.material.textfield.p
            @Override // java.lang.Runnable
            public final void run() {
                q.v(this.f23841g);
            }
        });
    }

    @Override // com.google.android.material.textfield.t
    int c() {
        return Q4.i.f9379g;
    }

    @Override // com.google.android.material.textfield.t
    int d() {
        return Q4.d.f9267g;
    }

    @Override // com.google.android.material.textfield.t
    View.OnFocusChangeListener e() {
        return this.f23847j;
    }

    @Override // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.f23846i;
    }

    @Override // com.google.android.material.textfield.t
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f23848k;
    }

    @Override // com.google.android.material.textfield.t
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.t
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    boolean k() {
        return this.f23849l;
    }

    @Override // com.google.android.material.textfield.t
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    boolean m() {
        return this.f23851n;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f23845h = D(editText);
        I();
        this.f23887a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f23853p.isTouchExplorationEnabled()) {
            this.f23890d.setImportantForAccessibility(2);
        }
        this.f23887a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.t
    public void o(View view, I0.z zVar) {
        if (!r.a(this.f23845h)) {
            zVar.w0(Spinner.class.getName());
        }
        if (zVar.g0()) {
            zVar.G0(null);
        }
    }

    @Override // com.google.android.material.textfield.t
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f23853p.isEnabled() || r.a(this.f23845h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f23851n && !this.f23845h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.t
    void s() {
        F();
        this.f23853p = (AccessibilityManager) this.f23889c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.t
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f23845h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f23845h.setOnDismissListener(null);
        }
    }
}
