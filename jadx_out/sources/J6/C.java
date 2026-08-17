package J6;

import android.view.VelocityTracker;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f6560f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C f6561g = new C(-1.0d, 0.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C f6562h = new C(1.0d, 0.0d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C f6563i = new C(0.0d, -1.0d);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C f6564j = new C(0.0d, 1.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C f6565k = new C(1.0d, -1.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C f6566l = new C(1.0d, 1.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C f6567m = new C(-1.0d, -1.0d);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C f6568n = new C(-1.0d, 1.0d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C f6569o = new C(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f6570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f6571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f6572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f6573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f6574e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(int i10) {
            switch (i10) {
                case 1:
                    return C.f6562h;
                case 2:
                    return C.f6561g;
                case 3:
                case 7:
                default:
                    return C.f6569o;
                case 4:
                    return C.f6563i;
                case 5:
                    return C.f6565k;
                case 6:
                    return C.f6567m;
                case 8:
                    return C.f6564j;
                case 9:
                    return C.f6566l;
                case 10:
                    return C.f6568n;
            }
        }

        public final C b(VelocityTracker tracker) {
            AbstractC2855l.g(tracker, "tracker");
            tracker.computeCurrentVelocity(ProgressBarContainerView.MAX_PROGRESS);
            return new C(tracker.getXVelocity(), tracker.getYVelocity());
        }

        private a() {
        }
    }

    public C(double d10, double d11) {
        this.f6570a = d10;
        this.f6571b = d11;
        double dHypot = Math.hypot(d10, d11);
        this.f6574e = dHypot;
        boolean z10 = dHypot > 0.1d;
        this.f6572c = z10 ? d10 / dHypot : 0.0d;
        this.f6573d = z10 ? d11 / dHypot : 0.0d;
    }

    private final double j(C c10) {
        return (this.f6572c * c10.f6572c) + (this.f6573d * c10.f6573d);
    }

    public final double k() {
        return this.f6574e;
    }

    public final boolean l(C vector, double d10) {
        AbstractC2855l.g(vector, "vector");
        return j(vector) > d10;
    }
}
