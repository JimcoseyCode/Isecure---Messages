package Q8;

import kotlin.jvm.internal.AbstractC2855l;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(long j10, int i10) {
        return a.p((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j10) {
        return a.p((j10 << 1) + 1);
    }

    private static final long f(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? e(B7.d.m(j10, -4611686018427387903L, 4611686018427387903L)) : g(h(j10));
    }

    private static final long g(long j10) {
        return a.p(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long i(double d10, d unit) {
        AbstractC2855l.g(unit, "unit");
        double dA = e.a(d10, unit, d.f9886h);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jD = AbstractC3624a.d(dA);
        return (-4611686018426999999L > jD || jD >= 4611686018427000000L) ? f(AbstractC3624a.d(e.a(d10, unit, d.f9888j))) : g(jD);
    }

    public static final long j(long j10, d unit) {
        AbstractC2855l.g(unit, "unit");
        d dVar = d.f9886h;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return ((-jC) > j10 || j10 > jC) ? e(B7.d.m(e.b(j10, unit, d.f9888j), -4611686018427387903L, 4611686018427387903L)) : g(e.c(j10, unit, dVar));
    }
}
