package g0;

import android.view.Surface;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;

/* JADX INFO: renamed from: g0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2646l {

    /* JADX INFO: renamed from: g0.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a extends b, b0.c {
    }

    /* JADX INFO: renamed from: g0.l$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
    }

    /* JADX INFO: renamed from: g0.l$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c extends b {

        /* JADX INFO: renamed from: g0.l$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public interface a {
            void a(Surface surface);
        }

        void b(Executor executor, a aVar);
    }

    void a();

    void b(long j10);

    b c();

    void d(InterfaceC2647m interfaceC2647m, Executor executor);

    g0 e();

    InterfaceFutureC2904a f();

    void g();

    int h();

    void pause();

    void start();
}
