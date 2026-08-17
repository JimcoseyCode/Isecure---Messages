package androidx.camera.view;

import F.L;
import F.M;
import F.V0;
import androidx.camera.view.m;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;
import y.AbstractC3583h0;
import y.InterfaceC3597q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class e implements V0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f15334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.A f15335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m.e f15336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f15337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    InterfaceFutureC2904a f15338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15339f = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f15340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3597q f15341b;

        a(List list, InterfaceC3597q interfaceC3597q) {
            this.f15340a = list;
            this.f15341b = interfaceC3597q;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            e.this.f15338e = null;
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            e.this.f15338e = null;
            if (this.f15340a.isEmpty()) {
                return;
            }
            Iterator it = this.f15340a.iterator();
            while (it.hasNext()) {
                ((L) this.f15341b).l((F.r) it.next());
            }
            this.f15340a.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends F.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f15343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3597q f15344b;

        b(c.a aVar, InterfaceC3597q interfaceC3597q) {
            this.f15343a = aVar;
            this.f15344b = interfaceC3597q;
        }

        @Override // F.r
        public void b(int i10, F.B b10) {
            this.f15343a.c(null);
            ((L) this.f15344b).l(this);
        }
    }

    e(L l10, androidx.lifecycle.A a10, n nVar) {
        this.f15334a = l10;
        this.f15335b = a10;
        this.f15337d = nVar;
        synchronized (this) {
            this.f15336c = (m.e) a10.e();
        }
    }

    public static /* synthetic */ Object b(e eVar, InterfaceC3597q interfaceC3597q, List list, c.a aVar) {
        eVar.getClass();
        b bVar = eVar.new b(aVar, interfaceC3597q);
        list.add(bVar);
        ((L) interfaceC3597q).z(I.c.b(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(e eVar, Void r12) {
        eVar.getClass();
        eVar.i(m.e.STREAMING);
        return null;
    }

    private void e() {
        InterfaceFutureC2904a interfaceFutureC2904a = this.f15338e;
        if (interfaceFutureC2904a != null) {
            interfaceFutureC2904a.cancel(false);
            this.f15338e = null;
        }
    }

    private void h(InterfaceC3597q interfaceC3597q) {
        i(m.e.IDLE);
        ArrayList arrayList = new ArrayList();
        J.d dVarD = J.d.a(j(interfaceC3597q, arrayList)).e(new J.a() { // from class: androidx.camera.view.b
            @Override // J.a
            public final InterfaceFutureC2904a apply(Object obj) {
                return this.f15329a.f15337d.i();
            }
        }, I.c.b()).d(new InterfaceC2955a() { // from class: androidx.camera.view.c
            @Override // n.InterfaceC2955a
            public final Object apply(Object obj) {
                return e.d(this.f15330a, (Void) obj);
            }
        }, I.c.b());
        this.f15338e = dVarD;
        J.n.j(dVarD, new a(arrayList, interfaceC3597q), I.c.b());
    }

    private InterfaceFutureC2904a j(final InterfaceC3597q interfaceC3597q, final List list) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: androidx.camera.view.d
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return e.b(this.f15331a, interfaceC3597q, list, aVar);
            }
        });
    }

    void f() {
        e();
    }

    @Override // F.V0.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(M.a aVar) {
        if (aVar == M.a.CLOSING || aVar == M.a.CLOSED || aVar == M.a.RELEASING || aVar == M.a.RELEASED) {
            i(m.e.IDLE);
            if (this.f15339f) {
                this.f15339f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == M.a.OPENING || aVar == M.a.OPEN || aVar == M.a.PENDING_OPEN) && !this.f15339f) {
            h(this.f15334a);
            this.f15339f = true;
        }
    }

    void i(m.e eVar) {
        synchronized (this) {
            try {
                if (this.f15336c.equals(eVar)) {
                    return;
                }
                this.f15336c = eVar;
                AbstractC3583h0.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f15335b.l(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.V0.a
    public void onError(Throwable th) {
        f();
        i(m.e.IDLE);
    }
}
