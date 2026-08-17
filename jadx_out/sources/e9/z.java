package e9;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import e9.InterfaceC2437e;
import e9.r;
import j7.AbstractC2800q;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o9.j;
import r9.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class z implements Cloneable, InterfaceC2437e.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final HostnameVerifier f26375A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final C2439g f26376B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final r9.c f26377C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f26378D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f26379E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f26380F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f26381G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f26382H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final long f26383I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final j9.i f26384J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f26385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k f26386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f26387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f26388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r.c f26389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f26390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC2434b f26391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f26392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f26393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final n f26394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C2435c f26395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final q f26396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Proxy f26397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ProxySelector f26398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC2434b f26399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SocketFactory f26400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final SSLSocketFactory f26401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final X509TrustManager f26402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f26403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f26404z;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final b f26374M = new b(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final List f26372K = f9.c.t(A.HTTP_2, A.HTTP_1_1);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final List f26373L = f9.c.t(l.f26263h, l.f26265j);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public final List a() {
            return z.f26373L;
        }

        public final List b() {
            return z.f26372K;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public z(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorG;
        AbstractC2855l.g(builder, "builder");
        this.f26385g = builder.t();
        this.f26386h = builder.q();
        this.f26387i = f9.c.R(builder.z());
        this.f26388j = f9.c.R(builder.B());
        this.f26389k = builder.v();
        this.f26390l = builder.I();
        this.f26391m = builder.k();
        this.f26392n = builder.w();
        this.f26393o = builder.x();
        this.f26394p = builder.s();
        this.f26395q = builder.l();
        this.f26396r = builder.u();
        this.f26397s = builder.E();
        if (builder.E() != null) {
            proxySelectorG = q9.a.f30896a;
        } else {
            proxySelectorG = builder.G();
            proxySelectorG = proxySelectorG == null ? ProxySelector.getDefault() : proxySelectorG;
            if (proxySelectorG == null) {
                proxySelectorG = q9.a.f30896a;
            }
        }
        this.f26398t = proxySelectorG;
        this.f26399u = builder.F();
        this.f26400v = builder.K();
        List listR = builder.r();
        this.f26403y = listR;
        this.f26404z = builder.D();
        this.f26375A = builder.y();
        this.f26378D = builder.m();
        this.f26379E = builder.p();
        this.f26380F = builder.H();
        this.f26381G = builder.M();
        this.f26382H = builder.C();
        this.f26383I = builder.A();
        j9.i iVarJ = builder.J();
        this.f26384J = iVarJ == null ? new j9.i() : iVarJ;
        if (listR == null || !listR.isEmpty()) {
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (builder.L() != null) {
                        this.f26401w = builder.L();
                        r9.c cVarN = builder.n();
                        AbstractC2855l.d(cVarN);
                        this.f26377C = cVarN;
                        X509TrustManager x509TrustManagerN = builder.N();
                        AbstractC2855l.d(x509TrustManagerN);
                        this.f26402x = x509TrustManagerN;
                        C2439g c2439gO = builder.o();
                        AbstractC2855l.d(cVarN);
                        this.f26376B = c2439gO.e(cVarN);
                    } else {
                        j.a aVar = o9.j.f30594c;
                        X509TrustManager x509TrustManagerP = aVar.g().p();
                        this.f26402x = x509TrustManagerP;
                        o9.j jVarG = aVar.g();
                        AbstractC2855l.d(x509TrustManagerP);
                        this.f26401w = jVarG.o(x509TrustManagerP);
                        c.a aVar2 = r9.c.f31988a;
                        AbstractC2855l.d(x509TrustManagerP);
                        r9.c cVarA = aVar2.a(x509TrustManagerP);
                        this.f26377C = cVarA;
                        C2439g c2439gO2 = builder.o();
                        AbstractC2855l.d(cVarA);
                        this.f26376B = c2439gO2.e(cVarA);
                    }
                }
            }
            this.f26401w = null;
            this.f26377C = null;
            this.f26402x = null;
            this.f26376B = C2439g.f26126c;
        } else {
            this.f26401w = null;
            this.f26377C = null;
            this.f26402x = null;
            this.f26376B = C2439g.f26126c;
        }
        N();
    }

    private final void N() {
        List list = this.f26387i;
        if (list == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f26387i).toString());
        }
        List list2 = this.f26388j;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f26388j).toString());
        }
        List list3 = this.f26403y;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (this.f26401w == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f26377C == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f26402x == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (!(this.f26401w == null)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!(this.f26377C == null)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!(this.f26402x == null)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC2855l.b(this.f26376B, C2439g.f26126c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final long A() {
        return this.f26383I;
    }

    public final List B() {
        return this.f26388j;
    }

    public a C() {
        return new a(this);
    }

    public H D(B request, I listener) {
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(listener, "listener");
        s9.d dVar = new s9.d(i9.e.f28848h, request, listener, new Random(), this.f26382H, null, this.f26383I);
        dVar.o(this);
        return dVar;
    }

    public final int E() {
        return this.f26382H;
    }

    public final List F() {
        return this.f26404z;
    }

    public final Proxy G() {
        return this.f26397s;
    }

    public final InterfaceC2434b H() {
        return this.f26399u;
    }

    public final ProxySelector I() {
        return this.f26398t;
    }

    public final int J() {
        return this.f26380F;
    }

    public final boolean K() {
        return this.f26390l;
    }

    public final SocketFactory L() {
        return this.f26400v;
    }

    public final SSLSocketFactory M() {
        SSLSocketFactory sSLSocketFactory = this.f26401w;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int O() {
        return this.f26381G;
    }

    public final X509TrustManager P() {
        return this.f26402x;
    }

    @Override // e9.InterfaceC2437e.a
    public InterfaceC2437e a(B request) {
        AbstractC2855l.g(request, "request");
        return new j9.e(this, request, false);
    }

    public final int b() {
        return this.f26378D;
    }

    public final n c() {
        return this.f26394p;
    }

    public Object clone() {
        return super.clone();
    }

    public final p e() {
        return this.f26385g;
    }

    public final InterfaceC2434b i() {
        return this.f26391m;
    }

    public final C2435c j() {
        return this.f26395q;
    }

    public final int k() {
        return this.f26378D;
    }

    public final r9.c l() {
        return this.f26377C;
    }

    public final C2439g m() {
        return this.f26376B;
    }

    public final int n() {
        return this.f26379E;
    }

    public final k o() {
        return this.f26386h;
    }

    public final List p() {
        return this.f26403y;
    }

    public final n q() {
        return this.f26394p;
    }

    public final p r() {
        return this.f26385g;
    }

    public final q t() {
        return this.f26396r;
    }

    public final r.c u() {
        return this.f26389k;
    }

    public final boolean v() {
        return this.f26392n;
    }

    public final boolean w() {
        return this.f26393o;
    }

    public final j9.i x() {
        return this.f26384J;
    }

    public final HostnameVerifier y() {
        return this.f26375A;
    }

    public final List z() {
        return this.f26387i;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f26405A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private int f26406B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private long f26407C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private j9.i f26408D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f26409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f26410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f26411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f26412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.c f26413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f26414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private InterfaceC2434b f26415g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f26416h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f26417i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n f26418j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private C2435c f26419k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f26420l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Proxy f26421m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ProxySelector f26422n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private InterfaceC2434b f26423o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private SocketFactory f26424p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f26425q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private X509TrustManager f26426r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f26427s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f26428t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private HostnameVerifier f26429u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private C2439g f26430v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private r9.c f26431w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f26432x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f26433y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f26434z;

        public a() {
            this.f26409a = new p();
            this.f26410b = new k();
            this.f26411c = new ArrayList();
            this.f26412d = new ArrayList();
            this.f26413e = f9.c.e(r.f26310a);
            this.f26414f = true;
            InterfaceC2434b interfaceC2434b = InterfaceC2434b.f26067a;
            this.f26415g = interfaceC2434b;
            this.f26416h = true;
            this.f26417i = true;
            this.f26418j = n.f26298a;
            this.f26420l = q.f26308a;
            this.f26423o = interfaceC2434b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC2855l.f(socketFactory, "SocketFactory.getDefault()");
            this.f26424p = socketFactory;
            b bVar = z.f26374M;
            this.f26427s = bVar.a();
            this.f26428t = bVar.b();
            this.f26429u = r9.d.f31989a;
            this.f26430v = C2439g.f26126c;
            this.f26433y = ModuleDescriptor.MODULE_VERSION;
            this.f26434z = ModuleDescriptor.MODULE_VERSION;
            this.f26405A = ModuleDescriptor.MODULE_VERSION;
            this.f26407C = 1024L;
        }

        public final long A() {
            return this.f26407C;
        }

        public final List B() {
            return this.f26412d;
        }

        public final int C() {
            return this.f26406B;
        }

        public final List D() {
            return this.f26428t;
        }

        public final Proxy E() {
            return this.f26421m;
        }

        public final InterfaceC2434b F() {
            return this.f26423o;
        }

        public final ProxySelector G() {
            return this.f26422n;
        }

        public final int H() {
            return this.f26434z;
        }

        public final boolean I() {
            return this.f26414f;
        }

        public final j9.i J() {
            return this.f26408D;
        }

        public final SocketFactory K() {
            return this.f26424p;
        }

        public final SSLSocketFactory L() {
            return this.f26425q;
        }

        public final int M() {
            return this.f26405A;
        }

        public final X509TrustManager N() {
            return this.f26426r;
        }

        public final a O(List protocols) {
            AbstractC2855l.g(protocols, "protocols");
            List listR0 = AbstractC2800q.R0(protocols);
            A a10 = A.H2_PRIOR_KNOWLEDGE;
            if (!(listR0.contains(a10) || listR0.contains(A.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listR0).toString());
            }
            if (!(!listR0.contains(a10) || listR0.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listR0).toString());
            }
            if (listR0.contains(A.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listR0).toString());
            }
            if (listR0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listR0.remove(A.SPDY_3);
            if (!AbstractC2855l.b(listR0, this.f26428t)) {
                this.f26408D = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listR0);
            AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            this.f26428t = listUnmodifiableList;
            return this;
        }

        public final a P(long j10, TimeUnit unit) {
            AbstractC2855l.g(unit, "unit");
            this.f26434z = f9.c.h("timeout", j10, unit);
            return this;
        }

        public final a Q(long j10, TimeUnit unit) {
            AbstractC2855l.g(unit, "unit");
            this.f26405A = f9.c.h("timeout", j10, unit);
            return this;
        }

        public final a a(v interceptor) {
            AbstractC2855l.g(interceptor, "interceptor");
            this.f26411c.add(interceptor);
            return this;
        }

        public final a b(v interceptor) {
            AbstractC2855l.g(interceptor, "interceptor");
            this.f26412d.add(interceptor);
            return this;
        }

        public final z c() {
            return new z(this);
        }

        public final a d(C2435c c2435c) {
            this.f26419k = c2435c;
            return this;
        }

        public final a e(long j10, TimeUnit unit) {
            AbstractC2855l.g(unit, "unit");
            this.f26432x = f9.c.h("timeout", j10, unit);
            return this;
        }

        public final a f(long j10, TimeUnit unit) {
            AbstractC2855l.g(unit, "unit");
            this.f26433y = f9.c.h("timeout", j10, unit);
            return this;
        }

        public final a g(n cookieJar) {
            AbstractC2855l.g(cookieJar, "cookieJar");
            this.f26418j = cookieJar;
            return this;
        }

        public final a h(r eventListener) {
            AbstractC2855l.g(eventListener, "eventListener");
            this.f26413e = f9.c.e(eventListener);
            return this;
        }

        public final a i(boolean z10) {
            this.f26416h = z10;
            return this;
        }

        public final a j(boolean z10) {
            this.f26417i = z10;
            return this;
        }

        public final InterfaceC2434b k() {
            return this.f26415g;
        }

        public final C2435c l() {
            return this.f26419k;
        }

        public final int m() {
            return this.f26432x;
        }

        public final r9.c n() {
            return this.f26431w;
        }

        public final C2439g o() {
            return this.f26430v;
        }

        public final int p() {
            return this.f26433y;
        }

        public final k q() {
            return this.f26410b;
        }

        public final List r() {
            return this.f26427s;
        }

        public final n s() {
            return this.f26418j;
        }

        public final p t() {
            return this.f26409a;
        }

        public final q u() {
            return this.f26420l;
        }

        public final r.c v() {
            return this.f26413e;
        }

        public final boolean w() {
            return this.f26416h;
        }

        public final boolean x() {
            return this.f26417i;
        }

        public final HostnameVerifier y() {
            return this.f26429u;
        }

        public final List z() {
            return this.f26411c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(z okHttpClient) {
            this();
            AbstractC2855l.g(okHttpClient, "okHttpClient");
            this.f26409a = okHttpClient.r();
            this.f26410b = okHttpClient.o();
            AbstractC2800q.A(this.f26411c, okHttpClient.z());
            AbstractC2800q.A(this.f26412d, okHttpClient.B());
            this.f26413e = okHttpClient.u();
            this.f26414f = okHttpClient.K();
            this.f26415g = okHttpClient.i();
            this.f26416h = okHttpClient.v();
            this.f26417i = okHttpClient.w();
            this.f26418j = okHttpClient.q();
            this.f26419k = okHttpClient.j();
            this.f26420l = okHttpClient.t();
            this.f26421m = okHttpClient.G();
            this.f26422n = okHttpClient.I();
            this.f26423o = okHttpClient.H();
            this.f26424p = okHttpClient.L();
            this.f26425q = okHttpClient.f26401w;
            this.f26426r = okHttpClient.P();
            this.f26427s = okHttpClient.p();
            this.f26428t = okHttpClient.F();
            this.f26429u = okHttpClient.y();
            this.f26430v = okHttpClient.m();
            this.f26431w = okHttpClient.l();
            this.f26432x = okHttpClient.k();
            this.f26433y = okHttpClient.n();
            this.f26434z = okHttpClient.J();
            this.f26405A = okHttpClient.O();
            this.f26406B = okHttpClient.E();
            this.f26407C = okHttpClient.A();
            this.f26408D = okHttpClient.x();
        }
    }

    public z() {
        this(new a());
    }
}
