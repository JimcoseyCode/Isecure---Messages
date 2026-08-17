package c8;

import M7.h;
import j7.AbstractC2800q;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1903f implements M7.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8.c f18968g;

    public C1903f(k8.c fqNameToMatch) {
        AbstractC2855l.g(fqNameToMatch, "fqNameToMatch");
        this.f18968g = fqNameToMatch;
    }

    @Override // M7.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1901e b(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        if (AbstractC2855l.b(fqName, this.f18968g)) {
            return C1901e.f18966a;
        }
        return null;
    }

    @Override // M7.h
    public boolean h(k8.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // M7.h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC2800q.j().iterator();
    }
}
