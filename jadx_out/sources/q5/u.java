package q5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import z5.AbstractC3676a;
import z5.InterfaceC3677b;
import z5.InterfaceC3678c;
import z5.InterfaceC3679d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class u implements InterfaceC3679d, InterfaceC3678c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30818a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f30819b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f30820c;

    u(Executor executor) {
        this.f30820c = executor;
    }

    private synchronized Set d(AbstractC3676a abstractC3676a) {
        throw null;
    }

    @Override // z5.InterfaceC3679d
    public void a(Class cls, InterfaceC3677b interfaceC3677b) {
        f(cls, this.f30820c, interfaceC3677b);
    }

    void c() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f30819b;
                if (queue != null) {
                    this.f30819b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                e(null);
            }
        }
    }

    public void e(final AbstractC3676a abstractC3676a) {
        AbstractC3116C.b(abstractC3676a);
        synchronized (this) {
            try {
                Queue queue = this.f30819b;
                if (queue != null) {
                    queue.add(abstractC3676a);
                    return;
                }
                for (final Map.Entry entry : d(abstractC3676a)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, abstractC3676a) { // from class: q5.t

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f30817g;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC3677b) this.f30817g.getKey()).a(null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void f(Class cls, Executor executor, InterfaceC3677b interfaceC3677b) {
        try {
            AbstractC3116C.b(cls);
            AbstractC3116C.b(interfaceC3677b);
            AbstractC3116C.b(executor);
            if (!this.f30818a.containsKey(cls)) {
                this.f30818a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f30818a.get(cls)).put(interfaceC3677b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
