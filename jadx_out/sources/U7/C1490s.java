package U7;

import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.Z;
import Y7.AbstractC1540d;
import kotlin.jvm.internal.AbstractC2855l;
import o8.InterfaceC3028j;

/* JADX INFO: renamed from: U7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1490s implements InterfaceC3028j {
    @Override // o8.InterfaceC3028j
    public InterfaceC3028j.a a() {
        return InterfaceC3028j.a.BOTH;
    }

    @Override // o8.InterfaceC3028j
    public InterfaceC3028j.b b(InterfaceC1276a superDescriptor, InterfaceC1276a subDescriptor, InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(superDescriptor, "superDescriptor");
        AbstractC2855l.g(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof Z) || !(superDescriptor instanceof Z)) {
            return InterfaceC3028j.b.UNKNOWN;
        }
        Z z10 = (Z) subDescriptor;
        Z z11 = (Z) superDescriptor;
        return !AbstractC2855l.b(z10.getName(), z11.getName()) ? InterfaceC3028j.b.UNKNOWN : (AbstractC1540d.a(z10) && AbstractC1540d.a(z11)) ? InterfaceC3028j.b.OVERRIDABLE : (AbstractC1540d.a(z10) || AbstractC1540d.a(z11)) ? InterfaceC3028j.b.INCOMPATIBLE : InterfaceC3028j.b.UNKNOWN;
    }
}
