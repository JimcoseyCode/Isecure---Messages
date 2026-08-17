package K;

import F.D1;
import F.E0;
import F.L;
import H.a;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rational f7016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7017d;

    p(L l10, Rational rational) {
        this.f7014a = l10.a();
        this.f7015b = l10.k();
        this.f7016c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f7017d = z10;
    }

    private static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : o.k(list)) {
            if (H.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational c(E0 e02, List list) {
        if (e02.M()) {
            return o.n(e02.O(), this.f7017d);
        }
        Size sizeD = d(e02);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    private Size d(E0 e02) {
        return a(e02.A(null), e02.c0(0), this.f7015b, this.f7014a);
    }

    private static boolean e(int i10, int i11, int i12) {
        int iA = H.c.a(H.c.b(i10), i12, 1 == i11);
        return iA == 90 || iA == 270;
    }

    List f(List list, D1 d12) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new H.e(true));
        ArrayList arrayList2 = new ArrayList();
        E0 e02 = (E0) d12;
        Size sizeI = e02.i(null);
        Size size = (Size) arrayList.get(0);
        if (sizeI == null || O.d.c(size) < O.d.c(sizeI)) {
            sizeI = size;
        }
        Size sizeD = d(e02);
        Size size2 = O.d.f8168c;
        int iC = O.d.c(size2);
        if (O.d.c(sizeI) < iC) {
            size2 = O.d.f8166a;
        } else if (sizeD != null && O.d.c(sizeD) < iC) {
            size2 = sizeD;
        }
        for (Size size3 : arrayList) {
            if (O.d.c(size3) <= O.d.c(sizeI) && O.d.c(size3) >= O.d.c(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeI + "\ninitial size list: " + arrayList);
        }
        Rational rationalC = c(e02, arrayList2);
        if (sizeD == null) {
            sizeD = e02.v(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalC == null) {
            arrayList3.addAll(arrayList2);
            if (sizeD != null) {
                o.q(arrayList3, sizeD, true);
                return arrayList3;
            }
        } else {
            Map mapO = o.o(arrayList2);
            if (sizeD != null) {
                Iterator it = mapO.keySet().iterator();
                while (it.hasNext()) {
                    o.q((List) mapO.get((Rational) it.next()), sizeD, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapO.keySet());
            Collections.sort(arrayList4, new a.C0048a(rationalC, this.f7016c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : (List) mapO.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
