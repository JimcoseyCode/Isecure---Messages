package Q2;

import j7.AbstractC2793j;
import j7.J;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9090a = new f();

    private f() {
    }

    public static final byte[] a(String value) {
        AbstractC2855l.g(value, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            AbstractC2855l.f(charsetForName, "forName(...)");
            byte[] bytes = value.getBytes(charsetForName);
            AbstractC2855l.f(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static final boolean b(byte[] byteArray, byte[] pattern, int i10) {
        AbstractC2855l.g(byteArray, "byteArray");
        AbstractC2855l.g(pattern, "pattern");
        if (pattern.length + i10 > byteArray.length) {
            return false;
        }
        Iterable iterableH = AbstractC2793j.H(pattern);
        if ((iterableH instanceof Collection) && ((Collection) iterableH).isEmpty()) {
            return true;
        }
        Iterator it = iterableH.iterator();
        while (it.hasNext()) {
            int iNextInt = ((J) it).nextInt();
            if (byteArray[i10 + iNextInt] != pattern[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(byte[] byteArray, byte[] pattern) {
        AbstractC2855l.g(byteArray, "byteArray");
        AbstractC2855l.g(pattern, "pattern");
        return b(byteArray, pattern, 0);
    }
}
