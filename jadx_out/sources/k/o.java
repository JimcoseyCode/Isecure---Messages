package K;

import F.D1;
import F.E0;
import F.L;
import H.a;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f7009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rational f7012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f7013e;

    public o(L l10, Size size) {
        this.f7009a = l10;
        this.f7010b = l10.a();
        this.f7011c = l10.k();
        Rational rationalH = size != null ? h(size) : i(l10);
        this.f7012d = rationalH;
        this.f7013e = new p(l10, rationalH);
    }

    private static LinkedHashMap a(List list, S.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    private static LinkedHashMap b(Map map, S.a aVar, Rational rational) {
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        Rational rationalN = n(aVar.b(), z10);
        if (aVar.a() == 0) {
            Rational rationalN2 = n(aVar.b(), z10);
            for (Rational rational2 : new ArrayList(map.keySet())) {
                if (!rational2.equals(rationalN2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a.C0048a(rationalN, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, (List) map.get(rational3));
        }
        return linkedHashMap;
    }

    private List c(List list, S.c cVar, int i10) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f7009a.o(i10));
        Collections.sort(arrayList, new H.e(true));
        return arrayList;
    }

    private static void d(LinkedHashMap linkedHashMap, Size size) {
        int iC = O.d.c(size);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = (List) linkedHashMap.get((Rational) it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (O.d.c(size2) <= iC) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static List e(List list, S.b bVar, int i10, int i11, int i12) {
        if (bVar == null) {
            return list;
        }
        List listA = bVar.a(new ArrayList(list), H.c.a(H.c.b(i10), i11, i12 == 1));
        if (list.containsAll(listA)) {
            return listA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(LinkedHashMap linkedHashMap, S.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g((List) linkedHashMap.get((Rational) it.next()), dVar);
        }
    }

    private static void g(List list, S.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int iB = dVar.b();
        if (dVar.equals(S.d.f10241c)) {
            return;
        }
        Size sizeA = dVar.a();
        if (iB == 0) {
            s(list, sizeA);
            return;
        }
        if (iB == 1) {
            q(list, sizeA, true);
            return;
        }
        if (iB == 2) {
            q(list, sizeA, false);
        } else if (iB == 3) {
            r(list, sizeA, true);
        } else {
            if (iB != 4) {
                return;
            }
            r(list, sizeA, false);
        }
    }

    private Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(L l10) {
        List listX = l10.x(256);
        if (listX.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listX, new H.e());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private List j(List list, int i10) {
        List listL = l(list, i10);
        if (listL == null) {
            listL = this.f7009a.x(i10);
        }
        ArrayList arrayList = new ArrayList(listL);
        Collections.sort(arrayList, new H.e(true));
        if (arrayList.isEmpty()) {
            AbstractC3583h0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    static List k(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(H.a.f3553a);
        arrayList.add(H.a.f3555c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (H.a.a(size, (Rational) it2.next())) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List l(List list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    static Rational n(int i10, boolean z10) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return z10 ? H.a.f3553a : H.a.f3554b;
        }
        if (i10 == 1) {
            return z10 ? H.a.f3555c : H.a.f3556d;
        }
        AbstractC3583h0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        return null;
    }

    static Map o(List list) {
        HashMap map = new HashMap();
        Iterator it = k(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (H.a.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List p(S.c cVar, List list, Size size, int i10, Rational rational, int i11, int i12) {
        LinkedHashMap linkedHashMapA = a(list, cVar.b(), rational);
        if (size != null) {
            d(linkedHashMapA, size);
        }
        f(linkedHashMapA, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : (List) it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i10, i11, i12);
    }

    static void q(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void r(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = (Size) list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void s(List list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    public List m(D1 d12) {
        E0 e02 = (E0) d12;
        List listP = e02.p(null);
        if (listP != null) {
            return listP;
        }
        S.c cVarV = e02.V(null);
        List listJ = j(e02.m(null), d12.r());
        if (cVarV == null) {
            return this.f7013e.f(listJ, d12);
        }
        Size sizeI = ((E0) d12).i(null);
        int iC0 = e02.c0(0);
        if (!d12.Z(false)) {
            listJ = c(listJ, cVarV, d12.r());
        }
        List list = listJ;
        AbstractC3583h0.a("SupportedOutputSizesCollector", "useCaseConfig = " + d12 + ", candidateSizes = " + list);
        return p(e02.n(), list, sizeI, iC0, this.f7012d, this.f7010b, this.f7011c);
    }
}
