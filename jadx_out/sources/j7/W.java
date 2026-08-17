package j7;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class W extends V {
    public static Set i(Set set, Iterable elements) {
        AbstractC2855l.g(set, "<this>");
        AbstractC2855l.g(elements, "elements");
        Collection<?> collectionC = x.C(elements);
        if (collectionC.isEmpty()) {
            return AbstractC2778B.T0(set);
        }
        if (!(collectionC instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionC);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionC).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set j(Set set, Object obj) {
        AbstractC2855l.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(M.e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC2855l.b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set k(Set set, Iterable elements) {
        int size;
        AbstractC2855l.g(set, "<this>");
        AbstractC2855l.g(elements, "elements");
        Integer numV = AbstractC2802t.v(elements);
        if (numV != null) {
            size = set.size() + numV.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(M.e(size));
        linkedHashSet.addAll(set);
        x.A(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set l(Set set, Object obj) {
        AbstractC2855l.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(M.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
