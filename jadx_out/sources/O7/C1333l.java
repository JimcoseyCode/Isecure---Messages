package O7;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: O7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1333l implements L7.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8476b;

    public C1333l(List providers, String debugName) {
        AbstractC2855l.g(providers, "providers");
        AbstractC2855l.g(debugName, "debugName");
        this.f8475a = providers;
        this.f8476b = debugName;
        providers.size();
        AbstractC2800q.T0(providers).size();
    }

    @Override // L7.U
    public boolean a(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        List list = this.f8475a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!L7.T.b((L7.O) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // L7.U
    public void b(k8.c fqName, Collection packageFragments) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(packageFragments, "packageFragments");
        Iterator it = this.f8475a.iterator();
        while (it.hasNext()) {
            L7.T.a((L7.O) it.next(), fqName, packageFragments);
        }
    }

    @Override // L7.O
    public List c(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8475a.iterator();
        while (it.hasNext()) {
            L7.T.a((L7.O) it.next(), fqName, arrayList);
        }
        return AbstractC2800q.P0(arrayList);
    }

    @Override // L7.O
    public Collection p(k8.c fqName, Function1 nameFilter) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f8475a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((L7.O) it.next()).p(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f8476b;
    }
}
