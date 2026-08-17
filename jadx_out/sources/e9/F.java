package e9;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2433a f26045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f26046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f26047c;

    public F(C2433a address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC2855l.g(address, "address");
        AbstractC2855l.g(proxy, "proxy");
        AbstractC2855l.g(socketAddress, "socketAddress");
        this.f26045a = address;
        this.f26046b = proxy;
        this.f26047c = socketAddress;
    }

    public final C2433a a() {
        return this.f26045a;
    }

    public final Proxy b() {
        return this.f26046b;
    }

    public final boolean c() {
        return this.f26045a.k() != null && this.f26046b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f26047c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return AbstractC2855l.b(f10.f26045a, this.f26045a) && AbstractC2855l.b(f10.f26046b, this.f26046b) && AbstractC2855l.b(f10.f26047c, this.f26047c);
    }

    public int hashCode() {
        return ((((527 + this.f26045a.hashCode()) * 31) + this.f26046b.hashCode()) * 31) + this.f26047c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f26047c + '}';
    }
}
