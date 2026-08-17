package J6;

import J6.AbstractC1274d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import j7.AbstractC2800q;
import j7.J;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC1274d {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final a f6668Y = new a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f6669O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final float f6670P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f6671Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f6672R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f6673S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f6674T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f6675U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f6676V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Handler f6677W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f6678X;

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
        public static final a f6679d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6680b = o.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6681c = "LongPressGestureHandler";

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
            return this.f6681c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6680b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public o a(Context context) {
            AbstractC2855l.d(context);
            return new o(context);
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.d c(o handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.d(handler);
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(o handler, ReadableMap config) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(config, "config");
            super.f(handler, config);
            if (config.hasKey("minDurationMs")) {
                handler.a1(config.getInt("minDurationMs"));
            }
            if (config.hasKey("maxDist")) {
                handler.f6671Q = PixelUtil.toPixelFromDIP(config.getDouble("maxDist"));
            }
            if (config.hasKey("numberOfPointers")) {
                handler.D0(config.getInt("numberOfPointers"));
            }
        }
    }

    public o(Context context) {
        AbstractC2855l.g(context, "context");
        this.f6669O = 500L;
        G0(true);
        float f10 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.f6670P = f10;
        this.f6671Q = f10;
        this.f6672R = 1;
    }

    private final Pair W0(MotionEvent motionEvent, boolean z10) {
        if (z10) {
            int pointerCount = motionEvent.getPointerCount();
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (i10 != motionEvent.getActionIndex()) {
                    x10 += motionEvent.getX(i10);
                    y10 += motionEvent.getY(i10);
                }
            }
            return new Pair(Float.valueOf(x10 / (motionEvent.getPointerCount() - 1)), Float.valueOf(y10 / (motionEvent.getPointerCount() - 1)));
        }
        B7.c cVarP = B7.d.p(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(cVarP, 10));
        Iterator it = cVarP.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(motionEvent.getX(((J) it).nextInt())));
        }
        float fW = (float) AbstractC2800q.W(arrayList);
        B7.c cVarP2 = B7.d.p(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(cVarP2, 10));
        Iterator it2 = cVarP2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((J) it2).nextInt())));
        }
        return new Pair(Float.valueOf(fW), Float.valueOf((float) AbstractC2800q.W(arrayList2)));
    }

    static /* synthetic */ Pair X0(o oVar, MotionEvent motionEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return oVar.W0(motionEvent, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(o oVar) {
        oVar.k();
    }

    public final int Y0() {
        return (int) (this.f6676V - this.f6675U);
    }

    public final void a1(long j10) {
        this.f6669O = j10;
    }

    @Override // J6.AbstractC1274d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (S() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.f6676V = jUptimeMillis;
                this.f6675U = jUptimeMillis;
                p();
                Pair pairX0 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue = ((Number) pairX0.getFirst()).floatValue();
                float fFloatValue2 = ((Number) pairX0.getSecond()).floatValue();
                this.f6673S = fFloatValue;
                this.f6674T = fFloatValue2;
                this.f6678X++;
            }
            if (sourceEvent.getActionMasked() == 5) {
                this.f6678X++;
                Pair pairX02 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue3 = ((Number) pairX02.getFirst()).floatValue();
                float fFloatValue4 = ((Number) pairX02.getSecond()).floatValue();
                this.f6673S = fFloatValue3;
                this.f6674T = fFloatValue4;
                if (this.f6678X > this.f6672R) {
                    D();
                    this.f6678X = 0;
                }
            }
            if (S() == 2 && this.f6678X == this.f6672R && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f6677W = handler;
                long j10 = this.f6669O;
                if (j10 > 0) {
                    AbstractC2855l.d(handler);
                    handler.postDelayed(new Runnable() { // from class: J6.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.Z0(this.f6667g);
                        }
                    }, this.f6669O);
                } else if (j10 == 0) {
                    k();
                }
            }
            if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
                this.f6678X--;
                Handler handler2 = this.f6677W;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.f6677W = null;
                }
                if (S() == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (sourceEvent.getActionMasked() == 6) {
                int i10 = this.f6678X - 1;
                this.f6678X = i10;
                if (i10 < this.f6672R && S() != 4) {
                    D();
                    this.f6678X = 0;
                    return;
                }
                Pair pairW0 = W0(sourceEvent, true);
                float fFloatValue5 = ((Number) pairW0.getFirst()).floatValue();
                float fFloatValue6 = ((Number) pairW0.getSecond()).floatValue();
                this.f6673S = fFloatValue5;
                this.f6674T = fFloatValue6;
                return;
            }
            Pair pairX03 = X0(this, sourceEvent, false, 2, null);
            float fFloatValue7 = ((Number) pairX03.getFirst()).floatValue();
            float fFloatValue8 = ((Number) pairX03.getSecond()).floatValue();
            float f10 = fFloatValue7 - this.f6673S;
            float f11 = fFloatValue8 - this.f6674T;
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f6671Q;
            if (f12 > f13 * f13) {
                if (S() == 4) {
                    q();
                } else {
                    D();
                }
            }
        }
    }

    @Override // J6.AbstractC1274d
    protected void o0() {
        super.o0();
        this.f6678X = 0;
    }

    @Override // J6.AbstractC1274d
    protected void p0(int i10, int i11) {
        Handler handler = this.f6677W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f6677W = null;
        }
    }

    @Override // J6.AbstractC1274d
    public void s0() {
        super.s0();
        this.f6669O = 500L;
        this.f6671Q = this.f6670P;
        G0(true);
    }

    @Override // J6.AbstractC1274d
    public void v(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        this.f6676V = SystemClock.uptimeMillis();
        super.v(event);
    }

    @Override // J6.AbstractC1274d
    public void w(int i10, int i11) {
        this.f6676V = SystemClock.uptimeMillis();
        super.w(i10, i11);
    }
}
