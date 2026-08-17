package g9;

import e9.B;
import e9.C2433a;
import e9.C2440h;
import e9.D;
import e9.F;
import e9.InterfaceC2434b;
import e9.o;
import e9.q;
import e9.u;
import j7.AbstractC2800q;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC2434b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f28248d;

    public b(q defaultDns) {
        AbstractC2855l.g(defaultDns, "defaultDns");
        this.f28248d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.f28247a[type.ordinal()] == 1) {
            return (InetAddress) AbstractC2800q.e0(qVar.a(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        AbstractC2855l.f(address, "(address() as InetSocketAddress).address");
        return address;
    }

    @Override // e9.InterfaceC2434b
    public B a(F f10, D response) {
        Proxy proxy;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C2433a c2433aA;
        AbstractC2855l.g(response, "response");
        List<C2440h> listB = response.B();
        B bD0 = response.D0();
        u uVarP = bD0.p();
        boolean z10 = response.I() == 407;
        if (f10 == null || (proxy = f10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C2440h c2440h : listB) {
            if (P8.q.x("Basic", c2440h.c(), true)) {
                if (f10 == null || (c2433aA = f10.a()) == null || (qVarC = c2433aA.c()) == null) {
                    qVarC = this.f28248d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    AbstractC2855l.f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, uVarP, qVarC), inetSocketAddress.getPort(), uVarP.p(), c2440h.b(), c2440h.c(), uVarP.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarP.h();
                    AbstractC2855l.f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxy, uVarP, qVarC), uVarP.l(), uVarP.p(), c2440h.b(), c2440h.c(), uVarP.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    AbstractC2855l.f(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    AbstractC2855l.f(password, "auth.password");
                    return bD0.m().e(str, o.a(userName, new String(password), c2440h.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ b(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f26308a : qVar);
    }
}
