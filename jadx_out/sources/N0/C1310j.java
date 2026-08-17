package N0;

import R8.N;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: N0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1310j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1310j f7749a = new C1310j();

    private C1310j() {
    }

    public final InterfaceC1309i a(E storage, O0.b bVar, List migrations, N scope) {
        AbstractC2855l.g(storage, "storage");
        AbstractC2855l.g(migrations, "migrations");
        AbstractC2855l.g(scope, "scope");
        InterfaceC1305e aVar = bVar;
        if (bVar == null) {
            aVar = new O0.a();
        }
        return new C1311k(storage, AbstractC2800q.e(AbstractC1308h.f7731a.b(migrations)), aVar, scope);
    }
}
