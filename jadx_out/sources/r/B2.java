package r;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC2855l;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f30919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f30920b;

    public B2(Executor executor) {
        AbstractC2855l.g(executor, "executor");
        this.f30919a = executor;
        this.f30920b = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(B2 b22) {
        int iDecrementAndGet = b22.f30920b.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            AbstractC3583h0.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
            return;
        }
        AbstractC3583h0.l("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(B2 b22) {
        AbstractC3583h0.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + b22.f30920b.incrementAndGet());
    }

    public final void c() {
        this.f30919a.execute(new Runnable() { // from class: r.z2
            @Override // java.lang.Runnable
            public final void run() {
                B2.d(this.f31588g);
            }
        });
    }

    public final int e() {
        return this.f30920b.get();
    }

    public final void f() {
        this.f30919a.execute(new Runnable() { // from class: r.A2
            @Override // java.lang.Runnable
            public final void run() {
                B2.g(this.f30914g);
            }
        });
    }

    public final void h() {
        this.f30920b.set(0);
        AbstractC3583h0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
