package Z6;

import android.app.Activity;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import androidx.core.view.AbstractC1688p0;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ReactConstants;
import d2.AbstractC2325a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f13617a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f13618b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f13619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f13620d;

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Activity activity) {
        Window window = activity.getWindow();
        f fVar = f13617a;
        AbstractC2855l.d(window);
        l1 l1VarH = fVar.h(window);
        AbstractC1688p0.c(window, false);
        window.setStatusBarColor(0);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 27 || !fVar.j(activity)) {
            boolean zI = fVar.i(activity);
            window.setNavigationBarColor(i10 >= 29 ? 0 : (i10 < 27 || !zI) ? g.a() : g.b());
            if (i10 < 27) {
                zI = false;
            }
            l1VarH.d(zI);
            if (i10 >= 29) {
                window.setStatusBarContrastEnforced(false);
                window.setNavigationBarContrastEnforced(true);
            }
        } else {
            window.setNavigationBarColor(0);
            if (i10 >= 29) {
                window.setStatusBarContrastEnforced(false);
                window.setNavigationBarContrastEnforced(false);
            }
        }
        if (i10 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i10 >= 30 ? 3 : 1;
        }
    }

    private final l1 h(Window window) {
        l1 l1Var = new l1(window, window.getDecorView());
        l1Var.f(2);
        if (f13619c) {
            l1Var.b(L0.p.f());
        } else {
            l1Var.g(L0.p.f());
        }
        if (f13620d) {
            l1Var.b(L0.p.e());
            return l1Var;
        }
        l1Var.g(L0.p.e());
        return l1Var;
    }

    private final boolean i(Activity activity) {
        return k(activity, j.f13624b) || (activity.getWindow().getDecorView().getResources().getConfiguration().uiMode & 48) != 32;
    }

    private final boolean j(Activity activity) {
        return !k(activity, j.f13623a);
    }

    private final boolean k(Activity activity, int i10) {
        Map map = f13618b;
        Integer numValueOf = Integer.valueOf(i10);
        Object objValueOf = map.get(numValueOf);
        if (objValueOf == null) {
            TypedValue typedValue = new TypedValue();
            objValueOf = Boolean.valueOf(activity.getTheme().resolveAttribute(i10, typedValue, true) && typedValue.data != 0);
            map.put(numValueOf, objValueOf);
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Activity activity) {
        f fVar = f13617a;
        Window window = activity.getWindow();
        AbstractC2855l.f(window, "getWindow(...)");
        fVar.h(window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Activity activity, String str) {
        f fVar = f13617a;
        Window window = activity.getWindow();
        AbstractC2855l.f(window, "getWindow(...)");
        fVar.h(window).d(AbstractC2855l.b(str, "light-content") ? false : AbstractC2855l.b(str, "dark-content") ? true : fVar.i(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Activity activity) {
        f fVar = f13617a;
        Window window = activity.getWindow();
        AbstractC2855l.f(window, "getWindow(...)");
        fVar.h(window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Activity activity, String str) {
        f fVar = f13617a;
        Window window = activity.getWindow();
        AbstractC2855l.f(window, "getWindow(...)");
        fVar.h(window).e(AbstractC2855l.b(str, "light-content") ? false : AbstractC2855l.b(str, "dark-content") ? true : fVar.i(activity));
    }

    public final void f(ReactApplicationContext reactApplicationContext) {
        final Activity currentActivity;
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC2325a.I(ReactConstants.TAG, "RNEdgeToEdge: Ignored, current activity is null.");
        } else {
            currentActivity.runOnUiThread(new Runnable() { // from class: Z6.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.g(currentActivity);
                }
            });
        }
    }

    public final void l(ReactApplicationContext reactApplicationContext, boolean z10) {
        final Activity currentActivity;
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC2325a.I(ReactConstants.TAG, "RNEdgeToEdge: Ignored system bars change, current activity is null.");
        } else {
            f13620d = z10;
            currentActivity.runOnUiThread(new Runnable() { // from class: Z6.a
                @Override // java.lang.Runnable
                public final void run() {
                    f.m(currentActivity);
                }
            });
        }
    }

    public final void n(ReactApplicationContext reactApplicationContext, final String style) {
        final Activity currentActivity;
        AbstractC2855l.g(style, "style");
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC2325a.I(ReactConstants.TAG, "RNEdgeToEdge: Ignored system bars change, current activity is null.");
        } else {
            if (Build.VERSION.SDK_INT < 27 || !j(currentActivity)) {
                return;
            }
            currentActivity.runOnUiThread(new Runnable() { // from class: Z6.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.o(currentActivity, style);
                }
            });
        }
    }

    public final void p(ReactApplicationContext reactApplicationContext, boolean z10) {
        final Activity currentActivity;
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC2325a.I(ReactConstants.TAG, "RNEdgeToEdge: Ignored system bars change, current activity is null.");
        } else {
            f13619c = z10;
            currentActivity.runOnUiThread(new Runnable() { // from class: Z6.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.q(currentActivity);
                }
            });
        }
    }

    public final void r(ReactApplicationContext reactApplicationContext, final String style) {
        final Activity currentActivity;
        AbstractC2855l.g(style, "style");
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC2325a.I(ReactConstants.TAG, "RNEdgeToEdge: Ignored system bars change, current activity is null.");
        } else {
            currentActivity.runOnUiThread(new Runnable() { // from class: Z6.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.s(currentActivity, style);
                }
            });
        }
    }
}
