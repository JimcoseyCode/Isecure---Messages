package J4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1 f5442a = new C1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f5443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f5444c;

    static {
        c.b bVarA = v5.c.a("deviceInfos");
        C1127f c1127f = new C1127f();
        c1127f.a(1);
        f5443b = bVarA.b(c1127f.b()).a();
        c.b bVarA2 = v5.c.a("errorInfo");
        C1127f c1127f2 = new C1127f();
        c1127f2.a(2);
        f5444c = bVarA2.b(c1127f2.b()).a();
    }

    private C1() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
