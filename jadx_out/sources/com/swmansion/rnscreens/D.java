package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1690q0;
import androidx.core.view.L0;
import b5.AbstractC1807a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends ReactViewGroup {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f24985p = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ReactContext f24986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f24990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f24993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f24994o;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends BottomSheetBehavior.f {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
            D.this.f24990k = Math.max(f10, 0.0f);
            if (D.this.f24989j) {
                return;
            }
            D d10 = D.this;
            int i10 = d10.f24987h;
            int reactHeight = D.this.getReactHeight();
            D d11 = D.this;
            d10.n(i10, reactHeight, d11.u(d11.f24990k), D.this.f24991l);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
            if (L6.q.f7278a.b(i10)) {
                if (i10 == 3 || i10 == 4 || i10 == 6) {
                    D d10 = D.this;
                    d10.n(d10.f24987h, D.this.getReactHeight(), D.this.t(i10), D.this.f24991l);
                }
                D.this.f24988i = i10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends C1690q0.b {
        c() {
            super(0);
        }

        @Override // androidx.core.view.C1690q0.b
        public void onEnd(C1690q0 animation) {
            AbstractC2855l.g(animation, "animation");
            D.this.f24989j = false;
        }

        @Override // androidx.core.view.C1690q0.b
        public L0 onProgress(L0 insets, List runningAnimations) {
            AbstractC2855l.g(insets, "insets");
            AbstractC2855l.g(runningAnimations, "runningAnimations");
            D.this.f24991l = insets.f(L0.p.b()).f33240d - insets.f(L0.p.e()).f33240d;
            D d10 = D.this;
            int i10 = d10.f24987h;
            int reactHeight = D.this.getReactHeight();
            D d11 = D.this;
            d10.n(i10, reactHeight, d11.u(d11.f24990k), D.this.f24991l);
            return insets;
        }

        @Override // androidx.core.view.C1690q0.b
        public C1690q0.a onStart(C1690q0 animation, C1690q0.a bounds) {
            AbstractC2855l.g(animation, "animation");
            AbstractC2855l.g(bounds, "bounds");
            D.this.f24989j = true;
            C1690q0.a aVarOnStart = super.onStart(animation, bounds);
            AbstractC2855l.f(aVarOnStart, "onStart(...)");
            return aVarOnStart;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(ReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f24986g = reactContext;
        this.f24988i = 5;
        c cVar = new c();
        this.f24993n = cVar;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        AbstractC1658a0.C0(decorView, cVar);
        this.f24994o = new b();
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.f24987h > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final C2311y getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof C2311y) {
            return (C2311y) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<C2311y> getSheetBehavior() {
        return r().getSheetBehavior();
    }

    public static /* synthetic */ void o(D d10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        d10.n(i10, i11, i12, i13);
    }

    private final C2311y r() {
        C2311y screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final BottomSheetBehavior s() {
        BottomSheetBehavior<C2311y> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t(int i10) {
        BottomSheetBehavior bottomSheetBehaviorS = s();
        if (i10 == 3) {
            return bottomSheetBehaviorS.n0();
        }
        if (i10 == 4) {
            return this.f24987h - bottomSheetBehaviorS.q0();
        }
        if (i10 == 5) {
            return this.f24987h;
        }
        if (i10 == 6) {
            return (int) (this.f24987h * (1 - bottomSheetBehaviorS.o0()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int u(float f10) {
        C2311y screenParent = getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) AbstractC1807a.c(t(4), t(3), f10);
    }

    public final ReactContext getReactContext() {
        return this.f24986g;
    }

    public final void n(int i10, int i11, int i12, int i13) {
        int iMax = ((i10 - i11) - i12) - Math.max(i13, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<C2311y> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            q(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<C2311y> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            v(sheetBehavior);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getHasReceivedInitialLayoutFromParent()) {
            n(this.f24987h, i13 - i11, t(s().r0()), this.f24991l);
        }
    }

    public final void p(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this.f24987h = i14;
        o(this, i14, getReactHeight(), t(s().r0()), 0, 8, null);
    }

    public final void q(BottomSheetBehavior behavior) {
        AbstractC2855l.g(behavior, "behavior");
        if (this.f24992m) {
            return;
        }
        behavior.Y(this.f24994o);
        this.f24992m = true;
    }

    public final void v(BottomSheetBehavior behavior) {
        AbstractC2855l.g(behavior, "behavior");
        if (this.f24992m) {
            behavior.D0(this.f24994o);
            this.f24992m = false;
        }
    }
}
