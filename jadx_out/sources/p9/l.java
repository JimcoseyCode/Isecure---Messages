package p9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f30702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f30703b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a socketAdapterFactory) {
        AbstractC2855l.g(socketAdapterFactory, "socketAdapterFactory");
        this.f30703b = socketAdapterFactory;
    }

    private final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f30702a == null && this.f30703b.a(sSLSocket)) {
                this.f30702a = this.f30703b.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f30702a;
    }

    @Override // p9.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        return this.f30703b.a(sslSocket);
    }

    @Override // p9.m
    public boolean b() {
        return true;
    }

    @Override // p9.m
    public String c(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            return mVarE.c(sslSocket);
        }
        return null;
    }

    @Override // p9.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            mVarE.d(sslSocket, str, protocols);
        }
    }
}
