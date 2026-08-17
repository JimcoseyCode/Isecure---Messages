package e9;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f26300a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        AbstractC2855l.g(username, "username");
        AbstractC2855l.g(password, "password");
        AbstractC2855l.g(charset, "charset");
        return "Basic " + t9.k.f32603j.f(username + ':' + password, charset).j();
    }
}
