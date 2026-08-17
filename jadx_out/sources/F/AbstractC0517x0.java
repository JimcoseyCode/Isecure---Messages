package F;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: F.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1732a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f1733b = new HashMap();

    public static G a(Object obj) {
        G g10;
        synchronized (f1732a) {
            g10 = (G) f1733b.get(obj);
        }
        return g10 == null ? G.f1340a : g10;
    }
}
