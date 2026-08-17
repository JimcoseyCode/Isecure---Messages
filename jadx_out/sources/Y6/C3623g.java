package y6;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.K0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import i7.C2735B;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r6.AbstractC3277f;
import r6.h;
import r6.k;

/* JADX INFO: renamed from: y6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3623g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f33998e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f33999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UIManager f34000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s6.f f34001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f34002d;

    /* JADX INFO: renamed from: y6.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3623g(ReactApplicationContext mReactContext) {
        AbstractC2855l.g(mReactContext, "mReactContext");
        this.f33999a = mReactContext;
        this.f34000b = h.d(mReactContext);
        this.f34001c = new s6.f();
        this.f34002d = h.e(mReactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z10, C3623g c3623g, final View view, Activity activity, final boolean z11) {
        if (Build.VERSION.SDK_INT >= 30 && !z10) {
            c3623g.f34001c.x(view, new Function1() { // from class: y6.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3623g.i(view, z11, (K0) obj);
                }
            });
            return;
        }
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        k(z11, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B i(final View view, final boolean z10, K0 insetsController) {
        AbstractC2855l.g(insetsController, "insetsController");
        insetsController.a(false);
        view.post(new Runnable() { // from class: y6.f
            @Override // java.lang.Runnable
            public final void run() {
                C3623g.j(z10, view);
            }
        });
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(boolean z10, View view) {
        k(z10, view);
    }

    private static final void k(boolean z10, View view) {
        if (z10) {
            return;
        }
        view.clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p() {
        A6.a.f86a.a();
    }

    private final void r(final int i10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: y6.d
            @Override // java.lang.Runnable
            public final void run() {
                C3623g.s(this.f33992g, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C3623g c3623g, int i10) {
        Activity currentActivity;
        Window window;
        if (h.e(c3623g.f33999a) == i10 || (currentActivity = c3623g.f33999a.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(C3623g c3623g, double d10, Promise promise) {
        UIManager uIManager = c3623g.f34000b;
        View viewResolveView = uIManager != null ? uIManager.resolveView((int) d10) : null;
        if (viewResolveView == null) {
            promise.reject("E_VIEW_NOT_FOUND", "Could not find view for tag");
            return;
        }
        int[] iArrB = k.b(viewResolveView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", AbstractC3277f.a(iArrB[0]));
        writableMapCreateMap.putDouble("y", AbstractC3277f.a(iArrB[1]));
        writableMapCreateMap.putDouble("width", AbstractC3277f.a(viewResolveView.getWidth()));
        writableMapCreateMap.putDouble("height", AbstractC3277f.a(viewResolveView.getHeight()));
        promise.resolve(writableMapCreateMap);
    }

    public final void g(final boolean z10, final boolean z11) {
        final Activity currentActivity = this.f33999a.getCurrentActivity();
        final EditText editTextB = A6.a.f86a.b();
        if (editTextB != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: y6.a
                @Override // java.lang.Runnable
                public final void run() {
                    C3623g.h(z11, this, editTextB, currentActivity, z10);
                }
            });
        }
    }

    public final Map l() {
        return K.m(t.a("keyboardBorderRadius", 0));
    }

    public final void n() {
        r(this.f34002d);
    }

    public final void o(String direction) {
        AbstractC2855l.g(direction, "direction");
        if (AbstractC2855l.b(direction, "current")) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: y6.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3623g.p();
                }
            });
            return;
        }
        EditText editTextB = A6.a.f86a.b();
        if (editTextB != null) {
            A6.c.f89a.k(direction, editTextB);
        }
    }

    public final void q(int i10) {
        r(i10);
    }

    public final void t(final double d10, final Promise promise) {
        AbstractC2855l.g(promise, "promise");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: y6.b
            @Override // java.lang.Runnable
            public final void run() {
                C3623g.u(this.f33989g, d10, promise);
            }
        });
    }

    public final void m() {
    }
}
