package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import e3.C2395a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f19943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f19944b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19947e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f19945c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f19946d = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d3.k f19948f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f19949g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f f19950h = f.IDLE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f19951i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f19952j = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19955a;

        static {
            int[] iArr = new int[f.values().length];
            f19955a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19955a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19955a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19955a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        void a(d3.k kVar, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static ScheduledExecutorService f19956a;

        static ScheduledExecutorService a() {
            if (f19956a == null) {
                f19956a = Executors.newSingleThreadScheduledExecutor();
            }
            return f19956a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i10) {
        this.f19943a = executor;
        this.f19944b = dVar;
        this.f19947e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d3.k kVar;
        int i10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            kVar = this.f19948f;
            i10 = this.f19949g;
            this.f19948f = null;
            this.f19949g = 0;
            this.f19950h = f.RUNNING;
            this.f19952j = jUptimeMillis;
        }
        try {
            if (i(kVar, i10)) {
                this.f19944b.a(kVar, i10);
            }
        } finally {
            d3.k.k(kVar);
            g();
        }
    }

    private void e(long j10) {
        Runnable runnableA = C2395a.a(this.f19946d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(runnableA, j10, TimeUnit.MILLISECONDS);
        } else {
            runnableA.run();
        }
    }

    private void g() {
        long jMax;
        boolean z10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f19950h == f.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f19952j + ((long) this.f19947e), jUptimeMillis);
                    this.f19951i = jUptimeMillis;
                    this.f19950h = f.QUEUED;
                    z10 = true;
                } else {
                    this.f19950h = f.IDLE;
                    jMax = 0;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            e(jMax - jUptimeMillis);
        }
    }

    private static boolean i(d3.k kVar, int i10) {
        return AbstractC1967c.d(i10) || AbstractC1967c.m(i10, 4) || d3.k.u0(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f19943a.execute(C2395a.a(this.f19945c, "JobScheduler_submitJob"));
    }

    public void c() {
        d3.k kVar;
        synchronized (this) {
            kVar = this.f19948f;
            this.f19948f = null;
            this.f19949g = 0;
        }
        d3.k.k(kVar);
    }

    public synchronized long f() {
        return this.f19952j - this.f19951i;
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z10 = false;
                if (!i(this.f19948f, this.f19949g)) {
                    return false;
                }
                int i10 = c.f19955a[this.f19950h.ordinal()];
                if (i10 != 1) {
                    if (i10 == 3) {
                        this.f19950h = f.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f19952j + ((long) this.f19947e), jUptimeMillis);
                    this.f19951i = jUptimeMillis;
                    this.f19950h = f.QUEUED;
                    z10 = true;
                }
                if (z10) {
                    e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k(d3.k kVar, int i10) {
        d3.k kVar2;
        if (!i(kVar, i10)) {
            return false;
        }
        synchronized (this) {
            kVar2 = this.f19948f;
            this.f19948f = d3.k.e(kVar);
            this.f19949g = i10;
        }
        d3.k.k(kVar2);
        return true;
    }
}
