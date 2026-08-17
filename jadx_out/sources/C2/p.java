package c2;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static RuntimeException a(Throwable th) throws Throwable {
        c((Throwable) k.g(th));
        throw new RuntimeException(th);
    }

    public static void b(Throwable th, Class cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void c(Throwable th) throws Throwable {
        b(th, Error.class);
        b(th, RuntimeException.class);
    }
}
