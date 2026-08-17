package Z;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: Z.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1563b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f13332a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    AbstractC1563b() {
    }

    static AbstractC1563b e(int i10, Throwable th, double d10, long j10) {
        return new C1565d(i10, d10, j10, th);
    }

    abstract double a();

    public abstract long b();

    public abstract int c();

    public abstract Throwable d();
}
