package M7;

import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7582g;

    public o(List delegates) {
        AbstractC2855l.g(delegates, "delegates");
        this.f7582g = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c p(k8.c cVar, h it) {
        AbstractC2855l.g(it, "it");
        return it.b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O8.i q(h it) {
        AbstractC2855l.g(it, "it");
        return AbstractC2800q.V(it);
    }

    @Override // M7.h
    public c b(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return (c) O8.l.C(O8.l.K(AbstractC2800q.V(this.f7582g), new m(fqName)));
    }

    @Override // M7.h
    public boolean h(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        Iterator it = AbstractC2800q.V(this.f7582g).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).h(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // M7.h
    public boolean isEmpty() {
        List list = this.f7582g;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return O8.l.D(AbstractC2800q.V(this.f7582g), n.f7581g).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h... delegates) {
        this(AbstractC2793j.v0(delegates));
        AbstractC2855l.g(delegates, "delegates");
    }
}
