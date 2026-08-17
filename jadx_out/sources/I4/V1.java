package I4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class V1 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final V1 f4612a = new V1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f4614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f4615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f4616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f4617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f4618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f4619h;

    static {
        c.b bVarA = v5.c.a("errorCode");
        J0 j02 = new J0();
        j02.a(1);
        f4613b = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("hasResult");
        J0 j03 = new J0();
        j03.a(2);
        f4614c = bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("isColdCall");
        J0 j04 = new J0();
        j04.a(3);
        f4615d = bVarA3.b(j04.b()).a();
        c.b bVarA4 = v5.c.a("imageInfo");
        J0 j05 = new J0();
        j05.a(4);
        f4616e = bVarA4.b(j05.b()).a();
        c.b bVarA5 = v5.c.a("options");
        J0 j06 = new J0();
        j06.a(5);
        f4617f = bVarA5.b(j06.b()).a();
        c.b bVarA6 = v5.c.a("detectedBarcodeFormats");
        J0 j07 = new J0();
        j07.a(6);
        f4618g = bVarA6.b(j07.b()).a();
        c.b bVarA7 = v5.c.a("detectedBarcodeValueTypes");
        J0 j08 = new J0();
        j08.a(7);
        f4619h = bVarA7.b(j08.b()).a();
    }

    private V1() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C0831c1 c0831c1 = (C0831c1) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f4613b, c0831c1.c());
        eVar.a(f4614c, null);
        eVar.a(f4615d, c0831c1.e());
        eVar.a(f4616e, null);
        eVar.a(f4617f, c0831c1.d());
        eVar.a(f4618g, c0831c1.a());
        eVar.a(f4619h, c0831c1.b());
    }
}
