package J1;

import J1.b;
import Q1.f;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f5352d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f5353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f5354b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5355c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5356a;

        a(Context context) {
            this.f5356a = context;
        }

        @Override // Q1.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f5356a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements b.a {
        b() {
        }

        @Override // J1.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            Q1.l.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f5354b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {
        boolean a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f5359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b.a f5360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.b f5361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f5362d = new a();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: J1.r$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            class RunnableC0056a implements Runnable {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f5364g;

                RunnableC0056a(boolean z10) {
                    this.f5364g = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f5364g);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                Q1.l.w(new RunnableC0056a(z10));
            }

            void a(boolean z10) {
                Q1.l.b();
                d dVar = d.this;
                boolean z11 = dVar.f5359a;
                dVar.f5359a = z10;
                if (z11 != z10) {
                    dVar.f5360b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, b.a aVar) {
            this.f5361c = bVar;
            this.f5360b = aVar;
        }

        @Override // J1.r.c
        public boolean a() {
            this.f5359a = ((ConnectivityManager) this.f5361c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f5361c.get()).registerDefaultNetworkCallback(this.f5362d);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // J1.r.c
        public void b() {
            ((ConnectivityManager) this.f5361c.get()).unregisterNetworkCallback(this.f5362d);
        }
    }

    private r(Context context) {
        this.f5353a = new d(Q1.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f5352d == null) {
            synchronized (r.class) {
                try {
                    if (f5352d == null) {
                        f5352d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f5352d;
    }

    private void b() {
        if (this.f5355c || this.f5354b.isEmpty()) {
            return;
        }
        this.f5355c = this.f5353a.a();
    }

    private void c() {
        if (this.f5355c && this.f5354b.isEmpty()) {
            this.f5353a.b();
            this.f5355c = false;
        }
    }

    synchronized void d(b.a aVar) {
        this.f5354b.add(aVar);
        b();
    }

    synchronized void e(b.a aVar) {
        this.f5354b.remove(aVar);
        c();
    }
}
