package r;

import F.AbstractC0481f;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t.AbstractC3344d;
import t.C3346f;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: renamed from: r.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3216s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s.E f31490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3346f f31491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31492c;

    /* JADX INFO: renamed from: r.s1$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {
        static C3563H a(s.E e10) {
            Long l10 = (Long) e10.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return AbstractC3344d.b(l10.longValue());
            }
            return null;
        }
    }

    C3216s1(s.E e10) {
        this.f31490a = e10;
        this.f31491b = C3346f.a(e10);
        int[] iArr = (int[]) e10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr[i10] == 18) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f31492c = z10;
    }

    private static boolean a(C3563H c3563h, C3563H c3563h2) {
        H0.g.j(c3563h2.e(), "Fully specified range is not actually fully specified.");
        if (c3563h.b() == 2 && c3563h2.b() == 1) {
            return false;
        }
        if (c3563h.b() == 2 || c3563h.b() == 0 || c3563h.b() == c3563h2.b()) {
            return c3563h.a() == 0 || c3563h.a() == c3563h2.a();
        }
        return false;
    }

    private static boolean b(C3563H c3563h, C3563H c3563h2, Set set) {
        if (set.contains(c3563h2)) {
            return a(c3563h, c3563h2);
        }
        AbstractC3583h0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c3563h, c3563h2));
        return false;
    }

    private static C3563H c(C3563H c3563h, Collection collection, Set set) {
        if (c3563h.b() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3563H c3563h2 = (C3563H) it.next();
            H0.g.h(c3563h2, "Fully specified DynamicRange cannot be null.");
            int iB = c3563h2.b();
            H0.g.j(c3563h2.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(c3563h, c3563h2, set)) {
                return c3563h2;
            }
        }
        return null;
    }

    private static boolean e(C3563H c3563h) {
        return Objects.equals(c3563h, C3563H.f33649c);
    }

    private static boolean f(C3563H c3563h) {
        if (c3563h.b() == 2) {
            return true;
        }
        if (c3563h.b() == 0 || c3563h.a() != 0) {
            return c3563h.b() == 0 && c3563h.a() != 0;
        }
        return true;
    }

    private C3563H h(C3563H c3563h, Set set, Set set2, Set set3, String str) {
        C3563H c3563hA;
        if (c3563h.e()) {
            if (set.contains(c3563h)) {
                return c3563h;
            }
            return null;
        }
        int iB = c3563h.b();
        int iA = c3563h.a();
        if (iB == 1 && iA == 0) {
            C3563H c3563h2 = C3563H.f33650d;
            if (set.contains(c3563h2)) {
                return c3563h2;
            }
            return null;
        }
        C3563H c3563hC = c(c3563h, set2, set);
        if (c3563hC != null) {
            AbstractC3583h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c3563h, c3563hC));
            return c3563hC;
        }
        C3563H c3563hC2 = c(c3563h, set3, set);
        if (c3563hC2 != null) {
            AbstractC3583h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c3563h, c3563hC2));
            return c3563hC2;
        }
        C3563H c3563h3 = C3563H.f33650d;
        if (b(c3563h, c3563h3, set)) {
            AbstractC3583h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c3563h, c3563h3));
            return c3563h3;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                c3563hA = a.a(this.f31490a);
                if (c3563hA != null) {
                    linkedHashSet.add(c3563hA);
                }
            } else {
                c3563hA = null;
            }
            linkedHashSet.add(C3563H.f33652f);
            C3563H c3563hC3 = c(c3563h, linkedHashSet, set);
            if (c3563hC3 != null) {
                AbstractC3583h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, c3563hC3.equals(c3563hA) ? "recommended" : "required", c3563h, c3563hC3));
                return c3563hC3;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3563H c3563h4 = (C3563H) it.next();
            H0.g.j(c3563h4.e(), "Candidate dynamic range must be fully specified.");
            if (!c3563h4.equals(C3563H.f33650d) && a(c3563h, c3563h4)) {
                AbstractC3583h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c3563h, c3563h4));
                return c3563h4;
            }
        }
        return null;
    }

    private C3563H i(Set set, Set set2, Set set3, F.D1 d12, Set set4) {
        C3563H c3563hL = d12.l();
        C3563H c3563hH = h(c3563hL, set4, set2, set3, d12.L());
        if (c3563hH == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", d12.L(), c3563hL, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, c3563hH, this.f31491b);
        return c3563hH;
    }

    private static void j(Set set, C3563H c3563h, C3346f c3346f) {
        H0.g.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set setB = c3346f.b(c3563h);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", c3563h, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
        }
    }

    boolean d() {
        return this.f31492c;
    }

    Map g(List list, List list2, List list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AbstractC0481f) it.next()).c());
        }
        Set setC = this.f31491b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, (C3563H) it2.next(), this.f31491b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            F.D1 d12 = (F.D1) list2.get(((Integer) it3.next()).intValue());
            C3563H c3563hL = d12.l();
            if (e(c3563hL)) {
                arrayList3.add(d12);
            } else if (f(c3563hL)) {
                arrayList2.add(d12);
            } else {
                arrayList.add(d12);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<F.D1> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (F.D1 d13 : arrayList4) {
            C3563H c3563hI = i(setC, linkedHashSet, linkedHashSet2, d13, hashSet);
            map.put(d13, c3563hI);
            if (!linkedHashSet.contains(c3563hI)) {
                linkedHashSet2.add(c3563hI);
            }
        }
        return map;
    }
}
