package o9;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import j7.AbstractC2800q;
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

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f30562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0340a f30563f = new C0340a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f30564d;

    /* JADX INFO: renamed from: o9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0340a {
        private C0340a() {
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f30562e;
        }

        public /* synthetic */ C0340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f30562e = j.f30594c.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listO = AbstractC2800q.o(p9.c.f30678a.a(), new l(p9.h.f30687g.d()), new l(k.f30701b.a()), new l(p9.i.f30695b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f30564d = arrayList;
    }

    @Override // o9.j
    public r9.c c(X509TrustManager trustManager) {
        AbstractC2855l.g(trustManager, "trustManager");
        p9.d dVarA = p9.d.f30679d.a(trustManager);
        return dVarA != null ? dVarA : super.c(trustManager);
    }

    @Override // o9.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        Iterator it = this.f30564d.iterator();
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
    public String h(SSLSocket sslSocket) {
        Object next;
        AbstractC2855l.g(sslSocket, "sslSocket");
        Iterator it = this.f30564d.iterator();
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
    public boolean j(String hostname) {
        AbstractC2855l.g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
