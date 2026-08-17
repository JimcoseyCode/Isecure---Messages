package e9;

import com.facebook.react.views.image.ReactImageView;
import e9.t;
import j7.AbstractC2800q;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2436d f26011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B f26012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f26013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f26014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f26015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s f26016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t f26017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E f26018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final D f26019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final D f26020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final D f26021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f26022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f26023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j9.c f26024t;

    public D(B request, A protocol, String message, int i10, s sVar, t headers, E e10, D d10, D d11, D d12, long j10, long j11, j9.c cVar) {
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(protocol, "protocol");
        AbstractC2855l.g(message, "message");
        AbstractC2855l.g(headers, "headers");
        this.f26012h = request;
        this.f26013i = protocol;
        this.f26014j = message;
        this.f26015k = i10;
        this.f26016l = sVar;
        this.f26017m = headers;
        this.f26018n = e10;
        this.f26019o = d10;
        this.f26020p = d11;
        this.f26021q = d12;
        this.f26022r = j10;
        this.f26023s = j11;
        this.f26024t = cVar;
    }

    public static /* synthetic */ String d0(D d10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d10.X(str, str2);
    }

    public final D A() {
        return this.f26020p;
    }

    public final long A0() {
        return this.f26023s;
    }

    public final List B() {
        String str;
        t tVar = this.f26017m;
        int i10 = this.f26015k;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return AbstractC2800q.j();
            }
            str = "Proxy-Authenticate";
        }
        return k9.e.a(tVar, str);
    }

    public final B D0() {
        return this.f26012h;
    }

    public final int I() {
        return this.f26015k;
    }

    public final j9.c J() {
        return this.f26024t;
    }

    public final long J0() {
        return this.f26022r;
    }

    public final s M() {
        return this.f26016l;
    }

    public final String W(String str) {
        return d0(this, str, null, 2, null);
    }

    public final String X(String name, String str) {
        AbstractC2855l.g(name, "name");
        String strO = this.f26017m.o(name);
        return strO != null ? strO : str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E e10 = this.f26018n;
        if (e10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        e10.close();
    }

    public final E d() {
        return this.f26018n;
    }

    public final int e() {
        return this.f26015k;
    }

    public final t g0() {
        return this.f26017m;
    }

    public final boolean i0() {
        int i10 = this.f26015k;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final t k() {
        return this.f26017m;
    }

    public final boolean k0() {
        int i10 = this.f26015k;
        return 200 <= i10 && 299 >= i10;
    }

    public final String l0() {
        return this.f26014j;
    }

    public final B m() {
        return this.f26012h;
    }

    public final E r() {
        return this.f26018n;
    }

    public final C2436d s() {
        C2436d c2436d = this.f26011g;
        if (c2436d != null) {
            return c2436d;
        }
        C2436d c2436dB = C2436d.f26104p.b(this.f26017m);
        this.f26011g = c2436dB;
        return c2436dB;
    }

    public final D t0() {
        return this.f26019o;
    }

    public String toString() {
        return "Response{protocol=" + this.f26013i + ", code=" + this.f26015k + ", message=" + this.f26014j + ", url=" + this.f26012h.p() + '}';
    }

    public final a u0() {
        return new a(this);
    }

    public final D w0() {
        return this.f26021q;
    }

    public final A y0() {
        return this.f26013i;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B f26025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private A f26026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f26028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f26029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f26030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E f26031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private D f26032h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private D f26033i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private D f26034j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f26035k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f26036l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private j9.c f26037m;

        public a() {
            this.f26027c = -1;
            this.f26030f = new t.a();
        }

        private final void e(D d10) {
            if (d10 != null) {
                if (!(d10.r() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null");
                }
            }
        }

        private final void f(String str, D d10) {
            if (d10 != null) {
                if (!(d10.r() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(d10.t0() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(d10.A() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (d10.w0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            this.f26030f.a(name, value);
            return this;
        }

        public a b(E e10) {
            this.f26031g = e10;
            return this;
        }

        public D c() {
            int i10 = this.f26027c;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.f26027c).toString());
            }
            B b10 = this.f26025a;
            if (b10 == null) {
                throw new IllegalStateException("request == null");
            }
            A a10 = this.f26026b;
            if (a10 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f26028d;
            if (str != null) {
                return new D(b10, a10, str, i10, this.f26029e, this.f26030f.e(), this.f26031g, this.f26032h, this.f26033i, this.f26034j, this.f26035k, this.f26036l, this.f26037m);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(D d10) {
            f("cacheResponse", d10);
            this.f26033i = d10;
            return this;
        }

        public a g(int i10) {
            this.f26027c = i10;
            return this;
        }

        public final int h() {
            return this.f26027c;
        }

        public a i(s sVar) {
            this.f26029e = sVar;
            return this;
        }

        public a j(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            this.f26030f.i(name, value);
            return this;
        }

        public a k(t headers) {
            AbstractC2855l.g(headers, "headers");
            this.f26030f = headers.r();
            return this;
        }

        public final void l(j9.c deferredTrailers) {
            AbstractC2855l.g(deferredTrailers, "deferredTrailers");
            this.f26037m = deferredTrailers;
        }

        public a m(String message) {
            AbstractC2855l.g(message, "message");
            this.f26028d = message;
            return this;
        }

        public a n(D d10) {
            f("networkResponse", d10);
            this.f26032h = d10;
            return this;
        }

        public a o(D d10) {
            e(d10);
            this.f26034j = d10;
            return this;
        }

        public a p(A protocol) {
            AbstractC2855l.g(protocol, "protocol");
            this.f26026b = protocol;
            return this;
        }

        public a q(long j10) {
            this.f26036l = j10;
            return this;
        }

        public a r(B request) {
            AbstractC2855l.g(request, "request");
            this.f26025a = request;
            return this;
        }

        public a s(long j10) {
            this.f26035k = j10;
            return this;
        }

        public a(D response) {
            AbstractC2855l.g(response, "response");
            this.f26027c = -1;
            this.f26025a = response.D0();
            this.f26026b = response.y0();
            this.f26027c = response.I();
            this.f26028d = response.l0();
            this.f26029e = response.M();
            this.f26030f = response.g0().r();
            this.f26031g = response.r();
            this.f26032h = response.t0();
            this.f26033i = response.A();
            this.f26034j = response.w0();
            this.f26035k = response.J0();
            this.f26036l = response.A0();
            this.f26037m = response.J();
        }
    }
}
