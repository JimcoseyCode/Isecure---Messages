package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1719l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f16943a = c();

    public static C1720m a() {
        C1720m c1720mB = b("getEmptyRegistry");
        return c1720mB != null ? c1720mB : C1720m.f16948c;
    }

    private static final C1720m b(String str) {
        Class cls = f16943a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1720m) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
