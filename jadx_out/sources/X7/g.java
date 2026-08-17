package X7;

import I7.o;
import M7.h;
import b8.InterfaceC1817a;
import b8.InterfaceC1820d;
import j7.AbstractC2800q;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements M7.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f12533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1820d f12534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B8.h f12536j;

    public g(k c10, InterfaceC1820d annotationOwner, boolean z10) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(annotationOwner, "annotationOwner");
        this.f12533g = c10;
        this.f12534h = annotationOwner;
        this.f12535i = z10;
        this.f12536j = c10.a().u().i(new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M7.c o(g gVar, InterfaceC1817a annotation) {
        AbstractC2855l.g(annotation, "annotation");
        return V7.d.f11817a.e(annotation, gVar.f12533g, gVar.f12535i);
    }

    @Override // M7.h
    public M7.c b(k8.c fqName) {
        M7.c cVar;
        AbstractC2855l.g(fqName, "fqName");
        InterfaceC1817a interfaceC1817aB = this.f12534h.b(fqName);
        return (interfaceC1817aB == null || (cVar = (M7.c) this.f12536j.invoke(interfaceC1817aB)) == null) ? V7.d.f11817a.a(fqName, this.f12534h, this.f12533g) : cVar;
    }

    @Override // M7.h
    public boolean h(k8.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // M7.h
    public boolean isEmpty() {
        return this.f12534h.getAnnotations().isEmpty() && !this.f12534h.k();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return O8.l.A(O8.l.N(O8.l.J(AbstractC2800q.V(this.f12534h.getAnnotations()), this.f12536j), V7.d.f11817a.a(o.a.f5231y, this.f12534h, this.f12533g))).iterator();
    }

    public /* synthetic */ g(k kVar, InterfaceC1820d interfaceC1820d, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC1820d, (i10 & 4) != 0 ? false : z10);
    }
}
