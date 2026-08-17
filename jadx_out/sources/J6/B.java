package J6;

import J6.AbstractC1274d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC1274d {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final a f6539f0 = new a(null);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f6548W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f6549X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f6550Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f6551Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f6552a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f6553b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Handler f6554c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f6555d0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f6540O = Float.MIN_VALUE;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f6541P = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f6542Q = Float.MIN_VALUE;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f6543R = 500;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f6544S = 200;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f6545T = 1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f6546U = 1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f6547V = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f6556e0 = new Runnable() { // from class: J6.A
        @Override // java.lang.Runnable
        public final void run() {
            B.d1(this.f6538g);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC1274d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6557d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6558b = B.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6559c = "TapGestureHandler";

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
            return this.f6559c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6558b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public B a(Context context) {
            return new B();
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.j c(B handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.j(handler);
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(B handler, ReadableMap config) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfTaps")) {
                handler.f6545T = config.getInt("numberOfTaps");
            }
            if (config.hasKey("maxDurationMs")) {
                handler.f6543R = config.getInt("maxDurationMs");
            }
            if (config.hasKey("maxDelayMs")) {
                handler.f6544S = config.getInt("maxDelayMs");
            }
            if (config.hasKey("maxDeltaX")) {
                handler.f6540O = PixelUtil.toPixelFromDIP(config.getDouble("maxDeltaX"));
            }
            if (config.hasKey("maxDeltaY")) {
                handler.f6541P = PixelUtil.toPixelFromDIP(config.getDouble("maxDeltaY"));
            }
            if (config.hasKey("maxDist")) {
                handler.f6542Q = PixelUtil.toPixelFromDIP(config.getDouble("maxDist"));
            }
            if (config.hasKey("minPointers")) {
                handler.f6546U = config.getInt("minPointers");
            }
        }
    }

    public B() {
        G0(true);
    }

    private final void c1() {
        Handler handler = this.f6554c0;
        if (handler == null) {
            this.f6554c0 = new Handler(Looper.getMainLooper());
        } else {
            AbstractC2855l.d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i10 = this.f6555d0 + 1;
        this.f6555d0 = i10;
        if (i10 == this.f6545T && this.f6547V >= this.f6546U) {
            k();
            return;
        }
        Handler handler2 = this.f6554c0;
        AbstractC2855l.d(handler2);
        handler2.postDelayed(this.f6556e0, this.f6544S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(B b10) {
        b10.D();
    }

    private final boolean e1() {
        float f10 = (this.f6552a0 - this.f6548W) + this.f6550Y;
        if (this.f6540O != Float.MIN_VALUE && Math.abs(f10) > this.f6540O) {
            return true;
        }
        float f11 = (this.f6553b0 - this.f6549X) + this.f6551Z;
        if (this.f6541P != Float.MIN_VALUE && Math.abs(f11) > this.f6541P) {
            return true;
        }
        float f12 = (f11 * f11) + (f10 * f10);
        float f13 = this.f6542Q;
        return f13 != Float.MIN_VALUE && f12 > f13 * f13;
    }

    private final void f1() {
        Handler handler = this.f6554c0;
        if (handler == null) {
            this.f6554c0 = new Handler(Looper.getMainLooper());
        } else {
            AbstractC2855l.d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f6554c0;
        AbstractC2855l.d(handler2);
        handler2.postDelayed(this.f6556e0, this.f6543R);
    }

    @Override // J6.AbstractC1274d
    protected void j0() {
        Handler handler = this.f6554c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // J6.AbstractC1274d
    public void l(boolean z10) {
        super.l(z10);
        B();
    }

    @Override // J6.AbstractC1274d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            int iS = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (iS == 0) {
                this.f6550Y = 0.0f;
                this.f6551Z = 0.0f;
                k kVar = k.f6658a;
                this.f6548W = kVar.b(sourceEvent, true);
                this.f6549X = kVar.c(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f6550Y += this.f6552a0 - this.f6548W;
                this.f6551Z += this.f6553b0 - this.f6549X;
                k kVar2 = k.f6658a;
                this.f6552a0 = kVar2.b(sourceEvent, true);
                float fC = kVar2.c(sourceEvent, true);
                this.f6553b0 = fC;
                this.f6548W = this.f6552a0;
                this.f6549X = fC;
            } else {
                k kVar3 = k.f6658a;
                this.f6552a0 = kVar3.b(sourceEvent, true);
                this.f6553b0 = kVar3.c(sourceEvent, true);
            }
            if (this.f6547V < sourceEvent.getPointerCount()) {
                this.f6547V = sourceEvent.getPointerCount();
            }
            if (e1()) {
                D();
                return;
            }
            if (iS == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    p();
                }
                f1();
                return;
            }
            if (iS == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    c1();
                    return;
                }
                f1();
            }
        }
    }

    @Override // J6.AbstractC1274d
    protected void o0() {
        this.f6555d0 = 0;
        this.f6547V = 0;
        Handler handler = this.f6554c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // J6.AbstractC1274d
    public void s0() {
        super.s0();
        this.f6540O = Float.MIN_VALUE;
        this.f6541P = Float.MIN_VALUE;
        this.f6542Q = Float.MIN_VALUE;
        this.f6543R = 500L;
        this.f6544S = 200L;
        this.f6545T = 1;
        this.f6546U = 1;
        G0(true);
    }
}
