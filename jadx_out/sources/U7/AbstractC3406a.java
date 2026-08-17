package u7;

import i7.AbstractC2738a;
import q.AbstractC3105o;

/* JADX INFO: renamed from: u7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3406a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                AbstractC3105o.a(autoCloseable);
                return;
            }
            try {
                AbstractC3105o.a(autoCloseable);
            } catch (Throwable th2) {
                AbstractC2738a.a(th, th2);
            }
        }
    }
}
