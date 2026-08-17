package H0;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3636c;

    public f(int i10) {
        super(i10);
        this.f3636c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, H0.e
    public Object acquire() {
        Object objAcquire;
        synchronized (this.f3636c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // androidx.core.util.Pools$SimplePool, H0.e
    public boolean release(Object instance) {
        boolean zRelease;
        AbstractC2855l.g(instance, "instance");
        synchronized (this.f3636c) {
            zRelease = super.release(instance);
        }
        return zRelease;
    }
}
