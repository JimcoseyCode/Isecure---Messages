package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1723p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1721n f16952a = new C1722o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1721n f16953b = c();

    static AbstractC1721n a() {
        AbstractC1721n abstractC1721n = f16953b;
        if (abstractC1721n != null) {
            return abstractC1721n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC1721n b() {
        return f16952a;
    }

    private static AbstractC1721n c() {
        if (U.f16788d) {
            return null;
        }
        try {
            return (AbstractC1721n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
