package x1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33461a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33462b = new HashMap();

    s() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f33462b : this.f33461a;
    }

    C3528l a(v1.f fVar, boolean z10) {
        return (C3528l) b(z10).get(fVar);
    }

    void c(v1.f fVar, C3528l c3528l) {
        b(c3528l.p()).put(fVar, c3528l);
    }

    void d(v1.f fVar, C3528l c3528l) {
        Map mapB = b(c3528l.p());
        if (c3528l.equals(mapB.get(fVar))) {
            mapB.remove(fVar);
        }
    }
}
