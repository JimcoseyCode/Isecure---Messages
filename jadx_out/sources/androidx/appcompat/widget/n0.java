package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1664d0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class n0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static n0 f15043q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n0 f15044r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f15045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CharSequence f15046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f15047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f15048j = new Runnable() { // from class: androidx.appcompat.widget.l0
        @Override // java.lang.Runnable
        public final void run() {
            this.f15039g.h(false);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f15049k = new Runnable() { // from class: androidx.appcompat.widget.m0
        @Override // java.lang.Runnable
        public final void run() {
            this.f15042g.d();
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f15050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f15051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f15052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15054p;

    private n0(View view, CharSequence charSequence) {
        this.f15045g = view;
        this.f15046h = charSequence;
        this.f15047i = AbstractC1664d0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f15045g.removeCallbacks(this.f15048j);
    }

    private void c() {
        this.f15054p = true;
    }

    private void e() {
        this.f15045g.postDelayed(this.f15048j, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(n0 n0Var) {
        n0 n0Var2 = f15043q;
        if (n0Var2 != null) {
            n0Var2.b();
        }
        f15043q = n0Var;
        if (n0Var != null) {
            n0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        n0 n0Var = f15043q;
        if (n0Var != null && n0Var.f15045g == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new n0(view, charSequence);
            return;
        }
        n0 n0Var2 = f15044r;
        if (n0Var2 != null && n0Var2.f15045g == view) {
            n0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f15054p && Math.abs(x10 - this.f15050l) <= this.f15047i && Math.abs(y10 - this.f15051m) <= this.f15047i) {
            return false;
        }
        this.f15050l = x10;
        this.f15051m = y10;
        this.f15054p = false;
        return true;
    }

    void d() {
        if (f15044r == this) {
            f15044r = null;
            o0 o0Var = this.f15052n;
            if (o0Var != null) {
                o0Var.c();
                this.f15052n = null;
                c();
                this.f15045g.removeOnAttachStateChangeListener(this);
            }
        }
        if (f15043q == this) {
            f(null);
        }
        this.f15045g.removeCallbacks(this.f15049k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f15045g.isAttachedToWindow()) {
            f(null);
            n0 n0Var = f15044r;
            if (n0Var != null) {
                n0Var.d();
            }
            f15044r = this;
            this.f15053o = z10;
            o0 o0Var = new o0(this.f15045g.getContext());
            this.f15052n = o0Var;
            o0Var.e(this.f15045g, this.f15050l, this.f15051m, this.f15053o, this.f15046h);
            this.f15045g.addOnAttachStateChangeListener(this);
            if (this.f15053o) {
                j11 = 2500;
            } else {
                if ((AbstractC1658a0.K(this.f15045g) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f15045g.removeCallbacks(this.f15049k);
            this.f15045g.postDelayed(this.f15049k, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f15052n != null && this.f15053o) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f15045g.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f15045g.isEnabled() && this.f15052n == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f15050l = view.getWidth() / 2;
        this.f15051m = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
