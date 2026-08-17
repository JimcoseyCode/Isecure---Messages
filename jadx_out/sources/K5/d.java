package K5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f7062b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7063a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f7062b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f7062b;
                if (dVar == null) {
                    dVar = new d();
                    f7062b = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f7063a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f7063a);
        }
        return setUnmodifiableSet;
    }
}
