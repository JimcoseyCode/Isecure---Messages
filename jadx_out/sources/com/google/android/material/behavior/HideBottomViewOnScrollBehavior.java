package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f22708m = Q4.a.f9159o0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f22709n = Q4.a.f9163q0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f22710o = Q4.a.f9173v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f22711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f22714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f22715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AccessibilityManager f22717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f22718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewPropertyAnimator f22722l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f22722l = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f22711a = new LinkedHashSet();
        this.f22716f = 0;
        this.f22719i = true;
        this.f22720j = 2;
        this.f22721k = 0;
    }

    public static /* synthetic */ void E(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z10) {
        if (!z10) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.L()) {
            hideBottomViewOnScrollBehavior.P(view);
        }
    }

    private void J(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f22722l = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void K(final View view) {
        if (this.f22717g == null) {
            this.f22717g = (AccessibilityManager) androidx.core.content.a.j(view.getContext(), AccessibilityManager.class);
        }
        if (this.f22717g == null || this.f22718h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: S4.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideBottomViewOnScrollBehavior.E(this.f10264a, view, z10);
            }
        };
        this.f22718h = touchExplorationStateChangeListener;
        this.f22717g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private void R(View view, int i10) {
        this.f22720j = i10;
        Iterator it = this.f22711a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean L() {
        return this.f22720j == 1;
    }

    public boolean M() {
        return this.f22720j == 2;
    }

    public void N(View view) {
        O(view, true);
    }

    public void O(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (L()) {
            return;
        }
        if (this.f22719i && (accessibilityManager = this.f22717g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22722l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        R(view, 1);
        int i10 = this.f22716f + this.f22721k;
        if (z10) {
            J(view, i10, this.f22713c, this.f22715e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void P(View view) {
        Q(view, true);
    }

    public void Q(View view, boolean z10) {
        if (M()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22722l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        R(view, 2);
        if (z10) {
            J(view, 0, this.f22712b, this.f22714d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f22716f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f22712b = c5.d.f(view.getContext(), f22708m, JfifUtil.MARKER_APP1);
        this.f22713c = c5.d.f(view.getContext(), f22709n, 175);
        Context context = view.getContext();
        int i11 = f22710o;
        this.f22714d = c5.d.g(context, i11, R4.a.f10027d);
        this.f22715e = c5.d.g(view.getContext(), i11, R4.a.f10026c);
        K(view);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            N(view);
        } else if (i11 < 0) {
            P(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22711a = new LinkedHashSet();
        this.f22716f = 0;
        this.f22719i = true;
        this.f22720j = 2;
        this.f22721k = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f22718h == null || HideBottomViewOnScrollBehavior.this.f22717g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f22717g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f22718h);
            HideBottomViewOnScrollBehavior.this.f22718h = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
