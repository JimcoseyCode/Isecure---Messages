package Q5;

import N5.e;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f9850a;

    static {
        f9850a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f9850a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
