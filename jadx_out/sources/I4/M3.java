package I4;

import expo.modules.notifications.service.NotificationsService;
import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class M3 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final M3 f4233a = new M3();

    static {
        c.b bVarA = v5.c.a("name");
        J0 j02 = new J0();
        j02.a(1);
        bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a(NotificationsService.EVENT_TYPE_KEY);
        J0 j03 = new J0();
        j03.a(2);
        bVarA2.b(j03.b()).a();
        c.b bVarA3 = v5.c.a("version");
        J0 j04 = new J0();
        j04.a(3);
        bVarA3.b(j04.b()).a();
        c.b bVarA4 = v5.c.a("featureLevel");
        J0 j05 = new J0();
        j05.a(4);
        bVarA4.b(j05.b()).a();
    }

    private M3() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
