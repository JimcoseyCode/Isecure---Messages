package j7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import l7.AbstractC2884a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2801s extends r {
    public static final Collection g(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return new C2791h(objArr, false);
    }

    public static final int h(List list, Comparable comparable, int i10, int i11) {
        AbstractC2855l.g(list, "<this>");
        r(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iA = AbstractC2884a.a((Comparable) list.get(i13), comparable);
            if (iA < 0) {
                i10 = i13 + 1;
            } else {
                if (iA <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int i(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return h(list, comparable, i10, i11);
    }

    public static List j() {
        return C2780D.f28895g;
    }

    public static B7.c k(Collection collection) {
        AbstractC2855l.g(collection, "<this>");
        return new B7.c(0, collection.size() - 1);
    }

    public static int l(List list) {
        AbstractC2855l.g(list, "<this>");
        return list.size() - 1;
    }

    public static List m(Object... elements) {
        AbstractC2855l.g(elements, "elements");
        return elements.length > 0 ? AbstractC2796m.e(elements) : j();
    }

    public static List n(Object obj) {
        return obj != null ? r.e(obj) : j();
    }

    public static List o(Object... elements) {
        AbstractC2855l.g(elements, "elements");
        return AbstractC2798o.D(elements);
    }

    public static List p(Object... elements) {
        AbstractC2855l.g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C2791h(elements, true));
    }

    public static final List q(List list) {
        AbstractC2855l.g(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : r.e(list.get(0)) : j();
    }

    private static final void r(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
