package J6;

import J6.AbstractC1274d;
import J6.C;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: J6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1272b extends AbstractC1274d {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final a f6576W = new a(null);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final double f6577X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final double f6578Y;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Handler f6583S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f6584T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private VelocityTracker f6586V;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f6579O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f6580P = 1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final long f6581Q = 800;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final long f6582R = 2000;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Runnable f6585U = new Runnable() { // from class: J6.a
        @Override // java.lang.Runnable
        public final void run() {
            C1272b.X0(this.f6575g);
        }
    };

    /* JADX INFO: renamed from: J6.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: J6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0059b extends AbstractC1274d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6587d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6588b = C1272b.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6589c = "FlingGestureHandler";

        /* JADX INFO: renamed from: J6.b$b$a */
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
            return this.f6589c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6588b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1272b a(Context context) {
            return new C1272b();
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.a c(C1272b handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.a(handler);
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(C1272b handler, ReadableMap config) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfPointers")) {
                handler.Z0(config.getInt("numberOfPointers"));
            }
            if (config.hasKey("direction")) {
                handler.Y0(config.getInt("direction"));
            }
        }
    }

    static {
        k kVar = k.f6658a;
        f6577X = kVar.a(30.0d);
        f6578Y = kVar.a(60.0d);
    }

    private final void V0(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        AbstractC2855l.d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private final void W0(MotionEvent motionEvent) {
        if (b1(motionEvent)) {
            return;
        }
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(C1272b c1272b) {
        c1272b.D();
    }

    private final void a1(MotionEvent motionEvent) {
        this.f6586V = VelocityTracker.obtain();
        p();
        this.f6584T = 1;
        Handler handler = this.f6583S;
        if (handler == null) {
            this.f6583S = new Handler(Looper.getMainLooper());
        } else {
            AbstractC2855l.d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f6583S;
        AbstractC2855l.d(handler2);
        handler2.postDelayed(this.f6585U, this.f6581Q);
    }

    private final boolean b1(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        V0(this.f6586V, motionEvent);
        C.a aVar = C.f6560f;
        VelocityTracker velocityTracker = this.f6586V;
        AbstractC2855l.d(velocityTracker);
        C cB = aVar.b(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.add(Boolean.valueOf(c1(this, cB, numArr[i10].intValue(), f6577X)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList2.add(Boolean.valueOf(c1(this, cB, numArr2[i11].intValue(), f6578Y)));
        }
        if (arrayList.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (arrayList2.isEmpty()) {
            z11 = false;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        }
        boolean z12 = z10 | z11;
        boolean z13 = cB.k() > ((double) this.f6582R);
        if (this.f6584T != this.f6579O || !z12 || !z13) {
            return false;
        }
        Handler handler = this.f6583S;
        AbstractC2855l.d(handler);
        handler.removeCallbacksAndMessages(null);
        k();
        return true;
    }

    private static final boolean c1(C1272b c1272b, C c10, int i10, double d10) {
        return (c1272b.f6580P & i10) == i10 && c10.l(C.f6560f.a(i10), d10);
    }

    public final void Y0(int i10) {
        this.f6580P = i10;
    }

    public final void Z0(int i10) {
        this.f6579O = i10;
    }

    @Override // J6.AbstractC1274d
    protected void j0() {
        Handler handler = this.f6583S;
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
            if (iS == 0) {
                a1(sourceEvent);
            }
            if (iS == 2) {
                b1(sourceEvent);
                if (sourceEvent.getPointerCount() > this.f6584T) {
                    this.f6584T = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    W0(sourceEvent);
                }
            }
        }
    }

    @Override // J6.AbstractC1274d
    protected void o0() {
        VelocityTracker velocityTracker = this.f6586V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f6586V = null;
        Handler handler = this.f6583S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // J6.AbstractC1274d
    public void s0() {
        super.s0();
        this.f6579O = 1;
        this.f6580P = 1;
    }
}
