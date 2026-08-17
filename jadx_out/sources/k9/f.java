package k9;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f29340a = new f();

    private f() {
    }

    public static final boolean b(String method) {
        AbstractC2855l.g(method, "method");
        return (AbstractC2855l.b(method, "GET") || AbstractC2855l.b(method, "HEAD")) ? false : true;
    }

    public static final boolean e(String method) {
        AbstractC2855l.g(method, "method");
        return AbstractC2855l.b(method, "POST") || AbstractC2855l.b(method, "PUT") || AbstractC2855l.b(method, "PATCH") || AbstractC2855l.b(method, "PROPPATCH") || AbstractC2855l.b(method, "REPORT");
    }

    public final boolean a(String method) {
        AbstractC2855l.g(method, "method");
        return AbstractC2855l.b(method, "POST") || AbstractC2855l.b(method, "PATCH") || AbstractC2855l.b(method, "PUT") || AbstractC2855l.b(method, "DELETE") || AbstractC2855l.b(method, "MOVE");
    }

    public final boolean c(String method) {
        AbstractC2855l.g(method, "method");
        return !AbstractC2855l.b(method, "PROPFIND");
    }

    public final boolean d(String method) {
        AbstractC2855l.g(method, "method");
        return AbstractC2855l.b(method, "PROPFIND");
    }
}
