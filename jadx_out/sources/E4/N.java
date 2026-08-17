package e4;

import g4.InterfaceC2673a;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class N implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f25847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25851e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f25847a = provider;
        this.f25848b = provider2;
        this.f25849c = provider3;
        this.f25850d = provider4;
        this.f25851e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, Object obj, Object obj2, Provider provider) {
        return new M(interfaceC2673a, interfaceC2673a2, (AbstractC2406e) obj, (U) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((InterfaceC2673a) this.f25847a.get(), (InterfaceC2673a) this.f25848b.get(), this.f25849c.get(), this.f25850d.get(), this.f25851e);
    }
}
