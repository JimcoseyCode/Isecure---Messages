package c4;

import android.content.Context;
import d4.AbstractC2334f;
import d4.x;
import e4.InterfaceC2405d;
import g4.InterfaceC2673a;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f18822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f18823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f18824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f18825d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f18822a = provider;
        this.f18823b = provider2;
        this.f18824c = provider3;
        this.f18825d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, InterfaceC2405d interfaceC2405d, AbstractC2334f abstractC2334f, InterfaceC2673a interfaceC2673a) {
        return (x) Y3.d.c(h.a(context, interfaceC2405d, abstractC2334f, interfaceC2673a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f18822a.get(), (InterfaceC2405d) this.f18823b.get(), (AbstractC2334f) this.f18824c.get(), (InterfaceC2673a) this.f18825d.get());
    }
}
