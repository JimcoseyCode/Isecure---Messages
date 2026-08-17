package T;

import F.D1;
import F.E1;
import F.R0;
import F.S0;
import F.X0;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class h implements D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0 f10358a;

    h() {
        this(S0.i0());
    }

    @Override // F.D1.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i c() {
        return new i(X0.h0(this.f10358a));
    }

    @Override // y.InterfaceC3564I
    public R0 b() {
        return this.f10358a;
    }

    public h d(E1.b bVar) {
        b().X(D1.f1303G, bVar);
        return this;
    }

    public h e(Class cls) {
        b().X(K.q.f7019N, cls);
        if (b().f(K.q.f7018M, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public h f(String str) {
        b().X(K.q.f7018M, str);
        return this;
    }

    h(S0 s02) {
        this.f10358a = s02;
        Class cls = (Class) s02.f(K.q.f7019N, null);
        if (cls == null || cls.equals(g.class)) {
            d(E1.b.STREAM_SHARING);
            e(g.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
