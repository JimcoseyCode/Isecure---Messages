package J4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C2 f5445a = new C2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f5446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f5447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f5448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f5449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f5450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f5451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f5452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v5.c f5453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final v5.c f5454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final v5.c f5455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final v5.c f5456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final v5.c f5457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final v5.c f5458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final v5.c f5459o;

    static {
        c.b bVarA = v5.c.a("appId");
        C1127f c1127f = new C1127f();
        c1127f.a(1);
        f5446b = bVarA.b(c1127f.b()).a();
        c.b bVarA2 = v5.c.a("appVersion");
        C1127f c1127f2 = new C1127f();
        c1127f2.a(2);
        f5447c = bVarA2.b(c1127f2.b()).a();
        c.b bVarA3 = v5.c.a("firebaseProjectId");
        C1127f c1127f3 = new C1127f();
        c1127f3.a(3);
        f5448d = bVarA3.b(c1127f3.b()).a();
        c.b bVarA4 = v5.c.a("mlSdkVersion");
        C1127f c1127f4 = new C1127f();
        c1127f4.a(4);
        f5449e = bVarA4.b(c1127f4.b()).a();
        c.b bVarA5 = v5.c.a("tfliteSchemaVersion");
        C1127f c1127f5 = new C1127f();
        c1127f5.a(5);
        f5450f = bVarA5.b(c1127f5.b()).a();
        c.b bVarA6 = v5.c.a("gcmSenderId");
        C1127f c1127f6 = new C1127f();
        c1127f6.a(6);
        f5451g = bVarA6.b(c1127f6.b()).a();
        c.b bVarA7 = v5.c.a("apiKey");
        C1127f c1127f7 = new C1127f();
        c1127f7.a(7);
        f5452h = bVarA7.b(c1127f7.b()).a();
        c.b bVarA8 = v5.c.a("languages");
        C1127f c1127f8 = new C1127f();
        c1127f8.a(8);
        f5453i = bVarA8.b(c1127f8.b()).a();
        c.b bVarA9 = v5.c.a("mlSdkInstanceId");
        C1127f c1127f9 = new C1127f();
        c1127f9.a(9);
        f5454j = bVarA9.b(c1127f9.b()).a();
        c.b bVarA10 = v5.c.a("isClearcutClient");
        C1127f c1127f10 = new C1127f();
        c1127f10.a(10);
        f5455k = bVarA10.b(c1127f10.b()).a();
        c.b bVarA11 = v5.c.a("isStandaloneMlkit");
        C1127f c1127f11 = new C1127f();
        c1127f11.a(11);
        f5456l = bVarA11.b(c1127f11.b()).a();
        c.b bVarA12 = v5.c.a("isJsonLogging");
        C1127f c1127f12 = new C1127f();
        c1127f12.a(12);
        f5457m = bVarA12.b(c1127f12.b()).a();
        c.b bVarA13 = v5.c.a("buildLevel");
        C1127f c1127f13 = new C1127f();
        c1127f13.a(13);
        f5458n = bVarA13.b(c1127f13.b()).a();
        c.b bVarA14 = v5.c.a("optionalModuleVersion");
        C1127f c1127f14 = new C1127f();
        c1127f14.a(14);
        f5459o = bVarA14.b(c1127f14.b()).a();
    }

    private C2() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        N4 n42 = (N4) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f5446b, n42.g());
        eVar.a(f5447c, n42.h());
        eVar.a(f5448d, null);
        eVar.a(f5449e, n42.j());
        eVar.a(f5450f, n42.k());
        eVar.a(f5451g, null);
        eVar.a(f5452h, null);
        eVar.a(f5453i, n42.a());
        eVar.a(f5454j, n42.i());
        eVar.a(f5455k, n42.b());
        eVar.a(f5456l, n42.d());
        eVar.a(f5457m, n42.c());
        eVar.a(f5458n, n42.e());
        eVar.a(f5459o, n42.f());
    }
}
