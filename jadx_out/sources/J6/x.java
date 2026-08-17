package J6;

import J6.AbstractC1274d;
import J6.w;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC1274d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final a f6760U = new a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private w f6761O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private double f6762P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private double f6763Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f6764R = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f6765S = Float.NaN;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final w.a f6766T = new c();

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

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6767b = x.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6768c = "RotationGestureHandler";

        @Override // J6.AbstractC1274d.c
        public String d() {
            return this.f6768c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6767b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public x a(Context context) {
            return new x();
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.i c(x handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.i(handler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements w.a {
        c() {
        }

        @Override // J6.w.a
        public boolean a(w detector) {
            AbstractC2855l.g(detector, "detector");
            double dY0 = x.this.Y0();
            x xVar = x.this;
            xVar.f6762P = xVar.Y0() + detector.d();
            long jE = detector.e();
            if (jE > 0) {
                x xVar2 = x.this;
                xVar2.f6763Q = (xVar2.Y0() - dY0) / jE;
            }
            if (Math.abs(x.this.Y0()) < 0.08726646259971647d || x.this.S() != 2) {
                return true;
            }
            x.this.k();
            return true;
        }

        @Override // J6.w.a
        public void b(w detector) {
            AbstractC2855l.g(detector, "detector");
            x.this.B();
        }

        @Override // J6.w.a
        public boolean c(w detector) {
            AbstractC2855l.g(detector, "detector");
            return true;
        }
    }

    public final float W0() {
        return this.f6764R;
    }

    public final float X0() {
        return this.f6765S;
    }

    public final double Y0() {
        return this.f6762P;
    }

    public final double Z0() {
        return this.f6763Q;
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
        if (S() == 0) {
            t0();
            this.f6761O = new w(this.f6766T);
            this.f6764R = event.getX();
            this.f6765S = event.getY();
            p();
        }
        w wVar = this.f6761O;
        if (wVar != null) {
            wVar.f(sourceEvent);
        }
        w wVar2 = this.f6761O;
        if (wVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(wVar2.b(), wVar2.c()));
            this.f6764R = pointFQ0.x;
            this.f6765S = pointFQ0.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (S() == 4) {
                B();
            } else {
                D();
            }
        }
    }

    @Override // J6.AbstractC1274d
    protected void o0() {
        this.f6761O = null;
        this.f6764R = Float.NaN;
        this.f6765S = Float.NaN;
        t0();
    }

    @Override // J6.AbstractC1274d
    public void t0() {
        this.f6763Q = 0.0d;
        this.f6762P = 0.0d;
    }
}
