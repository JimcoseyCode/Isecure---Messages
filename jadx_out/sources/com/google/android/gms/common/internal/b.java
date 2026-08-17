package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import r4.AbstractC3268i;
import r4.C3269j;
import r4.F;
import r4.InterfaceC3265f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f21206e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    z f21208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f21209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f21210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.common.internal.d f21211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.b f21212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Handler f21213l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC3265f f21216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected c f21217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IInterface f21218q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private q f21220s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final a f21222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC0222b f21223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f21224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f21225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile String f21226y;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Feature[] f21198E = new Feature[0];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f21197D = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f21207f = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f21214m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f21215n = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f21219r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f21221t = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ConnectionResult f21227z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f21199A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile zzk f21200B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected AtomicInteger f21201C = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void c(int i10);

        void f(Bundle bundle);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0222b {
        void d(ConnectionResult connectionResult);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.l0()) {
                b bVar = b.this;
                bVar.b(null, bVar.B());
            } else if (b.this.f21223v != null) {
                b.this.f21223v.d(connectionResult);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {
        void a();
    }

    protected b(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, com.google.android.gms.common.b bVar, int i10, a aVar, InterfaceC0222b interfaceC0222b, String str) {
        AbstractC3268i.l(context, "Context must not be null");
        this.f21209h = context;
        AbstractC3268i.l(looper, "Looper must not be null");
        this.f21210i = looper;
        AbstractC3268i.l(dVar, "Supervisor must not be null");
        this.f21211j = dVar;
        AbstractC3268i.l(bVar, "API availability must not be null");
        this.f21212k = bVar;
        this.f21213l = new n(this, looper);
        this.f21224w = i10;
        this.f21222u = aVar;
        this.f21223v = interfaceC0222b;
        this.f21225x = str;
    }

    static /* bridge */ /* synthetic */ void a0(b bVar, zzk zzkVar) {
        bVar.f21200B = zzkVar;
        if (bVar.Q()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f21290j;
            C3269j.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.t0());
        }
    }

    static /* bridge */ /* synthetic */ void b0(b bVar, int i10) {
        int i11;
        int i12;
        synchronized (bVar.f21214m) {
            i11 = bVar.f21221t;
        }
        if (i11 == 3) {
            bVar.f21199A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = bVar.f21213l;
        handler.sendMessage(handler.obtainMessage(i12, bVar.f21201C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.f21214m) {
            try {
                if (bVar.f21221t != i10) {
                    return false;
                }
                bVar.g0(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(b bVar) {
        if (bVar.f21199A || TextUtils.isEmpty(bVar.D()) || TextUtils.isEmpty(bVar.A())) {
            return false;
        }
        try {
            Class.forName(bVar.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(int i10, IInterface iInterface) {
        z zVar;
        AbstractC3268i.a((i10 == 4) == (iInterface != null));
        synchronized (this.f21214m) {
            try {
                this.f21221t = i10;
                this.f21218q = iInterface;
                if (i10 == 1) {
                    q qVar = this.f21220s;
                    if (qVar != null) {
                        com.google.android.gms.common.internal.d dVar = this.f21211j;
                        String strB = this.f21208g.b();
                        AbstractC3268i.k(strB);
                        dVar.d(strB, this.f21208g.a(), 4225, qVar, V(), this.f21208g.c());
                        this.f21220s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    q qVar2 = this.f21220s;
                    if (qVar2 != null && (zVar = this.f21208g) != null) {
                        zVar.b();
                        zVar.a();
                        com.google.android.gms.common.internal.d dVar2 = this.f21211j;
                        String strB2 = this.f21208g.b();
                        AbstractC3268i.k(strB2);
                        dVar2.d(strB2, this.f21208g.a(), 4225, qVar2, V(), this.f21208g.c());
                        this.f21201C.incrementAndGet();
                    }
                    q qVar3 = new q(this, this.f21201C.get());
                    this.f21220s = qVar3;
                    z zVar2 = (this.f21221t != 3 || A() == null) ? new z(F(), E(), false, 4225, H()) : new z(x().getPackageName(), A(), true, 4225, false);
                    this.f21208g = zVar2;
                    if (zVar2.c() && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f21208g.b())));
                    }
                    com.google.android.gms.common.internal.d dVar3 = this.f21211j;
                    String strB3 = this.f21208g.b();
                    AbstractC3268i.k(strB3);
                    if (!dVar3.e(new F(strB3, this.f21208g.a(), 4225, this.f21208g.c()), qVar3, V(), v())) {
                        this.f21208g.b();
                        this.f21208g.a();
                        c0(16, null, this.f21201C.get());
                    }
                } else if (i10 == 4) {
                    AbstractC3268i.k(iInterface);
                    J(iInterface);
                }
            } finally {
            }
        }
    }

    protected String A() {
        return null;
    }

    protected abstract Set B();

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f21214m) {
            try {
                if (this.f21221t == 5) {
                    throw new DeadObjectException();
                }
                q();
                iInterface = this.f21218q;
                AbstractC3268i.l(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    protected abstract String D();

    protected abstract String E();

    protected String F() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration G() {
        zzk zzkVar = this.f21200B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f21290j;
    }

    protected boolean H() {
        return l() >= 211700000;
    }

    public boolean I() {
        return this.f21200B != null;
    }

    protected void J(IInterface iInterface) {
        this.f21204c = System.currentTimeMillis();
    }

    protected void K(ConnectionResult connectionResult) {
        this.f21205d = connectionResult.e();
        this.f21206e = System.currentTimeMillis();
    }

    protected void L(int i10) {
        this.f21202a = i10;
        this.f21203b = System.currentTimeMillis();
    }

    protected void M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.f21213l.sendMessage(this.f21213l.obtainMessage(1, i11, -1, new r(this, i10, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f21226y = str;
    }

    public void P(int i10) {
        this.f21213l.sendMessage(this.f21213l.obtainMessage(6, this.f21201C.get(), i10));
    }

    public boolean Q() {
        return false;
    }

    protected final String V() {
        String str = this.f21225x;
        return str == null ? this.f21209h.getClass().getName() : str;
    }

    public void b(com.google.android.gms.common.internal.e eVar, Set set) {
        Bundle bundleZ = z();
        String str = this.f21226y;
        int i10 = com.google.android.gms.common.b.f21112a;
        Scope[] scopeArr = GetServiceRequest.f21165u;
        Bundle bundle = new Bundle();
        int i11 = this.f21224w;
        Feature[] featureArr = GetServiceRequest.f21166v;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i11, i10, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f21170j = this.f21209h.getPackageName();
        getServiceRequest.f21173m = bundleZ;
        if (set != null) {
            getServiceRequest.f21172l = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountT = t();
            if (accountT == null) {
                accountT = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f21174n = accountT;
            if (eVar != null) {
                getServiceRequest.f21171k = eVar.asBinder();
            }
        } else if (N()) {
            getServiceRequest.f21174n = t();
        }
        getServiceRequest.f21175o = f21198E;
        getServiceRequest.f21176p = u();
        if (Q()) {
            getServiceRequest.f21179s = true;
        }
        try {
            try {
                synchronized (this.f21215n) {
                    try {
                        InterfaceC3265f interfaceC3265f = this.f21216o;
                        if (interfaceC3265f != null) {
                            interfaceC3265f.i(new p(this, this.f21201C.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                M(8, null, null, this.f21201C.get());
            }
        } catch (DeadObjectException unused2) {
            P(3);
        } catch (SecurityException e10) {
            throw e10;
        }
    }

    public void c(String str) {
        this.f21207f = str;
        g();
    }

    protected final void c0(int i10, Bundle bundle, int i11) {
        this.f21213l.sendMessage(this.f21213l.obtainMessage(7, i11, -1, new s(this, i10, null)));
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f21214m) {
            int i10 = this.f21221t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public String e() {
        z zVar;
        if (!i() || (zVar = this.f21208g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return zVar.a();
    }

    public void f(c cVar) {
        AbstractC3268i.l(cVar, "Connection progress callbacks cannot be null.");
        this.f21217p = cVar;
        g0(2, null);
    }

    public void g() {
        this.f21201C.incrementAndGet();
        synchronized (this.f21219r) {
            try {
                int size = this.f21219r.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((o) this.f21219r.get(i10)).d();
                }
                this.f21219r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f21215n) {
            this.f21216o = null;
        }
        g0(1, null);
    }

    public void h(e eVar) {
        eVar.a();
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f21214m) {
            z10 = this.f21221t == 4;
        }
        return z10;
    }

    public boolean j() {
        return true;
    }

    public abstract int l();

    public final Feature[] m() {
        zzk zzkVar = this.f21200B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f21288h;
    }

    public String n() {
        return this.f21207f;
    }

    public boolean o() {
        return false;
    }

    protected final void q() {
        if (!i()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface r(IBinder iBinder);

    protected boolean s() {
        return false;
    }

    public abstract Account t();

    public Feature[] u() {
        return f21198E;
    }

    protected abstract Executor v();

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f21209h;
    }

    public int y() {
        return this.f21224w;
    }

    protected Bundle z() {
        return new Bundle();
    }
}
