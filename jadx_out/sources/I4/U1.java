package I4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class U1 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final U1 f4602a = new U1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f4604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f4605d;

    static {
        c.b bVarA = v5.c.a("logEventKey");
        J0 j02 = new J0();
        j02.a(1);
        f4603b = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("eventCount");
        J0 j03 = new J0();
        j03.a(2);
        f4604c = bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("inferenceDurationStats");
        J0 j04 = new J0();
        j04.a(3);
        f4605d = bVarA3.b(j04.b()).a();
    }

    private U1() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C0853e1 c0853e1 = (C0853e1) obj;
        v5.e eVar = (v5.e) obj2;
        eVar.a(f4603b, c0853e1.a());
        eVar.a(f4604c, c0853e1.c());
        eVar.a(f4605d, c0853e1.b());
    }
}
