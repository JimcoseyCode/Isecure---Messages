package C8;

import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static G0 b(List list, E0 e02, InterfaceC1288m interfaceC1288m, List list2) {
        if (list == null) {
            a(0);
        }
        if (e02 == null) {
            a(1);
        }
        if (interfaceC1288m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        G0 g0C = c(list, e02, interfaceC1288m, list2, null);
        if (g0C != null) {
            return g0C;
        }
        throw new AssertionError("Substitution failed");
    }

    public static G0 c(List list, E0 e02, InterfaceC1288m interfaceC1288m, List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (e02 == null) {
            a(6);
        }
        if (interfaceC1288m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            L7.m0 m0Var = (L7.m0) it.next();
            O7.U uM0 = O7.U.M0(interfaceC1288m, m0Var.getAnnotations(), m0Var.E(), m0Var.m(), m0Var.getName(), i10, L7.h0.f7335a, m0Var.c0());
            map.put(m0Var.j(), new D0(uM0.r()));
            map2.put(m0Var, uM0);
            list2.add(uM0);
            i10++;
        }
        w0 w0VarJ = w0.j(map);
        G0 g0H = G0.h(e02, w0VarJ);
        G0 g0H2 = G0.h(e02.h(), w0VarJ);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            L7.m0 m0Var2 = (L7.m0) it2.next();
            O7.U u10 = (O7.U) map2.get(m0Var2);
            for (S s10 : m0Var2.getUpperBounds()) {
                InterfaceC1283h interfaceC1283hP = s10.K0().p();
                S sP = (((interfaceC1283hP instanceof L7.m0) && H8.d.p((L7.m0) interfaceC1283hP)) ? g0H : g0H2).p(s10, N0.f594m);
                if (sP == null) {
                    return null;
                }
                if (sP != s10 && zArr != null) {
                    zArr[0] = true;
                }
                u10.J0(sP);
            }
            u10.S0();
        }
        return g0H;
    }
}
