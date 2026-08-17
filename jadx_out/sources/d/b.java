package D;

import kotlin.jvm.internal.AbstractC2855l;
import y.J0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final B.b f724a;

        public a(B.b resolvedFeatureGroup) {
            AbstractC2855l.g(resolvedFeatureGroup, "resolvedFeatureGroup");
            this.f724a = resolvedFeatureGroup;
        }

        public final B.b a() {
            return this.f724a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC2855l.b(this.f724a, ((a) obj).f724a);
        }

        public int hashCode() {
            return this.f724a.hashCode();
        }

        public String toString() {
            return "Supported(resolvedFeatureGroup=" + this.f724a + ')';
        }
    }

    /* JADX INFO: renamed from: D.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0028b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0028b f725a = new C0028b();

        private C0028b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final J0 f726a;

        public c(J0 unsupportedUseCase) {
            AbstractC2855l.g(unsupportedUseCase, "unsupportedUseCase");
            this.f726a = unsupportedUseCase;
        }

        public final J0 a() {
            return this.f726a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC2855l.b(this.f726a, ((c) obj).f726a);
        }

        public int hashCode() {
            return this.f726a.hashCode();
        }

        public String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.f726a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final A.b f728b;

        public d(String requiredUseCases, A.b featureRequiring) {
            AbstractC2855l.g(requiredUseCases, "requiredUseCases");
            AbstractC2855l.g(featureRequiring, "featureRequiring");
            this.f727a = requiredUseCases;
            this.f728b = featureRequiring;
        }

        public final A.b a() {
            return this.f728b;
        }

        public final String b() {
            return this.f727a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC2855l.b(this.f727a, dVar.f727a) && AbstractC2855l.b(this.f728b, dVar.f728b);
        }

        public int hashCode() {
            return (this.f727a.hashCode() * 31) + this.f728b.hashCode();
        }

        public String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.f727a + ", featureRequiring=" + this.f728b + ')';
        }
    }
}
