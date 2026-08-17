package U3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static d e(Object obj) {
        return new a(null, obj, e.DEFAULT, null);
    }

    public static d f(Object obj, f fVar) {
        return new a(null, obj, e.DEFAULT, fVar);
    }

    public static d g(Object obj) {
        return new a(null, obj, e.VERY_LOW, null);
    }

    public abstract Integer a();

    public abstract Object b();

    public abstract e c();

    public abstract f d();
}
