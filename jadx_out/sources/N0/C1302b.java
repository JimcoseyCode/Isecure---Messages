package N0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: N0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1302b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f7728a;

    public C1302b(int i10) {
        this.f7728a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f7728a.decrementAndGet();
    }

    public final int b() {
        return this.f7728a.get();
    }

    public final int c() {
        return this.f7728a.getAndIncrement();
    }

    public final int d() {
        return this.f7728a.incrementAndGet();
    }
}
