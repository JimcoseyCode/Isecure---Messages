package a9;

import W8.E;
import W8.H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13708a = H.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f13709b = new E("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final E f13710c = new E("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final E f13711d = new E("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final E f13712e = new E("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f13713f = H.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(long j10, k kVar) {
        return new k(j10, kVar, 0);
    }
}
