package K;

import F.InterfaceC0490j0;
import F.h1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface r extends h1 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final InterfaceC0490j0.a f7020O = InterfaceC0490j0.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor a0(Executor executor) {
        return (Executor) f(f7020O, executor);
    }
}
