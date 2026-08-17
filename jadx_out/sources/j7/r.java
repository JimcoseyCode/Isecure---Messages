package j7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k7.C2834b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static List a(List builder) {
        AbstractC2855l.g(builder, "builder");
        return ((C2834b) builder).A();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        AbstractC2855l.g(objArr, "<this>");
        if (z10 && AbstractC2855l.b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new C2834b(0, 1, null);
    }

    public static List d(int i10) {
        return new C2834b(i10);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC2855l.f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] f(int i10, Object[] array) {
        AbstractC2855l.g(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
