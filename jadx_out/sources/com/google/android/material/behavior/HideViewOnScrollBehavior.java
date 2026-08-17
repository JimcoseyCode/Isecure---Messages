package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f22725o = Q4.a.f9159o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f22726p = Q4.a.f9163q0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f22727q = Q4.a.f9173v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f22728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AccessibilityManager f22729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f22730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f22732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TimeInterpolator f22735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeInterpolator f22736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewPropertyAnimator f22740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f22741n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f22740m = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f22731d = true;
        this.f22732e = new LinkedHashSet();
        this.f22737j = 0;
        this.f22738k = 2;
        this.f22739l = 0;
        this.f22741n = false;
    }

    public static /* synthetic */ void E(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z10) {
        if (hideViewOnScrollBehavior.f22731d && z10 && hideViewOnScrollBehavior.O()) {
            hideViewOnScrollBehavior.R(view);
        }
    }

    private void J(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f22740m = this.f22728a.d(view, i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void K(final View view) {
        if (this.f22729b == null) {
            this.f22729b = (AccessibilityManager) androidx.core.content.a.j(view.getContext(), AccessibilityManager.class);
        }
        if (this.f22729b == null || this.f22730c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: S4.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideViewOnScrollBehavior.E(this.f10266a, view, z10);
            }
        };
        this.f22730c = touchExplorationStateChangeListener;
        this.f22729b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private boolean L(int i10) {
        return i10 == 80 || i10 == 81;
    }

    private boolean M(int i10) {
        return i10 == 3 || i10 == 19;
    }

    private void P(View view, int i10) {
        if (this.f22741n) {
            return;
        }
        int i11 = ((CoordinatorLayout.f) view.getLayoutParams()).f16247c;
        if (L(i11)) {
            Q(1);
        } else {
            Q(M(Gravity.getAbsoluteGravity(i11, i10)) ? 2 : 0);
        }
    }

    private void Q(int i10) {
        d dVar = this.f22728a;
        if (dVar == null || dVar.c() != i10) {
            if (i10 == 0) {
                this.f22728a = new c();
                return;
            }
            if (i10 == 1) {
                this.f22728a = new com.google.android.material.behavior.a();
                return;
            }
            if (i10 == 2) {
                this.f22728a = new com.google.android.material.behavior.b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i10 + ". Must be 0, 1 or 2.");
        }
    }

    private void V(View view, int i10) {
        this.f22738k = i10;
        Iterator it = this.f22732e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean N() {
        return this.f22738k == 2;
    }

    public boolean O() {
        return this.f22738k == 1;
    }

    public void R(View view) {
        S(view, true);
    }

    public void S(View view, boolean z10) {
        if (N()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22740m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 2);
        int iB = this.f22728a.b();
        if (z10) {
            J(view, iB, this.f22733f, this.f22735h);
        } else {
            this.f22728a.e(view, iB);
        }
    }

    public void T(View view) {
        U(view, true);
    }

    public void U(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (O()) {
            return;
        }
        if (this.f22731d && (accessibilityManager = this.f22729b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22740m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 1);
        int i10 = this.f22737j + this.f22739l;
        if (z10) {
            J(view, i10, this.f22734g, this.f22736i);
        } else {
            this.f22728a.e(view, i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        K(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        P(view, i10);
        this.f22737j = this.f22728a.a(view, marginLayoutParams);
        this.f22733f = c5.d.f(view.getContext(), f22725o, JfifUtil.MARKER_APP1);
        this.f22734g = c5.d.f(view.getContext(), f22726p, 175);
        Context context = view.getContext();
        int i11 = f22727q;
        this.f22735h = c5.d.g(context, i11, R4.a.f10027d);
        this.f22736i = c5.d.g(view.getContext(), i11, R4.a.f10026c);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            T(view);
        } else if (i11 < 0) {
            R(view);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22731d = true;
        this.f22732e = new LinkedHashSet();
        this.f22737j = 0;
        this.f22738k = 2;
        this.f22739l = 0;
        this.f22741n = false;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f22730c == null || HideViewOnScrollBehavior.this.f22729b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f22729b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f22730c);
            HideViewOnScrollBehavior.this.f22730c = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
