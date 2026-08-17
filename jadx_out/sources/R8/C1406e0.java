package R8;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: R8.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1406e0 implements InterfaceC1408f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Future f10186g;

    public C1406e0(Future future) {
        this.f10186g = future;
    }

    @Override // R8.InterfaceC1408f0
    public void dispose() {
        this.f10186g.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f10186g + ']';
    }
}
