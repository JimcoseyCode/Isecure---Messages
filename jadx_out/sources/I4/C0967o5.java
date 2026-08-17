package I4;

import v5.c;

/* JADX INFO: renamed from: I4.o5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0967o5 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C0967o5 f4833a = new C0967o5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f4835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f4836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f4837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f4838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f4839g;

    static {
        c.b bVarA = v5.c.a("appName");
        J0 j02 = new J0();
        j02.a(1);
        f4834b = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("sessionId");
        J0 j03 = new J0();
        j03.a(2);
        f4835c = bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("startZoomLevel");
        J0 j04 = new J0();
        j04.a(3);
        f4836d = bVarA3.b(j04.b()).a();
        c.b bVarA4 = v5.c.a("endZoomLevel");
        J0 j05 = new J0();
        j05.a(4);
        f4837e = bVarA4.b(j05.b()).a();
        c.b bVarA5 = v5.c.a("durationMs");
        J0 j06 = new J0();
        j06.a(5);
        f4838f = bVarA5.b(j06.b()).a();
        c.b bVarA6 = v5.c.a("predictedArea");
        J0 j07 = new J0();
        j07.a(6);
        f4839g = bVarA6.b(j07.b()).a();
    }

    private C0967o5() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        AbstractC1090z8 abstractC1090z8 = (AbstractC1090z8) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f4834b, abstractC1090z8.e());
        eVar.a(f4835c, abstractC1090z8.f());
        eVar.a(f4836d, abstractC1090z8.c());
        eVar.a(f4837e, abstractC1090z8.b());
        eVar.a(f4838f, abstractC1090z8.d());
        eVar.a(f4839g, abstractC1090z8.a());
    }
}
