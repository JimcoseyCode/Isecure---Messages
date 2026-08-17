package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f16755a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f16756b = new F();

    static E a() {
        return f16755a;
    }

    static E b() {
        return f16756b;
    }

    private static E c() {
        if (U.f16788d) {
            return null;
        }
        try {
            return (E) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
