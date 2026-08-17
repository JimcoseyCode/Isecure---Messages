package h6;

import I4.J9;
import c6.C1859d;
import c6.C1864i;
import e6.C2428b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f28469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1859d f28470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1864i f28471c;

    f(h hVar, C1859d c1859d, C1864i c1864i) {
        this.f28469a = hVar;
        this.f28470b = c1859d;
        this.f28471c = c1864i;
    }

    public final g a(C2428b c2428b) {
        return new g(c2428b, (k) this.f28469a.b(c2428b), this.f28470b.a(c2428b.c()), J9.b(b.d()), this.f28471c);
    }
}
