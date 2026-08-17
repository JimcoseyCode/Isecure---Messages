package e9;

import j7.AbstractC2800q;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.k;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: e9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2439g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f26128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r9.c f26129b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26127d = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2439g f26126c = new a().a();

    /* JADX INFO: renamed from: e9.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f26130a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final C2439g a() {
            return new C2439g(AbstractC2800q.T0(this.f26130a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: e9.g$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public final String a(Certificate certificate) {
            AbstractC2855l.g(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).j();
        }

        public final t9.k b(X509Certificate sha256Hash) {
            AbstractC2855l.g(sha256Hash, "$this$sha256Hash");
            k.a aVar = t9.k.f32603j;
            PublicKey publicKey = sha256Hash.getPublicKey();
            AbstractC2855l.f(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            AbstractC2855l.f(encoded, "publicKey.encoded");
            return k.a.j(aVar, encoded, 0, 0, 3, null).D();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: e9.g$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends kotlin.jvm.internal.n implements InterfaceC3487a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f26132i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f26133j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, String str) {
            super(0);
            this.f26132i = list;
            this.f26133j = str;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> listA;
            r9.c cVarD = C2439g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f26132i, this.f26133j)) == null) {
                listA = this.f26132i;
            }
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listA, 10));
            for (Certificate certificate : listA) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C2439g(Set pins, r9.c cVar) {
        AbstractC2855l.g(pins, "pins");
        this.f26128a = pins;
        this.f26129b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        AbstractC2855l.g(hostname, "hostname");
        AbstractC2855l.g(peerCertificates, "peerCertificates");
        b(hostname, new c(peerCertificates, hostname));
    }

    public final void b(String hostname, InterfaceC3487a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        AbstractC2855l.g(hostname, "hostname");
        AbstractC2855l.g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f26127d.a(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            AbstractC2855l.f(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        AbstractC2855l.g(hostname, "hostname");
        Set set = this.f26128a;
        List listJ = AbstractC2800q.j();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listJ;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public final r9.c d() {
        return this.f26129b;
    }

    public final C2439g e(r9.c certificateChainCleaner) {
        AbstractC2855l.g(certificateChainCleaner, "certificateChainCleaner");
        return AbstractC2855l.b(this.f26129b, certificateChainCleaner) ? this : new C2439g(this.f26128a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2439g)) {
            return false;
        }
        C2439g c2439g = (C2439g) obj;
        return AbstractC2855l.b(c2439g.f26128a, this.f26128a) && AbstractC2855l.b(c2439g.f26129b, this.f26129b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f26128a.hashCode()) * 41;
        r9.c cVar = this.f26129b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C2439g(Set set, r9.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
