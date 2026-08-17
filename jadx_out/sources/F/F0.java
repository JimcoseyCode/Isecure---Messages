package F;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface F0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(F0 f02);
    }

    androidx.camera.core.o b();

    int c();

    void close();

    void d();

    void e(a aVar, Executor executor);

    int f();

    androidx.camera.core.o g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
