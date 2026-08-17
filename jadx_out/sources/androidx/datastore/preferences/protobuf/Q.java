package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final O f16781a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final O f16782b = new P();

    static O a() {
        return f16781a;
    }

    static O b() {
        return f16782b;
    }

    private static O c() {
        if (U.f16788d) {
            return null;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
