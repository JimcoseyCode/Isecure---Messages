package E8;

import L7.InterfaceC1283h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import v8.C3435d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(formatParams, "formatParams");
    }

    @Override // E8.g, v8.InterfaceC3442k
    public Set a() {
        throw new IllegalStateException();
    }

    @Override // E8.g, v8.InterfaceC3442k
    public Set c() {
        throw new IllegalStateException();
    }

    @Override // E8.g, v8.InterfaceC3442k
    public Set e() {
        throw new IllegalStateException();
    }

    @Override // E8.g, v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // E8.g, v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // E8.g, v8.InterfaceC3442k
    /* JADX INFO: renamed from: h */
    public Set b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // E8.g, v8.InterfaceC3442k
    /* JADX INFO: renamed from: i */
    public Set d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // E8.g
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
