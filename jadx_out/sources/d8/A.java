package D8;

import C8.B0;
import C8.J0;
import C8.N0;
import C8.S;
import C8.v0;
import C8.w0;
import L7.InterfaceC1288m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import p8.AbstractC3090e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A {
    private static final S a(S s10) {
        return (S) I8.c.b(s10).d();
    }

    private static final String b(v0 v0Var) {
        StringBuilder sb = new StringBuilder();
        c("type: " + v0Var, sb);
        c("hashCode: " + v0Var.hashCode(), sb);
        c("javaClass: " + v0Var.getClass().getCanonicalName(), sb);
        for (InterfaceC1288m interfaceC1288mP = v0Var.p(); interfaceC1288mP != null; interfaceC1288mP = interfaceC1288mP.b()) {
            c("fqName: " + n8.n.f30122h.O(interfaceC1288mP), sb);
            c("javaClass: " + interfaceC1288mP.getClass().getCanonicalName(), sb);
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    private static final StringBuilder c(String str, StringBuilder sb) {
        AbstractC2855l.g(str, "<this>");
        sb.append(str);
        AbstractC2855l.f(sb, "append(...)");
        sb.append('\n');
        AbstractC2855l.f(sb, "append(...)");
        return sb;
    }

    public static final S d(S subtype, S supertype, x typeCheckingProcedureCallbacks) {
        AbstractC2855l.g(subtype, "subtype");
        AbstractC2855l.g(supertype, "supertype");
        AbstractC2855l.g(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new u(subtype, null));
        v0 v0VarK0 = supertype.K0();
        while (!arrayDeque.isEmpty()) {
            u uVar = (u) arrayDeque.poll();
            S sB = uVar.b();
            v0 v0VarK02 = sB.K0();
            if (typeCheckingProcedureCallbacks.a(v0VarK02, v0VarK0)) {
                boolean zL0 = sB.L0();
                for (u uVarA = uVar.a(); uVarA != null; uVarA = uVarA.a()) {
                    S sB2 = uVarA.b();
                    List listI0 = sB2.I0();
                    if (listI0 == null || !listI0.isEmpty()) {
                        Iterator it = listI0.iterator();
                        while (it.hasNext()) {
                            N0 n0A = ((B0) it.next()).a();
                            N0 n02 = N0.f592k;
                            if (n0A != n02) {
                                S sN = AbstractC3090e.h(w0.f710c.a(sB2), false, 1, null).c().n(sB, n02);
                                AbstractC2855l.f(sN, "safeSubstitute(...)");
                                sB = a(sN);
                                break;
                            }
                        }
                        sB = w0.f710c.a(sB2).c().n(sB, N0.f592k);
                        AbstractC2855l.d(sB);
                    } else {
                        sB = w0.f710c.a(sB2).c().n(sB, N0.f592k);
                        AbstractC2855l.d(sB);
                    }
                    zL0 = zL0 || sB2.L0();
                }
                v0 v0VarK03 = sB.K0();
                if (typeCheckingProcedureCallbacks.a(v0VarK03, v0VarK0)) {
                    return J0.p(sB, zL0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(v0VarK03) + ", \n\nsupertype: " + b(v0VarK0) + " \n" + typeCheckingProcedureCallbacks.a(v0VarK03, v0VarK0));
            }
            for (S s10 : v0VarK02.g()) {
                AbstractC2855l.d(s10);
                arrayDeque.add(new u(s10, uVar));
            }
        }
        return null;
    }
}
