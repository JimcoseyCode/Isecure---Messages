package Z;

import F.C0494l0;
import F.V0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import y.I0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d0 f13353a = d(0, a.INACTIVE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Set f13354b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final V0 f13355c = C0494l0.f(d(0, a.ACTIVE));

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum a {
        ACTIVE,
        INACTIVE
    }

    d0() {
    }

    static d0 d(int i10, a aVar) {
        return new C1574m(i10, aVar, null);
    }

    static d0 e(int i10, a aVar, I0.h hVar) {
        return new C1574m(i10, aVar, hVar);
    }

    public abstract int a();

    public abstract I0.h b();

    public abstract a c();
}
