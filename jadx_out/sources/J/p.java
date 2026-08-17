package J;

import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class p implements InterfaceFutureC2904a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    List f5307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    List f5308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f5309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicInteger f5310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceFutureC2904a f5311k = androidx.concurrent.futures.c.a(new a());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c.a f5312l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements c.InterfaceC0153c {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0153c
        public Object a(c.a aVar) {
            H0.g.j(p.this.f5312l == null, "The result can only set once!");
            p.this.f5312l = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f5308h = null;
            pVar.f5307g = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceFutureC2904a f5316h;

        c(int i10, InterfaceFutureC2904a interfaceFutureC2904a) {
            this.f5315g = i10;
            this.f5316h = interfaceFutureC2904a;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.e(this.f5315g, this.f5316h);
        }
    }

    p(List list, boolean z10, Executor executor) {
        this.f5307g = (List) H0.g.g(list);
        this.f5308h = new ArrayList(list.size());
        this.f5309i = z10;
        this.f5310j = new AtomicInteger(list.size());
        d(executor);
    }

    private void a() throws InterruptedException {
        List<InterfaceFutureC2904a> list = this.f5307g;
        if (list == null || isDone()) {
            return;
        }
        for (InterfaceFutureC2904a interfaceFutureC2904a : list) {
            while (!interfaceFutureC2904a.isDone()) {
                try {
                    interfaceFutureC2904a.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f5309i) {
                        return;
                    }
                }
            }
        }
    }

    private void d(Executor executor) {
        h(new b(), I.c.b());
        if (this.f5307g.isEmpty()) {
            this.f5312l.c(new ArrayList(this.f5308h));
            return;
        }
        for (int i10 = 0; i10 < this.f5307g.size(); i10++) {
            this.f5308h.add(null);
        }
        List list = this.f5307g;
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceFutureC2904a interfaceFutureC2904a = (InterfaceFutureC2904a) list.get(i11);
            interfaceFutureC2904a.h(new c(i11, interfaceFutureC2904a), executor);
        }
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List get() throws InterruptedException {
        a();
        return (List) this.f5311k.get();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List get(long j10, TimeUnit timeUnit) {
        return (List) this.f5311k.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List list = this.f5307g;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceFutureC2904a) it.next()).cancel(z10);
            }
        }
        return this.f5311k.cancel(z10);
    }

    void e(int i10, Future future) {
        c.a aVar;
        ArrayList arrayList;
        List list = this.f5308h;
        if (isDone() || list == null) {
            H0.g.j(this.f5309i, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            H0.g.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, n.m(future));
                            int iDecrementAndGet = this.f5310j.decrementAndGet();
                            H0.g.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List list2 = this.f5308h;
                                if (list2 != null) {
                                    this.f5312l.c(new ArrayList(list2));
                                } else {
                                    H0.g.i(isDone());
                                }
                            }
                        } catch (ExecutionException e10) {
                            if (this.f5309i) {
                                this.f5312l.f(e10.getCause());
                            }
                            int iDecrementAndGet2 = this.f5310j.decrementAndGet();
                            H0.g.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List list3 = this.f5308h;
                                if (list3 != null) {
                                    aVar = this.f5312l;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                H0.g.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f5309i) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f5310j.decrementAndGet();
                        H0.g.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List list4 = this.f5308h;
                            if (list4 != null) {
                                aVar = this.f5312l;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            H0.g.i(isDone());
                        }
                    }
                } catch (Error e11) {
                    this.f5312l.f(e11);
                    int iDecrementAndGet4 = this.f5310j.decrementAndGet();
                    H0.g.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List list5 = this.f5308h;
                        if (list5 != null) {
                            aVar = this.f5312l;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        H0.g.i(isDone());
                    }
                }
            } catch (RuntimeException e12) {
                if (this.f5309i) {
                    this.f5312l.f(e12);
                }
                int iDecrementAndGet5 = this.f5310j.decrementAndGet();
                H0.g.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List list6 = this.f5308h;
                    if (list6 != null) {
                        aVar = this.f5312l;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    H0.g.i(isDone());
                }
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = this.f5310j.decrementAndGet();
            H0.g.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List list7 = this.f5308h;
                if (list7 != null) {
                    this.f5312l.c(new ArrayList(list7));
                } else {
                    H0.g.i(isDone());
                }
            }
            throw th;
        }
    }

    @Override // m5.InterfaceFutureC2904a
    public void h(Runnable runnable, Executor executor) {
        this.f5311k.h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5311k.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f5311k.isDone();
    }
}
