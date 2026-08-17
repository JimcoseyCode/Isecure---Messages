package J4;

import v5.c;

/* JADX INFO: renamed from: J4.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1199p1 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1199p1 f6236a = new C1199p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f6237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f6238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f6239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f6240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f6241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f6242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f6243h;

    static {
        c.b bVarA = v5.c.a("durationMs");
        C1127f c1127f = new C1127f();
        c1127f.a(1);
        f6237b = bVarA.b(c1127f.b()).a();
        c.b bVarA2 = v5.c.a("imageSource");
        C1127f c1127f2 = new C1127f();
        c1127f2.a(2);
        f6238c = bVarA2.b(c1127f2.b()).a();
        c.b bVarA3 = v5.c.a("imageFormat");
        C1127f c1127f3 = new C1127f();
        c1127f3.a(3);
        f6239d = bVarA3.b(c1127f3.b()).a();
        c.b bVarA4 = v5.c.a("imageByteSize");
        C1127f c1127f4 = new C1127f();
        c1127f4.a(4);
        f6240e = bVarA4.b(c1127f4.b()).a();
        c.b bVarA5 = v5.c.a("imageWidth");
        C1127f c1127f5 = new C1127f();
        c1127f5.a(5);
        f6241f = bVarA5.b(c1127f5.b()).a();
        c.b bVarA6 = v5.c.a("imageHeight");
        C1127f c1127f6 = new C1127f();
        c1127f6.a(6);
        f6242g = bVarA6.b(c1127f6.b()).a();
        c.b bVarA7 = v5.c.a("rotationDegrees");
        C1127f c1127f7 = new C1127f();
        c1127f7.a(7);
        f6243h = bVarA7.b(c1127f7.b()).a();
    }

    private C1199p1() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A3 a32 = (A3) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f6237b, a32.g());
        eVar.a(f6238c, a32.b());
        eVar.a(f6239d, a32.a());
        eVar.a(f6240e, a32.c());
        eVar.a(f6241f, a32.e());
        eVar.a(f6242g, a32.d());
        eVar.a(f6243h, a32.f());
    }
}
