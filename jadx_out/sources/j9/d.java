package j9;

import e9.C2433a;
import e9.F;
import e9.r;
import e9.u;
import e9.z;
import i7.C2735B;
import j9.k;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import m9.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k.b f28980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f28981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f28985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f28986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2433a f28987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f28988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f28989j;

    public d(h connectionPool, C2433a address, e call, r eventListener) {
        AbstractC2855l.g(connectionPool, "connectionPool");
        AbstractC2855l.g(address, "address");
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(eventListener, "eventListener");
        this.f28986g = connectionPool;
        this.f28987h = address;
        this.f28988i = call;
        this.f28989j = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final f b(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        List listA;
        Socket socketW;
        if (this.f28988i.s()) {
            throw new IOException("Canceled");
        }
        f fVarL = this.f28988i.l();
        if (fVarL != null) {
            synchronized (fVarL) {
                try {
                    socketW = (fVarL.p() || !g(fVarL.A().a().l())) ? this.f28988i.w() : null;
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f28988i.l() != null) {
                if (socketW == null) {
                    return fVarL;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketW != null) {
                f9.c.k(socketW);
            }
            this.f28989j.l(this.f28988i, fVarL);
        }
        this.f28982c = 0;
        this.f28983d = 0;
        this.f28984e = 0;
        if (this.f28986g.a(this.f28987h, this.f28988i, null, false)) {
            f fVarL2 = this.f28988i.l();
            AbstractC2855l.d(fVarL2);
            this.f28989j.k(this.f28988i, fVarL2);
            return fVarL2;
        }
        F fC = this.f28985f;
        try {
            if (fC == null) {
                k.b bVar = this.f28980a;
                if (bVar != null) {
                    AbstractC2855l.d(bVar);
                    if (bVar.b()) {
                        k.b bVar2 = this.f28980a;
                        AbstractC2855l.d(bVar2);
                        fC = bVar2.c();
                    }
                }
                k kVar = this.f28981b;
                if (kVar == null) {
                    kVar = new k(this.f28987h, this.f28988i.k().x(), this.f28988i, this.f28989j);
                    this.f28981b = kVar;
                }
                k.b bVarD = kVar.d();
                this.f28980a = bVarD;
                listA = bVarD.a();
                if (this.f28988i.s()) {
                    throw new IOException("Canceled");
                }
                if (this.f28986g.a(this.f28987h, this.f28988i, listA, false)) {
                    f fVarL3 = this.f28988i.l();
                    AbstractC2855l.d(fVarL3);
                    this.f28989j.k(this.f28988i, fVarL3);
                    return fVarL3;
                }
                fC = bVarD.c();
                f fVar = new f(this.f28986g, fC);
                this.f28988i.y(fVar);
                fVar.f(i10, i11, i12, i13, z10, this.f28988i, this.f28989j);
                this.f28988i.y(null);
                this.f28988i.k().x().a(fVar.A());
                if (this.f28986g.a(this.f28987h, this.f28988i, listA, true)) {
                    synchronized (fVar) {
                        this.f28986g.e(fVar);
                        this.f28988i.c(fVar);
                        C2735B c2735b2 = C2735B.f28704a;
                    }
                    this.f28989j.k(this.f28988i, fVar);
                    return fVar;
                }
                f fVarL4 = this.f28988i.l();
                AbstractC2855l.d(fVarL4);
                this.f28985f = fC;
                f9.c.k(fVar.E());
                this.f28989j.k(this.f28988i, fVarL4);
                return fVarL4;
            }
            AbstractC2855l.d(fC);
            this.f28985f = null;
            fVar.f(i10, i11, i12, i13, z10, this.f28988i, this.f28989j);
            this.f28988i.y(null);
            this.f28988i.k().x().a(fVar.A());
            if (this.f28986g.a(this.f28987h, this.f28988i, listA, true)) {
            }
        } catch (Throwable th2) {
            this.f28988i.y(null);
            throw th2;
        }
        listA = null;
        f fVar2 = new f(this.f28986g, fC);
        this.f28988i.y(fVar2);
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            f fVarB = b(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            if (fVarB.u(z11)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f28985f == null) {
                k.b bVar = this.f28980a;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    k kVar = this.f28981b;
                    if (!(kVar != null ? kVar.b() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i10 = i17;
            i11 = i16;
            i12 = i15;
            i13 = i14;
            z10 = z12;
        }
    }

    private final F f() {
        f fVarL;
        if (this.f28982c > 1 || this.f28983d > 1 || this.f28984e > 0 || (fVarL = this.f28988i.l()) == null) {
            return null;
        }
        synchronized (fVarL) {
            if (fVarL.q() != 0) {
                return null;
            }
            if (f9.c.g(fVarL.A().a().l(), this.f28987h.l())) {
                return fVarL.A();
            }
            return null;
        }
    }

    public final k9.d a(z client, k9.g chain) {
        AbstractC2855l.g(client, "client");
        AbstractC2855l.g(chain, "chain");
        try {
            try {
                return c(chain.f(), chain.h(), chain.j(), client.E(), client.K(), !AbstractC2855l.b(chain.i().l(), "GET")).w(client, chain);
            } catch (j e10) {
                e = e10;
                j jVar = e;
                h(jVar.c());
                throw jVar;
            } catch (IOException e11) {
                e = e11;
                IOException iOException = e;
                h(iOException);
                throw new j(iOException);
            }
        } catch (j e12) {
            e = e12;
        } catch (IOException e13) {
            e = e13;
        }
    }

    public final C2433a d() {
        return this.f28987h;
    }

    public final boolean e() {
        k kVar;
        if (this.f28982c == 0 && this.f28983d == 0 && this.f28984e == 0) {
            return false;
        }
        if (this.f28985f != null) {
            return true;
        }
        F f10 = f();
        if (f10 != null) {
            this.f28985f = f10;
            return true;
        }
        k.b bVar = this.f28980a;
        if ((bVar == null || !bVar.b()) && (kVar = this.f28981b) != null) {
            return kVar.b();
        }
        return true;
    }

    public final boolean g(u url) {
        AbstractC2855l.g(url, "url");
        u uVarL = this.f28987h.l();
        return url.l() == uVarL.l() && AbstractC2855l.b(url.h(), uVarL.h());
    }

    public final void h(IOException e10) {
        AbstractC2855l.g(e10, "e");
        this.f28985f = null;
        if ((e10 instanceof n) && ((n) e10).f30007g == m9.b.REFUSED_STREAM) {
            this.f28982c++;
        } else if (e10 instanceof m9.a) {
            this.f28983d++;
        } else {
            this.f28984e++;
        }
    }
}
