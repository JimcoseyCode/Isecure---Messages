package l9;

import P8.q;
import com.facebook.react.uimanager.ViewDefaults;
import e9.B;
import e9.D;
import e9.n;
import e9.t;
import e9.u;
import e9.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import k9.i;
import k9.k;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.C3391h;
import t9.D;
import t9.F;
import t9.G;
import t9.InterfaceC3392i;
import t9.j;
import t9.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements k9.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f29466h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l9.a f29468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f29469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f29470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j9.f f29471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f29472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3392i f29473g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private abstract class a implements F {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final o f29474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29475h;

        public a() {
            this.f29474g = new o(b.this.f29472f.timeout());
        }

        protected final boolean d() {
            return this.f29475h;
        }

        public final void e() {
            if (b.this.f29467a == 6) {
                return;
            }
            if (b.this.f29467a == 5) {
                b.this.r(this.f29474g);
                b.this.f29467a = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f29467a);
            }
        }

        protected final void k(boolean z10) {
            this.f29475h = z10;
        }

        @Override // t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            try {
                return b.this.f29472f.read(sink, j10);
            } catch (IOException e10) {
                b.this.d().z();
                e();
                throw e10;
            }
        }

        @Override // t9.F
        public G timeout() {
            return this.f29474g;
        }
    }

    /* JADX INFO: renamed from: l9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class C0311b implements D {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final o f29477g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29478h;

        public C0311b() {
            this.f29477g = new o(b.this.f29473g.timeout());
        }

        @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f29478h) {
                return;
            }
            this.f29478h = true;
            b.this.f29473g.V("0\r\n\r\n");
            b.this.r(this.f29477g);
            b.this.f29467a = 3;
        }

        @Override // t9.D, java.io.Flushable
        public synchronized void flush() {
            if (this.f29478h) {
                return;
            }
            b.this.f29473g.flush();
        }

        @Override // t9.D
        public G timeout() {
            return this.f29477g;
        }

        @Override // t9.D
        public void write(C3391h source, long j10) {
            AbstractC2855l.g(source, "source");
            if (this.f29478h) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            b.this.f29473g.a0(j10);
            b.this.f29473g.V("\r\n");
            b.this.f29473g.write(source, j10);
            b.this.f29473g.V("\r\n");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f29480j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f29481k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final u f29482l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ b f29483m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, u url) {
            super();
            AbstractC2855l.g(url, "url");
            this.f29483m = bVar;
            this.f29482l = url;
            this.f29480j = -1L;
            this.f29481k = true;
        }

        private final void m() throws ProtocolException {
            if (this.f29480j != -1) {
                this.f29483m.f29472f.j0();
            }
            try {
                this.f29480j = this.f29483m.f29472f.G0();
                String strJ0 = this.f29483m.f29472f.j0();
                if (strJ0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = q.c1(strJ0).toString();
                if (this.f29480j < 0 || (string.length() > 0 && !q.K(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f29480j + string + '\"');
                }
                if (this.f29480j == 0) {
                    this.f29481k = false;
                    b bVar = this.f29483m;
                    bVar.f29469c = bVar.f29468b.a();
                    z zVar = this.f29483m.f29470d;
                    AbstractC2855l.d(zVar);
                    n nVarQ = zVar.q();
                    u uVar = this.f29482l;
                    t tVar = this.f29483m.f29469c;
                    AbstractC2855l.d(tVar);
                    k9.e.f(nVarQ, uVar, tVar);
                    e();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (this.f29481k && !f9.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f29483m.d().z();
                e();
            }
            k(true);
        }

        @Override // l9.b.a, t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (d()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f29481k) {
                return -1L;
            }
            long j11 = this.f29480j;
            if (j11 == 0 || j11 == -1) {
                m();
                if (!this.f29481k) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f29480j));
            if (j12 != -1) {
                this.f29480j -= j12;
                return j12;
            }
            this.f29483m.d().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            e();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class e extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f29484j;

        public e(long j10) {
            super();
            this.f29484j = j10;
            if (j10 == 0) {
                e();
            }
        }

        @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (this.f29484j != 0 && !f9.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.d().z();
                e();
            }
            k(true);
        }

        @Override // l9.b.a, t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (d()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f29484j;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                b.this.d().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            }
            long j13 = this.f29484j - j12;
            this.f29484j = j13;
            if (j13 == 0) {
                e();
            }
            return j12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class f implements D {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final o f29486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29487h;

        public f() {
            this.f29486g = new o(b.this.f29473g.timeout());
        }

        @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f29487h) {
                return;
            }
            this.f29487h = true;
            b.this.r(this.f29486g);
            b.this.f29467a = 3;
        }

        @Override // t9.D, java.io.Flushable
        public void flush() {
            if (this.f29487h) {
                return;
            }
            b.this.f29473g.flush();
        }

        @Override // t9.D
        public G timeout() {
            return this.f29486g;
        }

        @Override // t9.D
        public void write(C3391h source, long j10) {
            AbstractC2855l.g(source, "source");
            if (this.f29487h) {
                throw new IllegalStateException("closed");
            }
            f9.c.i(source.size(), 0L, j10);
            b.this.f29473g.write(source, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class g extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f29489j;

        public g() {
            super();
        }

        @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (!this.f29489j) {
                e();
            }
            k(true);
        }

        @Override // l9.b.a, t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (d()) {
                throw new IllegalStateException("closed");
            }
            if (this.f29489j) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f29489j = true;
            e();
            return -1L;
        }
    }

    public b(z zVar, j9.f connection, j source, InterfaceC3392i sink) {
        AbstractC2855l.g(connection, "connection");
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(sink, "sink");
        this.f29470d = zVar;
        this.f29471e = connection;
        this.f29472f = source;
        this.f29473g = sink;
        this.f29468b = new l9.a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(o oVar) {
        G gI = oVar.i();
        oVar.j(G.f32567e);
        gI.a();
        gI.b();
    }

    private final boolean s(B b10) {
        return q.x("chunked", b10.h("Transfer-Encoding"), true);
    }

    private final boolean t(e9.D d10) {
        return q.x("chunked", e9.D.d0(d10, "Transfer-Encoding", null, 2, null), true);
    }

    private final D u() {
        if (this.f29467a == 1) {
            this.f29467a = 2;
            return new C0311b();
        }
        throw new IllegalStateException(("state: " + this.f29467a).toString());
    }

    private final F v(u uVar) {
        if (this.f29467a == 4) {
            this.f29467a = 5;
            return new c(this, uVar);
        }
        throw new IllegalStateException(("state: " + this.f29467a).toString());
    }

    private final F w(long j10) {
        if (this.f29467a == 4) {
            this.f29467a = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f29467a).toString());
    }

    private final D x() {
        if (this.f29467a == 1) {
            this.f29467a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f29467a).toString());
    }

    private final F y() {
        if (this.f29467a == 4) {
            this.f29467a = 5;
            d().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f29467a).toString());
    }

    public final void A(t headers, String requestLine) {
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(requestLine, "requestLine");
        if (!(this.f29467a == 0)) {
            throw new IllegalStateException(("state: " + this.f29467a).toString());
        }
        this.f29473g.V(requestLine).V("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29473g.V(headers.p(i10)).V(": ").V(headers.s(i10)).V("\r\n");
        }
        this.f29473g.V("\r\n");
        this.f29467a = 1;
    }

    @Override // k9.d
    public void a() {
        this.f29473g.flush();
    }

    @Override // k9.d
    public long b(e9.D response) {
        AbstractC2855l.g(response, "response");
        if (!k9.e.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return f9.c.s(response);
    }

    @Override // k9.d
    public D.a c(boolean z10) {
        int i10 = this.f29467a;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalStateException(("state: " + this.f29467a).toString());
        }
        try {
            k kVarA = k.f29356d.a(this.f29468b.b());
            D.a aVarK = new D.a().p(kVarA.f29357a).g(kVarA.f29358b).m(kVarA.f29359c).k(this.f29468b.a());
            if (z10 && kVarA.f29358b == 100) {
                return null;
            }
            if (kVarA.f29358b == 100) {
                this.f29467a = 3;
                return aVarK;
            }
            this.f29467a = 4;
            return aVarK;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + d().A().a().l().n(), e10);
        }
    }

    @Override // k9.d
    public void cancel() {
        d().d();
    }

    @Override // k9.d
    public j9.f d() {
        return this.f29471e;
    }

    @Override // k9.d
    public F e(e9.D response) {
        AbstractC2855l.g(response, "response");
        if (!k9.e.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.D0().p());
        }
        long jS = f9.c.s(response);
        return jS != -1 ? w(jS) : y();
    }

    @Override // k9.d
    public void f(B request) {
        AbstractC2855l.g(request, "request");
        i iVar = i.f29353a;
        Proxy.Type type = d().A().b().type();
        AbstractC2855l.f(type, "connection.route().proxy.type()");
        A(request.i(), iVar.a(request, type));
    }

    @Override // k9.d
    public void g() {
        this.f29473g.flush();
    }

    @Override // k9.d
    public t9.D h(B request, long j10) throws ProtocolException {
        AbstractC2855l.g(request, "request");
        if (request.e() != null && request.e().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j10 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void z(e9.D response) {
        AbstractC2855l.g(response, "response");
        long jS = f9.c.s(response);
        if (jS == -1) {
            return;
        }
        F fW = w(jS);
        f9.c.J(fW, ViewDefaults.NUMBER_OF_LINES, TimeUnit.MILLISECONDS);
        fW.close();
    }
}
