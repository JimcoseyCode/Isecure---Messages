package M7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f7583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Function1 f7585i;

    public p(h delegate, boolean z10, Function1 fqNameFilter) {
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(fqNameFilter, "fqNameFilter");
        this.f7583g = delegate;
        this.f7584h = z10;
        this.f7585i = fqNameFilter;
    }

    private final boolean d(c cVar) {
        k8.c cVarD = cVar.d();
        return cVarD != null && ((Boolean) this.f7585i.invoke(cVarD)).booleanValue();
    }

    @Override // M7.h
    public c b(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        if (((Boolean) this.f7585i.invoke(fqName)).booleanValue()) {
            return this.f7583g.b(fqName);
        }
        return null;
    }

    @Override // M7.h
    public boolean h(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        if (((Boolean) this.f7585i.invoke(fqName)).booleanValue()) {
            return this.f7583g.h(fqName);
        }
        return false;
    }

    @Override // M7.h
    public boolean isEmpty() {
        boolean z10;
        h hVar = this.f7583g;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            z10 = false;
        } else {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                if (d((c) it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f7584h ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        h hVar = this.f7583g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            if (d((c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(h delegate, Function1 fqNameFilter) {
        this(delegate, false, fqNameFilter);
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(fqNameFilter, "fqNameFilter");
    }
}
