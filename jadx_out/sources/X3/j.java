package X3;

import android.content.Context;
import g4.InterfaceC2673a;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f12473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f12474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f12475c;

    public j(Provider provider, Provider provider2, Provider provider3) {
        this.f12473a = provider;
        this.f12474b = provider2;
        this.f12475c = provider3;
    }

    public static j a(Provider provider, Provider provider2, Provider provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2) {
        return new i(context, interfaceC2673a, interfaceC2673a2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f12473a.get(), (InterfaceC2673a) this.f12474b.get(), (InterfaceC2673a) this.f12475c.get());
    }
}
