package p9;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p9.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f30695b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l.a f30694a = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements l.a {
        a() {
        }

        @Override // p9.l.a
        public boolean a(SSLSocket sslSocket) {
            AbstractC2855l.g(sslSocket, "sslSocket");
            o9.c.f30572f.b();
            return false;
        }

        @Override // p9.l.a
        public m b(SSLSocket sslSocket) {
            AbstractC2855l.g(sslSocket, "sslSocket");
            return new i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public final l.a a() {
            return i.f30694a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // p9.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        return false;
    }

    @Override // p9.m
    public boolean b() {
        return o9.c.f30572f.b();
    }

    @Override // p9.m
    public String c(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(PointerEventHelper.POINTER_TYPE_UNKNOWN))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p9.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters sslParameters = bCSSLSocket.getParameters();
            AbstractC2855l.f(sslParameters, "sslParameters");
            Object[] array = o9.j.f30594c.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sslParameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(sslParameters);
        }
    }
}
