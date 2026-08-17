package R1;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f9954a = new C0103a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements d {
        b() {
        }

        @Override // R1.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements g {
        c() {
        }

        @Override // R1.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        Object create();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class e implements H0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f9955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f9956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final H0.e f9957c;

        e(H0.e eVar, d dVar, g gVar) {
            this.f9957c = eVar;
            this.f9955a = dVar;
            this.f9956b = gVar;
        }

        @Override // H0.e
        public Object acquire() {
            Object objAcquire = this.f9957c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f9955a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    objAcquire.getClass().toString();
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).m().b(false);
            }
            return objAcquire;
        }

        @Override // H0.e
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).m().b(true);
            }
            this.f9956b.a(obj);
            return this.f9957c.release(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface f {
        R1.c m();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface g {
        void a(Object obj);
    }

    private static H0.e a(H0.e eVar, d dVar) {
        return b(eVar, dVar, c());
    }

    private static H0.e b(H0.e eVar, d dVar, g gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static g c() {
        return f9954a;
    }

    public static H0.e d(int i10, d dVar) {
        return a(new H0.f(i10), dVar);
    }

    public static H0.e e() {
        return f(20);
    }

    public static H0.e f(int i10) {
        return b(new H0.f(i10), new b(), new c());
    }

    /* JADX INFO: renamed from: R1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0103a implements g {
        C0103a() {
        }

        @Override // R1.a.g
        public void a(Object obj) {
        }
    }
}
