package R8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: R8.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1445y0 extends F0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10226l = AtomicIntegerFieldUpdater.newUpdater(C1445y0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Function1 f10227k;

    public C1445y0(Function1 function1) {
        this.f10227k = function1;
    }

    @Override // R8.F0
    public boolean v() {
        return true;
    }

    @Override // R8.F0
    public void w(Throwable th) {
        if (f10226l.compareAndSet(this, 0, 1)) {
            this.f10227k.invoke(th);
        }
    }
}
