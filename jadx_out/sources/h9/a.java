package h9;

import P8.q;
import e9.A;
import e9.B;
import e9.C2435c;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.r;
import e9.t;
import e9.v;
import h9.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k9.f;
import k9.h;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.C3391h;
import t9.F;
import t9.G;
import t9.InterfaceC3392i;
import t9.j;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0288a f28567b = new C0288a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2435c f28568a;

    /* JADX INFO: renamed from: h9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0288a {
        private C0288a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t c(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strP = tVar.p(i10);
                String strS = tVar.s(i10);
                if ((!q.x("Warning", strP, true) || !q.K(strS, "1", false, 2, null)) && (d(strP) || !e(strP) || tVar2.o(strP) == null)) {
                    aVar.c(strP, strS);
                }
            }
            int size2 = tVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strP2 = tVar2.p(i11);
                if (!d(strP2) && e(strP2)) {
                    aVar.c(strP2, tVar2.s(i11));
                }
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            return q.x("Content-Length", str, true) || q.x("Content-Encoding", str, true) || q.x("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (q.x("Connection", str, true) || q.x("Keep-Alive", str, true) || q.x("Proxy-Authenticate", str, true) || q.x("Proxy-Authorization", str, true) || q.x("TE", str, true) || q.x("Trailers", str, true) || q.x("Transfer-Encoding", str, true) || q.x("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final D f(D d10) {
            return (d10 != null ? d10.r() : null) != null ? d10.u0().b(null).c() : d10;
        }

        public /* synthetic */ C0288a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements F {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f28569g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j f28570h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ h9.b f28571i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3392i f28572j;

        b(j jVar, h9.b bVar, InterfaceC3392i interfaceC3392i) {
            this.f28570h = jVar;
            this.f28571i = bVar;
            this.f28572j = interfaceC3392i;
        }

        @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f28569g && !f9.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f28569g = true;
                this.f28571i.a();
            }
            this.f28570h.close();
        }

        @Override // t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            try {
                long j11 = this.f28570h.read(sink, j10);
                if (j11 != -1) {
                    sink.B(this.f28572j.c(), sink.size() - j11, j11);
                    this.f28572j.K();
                    return j11;
                }
                if (!this.f28569g) {
                    this.f28569g = true;
                    this.f28572j.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.f28569g) {
                    throw e10;
                }
                this.f28569g = true;
                this.f28571i.a();
                throw e10;
            }
        }

        @Override // t9.F
        public G timeout() {
            return this.f28570h.timeout();
        }
    }

    public a(C2435c c2435c) {
        this.f28568a = c2435c;
    }

    private final D a(h9.b bVar, D d10) {
        if (bVar == null) {
            return d10;
        }
        t9.D dB = bVar.b();
        E eR = d10.r();
        AbstractC2855l.d(eR);
        b bVar2 = new b(eR.source(), bVar, s.c(dB));
        return d10.u0().b(new h(D.d0(d10, "Content-Type", null, 2, null), d10.r().contentLength(), s.d(bVar2))).c();
    }

    @Override // e9.v
    public D intercept(v.a chain) {
        r rVarM;
        E eR;
        E eR2;
        AbstractC2855l.g(chain, "chain");
        InterfaceC2437e interfaceC2437eCall = chain.call();
        C2435c c2435c = this.f28568a;
        D dE = c2435c != null ? c2435c.e(chain.d()) : null;
        c cVarB = new c.b(System.currentTimeMillis(), chain.d(), dE).b();
        B b10 = cVarB.b();
        D dA = cVarB.a();
        C2435c c2435c2 = this.f28568a;
        if (c2435c2 != null) {
            c2435c2.J(cVarB);
        }
        j9.e eVar = (j9.e) (interfaceC2437eCall instanceof j9.e ? interfaceC2437eCall : null);
        if (eVar == null || (rVarM = eVar.m()) == null) {
            rVarM = r.f26310a;
        }
        if (dE != null && dA == null && (eR2 = dE.r()) != null) {
            f9.c.j(eR2);
        }
        if (b10 == null && dA == null) {
            D dC = new D.a().r(chain.d()).p(A.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(f9.c.f27867c).s(-1L).q(System.currentTimeMillis()).c();
            rVarM.A(interfaceC2437eCall, dC);
            return dC;
        }
        if (b10 == null) {
            AbstractC2855l.d(dA);
            D dC2 = dA.u0().d(f28567b.f(dA)).c();
            rVarM.b(interfaceC2437eCall, dC2);
            return dC2;
        }
        if (dA != null) {
            rVarM.a(interfaceC2437eCall, dA);
        } else if (this.f28568a != null) {
            rVarM.c(interfaceC2437eCall);
        }
        try {
            D dA2 = chain.a(b10);
            if (dA2 == null && dE != null && eR != null) {
            }
            if (dA != null) {
                if (dA2 != null && dA2.I() == 304) {
                    D.a aVarU0 = dA.u0();
                    C0288a c0288a = f28567b;
                    D dC3 = aVarU0.k(c0288a.c(dA.g0(), dA2.g0())).s(dA2.J0()).q(dA2.A0()).d(c0288a.f(dA)).n(c0288a.f(dA2)).c();
                    E eR3 = dA2.r();
                    AbstractC2855l.d(eR3);
                    eR3.close();
                    C2435c c2435c3 = this.f28568a;
                    AbstractC2855l.d(c2435c3);
                    c2435c3.I();
                    this.f28568a.M(dA, dC3);
                    rVarM.b(interfaceC2437eCall, dC3);
                    return dC3;
                }
                E eR4 = dA.r();
                if (eR4 != null) {
                    f9.c.j(eR4);
                }
            }
            AbstractC2855l.d(dA2);
            D.a aVarU02 = dA2.u0();
            C0288a c0288a2 = f28567b;
            D dC4 = aVarU02.d(c0288a2.f(dA)).n(c0288a2.f(dA2)).c();
            if (this.f28568a != null) {
                if (k9.e.b(dC4) && c.f28573c.a(dC4, b10)) {
                    D dA3 = a(this.f28568a.r(dC4), dC4);
                    if (dA != null) {
                        rVarM.c(interfaceC2437eCall);
                    }
                    return dA3;
                }
                if (f.f29340a.a(b10.l())) {
                    try {
                        this.f28568a.s(b10);
                    } catch (IOException unused) {
                    }
                }
            }
            return dC4;
        } finally {
            if (dE != null && (eR = dE.r()) != null) {
                f9.c.j(eR);
            }
        }
    }
}
