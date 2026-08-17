package Z;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: Z.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C1584x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f13515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f13516c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13517a = new HashMap();

    /* JADX INFO: renamed from: Z.x$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a {
        a() {
        }

        static a c(AbstractC1582v abstractC1582v, int i10) {
            return new C1570i(abstractC1582v, i10);
        }

        abstract int a();

        abstract AbstractC1582v b();
    }

    static {
        HashMap map = new HashMap();
        f13515b = map;
        map.put(AbstractC1582v.f13486d, Range.create(2160, 4319));
        map.put(AbstractC1582v.f13485c, Range.create(1080, 1439));
        map.put(AbstractC1582v.f13484b, Range.create(720, 1079));
        map.put(AbstractC1582v.f13483a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f13516c = map2;
        map2.put(0, H.a.f3553a);
        map2.put(1, H.a.f3555c);
    }

    C1584x(List list, Map map) {
        for (AbstractC1582v abstractC1582v : f13515b.keySet()) {
            this.f13517a.put(a.c(abstractC1582v, -1), new ArrayList());
            Iterator it = f13516c.keySet().iterator();
            while (it.hasNext()) {
                this.f13517a.put(a.c(abstractC1582v, ((Integer) it.next()).intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        h(map);
    }

    public static /* synthetic */ int a(int i10, Size size, Size size2) {
        return Math.abs(O.d.c(size) - i10) - Math.abs(O.d.c(size2) - i10);
    }

    private void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            List listF = f((AbstractC1582v) entry.getKey(), -1);
            Objects.requireNonNull(listF);
            listF.add((Size) entry.getValue());
        }
    }

    private void c(List list) {
        Integer numD;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            AbstractC1582v abstractC1582vE = e(size);
            if (abstractC1582vE != null && (numD = d(size)) != null) {
                List listF = f(abstractC1582vE, numD.intValue());
                Objects.requireNonNull(listF);
                listF.add(size);
            }
        }
    }

    private static Integer d(Size size) {
        for (Map.Entry entry : f13516c.entrySet()) {
            if (H.a.b(size, (Rational) entry.getValue(), O.d.f8167b)) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }

    private static AbstractC1582v e(Size size) {
        for (Map.Entry entry : f13515b.entrySet()) {
            if (((Range) entry.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                return (AbstractC1582v) entry.getKey();
            }
        }
        return null;
    }

    private List f(AbstractC1582v abstractC1582v, int i10) {
        return (List) this.f13517a.get(a.c(abstractC1582v, i10));
    }

    private void h(Map map) {
        for (Map.Entry entry : this.f13517a.entrySet()) {
            Size size = (Size) map.get(((a) entry.getKey()).b());
            if (size != null) {
                final int iC = O.d.c(size);
                Collections.sort((List) entry.getValue(), new Comparator() { // from class: Z.w
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C1584x.a(iC, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }

    List g(AbstractC1582v abstractC1582v, int i10) {
        List listF = f(abstractC1582v, i10);
        return listF != null ? new ArrayList(listF) : new ArrayList(0);
    }
}
