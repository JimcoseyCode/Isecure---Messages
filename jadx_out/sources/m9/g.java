package m9;

import e9.A;
import e9.B;
import e9.D;
import e9.t;
import e9.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.F;
import t9.G;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements k9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile i f29941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f29942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f29943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j9.f f29944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k9.g f29945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f29946f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f29940i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f29938g = f9.c.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f29939h = f9.c.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final List a(B request) {
            AbstractC2855l.g(request, "request");
            t tVarI = request.i();
            ArrayList arrayList = new ArrayList(tVarI.size() + 4);
            arrayList.add(new c(c.f29796f, request.l()));
            arrayList.add(new c(c.f29797g, k9.i.f29353a.c(request.p())));
            String strH = request.h("Host");
            if (strH != null) {
                arrayList.add(new c(c.f29799i, strH));
            }
            arrayList.add(new c(c.f29798h, request.p().p()));
            int size = tVarI.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strP = tVarI.p(i10);
                Locale locale = Locale.US;
                AbstractC2855l.f(locale, "Locale.US");
                if (strP == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strP.toLowerCase(locale);
                AbstractC2855l.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!g.f29938g.contains(lowerCase) || (AbstractC2855l.b(lowerCase, "te") && AbstractC2855l.b(tVarI.s(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, tVarI.s(i10)));
                }
            }
            return arrayList;
        }

        public final D.a b(t headerBlock, A protocol) throws ProtocolException {
            AbstractC2855l.g(headerBlock, "headerBlock");
            AbstractC2855l.g(protocol, "protocol");
            t.a aVar = new t.a();
            int size = headerBlock.size();
            k9.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strP = headerBlock.p(i10);
                String strS = headerBlock.s(i10);
                if (AbstractC2855l.b(strP, ":status")) {
                    kVarA = k9.k.f29356d.a("HTTP/1.1 " + strS);
                } else if (!g.f29939h.contains(strP)) {
                    aVar.c(strP, strS);
                }
            }
            if (kVarA != null) {
                return new D.a().p(protocol).g(kVarA.f29358b).m(kVarA.f29359c).k(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(z client, j9.f connection, k9.g chain, f http2Connection) {
        AbstractC2855l.g(client, "client");
        AbstractC2855l.g(connection, "connection");
        AbstractC2855l.g(chain, "chain");
        AbstractC2855l.g(http2Connection, "http2Connection");
        this.f29944d = connection;
        this.f29945e = chain;
        this.f29946f = http2Connection;
        List listF = client.F();
        A a10 = A.H2_PRIOR_KNOWLEDGE;
        this.f29942b = listF.contains(a10) ? a10 : A.HTTP_2;
    }

    @Override // k9.d
    public void a() {
        i iVar = this.f29941a;
        AbstractC2855l.d(iVar);
        iVar.n().close();
    }

    @Override // k9.d
    public long b(D response) {
        AbstractC2855l.g(response, "response");
        if (k9.e.b(response)) {
            return f9.c.s(response);
        }
        return 0L;
    }

    @Override // k9.d
    public D.a c(boolean z10) throws ProtocolException {
        i iVar = this.f29941a;
        AbstractC2855l.d(iVar);
        D.a aVarB = f29940i.b(iVar.C(), this.f29942b);
        if (z10 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // k9.d
    public void cancel() {
        this.f29943c = true;
        i iVar = this.f29941a;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // k9.d
    public j9.f d() {
        return this.f29944d;
    }

    @Override // k9.d
    public F e(D response) {
        AbstractC2855l.g(response, "response");
        i iVar = this.f29941a;
        AbstractC2855l.d(iVar);
        return iVar.p();
    }

    @Override // k9.d
    public void f(B request) throws IOException {
        AbstractC2855l.g(request, "request");
        if (this.f29941a != null) {
            return;
        }
        this.f29941a = this.f29946f.S0(f29940i.a(request), request.e() != null);
        if (this.f29943c) {
            i iVar = this.f29941a;
            AbstractC2855l.d(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f29941a;
        AbstractC2855l.d(iVar2);
        G gV = iVar2.v();
        long jH = this.f29945e.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gV.g(jH, timeUnit);
        i iVar3 = this.f29941a;
        AbstractC2855l.d(iVar3);
        iVar3.E().g(this.f29945e.j(), timeUnit);
    }

    @Override // k9.d
    public void g() {
        this.f29946f.flush();
    }

    @Override // k9.d
    public t9.D h(B request, long j10) {
        AbstractC2855l.g(request, "request");
        i iVar = this.f29941a;
        AbstractC2855l.d(iVar);
        return iVar.n();
    }
}
