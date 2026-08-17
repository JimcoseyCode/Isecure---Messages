package J6;

import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f6753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f6754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f6758i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6759j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        boolean a(w wVar);

        void b(w wVar);

        boolean c(w wVar);
    }

    public w(a aVar) {
        this.f6750a = aVar;
    }

    private final void a() {
        if (this.f6757h) {
            this.f6759j = false;
            this.f6757h = false;
            a aVar = this.f6750a;
            if (aVar != null) {
                aVar.b(this);
            }
        }
    }

    private final void g() {
        if (this.f6759j) {
            return;
        }
        this.f6759j = true;
    }

    private final void h(double d10) {
        if (this.f6759j) {
            this.f6753d = d10;
            this.f6759j = false;
        }
    }

    private final void i(MotionEvent motionEvent) {
        this.f6752c = this.f6751b;
        this.f6751b = motionEvent.getEventTime();
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f6758i[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f6758i[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x10 = motionEvent.getX(iFindPointerIndex);
        float y10 = motionEvent.getY(iFindPointerIndex);
        float x11 = motionEvent.getX(iFindPointerIndex2);
        float y11 = motionEvent.getY(iFindPointerIndex2);
        this.f6755f = (x10 + x11) * 0.5f;
        this.f6756g = (y10 + y11) * 0.5f;
        double d10 = -Math.atan2(y11 - y10, x11 - x10);
        h(d10);
        double d11 = Double.isNaN(this.f6753d) ? 0.0d : this.f6753d - d10;
        this.f6754e = d11;
        this.f6753d = d10;
        if (d11 > 3.141592653589793d) {
            this.f6754e = d11 - 3.141592653589793d;
        } else if (d11 < -3.141592653589793d) {
            this.f6754e = d11 + 3.141592653589793d;
        }
        double d12 = this.f6754e;
        if (d12 > 1.5707963267948966d) {
            this.f6754e = d12 - 3.141592653589793d;
        } else if (d12 < -1.5707963267948966d) {
            this.f6754e = d12 + 3.141592653589793d;
        }
    }

    public final float b() {
        return this.f6755f;
    }

    public final float c() {
        return this.f6756g;
    }

    public final double d() {
        return this.f6754e;
    }

    public final long e() {
        return this.f6751b - this.f6752c;
    }

    public final boolean f(MotionEvent event) {
        a aVar;
        AbstractC2855l.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f6757h = false;
            this.f6758i[0] = event.getPointerId(event.getActionIndex());
            this.f6758i[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.f6757h || this.f6759j) {
                    this.f6758i[1] = event.getPointerId(event.getActionIndex());
                    i(event);
                }
                if (!this.f6757h) {
                    this.f6757h = true;
                    this.f6752c = event.getEventTime();
                    this.f6753d = Double.NaN;
                    a aVar2 = this.f6750a;
                    if (aVar2 != null) {
                        aVar2.c(this);
                    }
                }
            } else if (actionMasked == 6 && this.f6757h) {
                int pointerId = event.getPointerId(event.getActionIndex());
                int[] iArr = this.f6758i;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    g();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    g();
                }
            }
        } else if (this.f6757h) {
            i(event);
            if (!this.f6759j && (aVar = this.f6750a) != null) {
                aVar.a(this);
            }
        }
        return true;
    }
}
