package p9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import p9.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f30701b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l.a f30700a = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements l.a {
        a() {
        }

        @Override // p9.l.a
        public boolean a(SSLSocket sslSocket) {
            AbstractC2855l.g(sslSocket, "sslSocket");
            return o9.d.f30575f.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // p9.l.a
        public m b(SSLSocket sslSocket) {
            AbstractC2855l.g(sslSocket, "sslSocket");
            return new k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public final l.a a() {
            return k.f30700a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // p9.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p9.m
    public boolean b() {
        return o9.d.f30575f.c();
    }

    @Override // p9.m
    public String c(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p9.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = o9.j.f30594c.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
