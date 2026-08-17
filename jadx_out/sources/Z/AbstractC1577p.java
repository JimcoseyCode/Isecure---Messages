package Z;

/* JADX INFO: renamed from: Z.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1577p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC1577p f13460a = new C1566e(AbstractC1582v.f13489g, 0);

    /* JADX INFO: renamed from: Z.p$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class b extends AbstractC1577p {
        b() {
            super();
        }

        abstract AbstractC1582v b();

        abstract int c();
    }

    public static AbstractC1577p a(AbstractC1582v abstractC1582v) {
        return new C1566e(abstractC1582v, 1);
    }

    private AbstractC1577p() {
    }
}
