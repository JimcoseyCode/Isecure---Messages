package Z;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    c0() {
    }

    static c0 d(long j10, long j11, AbstractC1563b abstractC1563b) {
        H0.g.b(j10 >= 0, "duration must be positive value.");
        H0.g.b(j11 >= 0, "bytes must be positive value.");
        return new C1573l(j10, j11, abstractC1563b);
    }

    public abstract AbstractC1563b a();

    public abstract long b();

    public abstract long c();
}
