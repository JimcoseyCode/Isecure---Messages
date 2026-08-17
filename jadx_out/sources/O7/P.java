package O7;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import v8.AbstractC3434c;
import v8.AbstractC3443l;
import v8.C3435d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class P extends AbstractC3443l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L7.H f8407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8.c f8408c;

    public P(L7.H moduleDescriptor, k8.c fqName) {
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        AbstractC2855l.g(fqName, "fqName");
        this.f8407b = moduleDescriptor;
        this.f8408c = fqName;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set e() {
        return j7.T.e();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        if (!kindFilter.a(C3435d.f32955c.f())) {
            return AbstractC2800q.j();
        }
        if (this.f8408c.d() && kindFilter.l().contains(AbstractC3434c.b.f32954a)) {
            return AbstractC2800q.j();
        }
        Collection collectionP = this.f8407b.p(this.f8408c, nameFilter);
        ArrayList arrayList = new ArrayList(collectionP.size());
        Iterator it = collectionP.iterator();
        while (it.hasNext()) {
            k8.f fVarG = ((k8.c) it.next()).g();
            AbstractC2855l.f(fVarG, "shortName(...)");
            if (((Boolean) nameFilter.invoke(fVarG)).booleanValue()) {
                M8.a.a(arrayList, h(fVarG));
            }
        }
        return arrayList;
    }

    protected final L7.V h(k8.f name) {
        AbstractC2855l.g(name, "name");
        if (name.r()) {
            return null;
        }
        L7.H h10 = this.f8407b;
        k8.c cVarC = this.f8408c.c(name);
        AbstractC2855l.f(cVarC, "child(...)");
        L7.V vE0 = h10.e0(cVarC);
        if (vE0.isEmpty()) {
            return null;
        }
        return vE0;
    }

    public String toString() {
        return "subpackages of " + this.f8408c + " from " + this.f8407b;
    }
}
