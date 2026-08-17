package L1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7209a = new ArrayList();

    /* JADX INFO: renamed from: L1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0066a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f7210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final v1.d f7211b;

        C0066a(Class cls, v1.d dVar) {
            this.f7210a = cls;
            this.f7211b = dVar;
        }

        boolean a(Class cls) {
            return this.f7210a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, v1.d dVar) {
        this.f7209a.add(new C0066a(cls, dVar));
    }

    public synchronized v1.d b(Class cls) {
        for (C0066a c0066a : this.f7209a) {
            if (c0066a.a(cls)) {
                return c0066a.f7211b;
            }
        }
        return null;
    }
}
