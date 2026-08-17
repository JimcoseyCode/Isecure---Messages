package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC1731y f16740a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC1731y f16741b = new C1732z();

    static InterfaceC1731y a() {
        return f16740a;
    }

    static InterfaceC1731y b() {
        return f16741b;
    }

    private static InterfaceC1731y c() {
        if (U.f16788d) {
            return null;
        }
        try {
            return (InterfaceC1731y) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
