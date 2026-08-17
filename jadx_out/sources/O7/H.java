package O7;

import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.h0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H extends AbstractC1335n implements L7.N {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k8.c f8354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f8355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(L7.H module, k8.c fqName) {
        super(module, M7.h.f7570a.b(), fqName.h(), h0.f7335a);
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(fqName, "fqName");
        this.f8354k = fqName;
        this.f8355l = "package " + fqName + " of " + module;
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o visitor, Object obj) {
        AbstractC2855l.g(visitor, "visitor");
        return visitor.l(this, obj);
    }

    @Override // L7.N
    public final k8.c d() {
        return this.f8354k;
    }

    @Override // O7.AbstractC1335n, L7.InterfaceC1291p
    public h0 g() {
        h0 NO_SOURCE = h0.f7335a;
        AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // O7.AbstractC1334m
    public String toString() {
        return this.f8355l;
    }

    @Override // O7.AbstractC1335n, L7.InterfaceC1288m
    public L7.H b() {
        InterfaceC1288m interfaceC1288mB = super.b();
        AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (L7.H) interfaceC1288mB;
    }
}
