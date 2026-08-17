package F;

import F.AbstractC0504q0;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import m5.InterfaceFutureC2904a;

/* JADX INFO: renamed from: F.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0509t0 {

    /* JADX INFO: renamed from: F.t0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f1690b;

        a(boolean z10, c.a aVar) {
            this.f1689a = z10;
            this.f1690b = aVar;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            H0.g.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f1689a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f1690b.c(arrayList);
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (th instanceof TimeoutException) {
                this.f1690b.f(th);
            } else {
                this.f1690b.c(Collections.EMPTY_LIST);
            }
        }
    }

    public static /* synthetic */ Object a(final InterfaceFutureC2904a interfaceFutureC2904a, Executor executor, boolean z10, Collection collection, c.a aVar) {
        aVar.a(new Runnable() { // from class: F.s0
            @Override // java.lang.Runnable
            public final void run() {
                interfaceFutureC2904a.cancel(true);
            }
        }, executor);
        J.n.j(interfaceFutureC2904a, new a(z10, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0504q0) it.next()).e();
        }
    }

    public static void d(List list) throws AbstractC0504q0.a {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                ((AbstractC0504q0) list.get(i10)).l();
                i10++;
            } catch (AbstractC0504q0.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    ((AbstractC0504q0) list.get(i11)).e();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    public static InterfaceFutureC2904a e(final Collection collection, final boolean z10, long j10, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(J.n.s(((AbstractC0504q0) it.next()).j()));
        }
        final InterfaceFutureC2904a interfaceFutureC2904aR = J.n.r(j10, scheduledExecutorService, J.n.w(arrayList));
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: F.r0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return AbstractC0509t0.a(interfaceFutureC2904aR, executor, z10, collection, aVar);
            }
        });
    }
}
