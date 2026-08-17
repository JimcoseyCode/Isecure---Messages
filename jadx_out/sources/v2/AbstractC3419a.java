package v2;

import android.os.Looper;

/* JADX INFO: renamed from: v2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3419a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC3419a f32894a;

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0362a {
        void a();
    }

    public static synchronized AbstractC3419a b() {
        try {
            if (f32894a == null) {
                f32894a = new C3420b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f32894a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0362a interfaceC0362a);

    public abstract void d(InterfaceC0362a interfaceC0362a);
}
