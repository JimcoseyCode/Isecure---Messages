package B8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f408b;

    public d(Lock lock) {
        AbstractC2855l.g(lock, "lock");
        this.f408b = lock;
    }

    protected final Lock a() {
        return this.f408b;
    }

    @Override // B8.k
    public void lock() {
        this.f408b.lock();
    }

    @Override // B8.k
    public void unlock() {
        this.f408b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
