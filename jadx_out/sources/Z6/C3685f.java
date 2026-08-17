package z6;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v6.C3429a;

/* JADX INFO: renamed from: z6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3685f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34275e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f34276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3687h f34277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1 f34278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f34279d;

    /* JADX INFO: renamed from: z6.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3685f(ReactApplicationContext mReactContext) {
        AbstractC2855l.g(mReactContext, "mReactContext");
        this.f34276a = mReactContext;
        this.f34277b = new C3687h(mReactContext);
        this.f34279d = new WeakReference(null);
    }

    private final l1 g() {
        Activity currentActivity = this.f34276a.getCurrentActivity();
        if (this.f34278c == null || !AbstractC2855l.b(currentActivity, this.f34279d.get())) {
            if (currentActivity == null) {
                C3429a.d(C3429a.f32948a, AbstractC3686g.f34280a, "StatusBarManagerCompatModule: can not get `WindowInsetsControllerCompat` because current activity is null.", null, 4, null);
                return this.f34278c;
            }
            Window window = currentActivity.getWindow();
            this.f34279d = new WeakReference(currentActivity);
            this.f34278c = new l1(window, window.getDecorView());
        }
        return this.f34278c;
    }

    private final boolean h() {
        B6.d dVarR = r();
        if (dVarR != null) {
            return dVarR.getActive();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Activity activity, boolean z10, int i10) {
        final Window window = activity.getWindow();
        if (!z10) {
            window.setStatusBarColor(i10);
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i10));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z6.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3685f.k(window, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Window window, ValueAnimator animator) {
        AbstractC2855l.g(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        AbstractC2855l.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(boolean z10, C3685f c3685f) {
        if (z10) {
            l1 l1VarG = c3685f.g();
            if (l1VarG != null) {
                l1VarG.b(L0.p.f());
                return;
            }
            return;
        }
        l1 l1VarG2 = c3685f.g();
        if (l1VarG2 != null) {
            l1VarG2.g(L0.p.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C3685f c3685f, String str) {
        l1 l1VarG = c3685f.g();
        if (l1VarG != null) {
            l1VarG.e(AbstractC2855l.b(str, "dark-content"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(C3685f c3685f, boolean z10) {
        B6.d dVarR = c3685f.r();
        if (dVarR != null) {
            dVarR.j(z10);
        }
    }

    private final B6.d r() {
        return B6.f.f379a.a();
    }

    public final Map f() {
        return this.f34277b.a();
    }

    public final void i(final int i10, final boolean z10) {
        if (!h()) {
            this.f34277b.b(i10, z10);
            return;
        }
        final Activity currentActivity = this.f34276a.getCurrentActivity();
        if (currentActivity == null) {
            C3429a.d(C3429a.f32948a, AbstractC3686g.f34280a, "StatusBarManagerCompatModule: Ignored status bar change, current activity is null.", null, 4, null);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: z6.d
                @Override // java.lang.Runnable
                public final void run() {
                    C3685f.j(currentActivity, z10, i10);
                }
            });
        }
    }

    public final void l(final boolean z10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: z6.a
            @Override // java.lang.Runnable
            public final void run() {
                C3685f.m(z10, this);
            }
        });
    }

    public final void n(final String style) {
        AbstractC2855l.g(style, "style");
        if (h()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: z6.b
                @Override // java.lang.Runnable
                public final void run() {
                    C3685f.o(this.f34267g, style);
                }
            });
        } else {
            this.f34277b.c(style);
        }
    }

    public final void p(final boolean z10) {
        if (h()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: z6.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3685f.q(this.f34269g, z10);
                }
            });
        } else {
            this.f34277b.d(z10);
        }
    }
}
