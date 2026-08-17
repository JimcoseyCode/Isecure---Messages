package q8;

import C8.AbstractC0407d0;
import C8.S;
import I7.o;
import L7.AbstractC1299y;
import L7.H;
import L7.InterfaceC1280e;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: q8.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3132B extends AbstractC3135E {
    public C3132B(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // q8.g
    public S a(H module) {
        AbstractC0407d0 abstractC0407d0R;
        AbstractC2855l.g(module, "module");
        InterfaceC1280e interfaceC1280eB = AbstractC1299y.b(module, o.a.f5153F0);
        return (interfaceC1280eB == null || (abstractC0407d0R = interfaceC1280eB.r()) == null) ? E8.l.d(E8.k.f1172D0, "UInt") : abstractC0407d0R;
    }

    @Override // q8.g
    public String toString() {
        return ((Number) b()).intValue() + ".toUInt()";
    }
}
