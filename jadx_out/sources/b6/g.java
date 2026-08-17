package B6;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r6.AbstractC3277f;
import r6.k;
import t6.C3373c;
import t6.InterfaceC3371a;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends ReactViewGroup {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f381t = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC3371a f389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final s6.f f393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private VelocityTracker f394s;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f382g = reactContext;
        this.f389n = new C3373c();
        this.f391p = true;
        this.f392q = new Rect();
        this.f393r = new s6.f();
    }

    private final void c() {
        this.f393r.n();
        g();
    }

    private final void d(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f394s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        this.f384i = motionEvent.getX();
        this.f385j = motionEvent.getY();
        k.a(this, this.f392q);
        this.f386k = this.f392q.top;
    }

    private final void e(MotionEvent motionEvent) {
        k.a(this, this.f392q);
        int i10 = this.f392q.top - this.f386k;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, i10);
        VelocityTracker velocityTracker = this.f394s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEventObtain);
        }
        float x10 = motionEventObtain.getX() - this.f384i;
        float y10 = motionEventObtain.getY() - this.f385j;
        boolean z10 = false;
        if (!this.f383h) {
            this.f383h = Math.abs(y10) > Math.abs(x10) && Math.abs(y10) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
        }
        if (this.f383h) {
            if (this.f393r.t()) {
                if (this.f387l == 0) {
                    this.f387l = this.f393r.q();
                }
                int iA = this.f389n.a(AbstractC3624a.c(y10), getWindowHeight() - ((int) motionEvent.getRawY()), this.f393r.q(), this.f388m);
                if (iA != 0) {
                    this.f393r.r(iA);
                }
            } else if (!this.f393r.u()) {
                L0 l0F = AbstractC1658a0.F(this);
                if (l0F != null && l0F.q(L0.p.b())) {
                    z10 = true;
                }
                if (h(y10, z10)) {
                    s6.f.y(this.f393r, this, null, 2, null);
                }
            }
            this.f385j = motionEvent.getY();
            this.f384i = motionEvent.getX();
            this.f386k = this.f392q.top;
        }
    }

    private final void f(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f394s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        VelocityTracker velocityTracker2 = this.f394s;
        if (velocityTracker2 != null) {
            velocityTracker2.computeCurrentVelocity(500);
        }
        VelocityTracker velocityTracker3 = this.f394s;
        this.f393r.l((this.f393r.t() && this.f387l == this.f393r.q()) ? null : velocityTracker3 != null ? Float.valueOf(velocityTracker3.getYVelocity()) : null);
        g();
    }

    private final void g() {
        this.f383h = false;
        this.f384i = 0.0f;
        this.f385j = 0.0f;
        this.f386k = 0;
        this.f387l = 0;
        this.f392q.setEmpty();
        VelocityTracker velocityTracker = this.f394s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f394s = null;
    }

    private final int getWindowHeight() {
        Rect bounds;
        WindowManager windowManager;
        if (Build.VERSION.SDK_INT >= 30) {
            Activity currentActivity = this.f382g.getCurrentActivity();
            WindowMetrics currentWindowMetrics = (currentActivity == null || (windowManager = currentActivity.getWindowManager()) == null) ? null : windowManager.getCurrentWindowMetrics();
            if (currentWindowMetrics != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return bounds.height();
            }
        }
        return 0;
    }

    private final boolean h(float f10, boolean z10) {
        return f10 < 0.0f ? !z10 && this.f390o : f10 > 0.0f && z10 && this.f391p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f394s == null) {
            this.f394s = VelocityTracker.obtain();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            d(motionEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            e(motionEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            f(motionEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setInterpolator(String interpolator) {
        AbstractC2855l.g(interpolator, "interpolator");
        InterfaceC3371a c3373c = (InterfaceC3371a) h.a().get(interpolator);
        if (c3373c == null) {
            c3373c = new C3373c();
        }
        this.f389n = c3373c;
    }

    public final void setOffset(double d10) {
        this.f388m = (int) AbstractC3277f.b((float) d10);
    }

    public final void setScrollKeyboardOffScreenWhenVisible(boolean z10) {
        this.f391p = z10;
    }

    public final void setScrollKeyboardOnScreenWhenNotVisible(boolean z10) {
        this.f390o = z10;
    }
}
