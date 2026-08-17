package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1711d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f16821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f16822b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f16823c;

    static {
        f16823c = (f16821a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f16822b;
    }

    static boolean c() {
        if (f16821a) {
            return true;
        }
        return (f16822b == null || f16823c) ? false : true;
    }
}
