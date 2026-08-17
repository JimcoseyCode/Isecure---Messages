package U0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ThreadLocal f10729j = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f10734e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f10738i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0.i f10730a = new m0.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f10731b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f10732c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f10733d = new Runnable() { // from class: U0.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f10728g.f10732c.a();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f10735f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10736g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10737h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            c.this.f10735f = SystemClock.uptimeMillis();
            c cVar = c.this;
            cVar.f(cVar.f10735f);
            if (c.this.f10731b.size() > 0) {
                c.this.f10734e.a(c.this.f10733d);
            }
        }
    }

    /* JADX INFO: renamed from: U0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface InterfaceC0110c {
        boolean a(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ValueAnimator.DurationScaleChangeListener f10740a;

        public d() {
        }

        @Override // U0.c.e
        public boolean a() {
            if (this.f10740a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: U0.f
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f10) {
                    c.this.f10737h = f10;
                }
            };
            this.f10740a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }

        @Override // U0.c.e
        public boolean b() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f10740a);
            this.f10740a = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {
        boolean a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class f implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f10742a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Looper f10743b = Looper.myLooper();

        f() {
        }

        @Override // U0.l
        public void a(final Runnable runnable) {
            this.f10742a.postFrameCallback(new Choreographer.FrameCallback() { // from class: U0.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }

        @Override // U0.l
        public boolean b() {
            return Thread.currentThread() == this.f10743b.getThread();
        }
    }

    public c(l lVar) {
        this.f10734e = lVar;
    }

    private void e() {
        if (this.f10736g) {
            for (int size = this.f10731b.size() - 1; size >= 0; size--) {
                if (this.f10731b.get(size) == null) {
                    this.f10731b.remove(size);
                }
            }
            if (this.f10731b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f10738i.b();
            }
            this.f10736g = false;
        }
    }

    static c h() {
        ThreadLocal threadLocal = f10729j;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new f()));
        }
        return (c) threadLocal.get();
    }

    private boolean i(InterfaceC0110c interfaceC0110c, long j10) {
        Long l10 = (Long) this.f10730a.get(interfaceC0110c);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f10730a.remove(interfaceC0110c);
        return true;
    }

    void d(InterfaceC0110c interfaceC0110c, long j10) {
        if (this.f10731b.size() == 0) {
            this.f10734e.a(this.f10733d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f10737h = ValueAnimator.getDurationScale();
                if (this.f10738i == null) {
                    this.f10738i = new d();
                }
                this.f10738i.a();
            }
        }
        if (!this.f10731b.contains(interfaceC0110c)) {
            this.f10731b.add(interfaceC0110c);
        }
        if (j10 > 0) {
            this.f10730a.put(interfaceC0110c, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void f(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f10731b.size(); i10++) {
            InterfaceC0110c interfaceC0110c = (InterfaceC0110c) this.f10731b.get(i10);
            if (interfaceC0110c != null && i(interfaceC0110c, jUptimeMillis)) {
                interfaceC0110c.a(j10);
            }
        }
        e();
    }

    public float g() {
        return this.f10737h;
    }

    boolean j() {
        return this.f10734e.b();
    }

    void k(InterfaceC0110c interfaceC0110c) {
        this.f10730a.remove(interfaceC0110c);
        int iIndexOf = this.f10731b.indexOf(interfaceC0110c);
        if (iIndexOf >= 0) {
            this.f10731b.set(iIndexOf, null);
            this.f10736g = true;
        }
    }
}
