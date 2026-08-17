package q5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class x implements C5.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f30825b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f30824a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f30824a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f30824a.iterator();
            while (it.hasNext()) {
                this.f30825b.add(((C5.b) it.next()).get());
            }
            this.f30824a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(C5.b bVar) {
        try {
            if (this.f30825b == null) {
                this.f30824a.add(bVar);
            } else {
                this.f30825b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // C5.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f30825b == null) {
            synchronized (this) {
                try {
                    if (this.f30825b == null) {
                        this.f30825b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f30825b);
    }
}
