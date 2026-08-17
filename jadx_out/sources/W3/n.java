package W3;

import W3.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public abstract n a();

        abstract a b(U3.c cVar);

        abstract a c(U3.d dVar);

        abstract a d(U3.g gVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract U3.c b();

    abstract U3.d c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    abstract U3.g e();

    public abstract o f();

    public abstract String g();
}
