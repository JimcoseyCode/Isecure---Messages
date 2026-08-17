package R8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V0 f10160a = new V0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f10161b = W8.M.a(new W8.E("ThreadLocalEventLoop"));

    private V0() {
    }

    public final AbstractC1416j0 a() {
        return (AbstractC1416j0) f10161b.get();
    }

    public final AbstractC1416j0 b() {
        ThreadLocal threadLocal = f10161b;
        AbstractC1416j0 abstractC1416j0 = (AbstractC1416j0) threadLocal.get();
        if (abstractC1416j0 != null) {
            return abstractC1416j0;
        }
        AbstractC1416j0 abstractC1416j0A = AbstractC1422m0.a();
        threadLocal.set(abstractC1416j0A);
        return abstractC1416j0A;
    }

    public final void c() {
        f10161b.set(null);
    }

    public final void d(AbstractC1416j0 abstractC1416j0) {
        f10161b.set(abstractC1416j0);
    }
}
