package I7;

import I7.o;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k8.b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f5056a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f5057b;

    static {
        Set set = l.f5079l;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(o.c((l) it.next()));
        }
        List listA0 = AbstractC2800q.A0(AbstractC2800q.A0(AbstractC2800q.A0(arrayList, o.a.f5197h.l()), o.a.f5201j.l()), o.a.f5219s.l());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = k8.b.f29200d;
        Iterator it2 = listA0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.c((k8.c) it2.next()));
        }
        f5057b = linkedHashSet;
    }

    private d() {
    }

    public final Set a() {
        return f5057b;
    }

    public final Set b() {
        return f5057b;
    }
}
