package T;

import F.D1;
import F.E0;
import F.L;
import F.M;
import F.R0;
import H.z;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f10324h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f10325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rational f10326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rational f10327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f10328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K.o f10329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L f10330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f10331g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements Comparator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Rational f10332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f10333h;

        a(Rational rational, boolean z10) {
            this.f10332g = rational;
            this.f10333h = z10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fC = c.c(rational, this.f10332g);
            float fC2 = c.c(rational2, this.f10332g);
            return this.f10333h ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }
    }

    c(M m10, Set set) {
        this(z.m(m10.r().i()), m10.r(), set);
    }

    private static boolean A(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!y((Size) it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean B(Rational rational, Size size) {
        if (this.f10326b.equals(rational) || H.a.a(size, rational)) {
            return false;
        }
        return b(this.f10326b.floatValue(), rational.floatValue(), O(size).floatValue());
    }

    private boolean C(Size size, Size size2) {
        return B(O(size), size2);
    }

    private boolean D() {
        Iterator it = l().iterator();
        while (it.hasNext()) {
            if (!H.a.a((Size) it.next(), this.f10327c)) {
                return true;
            }
        }
        return false;
    }

    private static List E(List list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private List G(List list, boolean z10) {
        Map mapX = x(list);
        ArrayList<Rational> arrayList = new ArrayList(mapX.keySet());
        L(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(H.a.f3555c) && !rational.equals(H.a.f3553a)) {
                List list2 = (List) mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    private List H(List list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f10326b, list, false));
        }
        int size = arrayList.size();
        if (K()) {
            size = 0;
        }
        arrayList.addAll(size, I(this.f10327c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            AbstractC3583h0.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        AbstractC3583h0.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private List I(Rational rational, List list, boolean z10) {
        List<Size> listG = g(rational, list);
        M(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator it = this.f10328d.iterator();
        while (it.hasNext()) {
            List listV = v((D1) it.next());
            if (!z10) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean J() {
        boolean z10;
        S.c cVarV;
        Iterator it = this.f10328d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            D1 d12 = (D1) it.next();
            if (!d12.Z(false) && (d12 instanceof E0) && (cVarV = ((E0) d12).V(null)) != null) {
                z10 = true;
                if (cVarV.a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    private boolean K() {
        if (this.f10328d.isEmpty()) {
            return false;
        }
        Iterator it = this.f10328d.iterator();
        while (it.hasNext()) {
            Iterator it2 = v((D1) it.next()).iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (it2.hasNext()) {
                boolean zA = H.a.a((Size) it2.next(), this.f10327c);
                if (zA) {
                    z10 = true;
                }
                if (z11 && zA) {
                    return false;
                }
                if (!zA) {
                    z11 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    private void L(List list) {
        Collections.sort(list, new a(N(this.f10325a), true));
    }

    static void M(List list) {
        Collections.sort(list, new H.e(true));
    }

    private static Rational N(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational O(Size size) {
        Rational rational = H.a.f3553a;
        if (H.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = H.a.f3555c;
        return H.a.a(size, rational2) ? rational2 : N(size);
    }

    private boolean b(float f10, float f11, float f12) {
        if (f10 != f11 && f11 != f12) {
            if (f10 > f11) {
                return f11 < f12;
            }
            if (f11 > f12) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    private List d(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List e(List list) {
        Rational rationalN;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = map.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rationalN = null;
                    break;
                }
                rationalN = (Rational) it2.next();
                if (H.a.a(size, rationalN)) {
                    break;
                }
            }
            if (rationalN != null) {
                Size size2 = (Size) map.get(rationalN);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalN = N(size);
            }
            arrayList.add(size);
            map.put(rationalN, size);
        }
        return arrayList;
    }

    static List f(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    static List g(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (H.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f10324h ? H.a.f3555c : H.a.f3553a;
    }

    private List i() {
        return this.f10330f.o(34);
    }

    private List j() {
        return this.f10330f.x(34);
    }

    private static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalN = N(size);
        if (rational.floatValue() == rationalN.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalN.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rational.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rational.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    private Set l() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f10328d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v((D1) it.next()));
        }
        return hashSet;
    }

    static Rect m(Size size, Size size2) {
        return k(N(size2), size);
    }

    private static Rational n(Rational rational) {
        Rational rational2 = H.a.f3553a;
        if (rational.equals(rational2)) {
            return H.a.f3555c;
        }
        if (rational.equals(H.a.f3555c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    static List p(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listE = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    private b t(Rect rect, D1 d12, boolean z10) {
        Size sizeR;
        Size size;
        if (z10) {
            Pair pairS = s(z.m(rect), d12);
            sizeR = (Size) pairS.first;
            size = (Size) pairS.second;
        } else {
            Size sizeM = z.m(rect);
            sizeR = r(sizeM, d12);
            rect = m(sizeM, sizeR);
            size = sizeR;
        }
        return new b(rect, size, sizeR);
    }

    private static Rational u(Size size) {
        Rational rationalH = h(size);
        AbstractC3583h0.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    private List v(D1 d12) {
        if (!this.f10328d.contains(d12)) {
            throw new IllegalArgumentException("Invalid child config: " + d12);
        }
        if (this.f10331g.containsKey(d12)) {
            List list = (List) this.f10331g.get(d12);
            Objects.requireNonNull(list);
            return list;
        }
        List listE = e(this.f10329e.m(d12));
        this.f10331g.put(d12, listE);
        return listE;
    }

    private static List w(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    private Map x(List list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = H.a.f3553a;
        map.put(rational, new ArrayList());
        Rational rational2 = H.a.f3555c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (H.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalN = N(size);
                    arrayList2.add(rationalN);
                    map.put(rationalN, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean z(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (y((Size) it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    List o(R0 r02) {
        List listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) r02.f(E0.f1329t, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    b q(D1 d12, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (z.i(i10)) {
            rect = F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        b bVarT = t(rect, d12, z10);
        return z11 ? new b(F(bVarT.b()), z.o(bVarT.a()), bVarT.c()) : bVarT;
    }

    Size r(Size size, D1 d12) {
        List<Size> listV = v(d12);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    Pair s(Size size, D1 d12) {
        for (Size size2 : v(d12)) {
            Size sizeM = z.m(m(size2, size));
            if (!y(sizeM, size)) {
                return Pair.create(size2, sizeM);
            }
        }
        return Pair.create(size, size);
    }

    private c(Size size, L l10, Set set) {
        this(size, l10, set, new K.o(l10, size));
    }

    c(Size size, L l10, Set set, K.o oVar) {
        this.f10331g = new HashMap();
        this.f10325a = size;
        Rational rationalU = u(size);
        this.f10326b = rationalU;
        this.f10327c = n(rationalU);
        this.f10330f = l10;
        this.f10328d = set;
        this.f10329e = oVar;
    }
}
