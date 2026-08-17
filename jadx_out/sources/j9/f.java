package j9;

import P8.q;
import e9.A;
import e9.B;
import e9.C2433a;
import e9.C2439g;
import e9.D;
import e9.F;
import e9.InterfaceC2437e;
import e9.l;
import e9.r;
import e9.s;
import e9.u;
import e9.z;
import j7.AbstractC2800q;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.n;
import m9.f;
import m9.m;
import s9.d;
import t9.G;
import t9.InterfaceC3392i;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends f.d implements e9.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f29013t = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Socket f29014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f29015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f29016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f29017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m9.f f29018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t9.j f29019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3392i f29020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f29027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f29028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h f29029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final F f29030s;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends n implements InterfaceC3487a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2439g f29031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ s f29032i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C2433a f29033j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2439g c2439g, s sVar, C2433a c2433a) {
            super(0);
            this.f29031h = c2439g;
            this.f29032i = sVar;
            this.f29033j = c2433a;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            r9.c cVarD = this.f29031h.d();
            AbstractC2855l.d(cVarD);
            return cVarD.a(this.f29032i.d(), this.f29033j.l().h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends n implements InterfaceC3487a {
        c() {
            super(0);
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            s sVar = f.this.f29016e;
            AbstractC2855l.d(sVar);
            List<Certificate> listD = sVar.d();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listD, 10));
            for (Certificate certificate : listD) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends d.AbstractC0360d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ j9.c f29035j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ t9.j f29036k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC3392i f29037l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j9.c cVar, t9.j jVar, InterfaceC3392i interfaceC3392i, boolean z10, t9.j jVar2, InterfaceC3392i interfaceC3392i2) {
            super(z10, jVar2, interfaceC3392i2);
            this.f29035j = cVar;
            this.f29036k = jVar;
            this.f29037l = interfaceC3392i;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f29035j.a(-1L, true, true, null);
        }
    }

    public f(h connectionPool, F route) {
        AbstractC2855l.g(connectionPool, "connectionPool");
        AbstractC2855l.g(route, "route");
        this.f29029r = connectionPool;
        this.f29030s = route;
        this.f29026o = 1;
        this.f29027p = new ArrayList();
        this.f29028q = Long.MAX_VALUE;
    }

    private final boolean B(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            Proxy.Type type = f10.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f29030s.b().type() == type2 && AbstractC2855l.b(this.f29030s.d(), f10.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i10) throws SocketException {
        Socket socket = this.f29015d;
        AbstractC2855l.d(socket);
        t9.j jVar = this.f29019h;
        AbstractC2855l.d(jVar);
        InterfaceC3392i interfaceC3392i = this.f29020i;
        AbstractC2855l.d(interfaceC3392i);
        socket.setSoTimeout(0);
        m9.f fVarA = new f.b(true, i9.e.f28848h).m(socket, this.f29030s.a().l().h(), jVar, interfaceC3392i).k(this).l(i10).a();
        this.f29018g = fVarA;
        this.f29026o = m9.f.f29831J.a().d();
        m9.f.e1(fVarA, false, null, 3, null);
    }

    private final boolean G(u uVar) {
        s sVar;
        if (f9.c.f27872h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        u uVarL = this.f29030s.a().l();
        if (uVar.l() != uVarL.l()) {
            return false;
        }
        if (AbstractC2855l.b(uVar.h(), uVarL.h())) {
            return true;
        }
        if (!this.f29022k && (sVar = this.f29016e) != null) {
            AbstractC2855l.d(sVar);
            if (e(uVar, sVar)) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(u uVar, s sVar) {
        List listD = sVar.d();
        if (!listD.isEmpty()) {
            r9.d dVar = r9.d.f31989a;
            String strH = uVar.h();
            Object obj = listD.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            if (dVar.e(strH, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void h(int i10, int i11, InterfaceC2437e interfaceC2437e, r rVar) throws IOException {
        Socket socket;
        int i12;
        Proxy proxyB = this.f29030s.b();
        C2433a c2433aA = this.f29030s.a();
        Proxy.Type type = proxyB.type();
        if (type != null && ((i12 = g.f29038a[type.ordinal()]) == 1 || i12 == 2)) {
            socket = c2433aA.j().createSocket();
            AbstractC2855l.d(socket);
        } else {
            socket = new Socket(proxyB);
        }
        this.f29014c = socket;
        rVar.j(interfaceC2437e, this.f29030s.d(), proxyB);
        socket.setSoTimeout(i11);
        try {
            o9.j.f30594c.g().f(socket, this.f29030s.d(), i10);
            try {
                this.f29019h = t9.s.d(t9.s.l(socket));
                this.f29020i = t9.s.c(t9.s.h(socket));
            } catch (NullPointerException e10) {
                if (AbstractC2855l.b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f29030s.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void i(j9.b bVar) throws Throwable {
        C2433a c2433aA = this.f29030s.a();
        SSLSocketFactory sSLSocketFactoryK = c2433aA.k();
        SSLSocket sSLSocket = null;
        try {
            AbstractC2855l.d(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f29014c, c2433aA.l().h(), c2433aA.l().l(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    o9.j.f30594c.g().e(sSLSocket2, c2433aA.l().h(), c2433aA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                s.a aVar = s.f26312e;
                AbstractC2855l.f(sslSocketSession, "sslSocketSession");
                s sVarB = aVar.b(sslSocketSession);
                HostnameVerifier hostnameVerifierE = c2433aA.e();
                AbstractC2855l.d(hostnameVerifierE);
                if (hostnameVerifierE.verify(c2433aA.l().h(), sslSocketSession)) {
                    C2439g c2439gA = c2433aA.a();
                    AbstractC2855l.d(c2439gA);
                    this.f29016e = new s(sVarB.e(), sVarB.a(), sVarB.c(), new b(c2439gA, sVarB, c2433aA));
                    c2439gA.b(c2433aA.l().h(), new c());
                    String strH = lVarA.h() ? o9.j.f30594c.g().h(sSLSocket2) : null;
                    this.f29015d = sSLSocket2;
                    this.f29019h = t9.s.d(t9.s.l(sSLSocket2));
                    this.f29020i = t9.s.c(t9.s.h(sSLSocket2));
                    this.f29017f = strH != null ? A.f25990o.a(strH) : A.HTTP_1_1;
                    o9.j.f30594c.g().b(sSLSocket2);
                    return;
                }
                List listD = sVarB.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c2433aA.l().h() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(c2433aA.l().h());
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(C2439g.f26127d.a(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                AbstractC2855l.f(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(r9.d.f31989a.a(x509Certificate));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(q.l(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    o9.j.f30594c.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    f9.c.k(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void j(int i10, int i11, int i12, InterfaceC2437e interfaceC2437e, r rVar) throws IOException {
        B bL = l();
        u uVarP = bL.p();
        for (int i13 = 0; i13 < 21; i13++) {
            h(i10, i11, interfaceC2437e, rVar);
            bL = k(i11, i12, bL, uVarP);
            if (bL == null) {
                return;
            }
            Socket socket = this.f29014c;
            if (socket != null) {
                f9.c.k(socket);
            }
            this.f29014c = null;
            this.f29020i = null;
            this.f29019h = null;
            rVar.h(interfaceC2437e, this.f29030s.d(), this.f29030s.b(), null);
        }
    }

    private final B k(int i10, int i11, B b10, u uVar) throws IOException {
        String str = "CONNECT " + f9.c.P(uVar, true) + " HTTP/1.1";
        while (true) {
            t9.j jVar = this.f29019h;
            AbstractC2855l.d(jVar);
            InterfaceC3392i interfaceC3392i = this.f29020i;
            AbstractC2855l.d(interfaceC3392i);
            l9.b bVar = new l9.b(null, this, jVar, interfaceC3392i);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.timeout().g(i10, timeUnit);
            interfaceC3392i.timeout().g(i11, timeUnit);
            bVar.A(b10.i(), str);
            bVar.a();
            D.a aVarC = bVar.c(false);
            AbstractC2855l.d(aVarC);
            D dC = aVarC.r(b10).c();
            bVar.z(dC);
            int I9 = dC.I();
            if (I9 == 200) {
                if (jVar.c().D() && interfaceC3392i.c().D()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (I9 != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + dC.I());
            }
            B bA = this.f29030s.a().h().a(this.f29030s, dC);
            if (bA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (q.x("close", D.d0(dC, "Connection", null, 2, null), true)) {
                return bA;
            }
            b10 = bA;
        }
    }

    private final B l() {
        B b10 = new B.a().l(this.f29030s.a().l()).g("CONNECT", null).e("Host", f9.c.P(this.f29030s.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.9.2").b();
        B bA = this.f29030s.a().h().a(this.f29030s, new D.a().r(b10).p(A.HTTP_1_1).g(407).m("Preemptive Authenticate").b(f9.c.f27867c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return bA != null ? bA : b10;
    }

    private final void m(j9.b bVar, int i10, InterfaceC2437e interfaceC2437e, r rVar) throws Throwable {
        if (this.f29030s.a().k() != null) {
            rVar.C(interfaceC2437e);
            i(bVar);
            rVar.B(interfaceC2437e, this.f29016e);
            if (this.f29017f == A.HTTP_2) {
                F(i10);
                return;
            }
            return;
        }
        List listF = this.f29030s.a().f();
        A a10 = A.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(a10)) {
            this.f29015d = this.f29014c;
            this.f29017f = A.HTTP_1_1;
        } else {
            this.f29015d = this.f29014c;
            this.f29017f = a10;
            F(i10);
        }
    }

    public F A() {
        return this.f29030s;
    }

    public final void C(long j10) {
        this.f29028q = j10;
    }

    public final void D(boolean z10) {
        this.f29021j = z10;
    }

    public Socket E() {
        Socket socket = this.f29015d;
        AbstractC2855l.d(socket);
        return socket;
    }

    public final synchronized void H(e call, IOException iOException) {
        try {
            AbstractC2855l.g(call, "call");
            if (iOException instanceof m9.n) {
                if (((m9.n) iOException).f30007g == m9.b.REFUSED_STREAM) {
                    int i10 = this.f29025n + 1;
                    this.f29025n = i10;
                    if (i10 > 1) {
                        this.f29021j = true;
                        this.f29023l++;
                    }
                } else if (((m9.n) iOException).f30007g != m9.b.CANCEL || !call.s()) {
                    this.f29021j = true;
                    this.f29023l++;
                }
            } else if (!v() || (iOException instanceof m9.a)) {
                this.f29021j = true;
                if (this.f29024m == 0) {
                    if (iOException != null) {
                        g(call.k(), this.f29030s, iOException);
                    }
                    this.f29023l++;
                }
            }
        } finally {
        }
    }

    @Override // m9.f.d
    public synchronized void a(m9.f connection, m settings) {
        AbstractC2855l.g(connection, "connection");
        AbstractC2855l.g(settings, "settings");
        this.f29026o = settings.d();
    }

    @Override // m9.f.d
    public void b(m9.i stream) {
        AbstractC2855l.g(stream, "stream");
        stream.d(m9.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f29014c;
        if (socket != null) {
            f9.c.k(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, int i11, int i12, int i13, boolean z10, InterfaceC2437e interfaceC2437e, r rVar) throws Throwable {
        Socket socket;
        Socket socket2;
        InterfaceC2437e call = interfaceC2437e;
        r eventListener = rVar;
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(eventListener, "eventListener");
        if (!(this.f29017f == null)) {
            throw new IllegalStateException("already connected");
        }
        List listB = this.f29030s.a().b();
        j9.b bVar = new j9.b(listB);
        if (this.f29030s.a().k() == null) {
            if (!listB.contains(l.f26265j)) {
                throw new j(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strH = this.f29030s.a().l().h();
            if (!o9.j.f30594c.g().j(strH)) {
                throw new j(new UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy"));
            }
        } else if (this.f29030s.a().f().contains(A.H2_PRIOR_KNOWLEDGE)) {
            throw new j(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        j jVar = null;
        while (true) {
            try {
                if (this.f29030s.c()) {
                    r rVar2 = eventListener;
                    InterfaceC2437e interfaceC2437e2 = call;
                    try {
                        j(i10, i11, i12, interfaceC2437e2, rVar2);
                        call = interfaceC2437e2;
                        eventListener = rVar2;
                        try {
                            if (this.f29014c == null) {
                                break;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            IOException iOException = e;
                            socket = this.f29015d;
                            if (socket != null) {
                                f9.c.k(socket);
                            }
                            socket2 = this.f29014c;
                            if (socket2 != null) {
                                f9.c.k(socket2);
                            }
                            this.f29015d = null;
                            this.f29014c = null;
                            this.f29019h = null;
                            this.f29020i = null;
                            this.f29016e = null;
                            this.f29017f = null;
                            this.f29018g = null;
                            this.f29026o = 1;
                            eventListener.i(call, this.f29030s.d(), this.f29030s.b(), null, iOException);
                            if (jVar == null) {
                                jVar = new j(iOException);
                            } else {
                                jVar.a(iOException);
                            }
                            if (!z10) {
                                throw jVar;
                            }
                            if (!bVar.b(iOException)) {
                                throw jVar;
                            }
                            call = interfaceC2437e;
                            eventListener = rVar;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        call = interfaceC2437e2;
                        eventListener = rVar2;
                    }
                } else {
                    try {
                        h(i10, i11, call, eventListener);
                    } catch (IOException e12) {
                        e = e12;
                        IOException iOException2 = e;
                        socket = this.f29015d;
                        if (socket != null) {
                        }
                        socket2 = this.f29014c;
                        if (socket2 != null) {
                        }
                        this.f29015d = null;
                        this.f29014c = null;
                        this.f29019h = null;
                        this.f29020i = null;
                        this.f29016e = null;
                        this.f29017f = null;
                        this.f29018g = null;
                        this.f29026o = 1;
                        eventListener.i(call, this.f29030s.d(), this.f29030s.b(), null, iOException2);
                        if (jVar == null) {
                        }
                        if (!z10) {
                        }
                    }
                }
            } catch (IOException e13) {
                e = e13;
            }
            try {
                m(bVar, i13, call, eventListener);
                eventListener.h(call, this.f29030s.d(), this.f29030s.b(), this.f29017f);
                break;
            } catch (IOException e14) {
                e = e14;
                IOException iOException22 = e;
                socket = this.f29015d;
                if (socket != null) {
                }
                socket2 = this.f29014c;
                if (socket2 != null) {
                }
                this.f29015d = null;
                this.f29014c = null;
                this.f29019h = null;
                this.f29020i = null;
                this.f29016e = null;
                this.f29017f = null;
                this.f29018g = null;
                this.f29026o = 1;
                eventListener.i(call, this.f29030s.d(), this.f29030s.b(), null, iOException22);
                if (jVar == null) {
                }
                if (!z10) {
                }
            }
            call = interfaceC2437e;
            eventListener = rVar;
        }
        if (this.f29030s.c() && this.f29014c == null) {
            throw new j(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f29028q = System.nanoTime();
    }

    public final void g(z client, F failedRoute, IOException failure) {
        AbstractC2855l.g(client, "client");
        AbstractC2855l.g(failedRoute, "failedRoute");
        AbstractC2855l.g(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            C2433a c2433aA = failedRoute.a();
            c2433aA.i().connectFailed(c2433aA.l().q(), failedRoute.b().address(), failure);
        }
        client.x().b(failedRoute);
    }

    public final List n() {
        return this.f29027p;
    }

    public final long o() {
        return this.f29028q;
    }

    public final boolean p() {
        return this.f29021j;
    }

    public final int q() {
        return this.f29023l;
    }

    public s r() {
        return this.f29016e;
    }

    public final synchronized void s() {
        this.f29024m++;
    }

    public final boolean t(C2433a address, List list) {
        AbstractC2855l.g(address, "address");
        if (f9.c.f27872h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.f29027p.size() >= this.f29026o || this.f29021j || !this.f29030s.a().d(address)) {
            return false;
        }
        if (AbstractC2855l.b(address.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.f29018g == null || list == null || !B(list) || address.e() != r9.d.f31989a || !G(address.l())) {
            return false;
        }
        try {
            C2439g c2439gA = address.a();
            AbstractC2855l.d(c2439gA);
            String strH = address.l().h();
            s sVarR = r();
            AbstractC2855l.d(sVarR);
            c2439gA.a(strH, sVarR.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objA;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f29030s.a().l().h());
        sb.append(':');
        sb.append(this.f29030s.a().l().l());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.f29030s.b());
        sb.append(" hostAddress=");
        sb.append(this.f29030s.d());
        sb.append(" cipherSuite=");
        s sVar = this.f29016e;
        if (sVar == null || (objA = sVar.a()) == null) {
            objA = "none";
        }
        sb.append(objA);
        sb.append(" protocol=");
        sb.append(this.f29017f);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(boolean z10) {
        long j10;
        if (f9.c.f27872h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f29014c;
        AbstractC2855l.d(socket);
        Socket socket2 = this.f29015d;
        AbstractC2855l.d(socket2);
        t9.j jVar = this.f29019h;
        AbstractC2855l.d(jVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        m9.f fVar = this.f29018g;
        if (fVar != null) {
            return fVar.Q0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f29028q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return f9.c.D(socket2, jVar);
    }

    public final boolean v() {
        return this.f29018g != null;
    }

    public final k9.d w(z client, k9.g chain) throws SocketException {
        AbstractC2855l.g(client, "client");
        AbstractC2855l.g(chain, "chain");
        Socket socket = this.f29015d;
        AbstractC2855l.d(socket);
        t9.j jVar = this.f29019h;
        AbstractC2855l.d(jVar);
        InterfaceC3392i interfaceC3392i = this.f29020i;
        AbstractC2855l.d(interfaceC3392i);
        m9.f fVar = this.f29018g;
        if (fVar != null) {
            return new m9.g(client, this, chain, fVar);
        }
        socket.setSoTimeout(chain.k());
        G gTimeout = jVar.timeout();
        long jH = chain.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gTimeout.g(jH, timeUnit);
        interfaceC3392i.timeout().g(chain.j(), timeUnit);
        return new l9.b(client, this, jVar, interfaceC3392i);
    }

    public final d.AbstractC0360d x(j9.c exchange) throws SocketException {
        AbstractC2855l.g(exchange, "exchange");
        Socket socket = this.f29015d;
        AbstractC2855l.d(socket);
        t9.j jVar = this.f29019h;
        AbstractC2855l.d(jVar);
        InterfaceC3392i interfaceC3392i = this.f29020i;
        AbstractC2855l.d(interfaceC3392i);
        socket.setSoTimeout(0);
        z();
        return new d(exchange, jVar, interfaceC3392i, true, jVar, interfaceC3392i);
    }

    public final synchronized void y() {
        this.f29022k = true;
    }

    public final synchronized void z() {
        this.f29021j = true;
    }
}
