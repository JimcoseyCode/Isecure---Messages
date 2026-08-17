package y9;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f34158a = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f34159b = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f34160c = StandardCharsets.UTF_16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f34161d = StandardCharsets.UTF_16BE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f34162e = StandardCharsets.UTF_16LE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f34163f = StandardCharsets.UTF_8;

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
