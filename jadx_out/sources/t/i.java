package T;

import F.D1;
import F.E0;
import F.InterfaceC0490j0;
import F.X0;
import K.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i implements D1, E0, r {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    static final InterfaceC0490j0.a f10359Q = InterfaceC0490j0.a.a("camerax.core.streamSharing.captureTypes", List.class);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final X0 f10360P;

    i(X0 x02) {
        this.f10360P = x02;
    }

    public List f0() {
        return (List) d(f10359Q);
    }

    @Override // F.h1
    public InterfaceC0490j0 o() {
        return this.f10360P;
    }
}
