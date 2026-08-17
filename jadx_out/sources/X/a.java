package X;

import X.e;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12213a;

    a(List list) {
        this.f12213a = list;
    }

    @Override // X.e
    public e.a a(SessionConfiguration sessionConfiguration) {
        Iterator it = this.f12213a.iterator();
        while (it.hasNext()) {
            e.a aVarA = ((e) it.next()).a(sessionConfiguration);
            if (aVarA.a() != 0) {
                return aVarA;
            }
        }
        return new e.a(0, 0, 0L);
    }
}
