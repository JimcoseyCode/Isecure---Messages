package F;

import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface V0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(Object obj);

        void onError(Throwable th);
    }

    void c(Executor executor, a aVar);

    InterfaceFutureC2904a d();

    void e(a aVar);
}
