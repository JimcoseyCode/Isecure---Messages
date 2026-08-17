package r;

import F.AbstractC0481f;
import F.AbstractC0504q0;
import F.k1;
import F.o1;
import F.r1;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.facebook.react.uimanager.ViewDefaults;
import i7.C2736C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s.C3294h;
import w7.InterfaceC3487a;
import y.AbstractC3583h0;
import y.C3563H;
import y.C3600u;

/* JADX INFO: renamed from: r.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3171f2 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final C3216s1 f31264B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final P1 f31265C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final B.a f31266D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f31277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC3172g f31278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s.E f31279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final v.f f31280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f31281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f31282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f31284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f31285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f31286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f31287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f31288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    F.s1 f31289w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C3213r1 f31291y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31267a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f31268b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31269c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f31270d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f31271e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f31272f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f31273g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f31274h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f31275i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f31276j = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    List f31290x = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final v.y f31292z = new v.y();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final v.u f31263A = new v.u();

    /* JADX INFO: renamed from: r.f2$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* JADX INFO: renamed from: r.f2$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class b {
        b() {
        }

        static b f(List list, List list2, int i10, int i11, int i12) {
            return new C3164e(list, list2, i10, i11, i12);
        }

        abstract List a();

        abstract List b();

        abstract int c();

        abstract int d();

        abstract int e();
    }

    /* JADX INFO: renamed from: r.f2$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum c {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    /* JADX INFO: renamed from: r.f2$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class d {
        static d j(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
            return new C3168f(i10, z10, i11, z11, z12, z13, z14, z15, range, z16);
        }

        abstract int a();

        abstract int b();

        abstract Range c();

        abstract boolean d();

        abstract boolean e();

        abstract boolean f();

        abstract boolean g();

        abstract boolean h();

        abstract boolean i();

        abstract boolean k();
    }

    C3171f2(Context context, String str, s.S s10, InterfaceC3172g interfaceC3172g, B.a aVar) throws C3600u {
        this.f31282p = false;
        this.f31283q = false;
        this.f31286t = false;
        this.f31287u = false;
        String str2 = (String) H0.g.g(str);
        this.f31277k = str2;
        this.f31278l = (InterfaceC3172g) H0.g.g(interfaceC3172g);
        this.f31280n = new v.f();
        this.f31291y = C3213r1.c(context);
        try {
            s.E eC = s10.c(str2);
            this.f31279m = eC;
            Integer num = (Integer) eC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f31281o = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) eC.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f31282p = true;
                    } else if (i10 == 6) {
                        this.f31283q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f31286t = true;
                    } else if (i10 == 1) {
                        this.f31287u = true;
                    }
                }
            }
            C3216s1 c3216s1 = new C3216s1(this.f31279m);
            this.f31264B = c3216s1;
            this.f31265C = new P1(this.f31279m);
            q();
            if (this.f31286t) {
                t();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f31284r = zHasSystemFeature;
            if (zHasSystemFeature) {
                l();
            }
            if (c3216s1.d()) {
                k();
            }
            boolean zH = C3155b2.h(this.f31279m);
            this.f31285s = zH;
            if (zH) {
                p();
            }
            boolean zA = y2.a(this.f31279m);
            this.f31288v = zA;
            if (zA) {
                o();
            }
            r();
            d();
            this.f31266D = aVar;
        } catch (C3294h e10) {
            throw Z0.a(e10);
        }
    }

    private Size A(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10, Rational rational) {
        Size[] sizeArrA;
        Size[] sizeArrD = D(streamConfigurationMap, i10, rational);
        if (sizeArrD == null || sizeArrD.length == 0) {
            return null;
        }
        H.e eVar = new H.e();
        Size size = (Size) Collections.max(Arrays.asList(sizeArrD), eVar);
        Size size2 = O.d.f8166a;
        if (z10 && (sizeArrA = a.a(streamConfigurationMap, i10)) != null && sizeArrA.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrA), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), eVar);
    }

    private int B(List list, boolean z10) {
        Iterator it = list.iterator();
        int iO = ViewDefaults.NUMBER_OF_LINES;
        while (it.hasNext()) {
            AbstractC0481f abstractC0481f = (AbstractC0481f) it.next();
            iO = O(iO, abstractC0481f.d(), abstractC0481f.g(), z10);
        }
        return iO;
    }

    private static Size[] D(StreamConfigurationMap streamConfigurationMap, int i10, Rational rational) {
        Size[] outputSizes;
        try {
            outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        if (rational == null) {
            return outputSizes;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            if (H.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    private static int E(Range range, Range range2) {
        H0.g.j((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int F(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private Size G() {
        try {
            Size sizeH = H(Integer.parseInt(this.f31277k));
            if (sizeH != null) {
                return sizeH;
            }
        } catch (NumberFormatException unused) {
        }
        Size sizeI = I();
        return sizeI != null ? sizeI : O.d.f8169d;
    }

    private Size H(int i10) {
        CamcorderProfile camcorderProfileA;
        int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (this.f31278l.b(i10, i12) && (camcorderProfileA = this.f31278l.a(i10, i12)) != null) {
                return new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
            }
        }
        return null;
    }

    private Size I() {
        Size[] outputSizes;
        try {
            outputSizes = this.f31279m.e().h().getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null) {
            return null;
        }
        Arrays.sort(outputSizes, new H.e(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = O.d.f8171f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    private static int J(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((C3563H) it.next()).a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private List L(d dVar) {
        if (this.f31273g.containsKey(dVar)) {
            return (List) this.f31273g.get(dVar);
        }
        List arrayList = new ArrayList();
        if (dVar.k()) {
            if (this.f31272f.isEmpty()) {
                m();
            }
            arrayList.addAll(this.f31272f);
        } else if (dVar.i()) {
            if (this.f31275i.isEmpty()) {
                s();
            }
            if (dVar.a() == 0) {
                arrayList.addAll(this.f31275i);
            }
        } else if (dVar.f()) {
            if (this.f31271e.isEmpty()) {
                n();
            }
            arrayList.addAll(this.f31271e);
        } else if (dVar.b() == 8) {
            int iA = dVar.a();
            if (iA == 1) {
                arrayList = this.f31269c;
            } else if (iA != 2) {
                arrayList.addAll(dVar.g() ? this.f31270d : this.f31267a);
            } else {
                arrayList.addAll(this.f31268b);
                arrayList.addAll(this.f31267a);
            }
        } else if (dVar.b() == 10 && dVar.a() == 0) {
            arrayList.addAll(this.f31274h);
        }
        this.f31273g.put(dVar, arrayList);
        return arrayList;
    }

    private Pair M(d dVar, List list, List list2, List list3, List list4, int i10, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0481f abstractC0481f = (AbstractC0481f) it.next();
            arrayList.add(abstractC0481f.h());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC0481f);
            }
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Size size = (Size) list2.get(i11);
            F.D1 d12 = (F.D1) list3.get(((Integer) list4.get(i11)).intValue());
            int iR = d12.r();
            arrayList.add(F.r1.l(iR, size, P(iR), dVar.a(), dVar.k() ? r1.c.f1672g : r1.c.f1673h, d12.F()));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), d12);
            }
            i10 = O(i10, d12.r(), size, dVar.f());
        }
        return new Pair(arrayList, Integer.valueOf(i10));
    }

    private Range N(List list, List list2, List list3, boolean z10) {
        Range rangeQ = F.o1.f1588a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rangeQ = Q(((AbstractC0481f) it.next()).i(), rangeQ, z10);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Range rangeK = ((F.D1) list2.get(((Integer) it2.next()).intValue())).K(F.o1.f1588a);
            Objects.requireNonNull(rangeK);
            rangeQ = Q(rangeK, rangeQ, z10);
        }
        return rangeQ;
    }

    private int O(int i10, int i11, Size size, boolean z10) {
        return Math.min(i10, y(i11, size, z10));
    }

    private Range Q(Range range, Range range2, boolean z10) {
        Range range3 = F.o1.f1588a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z10) {
            H0.g.j(range == range2, "All targetFrameRate should be the same if strict fps is required");
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    private static List R(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iN = ((F.D1) it.next()).N(0);
            if (!arrayList2.contains(Integer.valueOf(iN))) {
                arrayList2.add(Integer.valueOf(iN));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                F.D1 d12 = (F.D1) it3.next();
                if (iIntValue == d12.N(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(d12)));
                }
            }
        }
        return arrayList;
    }

    private static boolean S(int i10, Range range, int i11) {
        return F.o1.f1588a.equals(range) || i11 >= i10 || i11 >= ((Integer) range.getUpper()).intValue();
    }

    private boolean T(List list, List list2) {
        Iterator it = list.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolValueOf = Boolean.valueOf(v(((AbstractC0481f) it.next()).j(), boolValueOf));
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            boolValueOf = Boolean.valueOf(v(((F.D1) it2.next()).S(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private static boolean U(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC0481f) it.next()).d() == 4101) {
                return true;
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (((F.D1) it2.next()).r() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean V(d dVar, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0481f) it.next()).h());
        }
        H.e eVar = new H.e();
        for (F.D1 d12 : map.keySet()) {
            List list2 = (List) map.get(d12);
            H0.g.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + d12 + ".");
            Size size = (Size) Collections.min(list2, eVar);
            int iR = d12.r();
            arrayList.add(F.r1.l(iR, size, P(iR), dVar.a(), r1.c.f1673h, d12.F()));
        }
        Map map2 = Collections.EMPTY_MAP;
        List list3 = Collections.EMPTY_LIST;
        return e(dVar, arrayList, map2, list3, list3);
    }

    private void W(d dVar, Range range, Size size, int i10, F.p1 p1Var, boolean z10, Map map, List list) {
        r1.b bVarE = F.r1.l(i10, size, P(i10), dVar.a(), dVar.k() ? r1.c.f1672g : r1.c.f1673h, p1Var).e();
        Range range2 = F.o1.f1588a;
        int iY = (!range2.equals(range) || z10) ? y(i10, size, dVar.f()) : ViewDefaults.NUMBER_OF_LINES;
        if (dVar.e()) {
            if (bVarE == r1.b.f1667w) {
                return;
            }
            if (!range2.equals(range) && iY < ((Integer) range.getUpper()).intValue()) {
                return;
            }
        }
        Set hashSet = (Set) map.get(bVarE);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(bVarE, hashSet);
        }
        if (hashSet.contains(Integer.valueOf(iY))) {
            return;
        }
        list.add(size);
        hashSet.add(Integer.valueOf(iY));
    }

    private void X() {
        this.f31291y.g();
        if (this.f31289w == null) {
            r();
        } else {
            this.f31289w = F.s1.a(this.f31289w.b(), this.f31289w.n(), this.f31291y.f(), this.f31289w.l(), this.f31289w.j(), this.f31289w.h(), this.f31289w.f(), this.f31289w.d(), this.f31289w.p());
        }
    }

    private F.t1 Y(c cVar, d dVar, List list, Map map, List list2, List list3, Map map2, boolean z10) {
        AbstractC3583h0.a("SupportedSurfaceCombination", "resolveSpecsByCheckingMethod: checkingMethod = " + cVar);
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 1) {
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
        if (iOrdinal != 2) {
            return Z(dVar, list, map, list2, list3, map2, z10);
        }
        try {
            return Z(dVar, list, map, list2, list3, map2, z10);
        } catch (IllegalArgumentException e10) {
            AbstractC3583h0.b("SupportedSurfaceCombination", "Failed to find a supported combination without feature combo, trying again with feature combo", e10);
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
    }

    private F.t1 Z(d dVar, List list, Map map, List list2, List list3, Map map2, boolean z10) {
        HashMap map3;
        HashMap map4;
        int i10;
        int i11;
        List list4 = list;
        List list5 = list2;
        AbstractC3583h0.a("SupportedSurfaceCombination", "resolveSpecsBySettings: featureSettings = " + dVar);
        if (!dVar.k() && !V(dVar, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f31277k + ".  May be attempting to bind too many use cases. Existing surfaces: " + list4 + ". New configs: " + list5 + ". GroupableFeature settings: " + dVar);
        }
        Map mapI = i(map, dVar, z10);
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            F.D1 d12 = (F.D1) list5.get(((Integer) it.next()).intValue());
            List list6 = (List) mapI.get(d12);
            if (list6 == null) {
                list6 = Collections.EMPTY_LIST;
            }
            arrayList.add(c(list6, d12.r()));
        }
        List listJ = dVar.f() ? this.f31265C.j(arrayList) : u(arrayList);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        boolean zD = C3155b2.d(list4, list5);
        int iB = B(list4, dVar.f());
        List listC = null;
        if (!this.f31285s || zD) {
            map3 = map7;
            map4 = map8;
            i10 = iB;
        } else {
            Iterator it2 = listJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map7;
                    map4 = map8;
                    i10 = iB;
                    break;
                }
                Pair pairM = M(dVar, list4, (List) it2.next(), list5, list3, iB, map7, map8);
                map3 = map7;
                map4 = map8;
                i10 = iB;
                listC = C(dVar, (List) pairM.first, map3, map4);
                if (listC != null) {
                    break;
                }
                map3.clear();
                map4.clear();
                list5 = list2;
                map7 = map3;
                iB = i10;
                list4 = list;
                map8 = map4;
            }
            AbstractC3583h0.a("SupportedSurfaceCombination", "orderedSurfaceConfigListForStreamUseCase = " + listC);
        }
        List list7 = listC;
        HashMap map9 = map3;
        HashMap map10 = map4;
        b bVarJ = j(dVar, list, list2, list3, listJ, list7, map2, i10, z10);
        AbstractC3583h0.a("SupportedSurfaceCombination", "resolveSpecsBySettings: bestSizesAndFps = " + bVarJ);
        List listA = bVarJ.a();
        int iD = bVarJ.d();
        List listB = bVarJ.b();
        int iE = bVarJ.e();
        int iC = bVarJ.c();
        if (listA == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f31277k + " and Hardware level: " + this.f31281o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        Range rangeX = F.o1.f1588a;
        if (rangeX.equals(dVar.c())) {
            i11 = iC;
            if (dVar.f()) {
                rangeX = x(P1.f31053f, iD, this.f31265C.f(listA));
            }
        } else {
            Range[] rangeArrF = dVar.f() ? this.f31265C.f(listA) : (Range[]) this.f31279m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range rangeX2 = x(dVar.c(), iD, rangeArrF);
            if (dVar.e() || dVar.h()) {
                boolean zEquals = rangeX2.equals(dVar.c());
                Range[] rangeArr = rangeArrF;
                StringBuilder sb = new StringBuilder();
                i11 = iC;
                sb.append("Target FPS range ");
                sb.append(dVar.c());
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(iD);
                sb.append(". Calculated best FPS range for device: ");
                sb.append(rangeX2);
                sb.append(". Device supported FPS ranges: ");
                sb.append(Arrays.toString(rangeArr));
                H0.g.b(zEquals, sb.toString());
            } else {
                i11 = iC;
            }
            rangeX = rangeX2;
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            F.D1 d13 = (F.D1) it3.next();
            Iterator it4 = it3;
            o1.a aVarH = F.o1.a((Size) listA.get(list3.indexOf(Integer.valueOf(list2.indexOf(d13))))).g(dVar.f() ? 1 : 0).b((C3563H) H0.g.g((C3563H) map2.get(d13))).d(C3155b2.e(d13)).h(dVar.d());
            if (!F.o1.f1588a.equals(rangeX)) {
                aVarH.c(rangeX);
            }
            map6.put(d13, aVarH.a());
            it3 = it4;
        }
        if (list7 != null && iD == iE && listA.size() == listB.size()) {
            int i12 = 0;
            while (true) {
                if (i12 < listA.size()) {
                    if (!((Size) listA.get(i12)).equals(listB.get(i12))) {
                        break;
                    }
                    i12++;
                } else if (!C3155b2.k(this.f31279m, list, map6, map5)) {
                    C3155b2.l(map6, map5, map9, map10, list7);
                }
            }
        }
        return new F.t1(map6, map5, i11);
    }

    private void b0(Map map, int i10, Rational rational) {
        Size sizeA = A(this.f31279m.e().h(), i10, true, rational);
        if (sizeA != null) {
            map.put(Integer.valueOf(i10), sizeA);
        }
    }

    private void c0(Map map, Size size, int i10) {
        if (this.f31284r) {
            Size sizeA = A(this.f31279m.e().h(), i10, false, null);
            Integer numValueOf = Integer.valueOf(i10);
            if (sizeA != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeA), new H.e());
            }
            map.put(numValueOf, size);
        }
    }

    private void d0(Map map, int i10) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f31286t || (streamConfigurationMap = (StreamConfigurationMap) this.f31279m.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i10), A(streamConfigurationMap, i10, true, null));
    }

    private static Range f(Range range, Range range2, Range range3) {
        double dF = F(range2.intersect(range));
        double dF2 = F(range3.intersect(range));
        double dF3 = dF2 / ((double) F(range3));
        double dF4 = dF / ((double) F(range2));
        return (dF2 <= dF ? dF2 != dF ? dF4 >= 0.5d || dF3 <= dF4 : dF3 <= dF4 && (dF3 != dF4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : dF3 < 0.5d && dF3 < dF4) ? range2 : range3;
    }

    private F.k1 g(d dVar, List list, Map map, List list2, List list3) {
        Range rangeC = dVar.c();
        k1.h hVar = new k1.h();
        for (int i10 = 0; i10 < list.size(); i10++) {
            F.r1 r1Var = (F.r1) list.get(i10);
            Size sizeH = r1Var.h(P(r1Var.g()));
            F.D1 d12 = (F.D1) list2.get(((Integer) list3.get(i10)).intValue());
            C3563H c3563h = (C3563H) map.get(r1Var);
            Objects.requireNonNull(c3563h);
            k1.b bVarB = B.a.b(d12, sizeH, c3563h);
            bVarB.v(F.o1.f1588a.equals(rangeC) ? C.c.f451k : rangeC);
            if (dVar.g()) {
                bVarB.z(2);
            }
            hVar.b(bVarB.p());
            H0.g.j(hVar.f(), "Cannot create a combined SessionConfig for feature combo after adding " + d12 + " with " + r1Var + " due to [" + hVar.d() + "]; surfaceConfigList = " + list + ", featureSettings = " + dVar + ", newUseCaseConfigs = " + list2);
        }
        return hVar.c();
    }

    private d h(int i10, boolean z10, Map map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
        int iJ = J(map);
        if (i10 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f31277k, F.N.a(i10)));
        }
        if (i10 != 0 && iJ == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f31277k, F.N.a(i10)));
        }
        if (i10 != 0 && z14) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Feature combination query is not currently supported in %s camera mode.", this.f31277k, F.N.a(i10)));
        }
        if (z13 && z14) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z13 && !this.f31265C.m()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z14 && range == F.o1.f1588a && z15) {
            range = C.c.f451k;
        }
        return d.j(i10, z10, iJ, z11, z12, z13, z14, z15, range, z16);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0112 A[PHI: r6 r7 r10
      0x0112: PHI (r6v2 boolean) = (r6v1 boolean), (r6v1 boolean), (r6v1 boolean), (r6v3 boolean) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v5 int), (r7v6 int) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r10v3 java.util.List) = (r10v1 java.util.List), (r10v1 java.util.List), (r10v5 java.util.List), (r10v6 java.util.List) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private b j(final d dVar, List list, final List list2, final List list3, List list4, List list5, Map map, int i10, boolean z10) {
        d dVar2;
        Range rangeC = dVar.c();
        Iterator it = list4.iterator();
        int i11 = ViewDefaults.NUMBER_OF_LINES;
        boolean z11 = false;
        int i12 = ViewDefaults.NUMBER_OF_LINES;
        boolean z12 = false;
        int i13 = ViewDefaults.NUMBER_OF_LINES;
        List list6 = null;
        List list7 = null;
        while (true) {
            if (!it.hasNext()) {
                dVar2 = dVar;
                break;
            }
            List list8 = (List) it.next();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Pair pairM = M(dVar, list, list8, list2, list3, i10, map2, map3);
            final List list9 = (List) pairM.first;
            int iIntValue = ((Integer) pairM.second).intValue();
            boolean zS = S(i10, rangeC, iIntValue);
            final HashMap map4 = new HashMap();
            Iterator it2 = it;
            int i14 = 0;
            while (i14 < list9.size()) {
                F.r1 r1Var = (F.r1) list9.get(i14);
                C3563H c3563hC = C3563H.f33649c;
                int i15 = i14;
                if (map2.containsKey(Integer.valueOf(i15))) {
                    AbstractC0481f abstractC0481f = (AbstractC0481f) map2.get(Integer.valueOf(i15));
                    Objects.requireNonNull(abstractC0481f);
                    c3563hC = abstractC0481f.c();
                } else {
                    if (map3.containsKey(Integer.valueOf(i15))) {
                        F.D1 d12 = (F.D1) map3.get(Integer.valueOf(i15));
                        Objects.requireNonNull(d12);
                        c3563hC = (C3563H) map.get(d12);
                    }
                    map4.put(r1Var, c3563hC);
                    i14 = i15 + 1;
                }
                map4.put(r1Var, c3563hC);
                i14 = i15 + 1;
            }
            C2736C c2736c = new C2736C(new InterfaceC3487a() { // from class: r.e2
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return Boolean.valueOf(this.f31246g.e(dVar, list9, map4, list2, list3));
                }
            });
            if (z10 && ((Boolean) c2736c.getValue()).booleanValue() && (i11 == Integer.MAX_VALUE || i11 < iIntValue)) {
                i11 = iIntValue;
            }
            if (!z11 && ((Boolean) c2736c.getValue()).booleanValue()) {
                if (i12 == Integer.MAX_VALUE || i12 < iIntValue) {
                    i12 = iIntValue;
                    list6 = list8;
                }
                if (zS) {
                    if (z12 && !z10) {
                        dVar2 = dVar;
                        i12 = iIntValue;
                        list6 = list8;
                        break;
                    }
                    z11 = true;
                    i12 = iIntValue;
                    list6 = list8;
                    if (list5 == null) {
                    }
                    it = it2;
                }
            } else {
                if (list5 == null && !z12) {
                    dVar2 = dVar;
                    if (C(dVar2, list9, map2, map3) != null) {
                        if (i13 == Integer.MAX_VALUE || i13 < iIntValue) {
                            i13 = iIntValue;
                            list7 = list8;
                        }
                        if (!zS) {
                            continue;
                        } else {
                            if (z11 && !z10) {
                                i13 = iIntValue;
                                list7 = list8;
                                break;
                            }
                            z12 = true;
                            i13 = iIntValue;
                            list7 = list8;
                        }
                    } else {
                        continue;
                    }
                }
                it = it2;
            }
        }
        return (!dVar2.e() || F.o1.f1588a.equals(rangeC) || (i12 != Integer.MAX_VALUE && i12 >= ((Integer) rangeC.getUpper()).intValue())) ? b.f(list6, list7, i12, i13, i11) : b.f(null, null, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES);
    }

    private void k() {
        this.f31274h.addAll(L1.e());
    }

    private void l() {
        this.f31269c.addAll(L1.g());
    }

    private void m() {
        this.f31272f.addAll(L1.c());
    }

    private void n() {
        if (this.f31265C.m()) {
            this.f31271e.clear();
            Size sizeI = this.f31265C.i();
            if (sizeI != null) {
                this.f31271e.addAll(L1.b(sizeI, P(34)));
            }
        }
    }

    private void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f31270d.addAll(L1.l());
        }
    }

    private void p() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f31276j.addAll(L1.n());
        }
    }

    private void q() {
        this.f31267a.addAll(L1.d(this.f31281o, this.f31282p, this.f31283q));
        this.f31267a.addAll(this.f31280n.a(this.f31277k));
    }

    private void r() {
        this.f31289w = F.s1.a(O.d.f8168c, new HashMap(), this.f31291y.f(), new HashMap(), G(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    private void s() {
        this.f31275i.addAll(L1.o());
    }

    private void t() {
        this.f31268b.addAll(L1.p());
    }

    private List u(List list) {
        Iterator it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= ((List) it.next()).size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / ((List) list.get(0)).size();
        int i11 = size;
        for (int i12 = 0; i12 < list.size(); i12++) {
            List list2 = (List) list.get(i12);
            for (int i13 = 0; i13 < size; i13++) {
                ((List) arrayList.get(i13)).add((Size) list2.get((i13 % i11) / size2));
            }
            if (i12 < list.size() - 1) {
                i11 = size2;
                size2 /= ((List) list.get(i12 + 1)).size();
            }
        }
        return arrayList;
    }

    private boolean v(boolean z10, Boolean bool) {
        if (bool == null || bool.booleanValue() == z10) {
            return z10;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    private c w(Collection collection, Range range, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return c.WITHOUT_FEATURE_COMBO;
        }
        ?? Contains = collection.contains(C3563H.f33652f);
        int i10 = Contains;
        if (range != null) {
            i10 = Contains;
            if (((Integer) range.getUpper()).intValue() == 60) {
                i10 = Contains + 1;
            }
        }
        if (z10) {
            i10++;
        }
        if (z11) {
            i10++;
        }
        return i10 > 1 ? c.WITH_FEATURE_COMBO : i10 == 1 ? c.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : c.WITHOUT_FEATURE_COMBO;
    }

    private Range x(Range range, int i10, Range[] rangeArr) {
        Range rangeF = F.o1.f1588a;
        if (rangeF.equals(range) || rangeArr == null) {
            return rangeF;
        }
        Range range2 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i10)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i10)));
        int iF = 0;
        for (Range range3 : rangeArr) {
            Objects.requireNonNull(range3);
            if (i10 >= ((Integer) range3.getLower()).intValue()) {
                if (rangeF.equals(F.o1.f1588a)) {
                    rangeF = range3;
                }
                if (range3.equals(range2)) {
                    return range3;
                }
                try {
                    int iF2 = F(range3.intersect(range2));
                    if (iF == 0) {
                        iF = iF2;
                    } else {
                        if (iF2 >= iF) {
                            rangeF = f(range2, rangeF, range3);
                            iF = F(range2.intersect(rangeF));
                        }
                        range3 = rangeF;
                    }
                } catch (IllegalArgumentException unused) {
                    if (iF != 0 || (E(range3, range2) >= E(rangeF, range2) && (E(range3, range2) != E(rangeF, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeF.getUpper()).intValue() && F(range3) >= F(rangeF))))) {
                    }
                }
                rangeF = range3;
            }
        }
        return rangeF;
    }

    private int y(int i10, Size size, boolean z10) {
        H0.g.i(!z10 || i10 == 34);
        return z10 ? this.f31265C.h(size) : z(this.f31279m, i10, size);
    }

    private int z(s.E e10, int i10, Size size) {
        s.X xE = e10.e();
        Objects.requireNonNull(xE);
        long jF = xE.f(i10, size);
        if (jF > 0) {
            return (int) (1.0E9d / jF);
        }
        if (!this.f31287u) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        AbstractC3583h0.l("SupportedSurfaceCombination", "minFrameDuration: " + jF + " is invalid for imageFormat = " + i10 + ", size = " + size);
        return 0;
    }

    List C(d dVar, List list, Map map, Map map2) {
        if (!C3155b2.n(dVar)) {
            return null;
        }
        Iterator it = this.f31276j.iterator();
        while (it.hasNext()) {
            final List listD = ((F.q1) it.next()).d(list);
            if (listD != null) {
                boolean zA = C3155b2.a(map, map2, listD);
                C2736C c2736c = new C2736C(new InterfaceC3487a() { // from class: r.d2
                    @Override // w7.InterfaceC3487a
                    public final Object invoke() {
                        return Boolean.valueOf(C3155b2.c(this.f31237g.f31279m, listD));
                    }
                });
                if (zA && ((Boolean) c2736c.getValue()).booleanValue()) {
                    return listD;
                }
            }
        }
        return null;
    }

    F.t1 K(int i10, List list, Map map, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean zT;
        Range rangeN;
        X();
        boolean zL = P1.l(list, map.keySet());
        Map mapD = zL ? this.f31265C.d(map) : map;
        ArrayList arrayList = new ArrayList(mapD.keySet());
        List listR = R(arrayList);
        Map mapG = this.f31264B.g(list, arrayList, listR);
        AbstractC3583h0.a("SupportedSurfaceCombination", "resolvedDynamicRanges = " + mapG);
        boolean zU = U(list, mapD);
        if (z13) {
            rangeN = F.o1.f1588a;
            zT = false;
        } else {
            zT = T(list, arrayList);
            rangeN = N(list, arrayList, listR, zT);
        }
        Range range = rangeN;
        boolean z14 = zT;
        if (z10 && !this.f31288v && z12) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return Y(w(mapG.values(), range, z10, zU, z12), h(i10, z11, mapG, z10, zU, zL, z12, false, range, z14), list, mapD, arrayList, listR, mapG, z13);
    }

    F.s1 P(int i10) {
        if (!this.f31290x.contains(Integer.valueOf(i10))) {
            c0(this.f31289w.n(), O.d.f8170e, i10);
            c0(this.f31289w.l(), O.d.f8172g, i10);
            b0(this.f31289w.h(), i10, null);
            b0(this.f31289w.f(), i10, H.a.f3553a);
            b0(this.f31289w.d(), i10, H.a.f3555c);
            d0(this.f31289w.p(), i10);
            this.f31290x.add(Integer.valueOf(i10));
        }
        return this.f31289w;
    }

    F.r1 a0(int i10, int i11, Size size, F.p1 p1Var) {
        return F.r1.l(i11, size, P(i11), i10, r1.c.f1673h, p1Var);
    }

    List c(List list, int i10) {
        Rational rational;
        int iA = this.f31292z.a(this.f31277k, this.f31279m);
        if (iA == 0) {
            rational = H.a.f3553a;
        } else if (iA != 1) {
            rational = null;
            if (iA == 2) {
                Size sizeG = P(256).g(256);
                if (sizeG != null) {
                    rational = new Rational(sizeG.getWidth(), sizeG.getHeight());
                }
            } else if (iA != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + iA);
            }
        } else {
            rational = H.a.f3555c;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (H.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f31263A.a(F.r1.f(i10), list);
    }

    boolean e(d dVar, List list, Map map, List list2, List list3) {
        Iterator it = L(dVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = ((F.q1) it.next()).d(list) != null;
            if (z10) {
                break;
            }
        }
        if (!z10 || !dVar.k()) {
            return z10;
        }
        F.k1 k1VarG = g(dVar, list, map, list2, list3);
        boolean zA = this.f31266D.a(k1VarG);
        Iterator it2 = k1VarG.o().iterator();
        while (it2.hasNext()) {
            ((AbstractC0504q0) it2.next()).d();
        }
        return zA;
    }

    Map i(Map map, d dVar, boolean z10) {
        HashMap map2 = new HashMap();
        for (F.D1 d12 : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            List list = (List) map.get(d12);
            Objects.requireNonNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W(dVar, dVar.c(), (Size) it.next(), d12.r(), d12.F(), z10, map3, arrayList);
            }
            map2.put(d12, arrayList);
        }
        return map2;
    }

    private void d() {
    }
}
