package W1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import k2.AbstractC2825c;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11949a = new e();

    private e() {
    }

    public static final String a(d key) {
        AbstractC2855l.g(key, "key");
        try {
            if (!(key instanceof f)) {
                return f11949a.c(key);
            }
            List listD = ((f) key).d();
            AbstractC2855l.f(listD, "getCacheKeys(...)");
            e eVar = f11949a;
            Object obj = listD.get(0);
            AbstractC2855l.f(obj, "get(...)");
            return eVar.c((d) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final List b(d key) {
        AbstractC2855l.g(key, "key");
        try {
            if (!(key instanceof f)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.b() ? key.c() : f11949a.c(key));
                return arrayList;
            }
            List listD = ((f) key).d();
            AbstractC2855l.f(listD, "getCacheKeys(...)");
            ArrayList arrayList2 = new ArrayList(listD.size());
            int size = listD.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = f11949a;
                Object obj = listD.get(i10);
                AbstractC2855l.f(obj, "get(...)");
                arrayList2.add(eVar.c((d) obj));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final String c(d dVar) {
        String strC = dVar.c();
        AbstractC2855l.f(strC, "getUriString(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC2855l.f(charsetForName, "forName(...)");
        byte[] bytes = strC.getBytes(charsetForName);
        AbstractC2855l.f(bytes, "getBytes(...)");
        String strA = AbstractC2825c.a(bytes);
        AbstractC2855l.f(strA, "makeSHA1HashBase64(...)");
        return strA;
    }
}
