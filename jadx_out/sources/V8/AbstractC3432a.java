package v8;

import L7.InterfaceC1283h;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: v8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3432a implements InterfaceC3442k {
    @Override // v8.InterfaceC3442k
    public Set a() {
        return i().a();
    }

    @Override // v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return i().b(name, location);
    }

    @Override // v8.InterfaceC3442k
    public Set c() {
        return i().c();
    }

    @Override // v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return i().d(name, location);
    }

    @Override // v8.InterfaceC3442k
    public Set e() {
        return i().e();
    }

    @Override // v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return i().f(name, location);
    }

    @Override // v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return i().g(kindFilter, nameFilter);
    }

    public final InterfaceC3442k h() {
        if (!(i() instanceof AbstractC3432a)) {
            return i();
        }
        InterfaceC3442k interfaceC3442kI = i();
        AbstractC2855l.e(interfaceC3442kI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC3432a) interfaceC3442kI).h();
    }

    protected abstract InterfaceC3442k i();
}
