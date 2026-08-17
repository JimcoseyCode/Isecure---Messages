package A2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0005a f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float f31b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f32c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f33d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f34e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f35f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f36g;

    /* JADX INFO: renamed from: A2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0005a {
        boolean f();
    }

    public a(Context context) {
        this.f31b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f30a = null;
        e();
    }

    public boolean b() {
        return this.f32c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0005a interfaceC0005a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32c = true;
            this.f33d = true;
            this.f34e = motionEvent.getEventTime();
            this.f35f = motionEvent.getX();
            this.f36g = motionEvent.getY();
        } else if (action == 1) {
            this.f32c = false;
            if (Math.abs(motionEvent.getX() - this.f35f) > this.f31b || Math.abs(motionEvent.getY() - this.f36g) > this.f31b) {
                this.f33d = false;
            }
            if (this.f33d && motionEvent.getEventTime() - this.f34e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0005a = this.f30a) != null) {
                interfaceC0005a.f();
            }
            this.f33d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f32c = false;
                this.f33d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f35f) > this.f31b || Math.abs(motionEvent.getY() - this.f36g) > this.f31b) {
            this.f33d = false;
        }
        return true;
    }

    public void e() {
        this.f32c = false;
        this.f33d = false;
    }

    public void f(InterfaceC0005a interfaceC0005a) {
        this.f30a = interfaceC0005a;
    }
}
