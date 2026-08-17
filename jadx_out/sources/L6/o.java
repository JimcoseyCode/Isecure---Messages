package L6;

import M6.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.A;
import com.swmansion.rnscreens.AbstractC2301n;
import com.swmansion.rnscreens.B;
import com.swmansion.rnscreens.C2298k;
import com.swmansion.rnscreens.C2299l;
import com.swmansion.rnscreens.C2300m;
import com.swmansion.rnscreens.C2302o;
import com.swmansion.rnscreens.C2311y;
import com.swmansion.rnscreens.D;
import com.swmansion.rnscreens.X;
import i7.C2750m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements InterfaceC1768o, I {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f7256r = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2311y f7257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC2301n f7259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d f7265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b f7266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f7267q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b extends BottomSheetBehavior.f {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
            if (i10 == 4 && L0.y(bottomSheet.getRootWindowInsets()).q(L0.p.b())) {
                bottomSheet.requestFocus();
                InputMethodManager inputMethodManagerZ = o.this.z();
                if (inputMethodManagerZ != null) {
                    inputMethodManagerZ.hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X f7269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C2311y f7270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CoordinatorLayout f7271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g f7272d;

        public c(X fragment, C2311y screen, CoordinatorLayout coordinatorLayout, g dimmingDelegate) {
            AbstractC2855l.g(fragment, "fragment");
            AbstractC2855l.g(screen, "screen");
            AbstractC2855l.g(coordinatorLayout, "coordinatorLayout");
            AbstractC2855l.g(dimmingDelegate, "dimmingDelegate");
            this.f7269a = fragment;
            this.f7270b = screen;
            this.f7271c = coordinatorLayout;
            this.f7272d = dimmingDelegate;
        }

        public final CoordinatorLayout a() {
            return this.f7271c;
        }

        public final g b() {
            return this.f7272d;
        }

        public final X c() {
            return this.f7269a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC2855l.b(this.f7269a, cVar.f7269a) && AbstractC2855l.b(this.f7270b, cVar.f7270b) && AbstractC2855l.b(this.f7271c, cVar.f7271c) && AbstractC2855l.b(this.f7272d, cVar.f7272d);
        }

        public int hashCode() {
            return (((((this.f7269a.hashCode() * 31) + this.f7270b.hashCode()) * 31) + this.f7271c.hashCode()) * 31) + this.f7272d.hashCode();
        }

        public String toString() {
            return "SheetAnimationContext(fragment=" + this.f7269a + ", screen=" + this.f7270b + ", coordinatorLayout=" + this.f7271c + ", dimmingDelegate=" + this.f7272d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class d extends BottomSheetBehavior.f {
        public d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
            o.this.J(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7274a;

        static {
            int[] iArr = new int[AbstractC1764k.a.values().length];
            try {
                iArr[AbstractC1764k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1764k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1764k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1764k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1764k.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7274a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC2855l.g(animation, "animation");
            o.this.f7260j = false;
            o.this.A().y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC2855l.g(animation, "animation");
            o.this.f7260j = true;
        }
    }

    public o(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        this.f7257g = screen;
        this.f7259i = C2300m.f25292a;
        this.f7263m = screen.getSheetInitialDetentIndex();
        this.f7264n = screen.getSheetDetents().k(screen.getSheetInitialDetentIndex());
        d dVar = new d();
        this.f7265o = dVar;
        this.f7266p = new b();
        screen.getFragment();
        Fragment fragment = screen.getFragment();
        AbstractC2855l.d(fragment);
        fragment.getLifecycle().a(this);
        BottomSheetBehavior bottomSheetBehaviorB = B();
        if (bottomSheetBehaviorB == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
        }
        bottomSheetBehaviorB.Y(dVar);
    }

    private final BottomSheetBehavior B() {
        return this.f7257g.getSheetBehavior();
    }

    private final X C() {
        Fragment fragment = this.f7257g.getFragment();
        AbstractC2855l.e(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        return (X) fragment;
    }

    private final void D() {
        K();
    }

    private final void E() {
        M();
    }

    private final void F() {
        C2298k.f25283g.g(this);
    }

    private final void G() {
        C2298k.f25283g.b(this);
    }

    private final void H() {
        C2298k.f25283g.e(L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i10) {
        boolean zB = q.f7278a.b(i10);
        if (zB) {
            this.f7264n = i10;
            this.f7263m = this.f7257g.getSheetDetents().h(i10);
        }
        this.f7257g.x(this.f7263m, zB);
        if (N(i10)) {
            C().Z();
        }
    }

    private final void K() {
        View currentFocus;
        View decorView;
        Activity currentActivity = this.f7257g.getReactContext().getCurrentActivity();
        if (currentActivity == null || (currentFocus = currentActivity.getCurrentFocus()) == null) {
            return;
        }
        Window window = currentActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && AbstractC2855l.b(Y6.a.c(decorView), Boolean.TRUE)) {
            this.f7267q = currentFocus;
        }
        this.f7257g.setDescendantFocusability(262144);
        this.f7257g.requestFocus();
        InputMethodManager inputMethodManagerZ = z();
        if (inputMethodManagerZ != null) {
            inputMethodManagerZ.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private final View L() {
        Activity currentActivity = this.f7257g.getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        return decorView;
    }

    private final void M() {
        View view = this.f7267q;
        if (view != null) {
            view.requestFocus();
            InputMethodManager inputMethodManagerZ = z();
            if (inputMethodManagerZ != null) {
                inputMethodManagerZ.showSoftInput(view, 0);
            }
        }
        this.f7267q = null;
    }

    private final boolean N(int i10) {
        return i10 == 5;
    }

    private final Integer O() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        A container = this.f7257g.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        ThemedReactContext reactContext = this.f7257g.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    private final Integer Q() {
        Integer numO = O();
        if (numO != null) {
            return Integer.valueOf(numO.intValue() - this.f7261k);
        }
        return null;
    }

    private final void S(float f10) {
        this.f7257g.setTranslationY(f10 - m(this.f7262l));
    }

    private final void l(AnimatorSet animatorSet, boolean z10, X x10) {
        animatorSet.addListener(new M6.e(x10, new M6.i(this.f7257g), z10 ? e.a.f7514g : e.a.f7515h));
        animatorSet.addListener(new f());
    }

    public static /* synthetic */ BottomSheetBehavior o(o oVar, BottomSheetBehavior bottomSheetBehavior, AbstractC2301n abstractC2301n, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            abstractC2301n = C2300m.f25292a;
        }
        if ((i11 & 4) != 0) {
            i10 = oVar.f7263m;
        }
        return oVar.n(bottomSheetBehavior, abstractC2301n, i10);
    }

    private final ValueAnimator p(float f10, float f11, final g gVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: L6.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.q(gVar, valueAnimator);
            }
        });
        AbstractC2855l.f(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(g gVar, ValueAnimator animator) {
        AbstractC2855l.g(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 != null) {
            gVar.d().setAlpha(f10.floatValue());
        }
    }

    private final ValueAnimator t() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new X6.a(new Function1() { // from class: L6.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(o.u(this.f7252g, (Number) obj));
            }
        }, new Function1() { // from class: L6.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.v((Number) obj);
            }
        }), Float.valueOf(this.f7257g.getHeight()), Float.valueOf(0.0f));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: L6.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.w(this.f7253a, valueAnimator);
            }
        });
        AbstractC2855l.f(valueAnimatorOfObject, "apply(...)");
        return valueAnimatorOfObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float u(o oVar, Number number) {
        return oVar.f7257g.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float v(Number number) {
        return Float.valueOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(o oVar, ValueAnimator it) {
        AbstractC2855l.g(it, "it");
        Object animatedValue = it.getAnimatedValue();
        AbstractC2855l.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        oVar.S(((Float) animatedValue).floatValue());
    }

    private final ValueAnimator x(CoordinatorLayout coordinatorLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (coordinatorLayout.getBottom() - this.f7257g.getTop()) - this.f7257g.getTranslationY());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: L6.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.y(this.f7255a, valueAnimator);
            }
        });
        AbstractC2855l.f(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(o oVar, ValueAnimator it) {
        AbstractC2855l.g(it, "it");
        Object animatedValue = it.getAnimatedValue();
        AbstractC2855l.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        oVar.S(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputMethodManager z() {
        Object systemService = this.f7257g.getReactContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    public final C2311y A() {
        return this.f7257g;
    }

    public final void I(L0 insets) {
        AbstractC2855l.g(insets, "insets");
        this.f7262l = insets.f(L0.p.b()).f33240d;
        if (this.f7260j) {
            return;
        }
        S(0.0f);
    }

    public final Integer P() {
        return this.f7257g.getSheetShouldOverflowTopInset() ? O() : Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(BottomSheetBehavior behavior) {
        Integer numValueOf;
        AbstractC2855l.g(behavior, "behavior");
        Integer numP = P();
        if (numP == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        boolean zB = r.b(this.f7257g);
        if (zB) {
            B contentWrapper = this.f7257g.getContentWrapper();
            if (contentWrapper != null) {
                numValueOf = Integer.valueOf(contentWrapper.getHeight());
                if (!r.a(contentWrapper)) {
                    numValueOf = null;
                }
            }
        } else {
            if (zB) {
                throw new C2750m();
            }
            numValueOf = Integer.valueOf((int) (this.f7257g.getSheetDetents().g() * ((double) numP.intValue())));
        }
        L6.a.b(behavior, numValueOf, this.f7257g.getSheetDetents().d() == 3 ? Integer.valueOf(this.f7257g.getSheetDetents().b(numP.intValue(), this.f7261k)) : null);
    }

    @Override // androidx.core.view.I
    public L0 a(View v10, L0 insets) {
        AbstractC2855l.g(v10, "v");
        AbstractC2855l.g(insets, "insets");
        boolean zQ = insets.q(L0.p.b());
        x0.e eVarF = insets.f(L0.p.b());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        x0.e eVarF2 = insets.f(L0.p.g());
        AbstractC2855l.f(eVarF2, "getInsets(...)");
        x0.e eVarF3 = insets.f(L0.p.a());
        AbstractC2855l.f(eVarF3, "getInsets(...)");
        this.f7261k = Math.max(eVarF2.f33238b, eVarF3.f33238b);
        if (zQ) {
            this.f7258h = true;
            this.f7259i = new C2302o(eVarF.f33240d);
            BottomSheetBehavior bottomSheetBehaviorB = B();
            if (bottomSheetBehaviorB != null) {
                o(this, bottomSheetBehaviorB, this.f7259i, 0, 4, null);
            }
        } else {
            BottomSheetBehavior bottomSheetBehaviorB2 = B();
            if (bottomSheetBehaviorB2 != null) {
                if (this.f7258h) {
                    o(this, bottomSheetBehaviorB2, C2299l.f25290a, 0, 4, null);
                } else {
                    AbstractC2301n abstractC2301n = this.f7259i;
                    C2300m c2300m = C2300m.f25292a;
                    if (!AbstractC2855l.b(abstractC2301n, c2300m)) {
                        o(this, bottomSheetBehaviorB2, c2300m, 0, 4, null);
                    }
                }
            }
            this.f7259i = C2300m.f25292a;
            this.f7258h = false;
        }
        L0 l0A = new L0.a(insets).b(L0.p.g(), x0.e.c(eVarF2.f33237a, eVarF2.f33238b, eVarF2.f33239c, zQ ? 0 : eVarF2.f33240d)).a();
        AbstractC2855l.f(l0A, "build(...)");
        return l0A;
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(androidx.lifecycle.r source, AbstractC1764k.a event) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(event, "event");
        int i10 = e.f7274a[event.ordinal()];
        if (i10 == 1) {
            D();
            return;
        }
        if (i10 == 2) {
            H();
            return;
        }
        if (i10 == 3) {
            G();
        } else if (i10 == 4) {
            F();
        } else {
            if (i10 != 5) {
                return;
            }
            E();
        }
    }

    public final int m(int i10) {
        Integer numP = P();
        if (numP == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        if (!r.b(this.f7257g)) {
            return Math.min(numP.intValue() - ((int) (B7.d.j(this.f7257g.getSheetDetents().g(), 0.0d, 1.0d) * ((double) numP.intValue()))), i10);
        }
        B contentWrapper = this.f7257g.getContentWrapper();
        return Math.min(Math.max(numP.intValue() - (contentWrapper != null ? contentWrapper.getHeight() : 0), 0), i10);
    }

    public final BottomSheetBehavior n(BottomSheetBehavior behavior, AbstractC2301n keyboardState, int i10) {
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        AbstractC2855l.g(behavior, "behavior");
        AbstractC2855l.g(keyboardState, "keyboardState");
        Integer numP = P();
        if (numP == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        behavior.O0(true);
        behavior.I0(true);
        behavior.Y(this.f7265o);
        D footer = this.f7257g.getFooter();
        if (footer != null) {
            footer.q(behavior);
        }
        if (keyboardState instanceof C2300m) {
            int iD = this.f7257g.getSheetDetents().d();
            if (iD == 1) {
                L6.a.e(behavior, Integer.valueOf(r.b(this.f7257g) ? this.f7257g.getSheetDetents().j(this.f7257g) : this.f7257g.getSheetDetents().i(numP.intValue())), false, 2, null);
                return behavior;
            }
            if (iD == 2) {
                return L6.a.h(behavior, Integer.valueOf(this.f7257g.getSheetDetents().k(i10)), Integer.valueOf(this.f7257g.getSheetDetents().c(numP.intValue())), Integer.valueOf(this.f7257g.getSheetDetents().i(numP.intValue())));
            }
            if (iD == 3) {
                return L6.a.f(behavior, Integer.valueOf(this.f7257g.getSheetDetents().k(i10)), Integer.valueOf(this.f7257g.getSheetDetents().c(numP.intValue())), Integer.valueOf(this.f7257g.getSheetDetents().i(numP.intValue())), Float.valueOf(this.f7257g.getSheetDetents().e()), Integer.valueOf(this.f7257g.getSheetDetents().b(numP.intValue(), this.f7261k)));
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.f7257g.getSheetDetents().d() + ". Expected at most 3.");
        }
        if (!(keyboardState instanceof C2302o)) {
            if (!(keyboardState instanceof C2299l)) {
                throw new C2750m();
            }
            behavior.D0(this.f7266p);
            int iD2 = this.f7257g.getSheetDetents().d();
            if (iD2 == 1) {
                L6.a.d(behavior, Integer.valueOf(r.b(this.f7257g) ? this.f7257g.getSheetDetents().j(this.f7257g) : this.f7257g.getSheetDetents().i(numP.intValue())), false);
                return behavior;
            }
            if (iD2 == 2) {
                return L6.a.i(behavior, null, Integer.valueOf(this.f7257g.getSheetDetents().c(numP.intValue())), Integer.valueOf(this.f7257g.getSheetDetents().i(numP.intValue())), 1, null);
            }
            if (iD2 == 3) {
                return L6.a.g(behavior, null, Integer.valueOf(this.f7257g.getSheetDetents().c(numP.intValue())), Integer.valueOf(this.f7257g.getSheetDetents().i(numP.intValue())), Float.valueOf(this.f7257g.getSheetDetents().e()), Integer.valueOf(this.f7257g.getSheetDetents().b(numP.intValue(), this.f7261k)), 1, null);
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.f7257g.getSheetDetents().d() + ". Expected at most 3.");
        }
        boolean z10 = ((C2302o) keyboardState).a() != 0;
        int iD3 = this.f7257g.getSheetDetents().d();
        if (iD3 == 1) {
            behavior.Y(this.f7266p);
            return behavior;
        }
        if (iD3 == 2) {
            if (z10) {
                bottomSheetBehavior = behavior;
                L6.a.i(bottomSheetBehavior, 3, null, null, 6, null);
            } else {
                L6.a.i(behavior, null, null, null, 7, null);
                bottomSheetBehavior = behavior;
            }
            bottomSheetBehavior.Y(this.f7266p);
            return bottomSheetBehavior;
        }
        if (iD3 != 3) {
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.f7257g.getSheetDetents().d() + ". Expected at most 3.");
        }
        if (z10) {
            L6.a.g(behavior, 3, null, null, null, null, 30, null);
            bottomSheetBehavior2 = behavior;
        } else {
            bottomSheetBehavior2 = behavior;
            L6.a.g(bottomSheetBehavior2, null, null, null, null, null, 31, null);
        }
        bottomSheetBehavior2.Y(this.f7266p);
        return bottomSheetBehavior2;
    }

    public final Animator r(c sheetAnimationContext) {
        AbstractC2855l.g(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        g gVarB = sheetAnimationContext.b();
        X xC = sheetAnimationContext.c();
        ValueAnimator valueAnimatorP = p(0.0f, gVarB.e(), gVarB);
        AnimatorSet.Builder builderPlay = animatorSet.play(t());
        C2311y c2311y = this.f7257g;
        if (!gVarB.j(c2311y, c2311y.getSheetInitialDetentIndex())) {
            builderPlay = null;
        }
        if (builderPlay != null) {
            builderPlay.with(valueAnimatorP);
        }
        l(animatorSet, true, xC);
        return animatorSet;
    }

    public final Animator s(c sheetAnimationContext) {
        AbstractC2855l.g(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        CoordinatorLayout coordinatorLayoutA = sheetAnimationContext.a();
        g gVarB = sheetAnimationContext.b();
        X xC = sheetAnimationContext.c();
        ValueAnimator valueAnimatorP = p(gVarB.d().getAlpha(), 0.0f, gVarB);
        animatorSet.play(valueAnimatorP).with(x(coordinatorLayoutA));
        l(animatorSet, false, xC);
        return animatorSet;
    }
}
