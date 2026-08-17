package e9;

import e9.t;
import e9.u;
import j7.AbstractC2800q;
import j7.K;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2436d f25992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f25993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f25995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C f25996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f25997f;

    public B(u url, String method, t headers, C c10, Map tags) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(tags, "tags");
        this.f25993b = url;
        this.f25994c = method;
        this.f25995d = headers;
        this.f25996e = c10;
        this.f25997f = tags;
    }

    public final C a() {
        return this.f25996e;
    }

    public final t b() {
        return this.f25995d;
    }

    public final String c() {
        return this.f25994c;
    }

    public final u d() {
        return this.f25993b;
    }

    public final C e() {
        return this.f25996e;
    }

    public final C2436d f() {
        C2436d c2436d = this.f25992a;
        if (c2436d != null) {
            return c2436d;
        }
        C2436d c2436dB = C2436d.f26104p.b(this.f25995d);
        this.f25992a = c2436dB;
        return c2436dB;
    }

    public final Map g() {
        return this.f25997f;
    }

    public final String h(String name) {
        AbstractC2855l.g(name, "name");
        return this.f25995d.o(name);
    }

    public final t i() {
        return this.f25995d;
    }

    public final List j(String name) {
        AbstractC2855l.g(name, "name");
        return this.f25995d.t(name);
    }

    public final boolean k() {
        return this.f25993b.i();
    }

    public final String l() {
        return this.f25994c;
    }

    public final a m() {
        return new a(this);
    }

    public final Object n() {
        return o(Object.class);
    }

    public final Object o(Class type) {
        AbstractC2855l.g(type, "type");
        return type.cast(this.f25997f.get(type));
    }

    public final u p() {
        return this.f25993b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f25994c);
        sb.append(", url=");
        sb.append(this.f25993b);
        if (this.f25995d.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f25995d) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2800q.t();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        if (!this.f25997f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f25997f);
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f25998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f26000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C f26001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f26002e;

        public a() {
            this.f26002e = new LinkedHashMap();
            this.f25999b = "GET";
            this.f26000c = new t.a();
        }

        public a a(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            this.f26000c.a(name, value);
            return this;
        }

        public B b() {
            u uVar = this.f25998a;
            if (uVar != null) {
                return new B(uVar, this.f25999b, this.f26000c.e(), this.f26001d, f9.c.S(this.f26002e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(C2436d cacheControl) {
            AbstractC2855l.g(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? i("Cache-Control") : e("Cache-Control", string);
        }

        public a d() {
            return g("GET", null);
        }

        public a e(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            this.f26000c.i(name, value);
            return this;
        }

        public a f(t headers) {
            AbstractC2855l.g(headers, "headers");
            this.f26000c = headers.r();
            return this;
        }

        public a g(String method, C c10) {
            AbstractC2855l.g(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (c10 == null) {
                if (k9.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!k9.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f25999b = method;
            this.f26001d = c10;
            return this;
        }

        public a h(C body) {
            AbstractC2855l.g(body, "body");
            return g("POST", body);
        }

        public a i(String name) {
            AbstractC2855l.g(name, "name");
            this.f26000c.h(name);
            return this;
        }

        public a j(Class type, Object obj) {
            AbstractC2855l.g(type, "type");
            if (obj == null) {
                this.f26002e.remove(type);
                return this;
            }
            if (this.f26002e.isEmpty()) {
                this.f26002e = new LinkedHashMap();
            }
            Map map = this.f26002e;
            Object objCast = type.cast(obj);
            AbstractC2855l.d(objCast);
            map.put(type, objCast);
            return this;
        }

        public a k(Object obj) {
            return j(Object.class, obj);
        }

        public a l(u url) {
            AbstractC2855l.g(url, "url");
            this.f25998a = url;
            return this;
        }

        public a m(String url) {
            AbstractC2855l.g(url, "url");
            if (P8.q.I(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                AbstractC2855l.f(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (P8.q.I(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                AbstractC2855l.f(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return l(u.f26324l.d(url));
        }

        public a n(URL url) {
            AbstractC2855l.g(url, "url");
            u.b bVar = u.f26324l;
            String string = url.toString();
            AbstractC2855l.f(string, "url.toString()");
            return l(bVar.d(string));
        }

        public a(B request) {
            Map mapW;
            AbstractC2855l.g(request, "request");
            this.f26002e = new LinkedHashMap();
            this.f25998a = request.p();
            this.f25999b = request.l();
            this.f26001d = request.e();
            if (request.g().isEmpty()) {
                mapW = new LinkedHashMap();
            } else {
                mapW = K.w(request.g());
            }
            this.f26002e = mapW;
            this.f26000c = request.i().r();
        }
    }
}
