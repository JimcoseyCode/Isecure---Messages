package R8;

import kotlin.jvm.functions.Function2;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class c1 implements j.b, j.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c1 f10173g = new c1();

    private c1() {
    }

    @Override // n7.j
    public n7.j X(n7.j jVar) {
        return j.b.a.d(this, jVar);
    }

    @Override // n7.j.b, n7.j
    public j.b e(j.c cVar) {
        return j.b.a.b(this, cVar);
    }

    @Override // n7.j
    public Object u0(Object obj, Function2 function2) {
        return j.b.a.a(this, obj, function2);
    }

    @Override // n7.j
    public n7.j y0(j.c cVar) {
        return j.b.a.c(this, cVar);
    }

    @Override // n7.j.b
    public j.c getKey() {
        return this;
    }
}
