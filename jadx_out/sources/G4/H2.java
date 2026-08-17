package G4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class H2 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final H2 f2307a = new H2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f2308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f2309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.c f2310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.c f2311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v5.c f2312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f2313g;

    static {
        c.b bVarA = v5.c.a("detectorMode");
        C0605e c0605e = new C0605e();
        c0605e.a(1);
        f2308b = bVarA.b(c0605e.b()).a();
        c.b bVarA2 = v5.c.a("multipleObjectsEnabled");
        C0605e c0605e2 = new C0605e();
        c0605e2.a(2);
        f2309c = bVarA2.b(c0605e2.b()).a();
        c.b bVarA3 = v5.c.a("classificationEnabled");
        C0605e c0605e3 = new C0605e();
        c0605e3.a(3);
        f2310d = bVarA3.b(c0605e3.b()).a();
        c.b bVarA4 = v5.c.a("maxPerObjectLabelCount");
        C0605e c0605e4 = new C0605e();
        c0605e4.a(4);
        f2311e = bVarA4.b(c0605e4.b()).a();
        c.b bVarA5 = v5.c.a("classificationConfidenceThreshold");
        C0605e c0605e5 = new C0605e();
        c0605e5.a(5);
        f2312f = bVarA5.b(c0605e5.b()).a();
        c.b bVarA6 = v5.c.a("customLocalModelOptions");
        C0605e c0605e6 = new C0605e();
        c0605e6.a(6);
        f2313g = bVarA6.b(c0605e6.b()).a();
    }

    private H2() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
