package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.progressbar.ProgressBarContainerView;

/* JADX INFO: renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1685o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1687p f16579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f16580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f16581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f16582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f16583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f16587j;

    /* JADX INFO: renamed from: androidx.core.view.o$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.o$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C1685o(Context context, InterfaceC1687p interfaceC1687p) {
        this(context, interfaceC1687p, new b() { // from class: androidx.core.view.m
            @Override // androidx.core.view.C1685o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C1685o.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.n
            @Override // androidx.core.view.C1685o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C1685o.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC1664d0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = AbstractC1664d0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f16585h == source && this.f16586i == deviceId && this.f16584g == i10) {
            return false;
        }
        this.f16580c.a(this.f16578a, this.f16587j, motionEvent, i10);
        this.f16585h = source;
        this.f16586i = deviceId;
        this.f16584g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f16582e == null) {
            this.f16582e = VelocityTracker.obtain();
        }
        return this.f16581d.a(this.f16582e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        X.a(velocityTracker, motionEvent);
        X.b(velocityTracker, ProgressBarContainerView.MAX_PROGRESS);
        return X.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f16587j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f16582e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16582e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f16579b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f16583f) && fSignum != 0.0f)) {
            this.f16579b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f16587j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f16583f = this.f16579b.a(fMax) ? fMax : 0.0f;
    }

    C1685o(Context context, InterfaceC1687p interfaceC1687p, b bVar, a aVar) {
        this.f16584g = -1;
        this.f16585h = -1;
        this.f16586i = -1;
        this.f16587j = new int[]{ViewDefaults.NUMBER_OF_LINES, 0};
        this.f16578a = context;
        this.f16579b = interfaceC1687p;
        this.f16580c = bVar;
        this.f16581d = aVar;
    }
}
