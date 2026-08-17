package R4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f10033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10035e;

    public d(long j10, long j11) {
        this.f10033c = null;
        this.f10034d = 0;
        this.f10035e = 1;
        this.f10031a = j10;
        this.f10032b = j11;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        dVar.f10034d = valueAnimator.getRepeatCount();
        dVar.f10035e = valueAnimator.getRepeatMode();
        return dVar;
    }

    public long b() {
        return this.f10031a;
    }

    public long c() {
        return this.f10032b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f10033c;
        return timeInterpolator != null ? timeInterpolator : a.f10025b;
    }

    public int e() {
        return this.f10034d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && e() == dVar.e() && f() == dVar.f()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f10035e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + e()) * 31) + f();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + e() + " repeatMode: " + f() + "}\n";
    }

    public d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f10034d = 0;
        this.f10035e = 1;
        this.f10031a = j10;
        this.f10032b = j11;
        this.f10033c = timeInterpolator;
    }
}
