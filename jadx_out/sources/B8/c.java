package B8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Lock lock, Runnable checkCancelled, Function1 interruptedExceptionHandler) {
        super(lock);
        AbstractC2855l.g(lock, "lock");
        AbstractC2855l.g(checkCancelled, "checkCancelled");
        AbstractC2855l.g(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f406c = checkCancelled;
        this.f407d = interruptedExceptionHandler;
    }

    @Override // B8.d, B8.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f406c.run();
            } catch (InterruptedException e10) {
                this.f407d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable checkCancelled, Function1 interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        AbstractC2855l.g(checkCancelled, "checkCancelled");
        AbstractC2855l.g(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
