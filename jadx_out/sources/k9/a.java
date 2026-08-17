package k9;

import P8.q;
import e9.B;
import e9.C;
import e9.D;
import e9.E;
import e9.m;
import e9.n;
import e9.v;
import e9.x;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import t9.p;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f29333a;

    public a(n cookieJar) {
        AbstractC2855l.g(cookieJar, "cookieJar");
        this.f29333a = cookieJar;
    }

    private final String a(List list) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb.append("; ");
            }
            sb.append(mVar.g());
            sb.append('=');
            sb.append(mVar.i());
            i10 = i11;
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // e9.v
    public D intercept(v.a chain) {
        E eR;
        AbstractC2855l.g(chain, "chain");
        B bD = chain.d();
        B.a aVarM = bD.m();
        C cE = bD.e();
        if (cE != null) {
            x xVarContentType = cE.get$mediaType();
            if (xVarContentType != null) {
                aVarM.e("Content-Type", xVarContentType.toString());
            }
            long jContentLength = cE.contentLength();
            if (jContentLength != -1) {
                aVarM.e("Content-Length", String.valueOf(jContentLength));
                aVarM.i("Transfer-Encoding");
            } else {
                aVarM.e("Transfer-Encoding", "chunked");
                aVarM.i("Content-Length");
            }
        }
        boolean z10 = false;
        if (bD.h("Host") == null) {
            aVarM.e("Host", f9.c.Q(bD.p(), false, 1, null));
        }
        if (bD.h("Connection") == null) {
            aVarM.e("Connection", "Keep-Alive");
        }
        if (bD.h("Accept-Encoding") == null && bD.h("Range") == null) {
            aVarM.e("Accept-Encoding", "gzip");
            z10 = true;
        }
        List listLoadForRequest = this.f29333a.loadForRequest(bD.p());
        if (!listLoadForRequest.isEmpty()) {
            aVarM.e("Cookie", a(listLoadForRequest));
        }
        if (bD.h("User-Agent") == null) {
            aVarM.e("User-Agent", "okhttp/4.9.2");
        }
        D dA = chain.a(aVarM.b());
        e.f(this.f29333a, bD.p(), dA.g0());
        D.a aVarR = dA.u0().r(bD);
        if (z10 && q.x("gzip", D.d0(dA, "Content-Encoding", null, 2, null), true) && e.b(dA) && (eR = dA.r()) != null) {
            p pVar = new p(eR.source());
            aVarR.k(dA.g0().r().h("Content-Encoding").h("Content-Length").e());
            aVarR.b(new h(D.d0(dA, "Content-Type", null, 2, null), -1L, s.d(pVar)));
        }
        return aVarR.c();
    }
}
