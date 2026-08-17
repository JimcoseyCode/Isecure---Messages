package R7;

import b8.InterfaceC1817a;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends u implements b8.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.c f10047a;

    public B(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        this.f10047a = fqName;
    }

    @Override // b8.InterfaceC1820d
    public InterfaceC1817a b(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return null;
    }

    @Override // b8.u
    public k8.c d() {
        return this.f10047a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && AbstractC2855l.b(d(), ((B) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return false;
    }

    @Override // b8.u
    public Collection n(Function1 nameFilter) {
        AbstractC2855l.g(nameFilter, "nameFilter");
        return AbstractC2800q.j();
    }

    public String toString() {
        return B.class.getName() + ": " + d();
    }

    @Override // b8.u
    public Collection w() {
        return AbstractC2800q.j();
    }

    @Override // b8.InterfaceC1820d
    public List getAnnotations() {
        return AbstractC2800q.j();
    }
}
