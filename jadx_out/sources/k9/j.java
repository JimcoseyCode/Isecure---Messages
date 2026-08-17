package k9;

import P8.o;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.image.ReactImageView;
import e9.B;
import e9.C;
import e9.D;
import e9.F;
import e9.u;
import e9.v;
import e9.z;
import j7.AbstractC2800q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29354b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f29355a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(z client) {
        AbstractC2855l.g(client, "client");
        this.f29355a = client;
    }

    private final B a(D d10, String str) {
        String strD0;
        u uVarO;
        if (!this.f29355a.v() || (strD0 = D.d0(d10, "Location", null, 2, null)) == null || (uVarO = d10.D0().p().o(strD0)) == null) {
            return null;
        }
        if (!AbstractC2855l.b(uVarO.p(), d10.D0().p().p()) && !this.f29355a.w()) {
            return null;
        }
        B.a aVarM = d10.D0().m();
        if (f.b(str)) {
            int I9 = d10.I();
            f fVar = f.f29340a;
            boolean z10 = fVar.d(str) || I9 == 308 || I9 == 307;
            if (!fVar.c(str) || I9 == 308 || I9 == 307) {
                aVarM.g(str, z10 ? d10.D0().e() : null);
            } else {
                aVarM.g("GET", null);
            }
            if (!z10) {
                aVarM.i("Transfer-Encoding");
                aVarM.i("Content-Length");
                aVarM.i("Content-Type");
            }
        }
        if (!f9.c.g(d10.D0().p(), uVarO)) {
            aVarM.i("Authorization");
        }
        return aVarM.l(uVarO).b();
    }

    private final B b(D d10, j9.c cVar) throws ProtocolException {
        j9.f fVarH;
        F fA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int I9 = d10.I();
        String strL = d10.D0().l();
        if (I9 != 307 && I9 != 308) {
            if (I9 == 401) {
                return this.f29355a.i().a(fA, d10);
            }
            if (I9 == 421) {
                C cE = d10.D0().e();
                if ((cE != null && cE.isOneShot()) || cVar == null || !cVar.k()) {
                    return null;
                }
                cVar.h().y();
                return d10.D0();
            }
            if (I9 == 503) {
                D dW0 = d10.w0();
                if ((dW0 == null || dW0.I() != 503) && f(d10, ViewDefaults.NUMBER_OF_LINES) == 0) {
                    return d10.D0();
                }
                return null;
            }
            if (I9 == 407) {
                AbstractC2855l.d(fA);
                if (fA.b().type() == Proxy.Type.HTTP) {
                    return this.f29355a.H().a(fA, d10);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (I9 == 408) {
                if (!this.f29355a.K()) {
                    return null;
                }
                C cE2 = d10.D0().e();
                if (cE2 != null && cE2.isOneShot()) {
                    return null;
                }
                D dW02 = d10.w0();
                if ((dW02 == null || dW02.I() != 408) && f(d10, 0) <= 0) {
                    return d10.D0();
                }
                return null;
            }
            switch (I9) {
                case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(d10, strL);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, j9.e eVar, B b10, boolean z10) {
        if (this.f29355a.K()) {
            return !(z10 && e(iOException, b10)) && c(iOException, z10) && eVar.x();
        }
        return false;
    }

    private final boolean e(IOException iOException, B b10) {
        C cE = b10.e();
        return (cE != null && cE.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(D d10, int i10) {
        String strD0 = D.d0(d10, "Retry-After", null, 2, null);
        if (strD0 == null) {
            return i10;
        }
        if (!new o("\\d+").d(strD0)) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        Integer numValueOf = Integer.valueOf(strD0);
        AbstractC2855l.f(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.o();
        r6 = b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.l() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        f9.c.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.u0().o(r7.u0().b(null).c()).c();
     */
    @Override // e9.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D intercept(v.a chain) {
        B b10;
        AbstractC2855l.g(chain, "chain");
        g gVar = (g) chain;
        B bI = gVar.i();
        j9.e eVarE = gVar.e();
        List listJ = AbstractC2800q.j();
        int i10 = 0;
        D d10 = null;
        while (true) {
            boolean z10 = true;
            while (true) {
                eVarE.i(bI, z10);
                try {
                    if (eVarE.s()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        D dA = gVar.a(bI);
                        break;
                    } catch (j9.j e10) {
                        if (!d(e10.c(), eVarE, bI, false)) {
                            throw f9.c.X(e10.b(), listJ);
                        }
                        listJ = AbstractC2800q.A0(listJ, e10.b());
                        eVarE.j(true);
                        z10 = false;
                    } catch (IOException e11) {
                        if (!d(e11, eVarE, bI, !(e11 instanceof m9.a))) {
                            throw f9.c.X(e11, listJ);
                        }
                        listJ = AbstractC2800q.A0(listJ, e11);
                        eVarE.j(true);
                        z10 = false;
                    }
                    eVarE.j(true);
                    z10 = false;
                } catch (Throwable th) {
                    eVarE.j(true);
                    throw th;
                }
            }
            eVarE.j(true);
            bI = b10;
        }
    }
}
