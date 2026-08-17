package I4;

import v5.c;

/* JADX INFO: renamed from: I4.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1030u3 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1030u3 f4899a = new C1030u3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f4901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f4902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f4903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f4904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f4905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f4906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v5.c f4907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final v5.c f4908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final v5.c f4909k;

    static {
        c.b bVarA = v5.c.a("durationMs");
        J0 j02 = new J0();
        j02.a(1);
        f4900b = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("errorCode");
        J0 j03 = new J0();
        j03.a(2);
        f4901c = bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("isColdCall");
        J0 j04 = new J0();
        j04.a(3);
        f4902d = bVarA3.b(j04.b()).a();
        c.b bVarA4 = v5.c.a("autoManageModelOnBackground");
        J0 j05 = new J0();
        j05.a(4);
        f4903e = bVarA4.b(j05.b()).a();
        c.b bVarA5 = v5.c.a("autoManageModelOnLowMemory");
        J0 j06 = new J0();
        j06.a(5);
        f4904f = bVarA5.b(j06.b()).a();
        c.b bVarA6 = v5.c.a("isNnApiEnabled");
        J0 j07 = new J0();
        j07.a(6);
        f4905g = bVarA6.b(j07.b()).a();
        c.b bVarA7 = v5.c.a("eventsCount");
        J0 j08 = new J0();
        j08.a(7);
        f4906h = bVarA7.b(j08.b()).a();
        c.b bVarA8 = v5.c.a("otherErrors");
        J0 j09 = new J0();
        j09.a(8);
        f4907i = bVarA8.b(j09.b()).a();
        c.b bVarA9 = v5.c.a("remoteConfigValueForAcceleration");
        J0 j010 = new J0();
        j010.a(9);
        f4908j = bVarA9.b(j010.b()).a();
        c.b bVarA10 = v5.c.a("isAccelerated");
        J0 j011 = new J0();
        j011.a(10);
        f4909k = bVarA10.b(j011.b()).a();
    }

    private C1030u3() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A6 a62 = (A6) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f4900b, a62.e());
        eVar.a(f4901c, a62.a());
        eVar.a(f4902d, a62.d());
        eVar.a(f4903e, a62.b());
        eVar.a(f4904f, a62.c());
        eVar.a(f4905g, null);
        eVar.a(f4906h, null);
        eVar.a(f4907i, null);
        eVar.a(f4908j, null);
        eVar.a(f4909k, null);
    }
}
