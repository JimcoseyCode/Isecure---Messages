package c6;

import H4.HandlerC0779a;
import P4.AbstractC1378l;
import P4.C1379m;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1862g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f18849b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1862g f18850c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f18851a;

    private C1862g(Looper looper) {
        this.f18851a = new HandlerC0779a(looper);
    }

    public static C1862g a() {
        C1862g c1862g;
        synchronized (f18849b) {
            try {
                if (f18850c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f18850c = new C1862g(handlerThread.getLooper());
                }
                c1862g = f18850c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1862g;
    }

    public static Executor d() {
        return t.f18900g;
    }

    public AbstractC1378l b(final Callable callable) {
        final C1379m c1379m = new C1379m();
        c(new Runnable() { // from class: c6.s
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C1379m c1379m2 = c1379m;
                try {
                    c1379m2.c(callable2.call());
                } catch (Y5.a e10) {
                    c1379m2.b(e10);
                } catch (Exception e11) {
                    c1379m2.b(new Y5.a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return c1379m.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
