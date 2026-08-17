package I4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class P3 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final P3 f4553a = new P3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f4555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f4556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f4557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f4558f;

    static {
        c.b bVarA = v5.c.a("inferenceCommonLogEvent");
        J0 j02 = new J0();
        j02.a(1);
        f4554b = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("options");
        J0 j03 = new J0();
        j03.a(2);
        f4555c = bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("detectedBarcodeFormats");
        J0 j04 = new J0();
        j04.a(3);
        f4556d = bVarA3.b(j04.b()).a();
        c.b bVarA4 = v5.c.a("detectedBarcodeValueTypes");
        J0 j05 = new J0();
        j05.a(4);
        f4557e = bVarA4.b(j05.b()).a();
        c.b bVarA5 = v5.c.a("imageInfo");
        J0 j06 = new J0();
        j06.a(5);
        f4558f = bVarA5.b(j06.b()).a();
    }

    private P3() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C0826b7 c0826b7 = (C0826b7) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f4554b, c0826b7.d());
        eVar.a(f4555c, c0826b7.e());
        eVar.a(f4556d, c0826b7.a());
        eVar.a(f4557e, c0826b7.b());
        eVar.a(f4558f, c0826b7.c());
    }
}
