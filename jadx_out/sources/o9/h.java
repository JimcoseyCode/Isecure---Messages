package o9;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class h extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f30587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f30588e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final h a() {
            if (b()) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f30587d;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numN = property != null ? q.n(property) : null;
        boolean z10 = false;
        if (numN == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numN.intValue() >= 9) {
            z10 = true;
        }
        f30587d = z10;
    }

    @Override // o9.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        SSLParameters sslParameters = sslSocket.getSSLParameters();
        List listB = j.f30594c.b(protocols);
        AbstractC2855l.f(sslParameters, "sslParameters");
        Object[] array = listB.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sslParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sslParameters);
    }

    @Override // o9.j
    public String h(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() == 0) {
                    if (applicationProtocol.equals(PointerEventHelper.POINTER_TYPE_UNKNOWN)) {
                    }
                }
                return applicationProtocol;
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
