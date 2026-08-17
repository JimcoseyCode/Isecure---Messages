package c6;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: c6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1856a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f18843a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f18844b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0201a {
        void a();
    }

    private C1856a() {
    }

    public static C1856a a() {
        C1856a c1856a = new C1856a();
        c1856a.b(c1856a, new Runnable() { // from class: c6.o
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c1856a.f18843a;
        final Set set = c1856a.f18844b;
        Thread thread = new Thread(new Runnable() { // from class: c6.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((r) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c1856a;
    }

    public InterfaceC0201a b(Object obj, Runnable runnable) {
        r rVar = new r(obj, this.f18843a, this.f18844b, runnable, null);
        this.f18844b.add(rVar);
        return rVar;
    }
}
