package d4;

import X3.g;
import Z3.c;
import a4.AbstractC1595a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import e4.AbstractC2412k;
import e4.InterfaceC2404c;
import e4.InterfaceC2405d;
import f4.C2612a;
import f4.InterfaceC2613b;
import g4.InterfaceC2673a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X3.e f25642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2405d f25643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f25644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f25645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2613b f25646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2673a f25647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC2673a f25648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC2404c f25649i;

    public r(Context context, X3.e eVar, InterfaceC2405d interfaceC2405d, x xVar, Executor executor, InterfaceC2613b interfaceC2613b, InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, InterfaceC2404c interfaceC2404c) {
        this.f25641a = context;
        this.f25642b = eVar;
        this.f25643c = interfaceC2405d;
        this.f25644d = xVar;
        this.f25645e = executor;
        this.f25646f = interfaceC2613b;
        this.f25647g = interfaceC2673a;
        this.f25648h = interfaceC2673a2;
        this.f25649i = interfaceC2404c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, W3.o oVar, long j10) {
        rVar.f25643c.z0(iterable);
        rVar.f25643c.x0(oVar, rVar.f25647g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f25649i.d();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f25643c.q(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, W3.o oVar, int i10) {
        rVar.f25644d.a(oVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, W3.o oVar, long j10) {
        rVar.f25643c.x0(oVar, rVar.f25647g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f25649i.k(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final W3.o oVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                InterfaceC2613b interfaceC2613b = rVar.f25646f;
                final InterfaceC2405d interfaceC2405d = rVar.f25643c;
                Objects.requireNonNull(interfaceC2405d);
                interfaceC2613b.e(new InterfaceC2613b.a() { // from class: d4.i
                    @Override // f4.InterfaceC2613b.a
                    public final Object execute() {
                        return Integer.valueOf(interfaceC2405d.f());
                    }
                });
                if (rVar.k()) {
                    rVar.l(oVar, i10);
                } else {
                    rVar.f25646f.e(new InterfaceC2613b.a() { // from class: d4.j
                        @Override // f4.InterfaceC2613b.a
                        public final Object execute() {
                            return r.f(this.f25622a, oVar, i10);
                        }
                    });
                }
                runnable.run();
            } catch (C2612a unused) {
                rVar.f25644d.a(oVar, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public W3.i j(X3.m mVar) {
        InterfaceC2613b interfaceC2613b = this.f25646f;
        final InterfaceC2404c interfaceC2404c = this.f25649i;
        Objects.requireNonNull(interfaceC2404c);
        return mVar.b(W3.i.a().i(this.f25647g.a()).k(this.f25648h.a()).j("GDT_CLIENT_METRICS").h(new W3.h(U3.c.b("proto"), ((Z3.a) interfaceC2613b.e(new InterfaceC2613b.a() { // from class: d4.h
            @Override // f4.InterfaceC2613b.a
            public final Object execute() {
                return interfaceC2404c.m();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f25641a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public X3.g l(final W3.o oVar, int i10) {
        X3.g gVarA;
        X3.m mVar = this.f25642b.get(oVar.b());
        X3.g gVarE = X3.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f25646f.e(new InterfaceC2613b.a() { // from class: d4.k
            @Override // f4.InterfaceC2613b.a
            public final Object execute() {
                return Boolean.valueOf(this.f25625a.f25643c.v0(oVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f25646f.e(new InterfaceC2613b.a() { // from class: d4.l
                @Override // f4.InterfaceC2613b.a
                public final Object execute() {
                    return this.f25627a.f25643c.N(oVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVar == null) {
                AbstractC1595a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                gVarA = X3.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC2412k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(mVar));
                }
                gVarA = mVar.a(X3.f.a().b(arrayList).c(oVar.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                final W3.o oVar2 = oVar;
                this.f25646f.e(new InterfaceC2613b.a() { // from class: d4.m
                    @Override // f4.InterfaceC2613b.a
                    public final Object execute() {
                        return r.b(this.f25629a, iterable, oVar2, j10);
                    }
                });
                this.f25644d.b(oVar2, i10 + 1, true);
                return gVarE;
            }
            W3.o oVar3 = oVar;
            this.f25646f.e(new InterfaceC2613b.a() { // from class: d4.n
                @Override // f4.InterfaceC2613b.a
                public final Object execute() {
                    return r.e(this.f25633a, iterable);
                }
            });
            if (gVarE.c() == g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (oVar3.e()) {
                    this.f25646f.e(new InterfaceC2613b.a() { // from class: d4.o
                        @Override // f4.InterfaceC2613b.a
                        public final Object execute() {
                            return r.c(this.f25635a);
                        }
                    });
                }
                j10 = jMax;
            } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((AbstractC2412k) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f25646f.e(new InterfaceC2613b.a() { // from class: d4.p
                    @Override // f4.InterfaceC2613b.a
                    public final Object execute() {
                        return r.h(this.f25636a, map);
                    }
                });
            }
            oVar = oVar3;
        }
        final W3.o oVar4 = oVar;
        this.f25646f.e(new InterfaceC2613b.a() { // from class: d4.q
            @Override // f4.InterfaceC2613b.a
            public final Object execute() {
                return r.g(this.f25638a, oVar4, j10);
            }
        });
        return gVarE;
    }

    public void m(final W3.o oVar, final int i10, final Runnable runnable) {
        this.f25645e.execute(new Runnable() { // from class: d4.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f25616g, oVar, i10, runnable);
            }
        });
    }
}
