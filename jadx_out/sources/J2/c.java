package J2;

import android.os.SystemClock;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L2.b f5389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5400l;

    public c(L2.b frameScheduler) {
        AbstractC2855l.g(frameScheduler, "frameScheduler");
        this.f5389a = frameScheduler;
        this.f5391c = 8L;
        this.f5398j = -1;
        this.f5399k = -1;
    }

    private final long d() {
        return SystemClock.uptimeMillis();
    }

    public final int a() {
        long jD = this.f5390b ? (d() - this.f5394f) + this.f5392d : Math.max(this.f5396h, 0L);
        int iB = this.f5389a.b(jD, this.f5396h);
        this.f5396h = jD;
        return iB;
    }

    public final boolean b() {
        return this.f5390b;
    }

    public final long c() {
        if (!this.f5390b) {
            return -1L;
        }
        long jA = this.f5389a.a(d() - this.f5394f);
        if (jA == -1) {
            this.f5390b = false;
            return -1L;
        }
        long j10 = jA + this.f5391c;
        this.f5395g = this.f5394f + j10;
        return j10;
    }

    public final void e() {
        this.f5400l++;
    }

    public final void f(int i10) {
        this.f5398j = i10;
    }

    public final void g(boolean z10) {
        this.f5390b = z10;
    }

    public final boolean h() {
        return this.f5398j != -1 && d() >= this.f5395g;
    }

    public final void i() {
        if (this.f5390b) {
            return;
        }
        long jD = d();
        long j10 = jD - this.f5393e;
        this.f5394f = j10;
        this.f5395g = j10;
        this.f5396h = jD - this.f5397i;
        this.f5398j = this.f5399k;
        this.f5390b = true;
    }

    public final void j() {
        if (this.f5390b) {
            long jD = d();
            this.f5393e = jD - this.f5394f;
            this.f5397i = jD - this.f5396h;
            this.f5394f = 0L;
            this.f5395g = 0L;
            this.f5396h = -1L;
            this.f5398j = -1;
            this.f5390b = false;
        }
    }
}
