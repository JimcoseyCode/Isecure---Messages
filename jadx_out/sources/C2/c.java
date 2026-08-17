package C2;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import j2.InterfaceC2764b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends C2.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2764b f497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f504m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                try {
                    c.this.f499h = false;
                    if (!c.this.t()) {
                        c.this.u();
                    } else if (c.this.f503l != null) {
                        c.this.f503l.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void f();
    }

    private c(C2.a aVar, b bVar, InterfaceC2764b interfaceC2764b, ScheduledExecutorService scheduledExecutorService) {
        super(aVar);
        this.f499h = false;
        this.f501j = 2000L;
        this.f502k = 1000L;
        this.f504m = new a();
        this.f503l = bVar;
        this.f497f = interfaceC2764b;
        this.f498g = scheduledExecutorService;
    }

    public static C2.b r(C2.a aVar, b bVar, InterfaceC2764b interfaceC2764b, ScheduledExecutorService scheduledExecutorService) {
        return new c(aVar, bVar, interfaceC2764b, scheduledExecutorService);
    }

    public static C2.b s(C2.a aVar, InterfaceC2764b interfaceC2764b, ScheduledExecutorService scheduledExecutorService) {
        return r(aVar, (b) aVar, interfaceC2764b, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        return this.f497f.now() - this.f500i > this.f501j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() {
        if (!this.f499h) {
            this.f499h = true;
            this.f498g.schedule(this.f504m, this.f502k, TimeUnit.MILLISECONDS);
        }
    }

    @Override // C2.b, C2.a
    public boolean n(Drawable drawable, Canvas canvas, int i10) {
        this.f500i = this.f497f.now();
        boolean zN = super.n(drawable, canvas, i10);
        u();
        return zN;
    }
}
