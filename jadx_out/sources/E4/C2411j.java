package e4;

/* JADX INFO: renamed from: e4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2411j implements Y3.b {

    /* JADX INFO: renamed from: e4.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C2411j f25882a = new C2411j();
    }

    public static C2411j a() {
        return a.f25882a;
    }

    public static AbstractC2406e c() {
        return (AbstractC2406e) Y3.d.c(AbstractC2407f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2406e get() {
        return c();
    }
}
