package F7;

import L7.InterfaceC1300z;
import O7.AbstractC1336o;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: F7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C0540j extends AbstractC1336o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0529d0 f2071a;

    public C0540j(AbstractC0529d0 container) {
        AbstractC2855l.g(container, "container");
        this.f2071a = container;
    }

    @Override // O7.AbstractC1336o, L7.InterfaceC1290o
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public A d(InterfaceC1300z descriptor, C2735B data) {
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(data, "data");
        return new C0539i0(this.f2071a, descriptor);
    }

    @Override // L7.InterfaceC1290o
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public A c(L7.Z descriptor, C2735B data) {
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(data, "data");
        int i10 = (descriptor.a0() != null ? 1 : 0) + (descriptor.h0() != null ? 1 : 0);
        if (descriptor.d0()) {
            if (i10 == 0) {
                return new C0543k0(this.f2071a, descriptor);
            }
            if (i10 == 1) {
                return new C0547m0(this.f2071a, descriptor);
            }
            if (i10 == 2) {
                return new C0551o0(this.f2071a, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new B0(this.f2071a, descriptor);
            }
            if (i10 == 1) {
                return new E0(this.f2071a, descriptor);
            }
            if (i10 == 2) {
                return new H0(this.f2071a, descriptor);
            }
        }
        throw new Y0("Unsupported property: " + descriptor);
    }
}
