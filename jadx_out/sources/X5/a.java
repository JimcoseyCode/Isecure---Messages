package X5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T5.b f12483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W5.b f12484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f12485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f12486d = new ConcurrentHashMap();

    a(T5.b bVar, W5.b bVar2, g gVar) {
        this.f12483a = bVar;
        this.f12484b = bVar2;
        this.f12485c = gVar;
    }

    private synchronized void b(String str) {
        try {
            if (this.f12486d.containsKey(str)) {
                return;
            }
            Iterator it = c(str).iterator();
            while (it.hasNext()) {
                this.f12485c.a((T5.g) it.next());
            }
            this.f12486d.put(str, str);
        } catch (Throwable th) {
            throw th;
        }
    }

    private Collection c(String str) {
        try {
            return this.f12484b.d(this.f12483a.a(str));
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw new IllegalStateException("Failed to read file " + str, e10);
        }
    }

    @Override // X5.f
    public g a(String str) {
        if (!this.f12486d.containsKey(str)) {
            b(str);
        }
        return this.f12485c;
    }
}
