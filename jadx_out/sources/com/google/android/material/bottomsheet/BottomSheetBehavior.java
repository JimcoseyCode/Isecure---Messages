package com.google.android.material.bottomsheet;

import I0.C;
import I0.z;
import Q4.i;
import Q4.j;
import Q4.k;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.c;
import c5.C1852b;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import com.google.android.material.internal.o;
import e5.AbstractC2425c;
import h5.h;
import h5.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f22778l0 = j.f9414m;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f22779A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final g f22780B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f22781C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f22782D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f22783E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f22784F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    float f22785G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f22786H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    float f22787I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f22788J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f22789K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f22790L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f22791M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f22792N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f22793O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f22794P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    androidx.customview.widget.c f22795Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f22796R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f22797S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f22798T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f22799U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f22800V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    int f22801W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f22802X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    WeakReference f22803Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    WeakReference f22804Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22805a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    WeakReference f22806a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22807b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    WeakReference f22808b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22809c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ArrayList f22810c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f22811d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private VelocityTracker f22812d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22813e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    C1852b f22814e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22815f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f22816f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22817g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f22818g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22819h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f22820h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22821i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Map f22822i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f22823j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    final SparseIntArray f22824j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f22825k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final c.AbstractC0170c f22826k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f22832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f22835t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f22836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f22837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f22838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f22839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f22840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private l f22841z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f22847g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f22848h;

        a(View view, int i10) {
            this.f22847g = view;
            this.f22848h = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.e1(this.f22847g, this.f22848h, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f22823j != null) {
                BottomSheetBehavior.this.f22823j.e0(fFloatValue);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22851a;

        c(boolean z10) {
            this.f22851a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.o.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public L0 a(View view, L0 l02, o.d dVar) {
            boolean z10;
            x0.e eVarF = l02.f(L0.p.g());
            x0.e eVarF2 = l02.f(L0.p.d());
            BottomSheetBehavior.this.f22839x = eVarF.f33238b;
            boolean zH = o.h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f22831p) {
                BottomSheetBehavior.this.f22838w = l02.j();
                paddingBottom = dVar.f23493d + BottomSheetBehavior.this.f22838w;
            }
            if (BottomSheetBehavior.this.f22832q) {
                paddingLeft = (zH ? dVar.f23492c : dVar.f23490a) + eVarF.f33237a;
            }
            if (BottomSheetBehavior.this.f22833r) {
                paddingRight = (zH ? dVar.f23490a : dVar.f23492c) + eVarF.f33239c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f22835t) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = eVarF.f33237a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (BottomSheetBehavior.this.f22836u) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = eVarF.f33239c;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.f22837v) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = eVarF.f33238b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z11 = z10;
                }
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f22851a) {
                BottomSheetBehavior.this.f22829n = eVarF2.f33240d;
            }
            if (!BottomSheetBehavior.this.f22831p && !this.f22851a) {
                return l02;
            }
            BottomSheetBehavior.this.j1(false);
            return l02;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends c.AbstractC0170c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f22853a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f22802X + bottomSheetBehavior.n0()) / 2;
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int b(View view, int i10, int i11) {
            return B0.a.b(i10, BottomSheetBehavior.this.n0(), e(view));
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int e(View view) {
            return BottomSheetBehavior.this.f0() ? BottomSheetBehavior.this.f22802X : BottomSheetBehavior.this.f22786H;
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f22790L) {
                BottomSheetBehavior.this.X0(1);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.k0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // androidx.customview.widget.c.AbstractC0170c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void l(View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f22788J && bottomSheetBehavior.b1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f22813e) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f22807b || Math.abs(view.getTop() - BottomSheetBehavior.this.n0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f22784F)) {
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f22807b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f22784F;
                        if (top < i11) {
                            if (top >= Math.abs(top - bottomSheetBehavior2.f22786H)) {
                                if (BottomSheetBehavior.this.c1()) {
                                }
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.f22786H) || BottomSheetBehavior.this.c1()) {
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f22783E) < Math.abs(top - BottomSheetBehavior.this.f22786H)) {
                    }
                } else if (!BottomSheetBehavior.this.f22807b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f22784F) >= Math.abs(top2 - BottomSheetBehavior.this.f22786H) || BottomSheetBehavior.this.c1()) {
                    }
                }
            } else if (BottomSheetBehavior.this.f22807b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f22853a;
                if (BottomSheetBehavior.this.c1()) {
                    if (!BottomSheetBehavior.this.Z0(jUptimeMillis, (top3 * 100.0f) / r10.f22802X)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f22784F) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.e1(view, i10, bottomSheetBehavior3.d1());
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f22793O;
            if (i11 == 1 || bottomSheetBehavior.f22820h0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f22816f0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f22808b0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f22853a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f22803Y;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22855a;

        e(int i10) {
            this.f22855a = i10;
        }

        @Override // I0.C
        public boolean a(View view, C.a aVar) {
            BottomSheetBehavior.this.W0(this.f22855a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f22805a = 0;
        this.f22807b = true;
        this.f22809c = false;
        this.f22827l = -1;
        this.f22828m = -1;
        this.f22780B = new g(this, null);
        this.f22785G = 0.5f;
        this.f22787I = -1.0f;
        this.f22790L = true;
        this.f22791M = true;
        this.f22793O = 4;
        this.f22794P = 4;
        this.f22799U = 0.1f;
        this.f22810c0 = new ArrayList();
        this.f22818g0 = -1;
        this.f22824j0 = new SparseIntArray();
        this.f22826k0 = new d();
    }

    private boolean B0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f22806a0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.y(view, i10, i11);
    }

    private boolean C0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f22808b0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.y(view, i10, i11);
    }

    private void E0(View view, z.a aVar, int i10) {
        AbstractC1658a0.g0(view, aVar, null, h0(i10));
    }

    private void F0() {
        this.f22816f0 = -1;
        this.f22818g0 = -1;
        VelocityTracker velocityTracker = this.f22812d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22812d0 = null;
        }
    }

    private void G0(SavedState savedState) {
        int i10 = this.f22805a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f22815f = savedState.f22843j;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f22807b = savedState.f22844k;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f22788J = savedState.f22845l;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f22789K = savedState.f22846m;
        }
    }

    private void H0(View view, Runnable runnable) {
        if (z0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int X(View view, int i10, int i11) {
        return AbstractC1658a0.c(view, view.getResources().getString(i10), h0(i11));
    }

    private void Y0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || w0() || this.f22817g) ? false : true;
        if (this.f22831p || this.f22832q || this.f22833r || this.f22835t || this.f22836u || this.f22837v || z10) {
            o.b(view, new c(z10));
        }
    }

    private void Z() {
        int iD0 = d0();
        if (this.f22807b) {
            this.f22786H = Math.max(this.f22802X - iD0, this.f22783E);
        } else {
            this.f22786H = this.f22802X - iD0;
        }
    }

    private float a0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private boolean a1() {
        if (this.f22795Q != null) {
            return this.f22790L || this.f22793O == 1;
        }
        return false;
    }

    private void b0() {
        this.f22784F = (int) (this.f22802X * (1.0f - this.f22785G));
    }

    private float c0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f22823j == null || (weakReference = this.f22803Y) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f22803Y.get();
        if (!u0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(a0(this.f22823j.K(), rootWindowInsets.getRoundedCorner(0)), a0(this.f22823j.L(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int d0() {
        int i10;
        return this.f22817g ? Math.min(Math.max(this.f22819h, this.f22802X - ((this.f22801W * 9) / 16)), this.f22800V) + this.f22838w : (this.f22830o || this.f22831p || (i10 = this.f22829n) <= 0) ? this.f22815f + this.f22838w : Math.max(this.f22815f, i10 + this.f22821i);
    }

    private float e0(int i10) {
        float f10;
        float fN0;
        int i11 = this.f22786H;
        if (i10 > i11 || i11 == n0()) {
            int i12 = this.f22786H;
            f10 = i12 - i10;
            fN0 = this.f22802X - i12;
        } else {
            int i13 = this.f22786H;
            f10 = i13 - i10;
            fN0 = i13 - n0();
        }
        return f10 / fN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(View view, int i10, boolean z10) {
        int iS0 = s0(i10);
        androidx.customview.widget.c cVar = this.f22795Q;
        if (cVar == null || (!z10 ? cVar.Q(view, view.getLeft(), iS0) : cVar.O(view.getLeft(), iS0))) {
            X0(i10);
            return;
        }
        X0(2);
        h1(i10, true);
        this.f22780B.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0() {
        return x0() && y0();
    }

    private void f1() {
        WeakReference weakReference = this.f22803Y;
        if (weakReference != null) {
            g1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f22804Z;
        if (weakReference2 != null) {
            g1((View) weakReference2.get(), 1);
        }
    }

    private void g0(View view, int i10) {
        if (view == null) {
            return;
        }
        AbstractC1658a0.e0(view, 524288);
        AbstractC1658a0.e0(view, 262144);
        AbstractC1658a0.e0(view, 1048576);
        int i11 = this.f22824j0.get(i10, -1);
        if (i11 != -1) {
            AbstractC1658a0.e0(view, i11);
            this.f22824j0.delete(i10);
        }
    }

    private void g1(View view, int i10) {
        if (view == null) {
            return;
        }
        g0(view, i10);
        if (!this.f22807b && this.f22793O != 6) {
            this.f22824j0.put(i10, X(view, i.f9373a, 6));
        }
        if (this.f22788J && y0() && this.f22793O != 5) {
            E0(view, z.a.f3898y, 5);
        }
        int i11 = this.f22793O;
        if (i11 == 3) {
            E0(view, z.a.f3897x, this.f22807b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            E0(view, z.a.f3896w, this.f22807b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            E0(view, z.a.f3897x, 4);
            E0(view, z.a.f3896w, 3);
        }
    }

    private C h0(int i10) {
        return new e(i10);
    }

    private void h1(int i10, boolean z10) {
        boolean zV0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f22779A == (zV0 = v0()) || this.f22823j == null) {
            return;
        }
        this.f22779A = zV0;
        if (!z10 || (valueAnimator = this.f22781C) == null) {
            ValueAnimator valueAnimator2 = this.f22781C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f22781C.cancel();
            }
            this.f22823j.e0(this.f22779A ? c0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f22781C.reverse();
        } else {
            this.f22781C.setFloatValues(this.f22823j.C(), zV0 ? c0() : 1.0f);
            this.f22781C.start();
        }
    }

    private void i0(Context context) {
        if (this.f22841z == null) {
            return;
        }
        h hVar = new h(this.f22841z);
        this.f22823j = hVar;
        hVar.R(context);
        ColorStateList colorStateList = this.f22825k;
        if (colorStateList != null) {
            this.f22823j.d0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f22823j.setTint(typedValue.data);
    }

    private void i1(boolean z10) {
        Map map;
        WeakReference weakReference = this.f22803Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f22822i0 != null) {
                    return;
                } else {
                    this.f22822i0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f22803Y.get()) {
                    if (z10) {
                        this.f22822i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f22809c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f22809c && (map = this.f22822i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f22822i0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f22822i0 = null;
            } else if (this.f22809c) {
                ((View) this.f22803Y.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void j0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0(), 1.0f);
        this.f22781C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f22781C.addUpdateListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(boolean z10) {
        View view;
        if (this.f22803Y != null) {
            Z();
            if (this.f22793O != 4 || (view = (View) this.f22803Y.get()) == null) {
                return;
            }
            if (z10) {
                W0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private int m0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, androidx.customview.widget.a.INVALID_ID);
    }

    private int s0(int i10) {
        if (i10 == 3) {
            return n0();
        }
        if (i10 == 4) {
            return this.f22786H;
        }
        if (i10 == 5) {
            return this.f22802X;
        }
        if (i10 == 6) {
            return this.f22784F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float t0() {
        VelocityTracker velocityTracker = this.f22812d0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(ProgressBarContainerView.MAX_PROGRESS, this.f22811d);
        return this.f22812d0.getYVelocity(this.f22816f0);
    }

    private boolean u0() {
        WeakReference weakReference = this.f22803Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f22803Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean v0() {
        if (this.f22793O == 3) {
            return this.f22840y || u0();
        }
        return false;
    }

    private boolean z0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f22797S = 0;
        this.f22798T = false;
        return (i10 & 2) != 0;
    }

    public boolean A0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        WeakReference weakReference;
        int i11 = 3;
        if (view.getTop() == n0()) {
            X0(3);
            return;
        }
        if (!A0() || ((weakReference = this.f22808b0) != null && view2 == weakReference.get() && this.f22798T)) {
            if (this.f22797S > 0) {
                if (!this.f22807b && view.getTop() > this.f22784F) {
                    i11 = 6;
                }
            } else if (this.f22788J && b1(view, t0())) {
                i11 = 5;
            } else if (this.f22797S == 0) {
                int top = view.getTop();
                if (!this.f22807b) {
                    int i12 = this.f22784F;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f22786H)) {
                            if (c1()) {
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.f22786H)) {
                    }
                } else if (Math.abs(top - this.f22783E) >= Math.abs(top - this.f22786H)) {
                    i11 = 4;
                }
            } else {
                if (!this.f22807b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f22784F) < Math.abs(top2 - this.f22786H)) {
                    }
                }
                i11 = 4;
            }
            e1(view, i11, false);
            this.f22798T = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f22793O == 1 && actionMasked == 0) {
            return true;
        }
        if (a1()) {
            this.f22795Q.F(motionEvent);
        }
        if (actionMasked == 0) {
            F0();
        }
        if (this.f22812d0 == null) {
            this.f22812d0 = VelocityTracker.obtain();
        }
        this.f22812d0.addMovement(motionEvent);
        if (a1() && actionMasked == 2 && !this.f22796R && Math.abs(this.f22818g0 - motionEvent.getY()) > this.f22795Q.z()) {
            this.f22795Q.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f22796R;
    }

    public void D0(f fVar) {
        this.f22810c0.remove(fVar);
    }

    public void I0(boolean z10) {
        this.f22790L = z10;
    }

    public void J0(boolean z10) {
        this.f22791M = z10;
    }

    public void K0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f22782D = i10;
        h1(this.f22793O, true);
    }

    public void L0(boolean z10) {
        if (this.f22807b == z10) {
            return;
        }
        this.f22807b = z10;
        if (this.f22803Y != null) {
            Z();
        }
        X0((this.f22807b && this.f22793O == 6) ? 3 : this.f22793O);
        h1(this.f22793O, true);
        f1();
    }

    public void M0(boolean z10) {
        this.f22830o = z10;
    }

    public void N0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f22785G = f10;
        if (this.f22803Y != null) {
            b0();
        }
    }

    public void O0(boolean z10) {
        if (this.f22788J != z10) {
            this.f22788J = z10;
            if (!z10 && this.f22793O == 5) {
                W0(4);
            }
            f1();
        }
    }

    public void P0(int i10) {
        this.f22828m = i10;
    }

    public void Q0(int i10) {
        this.f22827l = i10;
    }

    public void R0(int i10) {
        S0(i10, false);
    }

    public final void S0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f22817g) {
                return;
            } else {
                this.f22817g = true;
            }
        } else {
            if (!this.f22817g && this.f22815f == i10) {
                return;
            }
            this.f22817g = false;
            this.f22815f = Math.max(0, i10);
        }
        j1(z10);
    }

    public void T0(int i10) {
        this.f22805a = i10;
    }

    public void U0(int i10) {
        this.f22813e = i10;
    }

    public void V0(boolean z10) {
        this.f22789K = z10;
    }

    public void W0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.f22788J || i10 != 5) {
            int i11 = (i10 == 6 && this.f22807b && s0(i10) <= this.f22783E) ? 3 : i10;
            WeakReference weakReference = this.f22803Y;
            if (weakReference == null || weakReference.get() == null) {
                X0(i10);
            } else {
                View view = (View) this.f22803Y.get();
                H0(view, new a(view, i11));
            }
        }
    }

    void X0(int i10) {
        View view;
        if (this.f22793O == i10) {
            return;
        }
        this.f22793O = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f22788J && i10 == 5)) {
            this.f22794P = i10;
        }
        WeakReference weakReference = this.f22803Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            i1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            i1(false);
        }
        h1(i10, true);
        for (int i11 = 0; i11 < this.f22810c0.size(); i11++) {
            ((f) this.f22810c0.get(i11)).c(view, i10);
        }
        f1();
    }

    public void Y(f fVar) {
        if (this.f22810c0.contains(fVar)) {
            return;
        }
        this.f22810c0.add(fVar);
    }

    public boolean Z0(long j10, float f10) {
        return false;
    }

    boolean b1(View view, float f10) {
        if (this.f22789K) {
            return true;
        }
        if (y0() && view.getTop() >= this.f22786H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f22799U)) - ((float) this.f22786H)) / ((float) d0()) > 0.5f;
        }
        return false;
    }

    public boolean c1() {
        return false;
    }

    public boolean d1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f22803Y = null;
        this.f22795Q = null;
        this.f22814e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f22803Y = null;
        this.f22795Q = null;
        this.f22814e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        androidx.customview.widget.c cVar;
        if (!view.isShown() || !this.f22790L) {
            this.f22796R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            F0();
        }
        if (this.f22812d0 == null) {
            this.f22812d0 = VelocityTracker.obtain();
        }
        this.f22812d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f22818g0 = y10;
            if (this.f22793O != 2 && C0(coordinatorLayout, x10, y10)) {
                this.f22816f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!B0(coordinatorLayout, x10, this.f22818g0)) {
                    this.f22820h0 = true;
                }
            }
            this.f22796R = this.f22816f0 == -1 && !coordinatorLayout.y(view, x10, this.f22818g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f22820h0 = false;
            this.f22816f0 = -1;
            if (this.f22796R) {
                this.f22796R = false;
                return false;
            }
        }
        if (!this.f22796R && (cVar = this.f22795Q) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f22808b0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view2 == null || this.f22796R || this.f22793O == 1 || coordinatorLayout.y(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f22795Q == null || (i10 = this.f22818g0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f22795Q.z())) ? false : true;
    }

    void k0(int i10) {
        View view = (View) this.f22803Y.get();
        if (view == null || this.f22810c0.isEmpty()) {
            return;
        }
        float fE0 = e0(i10);
        for (int i11 = 0; i11 < this.f22810c0.size(); i11++) {
            ((f) this.f22810c0.get(i11)).b(view, fE0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f22803Y == null) {
            this.f22819h = coordinatorLayout.getResources().getDimensionPixelSize(Q4.c.f9232j);
            Y0(view);
            AbstractC1658a0.C0(view, new com.google.android.material.bottomsheet.a(view));
            this.f22803Y = new WeakReference(view);
            this.f22814e0 = new C1852b(view);
            h hVar = this.f22823j;
            if (hVar != null) {
                view.setBackground(hVar);
                h hVar2 = this.f22823j;
                float elevation = this.f22787I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                hVar2.c0(elevation);
            } else {
                ColorStateList colorStateList = this.f22825k;
                if (colorStateList != null) {
                    AbstractC1658a0.p0(view, colorStateList);
                }
            }
            f1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f22795Q == null) {
            this.f22795Q = androidx.customview.widget.c.o(coordinatorLayout, this.f22826k0);
        }
        int top = view.getTop();
        coordinatorLayout.G(view, i10);
        this.f22801W = coordinatorLayout.getWidth();
        this.f22802X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f22800V = height;
        int iMin = this.f22802X;
        int i11 = iMin - height;
        int i12 = this.f22839x;
        if (i11 < i12) {
            if (this.f22834s) {
                int i13 = this.f22828m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f22800V = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f22828m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f22800V = iMin2;
            }
        }
        this.f22783E = Math.max(0, this.f22802X - this.f22800V);
        b0();
        Z();
        int i15 = this.f22793O;
        if (i15 == 3) {
            AbstractC1658a0.V(view, n0());
        } else if (i15 == 6) {
            AbstractC1658a0.V(view, this.f22784F);
        } else if (this.f22788J && i15 == 5) {
            AbstractC1658a0.V(view, this.f22802X);
        } else if (i15 == 4) {
            AbstractC1658a0.V(view, this.f22786H);
        } else if (i15 == 1 || i15 == 2) {
            AbstractC1658a0.V(view, top - view.getTop());
        }
        h1(this.f22793O, false);
        this.f22808b0 = new WeakReference(l0(view));
        for (int i16 = 0; i16 < this.f22810c0.size(); i16++) {
            ((f) this.f22810c0.get(i16)).a(view);
        }
        return true;
    }

    View l0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewL0 = l0(viewGroup.getChildAt(i10));
                if (viewL0 != null) {
                    return viewL0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f22827l, marginLayoutParams.width), m0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f22828m, marginLayoutParams.height));
        return true;
    }

    public int n0() {
        if (this.f22807b) {
            return this.f22783E;
        }
        return Math.max(this.f22782D, this.f22834s ? 0 : this.f22839x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return A0() && (weakReference = this.f22808b0) != null && view2 == weakReference.get() && (!(this.f22793O == 3 || this.f22792N) || super.o(coordinatorLayout, view, view2, f10, f11));
    }

    public float o0() {
        return this.f22785G;
    }

    public int p0() {
        return this.f22828m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f22808b0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!A0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.f22798T && !this.f22791M && view2 == view3 && view2.canScrollVertically(1)) {
                    this.f22792N = true;
                    return;
                }
                if (i13 < n0()) {
                    int iN0 = top - n0();
                    iArr[1] = iN0;
                    AbstractC1658a0.V(view, -iN0);
                    X0(3);
                } else {
                    if (!this.f22790L) {
                        return;
                    }
                    iArr[1] = i11;
                    AbstractC1658a0.V(view, -i11);
                    X0(1);
                }
            } else if (i11 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f22798T && !this.f22791M && view2 == view3 && zCanScrollVertically) {
                    this.f22792N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i13 > this.f22786H && !f0()) {
                        int i14 = top - this.f22786H;
                        iArr[1] = i14;
                        AbstractC1658a0.V(view, -i14);
                        X0(4);
                    } else {
                        if (!this.f22790L) {
                            return;
                        }
                        iArr[1] = i11;
                        AbstractC1658a0.V(view, -i11);
                        X0(1);
                    }
                }
            }
            k0(view.getTop());
            this.f22797S = i11;
            this.f22798T = true;
            this.f22792N = false;
        }
    }

    public int q0() {
        if (this.f22817g) {
            return -1;
        }
        return this.f22815f;
    }

    public int r0() {
        return this.f22793O;
    }

    public boolean w0() {
        return this.f22830o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, view, savedState.a());
        G0(savedState);
        int i10 = savedState.f22842i;
        if (i10 == 1 || i10 == 2) {
            this.f22793O = 4;
            this.f22794P = 4;
        } else {
            this.f22793O = i10;
            this.f22794P = i10;
        }
    }

    public boolean x0() {
        return this.f22788J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.y(coordinatorLayout, view), this);
    }

    public boolean y0() {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f22859c;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f22858b = false;
                androidx.customview.widget.c cVar = BottomSheetBehavior.this.f22795Q;
                if (cVar != null && cVar.m(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f22857a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f22793O == 2) {
                    bottomSheetBehavior.X0(gVar2.f22857a);
                }
            }
        }

        private g() {
            this.f22859c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f22803Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f22857a = i10;
            if (this.f22858b) {
                return;
            }
            ((View) BottomSheetBehavior.this.f22803Y.get()).postOnAnimation(this.f22859c);
            this.f22858b = true;
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final int f22842i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f22843j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f22844k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f22845l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f22846m;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f22842i = parcel.readInt();
            this.f22843j = parcel.readInt();
            this.f22844k = parcel.readInt() == 1;
            this.f22845l = parcel.readInt() == 1;
            this.f22846m = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22842i);
            parcel.writeInt(this.f22843j);
            parcel.writeInt(this.f22844k ? 1 : 0);
            parcel.writeInt(this.f22845l ? 1 : 0);
            parcel.writeInt(this.f22846m ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f22842i = bottomSheetBehavior.f22793O;
            this.f22843j = bottomSheetBehavior.f22815f;
            this.f22844k = bottomSheetBehavior.f22807b;
            this.f22845l = bottomSheetBehavior.f22788J;
            this.f22846m = bottomSheetBehavior.f22789K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f22805a = 0;
        this.f22807b = true;
        this.f22809c = false;
        this.f22827l = -1;
        this.f22828m = -1;
        this.f22780B = new g(this, null);
        this.f22785G = 0.5f;
        this.f22787I = -1.0f;
        this.f22790L = true;
        this.f22791M = true;
        this.f22793O = 4;
        this.f22794P = 4;
        this.f22799U = 0.1f;
        this.f22810c0 = new ArrayList();
        this.f22818g0 = -1;
        this.f22824j0 = new SparseIntArray();
        this.f22826k0 = new d();
        this.f22821i = context.getResources().getDimensionPixelSize(Q4.c.f9239m0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f9612X);
        if (typedArrayObtainStyledAttributes.hasValue(k.f9646b0)) {
            this.f22825k = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, k.f9646b0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(k.f9803u0)) {
            this.f22841z = l.e(context, attributeSet, Q4.a.f9136d, f22778l0).m();
        }
        i0(context);
        j0();
        this.f22787I = typedArrayObtainStyledAttributes.getDimension(k.f9637a0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(k.f9620Y)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9620Y, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(k.f9628Z)) {
            P0(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9628Z, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(k.f9707i0);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            R0(i10);
        } else {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9707i0, -1));
        }
        O0(typedArrayObtainStyledAttributes.getBoolean(k.f9699h0, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(k.f9739m0, false));
        L0(typedArrayObtainStyledAttributes.getBoolean(k.f9682f0, true));
        V0(typedArrayObtainStyledAttributes.getBoolean(k.f9731l0, false));
        I0(typedArrayObtainStyledAttributes.getBoolean(k.f9655c0, true));
        J0(typedArrayObtainStyledAttributes.getBoolean(k.f9664d0, true));
        T0(typedArrayObtainStyledAttributes.getInt(k.f9715j0, 0));
        N0(typedArrayObtainStyledAttributes.getFloat(k.f9691g0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(k.f9673e0);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            K0(typedValuePeekValue2.data);
        } else {
            K0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(k.f9673e0, 0));
        }
        U0(typedArrayObtainStyledAttributes.getInt(k.f9723k0, 500));
        this.f22831p = typedArrayObtainStyledAttributes.getBoolean(k.f9771q0, false);
        this.f22832q = typedArrayObtainStyledAttributes.getBoolean(k.f9779r0, false);
        this.f22833r = typedArrayObtainStyledAttributes.getBoolean(k.f9787s0, false);
        this.f22834s = typedArrayObtainStyledAttributes.getBoolean(k.f9795t0, true);
        this.f22835t = typedArrayObtainStyledAttributes.getBoolean(k.f9747n0, false);
        this.f22836u = typedArrayObtainStyledAttributes.getBoolean(k.f9755o0, false);
        this.f22837v = typedArrayObtainStyledAttributes.getBoolean(k.f9763p0, false);
        this.f22840y = typedArrayObtainStyledAttributes.getBoolean(k.f9811v0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f22811d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class f {
        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);

        void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
