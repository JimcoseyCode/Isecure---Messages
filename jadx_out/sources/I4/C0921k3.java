package I4;

import v5.c;

/* JADX INFO: renamed from: I4.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0921k3 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C0921k3 f4794a = new C0921k3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f4796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f4797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f4798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f4799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f4800g;

    static {
        c.b bVarA = v5.c.a("maxMs");
        J0 j02 = new J0();
        j02.a(1);
        f4795b = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("minMs");
        J0 j03 = new J0();
        j03.a(2);
        f4796c = bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("avgMs");
        J0 j04 = new J0();
        j04.a(3);
        f4797d = bVarA3.b(j04.b()).a();
        c.b bVarA4 = v5.c.a("firstQuartileMs");
        J0 j05 = new J0();
        j05.a(4);
        f4798e = bVarA4.b(j05.b()).a();
        c.b bVarA5 = v5.c.a("medianMs");
        J0 j06 = new J0();
        j06.a(5);
        f4799f = bVarA5.b(j06.b()).a();
        c.b bVarA6 = v5.c.a("thirdQuartileMs");
        J0 j07 = new J0();
        j07.a(6);
        f4800g = bVarA6.b(j07.b()).a();
    }

    private C0921k3() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C0957n6 c0957n6 = (C0957n6) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f4795b, c0957n6.c());
        eVar.a(f4796c, c0957n6.e());
        eVar.a(f4797d, c0957n6.a());
        eVar.a(f4798e, c0957n6.b());
        eVar.a(f4799f, c0957n6.d());
        eVar.a(f4800g, c0957n6.f());
    }
}
