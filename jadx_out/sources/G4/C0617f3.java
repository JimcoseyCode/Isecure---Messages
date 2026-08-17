package G4;

import v5.c;

/* JADX INFO: renamed from: G4.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0617f3 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C0617f3 f2797a = new C0617f3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f2798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f2799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f2800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f2801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f2802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f2803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f2804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v5.c f2805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final v5.c f2806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final v5.c f2807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final v5.c f2808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final v5.c f2809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final v5.c f2810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final v5.c f2811o;

    static {
        c.b bVarA = v5.c.a("appId");
        C0605e c0605e = new C0605e();
        c0605e.a(1);
        f2798b = bVarA.b(c0605e.b()).a();
        c.b bVarA2 = v5.c.a("appVersion");
        C0605e c0605e2 = new C0605e();
        c0605e2.a(2);
        f2799c = bVarA2.b(c0605e2.b()).a();
        c.b bVarA3 = v5.c.a("firebaseProjectId");
        C0605e c0605e3 = new C0605e();
        c0605e3.a(3);
        f2800d = bVarA3.b(c0605e3.b()).a();
        c.b bVarA4 = v5.c.a("mlSdkVersion");
        C0605e c0605e4 = new C0605e();
        c0605e4.a(4);
        f2801e = bVarA4.b(c0605e4.b()).a();
        c.b bVarA5 = v5.c.a("tfliteSchemaVersion");
        C0605e c0605e5 = new C0605e();
        c0605e5.a(5);
        f2802f = bVarA5.b(c0605e5.b()).a();
        c.b bVarA6 = v5.c.a("gcmSenderId");
        C0605e c0605e6 = new C0605e();
        c0605e6.a(6);
        f2803g = bVarA6.b(c0605e6.b()).a();
        c.b bVarA7 = v5.c.a("apiKey");
        C0605e c0605e7 = new C0605e();
        c0605e7.a(7);
        f2804h = bVarA7.b(c0605e7.b()).a();
        c.b bVarA8 = v5.c.a("languages");
        C0605e c0605e8 = new C0605e();
        c0605e8.a(8);
        f2805i = bVarA8.b(c0605e8.b()).a();
        c.b bVarA9 = v5.c.a("mlSdkInstanceId");
        C0605e c0605e9 = new C0605e();
        c0605e9.a(9);
        f2806j = bVarA9.b(c0605e9.b()).a();
        c.b bVarA10 = v5.c.a("isClearcutClient");
        C0605e c0605e10 = new C0605e();
        c0605e10.a(10);
        f2807k = bVarA10.b(c0605e10.b()).a();
        c.b bVarA11 = v5.c.a("isStandaloneMlkit");
        C0605e c0605e11 = new C0605e();
        c0605e11.a(11);
        f2808l = bVarA11.b(c0605e11.b()).a();
        c.b bVarA12 = v5.c.a("isJsonLogging");
        C0605e c0605e12 = new C0605e();
        c0605e12.a(12);
        f2809m = bVarA12.b(c0605e12.b()).a();
        c.b bVarA13 = v5.c.a("buildLevel");
        C0605e c0605e13 = new C0605e();
        c0605e13.a(13);
        f2810n = bVarA13.b(c0605e13.b()).a();
        c.b bVarA14 = v5.c.a("optionalModuleVersion");
        C0605e c0605e14 = new C0605e();
        c0605e14.a(14);
        f2811o = bVarA14.b(c0605e14.b()).a();
    }

    private C0617f3() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        G5 g52 = (G5) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f2798b, g52.g());
        eVar.a(f2799c, g52.h());
        eVar.a(f2800d, null);
        eVar.a(f2801e, g52.j());
        eVar.a(f2802f, g52.k());
        eVar.a(f2803g, null);
        eVar.a(f2804h, null);
        eVar.a(f2805i, g52.a());
        eVar.a(f2806j, g52.i());
        eVar.a(f2807k, g52.b());
        eVar.a(f2808l, g52.d());
        eVar.a(f2809m, g52.c());
        eVar.a(f2810n, g52.e());
        eVar.a(f2811o, g52.f());
    }
}
