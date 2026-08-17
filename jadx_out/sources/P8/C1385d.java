package P8;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: P8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1385d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1385d f8857a = new C1385d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f8858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f8859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f8860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f8861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f8862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f8863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f8864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f8865i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC2855l.f(charsetForName, "forName(...)");
        f8858b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        AbstractC2855l.f(charsetForName2, "forName(...)");
        f8859c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        AbstractC2855l.f(charsetForName3, "forName(...)");
        f8860d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        AbstractC2855l.f(charsetForName4, "forName(...)");
        f8861e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        AbstractC2855l.f(charsetForName5, "forName(...)");
        f8862f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        AbstractC2855l.f(charsetForName6, "forName(...)");
        f8863g = charsetForName6;
    }

    private C1385d() {
    }

    public final Charset a() {
        Charset charset = f8865i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        AbstractC2855l.f(charsetForName, "forName(...)");
        f8865i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f8864h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        AbstractC2855l.f(charsetForName, "forName(...)");
        f8864h = charsetForName;
        return charsetForName;
    }
}
