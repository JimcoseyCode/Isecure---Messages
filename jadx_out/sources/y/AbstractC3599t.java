package y;

/* JADX INFO: renamed from: y.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3599t {

    /* JADX INFO: renamed from: y.t$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public static a a(int i10) {
            return b(i10, null);
        }

        public static a b(int i10, Throwable th) {
            return new C3572c(i10, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* JADX INFO: renamed from: y.t$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC3599t a(b bVar) {
        return b(bVar, null);
    }

    public static AbstractC3599t b(b bVar, a aVar) {
        return new C3570b(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
