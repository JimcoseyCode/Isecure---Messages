package L7;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class S implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f7305a;

    public S(Collection packageFragments) {
        AbstractC2855l.g(packageFragments, "packageFragments");
        this.f7305a = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k8.c f(N it) {
        AbstractC2855l.g(it, "it");
        return it.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(k8.c cVar, k8.c it) {
        AbstractC2855l.g(it, "it");
        return !it.d() && AbstractC2855l.b(it.e(), cVar);
    }

    @Override // L7.U
    public boolean a(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        Collection collection = this.f7305a;
        if (collection != null && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC2855l.b(((N) it.next()).d(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // L7.U
    public void b(k8.c fqName, Collection packageFragments) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(packageFragments, "packageFragments");
        for (Object obj : this.f7305a) {
            if (AbstractC2855l.b(((N) obj).d(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // L7.O
    public List c(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        Collection collection = this.f7305a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC2855l.b(((N) obj).d(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // L7.O
    public Collection p(k8.c fqName, Function1 nameFilter) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return O8.l.S(O8.l.y(O8.l.J(AbstractC2800q.V(this.f7305a), P.f7303g), new Q(fqName)));
    }
}
