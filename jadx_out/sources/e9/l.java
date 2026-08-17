package e9;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.AbstractC2884a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2441i[] f26260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2441i[] f26261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f26262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f26263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f26264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f26265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f26266k = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f26269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f26270d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f26272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f26273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f26274d;

        public a(boolean z10) {
            this.f26271a = z10;
        }

        public final l a() {
            return new l(this.f26271a, this.f26274d, this.f26272b, this.f26273c);
        }

        public final a b(C2441i... cipherSuites) {
            AbstractC2855l.g(cipherSuites, "cipherSuites");
            if (!this.f26271a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C2441i c2441i : cipherSuites) {
                arrayList.add(c2441i.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) throws CloneNotSupportedException {
            AbstractC2855l.g(cipherSuites, "cipherSuites");
            if (!this.f26271a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object objClone = cipherSuites.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f26272b = (String[]) objClone;
            return this;
        }

        public final a d(boolean z10) {
            if (!this.f26271a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f26274d = z10;
            return this;
        }

        public final a e(G... tlsVersions) {
            AbstractC2855l.g(tlsVersions, "tlsVersions");
            if (!this.f26271a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (G g10 : tlsVersions) {
                arrayList.add(g10.h());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) throws CloneNotSupportedException {
            AbstractC2855l.g(tlsVersions, "tlsVersions");
            if (!this.f26271a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object objClone = tlsVersions.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f26273c = (String[]) objClone;
            return this;
        }

        public a(l connectionSpec) {
            AbstractC2855l.g(connectionSpec, "connectionSpec");
            this.f26271a = connectionSpec.f();
            this.f26272b = connectionSpec.f26269c;
            this.f26273c = connectionSpec.f26270d;
            this.f26274d = connectionSpec.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C2441i c2441i = C2441i.f26228n1;
        C2441i c2441i2 = C2441i.f26231o1;
        C2441i c2441i3 = C2441i.f26234p1;
        C2441i c2441i4 = C2441i.f26187Z0;
        C2441i c2441i5 = C2441i.f26198d1;
        C2441i c2441i6 = C2441i.f26189a1;
        C2441i c2441i7 = C2441i.f26201e1;
        C2441i c2441i8 = C2441i.f26219k1;
        C2441i c2441i9 = C2441i.f26216j1;
        C2441i[] c2441iArr = {c2441i, c2441i2, c2441i3, c2441i4, c2441i5, c2441i6, c2441i7, c2441i8, c2441i9};
        f26260e = c2441iArr;
        C2441i[] c2441iArr2 = {c2441i, c2441i2, c2441i3, c2441i4, c2441i5, c2441i6, c2441i7, c2441i8, c2441i9, C2441i.f26157K0, C2441i.f26159L0, C2441i.f26212i0, C2441i.f26215j0, C2441i.f26148G, C2441i.f26156K, C2441i.f26217k};
        f26261f = c2441iArr2;
        a aVarB = new a(true).b((C2441i[]) Arrays.copyOf(c2441iArr, c2441iArr.length));
        G g10 = G.TLS_1_3;
        G g11 = G.TLS_1_2;
        f26262g = aVarB.e(g10, g11).d(true).a();
        f26263h = new a(true).b((C2441i[]) Arrays.copyOf(c2441iArr2, c2441iArr2.length)).e(g10, g11).d(true).a();
        f26264i = new a(true).b((C2441i[]) Arrays.copyOf(c2441iArr2, c2441iArr2.length)).e(g10, g11, G.TLS_1_1, G.TLS_1_0).d(true).a();
        f26265j = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f26267a = z10;
        this.f26268b = z11;
        this.f26269c = strArr;
        this.f26270d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) throws CloneNotSupportedException {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f26269c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            AbstractC2855l.f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = f9.c.B(enabledCipherSuites, this.f26269c, C2441i.f26243s1.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f26270d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            AbstractC2855l.f(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = f9.c.B(enabledProtocols, this.f26270d, AbstractC2884a.d());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC2855l.f(supportedCipherSuites, "supportedCipherSuites");
        int iU = f9.c.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C2441i.f26243s1.c());
        if (z10 && iU != -1) {
            AbstractC2855l.f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iU];
            AbstractC2855l.f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = f9.c.l(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        AbstractC2855l.f(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        AbstractC2855l.f(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarC.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z10) throws CloneNotSupportedException {
        AbstractC2855l.g(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z10);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f26270d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f26269c);
        }
    }

    public final List d() {
        String[] strArr = this.f26269c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C2441i.f26243s1.b(str));
        }
        return AbstractC2800q.P0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        AbstractC2855l.g(socket, "socket");
        if (!this.f26267a) {
            return false;
        }
        String[] strArr = this.f26270d;
        if (strArr != null && !f9.c.r(strArr, socket.getEnabledProtocols(), AbstractC2884a.d())) {
            return false;
        }
        String[] strArr2 = this.f26269c;
        return strArr2 == null || f9.c.r(strArr2, socket.getEnabledCipherSuites(), C2441i.f26243s1.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f26267a;
        l lVar = (l) obj;
        if (z10 != lVar.f26267a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f26269c, lVar.f26269c) && Arrays.equals(this.f26270d, lVar.f26270d) && this.f26268b == lVar.f26268b);
    }

    public final boolean f() {
        return this.f26267a;
    }

    public final boolean h() {
        return this.f26268b;
    }

    public int hashCode() {
        if (!this.f26267a) {
            return 17;
        }
        String[] strArr = this.f26269c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f26270d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f26268b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f26270d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(G.f26054n.a(str));
        }
        return AbstractC2800q.P0(arrayList);
    }

    public String toString() {
        if (!this.f26267a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f26268b + ')';
    }
}
