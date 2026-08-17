package e4;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class V implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f25862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25864c;

    public V(Provider provider, Provider provider2, Provider provider3) {
        this.f25862a = provider;
        this.f25863b = provider2;
        this.f25864c = provider3;
    }

    public static V a(Provider provider, Provider provider2, Provider provider3) {
        return new V(provider, provider2, provider3);
    }

    public static U c(Context context, String str, int i10) {
        return new U(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f25862a.get(), (String) this.f25863b.get(), ((Integer) this.f25864c.get()).intValue());
    }
}
