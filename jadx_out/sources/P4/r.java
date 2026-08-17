package P4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f8828a = new CountDownLatch(1);

    /* synthetic */ r(q qVar) {
    }

    public final void a() throws InterruptedException {
        this.f8828a.await();
    }

    public final boolean b(long j10, TimeUnit timeUnit) {
        return this.f8828a.await(j10, timeUnit);
    }

    @Override // P4.InterfaceC1371e
    public final void onCanceled() {
        this.f8828a.countDown();
    }

    @Override // P4.InterfaceC1373g
    public final void onFailure(Exception exc) {
        this.f8828a.countDown();
    }

    @Override // P4.InterfaceC1374h
    public final void onSuccess(Object obj) {
        this.f8828a.countDown();
    }
}
