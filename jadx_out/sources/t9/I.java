package t9;

import P8.C1385d;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I {
    public static final byte[] a(String str) {
        AbstractC2855l.g(str, "<this>");
        byte[] bytes = str.getBytes(C1385d.f8858b);
        AbstractC2855l.f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        AbstractC2855l.g(bArr, "<this>");
        return new String(bArr, C1385d.f8858b);
    }
}
