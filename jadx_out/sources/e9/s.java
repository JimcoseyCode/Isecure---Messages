package e9;

import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26312e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f26313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f26314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2441i f26315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f26316d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: e9.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0269a extends kotlin.jvm.internal.n implements InterfaceC3487a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ List f26317h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0269a(List list) {
                super(0);
                this.f26317h = list;
            }

            @Override // w7.InterfaceC3487a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f26317h;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class b extends kotlin.jvm.internal.n implements InterfaceC3487a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ List f26318h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f26318h = list;
            }

            @Override // w7.InterfaceC3487a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f26318h;
            }
        }

        private a() {
        }

        private final List c(Certificate[] certificateArr) {
            return certificateArr != null ? f9.c.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : AbstractC2800q.j();
        }

        public final s a(G tlsVersion, C2441i cipherSuite, List peerCertificates, List localCertificates) {
            AbstractC2855l.g(tlsVersion, "tlsVersion");
            AbstractC2855l.g(cipherSuite, "cipherSuite");
            AbstractC2855l.g(peerCertificates, "peerCertificates");
            AbstractC2855l.g(localCertificates, "localCertificates");
            return new s(tlsVersion, cipherSuite, f9.c.R(localCertificates), new C0269a(f9.c.R(peerCertificates)));
        }

        public final s b(SSLSession handshake) throws IOException {
            List listJ;
            AbstractC2855l.g(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C2441i c2441iB = C2441i.f26243s1.b(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (AbstractC2855l.b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            G gA = G.f26054n.a(protocol);
            try {
                listJ = c(handshake.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listJ = AbstractC2800q.j();
            }
            return new s(gA, c2441iB, c(handshake.getLocalCertificates()), new b(listJ));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends kotlin.jvm.internal.n implements InterfaceC3487a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC3487a f26319h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3487a interfaceC3487a) {
            super(0);
            this.f26319h = interfaceC3487a;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.f26319h.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return AbstractC2800q.j();
            }
        }
    }

    public s(G tlsVersion, C2441i cipherSuite, List localCertificates, InterfaceC3487a peerCertificatesFn) {
        AbstractC2855l.g(tlsVersion, "tlsVersion");
        AbstractC2855l.g(cipherSuite, "cipherSuite");
        AbstractC2855l.g(localCertificates, "localCertificates");
        AbstractC2855l.g(peerCertificatesFn, "peerCertificatesFn");
        this.f26314b = tlsVersion;
        this.f26315c = cipherSuite;
        this.f26316d = localCertificates;
        this.f26313a = AbstractC2746i.b(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        AbstractC2855l.f(type, "type");
        return type;
    }

    public final C2441i a() {
        return this.f26315c;
    }

    public final List c() {
        return this.f26316d;
    }

    public final List d() {
        return (List) this.f26313a.getValue();
    }

    public final G e() {
        return this.f26314b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f26314b == this.f26314b && AbstractC2855l.b(sVar.f26315c, this.f26315c) && AbstractC2855l.b(sVar.d(), d()) && AbstractC2855l.b(sVar.f26316d, this.f26316d);
    }

    public int hashCode() {
        return ((((((527 + this.f26314b.hashCode()) * 31) + this.f26315c.hashCode()) * 31) + d().hashCode()) * 31) + this.f26316d.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.f26314b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.f26315c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(string);
        sb.append(' ');
        sb.append("localCertificates=");
        List list = this.f26316d;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
