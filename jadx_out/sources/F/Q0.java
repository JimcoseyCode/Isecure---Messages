package F;

import F.Q0;
import F.V0;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.lifecycle.A f1372a = new androidx.lifecycle.A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f1373b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.B f1374c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f1375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f1376b;

        private a(Object obj, Throwable th) {
            this.f1375a = obj;
            this.f1376b = th;
        }

        static a b(Object obj) {
            return new a(obj, null);
        }

        public boolean a() {
            return this.f1376b == null;
        }

        public Throwable c() {
            return this.f1376b;
        }

        public Object d() {
            if (a()) {
                return this.f1375a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f1375a;
            } else {
                str = "Error: " + this.f1376b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    public static /* synthetic */ void b(Q0 q02, final a aVar) {
        HashMap map;
        synchronized (q02.f1373b) {
            map = new HashMap(q02.f1373b);
        }
        for (final Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: F.J0
                @Override // java.lang.Runnable
                public final void run() {
                    Q0.f(entry, aVar);
                }
            });
        }
    }

    public static /* synthetic */ void f(Map.Entry entry, a aVar) {
        V0.a aVar2 = (V0.a) entry.getKey();
        if (aVar.a()) {
            aVar2.a(aVar.d());
        } else {
            H0.g.g(aVar.c());
            aVar2.onError(aVar.c());
        }
    }

    public static /* synthetic */ Object g(final Q0 q02, final c.a aVar) {
        q02.getClass();
        I.c.e().execute(new Runnable() { // from class: F.O0
            @Override // java.lang.Runnable
            public final void run() {
                Q0.k(this.f1365g, aVar);
            }
        });
        return q02 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void h(final Q0 q02) {
        if (q02.f1374c == null) {
            q02.f1374c = new androidx.lifecycle.B() { // from class: F.P0
                @Override // androidx.lifecycle.B
                public final void onChanged(Object obj) {
                    Q0.b(this.f1369a, (Q0.a) obj);
                }
            };
        }
        q02.f1372a.i(q02.f1374c);
    }

    public static /* synthetic */ void i(Q0 q02) {
        androidx.lifecycle.B b10 = q02.f1374c;
        if (b10 != null) {
            q02.f1372a.m(b10);
        }
    }

    public static /* synthetic */ void j(Q0 q02, V0.a aVar) {
        a aVar2 = (a) q02.f1372a.e();
        if (aVar2 == null) {
            return;
        }
        if (aVar2.a()) {
            aVar.a(aVar2.d());
        } else {
            H0.g.g(aVar2.c());
            aVar.onError(aVar2.c());
        }
    }

    public static /* synthetic */ void k(Q0 q02, c.a aVar) {
        a aVar2 = (a) q02.f1372a.e();
        if (aVar2 == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (aVar2.a()) {
            aVar.c(aVar2.d());
        } else {
            H0.g.g(aVar2.c());
            aVar.f(aVar2.c());
        }
    }

    private void l() {
        I.c.e().execute(new Runnable() { // from class: F.M0
            @Override // java.lang.Runnable
            public final void run() {
                Q0.i(this.f1363g);
            }
        });
    }

    private void m() {
        I.c.e().execute(new Runnable() { // from class: F.N0
            @Override // java.lang.Runnable
            public final void run() {
                Q0.h(this.f1364g);
            }
        });
    }

    @Override // F.V0
    public void c(Executor executor, final V0.a aVar) {
        synchronized (this.f1373b) {
            try {
                boolean zIsEmpty = this.f1373b.isEmpty();
                this.f1373b.put(aVar, executor);
                if (zIsEmpty) {
                    m();
                } else {
                    executor.execute(new Runnable() { // from class: F.K0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q0.j(this.f1350g, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.V0
    public InterfaceFutureC2904a d() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: F.L0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return Q0.g(this.f1352a, aVar);
            }
        });
    }

    @Override // F.V0
    public void e(V0.a aVar) {
        synchronized (this.f1373b) {
            try {
                this.f1373b.remove(aVar);
                if (this.f1373b.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(Object obj) {
        this.f1372a.l(a.b(obj));
    }
}
