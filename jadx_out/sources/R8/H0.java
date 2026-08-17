package R8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W8.E f10132a = new W8.E("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W8.E f10133b = new W8.E("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final W8.E f10134c = new W8.E("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final W8.E f10135d = new W8.E("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final W8.E f10136e = new W8.E("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1414i0 f10137f = new C1414i0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1414i0 f10138g = new C1414i0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC1439v0 ? new C1441w0((InterfaceC1439v0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC1439v0 interfaceC1439v0;
        C1441w0 c1441w0 = obj instanceof C1441w0 ? (C1441w0) obj : null;
        return (c1441w0 == null || (interfaceC1439v0 = c1441w0.f10222a) == null) ? obj : interfaceC1439v0;
    }
}
