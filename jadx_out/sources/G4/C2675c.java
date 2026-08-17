package g4;

/* JADX INFO: renamed from: g4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2675c implements Y3.b {

    /* JADX INFO: renamed from: g4.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C2675c f28216a = new C2675c();
    }

    public static C2675c a() {
        return a.f28216a;
    }

    public static InterfaceC2673a b() {
        return (InterfaceC2673a) Y3.d.c(AbstractC2674b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC2673a get() {
        return b();
    }
}
