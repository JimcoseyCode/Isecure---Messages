package j7;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V extends U {
    public static Set e() {
        return C2782F.f28897g;
    }

    public static LinkedHashSet f(Object... elements) {
        AbstractC2855l.g(elements, "elements");
        return (LinkedHashSet) AbstractC2798o.o0(elements, new LinkedHashSet(M.e(elements.length)));
    }

    public static final Set g(Set set) {
        AbstractC2855l.g(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : U.d(set.iterator().next()) : e();
    }

    public static Set h(Object... elements) {
        AbstractC2855l.g(elements, "elements");
        return AbstractC2798o.I0(elements);
    }
}
