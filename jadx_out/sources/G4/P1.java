package G4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class P1 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final P1 f2537a = new P1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f2538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f2539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f2540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f2541e;

    static {
        c.b bVarA = v5.c.a("isChargingRequired");
        C0605e c0605e = new C0605e();
        c0605e.a(1);
        f2538b = bVarA.b(c0605e.b()).a();
        c.b bVarA2 = v5.c.a("isWifiRequired");
        C0605e c0605e2 = new C0605e();
        c0605e2.a(2);
        f2539c = bVarA2.b(c0605e2.b()).a();
        c.b bVarA3 = v5.c.a("isDeviceIdleRequired");
        C0605e c0605e3 = new C0605e();
        c0605e3.a(3);
        f2540d = bVarA3.b(c0605e3.b()).a();
        c.b bVarA4 = v5.c.a("canDownloadInBackground");
        C0605e c0605e4 = new C0605e();
        c0605e4.a(4);
        f2541e = bVarA4.b(c0605e4.b()).a();
    }

    private P1() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
