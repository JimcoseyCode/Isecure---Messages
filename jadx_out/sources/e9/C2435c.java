package e9;

import com.facebook.react.uimanager.ViewDefaults;
import e9.B;
import e9.D;
import e9.t;
import h9.d;
import i7.C2735B;
import j7.AbstractC2800q;
import j7.T;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o9.j;
import t7.AbstractC3376c;
import t9.C3391h;
import t9.InterfaceC3392i;
import t9.k;

/* JADX INFO: renamed from: e9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2435c implements Closeable, Flushable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f26070m = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h9.d f26071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26076l;

    /* JADX INFO: renamed from: e9.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a extends E {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final t9.j f26077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d.C0289d f26078h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f26079i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f26080j;

        /* JADX INFO: renamed from: e9.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0265a extends t9.n {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ t9.F f26082h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0265a(t9.F f10, t9.F f11) {
                super(f11);
                this.f26082h = f10;
            }

            @Override // t9.n, t9.F, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.e().close();
                super.close();
            }
        }

        public a(d.C0289d snapshot, String str, String str2) {
            AbstractC2855l.g(snapshot, "snapshot");
            this.f26078h = snapshot;
            this.f26079i = str;
            this.f26080j = str2;
            t9.F fE = snapshot.e(1);
            this.f26077g = t9.s.d(new C0265a(fE, fE));
        }

        @Override // e9.E
        public long contentLength() {
            String str = this.f26080j;
            if (str != null) {
                return f9.c.T(str, -1L);
            }
            return -1L;
        }

        @Override // e9.E
        public x contentType() {
            String str = this.f26079i;
            if (str != null) {
                return x.f26347g.c(str);
            }
            return null;
        }

        public final d.C0289d e() {
            return this.f26078h;
        }

        @Override // e9.E
        public t9.j source() {
            return this.f26077g;
        }
    }

    /* JADX INFO: renamed from: e9.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        private final Set d(t tVar) {
            int size = tVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (P8.q.x("Vary", tVar.p(i10), true)) {
                    String strS = tVar.s(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(P8.q.y(kotlin.jvm.internal.H.f29375a));
                    }
                    for (String str : P8.q.F0(strS, new char[]{','}, false, 0, 6, null)) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(P8.q.c1(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : T.e();
        }

        private final t e(t tVar, t tVar2) {
            Set setD = d(tVar2);
            if (setD.isEmpty()) {
                return f9.c.f27866b;
            }
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strP = tVar.p(i10);
                if (setD.contains(strP)) {
                    aVar.a(strP, tVar.s(i10));
                }
            }
            return aVar.e();
        }

        public final boolean a(D hasVaryAll) {
            AbstractC2855l.g(hasVaryAll, "$this$hasVaryAll");
            return d(hasVaryAll.g0()).contains("*");
        }

        public final String b(u url) {
            AbstractC2855l.g(url, "url");
            return t9.k.f32603j.g(url.toString()).x().u();
        }

        public final int c(t9.j source) throws IOException {
            AbstractC2855l.g(source, "source");
            try {
                long jL = source.L();
                String strJ0 = source.j0();
                if (jL >= 0 && jL <= ViewDefaults.NUMBER_OF_LINES && strJ0.length() <= 0) {
                    return (int) jL;
                }
                throw new IOException("expected an int but was \"" + jL + strJ0 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final t f(D varyHeaders) {
            AbstractC2855l.g(varyHeaders, "$this$varyHeaders");
            D dT0 = varyHeaders.t0();
            AbstractC2855l.d(dT0);
            return e(dT0.D0().i(), varyHeaders.g0());
        }

        public final boolean g(D cachedResponse, t cachedRequest, B newRequest) {
            AbstractC2855l.g(cachedResponse, "cachedResponse");
            AbstractC2855l.g(cachedRequest, "cachedRequest");
            AbstractC2855l.g(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.g0());
            if (setD != null && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!AbstractC2855l.b(cachedRequest.t(str), newRequest.j(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: e9.c$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class d implements h9.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t9.D f26096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t9.D f26097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f26098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d.b f26099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2435c f26100e;

        /* JADX INFO: renamed from: e9.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends t9.m {
            a(t9.D d10) {
                super(d10);
            }

            @Override // t9.m, t9.D, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.f26100e) {
                    if (d.this.d()) {
                        return;
                    }
                    d.this.e(true);
                    C2435c c2435c = d.this.f26100e;
                    c2435c.B(c2435c.m() + 1);
                    super.close();
                    d.this.f26099d.b();
                }
            }
        }

        public d(C2435c c2435c, d.b editor) {
            AbstractC2855l.g(editor, "editor");
            this.f26100e = c2435c;
            this.f26099d = editor;
            t9.D dF = editor.f(1);
            this.f26096a = dF;
            this.f26097b = new a(dF);
        }

        @Override // h9.b
        public void a() {
            synchronized (this.f26100e) {
                if (this.f26098c) {
                    return;
                }
                this.f26098c = true;
                C2435c c2435c = this.f26100e;
                c2435c.A(c2435c.k() + 1);
                f9.c.j(this.f26096a);
                try {
                    this.f26099d.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // h9.b
        public t9.D b() {
            return this.f26097b;
        }

        public final boolean d() {
            return this.f26098c;
        }

        public final void e(boolean z10) {
            this.f26098c = z10;
        }
    }

    public C2435c(File directory, long j10, n9.a fileSystem) {
        AbstractC2855l.g(directory, "directory");
        AbstractC2855l.g(fileSystem, "fileSystem");
        this.f26071g = new h9.d(fileSystem, directory, 201105, 2, j10, i9.e.f28848h);
    }

    private final void d(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final void A(int i10) {
        this.f26073i = i10;
    }

    public final void B(int i10) {
        this.f26072h = i10;
    }

    public final synchronized void I() {
        this.f26075k++;
    }

    public final synchronized void J(h9.c cacheStrategy) {
        try {
            AbstractC2855l.g(cacheStrategy, "cacheStrategy");
            this.f26076l++;
            if (cacheStrategy.b() != null) {
                this.f26074j++;
            } else if (cacheStrategy.a() != null) {
                this.f26075k++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void M(D cached, D network) {
        d.b bVarD;
        AbstractC2855l.g(cached, "cached");
        AbstractC2855l.g(network, "network");
        C0266c c0266c = new C0266c(network);
        E eR = cached.r();
        if (eR == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            bVarD = ((a) eR).e().d();
            if (bVarD != null) {
                try {
                    c0266c.f(bVarD);
                    bVarD.b();
                } catch (IOException unused) {
                    d(bVarD);
                }
            }
        } catch (IOException unused2) {
            bVarD = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26071g.close();
    }

    public final D e(B request) {
        AbstractC2855l.g(request, "request");
        try {
            d.C0289d c0289dD0 = this.f26071g.d0(f26070m.b(request.p()));
            if (c0289dD0 != null) {
                try {
                    C0266c c0266c = new C0266c(c0289dD0.e(0));
                    D d10 = c0266c.d(c0289dD0);
                    if (c0266c.b(request, d10)) {
                        return d10;
                    }
                    E eR = d10.r();
                    if (eR != null) {
                        f9.c.j(eR);
                    }
                    return null;
                } catch (IOException unused) {
                    f9.c.j(c0289dD0);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f26071g.flush();
    }

    public final int k() {
        return this.f26073i;
    }

    public final int m() {
        return this.f26072h;
    }

    public final h9.b r(D response) {
        d.b bVarX;
        AbstractC2855l.g(response, "response");
        String strL = response.D0().l();
        if (k9.f.f29340a.a(response.D0().l())) {
            try {
                s(response.D0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC2855l.b(strL, "GET")) {
            return null;
        }
        b bVar = f26070m;
        if (bVar.a(response)) {
            return null;
        }
        C0266c c0266c = new C0266c(response);
        try {
            bVarX = h9.d.X(this.f26071g, bVar.b(response.D0().p()), 0L, 2, null);
            if (bVarX == null) {
                return null;
            }
            try {
                c0266c.f(bVarX);
                return new d(this, bVarX);
            } catch (IOException unused2) {
                d(bVarX);
                return null;
            }
        } catch (IOException unused3) {
            bVarX = null;
        }
    }

    public final void s(B request) {
        AbstractC2855l.g(request, "request");
        this.f26071g.K0(f26070m.b(request.p()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2435c(File directory, long j10) {
        this(directory, j10, n9.a.f30216a);
        AbstractC2855l.g(directory, "directory");
    }

    /* JADX INFO: renamed from: e9.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0266c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26083k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26084l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f26085m = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f26087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f26088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final A f26089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f26090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f26091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final t f26092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final s f26093h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f26094i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f26095j;

        /* JADX INFO: renamed from: e9.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            j.a aVar = o9.j.f30594c;
            sb.append(aVar.g().g());
            sb.append("-Sent-Millis");
            f26083k = sb.toString();
            f26084l = aVar.g().g() + "-Received-Millis";
        }

        public C0266c(t9.F rawSource) {
            AbstractC2855l.g(rawSource, "rawSource");
            try {
                t9.j jVarD = t9.s.d(rawSource);
                this.f26086a = jVarD.j0();
                this.f26088c = jVarD.j0();
                t.a aVar = new t.a();
                int iC = C2435c.f26070m.c(jVarD);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.b(jVarD.j0());
                }
                this.f26087b = aVar.e();
                k9.k kVarA = k9.k.f29356d.a(jVarD.j0());
                this.f26089d = kVarA.f29357a;
                this.f26090e = kVarA.f29358b;
                this.f26091f = kVarA.f29359c;
                t.a aVar2 = new t.a();
                int iC2 = C2435c.f26070m.c(jVarD);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.b(jVarD.j0());
                }
                String str = f26083k;
                String strF = aVar2.f(str);
                String str2 = f26084l;
                String strF2 = aVar2.f(str2);
                aVar2.h(str);
                aVar2.h(str2);
                this.f26094i = strF != null ? Long.parseLong(strF) : 0L;
                this.f26095j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.f26092g = aVar2.e();
                if (a()) {
                    String strJ0 = jVarD.j0();
                    if (strJ0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strJ0 + '\"');
                    }
                    this.f26093h = s.f26312e.a(!jVarD.D() ? G.f26054n.a(jVarD.j0()) : G.SSL_3_0, C2441i.f26243s1.b(jVarD.j0()), c(jVarD), c(jVarD));
                } else {
                    this.f26093h = null;
                }
                rawSource.close();
            } catch (Throwable th) {
                rawSource.close();
                throw th;
            }
        }

        private final boolean a() {
            return P8.q.K(this.f26086a, "https://", false, 2, null);
        }

        private final List c(t9.j jVar) throws IOException {
            int iC = C2435c.f26070m.c(jVar);
            if (iC == -1) {
                return AbstractC2800q.j();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strJ0 = jVar.j0();
                    C3391h c3391h = new C3391h();
                    t9.k kVarD = t9.k.f32603j.d(strJ0);
                    AbstractC2855l.d(kVarD);
                    c3391h.S(kVarD);
                    arrayList.add(certificateFactory.generateCertificate(c3391h.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(InterfaceC3392i interfaceC3392i, List list) throws IOException {
            try {
                interfaceC3392i.C0(list.size()).writeByte(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    byte[] bytes = ((Certificate) list.get(i10)).getEncoded();
                    k.a aVar = t9.k.f32603j;
                    AbstractC2855l.f(bytes, "bytes");
                    interfaceC3392i.V(k.a.j(aVar, bytes, 0, 0, 3, null).j()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(B request, D response) {
            AbstractC2855l.g(request, "request");
            AbstractC2855l.g(response, "response");
            return AbstractC2855l.b(this.f26086a, request.p().toString()) && AbstractC2855l.b(this.f26088c, request.l()) && C2435c.f26070m.g(response, this.f26087b, request);
        }

        public final D d(d.C0289d snapshot) {
            AbstractC2855l.g(snapshot, "snapshot");
            String strO = this.f26092g.o("Content-Type");
            String strO2 = this.f26092g.o("Content-Length");
            return new D.a().r(new B.a().m(this.f26086a).g(this.f26088c, null).f(this.f26087b).b()).p(this.f26089d).g(this.f26090e).m(this.f26091f).k(this.f26092g).b(new a(snapshot, strO, strO2)).i(this.f26093h).s(this.f26094i).q(this.f26095j).c();
        }

        public final void f(d.b editor) throws IOException {
            AbstractC2855l.g(editor, "editor");
            InterfaceC3392i interfaceC3392iC = t9.s.c(editor.f(0));
            try {
                interfaceC3392iC.V(this.f26086a).writeByte(10);
                interfaceC3392iC.V(this.f26088c).writeByte(10);
                interfaceC3392iC.C0(this.f26087b.size()).writeByte(10);
                int size = this.f26087b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC3392iC.V(this.f26087b.p(i10)).V(": ").V(this.f26087b.s(i10)).writeByte(10);
                }
                interfaceC3392iC.V(new k9.k(this.f26089d, this.f26090e, this.f26091f).toString()).writeByte(10);
                interfaceC3392iC.C0(this.f26092g.size() + 2).writeByte(10);
                int size2 = this.f26092g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC3392iC.V(this.f26092g.p(i11)).V(": ").V(this.f26092g.s(i11)).writeByte(10);
                }
                interfaceC3392iC.V(f26083k).V(": ").C0(this.f26094i).writeByte(10);
                interfaceC3392iC.V(f26084l).V(": ").C0(this.f26095j).writeByte(10);
                if (a()) {
                    interfaceC3392iC.writeByte(10);
                    s sVar = this.f26093h;
                    AbstractC2855l.d(sVar);
                    interfaceC3392iC.V(sVar.a().c()).writeByte(10);
                    e(interfaceC3392iC, this.f26093h.d());
                    e(interfaceC3392iC, this.f26093h.c());
                    interfaceC3392iC.V(this.f26093h.e().h()).writeByte(10);
                }
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(interfaceC3392iC, null);
            } finally {
            }
        }

        public C0266c(D response) {
            AbstractC2855l.g(response, "response");
            this.f26086a = response.D0().p().toString();
            this.f26087b = C2435c.f26070m.f(response);
            this.f26088c = response.D0().l();
            this.f26089d = response.y0();
            this.f26090e = response.I();
            this.f26091f = response.l0();
            this.f26092g = response.g0();
            this.f26093h = response.M();
            this.f26094i = response.J0();
            this.f26095j = response.A0();
        }
    }
}
