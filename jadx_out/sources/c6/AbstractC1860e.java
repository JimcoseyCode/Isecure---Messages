package c6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1860e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18848a = new HashMap();

    protected abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f18848a) {
            try {
                if (this.f18848a.containsKey(obj)) {
                    return this.f18848a.get(obj);
                }
                Object objA = a(obj);
                this.f18848a.put(obj, objA);
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
