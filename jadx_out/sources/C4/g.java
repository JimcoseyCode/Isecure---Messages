package c4;

import d4.AbstractC2334f;
import g4.InterfaceC2673a;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f18821a;

    public g(Provider provider) {
        this.f18821a = provider;
    }

    public static AbstractC2334f a(InterfaceC2673a interfaceC2673a) {
        return (AbstractC2334f) Y3.d.c(AbstractC1850f.a(interfaceC2673a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC2334f get() {
        return a((InterfaceC2673a) this.f18821a.get());
    }
}
