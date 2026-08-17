package n7;

import kotlin.jvm.internal.AbstractC2855l;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface g extends j.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f30066e = b.f30067g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static j.b a(g gVar, j.c key) {
            j.b bVarB;
            AbstractC2855l.g(key, "key");
            if (!(key instanceof AbstractC2982b)) {
                if (g.f30066e != key) {
                    return null;
                }
                AbstractC2855l.e(gVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return gVar;
            }
            AbstractC2982b abstractC2982b = (AbstractC2982b) key;
            if (!abstractC2982b.a(gVar.getKey()) || (bVarB = abstractC2982b.b(gVar)) == null) {
                return null;
            }
            return bVarB;
        }

        public static j b(g gVar, j.c key) {
            AbstractC2855l.g(key, "key");
            if (!(key instanceof AbstractC2982b)) {
                return g.f30066e == key ? k.f30068g : gVar;
            }
            AbstractC2982b abstractC2982b = (AbstractC2982b) key;
            return (!abstractC2982b.a(gVar.getKey()) || abstractC2982b.b(gVar) == null) ? gVar : k.f30068g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements j.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ b f30067g = new b();

        private b() {
        }
    }

    void A0(f fVar);

    f w0(f fVar);
}
