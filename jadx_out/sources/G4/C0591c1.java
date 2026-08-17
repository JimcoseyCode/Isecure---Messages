package G4;

import v5.c;

/* JADX INFO: renamed from: G4.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0591c1 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C0591c1 f2734a = new C0591c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f2735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f2736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f2737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f2738e;

    static {
        c.b bVarA = v5.c.a("supportedFormats");
        C0605e c0605e = new C0605e();
        c0605e.a(1);
        f2735b = bVarA.b(c0605e.b()).a();
        c.b bVarA2 = v5.c.a("durationMs");
        C0605e c0605e2 = new C0605e();
        c0605e2.a(2);
        f2736c = bVarA2.b(c0605e2.b()).a();
        c.b bVarA3 = v5.c.a("errorCode");
        C0605e c0605e3 = new C0605e();
        c0605e3.a(3);
        f2737d = bVarA3.b(c0605e3.b()).a();
        c.b bVarA4 = v5.c.a("allowManualInput");
        C0605e c0605e4 = new C0605e();
        c0605e4.a(4);
        f2738e = bVarA4.b(c0605e4.b()).a();
    }

    private C0591c1() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        H3 h32 = (H3) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f2735b, h32.c());
        eVar.a(f2736c, h32.d());
        eVar.a(f2737d, h32.a());
        eVar.a(f2738e, h32.b());
    }
}
