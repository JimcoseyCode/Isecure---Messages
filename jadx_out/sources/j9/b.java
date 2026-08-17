package j9;

import e9.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f28962d;

    public b(List connectionSpecs) {
        AbstractC2855l.g(connectionSpecs, "connectionSpecs");
        this.f28962d = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f28962d.size();
        for (int i10 = this.f28959a; i10 < size; i10++) {
            if (((l) this.f28962d.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException, CloneNotSupportedException {
        l lVar;
        AbstractC2855l.g(sslSocket, "sslSocket");
        int i10 = this.f28959a;
        int size = this.f28962d.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f28962d.get(i10);
            if (lVar.e(sslSocket)) {
                this.f28959a = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f28960b = c(sslSocket);
            lVar.c(sslSocket, this.f28961c);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f28961c);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.f28962d);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        AbstractC2855l.d(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC2855l.f(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException e10) {
        AbstractC2855l.g(e10, "e");
        this.f28961c = true;
        if (!this.f28960b || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
