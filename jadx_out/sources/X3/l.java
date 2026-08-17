package X3;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f12481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f12482b;

    public l(Provider provider, Provider provider2) {
        this.f12481a = provider;
        this.f12482b = provider2;
    }

    public static l a(Provider provider, Provider provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f12481a.get(), this.f12482b.get());
    }
}
