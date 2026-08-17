package k9;

import P8.q;
import e9.B;
import e9.C;
import e9.D;
import e9.E;
import e9.v;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC2855l;
import t9.InterfaceC3392i;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29334a;

    public b(boolean z10) {
        this.f29334a = z10;
    }

    @Override // e9.v
    public D intercept(v.a chain) throws IOException {
        boolean z10;
        D.a aVarQ;
        AbstractC2855l.g(chain, "chain");
        g gVar = (g) chain;
        j9.c cVarG = gVar.g();
        AbstractC2855l.d(cVarG);
        B bI = gVar.i();
        C cE = bI.e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cVarG.v(bI);
        if (!f.b(bI.l()) || cE == null) {
            cVarG.o();
            z10 = true;
            aVarQ = null;
        } else {
            if (q.x("100-continue", bI.h("Expect"), true)) {
                cVarG.f();
                aVarQ = cVarG.q(true);
                cVarG.s();
                z10 = false;
            } else {
                z10 = true;
                aVarQ = null;
            }
            if (aVarQ != null) {
                cVarG.o();
                if (!cVarG.h().v()) {
                    cVarG.n();
                }
            } else if (cE.isDuplex()) {
                cVarG.f();
                cE.writeTo(s.c(cVarG.c(bI, true)));
            } else {
                InterfaceC3392i interfaceC3392iC = s.c(cVarG.c(bI, false));
                cE.writeTo(interfaceC3392iC);
                interfaceC3392iC.close();
            }
        }
        if (cE == null || !cE.isDuplex()) {
            cVarG.e();
        }
        if (aVarQ == null) {
            aVarQ = cVarG.q(false);
            AbstractC2855l.d(aVarQ);
            if (z10) {
                cVarG.s();
                z10 = false;
            }
        }
        D dC = aVarQ.r(bI).i(cVarG.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
        int I9 = dC.I();
        if (I9 == 100) {
            D.a aVarQ2 = cVarG.q(false);
            AbstractC2855l.d(aVarQ2);
            if (z10) {
                cVarG.s();
            }
            dC = aVarQ2.r(bI).i(cVarG.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
            I9 = dC.I();
        }
        cVarG.r(dC);
        D dC2 = (this.f29334a && I9 == 101) ? dC.u0().b(f9.c.f27867c).c() : dC.u0().b(cVarG.p(dC)).c();
        if (q.x("close", dC2.D0().h("Connection"), true) || q.x("close", D.d0(dC2, "Connection", null, 2, null), true)) {
            cVarG.n();
        }
        if (I9 == 204 || I9 == 205) {
            E eR = dC2.r();
            if ((eR != null ? eR.contentLength() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(I9);
                sb.append(" had non-zero Content-Length: ");
                E eR2 = dC2.r();
                sb.append(eR2 != null ? Long.valueOf(eR2.contentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return dC2;
    }
}
