package k8;

import P8.q;
import i7.C2750m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29214a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f29328g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f29330i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f29329h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29214a = iArr;
        }
    }

    public static final Object a(c cVar, Map values) {
        Object next;
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            c cVar2 = (c) entry.getKey();
            if (AbstractC2855l.b(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c packageName) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(packageName, "packageName");
        return AbstractC2855l.b(f(cVar), packageName);
    }

    private static final boolean c(String str, String str2) {
        return q.K(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(c cVar, c packageName) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(packageName, "packageName");
        if (AbstractC2855l.b(cVar, packageName) || packageName.d()) {
            return true;
        }
        String strB = cVar.b();
        AbstractC2855l.f(strB, "asString(...)");
        String strB2 = packageName.b();
        AbstractC2855l.f(strB2, "asString(...)");
        return c(strB, strB2);
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.f29328g;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f29214a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                kVar = k.f29329h;
            } else {
                if (i11 != 3) {
                    throw new C2750m();
                }
                if (cCharAt == '.') {
                    kVar = k.f29330i;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return kVar != k.f29330i;
    }

    public static final c f(c cVar) {
        AbstractC2855l.g(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c prefix) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(prefix, "prefix");
        if (!d(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (AbstractC2855l.b(cVar, prefix)) {
            c ROOT = c.f29204c;
            AbstractC2855l.f(ROOT, "ROOT");
            return ROOT;
        }
        String strB = cVar.b();
        AbstractC2855l.f(strB, "asString(...)");
        String strSubstring = strB.substring(prefix.b().length() + 1);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return new c(strSubstring);
    }
}
