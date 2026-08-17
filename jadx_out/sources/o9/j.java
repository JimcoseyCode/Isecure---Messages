package o9;

import e9.A;
import e9.z;
import j7.AbstractC2800q;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.C3391h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile j f30592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f30593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30594c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        private final j d() {
            p9.e.f30684c.b();
            j jVarA = o9.a.f30563f.a();
            if (jVarA != null) {
                return jVarA;
            }
            j jVarA2 = b.f30566g.a();
            AbstractC2855l.d(jVarA2);
            return jVarA2;
        }

        private final j e() {
            i iVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.f30575f.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.f30572f.a()) != null) {
                return cVarA;
            }
            if (k() && (iVarA = i.f30590f.a()) != null) {
                return iVarA;
            }
            h hVarA = h.f30588e.a();
            if (hVarA != null) {
                return hVarA;
            }
            j jVarA = e.f30578i.a();
            return jVarA != null ? jVarA : new j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            AbstractC2855l.f(provider, "Security.getProviders()[0]");
            return AbstractC2855l.b("BC", provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            AbstractC2855l.f(provider, "Security.getProviders()[0]");
            return AbstractC2855l.b("Conscrypt", provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            AbstractC2855l.f(provider, "Security.getProviders()[0]");
            return AbstractC2855l.b("OpenJSSE", provider.getName());
        }

        public final List b(List protocols) {
            AbstractC2855l.g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((A) obj) != A.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((A) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            AbstractC2855l.g(protocols, "protocols");
            C3391h c3391h = new C3391h();
            for (String str : b(protocols)) {
                c3391h.writeByte(str.length());
                c3391h.V(str);
            }
            return c3391h.C();
        }

        public final j g() {
            return j.f30592a;
        }

        public final boolean h() {
            return AbstractC2855l.b("Dalvik", System.getProperty("java.vm.name"));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f30594c = aVar;
        f30592a = aVar.f();
        f30593b = Logger.getLogger(z.class.getName());
    }

    public static /* synthetic */ void l(j jVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        jVar.k(str, i10, th);
    }

    public void b(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
    }

    public r9.c c(X509TrustManager trustManager) {
        AbstractC2855l.g(trustManager, "trustManager");
        return new r9.a(d(trustManager));
    }

    public r9.e d(X509TrustManager trustManager) {
        AbstractC2855l.g(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        AbstractC2855l.f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new r9.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC2855l.g(socket, "socket");
        AbstractC2855l.g(address, "address");
        socket.connect(address, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        AbstractC2855l.g(closer, "closer");
        if (f30593b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        AbstractC2855l.g(hostname, "hostname");
        return true;
    }

    public void k(String message, int i10, Throwable th) {
        AbstractC2855l.g(message, "message");
        f30593b.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void m(String message, Object obj) {
        AbstractC2855l.g(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC2855l.f(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        AbstractC2855l.g(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            AbstractC2855l.f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init((KeyStore) null);
        AbstractC2855l.f(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        AbstractC2855l.d(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC2855l.f(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        AbstractC2855l.f(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
