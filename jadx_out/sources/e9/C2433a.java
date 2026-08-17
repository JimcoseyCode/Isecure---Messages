package e9;

import e9.u;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: e9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2433a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f26056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f26057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f26058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f26059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SocketFactory f26060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SSLSocketFactory f26061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HostnameVerifier f26062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2439g f26063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC2434b f26064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Proxy f26065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ProxySelector f26066k;

    public C2433a(String uriHost, int i10, q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2439g c2439g, InterfaceC2434b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC2855l.g(uriHost, "uriHost");
        AbstractC2855l.g(dns, "dns");
        AbstractC2855l.g(socketFactory, "socketFactory");
        AbstractC2855l.g(proxyAuthenticator, "proxyAuthenticator");
        AbstractC2855l.g(protocols, "protocols");
        AbstractC2855l.g(connectionSpecs, "connectionSpecs");
        AbstractC2855l.g(proxySelector, "proxySelector");
        this.f26059d = dns;
        this.f26060e = socketFactory;
        this.f26061f = sSLSocketFactory;
        this.f26062g = hostnameVerifier;
        this.f26063h = c2439g;
        this.f26064i = proxyAuthenticator;
        this.f26065j = proxy;
        this.f26066k = proxySelector;
        this.f26056a = new u.a().o(sSLSocketFactory != null ? "https" : "http").e(uriHost).k(i10).a();
        this.f26057b = f9.c.R(protocols);
        this.f26058c = f9.c.R(connectionSpecs);
    }

    public final C2439g a() {
        return this.f26063h;
    }

    public final List b() {
        return this.f26058c;
    }

    public final q c() {
        return this.f26059d;
    }

    public final boolean d(C2433a that) {
        AbstractC2855l.g(that, "that");
        return AbstractC2855l.b(this.f26059d, that.f26059d) && AbstractC2855l.b(this.f26064i, that.f26064i) && AbstractC2855l.b(this.f26057b, that.f26057b) && AbstractC2855l.b(this.f26058c, that.f26058c) && AbstractC2855l.b(this.f26066k, that.f26066k) && AbstractC2855l.b(this.f26065j, that.f26065j) && AbstractC2855l.b(this.f26061f, that.f26061f) && AbstractC2855l.b(this.f26062g, that.f26062g) && AbstractC2855l.b(this.f26063h, that.f26063h) && this.f26056a.l() == that.f26056a.l();
    }

    public final HostnameVerifier e() {
        return this.f26062g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2433a)) {
            return false;
        }
        C2433a c2433a = (C2433a) obj;
        return AbstractC2855l.b(this.f26056a, c2433a.f26056a) && d(c2433a);
    }

    public final List f() {
        return this.f26057b;
    }

    public final Proxy g() {
        return this.f26065j;
    }

    public final InterfaceC2434b h() {
        return this.f26064i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f26056a.hashCode()) * 31) + this.f26059d.hashCode()) * 31) + this.f26064i.hashCode()) * 31) + this.f26057b.hashCode()) * 31) + this.f26058c.hashCode()) * 31) + this.f26066k.hashCode()) * 31) + Objects.hashCode(this.f26065j)) * 31) + Objects.hashCode(this.f26061f)) * 31) + Objects.hashCode(this.f26062g)) * 31) + Objects.hashCode(this.f26063h);
    }

    public final ProxySelector i() {
        return this.f26066k;
    }

    public final SocketFactory j() {
        return this.f26060e;
    }

    public final SSLSocketFactory k() {
        return this.f26061f;
    }

    public final u l() {
        return this.f26056a;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f26056a.h());
        sb2.append(':');
        sb2.append(this.f26056a.l());
        sb2.append(", ");
        if (this.f26065j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f26065j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f26066k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
