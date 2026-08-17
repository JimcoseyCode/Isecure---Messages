package y8;

import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends O7.H {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final B8.n f34139m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k8.c fqName, B8.n storageManager, L7.H module) {
        super(module, fqName);
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(module, "module");
        this.f34139m = storageManager;
    }

    public abstract InterfaceC3648j C0();

    public boolean H0(k8.f name) {
        AbstractC2855l.g(name, "name");
        InterfaceC3442k interfaceC3442kO = o();
        return (interfaceC3442kO instanceof A8.w) && ((A8.w) interfaceC3442kO).t().contains(name);
    }

    public abstract void I0(C3652n c3652n);
}
