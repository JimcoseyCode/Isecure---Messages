package A8;

import M7.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: A8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C0381a implements M7.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f132h = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C0381a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B8.i f133g;

    public C0381a(B8.n storageManager, InterfaceC3487a compute) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(compute, "compute");
        this.f133g = storageManager.e(compute);
    }

    private final List d() {
        return (List) B8.m.a(this.f133g, this, f132h[0]);
    }

    @Override // M7.h
    public M7.c b(k8.c cVar) {
        return h.b.a(this, cVar);
    }

    @Override // M7.h
    public boolean h(k8.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // M7.h
    public boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return d().iterator();
    }
}
