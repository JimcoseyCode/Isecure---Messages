package F;

import F.InterfaceC0490j0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface E extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1313a = InterfaceC0490j0.a.a("camerax.core.camera.useCaseConfigFactory", E1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1314b = InterfaceC0490j0.a.a("camerax.core.camera.compatibilityId", A0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1315c = InterfaceC0490j0.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1316d = InterfaceC0490j0.a.a("camerax.core.camera.SessionProcessor", m1.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1317e = InterfaceC0490j0.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1318f = InterfaceC0490j0.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1319g = InterfaceC0490j0.a.a("camerax.core.camera.PostviewFormatSelector", a.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1320h = InterfaceC0490j0.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f1321i = new a() { // from class: F.D
    };

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
    }

    default int D() {
        return ((Integer) f(f1315c, 0)).intValue();
    }

    default m1 R(m1 m1Var) {
        android.support.v4.media.session.b.a(f(f1316d, m1Var));
        return null;
    }

    A0 T();

    default boolean U() {
        return ((Boolean) f(f1320h, Boolean.FALSE)).booleanValue();
    }

    default E1 j() {
        return (E1) f(f1313a, E1.f1332a);
    }

    default boolean z() {
        return ((Boolean) f(f1318f, Boolean.FALSE)).booleanValue();
    }
}
