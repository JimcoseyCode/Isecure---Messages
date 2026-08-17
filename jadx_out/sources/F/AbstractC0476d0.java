package F;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: F.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0476d0 {
    public static AbstractC0476d0 a(Executor executor, Handler handler) {
        return new C0485h(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
