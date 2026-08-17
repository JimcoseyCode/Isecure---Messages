package J6;

import J6.AbstractC1274d;
import J6.y;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC1274d {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private double f6733O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private double f6734P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private y f6737S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f6738T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f6739U;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f6735Q = Float.NaN;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f6736R = Float.NaN;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final y.b f6740V = new b();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC1274d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6741b = u.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6742c = "PinchGestureHandler";

        @Override // J6.AbstractC1274d.c
        public String d() {
            return this.f6742c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6741b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public u a(Context context) {
            return new u();
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.h c(u handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.h(handler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements y.b {
        b() {
        }

        @Override // J6.y.b
        public boolean a(y detector) {
            AbstractC2855l.g(detector, "detector");
            u.this.f6738T = detector.d();
            return true;
        }

        @Override // J6.y.b
        public void b(y detector) {
            AbstractC2855l.g(detector, "detector");
        }

        @Override // J6.y.b
        public boolean c(y detector) {
            AbstractC2855l.g(detector, "detector");
            double dB1 = u.this.b1();
            u uVar = u.this;
            uVar.f6733O = uVar.b1() * ((double) detector.g());
            double dI = detector.i();
            if (dI > 0.0d) {
                u uVar2 = u.this;
                uVar2.f6734P = (uVar2.b1() - dB1) / dI;
            }
            if (Math.abs(u.this.f6738T - detector.d()) < u.this.f6739U || u.this.S() != 2) {
                return true;
            }
            u.this.k();
            return true;
        }
    }

    public final float Z0() {
        return this.f6735Q;
    }

    public final float a1() {
        return this.f6736R;
    }

    public final double b1() {
        return this.f6733O;
    }

    public final double c1() {
        return this.f6734P;
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
            View viewW = W();
            AbstractC2855l.d(viewW);
            Context context = viewW.getContext();
            t0();
            this.f6737S = new y(context, this.f6740V);
            this.f6739U = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f6735Q = event.getX();
            this.f6736R = event.getY();
            p();
        }
        y yVar = this.f6737S;
        if (yVar != null) {
            yVar.k(sourceEvent);
        }
        y yVar2 = this.f6737S;
        if (yVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(yVar2.e(), yVar2.f()));
            this.f6735Q = pointFQ0.x;
            this.f6736R = pointFQ0.y;
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
        this.f6737S = null;
        this.f6735Q = Float.NaN;
        this.f6736R = Float.NaN;
        t0();
    }

    @Override // J6.AbstractC1274d
    public void t0() {
        this.f6734P = 0.0d;
        this.f6733O = 1.0d;
    }
}
