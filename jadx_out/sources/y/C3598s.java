package y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: y.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3598s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3598s f33845c = new a().b(0).a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3598s f33846d = new a().b(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f33847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33848b;

    /* JADX INFO: renamed from: y.s$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedHashSet f33849a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33850b;

        public C3598s a() {
            return new C3598s(this.f33849a, this.f33850b);
        }

        public a b(int i10) {
            H0.g.j(i10 != -1, "The specified lens facing is invalid.");
            this.f33849a.add(new F.I0(i10));
            return this;
        }
    }

    C3598s(LinkedHashSet linkedHashSet, String str) {
        this.f33847a = linkedHashSet;
        this.f33848b = str;
    }

    private String e(Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cams:");
        sb.append(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            F.L lR = ((F.M) it.next()).r();
            sb.append(String.format(" Id:%s  Lens:%s", lR.f(), Integer.valueOf(lR.k())));
        }
        return sb.toString();
    }

    private String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("PhyId:%s  Filters:%s", this.f33848b, Integer.valueOf(this.f33847a.size())));
        for (InterfaceC3595o interfaceC3595o : this.f33847a) {
            sb.append(" Id:");
            sb.append(interfaceC3595o.a());
            if (interfaceC3595o instanceof F.I0) {
                sb.append(" LensFilter:");
                sb.append(((F.I0) interfaceC3595o).c());
            }
        }
        return sb.toString();
    }

    public LinkedHashSet a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((F.M) it.next()).d());
        }
        List listB = b(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            F.M m10 = (F.M) it2.next();
            if (listB.contains(m10.d())) {
                linkedHashSet2.add(m10);
            }
        }
        return linkedHashSet2;
    }

    public List b(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f33847a.iterator();
        while (it.hasNext()) {
            arrayList = ((InterfaceC3595o) it.next()).b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet c() {
        return this.f33847a;
    }

    public Integer d() {
        Integer num = null;
        for (InterfaceC3595o interfaceC3595o : this.f33847a) {
            if (interfaceC3595o instanceof F.I0) {
                Integer numValueOf = Integer.valueOf(((F.I0) interfaceC3595o).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public F.M g(LinkedHashSet linkedHashSet) {
        Iterator it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (F.M) it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", e(linkedHashSet), f()));
    }
}
