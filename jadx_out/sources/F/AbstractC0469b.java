package F;

import F.V0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import y.C3596p;

/* JADX INFO: renamed from: F.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0469b implements V0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f1423c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1421a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f1422b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f1424d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1425e = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Executor f1426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V0.a f1427b;

        a(Executor executor, V0.a aVar) {
            this.f1426a = executor;
            this.f1427b = aVar;
        }
    }

    public AbstractC0469b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3596p.a((String) it.next()));
        }
        this.f1423c = arrayList;
    }

    public static /* synthetic */ void b(Throwable th, a aVar, List list) {
        if (th != null) {
            aVar.f1427b.onError(th);
        } else {
            aVar.f1427b.a(list);
        }
    }

    private void f(final a aVar, final List list, final Throwable th) {
        aVar.f1426a.execute(new Runnable() { // from class: F.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0469b.b(th, aVar, list);
            }
        });
    }

    private void k(List list, Throwable th) {
        boolean z10;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.f1421a) {
            z10 = true;
            try {
                if (th != null) {
                    if (this.f1424d != null && this.f1423c.isEmpty()) {
                        z10 = false;
                    }
                    this.f1424d = th;
                    this.f1423c = Collections.EMPTY_LIST;
                } else {
                    H0.g.g(list);
                    if (this.f1424d == null && this.f1423c.equals(list)) {
                        z10 = false;
                    }
                    this.f1424d = null;
                    this.f1423c = list;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f1423c);
                th2 = this.f1424d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            this.f1422b.size();
            Iterator it = this.f1422b.iterator();
            while (it.hasNext()) {
                f((a) it.next(), listUnmodifiableList, th2);
            }
        }
    }

    @Override // F.V0
    public void c(Executor executor, V0.a aVar) {
        List listUnmodifiableList;
        Throwable th;
        H0.g.g(executor);
        H0.g.g(aVar);
        this.f1422b.add(new a(executor, aVar));
        synchronized (this.f1421a) {
            try {
                if (!this.f1425e && !this.f1422b.isEmpty()) {
                    this.f1425e = true;
                    g();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f1423c);
                th = this.f1424d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f(new a(executor, aVar), listUnmodifiableList, th);
    }

    @Override // F.V0
    public void e(V0.a aVar) {
        a aVar2;
        H0.g.g(aVar);
        Iterator it = this.f1422b.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            } else {
                aVar2 = (a) it.next();
                if (aVar2.f1427b.equals(aVar)) {
                    break;
                }
            }
        }
        if (aVar2 != null) {
            this.f1422b.remove(aVar2);
        }
        synchronized (this.f1421a) {
            try {
                if (this.f1425e && this.f1422b.isEmpty()) {
                    this.f1425e = false;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void g();

    protected abstract void h();

    protected void i(List list) {
        k(list, null);
    }

    protected void j(Throwable th) {
        k(null, th);
    }
}
