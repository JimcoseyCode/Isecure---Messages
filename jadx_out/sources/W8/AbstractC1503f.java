package W8;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: W8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1503f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f12175a = O8.l.S(O8.l.g(ServiceLoader.load(R8.K.class, R8.K.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f12175a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
