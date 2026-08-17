package J6;

import J6.AbstractC1274d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC1274d {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a f6700r0 = new a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f6701O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f6702P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final float f6703Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f6704R;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f6718f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f6719g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f6720h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f6721i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f6722j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f6723k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private VelocityTracker f6724l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f6725m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private long f6726n0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Handler f6728p0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f6705S = Float.MAX_VALUE;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f6706T = Float.MIN_VALUE;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f6707U = Float.MIN_VALUE;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f6708V = Float.MAX_VALUE;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f6709W = Float.MAX_VALUE;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f6710X = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f6711Y = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f6712Z = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f6713a0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f6714b0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f6715c0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f6716d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f6717e0 = 10;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Runnable f6727o0 = new Runnable() { // from class: J6.s
        @Override // java.lang.Runnable
        public final void run() {
            t.l1(this.f6699g);
        }
    };

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private z f6729q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            AbstractC2855l.d(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC1274d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6730d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6731b = t.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6732c = "PanGestureHandler";

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // J6.AbstractC1274d.c
        public String d() {
            return this.f6732c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6731b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public t a(Context context) {
            return new t(context);
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.g c(t handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.g(handler);
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(t handler, ReadableMap config) {
            boolean z10;
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(config, "config");
            super.f(handler, config);
            boolean z11 = true;
            if (config.hasKey("activeOffsetXStart")) {
                handler.f6705S = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetXStart"));
                z10 = true;
            } else {
                z10 = false;
            }
            if (config.hasKey("activeOffsetXEnd")) {
                handler.f6706T = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXStart")) {
                handler.f6707U = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetXStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXEnd")) {
                handler.f6708V = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYStart")) {
                handler.f6709W = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYEnd")) {
                handler.f6710X = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYStart")) {
                handler.f6711Y = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYEnd")) {
                handler.f6712Z = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("minVelocity")) {
                handler.f6715c0 = PixelUtil.toPixelFromDIP(config.getDouble("minVelocity"));
                z10 = true;
            }
            if (config.hasKey("minVelocityX")) {
                handler.f6713a0 = PixelUtil.toPixelFromDIP(config.getDouble("minVelocityX"));
                z10 = true;
            }
            if (config.hasKey("minVelocityY")) {
                handler.f6714b0 = PixelUtil.toPixelFromDIP(config.getDouble("minVelocityY"));
            } else {
                z11 = z10;
            }
            if (config.hasKey("minDist")) {
                handler.f6704R = PixelUtil.toPixelFromDIP(config.getDouble("minDist"));
            } else if (z11) {
                handler.f6704R = Float.MAX_VALUE;
            }
            if (config.hasKey("minPointers")) {
                handler.f6716d0 = config.getInt("minPointers");
            }
            if (config.hasKey("maxPointers")) {
                handler.f6717e0 = config.getInt("maxPointers");
            }
            if (config.hasKey("avgTouches")) {
                handler.f6725m0 = config.getBoolean("avgTouches");
            }
            if (config.hasKey("activateAfterLongPress")) {
                handler.f6726n0 = config.getInt("activateAfterLongPress");
            }
        }
    }

    public t(Context context) {
        this.f6704R = Float.MIN_VALUE;
        AbstractC2855l.d(context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6703Q = scaledTouchSlop;
        this.f6704R = scaledTouchSlop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(t tVar) {
        tVar.k();
    }

    private final boolean r1() {
        float f10 = (this.f6722j0 - this.f6718f0) + this.f6720h0;
        float f11 = this.f6705S;
        if (f11 != Float.MAX_VALUE && f10 < f11) {
            return true;
        }
        float f12 = this.f6706T;
        if (f12 != Float.MIN_VALUE && f10 > f12) {
            return true;
        }
        float f13 = (this.f6723k0 - this.f6719g0) + this.f6721i0;
        float f14 = this.f6709W;
        if (f14 != Float.MAX_VALUE && f13 < f14) {
            return true;
        }
        float f15 = this.f6710X;
        if (f15 != Float.MIN_VALUE && f13 > f15) {
            return true;
        }
        float f16 = (f10 * f10) + (f13 * f13);
        float f17 = this.f6704R;
        if (f17 != Float.MAX_VALUE && f16 >= f17 * f17) {
            return true;
        }
        float f18 = this.f6701O;
        float f19 = this.f6713a0;
        if (f19 != Float.MAX_VALUE && ((f19 < 0.0f && f18 <= f19) || (0.0f <= f19 && f19 <= f18))) {
            return true;
        }
        float f20 = this.f6702P;
        float f21 = this.f6714b0;
        if (f21 != Float.MAX_VALUE && ((f21 < 0.0f && f18 <= f21) || (0.0f <= f21 && f21 <= f18))) {
            return true;
        }
        float f22 = (f18 * f18) + (f20 * f20);
        float f23 = this.f6715c0;
        return f23 != Float.MAX_VALUE && f22 >= f23 * f23;
    }

    private final boolean s1() {
        float f10 = (this.f6722j0 - this.f6718f0) + this.f6720h0;
        float f11 = (this.f6723k0 - this.f6719g0) + this.f6721i0;
        if (this.f6726n0 > 0) {
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f6703Q;
            if (f12 > f13 * f13) {
                Handler handler = this.f6728p0;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                return true;
            }
        }
        float f14 = this.f6707U;
        if (f14 != Float.MIN_VALUE && f10 < f14) {
            return true;
        }
        float f15 = this.f6708V;
        if (f15 != Float.MAX_VALUE && f10 > f15) {
            return true;
        }
        float f16 = this.f6711Y;
        if (f16 != Float.MIN_VALUE && f11 < f16) {
            return true;
        }
        float f17 = this.f6712Z;
        return f17 != Float.MAX_VALUE && f11 > f17;
    }

    @Override // J6.AbstractC1274d
    protected void j0() {
        Handler handler = this.f6728p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // J6.AbstractC1274d
    public void l(boolean z10) {
        if (S() != 4) {
            t0();
        }
        super.l(z10);
    }

    @Override // J6.AbstractC1274d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (event.getToolType(0) == 2) {
                this.f6729q0 = z.f6795f.a(event);
            }
            int iS = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.f6720h0 += this.f6722j0 - this.f6718f0;
                this.f6721i0 += this.f6723k0 - this.f6719g0;
                k kVar = k.f6658a;
                this.f6722j0 = kVar.b(sourceEvent, this.f6725m0);
                float fC = kVar.c(sourceEvent, this.f6725m0);
                this.f6723k0 = fC;
                this.f6718f0 = this.f6722j0;
                this.f6719g0 = fC;
            } else {
                k kVar2 = k.f6658a;
                this.f6722j0 = kVar2.b(sourceEvent, this.f6725m0);
                this.f6723k0 = kVar2.c(sourceEvent, this.f6725m0);
            }
            if (iS != 0 || sourceEvent.getPointerCount() < this.f6716d0) {
                VelocityTracker velocityTracker = this.f6724l0;
                if (velocityTracker != null) {
                    f6700r0.b(velocityTracker, sourceEvent);
                    VelocityTracker velocityTracker2 = this.f6724l0;
                    AbstractC2855l.d(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(ProgressBarContainerView.MAX_PROGRESS);
                    VelocityTracker velocityTracker3 = this.f6724l0;
                    AbstractC2855l.d(velocityTracker3);
                    this.f6701O = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f6724l0;
                    AbstractC2855l.d(velocityTracker4);
                    this.f6702P = velocityTracker4.getYVelocity();
                }
            } else {
                t0();
                this.f6720h0 = 0.0f;
                this.f6721i0 = 0.0f;
                this.f6701O = 0.0f;
                this.f6702P = 0.0f;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f6724l0 = velocityTrackerObtain;
                f6700r0.b(velocityTrackerObtain, sourceEvent);
                p();
                if (this.f6726n0 > 0) {
                    if (this.f6728p0 == null) {
                        this.f6728p0 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.f6728p0;
                    AbstractC2855l.d(handler);
                    handler.postDelayed(this.f6727o0, this.f6726n0);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (iS == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 5 && sourceEvent.getPointerCount() > this.f6717e0) {
                if (iS == 4) {
                    q();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 6 && iS == 4 && sourceEvent.getPointerCount() < this.f6716d0) {
                D();
                return;
            }
            if (iS == 2) {
                if (s1()) {
                    D();
                } else if (r1()) {
                    k();
                }
            }
        }
    }

    public final z m1() {
        return this.f6729q0;
    }

    public final float n1() {
        return (this.f6722j0 - this.f6718f0) + this.f6720h0;
    }

    @Override // J6.AbstractC1274d
    protected void o0() {
        Handler handler = this.f6728p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f6724l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6724l0 = null;
        }
        this.f6729q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public final float o1() {
        return (this.f6723k0 - this.f6719g0) + this.f6721i0;
    }

    public final float p1() {
        return this.f6701O;
    }

    public final float q1() {
        return this.f6702P;
    }

    @Override // J6.AbstractC1274d
    public void s0() {
        super.s0();
        this.f6705S = Float.MAX_VALUE;
        this.f6706T = Float.MIN_VALUE;
        this.f6707U = Float.MIN_VALUE;
        this.f6708V = Float.MAX_VALUE;
        this.f6709W = Float.MAX_VALUE;
        this.f6710X = Float.MIN_VALUE;
        this.f6711Y = Float.MIN_VALUE;
        this.f6712Z = Float.MAX_VALUE;
        this.f6713a0 = Float.MAX_VALUE;
        this.f6714b0 = Float.MAX_VALUE;
        this.f6715c0 = Float.MAX_VALUE;
        this.f6704R = this.f6703Q;
        this.f6716d0 = 1;
        this.f6717e0 = 10;
        this.f6726n0 = 0L;
        this.f6725m0 = false;
    }

    @Override // J6.AbstractC1274d
    public void t0() {
        this.f6718f0 = this.f6722j0;
        this.f6719g0 = this.f6723k0;
    }
}
