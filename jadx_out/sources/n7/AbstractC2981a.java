package n7;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.j;

/* JADX INFO: renamed from: n7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2981a implements j.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j.c f30057g;

    public AbstractC2981a(j.c key) {
        AbstractC2855l.g(key, "key");
        this.f30057g = key;
    }

    @Override // n7.j
    public j X(j jVar) {
        return j.b.a.d(this, jVar);
    }

    @Override // n7.j.b, n7.j
    public j.b e(j.c cVar) {
        return j.b.a.b(this, cVar);
    }

    @Override // n7.j.b
    public j.c getKey() {
        return this.f30057g;
    }

    @Override // n7.j
    public Object u0(Object obj, Function2 function2) {
        return j.b.a.a(this, obj, function2);
    }

    @Override // n7.j
    public j y0(j.c cVar) {
        return j.b.a.c(this, cVar);
    }
}
