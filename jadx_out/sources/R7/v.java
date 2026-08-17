package R7;

import b8.InterfaceC1829m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends AbstractC1396h implements InterfaceC1829m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Enum f10103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k8.f fVar, Enum value) {
        super(fVar, null);
        AbstractC2855l.g(value, "value");
        this.f10103c = value;
    }

    @Override // b8.InterfaceC1829m
    public k8.b b() {
        Class<?> enclosingClass = this.f10103c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        AbstractC2855l.d(enclosingClass);
        return AbstractC1394f.e(enclosingClass);
    }

    @Override // b8.InterfaceC1829m
    public k8.f d() {
        return k8.f.q(this.f10103c.name());
    }
}
