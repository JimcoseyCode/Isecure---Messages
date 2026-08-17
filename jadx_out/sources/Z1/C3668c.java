package z1;

import Q1.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: z1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3668c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f34184a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f34185b = new b();

    /* JADX INFO: renamed from: z1.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f34186a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f34187b;

        a() {
        }
    }

    /* JADX INFO: renamed from: z1.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f34188a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f34188a) {
                aVar = (a) this.f34188a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f34188a) {
                try {
                    if (this.f34188a.size() < 10) {
                        this.f34188a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C3668c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = (a) this.f34184a.get(str);
                if (aVarA == null) {
                    aVarA = this.f34185b.a();
                    this.f34184a.put(str, aVarA);
                }
                aVarA.f34187b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarA.f34186a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.e((a) this.f34184a.get(str));
                int i10 = aVar.f34187b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f34187b);
                }
                int i11 = i10 - 1;
                aVar.f34187b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f34184a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f34185b.b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f34186a.unlock();
    }
}
