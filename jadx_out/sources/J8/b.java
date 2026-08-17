package J8;

import J8.g;
import L7.InterfaceC1300z;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public final g a(InterfaceC1300z functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(functionDescriptor)) {
                return hVar.a(functionDescriptor);
            }
        }
        return g.a.f6851b;
    }

    public abstract List b();
}
