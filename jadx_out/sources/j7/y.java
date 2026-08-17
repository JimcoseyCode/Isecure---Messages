package j7;

import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends x {
    public static List N(List list) {
        AbstractC2855l.g(list, "<this>");
        return new S(list);
    }

    public static List O(List list) {
        AbstractC2855l.g(list, "<this>");
        return new Q(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(List list, int i10) {
        if (i10 >= 0 && i10 <= AbstractC2801s.l(list)) {
            return AbstractC2801s.l(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new B7.c(0, AbstractC2801s.l(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(List list, int i10) {
        return AbstractC2801s.l(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new B7.c(0, list.size()) + "].");
    }
}
