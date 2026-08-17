package r;

import F.AbstractC0481f;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2752o;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class P1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31052e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f31053f = new Range(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s.E f31054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f31055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f31056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f31057d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Collection attachedSurfaces, Collection newUseCaseConfigs) {
            boolean z10;
            AbstractC2855l.g(attachedSurfaces, "attachedSurfaces");
            AbstractC2855l.g(newUseCaseConfigs, "newUseCaseConfigs");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(attachedSurfaces, 10));
            Iterator it = attachedSurfaces.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AbstractC0481f) it.next()).f()));
            }
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(newUseCaseConfigs, 10));
            Iterator it2 = newUseCaseConfigs.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((F.D1) it2.next()).q(0)));
            }
            List listZ0 = AbstractC2800q.z0(arrayList, arrayList2);
            if (listZ0 == null || !listZ0.isEmpty()) {
                Iterator it3 = listZ0.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((Number) it3.next()).intValue() == 1) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10 || (listZ0 != null && listZ0.isEmpty())) {
                return z10;
            }
            Iterator it4 = listZ0.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() != 1) {
                    throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                }
            }
            return z10;
        }

        private a() {
        }
    }

    public P1(s.E characteristics) {
        AbstractC2855l.g(characteristics, "characteristics");
        this.f31054a = characteristics;
        this.f31055b = AbstractC2746i.b(new InterfaceC3487a() { // from class: r.M1
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Boolean.valueOf(P1.n(this.f31036g));
            }
        });
        this.f31056c = AbstractC2746i.b(new InterfaceC3487a() { // from class: r.N1
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return P1.o(this.f31044g);
            }
        });
        this.f31057d = AbstractC2746i.b(new InterfaceC3487a() { // from class: r.O1
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return P1.p(this.f31047g);
            }
        });
    }

    private final List e(List list) {
        if (list.isEmpty()) {
            return AbstractC2800q.j();
        }
        List listR0 = AbstractC2800q.R0((Collection) AbstractC2800q.e0(list));
        Iterator it = AbstractC2800q.Z(list, 1).iterator();
        while (it.hasNext()) {
            listR0.retainAll((List) it.next());
        }
        return listR0;
    }

    private final List g(Size size) {
        Object objB;
        List listD;
        List listP0;
        try {
            C2752o.a aVar = C2752o.f28721h;
            objB = C2752o.b(this.f31054a.e().b(size));
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        if (C2752o.f(objB)) {
            objB = null;
        }
        Range[] rangeArr = (Range[]) objB;
        return (rangeArr == null || (listD = AbstractC2793j.D(rangeArr)) == null || (listP0 = AbstractC2800q.P0(listD)) == null) ? AbstractC2800q.j() : listP0;
    }

    private final List k() {
        return (List) this.f31057d.getValue();
    }

    public static final boolean l(Collection collection, Collection collection2) {
        return f31052e.a(collection, collection2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(P1 p12) {
        int[] iArr = (int[]) p12.f31054a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size o(P1 p12) {
        List listK = p12.k();
        if (listK.isEmpty()) {
            listK = null;
        }
        if (listK == null) {
            return null;
        }
        Iterator it = listK.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iC = O.d.c((Size) next);
            do {
                Object next2 = it.next();
                int iC2 = O.d.c((Size) next2);
                if (iC < iC2) {
                    next = next2;
                    iC = iC2;
                }
            } while (it.hasNext());
        }
        return (Size) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(P1 p12) {
        List listD;
        Size[] sizeArrC = p12.f31054a.e().c();
        return (sizeArrC == null || (listD = AbstractC2793j.D(sizeArrC)) == null) ? AbstractC2800q.j() : listD;
    }

    public final Map d(Map sizesMap) {
        AbstractC2855l.g(sizesMap, "sizesMap");
        List listE = e(AbstractC2800q.P0(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (k().contains((Size) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.K.e(sizesMap.size()));
        for (Map.Entry entry : sizesMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (arrayList.contains((Size) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    public final Range[] f(List surfaceSizes) {
        AbstractC2855l.g(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || AbstractC2800q.Y(surfaceSizes).size() != 1) {
            return null;
        }
        List listG = g((Size) surfaceSizes.get(0));
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                Range range = (Range) obj;
                if (AbstractC2855l.b(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            listG = arrayList;
        }
        return (Range[]) listG.toArray(new Range[0]);
    }

    public final int h(Size size) {
        AbstractC2855l.g(size, "size");
        List listG = g(size);
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            AbstractC3583h0.l("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator it = listG.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        AbstractC2855l.f(num, "maxOf(...)");
        return num.intValue();
    }

    public final Size i() {
        return (Size) this.f31056c.getValue();
    }

    public final List j(List sizesList) {
        AbstractC2855l.g(sizesList, "sizesList");
        if (sizesList.isEmpty()) {
            return AbstractC2800q.j();
        }
        List<Size> listE = e(sizesList);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listE, 10));
        for (Size size : listE) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final boolean m() {
        return ((Boolean) this.f31055b.getValue()).booleanValue();
    }
}
