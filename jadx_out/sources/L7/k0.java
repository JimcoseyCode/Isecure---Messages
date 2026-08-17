package L7;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface k0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7338a = new a();

        private a() {
        }

        @Override // L7.k0
        public Collection a(C8.v0 currentTypeConstructor, Collection superTypes, Function1 neighbors, Function1 reportLoop) {
            AbstractC2855l.g(currentTypeConstructor, "currentTypeConstructor");
            AbstractC2855l.g(superTypes, "superTypes");
            AbstractC2855l.g(neighbors, "neighbors");
            AbstractC2855l.g(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection a(C8.v0 v0Var, Collection collection, Function1 function1, Function1 function12);
}
