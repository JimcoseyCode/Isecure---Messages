package F;

import F.AbstractC0482f0;
import android.os.SystemClock;
import y.C3579f0;
import y.C3600u;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class V implements r0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f1398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f1399d;

    public V(long j10, int i10, Throwable th) {
        this.f1398c = SystemClock.elapsedRealtime() - j10;
        this.f1397b = i10;
        if (th instanceof AbstractC0482f0.b) {
            this.f1396a = 2;
            this.f1399d = th;
            return;
        }
        if (!(th instanceof C3579f0)) {
            this.f1396a = 0;
            this.f1399d = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.f1399d = th;
        if (th instanceof C3600u) {
            this.f1396a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.f1396a = 1;
        } else {
            this.f1396a = 0;
        }
    }

    @Override // y.r0.b
    public Throwable a() {
        return this.f1399d;
    }

    @Override // y.r0.b
    public int b() {
        return this.f1396a;
    }

    @Override // y.r0.b
    public long c() {
        return this.f1398c;
    }
}
