package y1;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f33888a = Q1.l.g(20);

    c() {
    }

    abstract m a();

    m b() {
        m mVar = (m) this.f33888a.poll();
        return mVar == null ? a() : mVar;
    }

    public void c(m mVar) {
        if (this.f33888a.size() < 20) {
            this.f33888a.offer(mVar);
        }
    }
}
