package J4;

import expo.modules.notifications.service.NotificationsService;
import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class U0 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final U0 f5893a = new U0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f5894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.c f5895c;

    static {
        c.b bVarA = v5.c.a(NotificationsService.EVENT_TYPE_KEY);
        C1127f c1127f = new C1127f();
        c1127f.a(1);
        f5894b = bVarA.b(c1127f.b()).a();
        c.b bVarA2 = v5.c.a("dims");
        C1127f c1127f2 = new C1127f();
        c1127f2.a(2);
        f5895c = bVarA2.b(c1127f2.b()).a();
    }

    private U0() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
