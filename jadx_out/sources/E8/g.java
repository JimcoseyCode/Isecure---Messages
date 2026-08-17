package E8;

import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import j7.T;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import v8.C3435d;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class g implements InterfaceC3442k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f1140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1141c;

    public g(h kind, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(formatParams, "formatParams");
        this.f1140b = kind;
        String strJ = kind.j();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strJ, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC2855l.f(str, "format(...)");
        this.f1141c = str;
    }

    @Override // v8.InterfaceC3442k
    public Set a() {
        return T.e();
    }

    @Override // v8.InterfaceC3442k
    public Set c() {
        return T.e();
    }

    @Override // v8.InterfaceC3442k
    public Set e() {
        return T.e();
    }

    @Override // v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        String str = String.format(b.f1121h.j(), Arrays.copyOf(new Object[]{name}, 1));
        AbstractC2855l.f(str, "format(...)");
        k8.f fVarT = k8.f.t(str);
        AbstractC2855l.f(fVarT, "special(...)");
        return new a(fVarT);
    }

    @Override // v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return AbstractC2800q.j();
    }

    @Override // v8.InterfaceC3442k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return T.d(new c(l.f1253a.h()));
    }

    @Override // v8.InterfaceC3442k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return l.f1253a.j();
    }

    protected final String j() {
        return this.f1141c;
    }

    public String toString() {
        return "ErrorScope{" + this.f1141c + '}';
    }
}
