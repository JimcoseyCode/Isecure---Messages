package E8;

import L7.G;
import L7.H;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.V;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import j7.T;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements H {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f1133g = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k8.f f1134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f1135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List f1136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f1137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Lazy f1138l;

    static {
        k8.f fVarT = k8.f.t(b.f1124k.j());
        AbstractC2855l.f(fVarT, "special(...)");
        f1134h = fVarT;
        f1135i = AbstractC2800q.j();
        f1136j = AbstractC2800q.j();
        f1137k = T.e();
        f1138l = AbstractC2746i.b(d.f1132g);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I7.g L() {
        return I7.g.f5059h.a();
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o visitor, Object obj) {
        AbstractC2855l.g(visitor, "visitor");
        return null;
    }

    @Override // L7.InterfaceC1288m
    public InterfaceC1288m b() {
        return null;
    }

    @Override // L7.H
    public V e0(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        return M7.h.f7570a.b();
    }

    @Override // L7.J
    public k8.f getName() {
        return x0();
    }

    @Override // L7.H
    public I7.i n() {
        return (I7.i) f1138l.getValue();
    }

    @Override // L7.H
    public Collection p(k8.c fqName, Function1 nameFilter) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return AbstractC2800q.j();
    }

    @Override // L7.H
    public List p0() {
        return f1136j;
    }

    @Override // L7.H
    public Object s0(G capability) {
        AbstractC2855l.g(capability, "capability");
        return null;
    }

    @Override // L7.H
    public boolean w(H targetModule) {
        AbstractC2855l.g(targetModule, "targetModule");
        return false;
    }

    public k8.f x0() {
        return f1134h;
    }

    @Override // L7.InterfaceC1288m
    public InterfaceC1288m a() {
        return this;
    }
}
