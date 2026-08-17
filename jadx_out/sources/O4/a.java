package O4;

import K4.h;
import K4.i;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import r4.AbstractC3268i;
import y4.f;
import y4.o;
import y4.p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f8191r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f8192s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f8193t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile e f8194u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f8196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future f8198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f8200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    K4.b f8203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y4.d f8204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkSource f8205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f8206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f8207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f8208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f8209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicInteger f8210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f8211q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f8195a = new Object();
        this.f8197c = 0;
        this.f8200f = new HashSet();
        this.f8201g = true;
        this.f8204j = f.b();
        this.f8209o = new HashMap();
        this.f8210p = new AtomicInteger(0);
        AbstractC3268i.l(context, "WakeLock: context must not be null");
        AbstractC3268i.f(str, "WakeLock: wakeLockName must not be empty");
        this.f8208n = context.getApplicationContext();
        this.f8207m = str;
        this.f8203i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f8206l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f8206l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f8196b = wakeLockNewWakeLock;
        if (p.c(context)) {
            WorkSource workSourceB = p.b(context, o.a(packageName) ? context.getPackageName() : packageName);
            this.f8205k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f8192s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f8193t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f8192s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f8192s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f8211q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f8195a) {
            try {
                if (aVar.b()) {
                    String.valueOf(aVar.f8206l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f8197c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f8201g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f8200f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8200f);
        this.f8200f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f8195a) {
            try {
                if (b()) {
                    if (this.f8201g) {
                        int i11 = this.f8197c - 1;
                        this.f8197c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f8197c = 0;
                    }
                    g();
                    Iterator it = this.f8209o.values().iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f8213a = 0;
                    }
                    this.f8209o.clear();
                    Future future = this.f8198d;
                    if (future != null) {
                        future.cancel(false);
                        this.f8198d = null;
                        this.f8199e = 0L;
                    }
                    this.f8202h = 0;
                    if (this.f8196b.isHeld()) {
                        try {
                            try {
                                this.f8196b.release();
                                if (this.f8203i != null) {
                                    this.f8203i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                String.valueOf(this.f8206l).concat(" failed to release!");
                                if (this.f8203i != null) {
                                    this.f8203i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f8203i != null) {
                                this.f8203i = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.f8206l).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            e10.toString();
        }
    }

    public void a(long j10) {
        this.f8210p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f8191r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f8195a) {
            try {
                if (!b()) {
                    this.f8203i = K4.b.d(false, null);
                    this.f8196b.acquire();
                    this.f8204j.a();
                }
                this.f8197c++;
                this.f8202h++;
                f(null);
                d dVar = (d) this.f8209o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f8209o.put(null, dVar);
                }
                dVar.f8213a++;
                long jA = this.f8204j.a();
                long j11 = Long.MAX_VALUE - jA > jMax ? jA + jMax : Long.MAX_VALUE;
                if (j11 > this.f8199e) {
                    this.f8199e = j11;
                    Future future = this.f8198d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f8198d = this.f8211q.schedule(new Runnable() { // from class: O4.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f8212g);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f8195a) {
            z10 = this.f8197c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f8210p.decrementAndGet() < 0) {
            String.valueOf(this.f8206l).concat(" release without a matched acquire!");
        }
        synchronized (this.f8195a) {
            try {
                f(null);
                if (this.f8209o.containsKey(null)) {
                    d dVar = (d) this.f8209o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f8213a - 1;
                        dVar.f8213a = i10;
                        if (i10 == 0) {
                            this.f8209o.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f8206l).concat(" counter does not exist");
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f8195a) {
            this.f8201g = z10;
        }
    }
}
