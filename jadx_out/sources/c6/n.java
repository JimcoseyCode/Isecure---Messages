package c6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18891b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18890a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f18892c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f18893d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f18890a) {
            try {
                if (this.f18892c.isEmpty()) {
                    this.f18891b = false;
                } else {
                    H h10 = (H) this.f18892c.remove();
                    e(h10.f18840a, h10.f18841b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: c6.F
                @Override // java.lang.Runnable
                public final void run() {
                    J j10 = new J(this.f18838g, null);
                    try {
                        runnable.run();
                        j10.close();
                    } catch (Throwable th) {
                        try {
                            j10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f18890a) {
            try {
                if (this.f18891b) {
                    this.f18892c.add(new H(executor, runnable, null));
                } else {
                    this.f18891b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
