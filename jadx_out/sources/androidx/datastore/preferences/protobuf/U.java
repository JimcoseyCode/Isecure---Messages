package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U f16787c = new U();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f16788d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f16790b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f16789a = new B();

    private U() {
    }

    public static U a() {
        return f16787c;
    }

    public Y b(Class cls, Y y10) {
        AbstractC1727u.b(cls, "messageType");
        AbstractC1727u.b(y10, "schema");
        return (Y) this.f16790b.putIfAbsent(cls, y10);
    }

    public Y c(Class cls) {
        Y yB;
        AbstractC1727u.b(cls, "messageType");
        Y yA = (Y) this.f16790b.get(cls);
        return (yA != null || (yB = b(cls, (yA = this.f16789a.a(cls)))) == null) ? yA : yB;
    }

    public Y d(Object obj) {
        return c(obj.getClass());
    }
}
