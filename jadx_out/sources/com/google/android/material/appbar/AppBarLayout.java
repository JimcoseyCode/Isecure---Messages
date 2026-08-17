package com.google.android.material.appbar;

import I0.z;
import Q4.j;
import Q4.k;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import androidx.core.view.D;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.l;
import e5.AbstractC2425c;
import g.AbstractC2619a;
import h5.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k5.AbstractC2830a;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final int f22562H = j.f9412k;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final TimeInterpolator f22563A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int[] f22564B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f22565C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Drawable f22566D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Integer f22567E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final float f22568F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Behavior f22569G;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private L0 f22576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f22577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f22580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f22582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f22583t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private WeakReference f22584u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ValueAnimator f22585v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f22586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f22587x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final LinkedHashSet f22588y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long f22589z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f22590k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f22591l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ValueAnimator f22592m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private SavedState f22593n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference f22594o;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f22600a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f22601b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f22600a = coordinatorLayout;
                this.f22601b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f22600a, this.f22601b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b extends C1657a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f22603a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f22604b;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f22603a = appBarLayout;
                this.f22604b = coordinatorLayout;
            }

            @Override // androidx.core.view.C1657a
            public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
                View viewF0;
                super.onInitializeAccessibilityNodeInfo(view, zVar);
                zVar.w0(ScrollView.class.getName());
                if (this.f22603a.getTotalScrollRange() == 0 || (viewF0 = BaseBehavior.this.f0(this.f22604b)) == null || !BaseBehavior.this.b0(this.f22603a)) {
                    return;
                }
                if (BaseBehavior.this.M() != (-this.f22603a.getTotalScrollRange())) {
                    zVar.b(z.a.f3890q);
                    zVar.R0(true);
                }
                if (BaseBehavior.this.M() != 0) {
                    if (!viewF0.canScrollVertically(-1)) {
                        zVar.b(z.a.f3891r);
                        zVar.R0(true);
                    } else if ((-this.f22603a.getDownNestedPreScrollRange()) != 0) {
                        zVar.b(z.a.f3891r);
                        zVar.R0(true);
                    }
                }
            }

            @Override // androidx.core.view.C1657a
            public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f22603a.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.performAccessibilityAction(view, i10, bundle);
                }
                if (BaseBehavior.this.M() != 0) {
                    View viewF0 = BaseBehavior.this.f0(this.f22604b);
                    if (!viewF0.canScrollVertically(-1)) {
                        this.f22603a.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f22603a.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.q(this.f22604b, this.f22603a, viewF0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (AbstractC1658a0.M(coordinatorLayout)) {
                return;
            }
            AbstractC1658a0.k0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(M() - i10);
            float fAbs = Math.abs(f10);
            W(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iM = M();
            if (iM == i10) {
                ValueAnimator valueAnimator = this.f22592m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f22592m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f22592m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f22592m = valueAnimator3;
                valueAnimator3.setInterpolator(R4.a.f10028e);
                this.f22592m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f22592m.setDuration(Math.min(i11, 600));
            this.f22592m.setIntValues(iM, i10);
            this.f22592m.start();
        }

        private int X(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((d) appBarLayout.getChildAt(i10).getLayoutParams()).f22609a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof D) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (a0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i11++;
                } else if (interpolatorD != null) {
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f10 = topInset;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listP = coordinatorLayout.p(appBarLayout);
            int size = listP.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) ((View) listP.get(i10)).getLayoutParams()).e();
                if (cVarE instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarE).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                View childAt = appBarLayout.getChildAt(iE0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iE0 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (a0(iC, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iM < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, B0.a.b(X(iM, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View viewD0 = d0(appBarLayout, i10);
            boolean zC = false;
            if (viewD0 != null) {
                int iC = ((d) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int minimumHeight = viewD0.getMinimumHeight();
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewD0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i10) >= (viewD0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zC = true;
                    }
                }
            }
            if (appBarLayout.o()) {
                zC = appBarLayout.C(c0(coordinatorLayout));
            }
            boolean z11 = appBarLayout.z(zC);
            if (z10 || (z11 && v0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        int M() {
            return E() + this.f22590k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f22594o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.o()) {
                appBarLayout.z(appBarLayout.C(c0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean zL = super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f22593n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f22595i) {
                P(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f22596j) {
                P(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f22597k);
                P(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f22593n.f22599m ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f22593n.f22598l)));
            }
            appBarLayout.v();
            this.f22593n = null;
            G(B0.a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            x0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.t(E());
            U(coordinatorLayout, appBarLayout);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.H(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            AppBarLayout appBarLayout2;
            int i13;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = O(coordinatorLayout, appBarLayout2, i11, i14, i15);
                }
            }
            if (appBarLayout2.o()) {
                appBarLayout2.z(appBarLayout2.C(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = O(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                U(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                s0((SavedState) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f22593n.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f22593n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            SavedState savedStateT0 = t0(parcelableY, appBarLayout);
            return savedStateT0 == null ? parcelableY : savedStateT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.o() || appBarLayout.q() || Z(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f22592m) != null) {
                valueAnimator.cancel();
            }
            this.f22594o = null;
            this.f22591l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f22591l == 0 || i10 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.o()) {
                    appBarLayout.z(appBarLayout.C(view));
                }
            }
            this.f22594o = new WeakReference(view);
        }

        void s0(SavedState savedState, boolean z10) {
            if (this.f22593n == null || z10) {
                this.f22593n = savedState;
            }
        }

        SavedState t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f16708h;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = iE == 0;
                    savedState.f22596j = z10;
                    savedState.f22595i = !z10 && (-iE) >= appBarLayout.getTotalScrollRange();
                    savedState.f22597k = i10;
                    savedState.f22599m = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    savedState.f22598l = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iM = M();
            int i13 = 0;
            if (i11 == 0 || iM < i11 || iM > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f22590k = 0;
            } else {
                int iB = B0.a.b(i10, i11, i12);
                if (iM != iB) {
                    int iI0 = appBarLayout.i() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i14 = iM - iB;
                    this.f22590k = iB - iI0;
                    if (zG) {
                        while (i13 < appBarLayout.getChildCount()) {
                            d dVar = (d) appBarLayout.getChildAt(i13).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(appBarLayout, appBarLayout.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!zG && appBarLayout.i()) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.t(E());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    x0(coordinatorLayout2, appBarLayout2, iB, iB < iM ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            U(coordinatorLayout2, appBarLayout2);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            boolean f22595i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f22596j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f22597k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            float f22598l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            boolean f22599m;

            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f22595i = parcel.readByte() != 0;
                this.f22596j = parcel.readByte() != 0;
                this.f22597k = parcel.readInt();
                this.f22598l = parcel.readFloat();
                this.f22599m = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f22595i ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f22596j ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f22597k);
                parcel.writeFloat(this.f22598l);
                parcel.writeByte(this.f22599m ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                return ((BaseBehavior) cVarE).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                AbstractC1658a0.V(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarE).f22590k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.z(appBarLayout.C(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.e
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.e
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.e
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC1658a0.k0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.o(view));
            if (appBarLayoutH != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f22635d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutH.w(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f9553P4);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9561Q4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements I {
        a() {
        }

        @Override // androidx.core.view.I
        public L0 a(View view, L0 l02) {
            return AppBarLayout.this.u(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f22607a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f22608b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f22607a, appBarLayout, view);
            float fAbs = this.f22607a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fA = 1.0f - B0.a.a(Math.abs(fAbs / this.f22607a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f22607a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f22608b);
            this.f22608b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f22608b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f22608b);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private boolean B() {
        return this.f22566D != null && getTopInset() > 0;
    }

    private boolean D() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    private void E(float f10, float f11) {
        ValueAnimator valueAnimator = this.f22585v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f22585v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f22589z);
        this.f22585v.setInterpolator(this.f22563A);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f22586w;
        if (animatorUpdateListener != null) {
            this.f22585v.addUpdateListener(animatorUpdateListener);
        }
        this.f22585v.start();
    }

    private void F() {
        setWillNotDraw(!B());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, h5.h hVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hVar.c0(fFloatValue);
        Drawable drawable = appBarLayout.f22566D;
        if (drawable instanceof h5.h) {
            ((h5.h) drawable).c0(fFloatValue);
        }
        Iterator it = appBarLayout.f22587x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            hVar.E();
            throw null;
        }
        Iterator it2 = appBarLayout.f22588y.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            hVar.E();
            throw null;
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, h5.h hVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iJ = X4.a.j(appBarLayout.f22565C, colorStateList.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        hVar.d0(ColorStateList.valueOf(iJ));
        if (appBarLayout.f22566D != null && (num2 = appBarLayout.f22567E) != null && num2.equals(num)) {
            appBarLayout.f22566D.setTint(iJ);
        }
        if (!appBarLayout.f22587x.isEmpty()) {
            Iterator it = appBarLayout.f22587x.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                if (hVar.B() != null) {
                    throw null;
                }
            }
        }
        if (appBarLayout.f22588y.isEmpty()) {
            return;
        }
        Iterator it2 = appBarLayout.f22588y.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
    }

    private void c() {
        WeakReference weakReference = this.f22584u;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22584u = null;
    }

    private Integer d() {
        Drawable drawable = this.f22566D;
        if (drawable instanceof h5.h) {
            return Integer.valueOf(((h5.h) drawable).E());
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i10;
        if (this.f22584u == null && (i10 = this.f22583t) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f22583t);
            }
            if (viewFindViewById != null) {
                this.f22584u = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f22584u;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(final h5.h hVar, final ColorStateList colorStateList) {
        final Integer numF = X4.a.f(getContext(), Q4.a.f9109J);
        this.f22586w = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f22619a, colorStateList, hVar, numF, valueAnimator);
            }
        };
    }

    private void m(Context context, final h5.h hVar) {
        hVar.R(context);
        this.f22586w = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f22623a, hVar, valueAnimator);
            }
        };
    }

    private void n() {
        Behavior behavior = this.f22569G;
        BaseBehavior.SavedState savedStateT0 = (behavior == null || this.f22571h == -1 || this.f22575l != 0) ? null : behavior.t0(AbsSavedState.f16708h, this);
        this.f22571h = -1;
        this.f22572i = -1;
        this.f22573j = -1;
        if (savedStateT0 != null) {
            this.f22569G.s0(savedStateT0, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof h5.h;
    }

    private h5.h r(Drawable drawable) {
        if (drawable instanceof h5.h) {
            return (h5.h) drawable;
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(drawable);
        if (colorStateListF == null) {
            return null;
        }
        h5.h hVar = new h5.h();
        hVar.d0(colorStateListF);
        return hVar;
    }

    private Drawable s(Context context, Drawable drawable) {
        h5.h hVarR = r(drawable);
        if (hVarR == null || hVarR.B() == null) {
            return drawable;
        }
        this.f22565C = hVarR.B().getDefaultColor();
        ColorStateList colorStateList = this.f22582s;
        if (colorStateList != null) {
            l(hVarR, colorStateList);
            return hVarR;
        }
        m(context, hVarR);
        return hVarR;
    }

    private void x(boolean z10, boolean z11, boolean z12) {
        this.f22575l = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean y(boolean z10) {
        if (this.f22579p == z10) {
            return false;
        }
        this.f22579p = z10;
        refreshDrawableState();
        return true;
    }

    boolean A(boolean z10, boolean z11) {
        if (!z11 || this.f22580q == z10) {
            return false;
        }
        this.f22580q = z10;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        if (this.f22582s != null) {
            E(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f22581r) {
            return true;
        }
        E(z10 ? 0.0f : this.f22568F, z10 ? this.f22568F : 0.0f);
        return true;
    }

    boolean C(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (B()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f22570g);
            this.f22566D.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f22566D;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f22569G = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f22572i;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f22609a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i12 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f22572i = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f22573j;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i12 = dVar.f22609a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f22573j = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f22583t;
    }

    public h5.h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h5.h) {
            return (h5.h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    int getPendingAction() {
        return this.f22575l;
    }

    public Drawable getStatusBarForeground() {
        return this.f22566D;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        L0 l02 = this.f22576m;
        if (l02 != null) {
            return l02.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f22571h;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f22609a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f22571h = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    boolean i() {
        return this.f22574k;
    }

    boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f22581r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f22564B == null) {
            this.f22564B = new int[4];
        }
        int[] iArr = this.f22564B;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f22579p;
        int i11 = Q4.a.f9108I0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f22580q) ? Q4.a.f9110J0 : -Q4.a.f9110J0;
        int i12 = Q4.a.f9102F0;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f22580q) ? Q4.a.f9100E0 : -Q4.a.f9100E0;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && D()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC1658a0.V(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f22574k = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f22574k = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f22566D;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f22578o) {
            return;
        }
        if (!this.f22581r && !j()) {
            z11 = false;
        }
        y(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && D()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = B0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    public boolean q() {
        return this.f22580q;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(s(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        i.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        w(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f22581r = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f22582s != colorStateList) {
            this.f22582s = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f22583t = -1;
        if (view == null) {
            c();
        } else {
            this.f22584u = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f22583t = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f22578o = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    void setPendingAction(int i10) {
        this.f22575l = i10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f22566D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f22566D = drawable != null ? drawable.mutate() : null;
            this.f22567E = d();
            Drawable drawable3 = this.f22566D;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f22566D.setState(getDrawableState());
                }
                AbstractC3606a.m(this.f22566D, getLayoutDirection());
                this.f22566D.setVisible(getVisibility() == 0, false);
                this.f22566D.setCallback(this);
            }
            F();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(AbstractC2619a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f22566D;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    void t(int i10) {
        this.f22570g = i10;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f22577n;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                android.support.v4.media.session.b.a(this.f22577n.get(i11));
            }
        }
    }

    L0 u(L0 l02) {
        L0 l03 = getFitsSystemWindows() ? l02 : null;
        if (!H0.c.a(this.f22576m, l03)) {
            this.f22576m = l03;
            F();
            requestLayout();
        }
        return l02;
    }

    void v() {
        this.f22575l = 0;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22566D;
    }

    public void w(boolean z10, boolean z11) {
        x(z10, z11, true);
    }

    boolean z(boolean z10) {
        return A(z10, !this.f22578o);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9130a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f22562H;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f22571h = -1;
        this.f22572i = -1;
        this.f22573j = -1;
        this.f22575l = 0;
        this.f22587x = new ArrayList();
        this.f22588y = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            h.a(this);
        }
        h.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = l.i(context2, attributeSet, k.f9636a, i10, i11, new int[0]);
        this.f22582s = AbstractC2425c.a(context2, typedArrayI, k.f9698h);
        this.f22589z = c5.d.f(context2, Q4.a.f9161p0, getResources().getInteger(Q4.f.f9325a));
        this.f22563A = c5.d.g(context2, Q4.a.f9179y0, R4.a.f10024a);
        if (typedArrayI.hasValue(k.f9681f)) {
            x(typedArrayI.getBoolean(k.f9681f, false), false, false);
        }
        if (typedArrayI.hasValue(k.f9672e)) {
            h.b(this, typedArrayI.getDimensionPixelSize(k.f9672e, 0));
        }
        setBackground(typedArrayI.getDrawable(k.f9645b));
        if (Build.VERSION.SDK_INT >= 26) {
            if (typedArrayI.hasValue(k.f9663d)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(k.f9663d, false));
            }
            if (typedArrayI.hasValue(k.f9654c)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(k.f9654c, false));
            }
        }
        this.f22568F = getResources().getDimension(Q4.c.f9218c);
        this.f22581r = typedArrayI.getBoolean(k.f9690g, false);
        this.f22583t = typedArrayI.getResourceId(k.f9706i, -1);
        setStatusBarForeground(typedArrayI.getDrawable(k.f9714j));
        typedArrayI.recycle();
        AbstractC1658a0.w0(this, new a());
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f22610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f22611c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22609a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f9730l);
            this.f22609a = typedArrayObtainStyledAttributes.getInt(k.f9746n, 0);
            f(typedArrayObtainStyledAttributes.getInt(k.f9738m, 0));
            if (typedArrayObtainStyledAttributes.hasValue(k.f9754o)) {
                this.f22611c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(k.f9754o, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f22610b;
        }

        public int c() {
            return this.f22609a;
        }

        public Interpolator d() {
            return this.f22611c;
        }

        boolean e() {
            int i10 = this.f22609a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f22610b = a(i10);
        }

        public void g(int i10) {
            this.f22609a = i10;
        }

        public d(int i10, int i11) {
            super(i10, i11);
            this.f22609a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22609a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22609a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22609a = 1;
        }
    }
}
