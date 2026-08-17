package v8;

import L7.InterfaceC1283h;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: v8.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3445n {

    /* JADX INFO: renamed from: v8.n$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static /* synthetic */ Collection a(InterfaceC3445n interfaceC3445n, C3435d c3435d, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                c3435d = C3435d.f32967o;
            }
            if ((i10 & 2) != 0) {
                function1 = InterfaceC3442k.f32993a.c();
            }
            return interfaceC3445n.g(c3435d, function1);
        }
    }

    InterfaceC1283h f(k8.f fVar, T7.b bVar);

    Collection g(C3435d c3435d, Function1 function1);
}
