package e4;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: e4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2409h implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f25880a;

    public C2409h(Provider provider) {
        this.f25880a = provider;
    }

    public static C2409h a(Provider provider) {
        return new C2409h(provider);
    }

    public static String c(Context context) {
        return (String) Y3.d.c(AbstractC2407f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f25880a.get());
    }
}
