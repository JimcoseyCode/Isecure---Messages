package J8;

import C8.AbstractC0407d0;
import C8.S;
import J8.A;
import J8.k;
import J8.v;
import L7.AbstractC1293s;
import L7.AbstractC1299y;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.c0;
import L7.l0;
import L7.t0;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.AbstractC3029k;
import s8.AbstractC3340e;
import w8.C3499e;
import w8.InterfaceC3501g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f6878a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f6879b;

    static {
        k8.f fVar = t.f6926k;
        k.b bVar = k.b.f6867b;
        h hVar = new h(fVar, new f[]{bVar, new A.a(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar2 = new h(t.f6927l, new f[]{bVar, new A.a(2)}, p.f6875g);
        k8.f fVar2 = t.f6908b;
        m mVar = m.f6869a;
        A.a aVar = new A.a(2);
        j jVar = j.f6863a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar4 = new h(t.f6910c, new f[]{bVar, mVar, new A.a(3), jVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar5 = new h(t.f6912d, new f[]{bVar, mVar, new A.b(2), jVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        h hVar6 = new h(t.f6922i, new f[]{bVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        k8.f fVar3 = t.f6920h;
        A.d dVar = A.d.f6842b;
        v.a aVar2 = v.a.f6946d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (Function1) null, 4, (DefaultConstructorMarker) null);
        k8.f fVar4 = t.f6924j;
        A.c cVar = A.c.f6841b;
        f6879b = AbstractC2800q.m(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6928m, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6929n, new f[]{bVar, cVar, aVar2}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6888I, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6889J, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6914e, new f[]{k.a.f6866b}, q.f6876g), new h(t.f6918g, new f[]{bVar, v.b.f6947d, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6905Z, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6904Y, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(AbstractC2800q.m(t.f6939x, t.f6940y), new f[]{bVar}, r.f6877g), new h(t.f6915e0, new f[]{bVar, v.c.f6948d, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new h(t.f6931p, new f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null));
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(InterfaceC1300z Checks) {
        AbstractC2855l.g(Checks, "$this$Checks");
        List listI = Checks.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        t0 t0Var = (t0) AbstractC2800q.s0(listI);
        boolean z10 = false;
        if (t0Var != null && !AbstractC3340e.f(t0Var) && t0Var.f0() == null) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[EDGE_INSN: B:27:0x004b->B:17:0x004b BREAK  A[LOOP:0: B:8:0x0028->B:28:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String g(InterfaceC1300z Checks) {
        boolean z10;
        AbstractC2855l.g(Checks, "$this$Checks");
        InterfaceC1288m interfaceC1288mB = Checks.b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        if (!h(interfaceC1288mB)) {
            Collection collectionE = Checks.e();
            AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
            if (collectionE.isEmpty()) {
                z10 = !AbstractC1293s.c(Checks);
            } else {
                Iterator it = collectionE.iterator();
                while (it.hasNext()) {
                    InterfaceC1288m interfaceC1288mB2 = ((InterfaceC1300z) it.next()).b();
                    AbstractC2855l.f(interfaceC1288mB2, "getContainingDeclaration(...)");
                    if (h(interfaceC1288mB2)) {
                        break;
                    }
                }
                if (!AbstractC1293s.c(Checks)) {
                }
            }
        }
        if (z10) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("must override ''equals()'' in Any");
        InterfaceC1288m interfaceC1288mB3 = Checks.b();
        AbstractC2855l.f(interfaceC1288mB3, "getContainingDeclaration(...)");
        if (AbstractC3029k.g(interfaceC1288mB3)) {
            n8.n nVar = n8.n.f30124j;
            InterfaceC1288m interfaceC1288mB4 = Checks.b();
            AbstractC2855l.e(interfaceC1288mB4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            AbstractC0407d0 abstractC0407d0R = ((InterfaceC1280e) interfaceC1288mB4).r();
            AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
            sb.append(" or define ''equals(other: " + nVar.U(H8.d.D(abstractC0407d0R)) + "): Boolean''");
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    private static final boolean h(InterfaceC1288m interfaceC1288m) {
        return (interfaceC1288m instanceof InterfaceC1280e) && I7.i.a0((InterfaceC1280e) interfaceC1288m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(InterfaceC1300z Checks) {
        boolean zW;
        AbstractC2855l.g(Checks, "$this$Checks");
        c0 c0VarA0 = Checks.a0();
        if (c0VarA0 == null) {
            c0VarA0 = Checks.h0();
        }
        s sVar = f6878a;
        boolean z10 = false;
        if (c0VarA0 != null) {
            S returnType = Checks.getReturnType();
            if (returnType != null) {
                S type = c0VarA0.getType();
                AbstractC2855l.f(type, "getType(...)");
                zW = H8.d.w(returnType, type);
            } else {
                zW = false;
            }
            if (zW || sVar.j(Checks, c0VarA0)) {
                z10 = true;
            }
        }
        if (z10) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean j(InterfaceC1300z interfaceC1300z, c0 c0Var) {
        k8.b bVarN;
        S returnType;
        InterfaceC3501g value = c0Var.getValue();
        AbstractC2855l.f(value, "getValue(...)");
        if (!(value instanceof C3499e)) {
            return false;
        }
        InterfaceC1280e interfaceC1280eQ = ((C3499e) value).q();
        if (!interfaceC1280eQ.J() || (bVarN = AbstractC3340e.n(interfaceC1280eQ)) == null) {
            return false;
        }
        InterfaceC1283h interfaceC1283hC = AbstractC1299y.c(AbstractC3340e.s(interfaceC1280eQ), bVarN);
        l0 l0Var = interfaceC1283hC instanceof l0 ? (l0) interfaceC1283hC : null;
        if (l0Var == null || (returnType = interfaceC1300z.getReturnType()) == null) {
            return false;
        }
        return H8.d.w(returnType, l0Var.T());
    }

    @Override // J8.b
    public List b() {
        return f6879b;
    }
}
