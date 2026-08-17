package o1;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: o1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3002b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3002b f30444d = new C3002b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f30445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f30446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f30447c;

    /* JADX INFO: renamed from: o1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class ExecutorC0334b implements Executor {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadLocal f30448g;

        private ExecutorC0334b() {
            this.f30448g = new ThreadLocal();
        }

        private int a() {
            Integer num = (Integer) this.f30448g.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f30448g.remove();
                return iIntValue;
            }
            this.f30448g.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        private int b() {
            Integer num = (Integer) this.f30448g.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f30448g.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    C3002b.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private C3002b() {
        this.f30445a = !c() ? Executors.newCachedThreadPool() : C3001a.b();
        this.f30446b = Executors.newSingleThreadScheduledExecutor();
        this.f30447c = new ExecutorC0334b();
    }

    public static ExecutorService a() {
        return f30444d.f30445a;
    }

    static Executor b() {
        return f30444d.f30447c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
