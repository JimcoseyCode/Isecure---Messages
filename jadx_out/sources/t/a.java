package T;

import F.D1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static C3563H a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        C3563H c3563h = (C3563H) list.get(0);
        Integer numValueOf = Integer.valueOf(c3563h.b());
        Integer numValueOf2 = Integer.valueOf(c3563h.a());
        for (int i10 = 1; i10 < list.size(); i10++) {
            C3563H c3563h2 = (C3563H) list.get(i10);
            numValueOf = c(numValueOf, Integer.valueOf(c3563h2.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(c3563h2.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new C3563H(numValueOf.intValue(), numValueOf2.intValue());
    }

    private static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    public static C3563H d(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((D1) it.next()).l());
        }
        return a(arrayList);
    }
}
