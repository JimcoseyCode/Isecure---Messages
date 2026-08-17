package T;

import F.AbstractC0521z0;
import F.L;
import H.z;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class q extends AbstractC0521z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10387c;

    q(L l10) {
        super(l10);
        this.f10386b = "virtual-" + l10.f() + "-" + UUID.randomUUID().toString();
    }

    void B(int i10) {
        this.f10387c = i10;
    }

    @Override // F.AbstractC0521z0, y.InterfaceC3597q
    public int a() {
        return p(0);
    }

    @Override // F.AbstractC0521z0, F.L
    public String f() {
        return this.f10386b;
    }

    @Override // F.AbstractC0521z0, y.InterfaceC3597q
    public int p(int i10) {
        return z.v(super.p(i10) - this.f10387c);
    }
}
