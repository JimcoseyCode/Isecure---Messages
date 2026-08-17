package k9;

import e9.B;
import e9.u;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f29353a = new i();

    private i() {
    }

    private final boolean b(B b10, Proxy.Type type) {
        return !b10.k() && type == Proxy.Type.HTTP;
    }

    public final String a(B request, Proxy.Type proxyType) {
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.l());
        sb.append(' ');
        i iVar = f29353a;
        if (iVar.b(request, proxyType)) {
            sb.append(request.p());
        } else {
            sb.append(iVar.c(request.p()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(u url) {
        AbstractC2855l.g(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
