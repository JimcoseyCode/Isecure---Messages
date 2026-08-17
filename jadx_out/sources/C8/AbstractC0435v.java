package C8;

import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;

/* JADX INFO: renamed from: C8.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0435v implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f709a;

    private final boolean b(InterfaceC1283h interfaceC1283h) {
        return (E8.l.m(interfaceC1283h) || AbstractC3027i.E(interfaceC1283h)) ? false : true;
    }

    protected final boolean a(InterfaceC1283h first, InterfaceC1283h second) {
        AbstractC2855l.g(first, "first");
        AbstractC2855l.g(second, "second");
        if (!AbstractC2855l.b(first.getName(), second.getName())) {
            return false;
        }
        InterfaceC1288m interfaceC1288mB = first.b();
        for (InterfaceC1288m interfaceC1288mB2 = second.b(); interfaceC1288mB != null && interfaceC1288mB2 != null; interfaceC1288mB2 = interfaceC1288mB2.b()) {
            if (interfaceC1288mB instanceof L7.H) {
                return interfaceC1288mB2 instanceof L7.H;
            }
            if (interfaceC1288mB2 instanceof L7.H) {
                return false;
            }
            if (interfaceC1288mB instanceof L7.N) {
                return (interfaceC1288mB2 instanceof L7.N) && AbstractC2855l.b(((L7.N) interfaceC1288mB).d(), ((L7.N) interfaceC1288mB2).d());
            }
            if ((interfaceC1288mB2 instanceof L7.N) || !AbstractC2855l.b(interfaceC1288mB.getName(), interfaceC1288mB2.getName())) {
                return false;
            }
            interfaceC1288mB = interfaceC1288mB.b();
        }
        return true;
    }

    protected abstract boolean c(InterfaceC1283h interfaceC1283h);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0) || obj.hashCode() != hashCode()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC1283h interfaceC1283hP = p();
        InterfaceC1283h interfaceC1283hP2 = v0Var.p();
        if (interfaceC1283hP2 != null && b(interfaceC1283hP) && b(interfaceC1283hP2)) {
            return c(interfaceC1283hP2);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f709a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC1283h interfaceC1283hP = p();
        int iHashCode = b(interfaceC1283hP) ? AbstractC3027i.m(interfaceC1283hP).hashCode() : System.identityHashCode(this);
        this.f709a = iHashCode;
        return iHashCode;
    }

    @Override // C8.v0
    public abstract InterfaceC1283h p();
}
