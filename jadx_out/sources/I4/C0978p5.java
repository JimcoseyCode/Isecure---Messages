package I4;

import v5.c;

/* JADX INFO: renamed from: I4.p5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0978p5 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C0978p5 f4844a = new C0978p5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f4846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f4847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f4848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f4849f;

    static {
        c.b bVarA = v5.c.a("xMin");
        J0 j02 = new J0();
        j02.a(1);
        f4845b = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("yMin");
        J0 j03 = new J0();
        j03.a(2);
        f4846c = bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("xMax");
        J0 j04 = new J0();
        j04.a(3);
        f4847d = bVarA3.b(j04.b()).a();
        c.b bVarA4 = v5.c.a("yMax");
        J0 j05 = new J0();
        j05.a(4);
        f4848e = bVarA4.b(j05.b()).a();
        c.b bVarA5 = v5.c.a("confidenceScore");
        J0 j06 = new J0();
        j06.a(5);
        f4849f = bVarA5.b(j06.b()).a();
    }

    private C0978p5() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        AbstractC1079y8 abstractC1079y8 = (AbstractC1079y8) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f4845b, abstractC1079y8.c());
        eVar.a(f4846c, abstractC1079y8.e());
        eVar.a(f4847d, abstractC1079y8.b());
        eVar.a(f4848e, abstractC1079y8.d());
        eVar.a(f4849f, abstractC1079y8.a());
    }
}
