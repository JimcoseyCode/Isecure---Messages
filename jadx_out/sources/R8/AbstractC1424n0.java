package R8;

/* JADX INFO: renamed from: R8.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1424n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W8.E f10207a = new W8.E("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W8.E f10208b = new W8.E("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
