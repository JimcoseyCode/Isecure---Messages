package Z;

import Z.AbstractC1577p;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: renamed from: Z.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1585y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f13522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1577p f13523b;

    C1585y(List list, AbstractC1577p abstractC1577p) {
        H0.g.b((list.isEmpty() && abstractC1577p == AbstractC1577p.f13460a) ? false : true, "No preferred quality and fallback strategy.");
        this.f13522a = Collections.unmodifiableList(new ArrayList(list));
        this.f13523b = abstractC1577p;
    }

    private void a(List list, Set set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        AbstractC3583h0.a("QualitySelector", "Select quality by fallbackStrategy = " + this.f13523b);
        AbstractC1577p abstractC1577p = this.f13523b;
        if (abstractC1577p == AbstractC1577p.f13460a) {
            return;
        }
        H0.g.j(abstractC1577p instanceof AbstractC1577p.b, "Currently only support type RuleStrategy");
        AbstractC1577p.b bVar = (AbstractC1577p.b) this.f13523b;
        List listB = AbstractC1582v.b();
        AbstractC1582v abstractC1582vB = bVar.b() == AbstractC1582v.f13488f ? (AbstractC1582v) listB.get(0) : bVar.b() == AbstractC1582v.f13487e ? (AbstractC1582v) listB.get(listB.size() - 1) : bVar.b();
        int iIndexOf = listB.indexOf(abstractC1582vB);
        H0.g.i(iIndexOf != -1);
        ArrayList arrayList = new ArrayList();
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            AbstractC1582v abstractC1582v = (AbstractC1582v) listB.get(i10);
            if (list.contains(abstractC1582v)) {
                arrayList.add(abstractC1582v);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = iIndexOf + 1; i11 < listB.size(); i11++) {
            AbstractC1582v abstractC1582v2 = (AbstractC1582v) listB.get(i11);
            if (list.contains(abstractC1582v2)) {
                arrayList2.add(abstractC1582v2);
            }
        }
        AbstractC3583h0.a("QualitySelector", "sizeSortedQualities = " + listB + ", fallback quality = " + abstractC1582vB + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int iC = bVar.c();
        if (iC != 0) {
            if (iC == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (iC == 2) {
                set.addAll(arrayList);
                return;
            }
            if (iC != 3) {
                if (iC == 4) {
                    set.addAll(arrayList2);
                    return;
                }
                throw new AssertionError("Unhandled fallback strategy: " + this.f13523b);
            }
            set.addAll(arrayList2);
            set.addAll(arrayList);
        }
    }

    private static void b(AbstractC1582v abstractC1582v) {
        H0.g.b(AbstractC1582v.a(abstractC1582v), "Invalid quality: " + abstractC1582v);
    }

    private static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1582v abstractC1582v = (AbstractC1582v) it.next();
            H0.g.b(AbstractC1582v.a(abstractC1582v), "qualities contain invalid quality: " + abstractC1582v);
        }
    }

    public static C1585y d(AbstractC1582v abstractC1582v, AbstractC1577p abstractC1577p) {
        H0.g.h(abstractC1582v, "quality cannot be null");
        H0.g.h(abstractC1577p, "fallbackStrategy cannot be null");
        b(abstractC1582v);
        return new C1585y(Collections.singletonList(abstractC1582v), abstractC1577p);
    }

    public static C1585y e(List list, AbstractC1577p abstractC1577p) {
        H0.g.h(list, "qualities cannot be null");
        H0.g.h(abstractC1577p, "fallbackStrategy cannot be null");
        H0.g.b(!list.isEmpty(), "qualities cannot be empty");
        c(list);
        return new C1585y(list, abstractC1577p);
    }

    private static Size g(b0.i iVar) {
        return iVar.k().k();
    }

    public static Map h(e0 e0Var, C3563H c3563h) {
        HashMap map = new HashMap();
        for (AbstractC1582v abstractC1582v : e0Var.d(c3563h)) {
            b0.i iVarC = e0Var.c(abstractC1582v, c3563h);
            Objects.requireNonNull(iVarC);
            map.put(abstractC1582v, g(iVarC));
        }
        return map;
    }

    public List f(List list) {
        if (list.isEmpty()) {
            AbstractC3583h0.l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        AbstractC3583h0.a("QualitySelector", "supportedQualities = " + list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = this.f13522a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC1582v abstractC1582v = (AbstractC1582v) it.next();
            if (abstractC1582v == AbstractC1582v.f13488f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (abstractC1582v == AbstractC1582v.f13487e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(abstractC1582v)) {
                linkedHashSet.add(abstractC1582v);
            } else {
                AbstractC3583h0.l("QualitySelector", "quality is not supported and will be ignored: " + abstractC1582v);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f13522a + ", fallbackStrategy=" + this.f13523b + "}";
    }
}
