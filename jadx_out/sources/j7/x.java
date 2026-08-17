package j7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends AbstractC2805w {
    public static boolean A(Collection collection, Iterable elements) {
        AbstractC2855l.g(collection, "<this>");
        AbstractC2855l.g(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean B(Collection collection, Object[] elements) {
        AbstractC2855l.g(collection, "<this>");
        AbstractC2855l.g(elements, "elements");
        return collection.addAll(AbstractC2796m.e(elements));
    }

    public static final Collection C(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : AbstractC2778B.P0(iterable);
    }

    private static final boolean D(Iterable iterable, Function1 function1, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final boolean E(List list, Function1 function1, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            AbstractC2855l.e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return D(kotlin.jvm.internal.I.b(list), function1, z10);
        }
        int iL = AbstractC2801s.l(list);
        if (iL >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) function1.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iL) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iL2 = AbstractC2801s.l(list);
        if (i10 > iL2) {
            return true;
        }
        while (true) {
            list.remove(iL2);
            if (iL2 == i10) {
                return true;
            }
            iL2--;
        }
    }

    public static boolean F(Iterable iterable, Function1 predicate) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return D(iterable, predicate, true);
    }

    public static boolean G(List list, Function1 predicate) {
        AbstractC2855l.g(list, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return E(list, predicate, true);
    }

    public static Object H(List list) {
        AbstractC2855l.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC2801s.l(list));
    }

    public static boolean I(Iterable iterable, Function1 predicate) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return D(iterable, predicate, false);
    }

    public static final boolean J(Collection collection, Iterable elements) {
        AbstractC2855l.g(collection, "<this>");
        AbstractC2855l.g(elements, "elements");
        return collection.retainAll(C(elements));
    }

    public static boolean z(Collection collection, O8.i elements) {
        AbstractC2855l.g(collection, "<this>");
        AbstractC2855l.g(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
