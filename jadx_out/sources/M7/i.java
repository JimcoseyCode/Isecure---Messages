package M7;

import M7.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7573g;

    public i(List annotations) {
        AbstractC2855l.g(annotations, "annotations");
        this.f7573g = annotations;
    }

    @Override // M7.h
    public c b(k8.c cVar) {
        return h.b.a(this, cVar);
    }

    @Override // M7.h
    public boolean h(k8.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // M7.h
    public boolean isEmpty() {
        return this.f7573g.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f7573g.iterator();
    }

    public String toString() {
        return this.f7573g.toString();
    }
}
