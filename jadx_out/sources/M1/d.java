package M1;

import Q1.l;
import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v1.EnumC3417a;
import x1.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d implements b, e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f7403q = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f7407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f7408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f7409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private q f7413p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public d(int i10, int i11) {
        this(i10, i11, true, f7403q);
    }

    private synchronized Object a(Long l10) {
        try {
            if (this.f7406i && !isDone()) {
                l.a();
            }
            if (this.f7410m) {
                throw new CancellationException();
            }
            if (this.f7412o) {
                throw new ExecutionException(this.f7413p);
            }
            if (this.f7411n) {
                return this.f7408k;
            }
            if (l10 == null) {
                this.f7407j.b(this, 0L);
            } else if (l10.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l10.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f7407j.b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f7412o) {
                throw new ExecutionException(this.f7413p);
            }
            if (this.f7410m) {
                throw new CancellationException();
            }
            if (!this.f7411n) {
                throw new TimeoutException();
            }
            return this.f7408k;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f7410m = true;
                this.f7407j.a(this);
                c cVar = null;
                if (z10) {
                    c cVar2 = this.f7409l;
                    this.f7409l = null;
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return a(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // N1.d
    public synchronized c getRequest() {
        return this.f7409l;
    }

    @Override // N1.d
    public void getSize(N1.c cVar) {
        cVar.c(this.f7404g, this.f7405h);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f7410m;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isDone() {
        boolean z10;
        if (this.f7410m || this.f7411n) {
            z10 = true;
        } else if (!this.f7412o) {
            z10 = false;
        }
        return z10;
    }

    @Override // N1.d
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // N1.d
    public synchronized void onResourceReady(Object obj, O1.b bVar) {
    }

    @Override // N1.d
    public synchronized void setRequest(c cVar) {
        this.f7409l = cVar;
    }

    public String toString() {
        c cVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                cVar = null;
                if (this.f7410m) {
                    str = "CANCELLED";
                } else if (this.f7412o) {
                    str = "FAILURE";
                } else if (this.f7411n) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    cVar = this.f7409l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + cVar + "]]";
    }

    d(int i10, int i11, boolean z10, a aVar) {
        this.f7404g = i10;
        this.f7405h = i11;
        this.f7406i = z10;
        this.f7407j = aVar;
    }

    @Override // M1.e
    public synchronized boolean onLoadFailed(q qVar, Object obj, N1.d dVar, boolean z10) {
        this.f7412o = true;
        this.f7413p = qVar;
        this.f7407j.a(this);
        return false;
    }

    @Override // M1.e
    public synchronized boolean onResourceReady(Object obj, Object obj2, N1.d dVar, EnumC3417a enumC3417a, boolean z10) {
        this.f7411n = true;
        this.f7408k = obj;
        this.f7407j.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return a(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // J1.l
    public void onDestroy() {
    }

    @Override // J1.l
    public void onStart() {
    }

    @Override // J1.l
    public void onStop() {
    }

    @Override // N1.d
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // N1.d
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // N1.d
    public void removeCallback(N1.c cVar) {
    }
}
