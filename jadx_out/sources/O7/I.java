package O7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8356a = a.f8357a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f8357a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final L7.G f8358b = new L7.G("PackageViewDescriptorFactory");

        private a() {
        }

        public final L7.G a() {
            return f8358b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f8359b = new b();

        private b() {
        }

        @Override // O7.I
        public L7.V a(F module, k8.c fqName, B8.n storageManager) {
            AbstractC2855l.g(module, "module");
            AbstractC2855l.g(fqName, "fqName");
            AbstractC2855l.g(storageManager, "storageManager");
            return new C1344x(module, fqName, storageManager);
        }
    }

    L7.V a(F f10, k8.c cVar, B8.n nVar);
}
