package W3;

import c4.InterfaceC1849e;
import g4.InterfaceC2673a;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f12118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f12119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f12120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f12121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f12122e;

    public v(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f12118a = provider;
        this.f12119b = provider2;
        this.f12120c = provider3;
        this.f12121d = provider4;
        this.f12122e = provider5;
    }

    public static v a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t c(InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, InterfaceC1849e interfaceC1849e, d4.r rVar, d4.v vVar) {
        return new t(interfaceC2673a, interfaceC2673a2, interfaceC1849e, rVar, vVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((InterfaceC2673a) this.f12118a.get(), (InterfaceC2673a) this.f12119b.get(), (InterfaceC1849e) this.f12120c.get(), (d4.r) this.f12121d.get(), (d4.v) this.f12122e.get());
    }
}
