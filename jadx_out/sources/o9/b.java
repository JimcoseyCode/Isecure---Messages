package o9;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import j7.AbstractC2800q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p9.k;
import p9.l;
import p9.m;
import p9.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f30565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f30566g = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f30567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p9.j f30568e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final j a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f30565f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: o9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0341b implements r9.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f30569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f30570b;

        public C0341b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            AbstractC2855l.g(trustManager, "trustManager");
            AbstractC2855l.g(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f30569a = trustManager;
            this.f30570b = findByIssuerAndSignatureMethod;
        }

        @Override // r9.e
        public X509Certificate a(X509Certificate cert) {
            AbstractC2855l.g(cert, "cert");
            try {
                Object objInvoke = this.f30570b.invoke(this.f30569a, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0341b)) {
                return false;
            }
            C0341b c0341b = (C0341b) obj;
            return AbstractC2855l.b(this.f30569a, c0341b.f30569a) && AbstractC2855l.b(this.f30570b, c0341b.f30570b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f30569a;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f30570b;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f30569a + ", findByIssuerAndSignatureMethod=" + this.f30570b + ")";
        }
    }

    static {
        boolean z10 = false;
        if (j.f30594c.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f30565f = z10;
    }

    public b() {
        List listO = AbstractC2800q.o(n.a.b(n.f30704j, null, 1, null), new l(p9.h.f30687g.d()), new l(k.f30701b.a()), new l(p9.i.f30695b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f30567d = arrayList;
        this.f30568e = p9.j.f30696d.a();
    }

    @Override // o9.j
    public r9.c c(X509TrustManager trustManager) {
        AbstractC2855l.g(trustManager, "trustManager");
        p9.d dVarA = p9.d.f30679d.a(trustManager);
        return dVarA != null ? dVarA : super.c(trustManager);
    }

    @Override // o9.j
    public r9.e d(X509TrustManager trustManager) {
        AbstractC2855l.g(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            AbstractC2855l.f(method, "method");
            method.setAccessible(true);
            return new C0341b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // o9.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        Iterator it = this.f30567d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((m) next).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // o9.j
    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC2855l.g(socket, "socket");
        AbstractC2855l.g(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // o9.j
    public String h(SSLSocket sslSocket) {
        Object next;
        AbstractC2855l.g(sslSocket, "sslSocket");
        Iterator it = this.f30567d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((m) next).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            return mVar.c(sslSocket);
        }
        return null;
    }

    @Override // o9.j
    public Object i(String closer) {
        AbstractC2855l.g(closer, "closer");
        return this.f30568e.a(closer);
    }

    @Override // o9.j
    public boolean j(String hostname) {
        AbstractC2855l.g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // o9.j
    public void m(String message, Object obj) {
        AbstractC2855l.g(message, "message");
        if (this.f30568e.b(obj)) {
            return;
        }
        j.l(this, message, 5, null, 4, null);
    }
}
