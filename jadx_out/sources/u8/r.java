package U8;

import W8.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f11612a = new E("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f11613b = new E("PENDING");

    public static final l a(Object obj) {
        if (obj == null) {
            obj = V8.m.f11867a;
        }
        return new q(obj);
    }

    public static final b d(p pVar, n7.j jVar, int i10, T8.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != T8.a.f10647h) ? o.a(pVar, jVar, i10, aVar) : pVar;
    }
}
