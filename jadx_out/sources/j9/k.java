package j9;

import e9.C2433a;
import e9.F;
import e9.InterfaceC2437e;
import e9.r;
import e9.u;
import j7.AbstractC2800q;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.n;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f29049i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f29050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f29052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f29053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2433a f29054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f29055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2437e f29056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r f29057h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final String a(InetSocketAddress socketHost) {
            AbstractC2855l.g(socketHost, "$this$socketHost");
            InetAddress address = socketHost.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                AbstractC2855l.f(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = socketHost.getHostName();
            AbstractC2855l.f(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f29059b;

        public b(List routes) {
            AbstractC2855l.g(routes, "routes");
            this.f29059b = routes;
        }

        public final List a() {
            return this.f29059b;
        }

        public final boolean b() {
            return this.f29058a < this.f29059b.size();
        }

        public final F c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f29059b;
            int i10 = this.f29058a;
            this.f29058a = i10 + 1;
            return (F) list.get(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends n implements InterfaceC3487a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Proxy f29061i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ u f29062j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Proxy proxy, u uVar) {
            super(0);
            this.f29061i = proxy;
            this.f29062j = uVar;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Proxy proxy = this.f29061i;
            if (proxy != null) {
                return AbstractC2800q.e(proxy);
            }
            URI uriQ = this.f29062j.q();
            if (uriQ.getHost() == null) {
                return f9.c.t(Proxy.NO_PROXY);
            }
            List<Proxy> listSelect = k.this.f29054e.i().select(uriQ);
            return (listSelect == null || listSelect.isEmpty()) ? f9.c.t(Proxy.NO_PROXY) : f9.c.R(listSelect);
        }
    }

    public k(C2433a address, i routeDatabase, InterfaceC2437e call, r eventListener) {
        AbstractC2855l.g(address, "address");
        AbstractC2855l.g(routeDatabase, "routeDatabase");
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(eventListener, "eventListener");
        this.f29054e = address;
        this.f29055f = routeDatabase;
        this.f29056g = call;
        this.f29057h = eventListener;
        this.f29050a = AbstractC2800q.j();
        this.f29052c = AbstractC2800q.j();
        this.f29053d = new ArrayList();
        g(address.l(), address.g());
    }

    private final boolean c() {
        return this.f29051b < this.f29050a.size();
    }

    private final Proxy e() throws SocketException, UnknownHostException {
        if (c()) {
            List list = this.f29050a;
            int i10 = this.f29051b;
            this.f29051b = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f29054e.l().h() + "; exhausted proxy configurations: " + this.f29050a);
    }

    private final void f(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iL;
        ArrayList arrayList = new ArrayList();
        this.f29052c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f29054e.l().h();
            iL = this.f29054e.l().l();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strH = f29049i.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        if (1 > iL || 65535 < iL) {
            throw new SocketException("No route to " + strH + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iL));
            return;
        }
        this.f29057h.n(this.f29056g, strH);
        List listA = this.f29054e.c().a(strH);
        if (listA.isEmpty()) {
            throw new UnknownHostException(this.f29054e.c() + " returned no addresses for " + strH);
        }
        this.f29057h.m(this.f29056g, strH, listA);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iL));
        }
    }

    private final void g(u uVar, Proxy proxy) {
        c cVar = new c(proxy, uVar);
        this.f29057h.p(this.f29056g, uVar);
        List listInvoke = cVar.invoke();
        this.f29050a = listInvoke;
        this.f29051b = 0;
        this.f29057h.o(this.f29056g, uVar, listInvoke);
    }

    public final boolean b() {
        return c() || !this.f29053d.isEmpty();
    }

    public final b d() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            Proxy proxyE = e();
            Iterator it = this.f29052c.iterator();
            while (it.hasNext()) {
                F f10 = new F(this.f29054e, proxyE, (InetSocketAddress) it.next());
                if (this.f29055f.c(f10)) {
                    this.f29053d.add(f10);
                } else {
                    arrayList.add(f10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC2800q.A(arrayList, this.f29053d);
            this.f29053d.clear();
        }
        return new b(arrayList);
    }
}
