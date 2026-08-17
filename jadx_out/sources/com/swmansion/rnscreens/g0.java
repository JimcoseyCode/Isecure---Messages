package com.swmansion.rnscreens;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.C2311y;
import i7.C2750m;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f25133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f25134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f25135d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f25132a = new g0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f25136e = new b();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25137a;

        static {
            int[] iArr = new int[C2311y.g.values().length];
            try {
                iArr[C2311y.g.f25460g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2311y.g.f25461h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2311y.g.f25462i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2311y.g.f25463j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C2311y.g.f25464k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f25137a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements androidx.core.view.I {
        b() {
        }

        @Override // androidx.core.view.I
        public L0 a(View v10, L0 insets) {
            AbstractC2855l.g(v10, "v");
            AbstractC2855l.g(insets, "insets");
            L0 l0W = AbstractC1658a0.W(v10, insets);
            AbstractC2855l.f(l0W, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                L0 l0R = l0W.r(l0W.k(), 0, l0W.l(), l0W.j());
                AbstractC2855l.f(l0R, "replaceSystemWindowInsets(...)");
                return l0R;
            }
            x0.e eVarF = l0W.f(L0.p.f());
            AbstractC2855l.f(eVarF, "getInsets(...)");
            L0 l0A = new L0.a().b(L0.p.f(), x0.e.c(eVarF.f33237a, 0, eVarF.f33239c, eVarF.f33240d)).a();
            AbstractC2855l.f(l0A, "build(...)");
            return l0A;
        }
    }

    private g0() {
    }

    private final boolean f(C2311y c2311y, C2311y.g gVar) {
        int i10 = a.f25137a[gVar.ordinal()];
        if (i10 == 1) {
            return c2311y.getScreenOrientation() != null;
        }
        if (i10 == 2) {
            return c2311y.getStatusBarStyle() != null;
        }
        if (i10 == 3) {
            return c2311y.r() != null;
        }
        if (i10 == 4) {
            return c2311y.q() != null;
        }
        if (i10 == 5) {
            return c2311y.p() != null;
        }
        throw new C2750m();
    }

    private final C2311y g(C2311y c2311y, C2311y.g gVar) {
        G fragmentWrapper;
        if (c2311y == null || (fragmentWrapper = c2311y.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            C2311y topScreen = ((A) it.next()).getTopScreen();
            g0 g0Var = f25132a;
            C2311y c2311yG = g0Var.g(topScreen, gVar);
            if (c2311yG != null) {
                return c2311yG;
            }
            if (topScreen != null && g0Var.f(topScreen, gVar)) {
                return topScreen;
            }
        }
        return null;
    }

    private final C2311y h(C2311y c2311y, C2311y.g gVar) {
        for (ViewParent container = c2311y.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C2311y) {
                C2311y c2311y2 = (C2311y) container;
                if (f(c2311y2, gVar)) {
                    return c2311y2;
                }
            }
        }
        return null;
    }

    private final C2311y i(C2311y c2311y, C2311y.g gVar) {
        C2311y c2311yG = g(c2311y, gVar);
        return c2311yG != null ? c2311yG : f(c2311y, gVar) ? c2311y : h(c2311y, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(boolean z10, l1 l1Var) {
        if (z10) {
            l1Var.b(L0.p.f());
        } else {
            l1Var.g(L0.p.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        new l1(activity.getWindow(), decorView).e(AbstractC2855l.b(str, "dark"));
    }

    public final void c() {
        f25135d = true;
    }

    public final void d() {
        f25133b = true;
    }

    public final void e() {
        f25134c = true;
    }

    public final void k(C2311y screen, Activity activity) {
        Boolean boolR;
        AbstractC2855l.g(screen, "screen");
        if (activity == null) {
            return;
        }
        C2311y c2311yI = i(screen, C2311y.g.f25462i);
        final boolean zBooleanValue = (c2311yI == null || (boolR = c2311yI.r()) == null) ? false : boolR.booleanValue();
        Window window = activity.getWindow();
        final l1 l1Var = new l1(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.j(zBooleanValue, l1Var);
            }
        });
    }

    public final void l(C2311y screen, Activity activity) {
        Boolean boolP;
        AbstractC2855l.g(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C2311y c2311yI = i(screen, C2311y.g.f25464k);
        if (!((c2311yI == null || (boolP = c2311yI.p()) == null) ? false : boolP.booleanValue())) {
            new l1(window, window.getDecorView()).g(L0.p.e());
            return;
        }
        l1 l1Var = new l1(window, window.getDecorView());
        l1Var.b(L0.p.e());
        l1Var.f(2);
    }

    public final void m(C2311y screen, Activity activity) {
        Integer screenOrientation;
        AbstractC2855l.g(screen, "screen");
        if (activity == null) {
            return;
        }
        C2311y c2311yI = i(screen, C2311y.g.f25460g);
        activity.setRequestedOrientation((c2311yI == null || (screenOrientation = c2311yI.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void o(C2311y screen, final Activity activity, ReactContext reactContext) {
        final String statusBarStyle;
        AbstractC2855l.g(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        C2311y c2311yI = i(screen, C2311y.g.f25461h);
        if (c2311yI == null || (statusBarStyle = c2311yI.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.n(activity, statusBarStyle);
            }
        });
    }

    public final void p(C2311y screen, Activity activity, ReactContext reactContext) {
        AbstractC2855l.g(screen, "screen");
        if (f25133b) {
            m(screen, activity);
        }
        if (f25134c) {
            o(screen, activity, reactContext);
            k(screen, activity);
        }
        if (f25135d) {
            l(screen, activity);
        }
    }
}
