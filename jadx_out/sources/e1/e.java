package e1;

import i7.C2735B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import q.AbstractC3105o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f25814a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25815b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f25816c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f25817d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3105o.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(closeable, "closeable");
        if (this.f25817d) {
            f(closeable);
            return;
        }
        synchronized (this.f25814a) {
            autoCloseable = (AutoCloseable) this.f25815b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f25817d) {
            return;
        }
        this.f25817d = true;
        synchronized (this.f25814a) {
            try {
                Iterator it = this.f25815b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f25816c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f25816c.clear();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        AbstractC2855l.g(key, "key");
        synchronized (this.f25814a) {
            autoCloseable = (AutoCloseable) this.f25815b.get(key);
        }
        return autoCloseable;
    }
}
