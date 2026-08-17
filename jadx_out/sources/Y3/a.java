package Y3;

import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Provider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f12936c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Provider f12937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f12938b = f12936c;

    private a(Provider provider) {
        this.f12937a = provider;
    }

    public static Provider a(Provider provider) {
        d.b(provider);
        return provider instanceof a ? provider : new a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f12936c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f12938b;
        Object obj3 = f12936c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f12938b;
                if (obj == obj3) {
                    obj = this.f12937a.get();
                    this.f12938b = b(this.f12938b, obj);
                    this.f12937a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
